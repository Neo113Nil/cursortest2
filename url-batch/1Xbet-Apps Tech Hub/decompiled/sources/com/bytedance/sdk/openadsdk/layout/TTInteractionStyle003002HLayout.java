package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;

/* loaded from: classes2.dex */
public class TTInteractionStyle003002HLayout extends TTInteractionStyleBaseFrameLayout {
    public TTInteractionStyle003002HLayout(Context context) {
        this(context, null);
    }

    public TTInteractionStyle003002HLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTInteractionStyle003002HLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    protected void pvs(Context context) {
        int icD = Pj.icD(context, 10.0f);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        pAGLinearLayout.setLayoutParams(layoutParams);
        layoutParams.gravity = 17;
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setPadding(icD, icD, icD, icD);
        addView(pAGLinearLayout);
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams2.weight = 3.0f;
        pAGFrameLayout.setLayoutParams(layoutParams2);
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
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 80;
        layoutParams3.leftMargin = icD;
        layoutParams3.topMargin = icD;
        layoutParams3.bottomMargin = icD;
        so.setLayoutParams(layoutParams3);
        pAGFrameLayout.addView(so);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams4.weight = 1.0f;
        pAGRelativeLayout.setLayoutParams(layoutParams4);
        pAGLinearLayout.addView(pAGRelativeLayout);
        this.vG = yiw(context);
        this.vG.setId(kj.EFw);
        int icD2 = Pj.icD(context, 40.0f);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(icD2, icD2);
        layoutParams5.addRule(15);
        this.vG.setLayoutParams(layoutParams5);
        pAGRelativeLayout.addView(this.vG);
        this.Jd = icD(context);
        this.Jd.setId(kj.SJ);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(15);
        layoutParams6.leftMargin = icD;
        layoutParams6.setMarginStart(icD);
        layoutParams6.addRule(1, kj.EFw);
        layoutParams6.addRule(17, kj.EFw);
        this.Jd.setLayoutParams(layoutParams6);
        pAGRelativeLayout.addView(this.Jd);
        this.sUS = Jd(context);
        this.sUS.setId(kj.sR);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(Pj.icD(context, 100.0f), Pj.icD(context, 32.0f));
        layoutParams7.addRule(11);
        layoutParams7.addRule(21);
        layoutParams7.addRule(15);
        this.sUS.setLayoutParams(layoutParams7);
        pAGRelativeLayout.addView(this.sUS);
    }
}
