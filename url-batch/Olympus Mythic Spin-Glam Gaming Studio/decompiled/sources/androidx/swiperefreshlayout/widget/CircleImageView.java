package androidx.swiperefreshlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;

/* loaded from: classes13.dex */
class CircleImageView extends ImageView {
    private Animation.AnimationListener mListener;
    int mShadowRadius;

    private boolean elevationSupported() {
        return true;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (elevationSupported()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.mShadowRadius * 2), getMeasuredHeight() + (this.mShadowRadius * 2));
    }

    public void setAnimationListener(Animation.AnimationListener animationListener) {
        this.mListener = animationListener;
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.mListener;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.mListener;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    private class OvalShadow extends OvalShape {
        private RadialGradient mRadialGradient;
        private Paint mShadowPaint;
        final /* synthetic */ CircleImageView this$0;

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f, float f2) {
            super.onResize(f, f2);
            updateRadialGradient((int) f);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = this.this$0.getWidth() / 2;
            float height = this.this$0.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.mShadowPaint);
            canvas.drawCircle(width, height, r0 - this.this$0.mShadowRadius, paint);
        }

        private void updateRadialGradient(int i) {
            float f = i / 2;
            RadialGradient radialGradient = new RadialGradient(f, f, this.this$0.mShadowRadius, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.mRadialGradient = radialGradient;
            this.mShadowPaint.setShader(radialGradient);
        }
    }
}
