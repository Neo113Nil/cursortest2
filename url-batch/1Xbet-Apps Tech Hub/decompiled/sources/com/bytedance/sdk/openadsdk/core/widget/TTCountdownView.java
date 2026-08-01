package com.bytedance.sdk.openadsdk.core.widget;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.utils.Pj;

/* loaded from: classes2.dex */
public class TTCountdownView extends View {
    public static final String pvs = uc.pvs(mnm.pvs(), "tt_count_down_view");
    private RectF IP;
    private int Jd;
    private float Ju;
    private Paint Mxy;
    private float NB;
    private Paint Wyp;
    private pvs bNS;
    private ValueAnimator cR;
    private float icD;
    private float kj;
    private AnimatorSet mnm;
    private Paint qh;
    private float sUS;
    private Paint so;
    private ValueAnimator vA;
    private float vG;
    private final String yiw;
    private ValueAnimator zM;

    public interface pvs {
    }

    public float pvs(float f, float f2) {
        return f * f2;
    }

    public float pvs(float f, int i) {
        return i * f;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            size = icD();
        }
        if (mode2 != 1073741824) {
            size2 = icD();
        }
        setMeasuredDimension(size, size2);
    }

    private int icD() {
        return (int) ((((this.icD / 2.0f) + this.vG) * 2.0f) + Pj.icD(getContext(), 4.0f));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        icD(canvas);
        pvs(canvas);
    }

    private void pvs(Canvas canvas) {
        canvas.save();
        Paint.FontMetrics fontMetrics = this.qh.getFontMetrics();
        String str = this.yiw;
        if (TextUtils.isEmpty(str)) {
            str = pvs;
        }
        canvas.drawText(str, 0.0f, 0.0f - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), this.qh);
        canvas.restore();
    }

    private void icD(Canvas canvas) {
        canvas.save();
        float pvs2 = pvs(this.kj, 360);
        float f = this.Jd;
        canvas.drawCircle(0.0f, 0.0f, this.vG, this.Mxy);
        canvas.drawCircle(0.0f, 0.0f, this.vG, this.Wyp);
        canvas.drawArc(this.IP, f, pvs2, false, this.so);
        canvas.restore();
    }

    private ValueAnimator getNumAnim() {
        ValueAnimator valueAnimator = this.vA;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.vA = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Ju, 0.0f);
        this.vA = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.vA.setDuration((long) (pvs(this.Ju, this.sUS) * 1000.0f));
        this.vA.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.TTCountdownView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                TTCountdownView.this.Ju = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                TTCountdownView.this.postInvalidate();
            }
        });
        return this.vA;
    }

    private ValueAnimator getArcAnim() {
        ValueAnimator valueAnimator = this.cR;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.cR = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.kj, 0.0f);
        this.cR = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.cR.setDuration((long) (pvs(this.kj, this.NB) * 1000.0f));
        this.cR.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.TTCountdownView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                TTCountdownView.this.kj = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                TTCountdownView.this.postInvalidate();
            }
        });
        return this.cR;
    }

    public void pvs() {
        AnimatorSet animatorSet = this.mnm;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.mnm = null;
        }
        ValueAnimator valueAnimator = this.zM;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.zM = null;
        }
        ValueAnimator valueAnimator2 = this.vA;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.vA = null;
        }
        ValueAnimator valueAnimator3 = this.cR;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            this.cR = null;
        }
        this.kj = 1.0f;
        this.Ju = 1.0f;
        invalidate();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        pvs();
        super.onDetachedFromWindow();
    }

    public void setCountDownTime(int i) {
        float f = i;
        this.sUS = f;
        this.NB = f;
        pvs();
    }

    public pvs getCountdownListener() {
        return this.bNS;
    }

    public void setCountdownListener(pvs pvsVar) {
        this.bNS = pvsVar;
    }
}
