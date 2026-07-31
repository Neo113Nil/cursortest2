package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes6.dex */
public class bvs extends RelativeLayout {
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

    public bvs(Context context) {
        super(context);
        zmn();
    }

    private void zmn() {
        setId(com.bytedance.sdk.openadsdk.utils.olo.obg);
        setBackgroundColor(-1);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, jy.fs(context, 44.0f)));
        int fs = jy.fs(context, 10.0f);
        int fs2 = jy.fs(context, 24.0f);
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        int i = com.bytedance.sdk.openadsdk.utils.olo.nlz;
        fbVar.setId(i);
        fbVar.setClickable(true);
        fbVar.setFocusable(true);
        fbVar.setImageResource(com.bytedance.sdk.component.utils.doe.fb(context, "tt_titlebar_close_new"));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        fbVar.setScaleType(scaleType);
        fbVar.setAdjustViewBounds(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(fs2, fs2);
        layoutParams.addRule(9);
        layoutParams.addRule(15);
        layoutParams.setMargins(fs, fs, fs, fs);
        addView(fbVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar2 = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        int i2 = com.bytedance.sdk.openadsdk.utils.olo.wq;
        fbVar2.setId(i2);
        fbVar2.setClickable(true);
        fbVar2.setFocusable(true);
        fbVar2.setImageResource(com.bytedance.sdk.component.utils.doe.fb(context, "tt_titlebar_backward"));
        fbVar2.setScaleType(scaleType);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(fs2, fs2);
        layoutParams2.addRule(1, i);
        layoutParams2.addRule(15);
        int i3 = fs * 2;
        layoutParams2.setMargins(i3, fs, fs, fs);
        addView(fbVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar.setId(com.bytedance.sdk.openadsdk.utils.olo.es);
        btkVar.setOrientation(1);
        btkVar.setGravity(17);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        zgVar.setId(com.bytedance.sdk.openadsdk.utils.olo.zmn);
        zgVar.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        zgVar.setEllipsize(truncateAt);
        zgVar.setTextColor(Color.parseColor("#222222"));
        zgVar.setTextSize(2, 14.0f);
        zgVar.setGravity(17);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar2 = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        zgVar2.setId(com.bytedance.sdk.openadsdk.utils.olo.fs);
        zgVar2.setSingleLine(true);
        zgVar2.setEllipsize(truncateAt);
        zgVar2.setTextColor(Color.argb(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 0, 0, 0));
        zgVar2.setTextSize(2, 12.0f);
        zgVar2.setGravity(16);
        zgVar2.setPadding(0, 0, 0, 0);
        zgVar2.setIncludeFontPadding(false);
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar2 = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar2.setOrientation(0);
        btkVar2.setGravity(16);
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar3 = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        int fb = com.bytedance.sdk.component.utils.doe.fb(context, "tt_titlebar_lock");
        if (fb != 0) {
            fbVar3.setImageResource(fb);
            int fs3 = jy.fs(context, 12.0f);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(fs3, fs3);
            layoutParams3.rightMargin = jy.fs(context, 4.0f);
            fbVar3.setLayoutParams(layoutParams3);
            fbVar3.setColorFilter(Color.argb(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 0, 0, 0), PorterDuff.Mode.SRC_IN);
            btkVar2.addView(fbVar3);
        }
        btkVar.addView(zgVar, new LinearLayout.LayoutParams(-2, -2));
        ViewGroup.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        btkVar2.addView(zgVar2, layoutParams4);
        btkVar.addView(btkVar2, layoutParams4);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(1, i2);
        int i4 = com.bytedance.sdk.openadsdk.utils.olo.bmc;
        layoutParams5.addRule(0, i4);
        layoutParams5.addRule(15);
        layoutParams5.setMargins(fs, 0, fs, 0);
        addView(btkVar, layoutParams5);
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar4 = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        fbVar4.setId(i4);
        fbVar4.setClickable(true);
        fbVar4.setFocusable(true);
        fbVar4.setImageResource(com.bytedance.sdk.component.utils.doe.fb(context, "tt_titlebar_forward"));
        fbVar4.setScaleType(scaleType);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(fs2, fs2);
        layoutParams6.addRule(0, 520093740);
        layoutParams6.addRule(15);
        layoutParams6.setMargins(fs, fs, i3, fs);
        addView(fbVar4, layoutParams6);
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar5 = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        fbVar5.setId(520093740);
        fbVar5.setClickable(true);
        fbVar5.setFocusable(true);
        fbVar5.setImageResource(com.bytedance.sdk.component.utils.doe.fb(context, "tt_history_titlebar_delete"));
        fbVar5.setScaleType(scaleType);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(fs2, fs2);
        layoutParams7.addRule(11);
        layoutParams7.addRule(15);
        layoutParams7.setMargins(fs, fs, fs, fs);
        addView(fbVar5, layoutParams7);
        com.bytedance.sdk.openadsdk.core.hhw.hhw hhwVar = new com.bytedance.sdk.openadsdk.core.hhw.hhw(context, null, R.style.Widget.ProgressBar.Horizontal);
        hhwVar.setId(com.bytedance.sdk.openadsdk.utils.olo.utx);
        hhwVar.setProgress(1);
        hhwVar.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.rc.zmn(context, "tt_privacy_progress_style"));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, jy.fs(context, 2.0f));
        layoutParams8.addRule(12);
        addView(hhwVar, layoutParams8);
        View view = new View(context);
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, jy.fs(context, 0.5f));
        layoutParams9.addRule(12);
        addView(view, layoutParams9);
        fbVar2.setClickable(false);
        fbVar4.setClickable(false);
        int parseColor = Color.parseColor("#A8FFFFFF");
        PorterDuff.Mode mode = PorterDuff.Mode.ADD;
        fbVar2.setColorFilter(parseColor, mode);
        fbVar4.setColorFilter(Color.parseColor("#A8FFFFFF"), mode);
    }
}
