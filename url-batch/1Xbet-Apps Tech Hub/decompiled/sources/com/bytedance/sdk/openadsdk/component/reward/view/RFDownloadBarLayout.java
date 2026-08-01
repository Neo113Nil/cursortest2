package com.bytedance.sdk.openadsdk.component.reward.view;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.NB.mnm;
import com.bytedance.sdk.component.NB.qh;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.icD.yiw;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.widget.vG;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.bytedance.sdk.openadsdk.utils.kj;
import com.bytedance.sdk.openadsdk.utils.so;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class RFDownloadBarLayout extends PAGRelativeLayout {
    private TTRoundRectImageView Jd;
    private TextView NB;
    private TextView icD;
    private TTRatingBar2 pvs;
    private boolean sUS;
    private TextView so;
    private TextView vG;
    private com.bytedance.sdk.openadsdk.component.reward.pvs.pvs yiw;

    public RFDownloadBarLayout(Context context) {
        super(context);
        setVisibility(8);
    }

    private static TTRoundRectImageView pvs(Context context) {
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        tTRoundRectImageView.setBackgroundColor(0);
        tTRoundRectImageView.setId(kj.icD);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Pj.icD(context, 69.0f), Pj.icD(context, 69.0f));
        layoutParams.addRule(20);
        layoutParams.addRule(9);
        layoutParams.addRule(15);
        tTRoundRectImageView.setLayoutParams(layoutParams);
        return tTRoundRectImageView;
    }

    private static TextView icD(Context context) {
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setGravity(16);
        pAGTextView.setSingleLine(true);
        pAGTextView.setTextColor(-1);
        pAGTextView.setTextSize(2, 17.0f);
        pAGTextView.setId(kj.vG);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, Pj.icD(context, 27.0f));
        layoutParams.leftMargin = Pj.icD(context, 14.0f);
        pAGTextView.setLayoutParams(layoutParams);
        return pAGTextView;
    }

    private static TTRatingBar2 pvs(Context context, int i) {
        TTRatingBar2 tTRatingBar2 = new TTRatingBar2(context);
        tTRatingBar2.setId(kj.NB);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, Pj.icD(context, 14.0f));
        layoutParams.gravity = i;
        tTRatingBar2.setLayoutParams(layoutParams);
        return tTRatingBar2;
    }

    private static TextView vG(Context context) {
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setSingleLine(true);
        pAGTextView.setTextColor(-1);
        pAGTextView.setTextSize(2, 13.0f);
        pAGTextView.setId(kj.Jd);
        pAGTextView.setMaxWidth(Pj.icD(context, 72.0f));
        pAGTextView.setText(uc.icD(context, "tt_comment_num"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = Pj.icD(context, 10.0f);
        pAGTextView.setLayoutParams(layoutParams);
        return pAGTextView;
    }

    private static TextView Jd(Context context) {
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setGravity(17);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setLines(1);
        pAGTextView.setTextColor(-1);
        pAGTextView.setTextSize(2, 14.0f);
        pAGTextView.setBackground(so.pvs(context, "tt_reward_video_download_btn_bg"));
        pAGTextView.setId(520093705);
        pAGTextView.setPadding(Pj.icD(context, 10.0f), 0, Pj.icD(context, 10.0f), 0);
        pAGTextView.setText(uc.icD(context, "tt_video_mobile_go_detail"));
        return pAGTextView;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0 || this.sUS) {
            return;
        }
        vG();
    }

    private void vG() {
        TextView textView;
        this.sUS = true;
        Context context = getContext();
        int ae = this.yiw.icD.ae();
        if (ae == 1) {
            Jd();
        } else if (ae == 3) {
            sUS();
        } else if (ae == 5) {
            NB();
        } else {
            yiw();
        }
        if (this.vG == null) {
            this.vG = (TextView) this.yiw.qD.findViewById(520093705);
        }
        final cR cRVar = this.yiw.icD;
        TextView textView2 = this.vG;
        if (textView2 != null) {
            textView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFDownloadBarLayout.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    int width = ((ViewGroup) RFDownloadBarLayout.this.vG.getParent()).getWidth();
                    if (width > 0) {
                        RFDownloadBarLayout.this.vG.setMaxWidth((int) (width * 0.45f));
                    }
                }
            });
            if (cRVar.SJ()) {
                if (cRVar.ig() != null && TextUtils.isEmpty(cRVar.ig().sUS())) {
                    Pj.pvs((View) this.vG, 8);
                }
            } else {
                this.vG.setText(cRVar.ae() == 3 ? getButtonTextForNewStyleBar() : cRVar.Cwg());
            }
        }
        if (this.Jd != null && cRVar.ea() != null && !TextUtils.isEmpty(cRVar.ea().pvs())) {
            final String pvs = cRVar.ea().pvs();
            if (cRVar.SJ()) {
                com.bytedance.sdk.openadsdk.sUS.Jd.pvs(cRVar.ea()).vG(2).pvs(new com.bytedance.sdk.openadsdk.sUS.icD(cRVar, cRVar.ea().pvs(), new mnm<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFDownloadBarLayout.2
                    @Override // com.bytedance.sdk.component.NB.mnm
                    public void pvs(qh<Bitmap> qhVar) {
                        if (qhVar == null || qhVar.icD() == null) {
                            return;
                        }
                        if (RFDownloadBarLayout.this.Jd != null) {
                            RFDownloadBarLayout.this.Jd.setImageBitmap(qhVar.icD());
                        }
                        com.bytedance.sdk.openadsdk.icD.vG.icD(cRVar, RFDownloadBarLayout.this.yiw.NB, "load_vast_icon_success", (JSONObject) null);
                    }

                    @Override // com.bytedance.sdk.component.NB.mnm
                    public void pvs(int i, String str, Throwable th) {
                        RFDownloadBarLayout.this.pvs(i, str, pvs);
                    }
                }));
                if (cRVar.ig() != null && cRVar.ig().icD() != null) {
                    cRVar.ig().icD().icD(0L);
                }
            } else {
                com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs(cRVar.ea(), this.Jd, cRVar);
            }
        }
        if (this.NB != null) {
            if (this.yiw.cnN == 1 && cRVar.Ca() != null && !TextUtils.isEmpty(cRVar.Ca().icD())) {
                this.NB.setText(cRVar.Ca().icD());
            } else {
                this.NB.setText(cRVar.qd());
            }
        }
        TextView textView3 = this.icD;
        if (textView3 != null) {
            Pj.pvs(textView3, cRVar, this.yiw.jhZ, "tt_comment_num");
        }
        if (this.yiw.cnN == 1) {
            TextView textView4 = this.NB;
            if (textView4 != null) {
                textView4.setMaxWidth(Pj.icD(context, 153.0f));
            }
        } else {
            TextView textView5 = this.NB;
            if (textView5 != null) {
                textView5.setMaxWidth(Pj.icD(context, 404.0f));
            }
        }
        TTRatingBar2 tTRatingBar2 = this.pvs;
        if (tTRatingBar2 != null) {
            Pj.pvs((TextView) null, tTRatingBar2, cRVar);
        }
        if (cRVar.SJ() && (textView = this.so) != null) {
            textView.setText(cRVar.rW());
        }
        if (this.yiw.cnN == 2 && cRVar.ae() == 1) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.vG.getLayoutParams();
            layoutParams.height = Pj.icD(this.yiw.jhZ, 55.0f);
            layoutParams.topMargin = Pj.icD(this.yiw.jhZ, 20.0f);
            this.vG.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams2.bottomMargin = Pj.icD(this.yiw.jhZ, 12.0f);
            setLayoutParams(layoutParams2);
        }
        icD();
    }

    public void pvs() {
        Keyframe ofFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe ofFloat2 = Keyframe.ofFloat(0.65f, 1.0f);
        Keyframe ofFloat3 = Keyframe.ofFloat(0.765f, 0.9f);
        Keyframe ofFloat4 = Keyframe.ofFloat(0.88f, 1.0f);
        Keyframe ofFloat5 = Keyframe.ofFloat(0.95f, 0.95f);
        Keyframe ofFloat6 = Keyframe.ofFloat(1.0f, 1.0f);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("scaleX", ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6), PropertyValuesHolder.ofKeyframe("scaleY", ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6));
        ofPropertyValuesHolder.setDuration(1000L);
        ofPropertyValuesHolder.start();
    }

    public void pvs(com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar) {
        this.yiw = pvsVar;
        if (pvsVar.icD.ae() == 1) {
            vG();
        }
    }

    protected String getButtonTextForNewStyleBar() {
        boolean z;
        String Cwg;
        String yiw = jlb.yiw(this.yiw.jhZ);
        if (yiw == null) {
            yiw = "";
        }
        try {
            z = yiw.equals(Locale.ENGLISH.getLanguage());
        } catch (Throwable unused) {
            z = false;
        }
        if (TextUtils.isEmpty(this.yiw.icD.Cwg())) {
            Cwg = this.yiw.icD.jhZ() != 4 ? "View" : "Install";
        } else {
            Cwg = this.yiw.icD.Cwg();
            if (Cwg == null || !jlb.sUS(Cwg) || Cwg.length() <= 2) {
                if (Cwg != null && !jlb.sUS(Cwg) && Cwg.length() > 7 && z) {
                    Cwg = getCnOrEnBtnText();
                }
            } else if (z) {
                Cwg = getCnOrEnBtnText();
            }
        }
        if (z && !jlb.sUS(Cwg)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.vG.getLayoutParams();
            layoutParams.bottomMargin = Pj.icD(this.yiw.jhZ, 4.0f);
            this.vG.setLayoutParams(layoutParams);
        }
        return Cwg;
    }

    private String getCnOrEnBtnText() {
        return this.yiw.icD.jhZ() != 4 ? "View" : "Install";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(final int i, final String str, final String str2) {
        com.bytedance.sdk.openadsdk.icD.vG.pvs(new com.bytedance.sdk.component.so.so("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFDownloadBarLayout.3
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("description", i + ":" + str);
                    jSONObject.put(ImagesContract.URL, str2);
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.icD.vG.icD(RFDownloadBarLayout.this.yiw.icD, RFDownloadBarLayout.this.yiw.NB, "load_vast_icon_fail", jSONObject);
            }
        });
    }

    public void icD() {
        com.bytedance.sdk.openadsdk.core.icD.NB NB = this.yiw.Gp.NB();
        final com.bytedance.sdk.openadsdk.core.icD.icD Jd = this.yiw.Gp.Jd();
        final cR cRVar = this.yiw.icD;
        if (cRVar.gA() == null) {
            return;
        }
        if (cRVar.ae() != 5 && this.vG != null) {
            if (cRVar.gA().NB) {
                this.vG.setOnClickListener(NB);
                this.vG.setOnTouchListener(NB);
            } else {
                this.vG.setOnClickListener(Jd);
            }
        }
        if (cRVar.ae() == 1) {
            if (cRVar.gA().pvs) {
                Pj.pvs((View) this, (View.OnClickListener) NB, "TTBaseVideoActivity#mRlDownloadBar");
                Pj.pvs((View) this, (View.OnTouchListener) NB, "TTBaseVideoActivity#mRlDownloadBar");
                this.NB.setOnClickListener(NB);
                this.NB.setOnTouchListener(NB);
                this.icD.setOnClickListener(NB);
                this.icD.setOnTouchListener(NB);
                this.pvs.setOnClickListener(NB);
                this.pvs.setOnTouchListener(NB);
                this.Jd.setOnClickListener(NB);
                this.Jd.setOnTouchListener(NB);
                return;
            }
            Pj.pvs((View) this, (View.OnClickListener) Jd, "TTBaseVideoActivity#mRlDownloadBar");
            this.NB.setOnClickListener(Jd);
            this.icD.setOnClickListener(Jd);
            this.pvs.setOnClickListener(Jd);
            this.Jd.setOnClickListener(Jd);
            return;
        }
        if (cRVar.ae() == 5) {
            String str = "VAST_ICON";
            if (cRVar.gA().NB) {
                yiw yiwVar = new yiw("VAST_ACTION_BUTTON", cRVar.ig(), NB) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFDownloadBarLayout.4
                };
                yiw yiwVar2 = new yiw(str, cRVar.ig(), NB) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFDownloadBarLayout.5
                };
                TextView textView = this.vG;
                if (textView != null) {
                    textView.setOnClickListener(yiwVar);
                    this.vG.setOnTouchListener(yiwVar);
                }
                TTRoundRectImageView tTRoundRectImageView = this.Jd;
                if (tTRoundRectImageView != null) {
                    tTRoundRectImageView.setOnClickListener(yiwVar2);
                    this.Jd.setOnTouchListener(yiwVar2);
                }
                TextView textView2 = this.NB;
                if (textView2 != null && !TextUtils.isEmpty(textView2.getText())) {
                    this.NB.setOnClickListener(yiwVar);
                    this.NB.setOnTouchListener(yiwVar);
                }
                TextView textView3 = this.so;
                if (textView3 == null || TextUtils.isEmpty(textView3.getText())) {
                    return;
                }
                this.so.setOnClickListener(yiwVar);
                this.so.setOnTouchListener(yiwVar);
                return;
            }
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFDownloadBarLayout.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    View.OnClickListener onClickListener2 = Jd;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                    }
                    if (view != null && "VAST_ICON".equals(view.getTag(570425345))) {
                        if (cRVar.ig() == null || cRVar.ig().icD() == null) {
                            return;
                        }
                        cRVar.ig().icD().pvs(RFDownloadBarLayout.this.yiw.ny.yiw());
                        return;
                    }
                    if (cRVar.ig() != null) {
                        cRVar.ig().pvs().yiw(RFDownloadBarLayout.this.yiw.ny.yiw());
                    }
                }
            };
            TextView textView4 = this.vG;
            if (textView4 != null) {
                textView4.setOnClickListener(onClickListener);
            }
            TextView textView5 = this.NB;
            if (textView5 != null && !TextUtils.isEmpty(textView5.getText())) {
                this.NB.setOnClickListener(onClickListener);
            }
            TextView textView6 = this.so;
            if (textView6 != null && !TextUtils.isEmpty(textView6.getText())) {
                this.so.setOnClickListener(onClickListener);
            }
            TTRoundRectImageView tTRoundRectImageView2 = this.Jd;
            if (tTRoundRectImageView2 != null) {
                tTRoundRectImageView2.setTag(570425345, "VAST_ICON");
                this.Jd.setOnClickListener(Jd);
                return;
            }
            return;
        }
        if (cRVar.gA().vG) {
            Pj.pvs((View) this, (View.OnClickListener) NB, "TTBaseVideoActivity#mRlDownloadBar");
            Pj.pvs((View) this, (View.OnTouchListener) NB, "TTBaseVideoActivity#mRlDownloadBar");
        } else {
            Pj.pvs((View) this, (View.OnClickListener) Jd, "TTBaseVideoActivity#mRlDownloadBar");
        }
    }

    private void Jd() {
        Context context = getContext();
        TTRoundRectImageView pvs = pvs(context);
        this.Jd = pvs;
        addView(pvs);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams.addRule(1, kj.icD);
        layoutParams.addRule(17, kj.icD);
        addView(pAGLinearLayout, layoutParams);
        TextView icD = icD(context);
        this.NB = icD;
        icD.setMaxWidth(Pj.icD(context, 176.0f));
        pAGLinearLayout.addView(this.NB);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        pAGLinearLayout2.setGravity(16);
        pAGLinearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = Pj.icD(context, 14.0f);
        layoutParams2.topMargin = Pj.icD(context, 10.0f);
        pAGLinearLayout.addView(pAGLinearLayout2, layoutParams2);
        TTRatingBar2 pvs2 = pvs(context, 17);
        this.pvs = pvs2;
        pAGLinearLayout2.addView(pvs2);
        TextView vG = vG(context);
        this.icD = vG;
        pAGLinearLayout2.addView(vG);
    }

    private void NB() {
        Context context = getContext();
        TTRoundRectImageView pvs = pvs(context);
        this.Jd = pvs;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) pvs.getLayoutParams();
        int icD = Pj.icD(context, 52.0f);
        layoutParams.height = icD;
        layoutParams.width = icD;
        addView(this.Jd);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setGravity(17);
        pAGLinearLayout.setId(kj.sUS);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(Pj.icD(context, 100.0f), Pj.icD(context, 45.0f));
        layoutParams2.addRule(11);
        layoutParams2.addRule(21);
        layoutParams2.addRule(15);
        layoutParams2.rightMargin = Pj.icD(context, 15.0f);
        addView(pAGLinearLayout, layoutParams2);
        this.vG = Jd(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, Pj.icD(context, 41.0f));
        layoutParams3.bottomMargin = Pj.icD(context, 3.0f);
        pAGLinearLayout.addView(this.vG, layoutParams3);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        pAGLinearLayout2.setGravity(16);
        pAGLinearLayout2.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams4.addRule(0, kj.sUS);
        layoutParams4.addRule(1, kj.icD);
        addView(pAGLinearLayout2, layoutParams4);
        TextView icD2 = icD(context);
        this.NB = icD2;
        icD2.setTextColor(Color.parseColor("#222222"));
        this.NB.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) this.NB.getLayoutParams();
        layoutParams5.width = -1;
        layoutParams5.height = Pj.icD(context, 22.0f);
        layoutParams5.leftMargin = Pj.icD(context, 10.0f);
        pAGLinearLayout2.addView(this.NB);
        PAGTextView pAGTextView = new PAGTextView(context);
        this.so = pAGTextView;
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.so.setSingleLine(true);
        this.so.setTextColor(Color.parseColor("#4A4A4A"));
        this.so.setTextSize(2, 14.0f);
        this.so.setId(kj.yiw);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, Pj.icD(context, 16.0f));
        layoutParams6.leftMargin = Pj.icD(context, 10.0f);
        layoutParams6.topMargin = Pj.icD(context, 5.0f);
        pAGLinearLayout2.addView(this.so, layoutParams6);
    }

    private void sUS() {
        Context context = getContext();
        TTRoundRectImageView pvs = pvs(context);
        this.Jd = pvs;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) pvs.getLayoutParams();
        int icD = Pj.icD(context, 52.0f);
        layoutParams.height = icD;
        layoutParams.width = icD;
        addView(this.Jd);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setId(kj.sUS);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(Pj.icD(context, 76.0f), Pj.icD(context, 45.0f));
        layoutParams2.addRule(11);
        layoutParams2.addRule(21);
        layoutParams2.addRule(15);
        layoutParams2.rightMargin = Pj.icD(context, 15.0f);
        int[] iArr = {Color.parseColor("#0070FF")};
        com.bytedance.sdk.openadsdk.core.widget.vG.pvs(pAGLinearLayout, new vG.pvs().pvs(iArr[0]).icD(Color.parseColor("#80000000")).pvs(iArr).vG(Pj.icD(context, 17.0f)).Jd(0).NB(Pj.icD(context, 3.0f)));
        addView(pAGLinearLayout, layoutParams2);
        this.vG = Jd(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams3.bottomMargin = Pj.icD(context, 3.0f);
        pAGLinearLayout.addView(this.vG, layoutParams3);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        pAGLinearLayout2.setGravity(16);
        pAGLinearLayout2.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams4.addRule(16, kj.sUS);
        layoutParams4.addRule(0, kj.sUS);
        layoutParams4.addRule(1, kj.icD);
        layoutParams4.addRule(17, kj.icD);
        addView(pAGLinearLayout2, layoutParams4);
        TextView icD2 = icD(context);
        this.NB = icD2;
        icD2.setTextColor(Color.parseColor("#222222"));
        this.NB.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) this.NB.getLayoutParams();
        layoutParams5.width = -1;
        layoutParams5.height = Pj.icD(context, 22.0f);
        layoutParams5.leftMargin = Pj.icD(context, 10.0f);
        pAGLinearLayout2.addView(this.NB);
        PAGLinearLayout pAGLinearLayout3 = new PAGLinearLayout(context);
        pAGLinearLayout3.setGravity(16);
        pAGLinearLayout3.setOrientation(0);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.leftMargin = Pj.icD(context, 14.0f);
        layoutParams6.topMargin = Pj.icD(context, 5.0f);
        pAGLinearLayout2.addView(pAGLinearLayout3, layoutParams6);
        TTRatingBar2 pvs2 = pvs(context, -1);
        this.pvs = pvs2;
        ((LinearLayout.LayoutParams) pvs2.getLayoutParams()).height = Pj.icD(context, 12.0f);
        pAGLinearLayout3.addView(this.pvs);
        TextView vG = vG(context);
        this.icD = vG;
        vG.setTextColor(Color.parseColor("#4A4A4A"));
        this.icD.setTextSize(2, 14.0f);
        this.icD.setMaxWidth(Pj.icD(context, 83.0f));
        ((LinearLayout.LayoutParams) this.icD.getLayoutParams()).height = Pj.icD(context, 20.0f);
        pAGLinearLayout3.addView(this.icD);
    }

    private void yiw() {
        Context context = getContext();
        TTRoundRectImageView pvs = pvs(context);
        this.Jd = pvs;
        addView(pvs);
        TextView Jd = Jd(context);
        this.vG = Jd;
        Jd.setBackground(so.pvs(context, "tt_download_corner_bg"));
        this.vG.setMaxWidth(Pj.icD(context, 105.0f));
        this.vG.setText(uc.icD(context, "tt_video_download_apk"));
        this.vG.setTextSize(2, 17.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, Pj.icD(context, 36.0f));
        layoutParams.addRule(21);
        layoutParams.addRule(11);
        layoutParams.addRule(15);
        layoutParams.rightMargin = Pj.icD(context, 15.0f);
        addView(this.vG, layoutParams);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setGravity(16);
        pAGLinearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams2.addRule(0, this.vG.getId());
        layoutParams2.addRule(16, this.vG.getId());
        layoutParams2.addRule(1, this.Jd.getId());
        layoutParams2.addRule(17, this.Jd.getId());
        addView(pAGLinearLayout, layoutParams2);
        TextView icD = icD(context);
        this.NB = icD;
        icD.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        pAGLinearLayout.addView(this.NB);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = Pj.icD(context, 14.0f);
        layoutParams3.topMargin = Pj.icD(context, 5.0f);
        pAGLinearLayout.addView(pAGLinearLayout2, layoutParams3);
        pAGLinearLayout2.setGravity(16);
        pAGLinearLayout2.setOrientation(0);
        TTRatingBar2 pvs2 = pvs(context, 17);
        this.pvs = pvs2;
        pAGLinearLayout2.addView(pvs2);
        TextView vG = vG(context);
        this.icD = vG;
        vG.setTextColor(Color.parseColor("#4A4A4A"));
        this.icD.setTextSize(2, 11.0f);
        pAGLinearLayout2.addView(this.icD);
    }
}
