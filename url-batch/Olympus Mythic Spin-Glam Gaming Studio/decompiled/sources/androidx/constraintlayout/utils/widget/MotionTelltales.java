package androidx.constraintlayout.utils.widget;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* loaded from: classes14.dex */
public class MotionTelltales extends MockView {
    Matrix mInvertMatrix;
    MotionLayout mMotionLayout;
    private Paint mPaintTelltales;
    float mTailScale;
    int mVelocityMode;
    float[] velocity;

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setText(CharSequence charSequence) {
        this.mText = charSequence.toString();
        requestLayout();
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.mInvertMatrix);
        if (this.mMotionLayout == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.mMotionLayout = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i = 0; i < 5; i++) {
            float f = fArr[i];
            for (int i2 = 0; i2 < 5; i2++) {
                float f2 = fArr[i2];
                this.mMotionLayout.getViewVelocity(this, f2, f, this.velocity, this.mVelocityMode);
                this.mInvertMatrix.mapVectors(this.velocity);
                float f3 = width * f2;
                float f4 = height * f;
                float[] fArr2 = this.velocity;
                float f5 = fArr2[0];
                float f6 = this.mTailScale;
                float f7 = f4 - (fArr2[1] * f6);
                this.mInvertMatrix.mapVectors(fArr2);
                canvas.drawLine(f3, f4, f3 - (f5 * f6), f7, this.mPaintTelltales);
            }
        }
    }
}
