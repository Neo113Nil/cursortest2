package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView;
import com.bytedance.sdk.openadsdk.core.ny;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: BrandBannerController.java */
/* loaded from: classes2.dex */
public class icD {
    private com.bytedance.sdk.component.adexpress.icD.bNS Jd;
    private NativeExpressView NB;
    private final Context icD;
    cR pvs;
    private int sUS;
    private ScheduledFuture<?> so;
    private pvs vG;
    private int yiw;

    /* compiled from: BrandBannerController.java */
    interface vG {
        void icD(String str);

        void pvs();

        void pvs(int i, int i2);

        void pvs(String str);
    }

    public icD(Context context, NativeExpressView nativeExpressView, cR cRVar, String str) {
        this.pvs = cRVar;
        this.icD = context;
        this.NB = nativeExpressView;
        pvs(nativeExpressView);
        this.vG = new pvs(context, cRVar, this.sUS, this.yiw, str);
    }

    private void pvs(NativeExpressView nativeExpressView) {
        cR cRVar = this.pvs;
        if (cRVar != null && cRVar.OBt()) {
            this.sUS = -1;
            this.yiw = -1;
            return;
        }
        Ju pvs2 = BannerExpressBackupView.pvs(nativeExpressView.getExpectExpressWidth(), nativeExpressView.getExpectExpressHeight());
        if (nativeExpressView.getExpectExpressWidth() > 0 && nativeExpressView.getExpectExpressHeight() > 0) {
            this.sUS = Pj.icD(this.icD, nativeExpressView.getExpectExpressWidth());
            this.yiw = Pj.icD(this.icD, nativeExpressView.getExpectExpressHeight());
        } else {
            int vG2 = Pj.vG(this.icD);
            this.sUS = vG2;
            this.yiw = Float.valueOf(vG2 / pvs2.icD).intValue();
        }
        int i = this.sUS;
        if (i <= 0 || i <= Pj.vG(this.icD)) {
            return;
        }
        this.sUS = Pj.vG(this.icD);
        this.yiw = Float.valueOf(this.yiw * (Pj.vG(this.icD) / this.sUS)).intValue();
    }

    public void pvs(com.bytedance.sdk.component.adexpress.icD.bNS bns) {
        this.Jd = bns;
    }

    public void pvs() {
        cR cRVar = this.pvs;
        if (cRVar != null && cRVar.OBt()) {
            this.so = ae.pvs().schedule(new RunnableC0077icD(this.vG.Ju), com.bytedance.sdk.openadsdk.core.mnm.Jd().Gp(), TimeUnit.MILLISECONDS);
        }
        pvs pvsVar = this.vG;
        if (pvsVar != null) {
            pvsVar.pvs(new com.bytedance.sdk.component.adexpress.icD.yiw() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.icD.1
                @Override // com.bytedance.sdk.component.adexpress.icD.yiw
                public void pvs(View view, com.bytedance.sdk.component.adexpress.icD.IP ip) {
                    if (icD.this.NB == null || view == null) {
                        if (icD.this.Jd != null) {
                            icD.this.Jd.a_(106);
                        }
                    } else if (icD.this.Jd != null) {
                        icD.this.Jd.pvs(icD.this.vG, ip);
                    }
                    icD.this.vG();
                }

                @Override // com.bytedance.sdk.component.adexpress.icD.yiw
                public void pvs(int i, String str) {
                    if (icD.this.Jd != null) {
                        icD.this.Jd.a_(106);
                    }
                    icD.this.vG();
                }
            });
            View NB = this.vG.NB();
            this.NB.removeView(NB);
            if (NB.getParent() != null) {
                ((ViewGroup) NB.getParent()).removeView(NB);
            }
            this.NB.addView(NB, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        com.bytedance.sdk.component.adexpress.icD.bNS bns = this.Jd;
        if (bns != null) {
            bns.a_(106);
        }
    }

    public void icD() {
        pvs pvsVar = this.vG;
        if (pvsVar != null) {
            pvsVar.Jd();
            this.vG = null;
        }
        vG();
        this.Jd = null;
        this.NB = null;
    }

    public void pvs(ny nyVar) {
        pvs pvsVar = this.vG;
        if (pvsVar != null) {
            pvsVar.pvs(nyVar);
        }
    }

    public void pvs(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        pvs pvsVar = this.vG;
        if (pvsVar != null) {
            pvsVar.pvs(tTDislikeDialogAbstract);
        }
    }

    public void pvs(String str) {
        pvs pvsVar = this.vG;
        if (pvsVar != null) {
            pvsVar.pvs(str);
        }
    }

    public void pvs(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        pvs pvsVar = this.vG;
        if (pvsVar != null) {
            pvsVar.pvs(pAGExpressAdWrapperListener);
        }
    }

    /* compiled from: BrandBannerController.java */
    public static class pvs implements com.bytedance.sdk.component.adexpress.icD.Jd<View>, DspHtmlWebView.icD {
        private com.bytedance.sdk.component.adexpress.icD.yiw IP;
        private TTDislikeDialogAbstract Jd;
        private DspHtmlWebView Ju;
        private FrameLayout Mxy;
        private String NB;
        private cR Wyp;
        private PAGExpressAdWrapperListener bNS;
        WeakReference<View> icD;
        private String kj;
        AtomicBoolean pvs = new AtomicBoolean(false);
        private final int qh;
        private final Context sUS;
        private final int so;
        private com.bytedance.sdk.openadsdk.dislike.icD vG;
        private final int yiw;

        @Override // com.bytedance.sdk.component.adexpress.icD.Jd
        public int vG() {
            return 5;
        }

        public pvs(Context context, cR cRVar, int i, int i2, String str) {
            this.kj = str;
            if (cRVar != null && cRVar.OBt()) {
                this.kj = "fullscreen_interstitial_ad";
            }
            this.sUS = context;
            this.yiw = i;
            this.so = i2;
            this.Wyp = cRVar;
            this.qh = Pj.icD(context, 3.0f);
            yiw();
        }

        private void yiw() {
            FrameLayout frameLayout = new FrameLayout(this.sUS);
            this.Mxy = frameLayout;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(this.yiw, this.so);
            }
            layoutParams.width = this.yiw;
            layoutParams.height = this.so;
            layoutParams.gravity = 17;
            this.Mxy.setLayoutParams(layoutParams);
            DspHtmlWebView Wyp = Wyp();
            this.Mxy.addView(Wyp);
            View so = so();
            this.Mxy.addView(so);
            cR cRVar = this.Wyp;
            if (cRVar != null && cRVar.OBt()) {
                Wyp.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                this.icD = new WeakReference<>(((Activity) this.sUS).findViewById(520093713));
                Wyp.pvs(((Activity) this.sUS).findViewById(com.bytedance.sdk.openadsdk.utils.kj.pQ), FriendlyObstructionPurpose.OTHER);
            } else {
                ImageView Mxy = Mxy();
                this.Mxy.addView(Mxy);
                this.icD = new WeakReference<>(Mxy);
                Wyp.pvs(Mxy, FriendlyObstructionPurpose.CLOSE_AD);
            }
            Wyp.pvs(so, FriendlyObstructionPurpose.OTHER);
        }

        @Override // com.bytedance.sdk.component.adexpress.icD.Jd
        public void pvs(com.bytedance.sdk.component.adexpress.icD.yiw yiwVar) {
            cR cRVar;
            if (this.pvs.get()) {
                return;
            }
            if (this.sUS == null || (cRVar = this.Wyp) == null) {
                yiwVar.pvs(106, "material null");
                return;
            }
            this.IP = yiwVar;
            if (TextUtils.isEmpty(cRVar.Tdd())) {
                yiwVar.pvs(106, "dsp data is null");
            } else {
                this.Ju.mnm();
            }
        }

        private View so() {
            PAGLogoView pAGLogoView = new PAGLogoView(this.sUS);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            cR cRVar = this.Wyp;
            if (cRVar != null && cRVar.OBt()) {
                layoutParams.leftMargin = Pj.icD(this.sUS, 20.0f);
                layoutParams.bottomMargin = Pj.icD(this.sUS, 20.0f);
                layoutParams.gravity = 8388691;
            } else {
                layoutParams.topMargin = this.qh;
                layoutParams.leftMargin = this.qh;
            }
            pAGLogoView.setLayoutParams(layoutParams);
            pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.icD.pvs.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTWebsiteActivity.pvs(pvs.this.sUS, pvs.this.Wyp, pvs.this.kj);
                }
            });
            return pAGLogoView;
        }

        private ImageView Mxy() {
            PAGImageView pAGImageView = new PAGImageView(this.sUS);
            pAGImageView.setImageDrawable(this.sUS.getResources().getDrawable(uc.Jd(this.sUS, "tt_dislike_icon2")));
            int icD = Pj.icD(this.sUS, 15.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(icD, icD);
            layoutParams.gravity = GravityCompat.END;
            layoutParams.rightMargin = this.qh;
            layoutParams.topMargin = this.qh;
            pAGImageView.setLayoutParams(layoutParams);
            pAGImageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.icD.pvs.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    pvs.this.sUS();
                }
            });
            return pAGImageView;
        }

        private DspHtmlWebView Wyp() {
            DspHtmlWebView icD = com.bytedance.sdk.openadsdk.core.nativeexpress.vG.pvs().icD();
            this.Ju = icD;
            if (icD == null) {
                this.Ju = new DspHtmlWebView(this.sUS);
            }
            com.bytedance.sdk.openadsdk.core.nativeexpress.vG.pvs().vG(this.Ju);
            this.Ju.pvs(this.Wyp, this, this.kj);
            this.Ju.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this.Ju;
        }

        @Override // com.bytedance.sdk.component.adexpress.icD.Jd
        public View NB() {
            return this.Mxy;
        }

        public void Jd() {
            this.Mxy = null;
            this.vG = null;
            this.Jd = null;
            this.IP = null;
            this.Wyp = null;
            DspHtmlWebView dspHtmlWebView = this.Ju;
            if (dspHtmlWebView != null) {
                dspHtmlWebView.kj();
                com.bytedance.sdk.openadsdk.core.nativeexpress.vG.pvs().pvs(this.Ju);
            }
            this.pvs.set(true);
        }

        public void pvs(ny nyVar) {
            if (nyVar instanceof com.bytedance.sdk.openadsdk.dislike.icD) {
                this.vG = (com.bytedance.sdk.openadsdk.dislike.icD) nyVar;
            }
        }

        public void pvs(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
            cR cRVar;
            if (tTDislikeDialogAbstract != null && (cRVar = this.Wyp) != null) {
                tTDislikeDialogAbstract.setMaterialMeta(cRVar.HWd(), this.Wyp.Ayu());
            }
            this.Jd = tTDislikeDialogAbstract;
        }

        public void sUS() {
            TTDislikeDialogAbstract tTDislikeDialogAbstract = this.Jd;
            if (tTDislikeDialogAbstract != null) {
                tTDislikeDialogAbstract.show();
                return;
            }
            com.bytedance.sdk.openadsdk.dislike.icD icd = this.vG;
            if (icd != null) {
                icd.pvs();
            } else {
                TTDelegateActivity.pvs(this.Wyp, this.NB);
            }
        }

        public void pvs(String str) {
            this.NB = str;
        }

        @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.icD
        public View pvs() {
            WeakReference<View> weakReference = this.icD;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.icD
        public View icD() {
            FrameLayout frameLayout = this.Mxy;
            if (frameLayout == null) {
                return null;
            }
            return (View) frameLayout.getParent();
        }

        @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.icD
        public void pvs(View view, int i) {
            PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.bNS;
            if (pAGExpressAdWrapperListener != null) {
                pAGExpressAdWrapperListener.onAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.icD
        public void f_() {
            if (this.IP != null) {
                com.bytedance.sdk.component.adexpress.icD.IP ip = new com.bytedance.sdk.component.adexpress.icD.IP();
                ip.pvs(true);
                ip.pvs(Pj.vG(this.sUS, this.yiw));
                ip.icD(Pj.vG(this.sUS, this.so));
                this.IP.pvs(this.Mxy, ip);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.icD
        public void pvs(int i, int i2) {
            com.bytedance.sdk.component.adexpress.icD.yiw yiwVar = this.IP;
            if (yiwVar != null) {
                yiwVar.pvs(i, "render fail");
            }
        }

        public void pvs(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
            this.bNS = pAGExpressAdWrapperListener;
        }
    }

    /* compiled from: BrandBannerController.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.icD$icD, reason: collision with other inner class name */
    private static class RunnableC0077icD implements Runnable {
        vG pvs;

        public RunnableC0077icD(vG vGVar) {
            this.pvs = vGVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            vG vGVar = this.pvs;
            if (vGVar != null) {
                vGVar.pvs(107, 107);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vG() {
        try {
            ScheduledFuture<?> scheduledFuture = this.so;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.so.cancel(false);
            this.so = null;
        } catch (Throwable unused) {
        }
    }
}
