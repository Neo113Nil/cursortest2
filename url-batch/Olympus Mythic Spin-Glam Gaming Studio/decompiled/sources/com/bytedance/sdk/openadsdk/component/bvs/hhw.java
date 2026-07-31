package com.bytedance.sdk.openadsdk.component.bvs;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.cyb;
import com.bytedance.sdk.openadsdk.core.widget.olo;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.rc;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes9.dex */
public class hhw extends zn {
    private final com.bytedance.sdk.openadsdk.core.hhw.btk mw;
    private final cyb rt;

    @Override // com.bytedance.sdk.openadsdk.component.bvs.zn, com.bytedance.sdk.openadsdk.core.hhw.nps, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.component.bvs.zn
    public com.bytedance.sdk.openadsdk.core.hhw.fb getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.bvs.zn
    public com.bytedance.sdk.openadsdk.core.hhw.zg getAdTitleTextView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.bvs.zn, com.bytedance.sdk.openadsdk.core.hhw.nps, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public hhw(Context context, nqi nqiVar) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#EDFCFF"), Color.parseColor("#FFF6FD")}));
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        this.mw = btkVar;
        btkVar.setId(520093758);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = jy.fs(context, 24.0f);
        layoutParams.topMargin = jy.fs(context, 56.0f);
        btkVar.setLayoutParams(layoutParams);
        btkVar.setClickable(false);
        btkVar.setGravity(16);
        btkVar.setOrientation(0);
        olo oloVar = new olo(context);
        this.hhw = oloVar;
        oloVar.setId(520093759);
        this.hhw.setLayoutParams(new LinearLayout.LayoutParams(jy.fs(context, 24.0f), jy.fs(context, 24.0f)));
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.nps = zgVar;
        zgVar.setId(520093761);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = jy.fs(context, 8.0f);
        this.nps.setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar2 = this.nps;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        zgVar2.setEllipsize(truncateAt);
        this.nps.setMaxLines(2);
        this.nps.setTextColor(Color.parseColor("#161823"));
        this.nps.setTextSize(12.0f);
        com.bytedance.sdk.openadsdk.core.hhw.nps npsVar = new com.bytedance.sdk.openadsdk.core.hhw.nps(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(jy.fs(context, 327.0f), -2);
        layoutParams3.addRule(13);
        layoutParams3.leftMargin = jy.fs(context, 24.0f);
        layoutParams3.rightMargin = jy.fs(context, 24.0f);
        npsVar.setLayoutParams(layoutParams3);
        olo oloVar2 = new olo(context);
        this.bvs = oloVar2;
        int i = com.bytedance.sdk.openadsdk.utils.olo.xn;
        oloVar2.setId(i);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(jy.fs(context, 80.0f), jy.fs(context, 80.0f));
        layoutParams4.addRule(14);
        this.bvs.setLayoutParams(layoutParams4);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar3 = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.iv = zgVar3;
        int i2 = com.bytedance.sdk.openadsdk.utils.olo.shl;
        zgVar3.setId(i2);
        this.iv.setTextSize(24.0f);
        this.iv.setTextColor(Color.parseColor("#161823"));
        this.iv.setGravity(17);
        this.iv.setMaxLines(1);
        this.iv.setEllipsize(truncateAt);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(3, i);
        layoutParams5.topMargin = jy.fs(context, 12.0f);
        layoutParams5.addRule(14);
        this.iv.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar4 = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.rc = zgVar4;
        int i3 = com.bytedance.sdk.openadsdk.utils.olo.ndq;
        zgVar4.setId(i3);
        this.rc.setTextSize(16.0f);
        this.rc.setTextColor(Color.parseColor("#80161823"));
        this.rc.setGravity(17);
        this.rc.setMaxLines(2);
        this.rc.setEllipsize(truncateAt);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams6.addRule(3, i2);
        layoutParams6.topMargin = jy.fs(context, 4.0f);
        layoutParams6.addRule(14);
        this.rc.setLayoutParams(layoutParams6);
        cyb cybVar = new cyb(context);
        this.rt = cybVar;
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(14);
        layoutParams7.topMargin = jy.fs(context, 12.0f);
        cybVar.setLayoutParams(layoutParams7);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar5 = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.btk = zgVar5;
        zgVar5.setId(520093717);
        this.btk.setBackground(rc.zmn(context, "tt_reward_full_video_backup_btn_bg"));
        this.btk.setEllipsize(truncateAt);
        this.btk.setLines(1);
        this.btk.setGravity(17);
        this.btk.setTextColor(-1);
        this.btk.setTextSize(16.0f);
        this.btk.setTag("open_ad_click_button_tag");
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, jy.fs(context, 44.0f));
        layoutParams8.addRule(3, i3);
        layoutParams8.topMargin = jy.fs(context, 54.0f);
        layoutParams8.addRule(14);
        this.btk.setLayoutParams(layoutParams8);
        PAGLogoView createPAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(context, nqiVar);
        this.fb = createPAGLogoViewByMaterial;
        createPAGLogoViewByMaterial.setId(520093757);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, jy.fs(context, 14.0f));
        layoutParams9.leftMargin = jy.fs(context, 16.0f);
        layoutParams9.bottomMargin = jy.fs(context, 24.0f);
        layoutParams9.addRule(12);
        this.fb.setLayoutParams(layoutParams9);
        addView(this.zg);
        btkVar.addView(this.hhw);
        btkVar.addView(this.nps);
        addView(btkVar);
        npsVar.addView(this.bvs);
        npsVar.addView(this.iv);
        npsVar.addView(this.rc);
        npsVar.addView(cybVar);
        npsVar.addView(this.btk);
        addView(npsVar);
        addView(this.fb);
    }

    @Override // com.bytedance.sdk.openadsdk.component.bvs.zn
    public View getUserInfo() {
        return this.mw;
    }

    @Override // com.bytedance.sdk.openadsdk.component.bvs.zn
    public cyb getScoreBar() {
        return this.rt;
    }
}
