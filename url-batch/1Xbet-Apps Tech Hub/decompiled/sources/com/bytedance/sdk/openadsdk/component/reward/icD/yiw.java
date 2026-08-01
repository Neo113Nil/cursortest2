package com.bytedance.sdk.openadsdk.component.reward.icD;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.view.RatioImageView;
import com.bytedance.sdk.openadsdk.component.reward.view.RewardFullBaseLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.bNS;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.bytedance.sdk.openadsdk.utils.kj;
import java.util.HashMap;
import java.util.List;

/* compiled from: RewardFullTypeImage.java */
/* loaded from: classes2.dex */
public class yiw extends icD {
    private String CvL;
    private PAGTextView OT;
    private PAGTextView ZhG;
    private boolean bNS;
    private RatioImageView cR;
    private PAGRelativeLayout dX;
    private PAGLogoView dyT;
    private final int mnm;
    private TTRatingBar2 ny;
    private PAGTextView rCZ;
    private PAGTextView uc;
    private View vA;
    private TTRoundRectImageView zM;

    public yiw(com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar) {
        super(pvsVar);
        this.CvL = "fullscreen_interstitial_ad";
        this.mnm = this.icD.Ye();
        this.bNS = this.pvs.cnN == 2;
    }

    private void gA() {
        this.bNS = this.pvs.cnN == 2;
        boolean z = this.bNS;
        int i = this.mnm;
        if (z) {
            if (i == 3) {
                dx();
                return;
            } else if (i == 33) {
                cRf();
                return;
            } else {
                gSd();
                return;
            }
        }
        if (i == 3) {
            jlb();
        } else if (i == 33) {
            Pj();
        } else {
            sP();
        }
    }

    private void jlb() {
        this.vA = vG(this.pvs.od);
        qD();
    }

    private void dx() {
        final Activity activity = this.pvs.od;
        this.vA = icD(activity);
        pvs(this.cR);
        pvs(this.zM);
        pvs(this.uc);
        pvs(this.rCZ);
        pvs(this.OT);
        pvs(this.ZhG);
        this.dyT.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.icD.yiw.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.pvs(activity, yiw.this.icD, yiw.this.CvL);
                } catch (Throwable th) {
                    Ju.pvs("TTAD.RFTI", th.getMessage());
                }
            }
        });
        this.ZhG.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.icD.yiw.2
            @Override // java.lang.Runnable
            public void run() {
                int width = yiw.this.dX.getWidth() / 2;
                if (width >= Pj.vG(mnm.pvs(), 90.0f)) {
                    ViewGroup.LayoutParams layoutParams = yiw.this.ZhG.getLayoutParams();
                    if (layoutParams.width > 0) {
                        layoutParams.width = Math.min(width, layoutParams.width);
                        yiw.this.ZhG.setLayoutParams(layoutParams);
                    }
                }
            }
        });
    }

    private void Pj() {
        this.vA = Jd(this.pvs.od);
        qD();
    }

    private void cRf() {
        this.vA = pvs(this.pvs.od, 0);
        qD();
    }

    private void sP() {
        final Activity activity = this.pvs.od;
        this.vA = NB(activity);
        pvs(this.cR);
        pvs(this.zM);
        pvs(this.uc);
        pvs(this.rCZ);
        pvs(this.ZhG);
        this.dyT.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.icD.yiw.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.pvs(activity, yiw.this.icD, yiw.this.CvL);
                } catch (Throwable th) {
                    Ju.pvs("TTAD.RFTI", th.getMessage());
                }
            }
        });
    }

    private void gSd() {
        this.vA = pvs(this.pvs.od, 2);
        qD();
    }

    private void qD() {
        if (this.vA == null) {
            return;
        }
        final Activity activity = this.pvs.od;
        pvs((View) this.cR);
        pvs((View) this.zM);
        pvs(this.uc);
        pvs(this.rCZ);
        pvs(this.OT);
        pvs(this.ny);
        pvs(this.ZhG);
        this.dyT.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.icD.yiw.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.pvs(activity, yiw.this.icD, yiw.this.CvL);
                } catch (Throwable th) {
                    Ju.pvs("TTAD.RFTI", th.getMessage());
                }
            }
        });
    }

    private void Jd(cR cRVar) {
        if (cRVar == null) {
            return;
        }
        RatioImageView ratioImageView = this.cR;
        if (ratioImageView != null) {
            int i = this.mnm;
            if (i == 33) {
                ratioImageView.setRatio(1.0f);
            } else if (i == 3) {
                ratioImageView.setRatio(1.91f);
            } else {
                ratioImageView.setRatio(0.56f);
            }
            pvs((ImageView) this.cR);
        }
        if (this.zM != null && this.icD.ea() != null && !TextUtils.isEmpty(this.icD.ea().pvs())) {
            com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs(this.icD.ea().pvs(), this.icD.ea().icD(), this.icD.ea().vG(), this.zM, this.icD);
        }
        PAGTextView pAGTextView = this.uc;
        if (pAGTextView != null) {
            pAGTextView.setText(pvs(this.icD));
        }
        PAGTextView pAGTextView2 = this.rCZ;
        if (pAGTextView2 != null) {
            pAGTextView2.setText(icD(this.icD));
        }
        od();
        OhP();
    }

    protected String pvs(cR cRVar) {
        if (cRVar == null) {
            return "";
        }
        if (cRVar.Ca() != null && !TextUtils.isEmpty(cRVar.Ca().icD())) {
            return cRVar.Ca().icD();
        }
        if (TextUtils.isEmpty(cRVar.OhP())) {
            return !TextUtils.isEmpty(cRVar.qd()) ? cRVar.qd() : "";
        }
        return cRVar.OhP();
    }

    protected String icD(cR cRVar) {
        if (cRVar == null) {
            return "";
        }
        if (TextUtils.isEmpty(cRVar.qd())) {
            return !TextUtils.isEmpty(cRVar.rW()) ? cRVar.rW() : "";
        }
        return cRVar.qd();
    }

    private void pvs(ImageView imageView) {
        List<bNS> BSi;
        bNS bns;
        if (this.icD == null || (BSi = this.icD.BSi()) == null || BSi.size() <= 0 || (bns = BSi.get(0)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.sUS.Jd.pvs(BSi.get(0)).vG(2).pvs(com.bytedance.sdk.openadsdk.sUS.vG.pvs(this.icD, bns.pvs(), imageView));
    }

    private void od() {
        TTRatingBar2 tTRatingBar2 = this.ny;
        if (tTRatingBar2 == null) {
            return;
        }
        Pj.pvs((TextView) null, tTRatingBar2, this.icD);
    }

    private void OhP() {
        if (this.OT == null || this.icD == null) {
            return;
        }
        Pj.pvs(this.OT, this.icD, this.pvs.od, "tt_comment_num_backup");
    }

    protected void pvs(View view) {
        com.bytedance.sdk.openadsdk.core.icD.icD icd;
        if (view == null || this.pvs.od == null || this.icD == null) {
            return;
        }
        if (this.kj == null) {
            Activity activity = this.pvs.od;
            cR cRVar = this.icD;
            String str = this.CvL;
            icd = new com.bytedance.sdk.openadsdk.core.icD.pvs(activity, cRVar, str, jlb.pvs(str));
            icd.pvs(NB(this.icD));
            HashMap hashMap = new HashMap();
            if (rCZ.qh(this.icD)) {
                hashMap.put("click_scence", 3);
            } else {
                hashMap.put("click_scence", 1);
            }
            icd.pvs(hashMap);
        } else {
            icd = this.kj;
        }
        if (this.pvs.od != null) {
            icd.pvs(this.pvs.od);
        }
        view.setOnTouchListener(icd);
        view.setOnClickListener(icd);
    }

    private com.com.bytedance.overseas.sdk.pvs.vG NB(cR cRVar) {
        if (cRVar.jhZ() == 4) {
            return new com.com.bytedance.overseas.sdk.pvs.icD(mnm.pvs(), cRVar, this.CvL);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public void pvs(FrameLayout frameLayout) {
        gA();
        Jd(this.icD);
        frameLayout.addView(this.vA);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public void pvs(RewardFullBaseLayout rewardFullBaseLayout) {
        if (com.bytedance.sdk.openadsdk.core.model.mnm.icD(this.icD)) {
            vG.icD(rewardFullBaseLayout);
            this.pvs.Ye.pvs((long) (this.pvs.ny.Gp() * 1000.0d));
        } else if (com.bytedance.sdk.openadsdk.core.model.mnm.vG(this.icD) || com.bytedance.sdk.openadsdk.core.model.mnm.Jd(this.icD)) {
            vG.vG(rewardFullBaseLayout);
            this.pvs.Ye.pvs((long) (this.pvs.ny.Gp() * 1000.0d));
        } else {
            super.pvs(rewardFullBaseLayout);
        }
    }

    public static boolean vG(cR cRVar) {
        return !cR.NB(cRVar) && cRVar.UYh() == 100.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public boolean NB() {
        return jhZ() || rCZ.icD(this.icD);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public boolean sUS() {
        return jhZ();
    }

    private boolean jhZ() {
        return this.icD != null && this.icD.OT() == 2;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public void yiw() {
        this.sUS.Jd(8);
        this.sUS.vG(8);
        this.so.vG(false);
        this.so.Jd(false);
        if (this.icD.OT() == 2) {
            this.so.pvs(false);
            this.sUS.sUS(8);
            return;
        }
        this.so.pvs(this.icD.yhq());
        if (this.pvs.HWd) {
            Message obtain = Message.obtain();
            obtain.what = TypedValues.Custom.TYPE_INT;
            com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar = this.pvs;
            int Gp = (int) (this.pvs.ny.Gp() * 1000.0d);
            pvsVar.Mxy = Gp;
            obtain.arg1 = Gp;
            this.pvs.SE.sendMessage(obtain);
        }
    }

    private View icD(Context context) {
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.cR = new RatioImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.cR.setScaleType(ImageView.ScaleType.FIT_XY);
        this.cR.setLayoutParams(layoutParams);
        pAGRelativeLayout.addView(this.cR);
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        this.dyT = pAGLogoView;
        pAGLogoView.setId(520093757);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, pvs(14.0f));
        layoutParams2.addRule(2, kj.pR);
        this.dyT.setPadding(pvs(2.0f), 0, 0, 0);
        this.dyT.setLayoutParams(layoutParams2);
        pAGRelativeLayout.addView(this.dyT);
        PAGRelativeLayout pAGRelativeLayout2 = new PAGRelativeLayout(context);
        this.dX = pAGRelativeLayout2;
        pAGRelativeLayout2.setId(kj.pR);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, pvs(90.0f));
        layoutParams3.addRule(12);
        this.dX.setBackgroundColor(Color.parseColor("#E4FFFFFF"));
        this.dX.setGravity(16);
        this.dX.setLayoutParams(layoutParams3);
        pAGRelativeLayout.addView(this.dX);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        this.zM = tTRoundRectImageView;
        tTRoundRectImageView.setId(kj.EFw);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(pvs(69.0f), pvs(69.0f));
        layoutParams4.addRule(9);
        layoutParams4.addRule(15);
        this.zM.setBackgroundColor(0);
        this.zM.setLayoutParams(layoutParams4);
        this.dX.addView(this.zM);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams5.addRule(1, kj.EFw);
        layoutParams5.addRule(0, kj.sR);
        pAGLinearLayout.setGravity(16);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(layoutParams5);
        this.dX.addView(pAGLinearLayout);
        this.uc = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, pvs(27.0f));
        layoutParams6.leftMargin = pvs(14.0f);
        this.uc.setEllipsize(TextUtils.TruncateAt.END);
        this.uc.setGravity(16);
        this.uc.setMaxWidth(pvs(153.0f));
        this.uc.setSingleLine(true);
        this.uc.setTextColor(Color.parseColor("#ff000000"));
        this.uc.setTextSize(17.0f);
        this.uc.setLayoutParams(layoutParams6);
        pAGLinearLayout.addView(this.uc);
        this.rCZ = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams7.leftMargin = pvs(14.0f);
        layoutParams7.topMargin = pvs(5.0f);
        this.rCZ.setEllipsize(TextUtils.TruncateAt.END);
        this.rCZ.setSingleLine(true);
        this.rCZ.setTextColor(Color.parseColor("#4A4A4A"));
        this.rCZ.setTextSize(15.0f);
        this.rCZ.setLayoutParams(layoutParams7);
        pAGLinearLayout.addView(this.rCZ);
        PAGTextView pAGTextView = new PAGTextView(context);
        this.ZhG = pAGTextView;
        pAGTextView.setId(kj.sR);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, pvs(36.0f));
        layoutParams8.addRule(11);
        layoutParams8.addRule(15);
        layoutParams8.rightMargin = pvs(15.0f);
        this.ZhG.setMinWidth(pvs(90.0f));
        this.ZhG.setBackground(com.bytedance.sdk.openadsdk.utils.so.pvs(context, "tt_download_corner_bg"));
        this.ZhG.setGravity(17);
        this.ZhG.setSingleLine(true);
        this.ZhG.setText(uc.pvs(context, "tt_video_download_apk"));
        this.ZhG.setTextColor(Color.parseColor("#ffffff"));
        this.ZhG.setTextSize(17.0f);
        this.ZhG.setLayoutParams(layoutParams8);
        this.dX.addView(this.ZhG);
        return pAGRelativeLayout;
    }

    private View vG(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams2.weight = 1.0f;
        pAGRelativeLayout.setLayoutParams(layoutParams2);
        RatioImageView ratioImageView = new RatioImageView(context);
        this.cR = ratioImageView;
        ratioImageView.setId(kj.AEt);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        this.cR.setScaleType(ImageView.ScaleType.FIT_XY);
        this.cR.setLayoutParams(layoutParams3);
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        this.dyT = pAGLogoView;
        pAGLogoView.setId(520093757);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, pvs(14.0f));
        layoutParams4.addRule(8, kj.AEt);
        this.dyT.setPadding(pvs(2.0f), 0, 0, 0);
        this.dyT.setLayoutParams(layoutParams4);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams5.weight = 2.0f;
        pAGLinearLayout.setGravity(17);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(layoutParams5);
        this.zM = new TTRoundRectImageView(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(pvs(80.0f), pvs(80.0f));
        this.zM.setBackgroundColor(0);
        this.zM.setLayoutParams(layoutParams6);
        pAGLinearLayout.addView(this.zM);
        this.uc = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, pvs(28.0f));
        this.uc.setEllipsize(TextUtils.TruncateAt.END);
        this.uc.setMaxWidth(pvs(180.0f));
        this.uc.setSingleLine(true);
        this.uc.setTextColor(Color.parseColor("#ffffff"));
        this.uc.setTextSize(20.0f);
        this.uc.setLayoutParams(layoutParams7);
        this.rCZ = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams8.leftMargin = pvs(40.0f);
        layoutParams8.topMargin = pvs(20.0f);
        layoutParams8.rightMargin = pvs(40.0f);
        this.rCZ.setGravity(17);
        this.rCZ.setTextColor(Color.parseColor("#ffffff"));
        this.rCZ.setTextSize(20.0f);
        this.rCZ.setLayoutParams(layoutParams8);
        this.OT = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, pvs(20.0f));
        layoutParams9.topMargin = pvs(50.0f);
        this.OT.setEllipsize(TextUtils.TruncateAt.END);
        this.OT.setSingleLine(true);
        this.OT.setText(uc.pvs(context, "tt_comment_num_backup"));
        this.OT.setTextColor(Color.parseColor("#ff93959a"));
        this.OT.setTextSize(14.0f);
        this.OT.setLayoutParams(layoutParams9);
        this.ny = new TTRatingBar2(context, null);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, pvs(16.0f));
        layoutParams10.gravity = 17;
        layoutParams10.topMargin = pvs(12.0f);
        this.ny.setLayoutParams(layoutParams10);
        this.ZhG = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-1, pvs(40.0f));
        layoutParams11.leftMargin = pvs(40.0f);
        layoutParams11.rightMargin = pvs(40.0f);
        layoutParams11.topMargin = pvs(30.0f);
        this.ZhG.setBackground(com.bytedance.sdk.openadsdk.utils.so.pvs(context, "tt_reward_video_download_btn_bg"));
        this.ZhG.setGravity(17);
        this.ZhG.setText(uc.pvs(context, "tt_video_download_apk"));
        this.ZhG.setTextColor(Color.parseColor("#ffffff"));
        this.ZhG.setTextSize(15.0f);
        this.ZhG.setLayoutParams(layoutParams11);
        linearLayout.addView(pAGRelativeLayout);
        pAGRelativeLayout.addView(this.cR);
        pAGRelativeLayout.addView(this.dyT);
        linearLayout.addView(pAGLinearLayout);
        pAGLinearLayout.addView(this.uc);
        pAGLinearLayout.addView(this.rCZ);
        pAGLinearLayout.addView(this.OT);
        pAGLinearLayout.addView(this.ny);
        pAGLinearLayout.addView(this.ZhG);
        return linearLayout;
    }

    private View pvs(Context context, int i) {
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        RatioImageView ratioImageView = new RatioImageView(context);
        this.cR = ratioImageView;
        ratioImageView.setId(kj.AEt);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        this.cR.setScaleType(ImageView.ScaleType.FIT_XY);
        this.cR.setLayoutParams(layoutParams);
        PAGRelativeLayout pAGRelativeLayout2 = new PAGRelativeLayout(context);
        pAGRelativeLayout2.setId(kj.FN);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, pvs(70.0f));
        if (i == 0) {
            layoutParams2.leftMargin = pvs(20.0f);
        } else if (i == 2) {
            layoutParams2 = new RelativeLayout.LayoutParams(-1, pvs(100.0f));
            layoutParams2.leftMargin = pvs(25.0f);
        }
        layoutParams2.topMargin = pvs(60.0f);
        layoutParams2.addRule(1, kj.AEt);
        pAGRelativeLayout2.setLayoutParams(layoutParams2);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        this.zM = tTRoundRectImageView;
        tTRoundRectImageView.setId(kj.EFw);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(pvs(69.0f), pvs(69.0f));
        if (i == 2) {
            layoutParams3 = new RelativeLayout.LayoutParams(pvs(80.0f), pvs(80.0f));
        }
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        this.zM.setBackgroundColor(0);
        this.zM.setLayoutParams(layoutParams3);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -1);
        if (i == 2) {
            layoutParams4 = new RelativeLayout.LayoutParams(-1, -1);
        }
        layoutParams4.addRule(1, kj.EFw);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setGravity(16);
        pAGLinearLayout.setLayoutParams(layoutParams4);
        this.uc = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, pvs(27.0f));
        if (i == 2) {
            layoutParams5 = new LinearLayout.LayoutParams(-2, pvs(33.0f));
        }
        layoutParams5.leftMargin = pvs(14.0f);
        this.uc.setEllipsize(TextUtils.TruncateAt.END);
        this.uc.setGravity(16);
        this.uc.setMaxWidth(pvs(176.0f));
        this.uc.setSingleLine(true);
        this.uc.setTextColor(Color.parseColor("#ffffffff"));
        this.uc.setTextSize(17.0f);
        this.uc.setLayoutParams(layoutParams5);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.leftMargin = pvs(14.0f);
        layoutParams6.topMargin = pvs(10.0f);
        pAGLinearLayout2.setGravity(16);
        pAGLinearLayout2.setOrientation(0);
        pAGLinearLayout2.setLayoutParams(layoutParams6);
        this.ny = new TTRatingBar2(context, null);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, pvs(14.0f));
        if (i == 2) {
            layoutParams7 = new LinearLayout.LayoutParams(-2, pvs(20.0f));
        }
        layoutParams7.gravity = 17;
        this.ny.setLayoutParams(layoutParams7);
        if (i == 2) {
            this.OT = new PAGTextView(context);
            LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams8.leftMargin = pvs(10.0f);
            this.OT.setEllipsize(TextUtils.TruncateAt.END);
            this.OT.setMaxWidth(pvs(170.0f));
            this.OT.setSingleLine(true);
            this.OT.setText(uc.pvs(context, "tt_comment_num"));
            this.OT.setTextColor(Color.parseColor("#ffffffff"));
            this.OT.setTextSize(15.0f);
            this.OT.setLayoutParams(layoutParams8);
        }
        PAGTextView pAGTextView = new PAGTextView(context);
        this.rCZ = pAGTextView;
        pAGTextView.setId(kj.mRq);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams9.addRule(3, kj.FN);
        layoutParams9.topMargin = pvs(30.0f);
        layoutParams9.addRule(1, kj.AEt);
        if (i == 0) {
            layoutParams9.leftMargin = pvs(20.0f);
            this.rCZ.setGravity(17);
        } else if (i == 2) {
            layoutParams9.leftMargin = pvs(20.0f);
        }
        this.rCZ.setTextColor(Color.parseColor("#ffffff"));
        this.rCZ.setTextSize(17.0f);
        this.rCZ.setLayoutParams(layoutParams9);
        this.ZhG = new PAGTextView(context);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, pvs(40.0f));
        layoutParams10.addRule(3, kj.mRq);
        layoutParams10.addRule(14);
        layoutParams10.addRule(15);
        if (i == 0) {
            layoutParams10.leftMargin = pvs(40.0f);
            layoutParams10.topMargin = pvs(80.0f);
            layoutParams10.rightMargin = pvs(40.0f);
        } else if (i == 2) {
            layoutParams10.leftMargin = pvs(25.0f);
            layoutParams10.topMargin = pvs(60.0f);
            layoutParams10.rightMargin = pvs(25.0f);
        }
        layoutParams10.addRule(1, kj.AEt);
        this.ZhG.setBackground(com.bytedance.sdk.openadsdk.utils.so.pvs(context, "tt_reward_video_download_btn_bg"));
        this.ZhG.setGravity(17);
        this.ZhG.setText(uc.pvs(context, "tt_video_download_apk"));
        this.ZhG.setTextColor(Color.parseColor("#ffffff"));
        this.ZhG.setTextSize(15.0f);
        this.ZhG.setLayoutParams(layoutParams10);
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        this.dyT = pAGLogoView;
        pAGLogoView.setId(520093757);
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-2, pvs(14.0f));
        layoutParams11.addRule(9);
        layoutParams11.addRule(12);
        layoutParams11.leftMargin = pvs(16.0f);
        layoutParams11.bottomMargin = pvs(20.0f);
        this.dyT.setGravity(17);
        this.dyT.setPadding(pvs(2.0f), 0, 0, 0);
        this.dyT.setLayoutParams(layoutParams11);
        pAGRelativeLayout.addView(this.cR);
        pAGRelativeLayout.addView(pAGRelativeLayout2);
        pAGRelativeLayout2.addView(this.zM);
        pAGRelativeLayout2.addView(pAGLinearLayout);
        pAGLinearLayout.addView(this.uc);
        pAGLinearLayout.addView(pAGLinearLayout2);
        pAGLinearLayout2.addView(this.ny);
        if (i == 2) {
            pAGLinearLayout2.addView(this.OT);
        }
        pAGRelativeLayout.addView(this.rCZ);
        pAGRelativeLayout.addView(this.ZhG);
        pAGRelativeLayout.addView(this.dyT);
        return pAGRelativeLayout;
    }

    private View Jd(Context context) {
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        PAGRelativeLayout pAGRelativeLayout2 = new PAGRelativeLayout(context);
        pAGRelativeLayout2.setId(kj.FN);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, pvs(70.0f));
        layoutParams.topMargin = pvs(45.0f);
        layoutParams.leftMargin = pvs(20.0f);
        layoutParams.rightMargin = pvs(20.0f);
        pAGRelativeLayout2.setLayoutParams(layoutParams);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        this.zM = tTRoundRectImageView;
        tTRoundRectImageView.setId(kj.EFw);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(pvs(65.0f), pvs(65.0f));
        layoutParams2.addRule(9);
        layoutParams2.addRule(15);
        this.zM.setBackgroundColor(0);
        this.zM.setLayoutParams(layoutParams2);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams3.addRule(1, kj.EFw);
        pAGLinearLayout.setGravity(16);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(layoutParams3);
        this.uc = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, pvs(27.0f));
        layoutParams4.leftMargin = pvs(14.0f);
        this.uc.setEllipsize(TextUtils.TruncateAt.END);
        this.uc.setGravity(16);
        this.uc.setMaxWidth(pvs(176.0f));
        this.uc.setSingleLine(true);
        this.uc.setTextColor(Color.parseColor("#ffffffff"));
        this.uc.setTextSize(17.0f);
        this.uc.setLayoutParams(layoutParams4);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.topMargin = pvs(10.0f);
        pAGLinearLayout2.setGravity(16);
        pAGLinearLayout2.setOrientation(0);
        pAGLinearLayout2.setLayoutParams(layoutParams5);
        this.ny = new TTRatingBar2(context, null);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.leftMargin = pvs(14.0f);
        layoutParams6.gravity = 17;
        this.ny.setLayoutParams(layoutParams6);
        this.OT = new PAGTextView(context);
        new LinearLayout.LayoutParams(-2, -2).leftMargin = pvs(10.0f);
        this.OT.setEllipsize(TextUtils.TruncateAt.END);
        this.OT.setMaxWidth(pvs(170.0f));
        this.OT.setSingleLine(true);
        this.OT.setText(uc.pvs(context, "tt_comment_num"));
        this.OT.setTextColor(Color.parseColor("#ffffffff"));
        this.OT.setTextSize(13.0f);
        RatioImageView ratioImageView = new RatioImageView(context);
        this.cR = ratioImageView;
        ratioImageView.setId(kj.AEt);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams7.topMargin = pvs(31.0f);
        layoutParams7.addRule(3, kj.FN);
        this.cR.setScaleType(ImageView.ScaleType.FIT_XY);
        this.cR.setLayoutParams(layoutParams7);
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        this.dyT = pAGLogoView;
        pAGLogoView.setId(520093757);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, pvs(14.0f));
        layoutParams8.addRule(8, kj.AEt);
        layoutParams8.leftMargin = pvs(5.0f);
        layoutParams8.bottomMargin = pvs(5.0f);
        this.dyT.setGravity(17);
        this.dyT.setPadding(pvs(2.0f), 0, 0, 0);
        this.dyT.setLayoutParams(layoutParams8);
        PAGTextView pAGTextView = new PAGTextView(context);
        this.rCZ = pAGTextView;
        pAGTextView.setId(kj.mRq);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams9.addRule(3, kj.AEt);
        layoutParams9.leftMargin = pvs(40.0f);
        layoutParams9.topMargin = pvs(20.0f);
        layoutParams9.rightMargin = pvs(40.0f);
        this.rCZ.setGravity(17);
        this.rCZ.setTextColor(Color.parseColor("#ffffff"));
        this.rCZ.setTextSize(17.0f);
        this.rCZ.setLayoutParams(layoutParams9);
        this.ZhG = new PAGTextView(context);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, pvs(40.0f));
        layoutParams10.addRule(3, kj.mRq);
        layoutParams10.addRule(13);
        layoutParams10.leftMargin = pvs(40.0f);
        layoutParams10.topMargin = pvs(35.0f);
        layoutParams10.rightMargin = pvs(40.0f);
        this.ZhG.setBackground(com.bytedance.sdk.openadsdk.utils.so.pvs(context, "tt_reward_video_download_btn_bg"));
        this.ZhG.setGravity(17);
        this.ZhG.setText(uc.pvs(context, "tt_video_download_apk"));
        this.ZhG.setTextColor(Color.parseColor("#ffffff"));
        this.ZhG.setTextSize(15.0f);
        this.ZhG.setLayoutParams(layoutParams10);
        pAGRelativeLayout.addView(pAGRelativeLayout2);
        pAGRelativeLayout2.addView(this.zM);
        pAGRelativeLayout2.addView(pAGLinearLayout);
        pAGLinearLayout.addView(this.uc);
        pAGLinearLayout.addView(pAGLinearLayout2);
        pAGLinearLayout2.addView(this.ny);
        pAGLinearLayout2.addView(this.OT);
        pAGRelativeLayout.addView(this.cR);
        pAGRelativeLayout.addView(this.dyT);
        pAGRelativeLayout.addView(this.rCZ);
        pAGRelativeLayout.addView(this.ZhG);
        return pAGRelativeLayout;
    }

    private View NB(Context context) {
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.cR = new RatioImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.cR.setScaleType(ImageView.ScaleType.FIT_XY);
        this.cR.setLayoutParams(layoutParams);
        PAGRelativeLayout pAGRelativeLayout2 = new PAGRelativeLayout(context);
        this.dX = pAGRelativeLayout2;
        pAGRelativeLayout2.setId(kj.pR);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, pvs(100.0f));
        layoutParams2.addRule(12);
        layoutParams2.setMargins(pvs(15.0f), pvs(15.0f), pvs(15.0f), pvs(15.0f));
        this.dX.setBackgroundColor(Color.parseColor("#E4FFFFFF"));
        this.dX.setGravity(16);
        this.dX.setPadding(pvs(15.0f), 0, 0, 0);
        this.dX.setLayoutParams(layoutParams2);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        this.zM = tTRoundRectImageView;
        tTRoundRectImageView.setId(kj.EFw);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(pvs(69.0f), pvs(69.0f));
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        this.zM.setBackgroundColor(0);
        this.zM.setLayoutParams(layoutParams3);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams4.addRule(1, kj.EFw);
        pAGLinearLayout.setGravity(16);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(layoutParams4);
        this.uc = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, pvs(27.0f));
        layoutParams5.leftMargin = pvs(14.0f);
        this.uc.setEllipsize(TextUtils.TruncateAt.END);
        this.uc.setGravity(16);
        this.uc.setMaxWidth(pvs(153.0f));
        this.uc.setSingleLine(true);
        this.uc.setTextColor(Color.parseColor("#ff000000"));
        this.uc.setTextSize(15.0f);
        this.uc.setLayoutParams(layoutParams5);
        this.rCZ = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.leftMargin = pvs(14.0f);
        this.rCZ.setEllipsize(TextUtils.TruncateAt.END);
        this.rCZ.setGravity(16);
        this.rCZ.setMaxWidth(pvs(153.0f));
        this.rCZ.setSingleLine(true);
        this.rCZ.setTextColor(Color.parseColor("#4A4A4A"));
        this.rCZ.setTextSize(14.0f);
        this.rCZ.setLayoutParams(layoutParams6);
        PAGTextView pAGTextView = new PAGTextView(context);
        this.ZhG = pAGTextView;
        pAGTextView.setId(kj.sR);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(pvs(80.0f), pvs(36.0f));
        layoutParams7.addRule(11);
        layoutParams7.addRule(15);
        layoutParams7.rightMargin = pvs(15.0f);
        this.ZhG.setBackground(com.bytedance.sdk.openadsdk.utils.so.pvs(context, "tt_download_corner_bg"));
        this.ZhG.setGravity(17);
        this.ZhG.setText(uc.pvs(context, "tt_video_download_apk"));
        this.ZhG.setTextColor(Color.parseColor("#ffffff"));
        this.ZhG.setTextSize(15.0f);
        this.ZhG.setLayoutParams(layoutParams7);
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        this.dyT = pAGLogoView;
        pAGLogoView.setId(520093757);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, pvs(14.0f));
        layoutParams8.addRule(2, kj.pR);
        layoutParams8.leftMargin = pvs(16.0f);
        layoutParams8.bottomMargin = pvs(10.0f);
        this.dyT.setPadding(pvs(2.0f), 0, 0, 0);
        this.dyT.setLayoutParams(layoutParams8);
        pAGRelativeLayout.addView(this.cR);
        pAGRelativeLayout.addView(this.dX);
        this.dX.addView(this.zM);
        this.dX.addView(pAGLinearLayout);
        pAGLinearLayout.addView(this.uc);
        pAGLinearLayout.addView(this.rCZ);
        this.dX.addView(this.ZhG);
        pAGRelativeLayout.addView(this.dyT);
        return pAGRelativeLayout;
    }

    private int pvs(float f) {
        return Pj.icD(this.pvs.od, f);
    }
}
