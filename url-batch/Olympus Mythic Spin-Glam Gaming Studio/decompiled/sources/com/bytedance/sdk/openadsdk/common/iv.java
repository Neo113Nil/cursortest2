package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes6.dex */
public class iv extends RelativeLayout {
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public iv(Context context) {
        super(context);
        zmn();
    }

    private void zmn() {
        Context context = getContext();
        int fs = jy.fs(context, 12.0f);
        setLayoutParams(new ViewGroup.LayoutParams(-1, jy.fs(context, 44.0f)));
        setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        fbVar.setId(520093720);
        fbVar.setClickable(true);
        fbVar.setFocusable(true);
        fbVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.rc.zmn(context, "tt_leftbackicon_selector"));
        int fs2 = jy.fs(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(fs2, fs2);
        layoutParams.leftMargin = fs;
        layoutParams.addRule(15);
        addView(fbVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar2 = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        fbVar2.setId(520093716);
        fbVar2.setClickable(true);
        fbVar2.setFocusable(true);
        fbVar2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.rc.zmn(context, "tt_titlebar_close_seletor"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(fs2, fs2);
        layoutParams2.leftMargin = fs;
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, 520093720);
        addView(fbVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar3 = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        int i = com.bytedance.sdk.openadsdk.utils.olo.sxr;
        fbVar3.setId(i);
        fbVar3.setImageDrawable(com.bytedance.sdk.component.utils.doe.zn(context, "tt_ad_feedback_new"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(fs2, fs2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = fs;
        addView(fbVar3, layoutParams3);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        zgVar.setId(com.bytedance.sdk.openadsdk.utils.olo.ob);
        zgVar.setSingleLine(true);
        zgVar.setEllipsize(TextUtils.TruncateAt.END);
        zgVar.setGravity(17);
        zgVar.setTextColor(-16777216);
        zgVar.setTextSize(1, 16.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(jy.fs(context, 240.0f), -2);
        layoutParams4.addRule(15);
        layoutParams4.addRule(1, 520093716);
        layoutParams4.addRule(0, i);
        int fs3 = jy.fs(context, 25.0f);
        layoutParams4.rightMargin = fs3;
        layoutParams4.leftMargin = fs3;
        addView(zgVar, layoutParams4);
    }
}
