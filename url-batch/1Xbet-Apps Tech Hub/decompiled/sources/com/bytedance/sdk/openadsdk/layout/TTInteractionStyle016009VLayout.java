package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;
import com.bytedance.sdk.openadsdk.utils.so;

/* loaded from: classes2.dex */
public class TTInteractionStyle016009VLayout extends TTInteractionStyleBaseFrameLayout {
    public TTInteractionStyle016009VLayout(Context context) {
        this(context, null);
    }

    public TTInteractionStyle016009VLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTInteractionStyle016009VLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    protected void pvs(Context context) {
        int icD = Pj.icD(context, 10.0f);
        int icD2 = Pj.icD(context, 6.0f);
        int icD3 = Pj.icD(context, 16.0f);
        int icD4 = Pj.icD(context, 15.0f);
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
        layoutParams2.addRule(12);
        pAGRelativeLayout2.setLayoutParams(layoutParams2);
        pAGRelativeLayout2.setBackgroundColor(Color.parseColor("#26000000"));
        pAGRelativeLayout2.setGravity(16);
        pAGRelativeLayout2.setPadding(icD4, 0, 0, 0);
        pAGRelativeLayout.addView(pAGRelativeLayout2);
        this.vG = yiw(context);
        this.vG.setId(kj.EFw);
        int icD5 = Pj.icD(context, 40.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(icD5, icD5);
        layoutParams3.addRule(20);
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        layoutParams3.leftMargin = icD;
        layoutParams3.setMarginStart(icD);
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
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(Pj.icD(context, 130.0f), Pj.icD(context, 20.0f));
        layoutParams5.leftMargin = icD2;
        layoutParams5.setMarginStart(icD2);
        this.Jd.setLayoutParams(layoutParams5);
        pAGLinearLayout.addView(this.Jd);
        this.NB = vG(context);
        this.NB.setId(kj.ig);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.leftMargin = icD2;
        layoutParams6.setMarginStart(icD2);
        this.NB.setLayoutParams(layoutParams6);
        pAGLinearLayout.addView(this.NB);
        this.sUS = Jd(context);
        this.sUS.setId(kj.sR);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(Pj.icD(context, 80.0f), Pj.icD(context, 30.0f));
        layoutParams7.addRule(21);
        layoutParams7.addRule(11);
        layoutParams7.addRule(15);
        layoutParams7.rightMargin = icD;
        layoutParams7.setMarginEnd(icD);
        this.sUS.setLayoutParams(layoutParams7);
        pAGRelativeLayout2.addView(this.sUS);
        View so = so(context);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(2, kj.pR);
        layoutParams8.leftMargin = icD3;
        layoutParams8.bottomMargin = icD;
        so.setLayoutParams(layoutParams8);
        pAGRelativeLayout.addView(so);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    protected PAGTextView Jd(Context context) {
        PAGTextView Jd = super.Jd(context);
        Jd.setBackground(so.pvs(context, "tt_download_corner_bg"));
        Jd.setTextSize(2, 14.0f);
        return Jd;
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    protected PAGTextView icD(Context context) {
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setGravity(16);
        pAGTextView.setMaxWidth(Pj.icD(context, 153.0f));
        pAGTextView.setSingleLine();
        pAGTextView.setText("Pangle");
        pAGTextView.setTextColor(-1);
        pAGTextView.setTextSize(2, 14.0f);
        return pAGTextView;
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    protected PAGTextView vG(Context context) {
        PAGTextView vG = super.vG(context);
        vG.setGravity(16);
        vG.setMaxWidth(Pj.icD(context, 153.0f));
        vG.setTextColor(-1);
        vG.setTextSize(2, 13.0f);
        return vG;
    }
}
