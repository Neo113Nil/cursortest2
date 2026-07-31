package com.bytedance.sdk.openadsdk.cn;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.core.hhw.hhw;
import com.bytedance.sdk.openadsdk.core.hhw.nps;
import com.bytedance.sdk.openadsdk.core.hhw.zg;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.bytedance.sdk.openadsdk.utils.rc;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes6.dex */
public class zn extends nps {
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

    public zn(Context context) {
        this(context, null);
    }

    public zn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public zn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zmn(context);
    }

    private void zmn(Context context) {
        setId(520093726);
        setBackgroundColor(-1);
        nps npsVar = new nps(context);
        npsVar.setId(olo.sl);
        npsVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        npsVar.setBackgroundColor(0);
        npsVar.setGravity(17);
        addView(npsVar);
        View fbVar = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        fbVar.setId(olo.db);
        fbVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        npsVar.addView(fbVar);
        hhw hhwVar = new hhw(context);
        hhwVar.setId(olo.pf);
        int fs = jy.fs(context, 60.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(fs, fs);
        layoutParams.addRule(13);
        hhwVar.setLayoutParams(layoutParams);
        hhwVar.setIndeterminateDrawable(rc.zmn(context, "tt_video_loading_progress_bar"));
        npsVar.addView(hhwVar);
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar.setId(olo.wd);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        btkVar.setLayoutParams(layoutParams2);
        btkVar.setGravity(1);
        btkVar.setOrientation(1);
        btkVar.setVisibility(8);
        npsVar.addView(btkVar);
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar2 = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        fbVar2.setId(olo.ji);
        fbVar2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        fbVar2.setImageDrawable(rc.zmn(context, "tt_refreshing_video_textpage"));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        fbVar2.setScaleType(scaleType);
        btkVar.addView(fbVar2);
        zg zgVar = new zg(context);
        zgVar.setId(olo.kh);
        zgVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        zgVar.setText(doe.zmn(context, "tt_video_retry_des_txt"));
        zgVar.setTextColor(Color.parseColor("#999999"));
        btkVar.addView(zgVar);
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar3 = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        fbVar3.setId(olo.gt);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(13);
        fbVar3.setLayoutParams(layoutParams3);
        fbVar3.setScaleType(scaleType);
        fbVar3.setImageDrawable(rc.zmn(context, "tt_play_movebar_textpage"));
        fbVar3.setVisibility(8);
        addView(fbVar3);
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar4 = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        fbVar4.setId(olo.qr);
        int fs2 = jy.fs(context, 30.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(fs2, fs2);
        layoutParams4.addRule(21);
        layoutParams4.addRule(11);
        int fs3 = jy.fs(context, 7.0f);
        layoutParams4.setMarginEnd(fs3);
        layoutParams4.rightMargin = fs3;
        layoutParams4.topMargin = fs3;
        fbVar4.setLayoutParams(layoutParams4);
        fbVar4.setBackground(rc.zmn(context, "tt_detail_video_btn_bg"));
        fbVar4.setScaleType(scaleType);
        fbVar4.setImageDrawable(rc.zmn(context, "tt_close_move_detail"));
        addView(fbVar4);
        zg zgVar2 = new zg(context);
        zgVar2.setId(olo.pw);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(9);
        layoutParams5.addRule(20);
        layoutParams5.addRule(10);
        zgVar2.setLayoutParams(layoutParams5);
        zgVar2.setBackground(rc.zmn(context, "tt_video_black_desc_gradient"));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        zgVar2.setEllipsize(truncateAt);
        zgVar2.setMaxLines(2);
        int fs4 = jy.fs(context, 15.0f);
        zgVar2.setPadding(fs4, jy.fs(context, 14.0f), fs4, 0);
        zgVar2.setSingleLine(false);
        zgVar2.setTextColor(-1);
        zgVar2.setTextSize(2, 17.0f);
        zgVar2.setVisibility(8);
        addView(zgVar2);
        nps npsVar2 = new nps(context);
        npsVar2.setId(olo.my);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams6.addRule(10);
        npsVar2.setLayoutParams(layoutParams6);
        npsVar2.setBackground(rc.zmn(context, "tt_video_black_desc_gradient"));
        npsVar2.setGravity(16);
        npsVar2.setVisibility(8);
        addView(npsVar2);
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar5 = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        int i = olo.ze;
        fbVar5.setId(i);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams7.addRule(15);
        int fs5 = jy.fs(context, 12.0f);
        layoutParams7.leftMargin = fs5;
        layoutParams7.setMarginStart(fs5);
        fbVar5.setLayoutParams(layoutParams7);
        fbVar5.setScaleType(scaleType);
        fbVar5.setImageDrawable(rc.zmn(context, "tt_leftbackbutton_titlebar_photo_preview"));
        npsVar2.addView(fbVar5);
        zg zgVar3 = new zg(context);
        zgVar3.setId(olo.zq);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams8.addRule(15);
        int fs6 = jy.fs(context, 16.0f);
        layoutParams8.leftMargin = fs6;
        layoutParams8.rightMargin = fs;
        layoutParams8.setMarginStart(fs6);
        layoutParams8.setMarginEnd(fs);
        layoutParams8.addRule(17, i);
        int i2 = olo.pa;
        layoutParams8.addRule(0, i2);
        layoutParams8.addRule(1, i);
        layoutParams8.addRule(16, i2);
        zgVar3.setLayoutParams(layoutParams8);
        zgVar3.setEllipsize(truncateAt);
        zgVar3.setGravity(16);
        zgVar3.setMaxLines(1);
        zgVar3.setSingleLine(true);
        zgVar3.setTextColor(-1);
        zgVar3.setTextSize(2, 17.0f);
        npsVar2.addView(zgVar3);
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar2 = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar2.setId(i2);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams9.addRule(21);
        layoutParams9.addRule(11);
        int fs7 = jy.fs(context, 14.0f);
        layoutParams9.rightMargin = fs7;
        layoutParams9.setMarginEnd(fs7);
        btkVar2.setLayoutParams(layoutParams9);
        btkVar2.setGravity(16);
        btkVar2.setOrientation(1);
        npsVar2.addView(btkVar2);
        zg zgVar4 = new zg(context);
        zgVar4.setId(olo.ltf);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams10.gravity = 1;
        zgVar4.setLayoutParams(layoutParams10);
        zgVar4.setGravity(16);
        zgVar4.setMaxLines(1);
        zgVar4.setSingleLine(true);
        zgVar4.setTextColor(-1);
        zgVar4.setTextSize(2, 12.0f);
        btkVar2.addView(zgVar4);
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar3 = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar3.setId(olo.mf);
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-2, jy.fs(context, 40.0f));
        layoutParams11.addRule(12);
        layoutParams11.addRule(21);
        layoutParams11.addRule(11);
        btkVar3.setLayoutParams(layoutParams11);
        btkVar3.setGravity(16);
        btkVar3.setOrientation(0);
        btkVar3.setVisibility(8);
        addView(btkVar3);
        zg zgVar5 = new zg(context);
        zgVar5.setId(olo.fw);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams12.leftMargin = fs6;
        layoutParams12.rightMargin = fs5;
        layoutParams12.setMarginEnd(fs5);
        layoutParams12.setMarginStart(fs6);
        zgVar5.setLayoutParams(layoutParams12);
        zgVar5.setText(doe.zmn(context, "tt_00_00"));
        zgVar5.setTextColor(-1);
        zgVar5.setTextSize(2, 10.0f);
        btkVar3.addView(zgVar5);
        SeekBar seekBar = new SeekBar(context);
        seekBar.setId(olo.hr);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(0, jy.fs(context, 5.0f));
        layoutParams13.gravity = 16;
        seekBar.setLayoutParams(layoutParams13);
        seekBar.setMax(100);
        seekBar.setPadding(0, 0, 0, 0);
        seekBar.setProgressDrawable(rc.zmn(context, "tt_seek_progress"));
        seekBar.setThumb(rc.zmn(context, "tt_seek_thumb"));
        seekBar.setThumbOffset(0);
        btkVar3.addView(seekBar);
        zg zgVar6 = new zg(context);
        zgVar6.setId(olo.br);
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams14.leftMargin = fs5;
        layoutParams14.rightMargin = fs6;
        layoutParams14.setMarginEnd(fs6);
        layoutParams14.setMarginStart(fs5);
        zgVar6.setLayoutParams(layoutParams14);
        zgVar6.setText(doe.zmn(context, "tt_00_00"));
        zgVar6.setTextColor(-1);
        zgVar6.setTextSize(2, 10.0f);
        btkVar3.addView(zgVar6);
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar6 = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        fbVar6.setId(olo.ri);
        fbVar6.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        fbVar6.setPadding(fs6, 0, fs6, 0);
        fbVar6.setScaleType(scaleType);
        fbVar6.setVisibility(8);
        fbVar6.setImageDrawable(doe.zn(context, "tt_enlarge_video"));
        btkVar3.addView(fbVar6);
        View fsVar = new fs(context);
        fsVar.setId(olo.ao);
        fsVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(fsVar);
        zg zgVar7 = new zg(context);
        zgVar7.setId(olo.ol);
        RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams15.leftMargin = fs5;
        layoutParams15.addRule(9);
        layoutParams15.addRule(20);
        zgVar7.setLayoutParams(layoutParams15);
        zgVar7.setBackgroundColor(Color.parseColor("#00000000"));
        zgVar7.setText("close");
        zgVar7.setMinHeight(jy.fs(context, 44.0f));
        zgVar7.setCompoundDrawablesWithIntrinsicBounds(rc.zmn(context, "tt_shadow_btn_back"), (Drawable) null, (Drawable) null, (Drawable) null);
        addView(zgVar7);
    }
}
