package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;

/* loaded from: classes2.dex */
public class TTInteractionStyle002003HLayout extends TTInteractionStyleBaseFrameLayout {
    public TTInteractionStyle002003HLayout(Context context) {
        this(context, null);
    }

    public TTInteractionStyle002003HLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTInteractionStyle002003HLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    protected void pvs(Context context) {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        pAGLinearLayout.setOrientation(1);
        addView(pAGLinearLayout);
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 2.0f;
        pAGFrameLayout.setLayoutParams(layoutParams);
        pAGLinearLayout.addView(pAGFrameLayout);
        this.pvs = NB(context);
        this.pvs.setId(kj.Tdd);
        this.pvs.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        pAGFrameLayout.addView(this.pvs);
        this.icD = sUS(context);
        this.icD.setId(kj.Mnp);
        this.icD.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        pAGFrameLayout.addView(this.icD);
        PAGLogoView so = so(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 80;
        int icD = Pj.icD(context, 10.0f);
        layoutParams2.leftMargin = icD;
        layoutParams2.topMargin = icD;
        layoutParams2.bottomMargin = icD;
        so.setLayoutParams(layoutParams2);
        pAGFrameLayout.addView(so);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 1.0f;
        pAGLinearLayout2.setLayoutParams(layoutParams3);
        pAGLinearLayout2.setOrientation(1);
        pAGLinearLayout2.setGravity(81);
        int icD2 = Pj.icD(context, 16.0f);
        pAGLinearLayout2.setPadding(icD2, icD2, icD2, icD2);
        pAGLinearLayout.addView(pAGLinearLayout2);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setId(kj.FN);
        pAGRelativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, Pj.icD(context, 40.0f)));
        pAGRelativeLayout.setGravity(17);
        pAGLinearLayout2.addView(pAGRelativeLayout);
        this.vG = yiw(context);
        this.vG.setId(kj.EFw);
        int icD3 = Pj.icD(context, 35.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(icD3, icD3);
        layoutParams4.addRule(20);
        layoutParams4.addRule(9);
        layoutParams4.addRule(15);
        this.vG.setLayoutParams(layoutParams4);
        pAGRelativeLayout.addView(this.vG);
        this.Jd = icD(context);
        this.Jd.setId(kj.SJ);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, icD * 2);
        int icD4 = Pj.icD(context, 6.0f);
        layoutParams5.leftMargin = icD4;
        layoutParams5.setMarginStart(icD4);
        layoutParams5.addRule(1, this.vG.getId());
        layoutParams5.addRule(17, this.vG.getId());
        this.Jd.setLayoutParams(layoutParams5);
        pAGRelativeLayout.addView(this.Jd);
        this.NB = vG(context);
        this.NB.setId(kj.ig);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, Pj.icD(context, 20.0f));
        layoutParams6.addRule(3, this.Jd.getId());
        layoutParams6.addRule(8, this.vG.getId());
        layoutParams6.addRule(17, this.vG.getId());
        layoutParams6.addRule(1, this.vG.getId());
        layoutParams6.leftMargin = icD4;
        layoutParams6.setMarginStart(icD4);
        this.NB.setLayoutParams(layoutParams6);
        pAGRelativeLayout.addView(this.NB);
        this.sUS = Jd(context);
        this.sUS.setId(kj.sR);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, Pj.icD(context, 22.0f));
        layoutParams7.topMargin = icD2;
        this.sUS.setLayoutParams(layoutParams7);
        pAGLinearLayout2.addView(this.sUS);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    protected PAGTextView icD(Context context) {
        PAGTextView icD = super.icD(context);
        icD.setTextColor(-1);
        icD.setTextSize(2, 13.0f);
        icD.setText("Pangle");
        return icD;
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    protected PAGTextView vG(Context context) {
        PAGTextView vG = super.vG(context);
        vG.setTextColor(-1);
        return vG;
    }
}
