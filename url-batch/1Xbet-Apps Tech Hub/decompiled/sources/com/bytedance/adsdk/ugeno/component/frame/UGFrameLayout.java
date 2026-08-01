package com.bytedance.adsdk.ugeno.component.frame;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.core.qh;
import com.bytedance.adsdk.ugeno.icD;
import java.util.Map;

/* loaded from: classes.dex */
public class UGFrameLayout extends FrameLayout {
    private Map<Integer, qh> icD;
    private icD pvs;

    public UGFrameLayout(Context context) {
        super(context);
    }

    public void setEventMap(Map<Integer, qh> map) {
        this.icD = map;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        icD icd = this.pvs;
        if (icd != null) {
            int[] pvs = icd.pvs(i, i2);
            super.onMeasure(pvs[0], pvs[1]);
        } else {
            super.onMeasure(i, i2);
        }
        icD icd2 = this.pvs;
        if (icd2 != null) {
            icd2.Jd();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        icD icd = this.pvs;
        if (icd != null) {
            icd.NB();
        }
        super.onLayout(z, i, i2, i3, i4);
        icD icd2 = this.pvs;
        if (icd2 != null) {
            icd2.pvs(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Map<Integer, qh> map = this.icD;
        if (map == null || !map.containsKey(4)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public void pvs(icD icd) {
        this.pvs = icd;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        icD icd = this.pvs;
        if (icd != null) {
            icd.sUS();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        icD icd = this.pvs;
        if (icd != null) {
            icd.yiw();
        }
    }
}
