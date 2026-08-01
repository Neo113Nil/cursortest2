package com.bytedance.sdk.openadsdk.component.view;

import android.content.Context;
import android.graphics.Color;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.Pj;

/* loaded from: classes2.dex */
public class PAGAppOpenTopBarView extends PAGRelativeLayout {
    private final PAGTextView icD;
    private final PAGTextView pvs;

    public PAGAppOpenTopBarView(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int icD = Pj.icD(context, 12.0f);
        int icD2 = Pj.icD(context, 16.0f);
        int icD3 = Pj.icD(context, 20.0f);
        int icD4 = Pj.icD(context, 24.0f);
        PAGTextView pAGTextView = new PAGTextView(context);
        this.pvs = pAGTextView;
        pAGTextView.setId(520093713);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, icD4);
        layoutParams.topMargin = icD3;
        layoutParams.leftMargin = icD2;
        layoutParams.setMarginStart(icD2);
        pAGTextView.setLayoutParams(layoutParams);
        pAGTextView.setBackground(uc.vG(context, "tt_app_open_top_bg"));
        pAGTextView.setGravity(17);
        pAGTextView.setPadding(icD, 0, icD, 0);
        pAGTextView.setText(uc.pvs(context, "tt_reward_feedback"));
        pAGTextView.setTextColor(Color.parseColor("#ffffff"));
        pAGTextView.setTextSize(1, 14.0f);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        this.icD = pAGTextView2;
        pAGTextView2.setId(520093714);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, icD4);
        layoutParams2.topMargin = icD3;
        layoutParams2.rightMargin = icD2;
        layoutParams2.setMarginEnd(icD2);
        layoutParams2.addRule(11);
        layoutParams2.addRule(21);
        pAGTextView2.setLayoutParams(layoutParams2);
        pAGTextView2.setBackground(uc.vG(context, "tt_app_open_top_bg"));
        pAGTextView2.setGravity(17);
        pAGTextView2.setPadding(icD, 0, icD, 0);
        pAGTextView2.setText(uc.icD(context, "tt_txt_skip"));
        pAGTextView2.setTextColor(Color.parseColor("#ffffff"));
        pAGTextView2.setTextSize(1, 14.0f);
        addView(pAGTextView);
        addView(pAGTextView2);
    }

    public PAGTextView getTopDislike() {
        return this.pvs;
    }

    public PAGTextView getTopSkip() {
        return this.icD;
    }
}
