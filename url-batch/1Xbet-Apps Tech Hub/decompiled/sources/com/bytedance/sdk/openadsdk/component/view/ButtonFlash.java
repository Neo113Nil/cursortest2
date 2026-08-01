package com.bytedance.sdk.openadsdk.component.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.TextView;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
public class ButtonFlash extends TextView {
    private LinearGradient Jd;
    private RectF NB;
    private int icD;
    private int pvs;
    private Matrix sUS;
    private boolean so;
    private Paint vG;
    private ValueAnimator yiw;

    public ButtonFlash(Context context) {
        super(context);
        this.so = true;
        icD();
    }

    private void icD() {
        this.NB = new RectF();
        this.vG = new Paint();
        vG();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.pvs = i;
        this.icD = i2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.pvs / 2.0f, this.icD, new int[]{ViewCompat.MEASURED_SIZE_MASK, 1358954495, ViewCompat.MEASURED_SIZE_MASK}, new float[]{0.1f, 0.3f, 0.5f}, Shader.TileMode.CLAMP);
        this.Jd = linearGradient;
        this.vG.setShader(linearGradient);
        this.vG.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        Matrix matrix = new Matrix();
        this.sUS = matrix;
        matrix.setTranslate(-this.pvs, this.icD);
        this.Jd.setLocalMatrix(this.sUS);
        this.NB.set(0.0f, 0.0f, this.pvs, this.icD);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.sUS != null) {
            canvas.drawRoundRect(this.NB, 100.0f, 100.0f, this.vG);
        }
    }

    private void vG() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.yiw = ofFloat;
        ofFloat.setDuration(3000L);
        this.yiw.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.view.ButtonFlash.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((ButtonFlash.this.pvs * 2) * ((Float) valueAnimator.getAnimatedValue()).floatValue()) - ButtonFlash.this.pvs;
                if (ButtonFlash.this.sUS != null) {
                    ButtonFlash.this.sUS.setTranslate(floatValue, ButtonFlash.this.icD);
                }
                if (ButtonFlash.this.Jd != null) {
                    ButtonFlash.this.Jd.setLocalMatrix(ButtonFlash.this.sUS);
                }
                ButtonFlash.this.invalidate();
            }
        });
        if (this.so) {
            this.yiw.setRepeatCount(-1);
            ValueAnimator valueAnimator = this.yiw;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
    }

    public void setAutoRun(boolean z) {
        this.so = z;
    }

    public void pvs() {
        ValueAnimator valueAnimator = this.yiw;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.yiw.cancel();
            invalidate();
        }
    }
}
