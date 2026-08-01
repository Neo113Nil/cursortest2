package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;

/* loaded from: classes2.dex */
public class LandingPageBrowserNewBottomBar extends LinearLayout {
    public LandingPageBrowserNewBottomBar(Context context) {
        super(context);
        pvs();
    }

    private static ImageView pvs(Context context, float f, float f2, float f3, float f4) {
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setClickable(true);
        pAGImageView.setFocusable(true);
        pAGImageView.setPadding(Pj.icD(context, f3), Pj.icD(context, f4), Pj.icD(context, f3), Pj.icD(context, f4));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Pj.icD(context, 40.0f), Pj.icD(context, 44.0f));
        if (f > 0.0f) {
            layoutParams.leftMargin = Pj.icD(context, f);
        }
        if (f2 > 0.0f) {
            layoutParams.rightMargin = Pj.icD(context, f2);
        }
        pAGImageView.setLayoutParams(layoutParams);
        return pAGImageView;
    }

    private void pvs() {
        Context context = getContext();
        setId(kj.tQ);
        setLayoutParams(new ViewGroup.LayoutParams(-1, Pj.icD(context, 44.5f)));
        setBackgroundColor(-1);
        setClickable(true);
        setFocusable(true);
        setOrientation(1);
        View view = new View(context);
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        addView(view, new LinearLayout.LayoutParams(-1, Pj.icD(context, 0.5f)));
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setOrientation(0);
        addView(pAGLinearLayout, new LinearLayout.LayoutParams(-1, Pj.icD(context, 44.0f)));
        ImageView pvs = pvs(context, 16.0f, 0.0f, 14.75f, 12.5f);
        pvs.setId(kj.elv);
        pvs.setImageResource(uc.Jd(context, "tt_ad_arrow_backward_wrapper"));
        pAGLinearLayout.addView(pvs);
        View view2 = new View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        pAGLinearLayout.addView(view2, layoutParams);
        ImageView pvs2 = pvs(context, 8.0f, 0.0f, 14.75f, 12.5f);
        pvs2.setId(kj.tCd);
        pvs2.setImageResource(uc.Jd(context, "tt_ad_arrow_forward_wrapper"));
        pAGLinearLayout.addView(pvs2);
        View view3 = new View(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, 0);
        layoutParams2.weight = 1.0f;
        pAGLinearLayout.addView(view3, layoutParams2);
        ImageView pvs3 = pvs(context, 8.0f, 0.0f, 10.0f, 12.0f);
        pvs3.setId(kj.Wby);
        pvs3.setImageResource(uc.Jd(context, "tt_ad_refresh"));
        pAGLinearLayout.addView(pvs3);
        View view4 = new View(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        pAGLinearLayout.addView(view4, layoutParams3);
        ImageView pvs4 = pvs(context, 0.0f, 16.0f, 9.0f, 11.0f);
        pvs4.setId(kj.MY);
        pvs4.setImageResource(uc.Jd(context, "tt_ad_link"));
        pAGLinearLayout.addView(pvs4);
    }
}
