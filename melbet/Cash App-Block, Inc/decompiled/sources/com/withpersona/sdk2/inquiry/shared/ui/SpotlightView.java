package com.withpersona.sdk2.inquiry.shared.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.camera.view.PreviewView$$ExternalSyntheticLambda0;
import androidx.camera.view.ScreenFlashView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.integrity.internal.ah;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.R$styleable;
import papa.Choreographers$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public final class SpotlightView extends View {
    public static final /* synthetic */ int $r8$clinit = 0;
    public int borderColor;
    public final Paint borderPaint;
    public Path clipPath;
    public ValueAnimator intensityAnimator;
    public float radius;
    public Rect rect;
    public final View.OnLayoutChangeListener targetLayoutChangeListener;
    public View targetView;
    public int targetViewId;

    public SpotlightView(Context context) {
        super(context);
        Paint paint = new Paint();
        paint.setStrokeWidth((float) ExtensionsKt.getDpToPx(7.0d));
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        this.borderPaint = paint;
        this.targetLayoutChangeListener = new PreviewView$$ExternalSyntheticLambda0(this, 6);
        init(context, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.getClass();
        Path path = this.clipPath;
        if (path == null) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        try {
            canvas.clipOutPath(path);
            super.draw(canvas);
            int i = this.borderColor;
            if (i != 0) {
                this.borderPaint.setColor(i);
                Rect rect = this.rect;
                if (rect != null) {
                    float f = rect.left;
                    float f2 = rect.top;
                    float f3 = rect.right;
                    float f4 = rect.bottom;
                    float f5 = this.radius;
                    canvas2 = canvas;
                    try {
                        canvas2.drawRoundRect(f, f2, f3, f4, f5, f5, this.borderPaint);
                        canvas2.restoreToCount(save);
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        canvas2.restoreToCount(save);
                        throw th2;
                    }
                }
            }
            canvas2 = canvas;
            canvas2.restoreToCount(save);
        } catch (Throwable th3) {
            th = th3;
            canvas2 = canvas;
        }
    }

    public final void init(Context context, AttributeSet attributeSet) {
        Resources.Theme theme;
        TypedArray obtainStyledAttributes;
        if (context == null || (theme = context.getTheme()) == null || (obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R$styleable.Pi2Spotlight, 0, 0)) == null) {
            return;
        }
        try {
            this.targetViewId = obtainStyledAttributes.getResourceId(1, 0);
            this.radius = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        ah.addOneShotPreDrawListenerAndDiscardFrame(this, new Choreographers$$ExternalSyntheticLambda1(this, 1));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View view = this.targetView;
        if (view != null) {
            onTargetViewLayoutChange(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final void onTargetViewLayoutChange(int i, int i2, int i3, int i4) {
        this.rect = new Rect(i, i2, i3, i4);
        Path path = new Path();
        float f = this.radius;
        path.addRoundRect(i, i2, i3, i4, f, f, Path.Direction.CW);
        this.clipPath = path;
        invalidate();
    }

    public final void setBorderColor(final int i) {
        final int i2 = this.borderColor;
        if (i2 == i) {
            return;
        }
        ValueAnimator valueAnimator = this.intensityAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setStartDelay(0L);
        ofFloat.setRepeatCount(0);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.withpersona.sdk2.inquiry.shared.ui.SpotlightView$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i3 = SpotlightView.$r8$clinit;
                valueAnimator2.getClass();
                int blendARGB = ColorUtils.blendARGB(valueAnimator2.getAnimatedFraction(), i2, i);
                SpotlightView spotlightView = SpotlightView.this;
                spotlightView.borderColor = blendARGB;
                spotlightView.invalidate();
            }
        });
        ofFloat.addListener(new ScreenFlashView.AnonymousClass2(this, 6));
        ofFloat.start();
        this.intensityAnimator = ofFloat;
    }

    public final void setRadius(float f) {
        this.radius = f;
    }

    public final void setTargetView(View view) {
        View view2 = this.targetView;
        View.OnLayoutChangeListener onLayoutChangeListener = this.targetLayoutChangeListener;
        if (view2 != null) {
            view2.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        this.targetView = view;
        if (view != null) {
            view.addOnLayoutChangeListener(onLayoutChangeListener);
            onTargetViewLayoutChange(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        requestLayout();
    }

    public SpotlightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        paint.setStrokeWidth((float) ExtensionsKt.getDpToPx(7.0d));
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        this.borderPaint = paint;
        this.targetLayoutChangeListener = new PreviewView$$ExternalSyntheticLambda0(this, 6);
        init(context, attributeSet);
    }

    public SpotlightView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        paint.setStrokeWidth((float) ExtensionsKt.getDpToPx(7.0d));
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        this.borderPaint = paint;
        this.targetLayoutChangeListener = new PreviewView$$ExternalSyntheticLambda0(this, 6);
        init(context, attributeSet);
    }
}
