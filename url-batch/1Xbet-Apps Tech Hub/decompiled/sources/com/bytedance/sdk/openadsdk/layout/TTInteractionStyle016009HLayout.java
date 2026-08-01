package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;
import com.bytedance.sdk.openadsdk.utils.so;

/* loaded from: classes2.dex */
public class TTInteractionStyle016009HLayout extends TTInteractionStyleBaseFrameLayout {
    public TTInteractionStyle016009HLayout(Context context) {
        this(context, null);
    }

    public TTInteractionStyle016009HLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTInteractionStyle016009HLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    protected void pvs(Context context) {
        int icD = Pj.icD(context, 10.0f);
        int icD2 = Pj.icD(context, 16.0f);
        int icD3 = Pj.icD(context, 15.0f);
        int icD4 = Pj.icD(context, 20.0f);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        pAGRelativeLayout.setLayoutParams(layoutParams);
        addView(pAGRelativeLayout);
        this.pvs = NB(context);
        this.pvs.setId(kj.Tdd);
        this.pvs.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        pAGRelativeLayout.addView(this.pvs);
        this.icD = sUS(context);
        this.icD.setId(kj.Mnp);
        this.icD.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        pAGRelativeLayout.addView(this.icD);
        PAGRelativeLayout pAGRelativeLayout2 = new PAGRelativeLayout(context);
        pAGRelativeLayout2.setId(kj.pR);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, Pj.icD(context, 60.0f));
        layoutParams2.addRule(12);
        layoutParams2.rightMargin = icD3;
        layoutParams2.leftMargin = icD3;
        layoutParams2.bottomMargin = icD3;
        layoutParams2.setMarginEnd(icD3);
        layoutParams2.setMarginStart(icD3);
        pAGRelativeLayout2.setBackgroundColor(Color.parseColor("#26000000"));
        pAGRelativeLayout2.setLayoutParams(layoutParams2);
        pAGRelativeLayout.addView(pAGRelativeLayout2);
        this.vG = yiw(context);
        this.vG.setId(kj.EFw);
        int icD5 = Pj.icD(context, 50.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(icD5, icD5);
        layoutParams3.addRule(20);
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        this.vG.setLayoutParams(layoutParams3);
        pAGRelativeLayout2.addView(this.vG);
        this.Jd = icD(context);
        this.Jd.setId(kj.SJ);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(15);
        layoutParams4.leftMargin = icD4;
        layoutParams4.setMarginStart(icD4);
        layoutParams4.addRule(1, kj.EFw);
        layoutParams4.addRule(17, kj.EFw);
        this.Jd.setLayoutParams(layoutParams4);
        pAGRelativeLayout2.addView(this.Jd);
        this.sUS = Jd(context);
        this.sUS.setId(kj.sR);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(Pj.icD(context, 100.0f), Pj.icD(context, 30.0f));
        layoutParams5.addRule(21);
        layoutParams5.addRule(11);
        layoutParams5.addRule(15);
        layoutParams5.rightMargin = icD;
        layoutParams5.setMarginEnd(icD);
        this.sUS.setLayoutParams(layoutParams5);
        pAGRelativeLayout2.addView(this.sUS);
        View so = so(context);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(2, kj.pR);
        layoutParams6.leftMargin = icD2;
        layoutParams6.bottomMargin = icD;
        so.setLayoutParams(layoutParams6);
        pAGRelativeLayout.addView(so);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    protected PAGTextView Jd(Context context) {
        PAGTextView Jd = super.Jd(context);
        Jd.setBackground(so.pvs(context, "tt_download_corner_bg"));
        Jd.setTextSize(2, 15.0f);
        return Jd;
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    protected PAGTextView icD(Context context) {
        PAGTextView icD = super.icD(context);
        icD.setGravity(16);
        icD.setMaxWidth(Pj.icD(context, 250.0f));
        icD.setTextColor(-1);
        icD.setTextSize(2, 17.0f);
        icD.setText("APP NAME");
        return icD;
    }
}
