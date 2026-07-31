package com.bytedance.sdk.openadsdk.cn;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.hhw.hhw;
import com.bytedance.sdk.openadsdk.core.hhw.nps;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.bytedance.sdk.openadsdk.utils.rc;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes9.dex */
public class fb extends nps {
    @Override // com.bytedance.sdk.openadsdk.core.hhw.nps, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.nps, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public fb(Context context) {
        this(context, null);
    }

    public fb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public fb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zmn(context);
    }

    private void zmn(Context context) {
        setBackgroundColor(Color.parseColor(POBCTAOverlayData.DEFAULT_CTA_TEXT_COLOR));
        setId(520093726);
        int fs = jy.fs(context, 60.0f);
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar = new com.bytedance.sdk.openadsdk.core.hhw.zn(context);
        znVar.setId(olo.sl);
        znVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        znVar.setBackgroundColor(0);
        addView(znVar);
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        fbVar.setId(olo.db);
        fbVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        fbVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        znVar.addView(fbVar);
        hhw hhwVar = new hhw(context);
        hhwVar.setId(olo.pf);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(fs, fs);
        layoutParams.gravity = 17;
        hhwVar.setLayoutParams(layoutParams);
        hhwVar.setIndeterminateDrawable(rc.zmn(context, "tt_video_loading_progress_bar"));
        znVar.addView(hhwVar);
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar2 = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        fbVar2.setId(olo.gt);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        fbVar2.setLayoutParams(layoutParams2);
        fbVar2.setScaleType(ImageView.ScaleType.CENTER);
        fbVar2.setImageDrawable(rc.zmn(context, "tt_play_movebar_textpage"));
        fbVar2.setVisibility(8);
        addView(fbVar2);
        View fsVar = new fs(context);
        fsVar.setId(olo.ao);
        fsVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(fsVar);
    }
}
