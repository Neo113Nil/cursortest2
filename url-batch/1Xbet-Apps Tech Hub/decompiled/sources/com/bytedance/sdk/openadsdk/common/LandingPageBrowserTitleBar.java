package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;

/* loaded from: classes2.dex */
public class LandingPageBrowserTitleBar extends RelativeLayout {
    public LandingPageBrowserTitleBar(Context context) {
        super(context);
        pvs();
    }

    private void pvs() {
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, Pj.icD(context, 44.0f)));
        setBackgroundColor(Color.parseColor("#e0e0e0"));
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setId(520093720);
        pAGImageView.setClickable(true);
        pAGImageView.setFocusable(true);
        pAGImageView.setImageDrawable(com.bytedance.sdk.openadsdk.utils.so.pvs(context, "tt_leftbackicon_selector"));
        pAGImageView.setPadding(Pj.icD(context, 12.0f), Pj.icD(context, 5.0f), Pj.icD(context, 10.0f), Pj.icD(context, 5.0f));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        addView(pAGImageView, layoutParams);
        PAGImageView pAGImageView2 = new PAGImageView(context);
        pAGImageView2.setId(520093716);
        pAGImageView2.setClickable(true);
        pAGImageView2.setFocusable(true);
        pAGImageView2.setPadding(Pj.icD(context, 12.0f), Pj.icD(context, 5.0f), Pj.icD(context, 10.0f), Pj.icD(context, 5.0f));
        pAGImageView2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.so.pvs(context, "tt_titlebar_close_seletor"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, 520093720);
        addView(pAGImageView2, layoutParams2);
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setId(kj.UYh);
        pAGTextView.setPadding(Pj.icD(context, 12.0f), Pj.icD(context, 5.0f), Pj.icD(context, 10.0f), Pj.icD(context, 5.0f));
        pAGTextView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        pAGTextView.setText(uc.icD(context, "tt_reward_feedback"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        addView(pAGTextView, layoutParams3);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        pAGTextView2.setId(kj.FFl);
        pAGTextView2.setSingleLine(true);
        pAGTextView2.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        pAGTextView2.setGravity(17);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(Pj.icD(context, 240.0f), -2);
        layoutParams4.addRule(15);
        layoutParams4.addRule(1, 520093716);
        layoutParams4.addRule(0, kj.UYh);
        int icD = Pj.icD(context, 25.0f);
        layoutParams4.rightMargin = icD;
        layoutParams4.leftMargin = icD;
        addView(pAGTextView2, layoutParams4);
    }
}
