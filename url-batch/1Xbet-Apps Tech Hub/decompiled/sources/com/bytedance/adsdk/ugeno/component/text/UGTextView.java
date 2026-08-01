package com.bytedance.adsdk.ugeno.component.text;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.IAnimation;

/* loaded from: classes.dex */
public class UGTextView extends TextView implements IAnimation {
    private float icD;
    private com.bytedance.adsdk.ugeno.icD pvs;

    public UGTextView(Context context) {
        super(context);
    }

    public void pvs(com.bytedance.adsdk.ugeno.icD icd) {
        this.pvs = icd;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        com.bytedance.adsdk.ugeno.icD icd = this.pvs;
        if (icd != null) {
            int[] pvs = icd.pvs(i, i2);
            super.onMeasure(pvs[0], pvs[1]);
        } else {
            super.onMeasure(i, i2);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.icD icd = this.pvs;
        if (icd != null) {
            icd.pvs(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public float getRipple() {
        return this.icD;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.icD = f;
        postInvalidate();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        com.bytedance.adsdk.ugeno.icD icd = this.pvs;
        if (icd != null) {
            icd.pvs(canvas, this);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.icD icd = this.pvs;
        if (icd != null) {
            icd.icD(i, i2, i3, i3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.icD icd = this.pvs;
        if (icd != null) {
            icd.sUS();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.icD icd = this.pvs;
        if (icd != null) {
            icd.yiw();
        }
    }
}
