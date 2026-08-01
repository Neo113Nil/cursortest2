package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;
import com.bytedance.sdk.openadsdk.utils.so;

/* loaded from: classes2.dex */
public class DefaultEndCardBackupLayout extends FrameLayout {
    private TTRatingBar2 Jd;
    private String Mxy;
    private TextView NB;
    private com.bytedance.sdk.openadsdk.core.icD.pvs Wyp;
    private TTRoundRectImageView icD;
    private boolean pvs;
    private TextView sUS;
    private cR so;
    private TextView vG;
    private PAGLogoView yiw;

    public DefaultEndCardBackupLayout(Context context) {
        super(context);
        setVisibility(8);
        setId(kj.yhq);
    }

    public void pvs(cR cRVar, String str, com.bytedance.sdk.openadsdk.core.icD.pvs pvsVar) {
        this.so = cRVar;
        this.Mxy = str;
        this.Wyp = pvsVar;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            pvs();
        }
    }

    private void pvs() {
        if (this.pvs) {
            return;
        }
        this.pvs = true;
        icD();
        Context context = getContext();
        this.sUS.setOnClickListener(this.Wyp);
        this.sUS.setOnTouchListener(this.Wyp);
        String Cwg = this.so.Cwg();
        if (!TextUtils.isEmpty(Cwg)) {
            this.sUS.setText(Cwg);
        }
        TTRoundRectImageView tTRoundRectImageView = this.icD;
        if (tTRoundRectImageView != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tTRoundRectImageView.getLayoutParams();
            layoutParams.setMargins(0, Pj.icD(context, 50.0f), 0, 0);
            this.icD.setLayoutParams(layoutParams);
        }
        if (this.icD != null && this.so.ea() != null && !TextUtils.isEmpty(this.so.ea().pvs())) {
            com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs(this.so.ea(), this.icD, this.so);
        }
        TTRatingBar2 tTRatingBar2 = this.Jd;
        if (tTRatingBar2 != null) {
            Pj.pvs((TextView) null, tTRatingBar2, this.so);
        }
        if (this.vG != null) {
            if (this.so.Ca() != null && !TextUtils.isEmpty(this.so.Ca().icD())) {
                this.vG.setText(this.so.Ca().icD());
            } else {
                this.vG.setText(this.so.qd());
            }
        }
        TextView textView = this.NB;
        if (textView != null) {
            Pj.pvs(textView, this.so, getContext(), "tt_comment_num_backup");
        }
        this.yiw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.DefaultEndCardBackupLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.pvs(DefaultEndCardBackupLayout.this.getContext(), DefaultEndCardBackupLayout.this.so, DefaultEndCardBackupLayout.this.Mxy);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void icD() {
        Context context = getContext();
        setBackgroundColor(-1);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setGravity(1);
        pAGLinearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        addView(pAGLinearLayout, layoutParams);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        this.icD = tTRoundRectImageView;
        tTRoundRectImageView.setBackgroundColor(0);
        pAGLinearLayout.addView(this.icD, new LinearLayout.LayoutParams(Pj.icD(context, 100.0f), Pj.icD(context, 100.0f)));
        PAGTextView pAGTextView = new PAGTextView(context);
        this.vG = pAGTextView;
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.vG.setSingleLine(true);
        this.vG.setMaxWidth(Pj.icD(context, 180.0f));
        this.vG.setTextColor(Color.parseColor("#ff333333"));
        this.vG.setTextSize(2, 20.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, Pj.icD(context, 28.0f));
        layoutParams2.topMargin = Pj.icD(context, 16.0f);
        pAGLinearLayout.addView(this.vG, layoutParams2);
        this.Jd = new TTRatingBar2(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, Pj.icD(context, 16.0f));
        layoutParams3.topMargin = Pj.icD(context, 12.0f);
        pAGLinearLayout.addView(this.Jd, layoutParams3);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        this.NB = pAGTextView2;
        pAGTextView2.setEllipsize(TextUtils.TruncateAt.END);
        this.NB.setSingleLine(true);
        this.NB.setTextColor(Color.parseColor("#ff93959a"));
        this.NB.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, Pj.icD(context, 20.0f));
        layoutParams4.topMargin = Pj.icD(context, 8.0f);
        pAGLinearLayout.addView(this.NB, layoutParams4);
        PAGTextView pAGTextView3 = new PAGTextView(context);
        this.sUS = pAGTextView3;
        pAGTextView3.setId(520093707);
        this.sUS.setGravity(17);
        this.sUS.setText(uc.icD(context, "tt_video_download_apk"));
        this.sUS.setTextColor(-1);
        this.sUS.setTextSize(2, 16.0f);
        this.sUS.setBackground(so.pvs(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, Pj.icD(context, 46.0f));
        int icD = Pj.icD(context, 20.0f);
        layoutParams5.bottomMargin = icD;
        layoutParams5.rightMargin = icD;
        layoutParams5.topMargin = icD;
        layoutParams5.leftMargin = icD;
        pAGLinearLayout.addView(this.sUS, layoutParams5);
        this.yiw = new PAGLogoView(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, Pj.icD(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.bottomMargin = Pj.icD(context, 16.0f);
        layoutParams6.leftMargin = Pj.icD(context, 20.0f);
        pAGLinearLayout.addView(this.yiw, layoutParams6);
    }
}
