package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Jd.yiw;
import com.bytedance.sdk.component.adexpress.dynamic.vG.so;

/* loaded from: classes.dex */
public class DynamicVideoView extends DynamicBaseWidgetImp implements com.bytedance.sdk.component.adexpress.dynamic.NB {
    FrameLayout icD;
    TextView pvs;
    boolean uc;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public boolean NB() {
        return true;
    }

    public DynamicVideoView(Context context, DynamicRootView dynamicRootView, so soVar) {
        super(context, dynamicRootView, soVar);
        this.uc = false;
        this.bNS = new View(context);
        this.bNS.setTag(Integer.valueOf(getClickArea()));
        this.pvs = new TextView(context);
        this.icD = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) yiw.pvs(context, 40.0f), (int) yiw.pvs(context, 15.0f));
        layoutParams.gravity = 8388693;
        layoutParams.rightMargin = 20;
        layoutParams.bottomMargin = 20;
        this.pvs.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(25.0f);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.pvs.setBackground(gradientDrawable);
        this.pvs.setTextSize(10.0f);
        this.pvs.setGravity(17);
        this.pvs.setTextColor(-1);
        this.pvs.setVisibility(8);
        if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
            addView(this.icD, new FrameLayout.LayoutParams(-1, -1));
        }
        addView(this.pvs);
        addView(this.bNS, getWidgetLayoutParams());
        if (!com.bytedance.sdk.component.adexpress.Jd.icD()) {
            addView(this.icD, getWidgetLayoutParams());
        }
        dynamicRootView.vG = this.icD;
        dynamicRootView.setVideoListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Jd
    public boolean Mxy() {
        super.Mxy();
        double d = 0.0d;
        double d2 = 0.0d;
        for (so soVar = this.Ju; soVar != null; soVar = soVar.kj()) {
            d2 = (d2 + soVar.sUS()) - soVar.Jd();
            d = (d + soVar.yiw()) - soVar.NB();
        }
        try {
            float f = (float) d2;
            int pvs = (int) yiw.pvs(getContext(), f);
            int pvs2 = (int) yiw.pvs(getContext(), f + this.NB);
            if (com.bytedance.sdk.component.adexpress.Jd.icD.pvs(getContext())) {
                DynamicRoot dynamicRoot = (DynamicRoot) this.IP.getChildAt(0);
                DynamicRoot dynamicRoot2 = dynamicRoot;
                int dynamicWidth = dynamicRoot.getDynamicWidth();
                int i = dynamicWidth - pvs2;
                pvs2 = dynamicWidth - pvs;
                pvs = i;
            }
            if (!"open_ad".equals(this.IP.getRenderRequest().Jd())) {
                DynamicRoot dynamicRoot3 = (DynamicRoot) this.IP.getChildAt(0);
                DynamicRoot dynamicRoot4 = dynamicRoot3;
                float f2 = (float) d;
                dynamicRoot3.pvs.pvs(pvs, (int) yiw.pvs(getContext(), f2), pvs2, (int) yiw.pvs(getContext(), f2 + this.sUS));
            } else {
                this.IP.vG = this.icD;
            }
        } catch (Exception unused) {
        }
        this.IP.pvs(d2, d, this.NB, this.sUS, this.kj.bNS());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.NB
    public void setTimeUpdate(int i) {
        String str;
        if (this.Ju.Wyp().NB().VVr() && i > 0 && !this.uc) {
            String str2 = (i >= 60 ? "0" + (i / 60) : "00") + ":";
            int i2 = i % 60;
            if (i2 > 9) {
                str = str2 + i2;
            } else {
                str = str2 + "0" + i2;
            }
            this.pvs.setText(str);
            this.pvs.setVisibility(0);
            return;
        }
        this.uc = true;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            vG(getChildAt(i3));
        }
        this.pvs.setVisibility(8);
    }

    private void vG(View view) {
        if (view == this.pvs || view == this.zM) {
            return;
        }
        try {
            if (((Integer) view.getTag(com.bytedance.sdk.component.adexpress.dynamic.pvs.sUS)).intValue() == 1) {
                return;
            }
        } catch (Throwable unused) {
        }
        int i = 0;
        view.setVisibility(0);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return;
            }
            vG(viewGroup.getChildAt(i));
            i++;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.NB
    public void pvs() {
        this.pvs.setVisibility(8);
    }
}
