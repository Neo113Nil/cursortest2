package com.bytedance.sdk.openadsdk.cn;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.core.hhw.nps;
import com.bytedance.sdk.openadsdk.core.hhw.zg;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes9.dex */
public class btk extends nps {
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

    public btk(Context context) {
        this(context, null);
    }

    public btk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public btk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zmn(context);
    }

    private void zmn(Context context) {
        setId(olo.fu);
        setBackgroundColor(Color.parseColor("#00000000"));
        setGravity(16);
        setVisibility(8);
        zg zgVar = new zg(context);
        int i = olo.ir;
        zgVar.setId(i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        zgVar.setLayoutParams(layoutParams);
        zgVar.setIncludeFontPadding(false);
        zgVar.setText(doe.zmn(context, "tt_video_without_wifi_tips"));
        zgVar.setTextColor(Color.parseColor("#cacaca"));
        zgVar.setTextSize(2, 14.0f);
        addView(zgVar);
        nps npsVar = new nps(context);
        npsVar.setId(olo.bn);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, i);
        layoutParams2.addRule(13);
        npsVar.setLayoutParams(layoutParams2);
        addView(npsVar);
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        fbVar.setId(olo.bml);
        int fs = jy.fs(context, 44.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(fs, fs);
        layoutParams3.addRule(15);
        fbVar.setLayoutParams(layoutParams3);
        fbVar.setImageDrawable(doe.zn(context, "tt_new_play_video"));
        fbVar.setScaleType(ImageView.ScaleType.FIT_XY);
        npsVar.addView(fbVar);
    }
}
