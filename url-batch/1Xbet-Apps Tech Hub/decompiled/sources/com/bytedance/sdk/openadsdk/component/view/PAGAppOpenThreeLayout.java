package com.bytedance.sdk.openadsdk.component.view;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.utils.Pj;

/* loaded from: classes2.dex */
public class PAGAppOpenThreeLayout extends PAGAppOpenOneLayout {
    public PAGAppOpenThreeLayout(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.component.view.PAGAppOpenOneLayout
    public View pvs(Context context) {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, Pj.icD(context, 48.0f));
        layoutParams.addRule(12);
        layoutParams.bottomMargin = Pj.icD(context, 60.0f);
        pAGLinearLayout.setLayoutParams(layoutParams);
        pAGLinearLayout.setOrientation(0);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = Pj.icD(context, 53.0f);
        view.setLayoutParams(layoutParams2);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = Pj.icD(context, 47.0f);
        pAGLinearLayout2.setLayoutParams(layoutParams3);
        this.NB = new ButtonFlash(context);
        this.NB.setId(520093717);
        this.NB.setLayoutParams(new LinearLayout.LayoutParams(Pj.icD(context, 236.0f), Pj.icD(context, 48.0f)));
        this.NB.setBackground(uc.vG(context, "tt_button_back"));
        this.NB.setEllipsize(TextUtils.TruncateAt.END);
        this.NB.setGravity(17);
        this.NB.setLines(1);
        this.NB.setText(uc.icD(context, "tt_video_download_apk"));
        this.NB.setTextColor(Color.parseColor("#FFFFFF"));
        this.NB.setTextSize(1, 16.0f);
        this.NB.setTag("open_ad_click_button_tag");
        pAGLinearLayout2.addView(this.NB);
        pAGLinearLayout.addView(view);
        pAGLinearLayout.addView(pAGLinearLayout2);
        return pAGLinearLayout;
    }
}
