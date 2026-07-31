package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.RestrictTo;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes9.dex */
public class CircularProgressDrawable extends Drawable implements Animatable {
    private Animator mAnimator;
    boolean mFinishing;
    private Resources mResources;
    private final Ring mRing;
    private float mRotation;
    float mRotationCount;
    private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    private static final Interpolator MATERIAL_INTERPOLATOR = new FastOutSlowInInterpolator();
    private static final int[] COLORS = {-16777216};

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ProgressDrawableSize {
    }

    private int evaluateColorChange(float f, int i, int i2) {
        return ((((i >> 24) & 255) + ((int) ((((i2 >> 24) & 255) - r0) * f))) << 24) | ((((i >> 16) & 255) + ((int) ((((i2 >> 16) & 255) - r1) * f))) << 16) | ((((i >> 8) & 255) + ((int) ((((i2 >> 8) & 255) - r2) * f))) << 8) | ((i & 255) + ((int) (f * ((i2 & 255) - r8))));
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    private void setSizeParameters(float f, float f2, float f3, float f4) {
        Ring ring = this.mRing;
        float f5 = this.mResources.getDisplayMetrics().density;
        ring.setStrokeWidth(f2 * f5);
        ring.setCenterRadius(f * f5);
        ring.setColorIndex(0);
        ring.setArrowDimensions(f3 * f5, f4 * f5);
    }

    public void setStyle(int i) {
        if (i == 0) {
            setSizeParameters(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            setSizeParameters(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public void setArrowEnabled(boolean z) {
        this.mRing.setShowArrow(z);
        invalidateSelf();
    }

    public void setArrowScale(float f) {
        this.mRing.setArrowScale(f);
        invalidateSelf();
    }

    public void setStartEndTrim(float f, float f2) {
        this.mRing.setStartTrim(f);
        this.mRing.setEndTrim(f2);
        invalidateSelf();
    }

    public void setProgressRotation(float f) {
        this.mRing.setRotation(f);
        invalidateSelf();
    }

    public void setColorSchemeColors(int... iArr) {
        this.mRing.setColors(iArr);
        this.mRing.setColorIndex(0);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.mRotation, bounds.exactCenterX(), bounds.exactCenterY());
        this.mRing.draw(canvas, bounds);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.mRing.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mRing.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mRing.setColorFilter(colorFilter);
        invalidateSelf();
    }

    private void setRotation(float f) {
        this.mRotation = f;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.mAnimator.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.mAnimator.cancel();
        this.mRing.storeOriginals();
        if (this.mRing.getEndTrim() != this.mRing.getStartTrim()) {
            this.mFinishing = true;
            this.mAnimator.setDuration(666L);
            this.mAnimator.start();
        } else {
            this.mRing.setColorIndex(0);
            this.mRing.resetOriginals();
            this.mAnimator.setDuration(1332L);
            this.mAnimator.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.mAnimator.cancel();
        setRotation(0.0f);
        this.mRing.setShowArrow(false);
        this.mRing.setColorIndex(0);
        this.mRing.resetOriginals();
        invalidateSelf();
    }

    void updateRingColor(float f, Ring ring) {
        if (f > 0.75f) {
            ring.setColor(evaluateColorChange((f - 0.75f) / 0.25f, ring.getStartingColor(), ring.getNextColor()));
        } else {
            ring.setColor(ring.getStartingColor());
        }
    }

    private void applyFinishTranslation(float f, Ring ring) {
        updateRingColor(f, ring);
        float floor = (float) (Math.floor(ring.getStartingRotation() / 0.8f) + 1.0d);
        ring.setStartTrim(ring.getStartingStartTrim() + (((ring.getStartingEndTrim() - 0.01f) - ring.getStartingStartTrim()) * f));
        ring.setEndTrim(ring.getStartingEndTrim());
        ring.setRotation(ring.getStartingRotation() + ((floor - ring.getStartingRotation()) * f));
    }

    void applyTransformation(float f, Ring ring, boolean z) {
        float interpolation;
        float f2;
        if (this.mFinishing) {
            applyFinishTranslation(f, ring);
            return;
        }
        if (f != 1.0f || z) {
            float startingRotation = ring.getStartingRotation();
            if (f < 0.5f) {
                interpolation = ring.getStartingStartTrim();
                f2 = (MATERIAL_INTERPOLATOR.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float startingStartTrim = ring.getStartingStartTrim() + 0.79f;
                interpolation = startingStartTrim - (((1.0f - MATERIAL_INTERPOLATOR.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = startingStartTrim;
            }
            float f3 = startingRotation + (0.20999998f * f);
            float f4 = (f + this.mRotationCount) * 216.0f;
            ring.setStartTrim(interpolation);
            ring.setEndTrim(f2);
            ring.setRotation(f3);
            setRotation(f4);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.CircularProgressDrawable$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ CircularProgressDrawable this$0;
        final /* synthetic */ Ring val$ring;

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.this$0.updateRingColor(floatValue, this.val$ring);
            this.this$0.applyTransformation(floatValue, this.val$ring, false);
            this.this$0.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.CircularProgressDrawable$2, reason: invalid class name */
    /* loaded from: classes6.dex */
    class AnonymousClass2 implements Animator.AnimatorListener {
        final /* synthetic */ CircularProgressDrawable this$0;
        final /* synthetic */ Ring val$ring;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.this$0.mRotationCount = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            this.this$0.applyTransformation(1.0f, this.val$ring, true);
            this.val$ring.storeOriginals();
            this.val$ring.goToNextColor();
            CircularProgressDrawable circularProgressDrawable = this.this$0;
            if (circularProgressDrawable.mFinishing) {
                circularProgressDrawable.mFinishing = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                this.val$ring.setShowArrow(false);
                return;
            }
            circularProgressDrawable.mRotationCount += 1.0f;
        }
    }

    private static class Ring {
        int mAlpha;
        Path mArrow;
        int mArrowHeight;
        final Paint mArrowPaint;
        float mArrowScale;
        int mArrowWidth;
        final Paint mCirclePaint;
        int mColorIndex;
        int[] mColors;
        int mCurrentColor;
        float mEndTrim;
        final Paint mPaint;
        float mRingCenterRadius;
        float mRotation;
        boolean mShowArrow;
        float mStartTrim;
        float mStartingEndTrim;
        float mStartingRotation;
        float mStartingStartTrim;
        float mStrokeWidth;
        final RectF mTempBounds;

        void setArrowDimensions(float f, float f2) {
            this.mArrowWidth = (int) f;
            this.mArrowHeight = (int) f2;
        }

        void draw(Canvas canvas, Rect rect) {
            RectF rectF = this.mTempBounds;
            float f = this.mRingCenterRadius;
            float f2 = (this.mStrokeWidth / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.mArrowWidth * this.mArrowScale) / 2.0f, this.mStrokeWidth / 2.0f);
            }
            rectF.set(rect.centerX() - f2, rect.centerY() - f2, rect.centerX() + f2, rect.centerY() + f2);
            float f3 = this.mStartTrim;
            float f4 = this.mRotation;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.mEndTrim + f4) * 360.0f) - f5;
            this.mPaint.setColor(this.mCurrentColor);
            this.mPaint.setAlpha(this.mAlpha);
            float f7 = this.mStrokeWidth / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.mCirclePaint);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.mPaint);
            drawTriangle(canvas, f5, f6, rectF);
        }

        void drawTriangle(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.mShowArrow) {
                Path path = this.mArrow;
                if (path == null) {
                    Path path2 = new Path();
                    this.mArrow = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f3 = (this.mArrowWidth * this.mArrowScale) / 2.0f;
                this.mArrow.moveTo(0.0f, 0.0f);
                this.mArrow.lineTo(this.mArrowWidth * this.mArrowScale, 0.0f);
                Path path3 = this.mArrow;
                float f4 = this.mArrowWidth;
                float f5 = this.mArrowScale;
                path3.lineTo((f4 * f5) / 2.0f, this.mArrowHeight * f5);
                this.mArrow.offset((min + rectF.centerX()) - f3, rectF.centerY() + (this.mStrokeWidth / 2.0f));
                this.mArrow.close();
                this.mArrowPaint.setColor(this.mCurrentColor);
                this.mArrowPaint.setAlpha(this.mAlpha);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.mArrow, this.mArrowPaint);
                canvas.restore();
            }
        }

        void setColors(int[] iArr) {
            this.mColors = iArr;
            setColorIndex(0);
        }

        void setColor(int i) {
            this.mCurrentColor = i;
        }

        void setColorIndex(int i) {
            this.mColorIndex = i;
            this.mCurrentColor = this.mColors[i];
        }

        int getNextColor() {
            return this.mColors[getNextColorIndex()];
        }

        int getNextColorIndex() {
            return (this.mColorIndex + 1) % this.mColors.length;
        }

        void goToNextColor() {
            setColorIndex(getNextColorIndex());
        }

        void setColorFilter(ColorFilter colorFilter) {
            this.mPaint.setColorFilter(colorFilter);
        }

        void setAlpha(int i) {
            this.mAlpha = i;
        }

        int getAlpha() {
            return this.mAlpha;
        }

        void setStrokeWidth(float f) {
            this.mStrokeWidth = f;
            this.mPaint.setStrokeWidth(f);
        }

        void setStartTrim(float f) {
            this.mStartTrim = f;
        }

        float getStartTrim() {
            return this.mStartTrim;
        }

        float getStartingStartTrim() {
            return this.mStartingStartTrim;
        }

        float getStartingEndTrim() {
            return this.mStartingEndTrim;
        }

        int getStartingColor() {
            return this.mColors[this.mColorIndex];
        }

        void setEndTrim(float f) {
            this.mEndTrim = f;
        }

        float getEndTrim() {
            return this.mEndTrim;
        }

        void setRotation(float f) {
            this.mRotation = f;
        }

        void setCenterRadius(float f) {
            this.mRingCenterRadius = f;
        }

        void setShowArrow(boolean z) {
            if (this.mShowArrow != z) {
                this.mShowArrow = z;
            }
        }

        void setArrowScale(float f) {
            if (f != this.mArrowScale) {
                this.mArrowScale = f;
            }
        }

        float getStartingRotation() {
            return this.mStartingRotation;
        }

        void storeOriginals() {
            this.mStartingStartTrim = this.mStartTrim;
            this.mStartingEndTrim = this.mEndTrim;
            this.mStartingRotation = this.mRotation;
        }

        void resetOriginals() {
            this.mStartingStartTrim = 0.0f;
            this.mStartingEndTrim = 0.0f;
            this.mStartingRotation = 0.0f;
            setStartTrim(0.0f);
            setEndTrim(0.0f);
            setRotation(0.0f);
        }
    }
}
