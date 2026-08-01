package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.zM;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;
import com.bytedance.sdk.openadsdk.utils.so;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class RFEndCardBackUpLayout extends PAGFrameLayout {
    private TextView Jd;
    private int Mxy;
    private TTRatingBar2 NB;
    private com.bytedance.sdk.openadsdk.component.reward.pvs.pvs icD;
    private boolean pvs;
    private TextView sUS;
    private PAGLogoView so;
    private TTRoundRectImageView vG;
    private PAGTextView yiw;

    public RFEndCardBackUpLayout(Context context) {
        super(context);
        setVisibility(8);
        setId(kj.yhq);
    }

    public void pvs(com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar) {
        this.icD = pvsVar;
        if (pvsVar.icD.SJ()) {
            pvs();
        }
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
        if (this.icD.icD.EAq() && this.Mxy > 1) {
            icD();
            return;
        }
        cR cRVar = this.icD.icD;
        if (cRVar.SJ()) {
            vG();
        } else {
            Jd();
            pvs(cRVar, this.yiw);
        }
    }

    private void pvs(cR cRVar, PAGTextView pAGTextView) {
        Context context = getContext();
        pvs(pAGTextView, cRVar, -1);
        TTRoundRectImageView tTRoundRectImageView = this.vG;
        if (tTRoundRectImageView != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tTRoundRectImageView.getLayoutParams();
            layoutParams.setMargins(0, Pj.icD(context, 50.0f), 0, 0);
            this.vG.setLayoutParams(layoutParams);
        }
        pvs(this.vG, cRVar);
        TTRatingBar2 tTRatingBar2 = this.NB;
        if (tTRatingBar2 != null) {
            Pj.pvs((TextView) null, tTRatingBar2, cRVar);
        }
        pvs(this.Jd, cRVar, cRVar.qd());
        TextView textView = this.sUS;
        if (textView != null) {
            Pj.pvs(textView, cRVar, getContext(), "tt_comment_num_backup");
        }
        this.so.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.pvs(RFEndCardBackUpLayout.this.icD.od, RFEndCardBackUpLayout.this.icD.icD, RFEndCardBackUpLayout.this.icD.NB);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void pvs(PAGImageView pAGImageView, cR cRVar) {
        if (pAGImageView == null || cRVar.ea() == null || TextUtils.isEmpty(cRVar.ea().pvs())) {
            return;
        }
        com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs(cRVar.ea(), pAGImageView, cRVar);
    }

    private void pvs(TextView textView, cR cRVar, String str) {
        if (textView != null) {
            if (cRVar.Ca() != null && !TextUtils.isEmpty(cRVar.Ca().icD())) {
                textView.setText(cRVar.Ca().icD());
            } else {
                textView.setText(str);
            }
        }
    }

    private void icD() {
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#C2FFFFFF"));
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(Pj.icD(context, 16.0f), 0, Pj.icD(context, 16.0f), 0);
        layoutParams.gravity = 17;
        addView(pAGLinearLayout, layoutParams);
        if (this.icD.cnN == 2) {
            PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
            pAGLinearLayout2.setOrientation(0);
            pAGLinearLayout.addView(pAGLinearLayout2, new FrameLayout.LayoutParams(-1, -2));
            pvs(pAGLinearLayout2, this.Mxy);
        } else if (this.Mxy == 2) {
            icD(pAGLinearLayout);
        } else {
            pvs(pAGLinearLayout);
        }
        PAGLogoView pAGLogoView = new PAGLogoView(this.icD.od);
        pAGLogoView.setId(520093757);
        pAGLinearLayout.addView(pAGLogoView);
        pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.pvs(RFEndCardBackUpLayout.this.icD.od, RFEndCardBackUpLayout.this.icD.icD, RFEndCardBackUpLayout.this.icD.NB);
            }
        });
    }

    private void pvs(PAGLinearLayout pAGLinearLayout, int i) {
        if (this.icD.icD instanceof zM) {
            List<cR> vG = ((zM) this.icD.icD).wgm().vG();
            for (int i2 = 0; i2 < vG.size() && i2 < i && i2 < 3; i2++) {
                pvs(pAGLinearLayout, vG.get(i2), i2, i);
            }
        }
    }

    private void pvs(PAGLinearLayout pAGLinearLayout, cR cRVar, int i, int i2) {
        Context context = getContext();
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        pAGLinearLayout2.setOrientation(1);
        pAGLinearLayout2.setGravity(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        if (i > 0) {
            layoutParams.setMargins(Pj.icD(context, 12.0f), 0, 0, 0);
        }
        pAGLinearLayout2.setBackground(new pvs(context));
        pAGLinearLayout.addView(pAGLinearLayout2, layoutParams);
        PAGLinearLayout pAGLinearLayout3 = new PAGLinearLayout(context);
        pAGLinearLayout3.setOrientation(0);
        pAGLinearLayout3.setGravity(48);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = Pj.icD(context, 20.0f);
        layoutParams2.leftMargin = Pj.icD(context, 17.0f);
        layoutParams2.rightMargin = Pj.icD(context, 30.0f);
        pAGLinearLayout2.addView(pAGLinearLayout3, layoutParams2);
        PAGImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        pAGLinearLayout3.addView(tTRoundRectImageView, new FrameLayout.LayoutParams(Pj.icD(context, 44.0f), Pj.icD(context, 44.0f)));
        pvs(tTRoundRectImageView, cRVar);
        PAGLinearLayout pAGLinearLayout4 = new PAGLinearLayout(context);
        pAGLinearLayout4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = Pj.icD(context, 7.0f);
        pAGLinearLayout3.addView(pAGLinearLayout4, layoutParams3);
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setSingleLine(true);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setTextSize(18.0f);
        pAGTextView.setTextColor(Color.parseColor("#161823"));
        pAGTextView.setGravity(GravityCompat.START);
        pAGTextView.setTypeface(null, 1);
        pAGLinearLayout4.addView(pAGTextView, new FrameLayout.LayoutParams(-1, -2));
        pvs(pAGTextView, cRVar, cRVar.OhP());
        PAGLinearLayout pAGLinearLayout5 = new PAGLinearLayout(context);
        pAGLinearLayout5.setOrientation(0);
        pAGLinearLayout5.setGravity(16);
        pAGLinearLayout4.addView(pAGLinearLayout5, new FrameLayout.LayoutParams(-2, -2));
        PAGTextView pAGTextView2 = new PAGTextView(context);
        pAGTextView2.setTextSize(16.0f);
        pAGTextView2.setTextColor(Color.parseColor("#80161823"));
        pAGLinearLayout5.addView(pAGTextView2, new ViewGroup.LayoutParams(-2, -2));
        TTRatingBar2 tTRatingBar2 = new TTRatingBar2(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = Pj.icD(context, 8.0f);
        pAGLinearLayout5.addView(tTRatingBar2, layoutParams4);
        Pj.pvs(pAGTextView2, tTRatingBar2, cRVar, 18);
        PAGTextView pAGTextView3 = new PAGTextView(context);
        if (i2 == 2) {
            pAGTextView3.setSingleLine(true);
        } else {
            pAGTextView3.setLines(2);
        }
        pAGTextView3.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView3.setTextSize(16.0f);
        pAGTextView3.setTextColor(Color.parseColor("#80161823"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        int i3 = layoutParams2.leftMargin;
        layoutParams5.rightMargin = i3;
        layoutParams5.leftMargin = i3;
        layoutParams5.topMargin = Pj.icD(context, 12.0f);
        pAGLinearLayout2.addView(pAGTextView3, layoutParams5);
        pvs(pAGTextView3, cRVar);
        PAGTextView pAGTextView4 = new PAGTextView(context);
        pAGTextView4.setGravity(17);
        pAGTextView4.setId(520093707);
        pAGTextView4.setText(uc.icD(context, "tt_video_download_apk"));
        pAGTextView4.setTextColor(-1);
        pAGTextView4.setTextSize(2, 16.0f);
        pAGTextView4.setBackground(so.pvs(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, Pj.icD(context, 36.0f));
        layoutParams6.setMargins(Pj.icD(context, 20.0f), Pj.icD(context, 22.0f), Pj.icD(context, 20.0f), Pj.icD(context, 20.0f));
        pAGLinearLayout2.addView(pAGTextView4, layoutParams6);
        pvs(pAGTextView4, cRVar, i);
    }

    private void pvs(PAGLinearLayout pAGLinearLayout) {
        if (this.icD.icD instanceof zM) {
            List<cR> vG = ((zM) this.icD.icD).wgm().vG();
            for (int i = 0; i < vG.size() && i < 3; i++) {
                pvs(pAGLinearLayout, vG.get(i), i);
            }
        }
    }

    private void pvs(PAGLinearLayout pAGLinearLayout, cR cRVar, int i) {
        Context context = getContext();
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        pAGLinearLayout2.setOrientation(1);
        pAGLinearLayout2.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i > 0 ? Pj.icD(context, 12.0f) : 0, 0, 0);
        pAGLinearLayout2.setBackground(new pvs(context));
        pAGLinearLayout.addView(pAGLinearLayout2, layoutParams);
        PAGLinearLayout pAGLinearLayout3 = new PAGLinearLayout(context);
        pAGLinearLayout3.setOrientation(0);
        pAGLinearLayout3.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = Pj.icD(context, 20.0f);
        layoutParams2.leftMargin = Pj.icD(context, 17.0f);
        layoutParams2.rightMargin = Pj.icD(context, 30.0f);
        pAGLinearLayout2.addView(pAGLinearLayout3, layoutParams2);
        PAGImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        pAGLinearLayout3.addView(tTRoundRectImageView, new FrameLayout.LayoutParams(Pj.icD(context, 70.0f), Pj.icD(context, 63.0f)));
        pvs(tTRoundRectImageView, cRVar);
        PAGLinearLayout pAGLinearLayout4 = new PAGLinearLayout(context);
        pAGLinearLayout4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = Pj.icD(context, 7.0f);
        pAGLinearLayout3.addView(pAGLinearLayout4, layoutParams3);
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setSingleLine(true);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setTextSize(18.0f);
        pAGTextView.setTextColor(Color.parseColor("#161823"));
        pAGTextView.setGravity(GravityCompat.START);
        pAGTextView.setTypeface(null, 1);
        pAGLinearLayout4.addView(pAGTextView, new FrameLayout.LayoutParams(-1, -2));
        pvs(pAGTextView, cRVar, cRVar.OhP());
        PAGTextView pAGTextView2 = new PAGTextView(context);
        pAGTextView2.setSingleLine(true);
        pAGTextView2.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView2.setTextSize(16.0f);
        pAGTextView2.setTextColor(Color.parseColor("#80161823"));
        pAGLinearLayout4.addView(pAGTextView2, new FrameLayout.LayoutParams(-1, -2));
        pvs(pAGTextView2, cRVar);
        PAGLinearLayout pAGLinearLayout5 = new PAGLinearLayout(context);
        pAGLinearLayout5.setOrientation(0);
        pAGLinearLayout5.setGravity(16);
        pAGLinearLayout4.addView(pAGLinearLayout5, new FrameLayout.LayoutParams(-2, -2));
        PAGTextView pAGTextView3 = new PAGTextView(context);
        pAGTextView3.setTextSize(16.0f);
        pAGTextView3.setTextColor(Color.parseColor("#80161823"));
        pAGLinearLayout5.addView(pAGTextView3, new ViewGroup.LayoutParams(-2, -2));
        TTRatingBar2 tTRatingBar2 = new TTRatingBar2(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = Pj.icD(context, 8.0f);
        pAGLinearLayout5.addView(tTRatingBar2, layoutParams4);
        Pj.pvs(pAGTextView3, tTRatingBar2, cRVar, 18);
        PAGTextView pAGTextView4 = new PAGTextView(context);
        pAGTextView4.setGravity(17);
        pAGTextView4.setId(520093707);
        pAGTextView4.setText(uc.icD(context, "tt_video_download_apk"));
        pAGTextView4.setTextColor(-1);
        pAGTextView4.setTextSize(2, 16.0f);
        pAGTextView4.setBackground(so.pvs(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, Pj.icD(context, 36.0f));
        layoutParams5.setMargins(Pj.icD(context, 20.0f), Pj.icD(context, 22.0f), Pj.icD(context, 20.0f), Pj.icD(context, 20.0f));
        pAGLinearLayout2.addView(pAGTextView4, layoutParams5);
        pvs(pAGTextView4, cRVar, i);
    }

    private void icD(PAGLinearLayout pAGLinearLayout) {
        if (this.icD.icD instanceof zM) {
            List<cR> vG = ((zM) this.icD.icD).wgm().vG();
            for (int i = 0; i < vG.size() && i < 2; i++) {
                icD(pAGLinearLayout, vG.get(i), i);
            }
        }
    }

    private void icD(PAGLinearLayout pAGLinearLayout, cR cRVar, int i) {
        Context context = getContext();
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        pAGLinearLayout2.setOrientation(1);
        pAGLinearLayout2.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i > 0 ? Pj.icD(context, 12.0f) : 0, 0, 0);
        pAGLinearLayout2.setBackground(new pvs(context));
        pAGLinearLayout.addView(pAGLinearLayout2, layoutParams);
        PAGImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(Pj.icD(context, 70.0f), Pj.icD(context, 63.0f));
        layoutParams2.setMargins(0, Pj.icD(context, 24.0f), 0, Pj.icD(context, 12.0f));
        pAGLinearLayout2.addView(tTRoundRectImageView, layoutParams2);
        pvs(tTRoundRectImageView, cRVar);
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setSingleLine(true);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setTextSize(18.0f);
        pAGTextView.setTextColor(Color.parseColor("#161823"));
        pAGTextView.setGravity(17);
        pAGTextView.setTypeface(null, 1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(Pj.icD(context, 56.0f), 0, Pj.icD(context, 56.0f), 0);
        pAGLinearLayout2.addView(pAGTextView, layoutParams3);
        pvs(pAGTextView, cRVar, cRVar.OhP());
        PAGTextView pAGTextView2 = new PAGTextView(context);
        pAGTextView2.setSingleLine(true);
        pAGTextView2.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView2.setTextSize(16.0f);
        pAGTextView2.setTextColor(Color.parseColor("#80161823"));
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(Pj.icD(context, 56.0f), Pj.icD(context, 4.0f), Pj.icD(context, 56.0f), 0);
        pAGLinearLayout2.addView(pAGTextView2, layoutParams4);
        pvs(pAGTextView2, cRVar);
        PAGLinearLayout pAGLinearLayout3 = new PAGLinearLayout(context);
        pAGLinearLayout3.setOrientation(0);
        pAGLinearLayout3.setGravity(16);
        pAGLinearLayout2.addView(pAGLinearLayout3, new FrameLayout.LayoutParams(-2, -2));
        PAGTextView pAGTextView3 = new PAGTextView(context);
        pAGTextView3.setTextSize(16.0f);
        pAGTextView3.setTextColor(Color.parseColor("#80161823"));
        pAGLinearLayout3.addView(pAGTextView3, new ViewGroup.LayoutParams(-2, -2));
        TTRatingBar2 tTRatingBar2 = new TTRatingBar2(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = Pj.icD(context, 8.0f);
        pAGLinearLayout3.addView(tTRatingBar2, layoutParams5);
        Pj.pvs(pAGTextView3, tTRatingBar2, cRVar, 18);
        PAGTextView pAGTextView4 = new PAGTextView(context);
        pAGTextView4.setGravity(17);
        pAGTextView4.setId(520093707);
        pAGTextView4.setText(uc.icD(context, "tt_video_download_apk"));
        pAGTextView4.setTextColor(-1);
        pAGTextView4.setTextSize(2, 16.0f);
        pAGTextView4.setBackground(so.pvs(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, Pj.icD(context, 36.0f));
        layoutParams6.setMargins(Pj.icD(context, 20.0f), Pj.icD(context, 36.0f), Pj.icD(context, 20.0f), Pj.icD(context, 20.0f));
        pAGLinearLayout2.addView(pAGTextView4, layoutParams6);
        pvs(pAGTextView4, cRVar, i);
    }

    private void pvs(PAGTextView pAGTextView, cR cRVar) {
        if (pAGTextView == null) {
            return;
        }
        String rW = cRVar.rW();
        if (TextUtils.isEmpty(rW)) {
            return;
        }
        pAGTextView.setText(rW);
    }

    private void pvs(PAGTextView pAGTextView, cR cRVar, int i) {
        com.bytedance.sdk.openadsdk.core.icD.NB pvs2 = this.icD.Gp.pvs(this.icD, cRVar);
        pvs2.pvs(com.com.bytedance.overseas.sdk.pvs.Jd.pvs(this.icD.od, cRVar, this.icD.NB));
        if (i != -1) {
            HashMap hashMap = new HashMap();
            hashMap.put("ad_show_order", Integer.valueOf(i + 1));
            pvs2.pvs(hashMap);
        }
        pAGTextView.setOnClickListener(pvs2);
        pAGTextView.setOnTouchListener(pvs2);
        CharSequence Cwg = cRVar.Cwg();
        if (TextUtils.isEmpty(Cwg)) {
            return;
        }
        pAGTextView.setText(Cwg);
    }

    private void vG() {
        Context context = getContext();
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setId(kj.so);
        pAGImageView.setVisibility(8);
        addView(pAGImageView, new FrameLayout.LayoutParams(-1, -1));
        SSWebView sSWebView = new SSWebView(context, true);
        sSWebView.setVisibility(8);
        sSWebView.setId(kj.Mxy);
        addView(sSWebView, new FrameLayout.LayoutParams(-1, -1));
    }

    private void Jd() {
        Context context = getContext();
        setBackgroundColor(-1);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setGravity(1);
        pAGLinearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        addView(pAGLinearLayout, layoutParams);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        this.vG = tTRoundRectImageView;
        tTRoundRectImageView.setBackgroundColor(0);
        pAGLinearLayout.addView(this.vG, new LinearLayout.LayoutParams(Pj.icD(context, 100.0f), Pj.icD(context, 100.0f)));
        PAGTextView pAGTextView = new PAGTextView(context);
        this.Jd = pAGTextView;
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.Jd.setSingleLine(true);
        this.Jd.setMaxWidth(Pj.icD(context, 180.0f));
        this.Jd.setTextColor(Color.parseColor("#ff333333"));
        this.Jd.setTextSize(2, 20.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, Pj.icD(context, 28.0f));
        layoutParams2.topMargin = Pj.icD(context, 16.0f);
        pAGLinearLayout.addView(this.Jd, layoutParams2);
        this.NB = new TTRatingBar2(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, Pj.icD(context, 16.0f));
        layoutParams3.topMargin = Pj.icD(context, 12.0f);
        pAGLinearLayout.addView(this.NB, layoutParams3);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        this.sUS = pAGTextView2;
        pAGTextView2.setEllipsize(TextUtils.TruncateAt.END);
        this.sUS.setSingleLine(true);
        this.sUS.setTextColor(Color.parseColor("#ff93959a"));
        this.sUS.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, Pj.icD(context, 20.0f));
        layoutParams4.topMargin = Pj.icD(context, 8.0f);
        pAGLinearLayout.addView(this.sUS, layoutParams4);
        PAGTextView pAGTextView3 = new PAGTextView(context);
        this.yiw = pAGTextView3;
        pAGTextView3.setId(520093707);
        this.yiw.setGravity(17);
        this.yiw.setText(uc.icD(context, "tt_video_download_apk"));
        this.yiw.setTextColor(-1);
        this.yiw.setTextSize(2, 16.0f);
        this.yiw.setBackground(so.pvs(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, Pj.icD(context, 46.0f));
        int icD = Pj.icD(context, 20.0f);
        layoutParams5.bottomMargin = icD;
        layoutParams5.rightMargin = icD;
        layoutParams5.topMargin = icD;
        layoutParams5.leftMargin = icD;
        pAGLinearLayout.addView(this.yiw, layoutParams5);
        this.so = new PAGLogoView(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, Pj.icD(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.bottomMargin = Pj.icD(context, 16.0f);
        layoutParams6.leftMargin = Pj.icD(context, 20.0f);
        pAGLinearLayout.addView(this.so, layoutParams6);
    }

    public void setShownAdCount(int i) {
        this.Mxy = i;
    }

    private static final class pvs extends Drawable {
        private final Drawable icD;
        Path pvs = new Path();
        private final int vG;

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public pvs(Context context) {
            this.icD = uc.vG(context, "tt_ad_bg_header_gradient");
            this.vG = Pj.icD(context, 8.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            canvas.clipPath(this.pvs);
            canvas.drawColor(-1);
            this.icD.draw(canvas);
        }

        @Override // android.graphics.drawable.Drawable
        public void setBounds(int i, int i2, int i3, int i4) {
            super.setBounds(i, i2, i3, i4);
            float f = i3;
            this.icD.setBounds(i, i2, i3, (int) (((1.0f * f) / this.icD.getIntrinsicWidth()) * this.icD.getIntrinsicHeight()));
            this.pvs.reset();
            Path path = this.pvs;
            RectF rectF = new RectF(0.0f, 0.0f, f, i4);
            int i5 = this.vG;
            path.addRoundRect(rectF, i5, i5, Path.Direction.CCW);
        }
    }
}
