package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.uc;
import com.bytedance.sdk.openadsdk.core.vA;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.gA;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ExpressAdLoadManager.java */
/* loaded from: classes2.dex */
public class NB {
    private static final Set<NB> Wyp = Collections.synchronizedSet(new HashSet());
    private PAGBannerAdLoadListener Jd;
    private AdSlot pvs;
    private List<cR> sUS;
    private pvs so;
    private final Context vG;
    private List<cR> yiw;
    private final AtomicBoolean NB = new AtomicBoolean(false);
    private int Mxy = 5;
    private final ScheduledFuture<?> qh = null;
    private ScheduledFuture<?> kj = null;
    private ScheduledFuture<?> Ju = null;
    private final gA IP = gA.icD();
    private final com.bytedance.sdk.openadsdk.core.vA icD = com.bytedance.sdk.openadsdk.core.mnm.vG();

    /* compiled from: ExpressAdLoadManager.java */
    public interface pvs {
        void pvs();

        void pvs(List<cR> list);
    }

    private NB(Context context) {
        if (context != null) {
            this.vG = context.getApplicationContext();
        } else {
            this.vG = com.bytedance.sdk.openadsdk.core.mnm.pvs();
        }
        Wyp.add(this);
    }

    public static NB pvs(Context context) {
        return new NB(context);
    }

    public void pvs(AdSlot adSlot, int i, com.bytedance.sdk.openadsdk.common.Jd jd, int i2) {
        pvs(adSlot, i, jd, null, i2);
    }

    public void pvs(AdSlot adSlot, int i, com.bytedance.sdk.openadsdk.common.Jd jd, pvs pvsVar, int i2) {
        this.IP.Jd();
        if (this.NB.get()) {
            com.bytedance.sdk.component.utils.Ju.pvs("ExpressAdLoadManager", "express ad is loading...");
            return;
        }
        this.Mxy = i;
        this.NB.set(true);
        this.pvs = adSlot;
        if (jd instanceof PAGBannerAdLoadListener) {
            this.Jd = (PAGBannerAdLoadListener) jd;
        }
        this.so = pvsVar;
        pvs(adSlot, jd);
    }

    private void pvs(final AdSlot adSlot, com.bytedance.sdk.openadsdk.common.Jd jd) {
        if (adSlot == null) {
            return;
        }
        uc ucVar = new uc();
        ucVar.so = 2;
        this.icD.pvs(adSlot, ucVar, this.Mxy, new vA.pvs() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NB.1
            @Override // com.bytedance.sdk.openadsdk.core.vA.pvs
            public void pvs(int i, String str) {
                NB.this.pvs(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.vA.pvs
            public void pvs(com.bytedance.sdk.openadsdk.core.model.pvs pvsVar, com.bytedance.sdk.openadsdk.core.model.icD icd) {
                if (pvsVar.vG() == null || pvsVar.vG().isEmpty()) {
                    NB.this.pvs(-3, com.bytedance.sdk.openadsdk.core.yiw.pvs(-3));
                    icd.pvs(-3);
                    com.bytedance.sdk.openadsdk.core.model.icD.pvs(icd);
                    return;
                }
                NB.this.sUS = pvsVar.vG();
                NB.this.yiw = pvsVar.vG();
                NB.this.pvs(adSlot);
                NB nb = NB.this;
                nb.pvs(nb.IP);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(AdSlot adSlot) {
        List<cR> list = this.sUS;
        if (list == null) {
            return;
        }
        for (cR cRVar : list) {
            if (cR.NB(cRVar) && cRVar.od() != null && cRVar.od().qh() != null) {
                if (com.bytedance.sdk.openadsdk.core.mnm.Jd().NB(String.valueOf(cRVar.yTz())) && com.bytedance.sdk.openadsdk.core.mnm.Jd().joF()) {
                    com.bytedance.sdk.openadsdk.core.video.pvs.icD pvs2 = cR.pvs(CacheDirFactory.getICacheDir(cRVar.LHy()).vG(), cRVar);
                    pvs2.pvs("material_meta", cRVar);
                    pvs2.pvs("ad_slot", adSlot);
                    com.bytedance.sdk.openadsdk.core.video.Jd.pvs.pvs(pvs2, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(final gA gAVar) {
        if (this.NB.getAndSet(false)) {
            ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NB.2
                @Override // java.lang.Runnable
                public void run() {
                    if (NB.this.yiw == null || NB.this.yiw.size() <= 0) {
                        if (NB.this.so != null) {
                            NB.this.so.pvs();
                        }
                    } else {
                        NB.this.icD(gAVar);
                        if (NB.this.so != null) {
                            NB.this.so.pvs(NB.this.yiw);
                        }
                    }
                    NB.this.pvs();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(gA gAVar) {
        if (this.Jd != null) {
            Iterator<cR> it = this.yiw.iterator();
            PAGBannerAd pAGBannerAd = null;
            while (it.hasNext() && (pAGBannerAd = pvs(it.next())) == null) {
            }
            if (pAGBannerAd != null) {
                if (!TextUtils.isEmpty(this.pvs.getBidAdm())) {
                    com.bytedance.sdk.openadsdk.Wyp.vG.pvs(this.yiw.get(0), this.IP.vG());
                }
                this.Jd.onAdLoaded(pAGBannerAd);
            } else {
                this.Jd.onError(103, com.bytedance.sdk.openadsdk.core.yiw.pvs(103));
                pvs(103);
            }
        }
    }

    private void pvs(int i) {
        List<cR> list = this.sUS;
        com.bytedance.sdk.openadsdk.Wyp.vG.pvs().pvs(com.bytedance.sdk.openadsdk.Wyp.pvs.Jd.icD().pvs(this.Mxy).vG(this.pvs.getCodeId()).NB((list == null || list.size() <= 0) ? "" : this.sUS.get(0).Yjw()).icD(i).sUS(com.bytedance.sdk.openadsdk.core.yiw.pvs(i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(int i, String str) {
        if (this.NB.getAndSet(false)) {
            PAGBannerAdLoadListener pAGBannerAdLoadListener = this.Jd;
            if (pAGBannerAdLoadListener != null) {
                pAGBannerAdLoadListener.onError(i, str);
            }
            pvs pvsVar = this.so;
            if (pvsVar != null) {
                pvsVar.pvs();
            }
            pvs();
        }
    }

    private PAGBannerAd pvs(cR cRVar) {
        if (this.Mxy != 1) {
            return null;
        }
        if (cRVar.od() != null) {
            return new com.bytedance.sdk.openadsdk.core.bannerexpress.vG(this.vG, cRVar, this.pvs);
        }
        return new com.bytedance.sdk.openadsdk.core.bannerexpress.pvs(this.vG, cRVar, this.pvs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs() {
        List<cR> list = this.sUS;
        if (list != null) {
            list.clear();
        }
        List<cR> list2 = this.yiw;
        if (list2 != null) {
            list2.clear();
        }
        pvs(true);
        icD(true);
        vG(true);
        icD();
    }

    private void pvs(boolean z) {
        try {
            ScheduledFuture<?> scheduledFuture = this.kj;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            com.bytedance.sdk.component.utils.Ju.pvs("ExpressAdLoadManager", "CheckValidFutureTask-->cancel......success=".concat(String.valueOf(this.kj.cancel(z))));
        } catch (Throwable unused) {
        }
    }

    private void icD(boolean z) {
        try {
            ScheduledFuture<?> scheduledFuture = this.Ju;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.Ju.cancel(z);
        } catch (Throwable unused) {
        }
    }

    private void vG(boolean z) {
        try {
            ScheduledFuture<?> scheduledFuture = this.qh;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            com.bytedance.sdk.component.utils.Ju.pvs("ExpressAdLoadManager", "TimeOutFutureTask-->cancel......success=".concat(String.valueOf(this.qh.cancel(z))));
        } catch (Throwable unused) {
        }
    }

    private void icD() {
        Wyp.remove(this);
    }
}
