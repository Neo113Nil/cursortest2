package com.bytedance.sdk.openadsdk.cn;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.hhw.nps;
import com.bytedance.sdk.openadsdk.core.hhw.zg;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.bytedance.sdk.openadsdk.utils.rc;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes9.dex */
public class fs extends nps {
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

    public fs(Context context) {
        this(context, null);
    }

    public fs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public fs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zmn(context);
    }

    private void zmn(Context context) {
        setId(olo.ao);
        setVisibility(8);
        setBackgroundColor(Color.parseColor("#7f000000"));
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar = new com.bytedance.sdk.openadsdk.core.hhw.fb(getContext());
        fbVar.setId(olo.hz);
        fbVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        fbVar.setImageTintMode(PorterDuff.Mode.SRC_OVER);
        fbVar.setImageTintList(ColorStateList.valueOf(Color.parseColor("#7f000000")));
        fbVar.setBackgroundColor(Color.parseColor("#7f000000"));
        fbVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(fbVar);
        nps npsVar = new nps(context);
        npsVar.setId(olo.vgx);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        npsVar.setLayoutParams(layoutParams);
        addView(npsVar);
        int fs = jy.fs(context, 20.0f);
        zg zgVar = new zg(context);
        zgVar.setId(olo.cud);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(14);
        layoutParams2.setMargins(fs, 0, fs, 0);
        zgVar.setLayoutParams(layoutParams2);
        zgVar.setMaxLines(2);
        zgVar.setMinHeight(jy.fs(context, 40.0f));
        zgVar.setEllipsize(TextUtils.TruncateAt.END);
        zgVar.setTextColor(-1);
        zgVar.setTextSize(2, 14.0f);
        zgVar.setBackground(rc.zmn(context, "tt_ad_cover_btn_begin_bg"));
        zgVar.setGravity(17);
        int fs2 = jy.fs(context, 10.0f);
        int fs3 = jy.fs(context, 2.0f);
        zgVar.setPadding(fs2, fs3, fs2, fs3);
        zgVar.setVisibility(8);
        npsVar.addView(zgVar);
    }
}
