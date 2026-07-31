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
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.adexpress.fs.rt;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.zmn.cyb;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.cn;
import com.bytedance.sdk.openadsdk.core.model.iqz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class rc {
    ImageView btk;
    View bvs;
    public iqz cyb;
    private boolean doe;
    final nqi fb;
    final Activity fs;
    ImageView hhw;
    private final String iqz;
    PAGLogoView iv;
    RelativeLayout klz;
    private final boolean kw;
    cyb mw;
    FrameLayout nps;
    private fb nqi;
    com.bytedance.sdk.openadsdk.core.hhw.hhw olo;
    private int phc;
    ImageView rc;

    @Nullable
    private com.bytedance.sdk.openadsdk.core.widget.rc uqh;
    View zg;
    protected final com.bytedance.sdk.openadsdk.component.reward.zmn.fs zn;
    int zmn = 3;
    protected int rt = 0;
    protected final AtomicBoolean cn = new AtomicBoolean(false);
    Runnable kgc = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.rc.2
        @Override // java.lang.Runnable
        public void run() {
            ImageView imageView;
            try {
                nqi nqiVar = rc.this.fb;
                if ((nqiVar == null || !nqiVar.wir()) && (imageView = rc.this.btk) != null) {
                    int[] iArr = new int[2];
                    imageView.getLocationOnScreen(iArr);
                    rc.this.zn.ev.zmn(iArr[0]);
                }
            } catch (Exception unused) {
            }
        }
    };

    protected boolean zmn() {
        return true;
    }

    public rc(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        this.zn = fsVar;
        this.fs = fsVar.nu;
        this.fb = fsVar.fs;
        this.iqz = fsVar.btk;
        this.kw = fsVar.fb;
    }

    public void fs() {
        if (this.doe) {
            return;
        }
        this.doe = true;
        this.phc = this.zn.kra;
        if (zmn()) {
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.zn;
            if (!fsVar.ve) {
                cyb cybVar = new cyb(fsVar);
                this.mw = cybVar;
                cybVar.zmn();
            }
        }
        kw();
        Activity activity = this.fs;
        nqi nqiVar = this.fb;
        String str = this.iqz;
        FrameLayout frameLayout = this.nps;
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.zn;
        iqz iqzVar = new iqz(activity, nqiVar, str, frameLayout, fsVar2.ww, fsVar2.hgd);
        this.cyb = iqzVar;
        iqzVar.zmn();
    }

    private void kw() {
        RelativeLayout relativeLayout;
        fb fbVar = (fb) this.zn.hgd.findViewById(olo.rt);
        this.nqi = fbVar;
        fbVar.zmn(this.zn);
        com.bytedance.sdk.openadsdk.core.widget.rc rcVar = (com.bytedance.sdk.openadsdk.core.widget.rc) this.zn.hgd.findViewById(olo.rsi);
        this.uqh = rcVar;
        if (rcVar != null) {
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.zn;
            rcVar.zmn(fsVar.fs, fsVar.btk, null);
        }
        this.iv = (PAGLogoView) this.zn.hgd.findViewById(520093757);
        this.rc = (ImageView) this.zn.hgd.findViewById(olo.ba);
        this.btk = (ImageView) this.zn.hgd.findViewById(520093708);
        this.hhw = (ImageView) this.zn.hgd.findViewById(olo.efd);
        this.nps = (FrameLayout) this.zn.hgd.findViewById(olo.mw);
        this.zg = this.zn.hgd.findViewById(olo.kgc);
        this.bvs = this.zn.hgd.findViewById(olo.hip);
        this.klz = (RelativeLayout) this.zn.hgd.findViewById(olo.ioo);
        cyb cybVar = this.mw;
        if (cybVar == null || cybVar.hhw() == null || (relativeLayout = this.klz) == null) {
            return;
        }
        relativeLayout.addView(this.mw.hhw(), new LinearLayout.LayoutParams(-1, -1));
        this.mw.zn();
    }

    public void zn() {
        this.nps.removeAllViews();
    }

    public void zmn(boolean z) {
        jy.zmn((View) this.iv, am.zn(this.fb) ? 8 : 0);
        jy.zmn((View) this.rc, (this.fb.ch() && this.fb.nqi()) ? 0 : 8);
        fs(z);
        if (this.kw) {
            btk();
        }
    }

    public void zmn(int i) {
        if (this.olo == null) {
            this.olo = new com.bytedance.sdk.openadsdk.core.hhw.hhw(this.zn.nu);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(120, 120);
            layoutParams.gravity = 17;
            this.olo.setLayoutParams(layoutParams);
            this.olo.setIndeterminateDrawable(com.bytedance.sdk.openadsdk.utils.rc.zmn(this.zn.nu, "tt_video_loading_progress_bar"));
            this.zn.fkt.hhw().addView(this.olo);
        }
        this.olo.setVisibility(i);
    }

    public void zmn(int i, int i2) {
        FrameLayout frameLayout;
        if (this.fb.es() == 1 && (frameLayout = this.nps) != null && (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            int zn = jy.zn((Context) this.fs);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.nps.getLayoutParams();
            layoutParams.width = zn;
            int i3 = (zn * 9) / 16;
            layoutParams.height = i3;
            this.nps.setLayoutParams(layoutParams);
            this.rt = (jy.btk(this.fs) - i3) / 2;
        }
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.zn.zn znVar, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        View view;
        View view2;
        nqi nqiVar;
        if (this.nps != null && (nqiVar = this.fb) != null && nqiVar.hsp() != null) {
            if (this.fb.hsp().hhw && !iqz.fs(this.fb)) {
                zmn((View.OnClickListener) znVar);
                zmn(znVar);
            } else {
                zmn(onClickListener);
            }
        }
        nqi nqiVar2 = this.fb;
        if (nqiVar2 != null && nqiVar2.es() == 1) {
            if (this.fb.hsp() != null && (view2 = this.zg) != null) {
                jy.zmn(view2, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.zg.getLayoutParams();
                layoutParams.height = this.rt;
                this.zg.setLayoutParams(layoutParams);
                if (this.fb.hsp().fs) {
                    this.zg.setOnClickListener(znVar);
                    this.zg.setOnTouchListener(onTouchListener);
                } else {
                    this.zg.setOnClickListener(onClickListener);
                }
            }
            if (this.fb.hsp() != null && (view = this.bvs) != null) {
                jy.zmn(view, 0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.bvs.getLayoutParams();
                layoutParams2.height = this.rt;
                this.bvs.setLayoutParams(layoutParams2);
                if (this.fb.hsp().fb) {
                    this.bvs.setOnClickListener(znVar);
                    this.bvs.setOnTouchListener(onTouchListener);
                } else {
                    this.bvs.setOnClickListener(onClickListener);
                }
            }
        }
        PAGLogoView pAGLogoView = this.iv;
        if (pAGLogoView != null) {
            pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.rc.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/view/rc$1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view3);
                    safedk_rc$1_onClick_78c5f9bc0dc6dd419dc53e79e25cc0cc(view3);
                }

                public void safedk_rc$1_onClick_78c5f9bc0dc6dd419dc53e79e25cc0cc(View p0) {
                    try {
                        if (com.bytedance.sdk.openadsdk.utils.fs.btk() && kgc.fb().am()) {
                            rc rcVar = rc.this;
                            IABLandingPageActivity.zmn(rcVar.fs, rcVar.fb, rcVar.iqz);
                        } else {
                            rc rcVar2 = rc.this;
                            TTWebsiteActivity.zmn(rcVar2.fs, rcVar2.fb, rcVar2.iqz);
                        }
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.iqz.zn("TTAD.RFullVideoLayout", th.getMessage());
                    }
                }
            });
        }
        ImageView imageView = this.rc;
        if (imageView != null) {
            imageView.setClickable(true);
            com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn((int) jy.zmn(kgc.zmn(), 14.0f, true), this.rc, this.zn.fs);
        }
    }

    public void fb() {
        if (this.zn.fs.sv() && am.zn(this.zn.fs)) {
            return;
        }
        jy.zmn((View) this.nps, 8);
        jy.zmn((View) this.uqh, 8);
        jy.zmn(this.zg, 8);
        jy.zmn(this.bvs, 8);
        fs(8);
        jy.zmn((View) this.btk, 8);
        jy.zmn((View) this.hhw, 8);
        jy.zmn((View) this.iv, 8);
        jy.zmn((View) this.klz, 8);
        jy.zmn((View) this.rc, 8);
    }

    void btk() {
        int uw = this.fb.uw();
        this.zmn = uw;
        if (uw == -200) {
            this.zmn = kgc.fb().cyb(String.valueOf(this.fb.qvo()));
        }
        if (this.zmn != -1 || zmn()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar = this.zn.f3739io;
        if ((fsVar instanceof com.bytedance.sdk.openadsdk.component.reward.fs.fb) || (fsVar instanceof com.bytedance.sdk.openadsdk.component.reward.fs.zn)) {
            return;
        }
        fs(0);
    }

    void fs(boolean z) {
        int zmn;
        int zmn2;
        if (this.phc != 1 && z) {
            ImageView imageView = this.btk;
            ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
            ImageView imageView2 = this.hhw;
            ViewGroup.LayoutParams layoutParams2 = imageView2 != null ? imageView2.getLayoutParams() : null;
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (zmn2 = zmn("navigation_bar_height")) > 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (zmn2 > marginLayoutParams.rightMargin) {
                    marginLayoutParams.rightMargin = zmn2;
                }
            }
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (zmn = zmn("navigation_bar_height")) > 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (zmn > marginLayoutParams2.rightMargin) {
                    marginLayoutParams2.rightMargin = zmn;
                }
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar = this.zn.f3739io;
        if ((fsVar instanceof com.bytedance.sdk.openadsdk.component.reward.fs.fb) || (fsVar instanceof com.bytedance.sdk.openadsdk.component.reward.fs.zn)) {
            return;
        }
        fs(0);
    }

    private int zmn(String str) {
        Resources resources = this.fs.getResources();
        if (resources != null) {
            return resources.getDimensionPixelSize(resources.getIdentifier(str, "dimen", "android"));
        }
        return 0;
    }

    public void fs(int i) {
        nqi nqiVar = this.fb;
        if (nqiVar != null && nqiVar.ch() && cn.zmn(this.fb)) {
            jy.zmn((View) this.nqi, 8);
        } else {
            jy.zmn((View) this.nqi, i);
        }
    }

    public void zn(int i) {
        nqi nqiVar = this.fb;
        if (nqiVar != null && nqiVar.sv() && am.zn(this.fb)) {
            jy.zmn((View) this.uqh, i);
        }
    }

    public FrameLayout hhw() {
        return this.nps;
    }

    public void fb(int i) {
        jy.zmn((View) this.iv, i);
    }

    public void nps() {
        if (this.rc.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.rc.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 11, 16);
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(11);
            this.rc.setLayoutParams(marginLayoutParams);
        }
    }

    public void btk(int i) {
        int i2 = this.zmn;
        if (i2 == -1 || i != i2 || this.cn.get()) {
            return;
        }
        fs(0);
        this.cn.set(true);
        zg();
    }

    protected void zg() {
        fb fbVar = this.nqi;
        if (fbVar == null) {
            return;
        }
        fbVar.zmn();
    }

    public void hhw(int i) {
        jy.zmn((View) this.btk, i);
    }

    public boolean bvs() {
        ImageView imageView = this.btk;
        return imageView != null && imageView.getVisibility() == 0;
    }

    public void zmn(View.OnClickListener onClickListener) {
        jy.zmn(this.nps, onClickListener, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    private void zmn(com.bytedance.sdk.openadsdk.core.zn.zn znVar) {
        jy.zmn((View) this.nps, (View.OnTouchListener) znVar, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    public View iv() {
        return this.btk;
    }

    public View rc() {
        return this.hhw;
    }

    public View klz() {
        return this.nqi;
    }

    public void zmn(float f) {
        jy.zmn(this.btk, f);
    }

    public void zmn(Animation animation) {
        RelativeLayout relativeLayout = this.klz;
        if (relativeLayout != null) {
            relativeLayout.startAnimation(animation);
        }
    }

    public void mw() {
        try {
            cyb cybVar = this.mw;
            if (cybVar != null) {
                cybVar.fb();
            }
            RelativeLayout relativeLayout = this.klz;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
        } catch (Throwable unused) {
            RelativeLayout relativeLayout2 = this.klz;
            if (relativeLayout2 != null) {
                relativeLayout2.setAlpha(0.0f);
            }
        }
    }

    public void rt() {
        try {
            Activity activity = this.zn.nu;
            Animation loadAnimation = AnimationUtils.loadAnimation(activity, doe.bvs(activity, "tt_fade_out"));
            if (loadAnimation != null) {
                loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.rc.3
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        rc.this.zn.fkt.mw();
                    }
                });
                this.zn.fkt.zmn(loadAnimation);
            } else {
                this.zn.fkt.mw();
            }
        } catch (Throwable unused) {
            this.zn.fkt.mw();
        }
    }

    public void cn() {
        iqz iqzVar = this.cyb;
        if (iqzVar != null) {
            iqzVar.hhw();
        }
        ImageView imageView = this.btk;
        if (imageView != null) {
            imageView.removeCallbacks(this.kgc);
        }
    }

    public void cyb() {
        iqz iqzVar = this.cyb;
        if (iqzVar != null) {
            iqzVar.nps();
        }
    }

    public void olo() {
        iqz iqzVar = this.cyb;
        if (iqzVar != null) {
            iqzVar.zg();
        }
    }

    public void zmn(int i, rt rtVar) {
        iqz iqzVar = this.cyb;
        if (iqzVar != null) {
            iqzVar.zmn(i, rtVar);
        }
    }

    public void kgc() {
        com.bytedance.sdk.openadsdk.core.zn.btk btk = this.zn.rp.btk();
        View view = this.nqi;
        if (view == null) {
            view = this.zn.hgd;
        }
        btk.onClick(view);
    }
}
