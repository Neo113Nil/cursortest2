package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.pvs.Ju;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.mnm;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;
import com.bytedance.sdk.openadsdk.utils.so;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: RewardFullVideoLayout.java */
/* loaded from: classes2.dex */
public class NB {
    final cR Jd;
    PAGLogoView Mxy;
    ImageView NB;
    private RFDownloadBarLayout OT;
    ImageView Wyp;
    public mnm bNS;
    private final boolean cR;
    final Activity icD;
    Ju kj;
    PAGProgressBar mnm;
    RelativeLayout qh;
    private boolean rCZ;
    FrameLayout sUS;
    View so;
    private int uc;
    protected final com.bytedance.sdk.openadsdk.component.reward.pvs.pvs vG;
    View yiw;
    private final String zM;
    int pvs = 3;
    protected int Ju = 0;
    protected final AtomicBoolean IP = new AtomicBoolean(false);
    Runnable vA = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.NB.2
        @Override // java.lang.Runnable
        public void run() {
            try {
                if ((NB.this.Jd == null || !NB.this.Jd.OBt()) && NB.this.NB != null) {
                    int[] iArr = new int[2];
                    NB.this.NB.getLocationOnScreen(iArr);
                    NB.this.vG.cRf.icD(iArr[0]);
                }
            } catch (Exception unused) {
            }
        }
    };

    protected boolean pvs() {
        return true;
    }

    public NB(com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar) {
        this.vG = pvsVar;
        this.icD = pvsVar.od;
        this.Jd = pvsVar.icD;
        this.zM = pvsVar.NB;
        this.cR = pvsVar.Jd;
    }

    public void icD() {
        if (this.rCZ) {
            return;
        }
        this.rCZ = true;
        this.uc = this.vG.cnN;
        if (pvs()) {
            Ju ju = new Ju(this.vG);
            this.kj = ju;
            ju.pvs();
        }
        cR();
        mnm mnmVar = new mnm(this.icD, this.Jd, this.zM, this.sUS, this.vG.OhP, this.vG.qD);
        this.bNS = mnmVar;
        mnmVar.pvs();
    }

    private void cR() {
        RelativeLayout relativeLayout;
        RFDownloadBarLayout rFDownloadBarLayout = (RFDownloadBarLayout) this.vG.qD.findViewById(kj.kj);
        this.OT = rFDownloadBarLayout;
        rFDownloadBarLayout.pvs(this.vG);
        this.Mxy = (PAGLogoView) this.vG.qD.findViewById(520093757);
        this.Wyp = (ImageView) this.vG.qD.findViewById(kj.Yjw);
        this.NB = (ImageView) this.vG.qD.findViewById(520093708);
        this.sUS = (FrameLayout) this.vG.qD.findViewById(kj.qh);
        this.yiw = this.vG.qD.findViewById(kj.vA);
        this.so = this.vG.qD.findViewById(kj.wjr);
        this.qh = (RelativeLayout) this.vG.qD.findViewById(kj.Sn);
        Ju ju = this.kj;
        if (ju == null || ju.Jd() == null || (relativeLayout = this.qh) == null) {
            return;
        }
        relativeLayout.addView(this.kj.Jd(), new LinearLayout.LayoutParams(-1, -1));
        this.kj.icD();
    }

    public void vG() {
        this.sUS.removeAllViews();
    }

    public void pvs(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.Mxy.getLayoutParams();
        marginLayoutParams.setMargins(16, 0, 0, i);
        this.Mxy.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.Wyp.getLayoutParams();
        marginLayoutParams2.setMargins(0, 0, 7, i);
        marginLayoutParams2.setMarginStart(0);
        marginLayoutParams2.setMarginEnd(7);
        this.Wyp.setLayoutParams(marginLayoutParams2);
    }

    public void pvs(boolean z) {
        int i = 8;
        Pj.pvs((View) this.Mxy, rCZ.qh(this.Jd) ? 8 : 0);
        ImageView imageView = this.Wyp;
        if (this.Jd.SJ() && this.Jd.so()) {
            i = 0;
        }
        Pj.pvs((View) imageView, i);
        icD(z);
        if (this.cR) {
            NB();
        }
    }

    public void icD(int i) {
        if (this.mnm == null) {
            this.mnm = new PAGProgressBar(this.vG.od);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(120, 120);
            layoutParams.gravity = 17;
            this.mnm.setLayoutParams(layoutParams);
            this.mnm.setIndeterminateDrawable(so.pvs(this.vG.od, "tt_video_loading_progress_bar"));
            this.vG.gSd.sUS().addView(this.mnm);
        }
        this.mnm.setVisibility(i);
    }

    public void pvs(int i, int i2) {
        FrameLayout frameLayout;
        if (this.Jd.ae() == 1 && (frameLayout = this.sUS) != null && (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            int vG = Pj.vG((Context) this.icD);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.sUS.getLayoutParams();
            layoutParams.width = vG;
            int i3 = (vG * 9) / 16;
            layoutParams.height = i3;
            this.sUS.setLayoutParams(layoutParams);
            this.Ju = (Pj.Jd((Context) this.icD) - i3) / 2;
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.RFullVideoLayout", "NonContentAreaHeight:" + this.Ju);
        }
    }

    public void pvs(com.bytedance.sdk.openadsdk.core.icD.vG vGVar, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        View view;
        View view2;
        cR cRVar;
        if (this.sUS != null && (cRVar = this.Jd) != null && cRVar.gA() != null) {
            if (this.Jd.gA().sUS && !mnm.icD(this.Jd)) {
                pvs((View.OnClickListener) vGVar);
                pvs(vGVar);
            } else {
                pvs(onClickListener);
            }
        }
        cR cRVar2 = this.Jd;
        if (cRVar2 != null && cRVar2.ae() == 1) {
            if (this.Jd.gA() != null && (view2 = this.yiw) != null) {
                Pj.pvs(view2, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.yiw.getLayoutParams();
                layoutParams.height = this.Ju;
                this.yiw.setLayoutParams(layoutParams);
                if (this.Jd.gA().icD) {
                    this.yiw.setOnClickListener(vGVar);
                    this.yiw.setOnTouchListener(onTouchListener);
                } else {
                    this.yiw.setOnClickListener(onClickListener);
                }
            }
            if (this.Jd.gA() != null && (view = this.so) != null) {
                Pj.pvs(view, 0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.so.getLayoutParams();
                layoutParams2.height = this.Ju;
                this.so.setLayoutParams(layoutParams2);
                if (this.Jd.gA().Jd) {
                    this.so.setOnClickListener(vGVar);
                    this.so.setOnTouchListener(onTouchListener);
                } else {
                    this.so.setOnClickListener(onClickListener);
                }
            }
        }
        PAGLogoView pAGLogoView = this.Mxy;
        if (pAGLogoView != null) {
            pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.NB.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    try {
                        TTWebsiteActivity.pvs(NB.this.icD, NB.this.Jd, NB.this.zM);
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.Ju.pvs("TTAD.RFullVideoLayout", th.getMessage());
                    }
                }
            });
        }
        ImageView imageView = this.Wyp;
        if (imageView != null) {
            imageView.setClickable(true);
            com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs((int) Pj.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs(), 14.0f, true), this.Wyp, this.vG.icD);
        }
    }

    public void Jd() {
        Pj.pvs((View) this.sUS, 8);
        Pj.pvs(this.yiw, 8);
        Pj.pvs(this.so, 8);
        vG(8);
        Pj.pvs((View) this.NB, 8);
        Pj.pvs((View) this.Mxy, 8);
        Pj.pvs((View) this.qh, 8);
        Pj.pvs((View) this.Wyp, 8);
    }

    void NB() {
        int dx = this.Jd.dx();
        this.pvs = dx;
        if (dx == -200) {
            this.pvs = com.bytedance.sdk.openadsdk.core.mnm.Jd().bNS(String.valueOf(this.Jd.yTz()));
        }
        if (this.pvs != -1 || pvs() || (this.vG.Zm instanceof com.bytedance.sdk.openadsdk.component.reward.icD.vG)) {
            return;
        }
        vG(0);
    }

    void icD(boolean z) {
        ImageView imageView;
        if (this.uc != 1 && (imageView = this.NB) != null && z) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                int pvs = pvs("status_bar_height");
                int pvs2 = pvs("navigation_bar_height");
                if (pvs > 0) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (pvs > marginLayoutParams.topMargin) {
                        marginLayoutParams.topMargin = pvs;
                        this.vG.cRf.pvs(pvs);
                    }
                }
                if (pvs2 > 0) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (pvs2 > marginLayoutParams2.rightMargin) {
                        marginLayoutParams2.rightMargin = pvs2;
                    }
                }
            }
        }
        if (this.vG.Zm instanceof com.bytedance.sdk.openadsdk.component.reward.icD.vG) {
            return;
        }
        vG(0);
    }

    private int pvs(String str) {
        Resources resources = this.icD.getResources();
        if (resources != null) {
            return resources.getDimensionPixelSize(resources.getIdentifier(str, "dimen", "android"));
        }
        return 0;
    }

    public void vG(int i) {
        cR cRVar = this.Jd;
        if (cRVar != null && cRVar.SJ() && com.bytedance.sdk.openadsdk.core.model.Ju.pvs(this.Jd)) {
            Pj.pvs((View) this.OT, 8);
        } else {
            Pj.pvs((View) this.OT, i);
        }
    }

    public FrameLayout sUS() {
        return this.sUS;
    }

    public void Jd(int i) {
        Pj.pvs((View) this.Mxy, i);
    }

    public void yiw() {
        if (this.Wyp.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.Wyp.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 11, 16);
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(11);
            this.Wyp.setLayoutParams(marginLayoutParams);
        }
    }

    public void NB(int i) {
        int i2 = this.pvs;
        if (i2 == -1 || i != i2 || this.IP.get()) {
            return;
        }
        vG(0);
        this.IP.set(true);
        so();
    }

    protected void so() {
        RFDownloadBarLayout rFDownloadBarLayout = this.OT;
        if (rFDownloadBarLayout == null) {
            return;
        }
        rFDownloadBarLayout.pvs();
    }

    public void sUS(int i) {
        ImageView imageView;
        Pj.pvs((View) this.NB, i);
        if (!com.bytedance.sdk.component.adexpress.Jd.icD.pvs(this.vG.jhZ) && (imageView = this.NB) != null) {
            imageView.post(this.vA);
        }
        if (i == 0 && !this.vG.Wyp.get() && rCZ.icD(this.vG.icD)) {
            com.bytedance.sdk.openadsdk.icD.vG.pvs(this.vG.icD, this.vG.NB, "show_close_button", (JSONObject) null, System.currentTimeMillis() - this.vG.neB);
        }
    }

    public boolean Mxy() {
        ImageView imageView = this.NB;
        return imageView != null && imageView.getVisibility() == 0;
    }

    public void pvs(View.OnClickListener onClickListener) {
        Pj.pvs(this.sUS, onClickListener, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    private void pvs(com.bytedance.sdk.openadsdk.core.icD.vG vGVar) {
        Pj.pvs((View) this.sUS, (View.OnTouchListener) vGVar, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    public View Wyp() {
        return this.NB;
    }

    public View qh() {
        return this.OT;
    }

    public void pvs(float f) {
        Pj.pvs(this.NB, f);
    }

    public void pvs(Animation animation) {
        RelativeLayout relativeLayout = this.qh;
        if (relativeLayout != null) {
            relativeLayout.startAnimation(animation);
        }
    }

    public void kj() {
        try {
            Ju ju = this.kj;
            if (ju != null) {
                ju.vG();
            }
            RelativeLayout relativeLayout = this.qh;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
        } catch (Throwable unused) {
            RelativeLayout relativeLayout2 = this.qh;
            if (relativeLayout2 != null) {
                relativeLayout2.setAlpha(0.0f);
            }
        }
    }

    public void Ju() {
        try {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.vG.od, uc.Wyp(this.vG.od, "tt_fade_out"));
            if (loadAnimation != null) {
                loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.NB.3
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        NB.this.vG.gSd.kj();
                    }
                });
                this.vG.gSd.pvs(loadAnimation);
            } else {
                this.vG.gSd.kj();
            }
        } catch (Throwable unused) {
            this.vG.gSd.kj();
        }
    }

    public void IP() {
        mnm mnmVar = this.bNS;
        if (mnmVar != null) {
            mnmVar.NB();
        }
        ImageView imageView = this.NB;
        if (imageView != null) {
            imageView.removeCallbacks(this.vA);
        }
    }

    public void bNS() {
        mnm mnmVar = this.bNS;
        if (mnmVar != null) {
            mnmVar.sUS();
        }
    }

    public void mnm() {
        mnm mnmVar = this.bNS;
        if (mnmVar != null) {
            mnmVar.yiw();
        }
    }

    public void vA() {
        com.bytedance.sdk.openadsdk.core.icD.NB NB = this.vG.Gp.NB();
        View view = this.OT;
        if (view == null) {
            view = this.vG.qD;
        }
        NB.onClick(view);
    }
}
