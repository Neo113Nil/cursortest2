package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;
import com.bytedance.sdk.openadsdk.utils.so;

/* loaded from: classes2.dex */
public class TTInteractionStyle009016HLayout extends TTInteractionStyleBaseFrameLayout {
    public TTInteractionStyle009016HLayout(Context context) {
        this(context, null);
    }

    public TTInteractionStyle009016HLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTInteractionStyle009016HLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    protected void pvs(Context context) {
        int icD = Pj.icD(context, 10.0f);
        int icD2 = Pj.icD(context, 5.0f);
        int icD3 = Pj.icD(context, 6.0f);
        int icD4 = Pj.icD(context, 16.0f);
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
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, Pj.icD(context, 48.0f));
        layoutParams2.setMargins(icD2, icD2, icD2, icD2);
        layoutParams2.addRule(12);
        pAGRelativeLayout2.setBackgroundResource(uc.Jd(context, "center_vertical"));
        pAGRelativeLayout2.setGravity(16);
        pAGRelativeLayout2.setLayoutParams(layoutParams2);
        pAGRelativeLayout.addView(pAGRelativeLayout2);
        this.vG = yiw(context);
        this.vG.setId(kj.EFw);
        int icD5 = Pj.icD(context, 25.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(icD5, icD5);
        layoutParams3.addRule(20);
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        this.vG.setLayoutParams(layoutParams3);
        pAGRelativeLayout2.addView(this.vG);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams4.addRule(17, kj.EFw);
        layoutParams4.addRule(1, kj.EFw);
        pAGLinearLayout.setLayoutParams(layoutParams4);
        pAGLinearLayout.setGravity(16);
        pAGLinearLayout.setOrientation(1);
        pAGRelativeLayout2.addView(pAGLinearLayout);
        this.Jd = icD(context);
        this.Jd.setId(kj.SJ);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = icD3;
        layoutParams5.setMarginStart(icD3);
        this.Jd.setLayoutParams(layoutParams5);
        pAGLinearLayout.addView(this.Jd);
        this.NB = vG(context);
        this.NB.setId(kj.ig);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.leftMargin = icD3;
        layoutParams6.setMarginStart(icD3);
        this.NB.setLayoutParams(layoutParams6);
        pAGLinearLayout.addView(this.NB);
        this.sUS = Jd(context);
        this.sUS.setId(kj.sR);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(21);
        layoutParams7.addRule(11);
        layoutParams7.addRule(15);
        this.sUS.setLayoutParams(layoutParams7);
        int icD6 = Pj.icD(context, 4.0f);
        this.sUS.setPadding(icD6, icD6, icD6, icD6);
        pAGRelativeLayout2.addView(this.sUS);
        View so = so(context);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(2, kj.pR);
        layoutParams8.leftMargin = icD4;
        layoutParams8.bottomMargin = icD;
        so.setLayoutParams(layoutParams8);
        pAGRelativeLayout.addView(so);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    protected PAGTextView Jd(Context context) {
        PAGTextView Jd = super.Jd(context);
        Jd.setBackground(so.pvs(context, "tt_download_corner_bg"));
        Jd.setTextSize(2, 8.0f);
        return Jd;
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    protected PAGTextView icD(Context context) {
        PAGTextView icD = super.icD(context);
        icD.setGravity(16);
        icD.setMaxWidth(Pj.icD(context, 53.0f));
        icD.setTextColor(-1);
        icD.setTextSize(2, 10.0f);
        return icD;
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    protected PAGTextView vG(Context context) {
        PAGTextView vG = super.vG(context);
        vG.setGravity(16);
        vG.setMaxWidth(Pj.icD(context, 53.0f));
        vG.setTextColor(-1);
        vG.setTextSize(2, 8.0f);
        return vG;
    }
}
