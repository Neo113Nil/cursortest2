package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* loaded from: classes11.dex */
public class bvs extends FrameLayout {
    private TextView btk;
    private String bvs;
    private cyb fb;
    private olo fs;
    private PAGLogoView hhw;
    private boolean iv;
    private com.bytedance.sdk.openadsdk.core.hhw.zg nps;
    private com.bytedance.sdk.openadsdk.core.zn.zmn rc;
    private nqi zg;
    private boolean zmn;
    private TextView zn;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public bvs(@NonNull Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.olo.tev);
    }

    public void zmn(nqi nqiVar, String str, com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar, boolean z) {
        this.zg = nqiVar;
        this.bvs = str;
        this.iv = z;
        this.rc = zmnVar;
    }

    public void setClickListener(com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar) {
        this.rc = zmnVar;
        TextView textView = this.btk;
        if (textView != null) {
            textView.setOnClickListener(zmnVar);
            this.btk.setOnTouchListener(this.rc);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            zmn();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void zmn() {
        if (this.zmn) {
            return;
        }
        this.zmn = true;
        fs();
        this.btk.setOnClickListener(this.rc);
        this.btk.setOnTouchListener(this.rc);
        String gt = this.zg.gt();
        if (!TextUtils.isEmpty(gt)) {
            this.btk.setText(gt);
        }
        if (this.fs != null && this.zg.uaq() != null && !TextUtils.isEmpty(this.zg.uaq().zmn())) {
            com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn(this.zg.uaq(), this.fs, this.zg);
        }
        cyb cybVar = this.fb;
        if (cybVar != null) {
            jy.zmn((TextView) null, cybVar, this.zg);
            if (this.zg.pw() != null) {
                this.fb.setVisibility(0);
            }
        }
        if (this.zn != null) {
            if (this.zg.pw() != null && !TextUtils.isEmpty(this.zg.pw().fs())) {
                this.zn.setText(this.zg.pw().fs());
            } else if (!TextUtils.isEmpty(this.zg.dey())) {
                this.zn.setText(this.zg.dey());
            } else {
                this.zn.setVisibility(8);
            }
        }
        if (this.nps != null) {
            String db = this.zg.db();
            if (!TextUtils.isEmpty(db)) {
                this.nps.setText(db);
            } else {
                this.nps.setVisibility(8);
            }
        }
        this.hhw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.bvs.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/bvs$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_bvs$1_onClick_25bd8f0d60cf1cc130eb2e4c5a9845fc(view);
            }

            public void safedk_bvs$1_onClick_25bd8f0d60cf1cc130eb2e4c5a9845fc(View p0) {
                try {
                    if (com.bytedance.sdk.openadsdk.utils.fs.btk() && com.bytedance.sdk.openadsdk.core.kgc.fb().am()) {
                        View p02 = bvs.this;
                        IABLandingPageActivity.zmn(p02.getContext(), bvs.this.zg, bvs.this.bvs);
                    } else {
                        View p03 = bvs.this;
                        TTWebsiteActivity.zmn(p03.getContext(), bvs.this.zg, bvs.this.bvs);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void fs() {
        FrameLayout.LayoutParams layoutParams;
        Context context = getContext();
        boolean z = this.zg.ol() == 1;
        setBackgroundColor(-16777216);
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar.setGravity(1);
        btkVar.setOrientation(1);
        if (z) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(jy.fs(context, 327.0f), -2);
        }
        layoutParams.gravity = 17;
        int fs = jy.fs(context, 24.0f);
        layoutParams.rightMargin = fs;
        layoutParams.leftMargin = fs;
        addView(btkVar, layoutParams);
        olo oloVar = new olo(context);
        this.fs = oloVar;
        oloVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(jy.fs(context, 80.0f), jy.fs(context, 80.0f));
        layoutParams2.bottomMargin = jy.fs(context, 12.0f);
        btkVar.addView(this.fs, layoutParams2);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.zn = zgVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        zgVar.setEllipsize(truncateAt);
        this.zn.setGravity(17);
        this.zn.setMaxLines(2);
        this.zn.setMaxWidth(jy.fs(context, 180.0f));
        this.zn.setTextColor(-1);
        this.zn.setTextSize(2, 24.0f);
        btkVar.addView(this.zn, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar2 = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.nps = zgVar2;
        zgVar2.setEllipsize(truncateAt);
        this.nps.setGravity(17);
        this.nps.setMaxLines(2);
        this.nps.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.nps.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = jy.fs(context, 8.0f);
        btkVar.addView(this.nps, layoutParams3);
        this.fb = new cyb(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, jy.fs(context, 16.0f));
        layoutParams4.topMargin = jy.fs(context, 12.0f);
        this.fb.setVisibility(8);
        btkVar.addView(this.fb, layoutParams4);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar3 = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.btk = zgVar3;
        zgVar3.setId(520093707);
        this.btk.setGravity(17);
        this.btk.setText(doe.zmn(context, "tt_video_download_apk"));
        this.btk.setTextColor(-1);
        this.btk.setTextSize(2, 16.0f);
        this.btk.setBackground(com.bytedance.sdk.openadsdk.utils.rc.zmn(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, jy.fs(context, 44.0f));
        layoutParams5.topMargin = jy.fs(context, 54.0f);
        btkVar.addView(this.btk, layoutParams5);
        if (!this.iv && this.zg.sv() && am.zn(this.zg)) {
            this.btk.setVisibility(8);
        }
        this.hhw = PAGLogoView.createPAGLogoViewByMaterial(context, this.zg);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, jy.fs(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.leftMargin = jy.fs(context, 18.0f);
        if (z) {
            layoutParams6.bottomMargin = jy.fs(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = jy.fs(context, 24.0f);
        }
        addView(this.hhw, layoutParams6);
    }
}
