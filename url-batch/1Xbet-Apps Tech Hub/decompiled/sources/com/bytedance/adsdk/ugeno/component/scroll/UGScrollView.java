package com.bytedance.adsdk.ugeno.component.scroll;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ScrollView;
import com.bytedance.adsdk.ugeno.icD;

/* loaded from: classes.dex */
public class UGScrollView extends ScrollView {
    private icD pvs;

    public UGScrollView(Context context) {
        super(context);
    }

    public void pvs(icD icd) {
        this.pvs = icd;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        icD icd = this.pvs;
        if (icd != null) {
            int[] pvs = icd.pvs(i, i2);
            super.onMeasure(pvs[0], pvs[1]);
        } else {
            super.onMeasure(i, i2);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        icD icd = this.pvs;
        if (icd != null) {
            icd.pvs(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        icD icd = this.pvs;
        if (icd != null) {
            icd.sUS();
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        icD icd = this.pvs;
        if (icd != null) {
            icd.yiw();
        }
    }
}
