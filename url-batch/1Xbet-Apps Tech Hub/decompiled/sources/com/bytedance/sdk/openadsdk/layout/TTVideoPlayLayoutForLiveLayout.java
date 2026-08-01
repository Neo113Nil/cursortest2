package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;
import com.bytedance.sdk.openadsdk.utils.so;

/* loaded from: classes2.dex */
public class TTVideoPlayLayoutForLiveLayout extends PAGRelativeLayout {
    public TTVideoPlayLayoutForLiveLayout(Context context) {
        this(context, null);
    }

    public TTVideoPlayLayoutForLiveLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTVideoPlayLayoutForLiveLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        pvs(context);
    }

    private void pvs(Context context) {
        setBackgroundColor(Color.parseColor("#000000"));
        setId(520093726);
        int icD = Pj.icD(context, 60.0f);
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        pAGFrameLayout.setId(kj.nS);
        pAGFrameLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        pAGFrameLayout.setBackgroundColor(0);
        addView(pAGFrameLayout);
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setId(kj.Lxj);
        pAGImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        pAGImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        pAGFrameLayout.addView(pAGImageView);
        PAGProgressBar pAGProgressBar = new PAGProgressBar(context);
        pAGProgressBar.setId(kj.VVr);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(icD, icD);
        layoutParams.gravity = 17;
        pAGProgressBar.setLayoutParams(layoutParams);
        pAGProgressBar.setIndeterminateDrawable(so.pvs(context, "tt_video_loading_progress_bar"));
        pAGFrameLayout.addView(pAGProgressBar);
        PAGImageView pAGImageView2 = new PAGImageView(context);
        pAGImageView2.setId(kj.BiC);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        pAGImageView2.setLayoutParams(layoutParams2);
        pAGImageView2.setScaleType(ImageView.ScaleType.CENTER);
        pAGImageView2.setImageDrawable(so.pvs(context, "tt_play_movebar_textpage"));
        pAGImageView2.setVisibility(8);
        addView(pAGImageView2);
        TTVideoAdCoverLayout tTVideoAdCoverLayout = new TTVideoAdCoverLayout(context);
        tTVideoAdCoverLayout.setId(kj.Oa);
        tTVideoAdCoverLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(tTVideoAdCoverLayout);
    }
}
