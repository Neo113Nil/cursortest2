package com.bytedance.sdk.openadsdk.core.fb;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.fb.nps;
import com.bytedance.sdk.openadsdk.core.iv;
import com.bytedance.sdk.openadsdk.core.iv.phc;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.zg;
import com.bytedance.sdk.openadsdk.core.zn.fs;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.kjb;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.bytedance.sdk.openadsdk.utils.vlj;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class zmn {
    private PAGBannerAdWrapperListener btk;
    private boolean bvs;
    private nqi fb;
    protected AdSlot fs;
    private final Context hhw;
    private com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn iv;
    private nps klz;
    private long kw;
    private phc rc;
    private boolean rt;
    private final boolean zg;
    protected fb zmn;
    private String zn = "banner_ad";
    private long nps = 0;
    private final AtomicBoolean mw = new AtomicBoolean(false);
    private final int cn = 1;
    private final int cyb = 0;
    private int olo = -1;
    private final View.OnAttachStateChangeListener kgc = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.fb.zmn.1
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (zmn.this.olo == 0 || zmn.this.bvs) {
                return;
            }
            zmn zmnVar = zmn.this;
            zmnVar.zmn(zmnVar.zmn.getCurView(), zmn.this.fb);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (zmn.this.rt) {
                zmn.this.olo = 0;
            } else {
                zmn.this.hhw();
            }
        }
    };

    public zmn(Context context, nqi nqiVar, AdSlot adSlot, nps npsVar, boolean z) {
        this.rt = false;
        this.hhw = context;
        this.fb = nqiVar;
        this.fs = adSlot;
        this.klz = npsVar;
        this.rt = z;
        zmn(context, nqiVar, adSlot);
        this.zg = false;
        this.bvs = false;
    }

    public void zmn(int i) {
        fb fbVar = this.zmn;
        if (fbVar != null) {
            fbVar.setCurrentIndex(i);
        }
    }

    public void zmn(PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        zg zgVar = new zg(pAGBannerAdInteractionCallback);
        this.btk = zgVar;
        this.zmn.setExpressInteractionListener(zgVar);
    }

    public void zmn(PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        zg zgVar = new zg(pAGBannerAdInteractionListener);
        this.btk = zgVar;
        this.zmn.setExpressInteractionListener(zgVar);
    }

    public View zmn() {
        com.bytedance.sdk.openadsdk.utils.fs.zmn(this.fb);
        IPBroadcastReceiver.fs(this.hhw, this.fb);
        return this.zmn;
    }

    private void zmn(Context context, nqi nqiVar, AdSlot adSlot) {
        if (nqiVar.mrt() != null) {
            zn znVar = new zn(context, nqiVar, adSlot, this.rt);
            this.zmn = znVar;
            znVar.addOnAttachStateChangeListener(this.kgc);
        } else {
            fb fbVar = new fb(context, nqiVar, adSlot, this.rt);
            this.zmn = fbVar;
            fbVar.addOnAttachStateChangeListener(this.kgc);
        }
    }

    public boolean fs() {
        return this.zmn instanceof zn;
    }

    public com.bytedance.sdk.openadsdk.kw.zn.zmn zn() {
        fb fbVar = this.zmn;
        if (fbVar instanceof zn) {
            return ((zn) fbVar).getVideoModel();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(boolean z, nqi nqiVar) {
        if (z && this.fb.dv() && !this.fb.kjb()) {
            this.fb.nps(true);
            nqi nqiVar2 = this.fb;
            com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar2, this.zn, nqiVar2.rfd());
        }
        nu.fs(new C0158zmn(z, nqiVar, this), 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iv() {
        klz();
    }

    public void fb() {
        fs(this.fb);
        this.nps = 0L;
    }

    public void btk() {
        this.nps = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(View view, phc phcVar, nqi nqiVar, String str, nps.zmn zmnVar) {
        iv.fs().zmn(str, zmnVar);
        this.nps = System.currentTimeMillis();
        try {
            JSONObject jSONObject = new JSONObject();
            if (phcVar != null) {
                jSONObject.put("dynamic_show_type", phcVar.getDynamicShowType());
                phcVar.zmn(jSONObject, nqiVar);
            }
            if (view != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("width", view.getWidth());
                    jSONObject2.put("height", view.getHeight());
                    jSONObject2.put("alpha", view.getAlpha());
                } catch (Throwable unused) {
                }
                jSONObject.put("root_view", jSONObject2.toString());
            }
            com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, this.zn, jSONObject, (JSONObject) null);
            com.bytedance.sdk.openadsdk.bjh.zmn.zn.zmn(nqiVar);
        } catch (JSONException unused2) {
            iqz.zn("PAGBannerAdImpl", "onShowFun json error");
        }
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.btk;
        if (pAGBannerAdWrapperListener != null) {
            pAGBannerAdWrapperListener.onAdShow(view, nqiVar.va());
        }
        if (nqiVar.fw()) {
            oub.zmn(nqiVar, view);
        }
    }

    private com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn zmn(nqi nqiVar) {
        if (nqiVar.va() == 4) {
            return com.bytedance.sdk.openadsdk.phc.zmn.zmn.fb.zmn(this.hhw, this.zn);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void zmn(@NonNull final phc phcVar, @NonNull final nqi nqiVar) {
        com.bytedance.sdk.openadsdk.core.zg zgVar;
        if (phcVar == null || nqiVar == null) {
            return;
        }
        this.fb = nqiVar;
        this.iv = zmn(nqiVar);
        this.rc = phcVar;
        final String zmn = kjb.zmn();
        final nps.zmn rc = rc();
        phcVar.setClosedListenerKey(zmn);
        phcVar.setBannerClickClosedListener(rc);
        phcVar.setBackupListener(new com.bytedance.sdk.component.adexpress.fs.zn() { // from class: com.bytedance.sdk.openadsdk.core.fb.zmn.2
            @Override // com.bytedance.sdk.component.adexpress.fs.zn
            public boolean zmn(ViewGroup viewGroup, int i) {
                try {
                    phcVar.doe();
                    if (zmn.this.fb.ch()) {
                        bvs bvsVar = new bvs(phcVar.getContext());
                        bvsVar.setClosedListenerKey(zmn);
                        bvsVar.zmn(zmn.this.fb, phcVar, zmn.this.iv);
                        bvsVar.setAdInteractionListener(zmn.this.btk);
                        phcVar.setVastVideoHelper(bvsVar);
                        return true;
                    }
                    fs fsVar = new fs(phcVar.getContext());
                    fsVar.setClosedListenerKey(zmn);
                    fsVar.zmn(zmn.this.fb, phcVar, zmn.this.iv);
                    fsVar.setAdInteractionListener(zmn.this.btk);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
        if (!this.zg) {
            com.bytedance.sdk.openadsdk.core.zg zmn2 = zmn(phcVar);
            if (zmn2 == null) {
                zmn2 = new com.bytedance.sdk.openadsdk.core.zg(this.hhw, phcVar, this.klz.zmn());
                phcVar.addView(zmn2);
            }
            zgVar = zmn2;
            zgVar.setAdType(1);
            zgVar.setCallback(new zg.zmn() { // from class: com.bytedance.sdk.openadsdk.core.fb.zmn.3
                @Override // com.bytedance.sdk.openadsdk.core.zg.zmn
                public void zmn(boolean z) {
                    zmn.this.zmn(z, nqiVar);
                }

                @Override // com.bytedance.sdk.openadsdk.core.zg.zmn
                public void zmn() {
                    if (zmn.this.olo != 0) {
                        zmn.this.iv();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.zg.zmn
                public void fs() {
                    zmn zmnVar = zmn.this;
                    zmnVar.fs(zmnVar.fb);
                }

                @Override // com.bytedance.sdk.openadsdk.core.zg.zmn
                public void zmn(View view) {
                    if (zmn.this.mw.compareAndSet(false, true)) {
                        zmn.this.zmn(view, phcVar, nqiVar, zmn, rc);
                    }
                    fb fbVar = zmn.this.zmn;
                    if (fbVar == null || fbVar.getCurView() == null) {
                        return;
                    }
                    zmn.this.zmn.getCurView().rc();
                    zmn.this.zmn.getCurView().kw();
                    zmn.this.zmn.setIsShow(true);
                }
            });
        } else {
            vlj.zmn(phcVar, true, 1, this.klz.zmn(), new vlj.fs() { // from class: com.bytedance.sdk.openadsdk.core.fb.zmn.4
                @Override // com.bytedance.sdk.openadsdk.utils.vlj.fs
                public void zmn(boolean z) {
                    zmn.this.zmn(z, nqiVar);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.vlj.fs
                public void zmn() {
                    if (zmn.this.olo != 0) {
                        zmn.this.iv();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.utils.vlj.fs
                public void fs() {
                    zmn zmnVar = zmn.this;
                    zmnVar.fs(zmnVar.fb);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.vlj.fs
                public void zmn(View view, boolean z) {
                    if (!z) {
                        com.bytedance.sdk.openadsdk.bjh.zmn.zn.zmn(zmn.this.fb, 8);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.bjh.zmn.zn.zmn(zmn.this.fb, 4);
                    if (zmn.this.mw.compareAndSet(false, true)) {
                        zmn.this.zmn(view, phcVar, nqiVar, zmn, rc);
                    }
                    fb fbVar = zmn.this.zmn;
                    if (fbVar == null || fbVar.getCurView() == null) {
                        return;
                    }
                    zmn.this.zmn.getCurView().rc();
                    zmn.this.zmn.getCurView().kw();
                    zmn.this.zmn.setIsShow(true);
                }
            }, null);
            zgVar = null;
        }
        Context zmn3 = com.bytedance.sdk.component.utils.fs.zmn(phcVar);
        if (zmn3 == null) {
            zmn3 = this.hhw;
        }
        com.bytedance.sdk.openadsdk.core.iv.iv ivVar = new com.bytedance.sdk.openadsdk.core.iv.iv(zmn3, nqiVar, this.zn, 2);
        ivVar.fs(phcVar);
        ivVar.zmn(this);
        ivVar.zmn(this.iv);
        ivVar.zmn(new fs.zmn() { // from class: com.bytedance.sdk.openadsdk.core.fb.zmn.5
            @Override // com.bytedance.sdk.openadsdk.core.zn.fs.zmn
            public void zmn(View view, int i) {
                if (zmn.this.btk != null) {
                    zmn.this.btk.onAdClicked();
                }
            }
        });
        phcVar.setClickListener(ivVar);
        com.bytedance.sdk.openadsdk.core.iv.bvs bvsVar = new com.bytedance.sdk.openadsdk.core.iv.bvs(this.hhw, nqiVar, this.zn, 2);
        bvsVar.fs(phcVar);
        bvsVar.zmn(this);
        bvsVar.zmn(new fs.zmn() { // from class: com.bytedance.sdk.openadsdk.core.fb.zmn.6
            @Override // com.bytedance.sdk.openadsdk.core.zn.fs.zmn
            public void zmn(View view, int i) {
                if (zmn.this.btk != null) {
                    zmn.this.btk.onAdClicked();
                }
            }
        });
        phc phcVar2 = this.rc;
        if (phcVar2 instanceof com.bytedance.sdk.openadsdk.core.iv.iqz) {
            bvsVar.zmn(((com.bytedance.sdk.openadsdk.core.iv.iqz) phcVar2).getVideoController());
        }
        bvsVar.zmn(this.iv);
        phcVar.setClickCreativeListener(bvsVar);
        if (this.zg) {
            return;
        }
        zgVar.setNeedCheckingShow(true);
    }

    private nps.zmn rc() {
        return new nps.zmn() { // from class: com.bytedance.sdk.openadsdk.core.fb.zmn.7
            @Override // com.bytedance.sdk.openadsdk.core.fb.nps.zmn
            public void zmn() {
                int width = zmn.this.rc.getWidth();
                int height = zmn.this.rc.getHeight();
                View zmn = zmn(((double) height) >= Math.floor((((double) width) * 450.0d) / 600.0d));
                zmn.this.rc.uqh();
                zmn.this.rc.removeAllViews();
                zmn.this.rc.addView(zmn, new ViewGroup.LayoutParams(width, height));
                zmn.this.rc.setClickCreativeListener(null);
                zmn.this.rc.setClickListener(null);
                if (zmn.this.btk != null) {
                    zmn.this.btk.onAdDismissed();
                }
                zmn.this.bvs = true;
            }

            private View zmn(boolean z) {
                com.bytedance.sdk.openadsdk.core.hhw.zn znVar = new com.bytedance.sdk.openadsdk.core.hhw.zn(zmn.this.hhw);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                znVar.setBackgroundColor(-1);
                znVar.setLayoutParams(layoutParams);
                View view = new View(zmn.this.hhw);
                ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                view.setAlpha(0.3f);
                view.setBackgroundColor(Color.parseColor("#F3F7F8"));
                znVar.addView(view, layoutParams2);
                com.bytedance.sdk.openadsdk.core.hhw.zn znVar2 = new com.bytedance.sdk.openadsdk.core.hhw.zn(zmn.this.hhw);
                ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                if (z) {
                    znVar2.setBackground(doe.zn(zmn.this.hhw, "tt_ad_closed_background_300_250"));
                } else {
                    znVar2.setBackground(doe.zn(zmn.this.hhw, "tt_ad_closed_background_320_50"));
                }
                znVar.addView(znVar2, layoutParams3);
                PAGLogoView createPAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(zmn.this.hhw, zmn.this.fb);
                createPAGLogoViewByMaterial.setId(520093739);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                if (z) {
                    int fs = jy.fs(zmn.this.hhw, 16.0f);
                    layoutParams4.width = jy.fs(zmn.this.hhw, 77.0f);
                    layoutParams4.height = jy.fs(zmn.this.hhw, 14.0f);
                    layoutParams4.leftMargin = fs;
                    layoutParams4.topMargin = fs;
                } else {
                    int fs2 = jy.fs(zmn.this.hhw, 8.0f);
                    layoutParams4.width = jy.fs(zmn.this.hhw, 45.0f);
                    layoutParams4.height = jy.fs(zmn.this.hhw, 8.18f);
                    layoutParams4.leftMargin = fs2;
                    layoutParams4.topMargin = fs2;
                }
                znVar2.addView(createPAGLogoViewByMaterial, layoutParams4);
                com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(zmn.this.hhw);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams5.gravity = 17;
                zgVar.setAlpha(0.5f);
                zgVar.setLines(1);
                zgVar.setText(doe.zmn(zmn.this.hhw, "tt_ad_is_closed"));
                if (z) {
                    zgVar.setTextSize(18.0f);
                } else {
                    zgVar.setTextSize(12.0f);
                }
                znVar2.addView(zgVar, layoutParams5);
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.fb.zmn.7.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/fb/zmn$7$1;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(h.u, view2);
                        safedk_zmn$7$1_onClick_9190c9e18195f4bdb633da641733a3d3(view2);
                    }

                    public void safedk_zmn$7$1_onClick_9190c9e18195f4bdb633da641733a3d3(View p0) {
                        if (!com.bytedance.sdk.openadsdk.utils.fs.btk() || !kgc.fb().am()) {
                            TTWebsiteActivity.zmn(zmn.this.hhw, zmn.this.fb, zmn.this.zn);
                        } else {
                            IABLandingPageActivity.zmn(zmn.this.hhw, zmn.this.fb, zmn.this.zn);
                        }
                    }
                };
                createPAGLogoViewByMaterial.setOnClickListener(onClickListener);
                zgVar.setOnClickListener(onClickListener);
                return znVar;
            }
        };
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.fb.zmn$zmn, reason: collision with other inner class name */
    private static class C0158zmn extends com.bytedance.sdk.component.zg.fs.zn {
        nqi fs;
        boolean zmn;
        WeakReference<zmn> zn;

        C0158zmn(boolean z, nqi nqiVar, zmn zmnVar) {
            super("ReportWindowFocusChangedAdShow");
            this.zmn = z;
            this.fs = nqiVar;
            this.zn = new WeakReference<>(zmnVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<zmn> weakReference = this.zn;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.zn.get().fs(this.zmn, this.fs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(boolean z, nqi nqiVar) {
        try {
            if (z) {
                this.nps = System.currentTimeMillis();
            } else {
                if (this.nps <= 0 || this.rc == null) {
                    return;
                }
                String valueOf = String.valueOf(System.currentTimeMillis() - this.nps);
                this.nps = 0L;
                com.bytedance.sdk.openadsdk.fb.zn.zmn(valueOf, nqiVar, this.zn, this.rc.getAdShowTime());
            }
        } catch (Exception e) {
            iqz.zn("PAGBannerAdImpl", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(nqi nqiVar) {
        if (this.nps <= 0 || nqiVar == null) {
            return;
        }
        try {
            if (this.rc != null) {
                String valueOf = String.valueOf(System.currentTimeMillis() - this.nps);
                this.nps = 0L;
                com.bytedance.sdk.openadsdk.fb.zn.zmn(valueOf, nqiVar, this.zn, this.rc.getAdShowTime());
            }
        } catch (Exception e) {
            iqz.zn("PAGBannerAdImpl", e.getMessage());
        }
    }

    private com.bytedance.sdk.openadsdk.core.zg zmn(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            try {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof com.bytedance.sdk.openadsdk.core.zg) {
                    return (com.bytedance.sdk.openadsdk.core.zg) childAt;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public void hhw() {
        this.olo = 1;
        this.zmn.fb();
    }

    public void nps() {
        if (this.zmn != null) {
            try {
                hhw();
                this.zmn.removeOnAttachStateChangeListener(this.kgc);
            } catch (Throwable unused) {
            }
        }
    }

    public void zmn(final com.bytedance.sdk.openadsdk.zmn.zmn.fs fsVar) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.kw > 500) {
            this.kw = currentTimeMillis;
            fb fbVar = this.zmn;
            if (fbVar instanceof zn) {
                fbVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fb.zmn.8
                    @Override // java.lang.Runnable
                    public void run() {
                        ((zn) zmn.this.zmn).zmn(fsVar);
                    }
                }, 500L);
            }
        }
    }

    public void zg() {
        fb fbVar = this.zmn;
        if (fbVar instanceof zn) {
            ((zn) fbVar).fs();
        }
    }

    public void bvs() {
        fb fbVar = this.zmn;
        if (fbVar instanceof zn) {
            ((zn) fbVar).zmn();
        }
    }

    private void klz() {
        this.fb.zmn(SystemClock.elapsedRealtime());
        this.zmn.btk();
    }
}
