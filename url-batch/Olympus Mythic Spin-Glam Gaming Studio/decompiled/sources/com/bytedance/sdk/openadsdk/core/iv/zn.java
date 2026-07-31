package com.bytedance.sdk.openadsdk.core.iv;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.iv.hhw;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.yj;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public class zn {
    private phc btk;
    private int bvs;
    private com.bytedance.sdk.component.adexpress.fs.cn fb;
    private final Context fs;
    private int hhw;
    private int nps;
    private ScheduledFuture<?> zg;
    com.bytedance.sdk.openadsdk.core.model.nqi zmn;
    private zmn zn;

    /* renamed from: com.bytedance.sdk.openadsdk.core.iv.zn$zn, reason: collision with other inner class name */
    interface InterfaceC0161zn {
        void fs(String str);

        void zmn();

        void zmn(int i, int i2);

        void zmn(String str);
    }

    public zn(Context context, phc phcVar, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, String str) {
        this.zmn = nqiVar;
        this.fs = context;
        this.btk = phcVar;
        zmn(phcVar);
        this.zn = new zmn(context, nqiVar, this.hhw, this.nps, str, this.bvs);
    }

    private void zmn(phc phcVar) {
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = this.zmn;
        if (nqiVar != null && nqiVar.wir()) {
            this.hhw = -1;
            this.nps = -1;
            return;
        }
        kw zmn2 = com.bytedance.sdk.openadsdk.core.fb.fs.zmn(phcVar.getExpectExpressWidth(), phcVar.getExpectExpressHeight());
        this.bvs = zmn2.zmn;
        if (phcVar.getExpectExpressWidth() > 0 && phcVar.getExpectExpressHeight() > 0) {
            this.hhw = jy.fs(this.fs, phcVar.getExpectExpressWidth());
            this.nps = jy.fs(this.fs, phcVar.getExpectExpressHeight());
        } else {
            int zn = jy.zn(this.fs);
            this.hhw = zn;
            this.nps = Float.valueOf(zn / zmn2.fs).intValue();
        }
        int i = this.hhw;
        if (i <= 0 || i <= jy.zn(this.fs)) {
            return;
        }
        this.hhw = jy.zn(this.fs);
        this.nps = Float.valueOf(this.nps * (jy.zn(this.fs) / this.hhw)).intValue();
    }

    public void zmn(com.bytedance.sdk.component.adexpress.fs.cn cnVar) {
        this.fb = cnVar;
    }

    public void zmn() {
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = this.zmn;
        if (nqiVar != null && nqiVar.wir()) {
            this.zg = nu.zmn().schedule(new fs(this.zn.klz), com.bytedance.sdk.openadsdk.core.kgc.fb().tf(), TimeUnit.MILLISECONDS);
        }
        zmn zmnVar = this.zn;
        if (zmnVar != null) {
            zmnVar.zmn(new com.bytedance.sdk.component.adexpress.fs.nps() { // from class: com.bytedance.sdk.openadsdk.core.iv.zn.1
                @Override // com.bytedance.sdk.component.adexpress.fs.nps
                public void zmn(View view, com.bytedance.sdk.component.adexpress.fs.rt rtVar) {
                    if (zn.this.btk == null || view == null) {
                        if (zn.this.fb != null) {
                            zn.this.fb.a_(106);
                        }
                    } else if (zn.this.fb != null) {
                        zn.this.fb.zmn(zn.this.zn, rtVar);
                    }
                    zn.this.zn();
                }

                @Override // com.bytedance.sdk.component.adexpress.fs.nps
                public void zmn(int i, String str) {
                    if (zn.this.fb != null) {
                        zn.this.fb.a_(106);
                    }
                    zn.this.zn();
                }
            });
            View btk = this.zn.btk();
            this.btk.removeView(btk);
            if (btk.getParent() != null) {
                ((ViewGroup) btk.getParent()).removeView(btk);
            }
            this.btk.addView(btk, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        com.bytedance.sdk.component.adexpress.fs.cn cnVar = this.fb;
        if (cnVar != null) {
            cnVar.a_(106);
        }
    }

    public void fs() {
        zmn zmnVar = this.zn;
        if (zmnVar != null) {
            zmnVar.fb();
            this.zn = null;
        }
        zn();
        this.fb = null;
        this.btk = null;
    }

    public void zmn(yj yjVar) {
        zmn zmnVar = this.zn;
        if (zmnVar != null) {
            zmnVar.zmn(yjVar);
        }
    }

    public void zmn(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        zmn zmnVar = this.zn;
        if (zmnVar != null) {
            zmnVar.zmn(tTDislikeDialogAbstract);
        }
    }

    public void zmn(String str) {
        zmn zmnVar = this.zn;
        if (zmnVar != null) {
            zmnVar.zmn(str);
        }
    }

    public void zmn(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        zmn zmnVar = this.zn;
        if (zmnVar != null) {
            zmnVar.zmn(pAGExpressAdWrapperListener);
        }
    }

    public static class zmn implements com.bytedance.sdk.component.adexpress.fs.fb<View>, hhw.fs {
        private final Context btk;
        private com.bytedance.sdk.openadsdk.core.model.nqi bvs;
        private PAGExpressAdWrapperListener cn;
        private String fb;
        private com.bytedance.sdk.openadsdk.zn.zn fs;
        private final int hhw;
        private final int iv;
        private hhw klz;
        private int mw;
        private final int nps;
        private String rc;
        private com.bytedance.sdk.component.adexpress.fs.nps rt;
        private FrameLayout zg;
        AtomicBoolean zmn = new AtomicBoolean(false);
        private TTDislikeDialogAbstract zn;

        @Override // com.bytedance.sdk.component.adexpress.fs.fb
        public int zn() {
            return 5;
        }

        public zmn(Context context, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, int i, int i2, String str, int i3) {
            this.rc = str;
            if (nqiVar != null && nqiVar.wir()) {
                this.rc = "fullscreen_interstitial_ad";
            }
            this.btk = context;
            this.hhw = i;
            this.nps = i2;
            this.bvs = nqiVar;
            this.iv = jy.fs(context, 3.0f);
            this.mw = i3;
            hhw();
        }

        private void hhw() {
            FrameLayout frameLayout = new FrameLayout(this.btk);
            this.zg = frameLayout;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(this.hhw, this.nps);
            }
            layoutParams.width = this.hhw;
            layoutParams.height = this.nps;
            layoutParams.gravity = 17;
            this.zg.setLayoutParams(layoutParams);
            hhw zg = zg();
            this.zg.addView(zg);
            View nps = nps();
            this.zg.addView(nps);
            com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = this.bvs;
            if (nqiVar != null && nqiVar.wir()) {
                zg.setBackgroundColor(-16777216);
                zg.zmn(((Activity) this.btk).findViewById(com.bytedance.sdk.openadsdk.utils.olo.xt), FriendlyObstructionPurpose.OTHER);
            }
            FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
            zg.zmn(nps, friendlyObstructionPurpose);
            Context context = this.btk;
            if (context == null || !(context instanceof Activity)) {
                return;
            }
            View findViewById = ((Activity) context).findViewById(com.bytedance.sdk.openadsdk.utils.olo.dz);
            if (findViewById != null) {
                zg.zmn(findViewById, friendlyObstructionPurpose);
            }
            View findViewById2 = ((Activity) this.btk).findViewById(com.bytedance.sdk.openadsdk.utils.olo.ioo);
            if (findViewById2 != null) {
                zg.zmn(findViewById2, friendlyObstructionPurpose);
            }
        }

        @Override // com.bytedance.sdk.component.adexpress.fs.fb
        public void zmn(com.bytedance.sdk.component.adexpress.fs.nps npsVar) {
            com.bytedance.sdk.openadsdk.core.model.nqi nqiVar;
            if (this.zmn.get()) {
                return;
            }
            if (this.btk == null || (nqiVar = this.bvs) == null) {
                npsVar.zmn(106, "material null");
                return;
            }
            this.rt = npsVar;
            if (TextUtils.isEmpty(nqiVar.xhx())) {
                npsVar.zmn(106, "dsp data is null");
            } else {
                this.klz.kw();
            }
        }

        private View nps() {
            PAGLogoView createPAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.btk, this.bvs);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = this.bvs;
            if (nqiVar != null && nqiVar.wir()) {
                layoutParams.leftMargin = jy.fs(this.btk, 20.0f);
                layoutParams.bottomMargin = jy.fs(this.btk, 20.0f);
                layoutParams.gravity = 8388691;
            } else {
                int i = this.iv;
                layoutParams.topMargin = i;
                layoutParams.leftMargin = i;
            }
            createPAGLogoViewByMaterial.setLayoutParams(layoutParams);
            createPAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.iv.zn.zmn.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/iv/zn$zmn$1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_zn$zmn$1_onClick_dc61d69f35996c06c035715790f911e2(view);
                }

                public void safedk_zn$zmn$1_onClick_dc61d69f35996c06c035715790f911e2(View p0) {
                    if (!com.bytedance.sdk.openadsdk.utils.fs.btk() || !com.bytedance.sdk.openadsdk.core.kgc.fb().am()) {
                        TTWebsiteActivity.zmn(zmn.this.btk, zmn.this.bvs, zmn.this.rc);
                    } else {
                        IABLandingPageActivity.zmn(zmn.this.btk, zmn.this.bvs, zmn.this.rc);
                    }
                }
            });
            return createPAGLogoViewByMaterial;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        private hhw zg() {
            hhw fs = fb.zmn().fs();
            this.klz = fs;
            if (fs == null) {
                this.klz = new hhw(this.btk);
            }
            fb.zmn().zn(this.klz);
            this.klz.zmn(this.bvs, this, this.rc);
            this.klz.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this.klz;
        }

        @Override // com.bytedance.sdk.component.adexpress.fs.fb
        public View btk() {
            return this.zg;
        }

        public void fb() {
            this.zg = null;
            this.fs = null;
            this.zn = null;
            this.rt = null;
            this.bvs = null;
            hhw hhwVar = this.klz;
            if (hhwVar != null) {
                hhwVar.cn();
                fb.zmn().zmn(this.klz);
            }
            this.zmn.set(true);
        }

        public void zmn(yj yjVar) {
            if (yjVar instanceof com.bytedance.sdk.openadsdk.zn.zn) {
                this.fs = (com.bytedance.sdk.openadsdk.zn.zn) yjVar;
            }
        }

        public void zmn(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
            com.bytedance.sdk.openadsdk.core.model.nqi nqiVar;
            if (tTDislikeDialogAbstract != null && (nqiVar = this.bvs) != null) {
                tTDislikeDialogAbstract.setMaterialMeta(nqiVar.ze(), this.bvs.pa());
            }
            this.zn = tTDislikeDialogAbstract;
        }

        public void zmn(String str) {
            this.fb = str;
        }

        @Override // com.bytedance.sdk.openadsdk.core.iv.hhw.fs
        public View zmn() {
            FrameLayout frameLayout = this.zg;
            if (frameLayout == null) {
                return null;
            }
            return (View) frameLayout.getParent();
        }

        @Override // com.bytedance.sdk.openadsdk.core.iv.hhw.fs
        public void zmn(View view, int i) {
            PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.cn;
            if (pAGExpressAdWrapperListener != null) {
                pAGExpressAdWrapperListener.onAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.iv.hhw.fs
        @SuppressLint({"ClickableViewAccessibility"})
        public void fs() {
            if (this.rt != null) {
                com.bytedance.sdk.component.adexpress.fs.rt rtVar = new com.bytedance.sdk.component.adexpress.fs.rt();
                rtVar.zmn(true);
                rtVar.zmn(jy.zn(this.btk, this.hhw));
                rtVar.fs(jy.zn(this.btk, this.nps));
                this.rt.zmn(this.zg, rtVar);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.iv.hhw.fs
        public void zmn(int i, int i2) {
            com.bytedance.sdk.component.adexpress.fs.nps npsVar = this.rt;
            if (npsVar != null) {
                npsVar.zmn(i, "render fail");
            }
        }

        public void zmn(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
            this.cn = pAGExpressAdWrapperListener;
        }
    }

    private static class fs implements Runnable {
        InterfaceC0161zn zmn;

        public fs(InterfaceC0161zn interfaceC0161zn) {
            this.zmn = interfaceC0161zn;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC0161zn interfaceC0161zn = this.zmn;
            if (interfaceC0161zn != null) {
                interfaceC0161zn.zmn(107, 107);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn() {
        try {
            ScheduledFuture<?> scheduledFuture = this.zg;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.zg.cancel(false);
            this.zg = null;
        } catch (Throwable unused) {
        }
    }
}
