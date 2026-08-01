package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;

/* loaded from: classes2.dex */
public class LandingPageBrowserNewTitleBar extends RelativeLayout {
    public LandingPageBrowserNewTitleBar(Context context) {
        super(context);
        pvs();
    }

    private void pvs() {
        setId(kj.Ca);
        setBackgroundColor(-1);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, Pj.icD(context, 44.0f)));
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setId(kj.Zm);
        pAGImageView.setClickable(true);
        pAGImageView.setFocusable(true);
        pAGImageView.setPadding(Pj.icD(context, 12.0f), Pj.icD(context, 14.0f), Pj.icD(context, 12.0f), Pj.icD(context, 14.0f));
        pAGImageView.setImageResource(uc.Jd(context, "tt_ad_xmark"));
        addView(pAGImageView, new RelativeLayout.LayoutParams(Pj.icD(context, 40.0f), Pj.icD(context, 44.0f)));
        PAGImageView pAGImageView2 = new PAGImageView(context);
        pAGImageView2.setId(kj.Ye);
        pAGImageView2.setPadding(Pj.icD(context, 8.0f), Pj.icD(context, 10.0f), Pj.icD(context, 8.0f), Pj.icD(context, 10.0f));
        pAGImageView2.setImageResource(uc.Jd(context, "tt_ad_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Pj.icD(context, 40.0f), Pj.icD(context, 44.0f));
        layoutParams.addRule(11);
        addView(pAGImageView2, layoutParams);
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setId(kj.HWd);
        pAGTextView.setSingleLine(true);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setGravity(17);
        pAGTextView.setTextColor(Color.parseColor("#222222"));
        pAGTextView.setTextSize(2, 17.0f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(Pj.icD(context, 191.0f), Pj.icD(context, 24.0f));
        layoutParams2.addRule(15);
        layoutParams2.addRule(0, kj.Ye);
        layoutParams2.addRule(1, kj.Zm);
        int icD = Pj.icD(context, 10.0f);
        layoutParams2.leftMargin = icD;
        layoutParams2.rightMargin = icD;
        addView(pAGTextView, layoutParams2);
        PAGProgressBar pAGProgressBar = new PAGProgressBar(context, null, R.style.Widget.ProgressBar.Horizontal);
        pAGProgressBar.setId(kj.Ayu);
        pAGProgressBar.setProgress(1);
        pAGProgressBar.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.so.pvs(context, "tt_privacy_progress_style"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, Pj.icD(context, 2.0f));
        layoutParams3.addRule(12);
        addView(pAGProgressBar, layoutParams3);
        View view = new View(context);
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, Pj.icD(context, 0.5f));
        layoutParams4.addRule(12);
        addView(view, layoutParams4);
    }
}
