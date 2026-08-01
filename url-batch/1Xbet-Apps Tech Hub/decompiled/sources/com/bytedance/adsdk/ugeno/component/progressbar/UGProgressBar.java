package com.bytedance.adsdk.ugeno.component.progressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.icD;

/* loaded from: classes.dex */
public class UGProgressBar extends FrameLayout {
    private TextView Jd;
    private int NB;
    private View icD;
    private icD pvs;
    private View vG;

    public UGProgressBar(Context context) {
        super(context);
        pvs(context);
    }

    private void pvs(Context context) {
        this.icD = new View(context);
        this.vG = new View(context);
        addView(this.icD);
        addView(this.vG);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.icD.getLayoutParams();
        layoutParams.width = 0;
        layoutParams.height = -1;
        layoutParams.gravity = 3;
        this.icD.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.vG.getLayoutParams();
        layoutParams2.width = this.NB;
        layoutParams2.gravity = 5;
        this.vG.setLayoutParams(layoutParams2);
        TextView textView = new TextView(context);
        this.Jd = textView;
        textView.setTextColor(-1);
        this.Jd.setTextSize(16.0f);
        this.Jd.setGravity(17);
        addView(this.Jd);
    }

    public void setProgress(float f) {
        int width = getWidth();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.icD.getLayoutParams();
        float f2 = width;
        float f3 = (f / 100.0f) * f2;
        layoutParams.width = (int) f3;
        this.icD.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.vG.getLayoutParams();
        layoutParams2.width = (int) (f2 - f3);
        this.vG.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.Jd.getLayoutParams();
        layoutParams3.width = width;
        layoutParams3.gravity = 17;
        requestLayout();
    }

    public void setText(String str) {
        this.Jd.setText(str);
    }

    public void setTextColor(int i) {
        this.Jd.setTextColor(i);
    }

    public void setProgressColor(int i) {
        this.icD.setBackgroundColor(i);
    }

    public void setProgressBgColor(int i) {
        this.vG.setBackgroundColor(i);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.NB = i;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        icD icd = this.pvs;
        if (icd != null) {
            icd.pvs(i, i2);
        }
        super.onMeasure(i, i2);
        this.NB = pvs(0, i);
    }

    private int pvs(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode == 1073741824 ? size : mode == Integer.MIN_VALUE ? Math.min(i, size) : i;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
