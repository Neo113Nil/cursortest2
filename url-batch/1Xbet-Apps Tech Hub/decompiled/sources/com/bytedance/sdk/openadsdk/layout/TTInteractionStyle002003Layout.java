package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;

/* loaded from: classes2.dex */
public class TTInteractionStyle002003Layout extends TTInteractionStyleBaseFrameLayout {
    public TTInteractionStyle002003Layout(Context context) {
        this(context, null);
    }

    public TTInteractionStyle002003Layout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTInteractionStyle002003Layout(Context context, AttributeSet attributeSet, int i) {
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
        layoutParams.weight = 337.0f;
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
        layoutParams3.weight = 263.0f;
        pAGLinearLayout2.setLayoutParams(layoutParams3);
        pAGLinearLayout2.setOrientation(1);
        pAGLinearLayout2.setGravity(81);
        int icD2 = Pj.icD(context, 16.0f);
        pAGLinearLayout2.setPadding(icD2, icD2, icD2, icD2);
        pAGLinearLayout.addView(pAGLinearLayout2);
        this.vG = yiw(context);
        this.vG.setId(kj.EFw);
        int icD3 = Pj.icD(context, 45.0f);
        this.vG.setLayoutParams(new LinearLayout.LayoutParams(icD3, icD3));
        pAGLinearLayout2.addView(this.vG);
        this.Jd = icD(context);
        this.Jd.setId(kj.SJ);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = Pj.icD(context, 4.0f);
        this.Jd.setLayoutParams(layoutParams4);
        pAGLinearLayout2.addView(this.Jd);
        this.NB = vG(context);
        this.NB.setId(kj.ig);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.topMargin = icD;
        layoutParams5.bottomMargin = Pj.icD(context, 25.0f);
        this.NB.setLayoutParams(layoutParams5);
        pAGLinearLayout2.addView(this.NB);
        this.sUS = Jd(context);
        this.sUS.setId(kj.sR);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, Pj.icD(context, 32.0f));
        layoutParams6.topMargin = icD2;
        this.sUS.setLayoutParams(layoutParams6);
        pAGLinearLayout2.addView(this.sUS);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    protected PAGTextView icD(Context context) {
        PAGTextView icD = super.icD(context);
        icD.setTextColor(-1);
        return icD;
    }
}
