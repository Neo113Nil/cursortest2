package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.ny;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.component.reward.qh;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.core.model.uc;
import com.bytedance.sdk.openadsdk.core.vA;
import com.bytedance.sdk.openadsdk.core.video.icD.pvs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: RewardVideoLoadManager.java */
/* loaded from: classes2.dex */
public class kj {
    private static volatile kj pvs;
    private com.bytedance.sdk.component.so.so NB;
    private final Context icD;
    private final AtomicBoolean vG = new AtomicBoolean(false);
    private final List<icD> Jd = Collections.synchronizedList(new ArrayList());
    private final ny.pvs sUS = new ny.pvs() { // from class: com.bytedance.sdk.openadsdk.component.reward.kj.7
        @Override // com.bytedance.sdk.component.utils.ny.pvs
        public void pvs(Context context, Intent intent, boolean z, int i) {
            if (z) {
                if (kj.this.NB == null) {
                    kj.this.NB = new com.bytedance.sdk.openadsdk.component.reward.icD("net connect task", kj.this.Jd);
                }
                com.bytedance.sdk.component.utils.so.pvs().post(kj.this.NB);
            }
        }
    };

    public static kj pvs(Context context) {
        if (pvs == null) {
            synchronized (kj.class) {
                if (pvs == null) {
                    pvs = new kj(context);
                }
            }
        }
        return pvs;
    }

    private kj(Context context) {
        this.icD = context == null ? mnm.pvs() : context.getApplicationContext();
        icD();
    }

    public void pvs(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || qh.pvs(this.icD).icD(adSlot.getCodeId()) != null) {
            return;
        }
        icD(adSlot);
    }

    public void pvs() {
        try {
            qh.pvs(this.icD).pvs();
        } catch (Throwable unused) {
        }
    }

    public void pvs(AdSlot adSlot, com.bytedance.sdk.openadsdk.common.Jd jd) {
        icD(adSlot, jd);
    }

    public void icD(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getBidAdm())) {
            pvs(adSlot, true, null);
        }
    }

    private void icD(AdSlot adSlot, com.bytedance.sdk.openadsdk.common.Jd jd) {
        com.bytedance.sdk.openadsdk.core.model.pvs icD2;
        if (TextUtils.isEmpty(adSlot.getBidAdm()) && (icD2 = qh.pvs(this.icD).icD(adSlot.getCodeId())) != null && icD2.Jd()) {
            bNS bns = new bNS(this.icD, icD2, adSlot);
            if (!icD2.sUS() && !rCZ.qh(icD2.NB())) {
                bns.icD();
            }
            if (jd != null) {
                if (!icD2.sUS() && (jd instanceof PAGRewardedAdLoadListener) && mnm.Jd().uc() == 0) {
                    ((PAGRewardedAdLoadListener) jd).onAdLoaded(bns.pvs());
                }
                pvs pvsVar = new pvs(jd, icD2);
                for (int i = 0; i < icD2.vG().size(); i++) {
                    pvs(icD2.vG().get(i), adSlot, pvsVar, bns, icD2.sUS());
                    if (icD2.qh()) {
                        break;
                    }
                }
            }
            for (int i2 = 0; i2 < icD2.vG().size(); i2++) {
                com.bytedance.sdk.openadsdk.core.video.icD.pvs.pvs().pvs(icD2.vG().get(i2), new pvs.InterfaceC0082pvs() { // from class: com.bytedance.sdk.openadsdk.component.reward.kj.1
                });
            }
            return;
        }
        pvs(adSlot, false, jd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (com.bytedance.sdk.openadsdk.core.mnm.Jd().uc() != 1) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pvs(cR cRVar, AdSlot adSlot, final pvs pvsVar, final bNS bns, final boolean z) {
        boolean z2;
        boolean z3 = false;
        if (pvsVar != null) {
            z2 = true;
            if (!z) {
            }
            if (rCZ.qh(cRVar)) {
                com.bytedance.sdk.openadsdk.core.video.pvs.icD pvs2 = cR.pvs(CacheDirFactory.getICacheDir(cRVar.LHy()).pvs(), cRVar);
                pvs2.pvs("material_meta", cRVar);
                pvs2.pvs("ad_slot", adSlot);
                com.bytedance.sdk.openadsdk.core.video.Jd.pvs.pvs(pvs2, new com.bykv.vk.openvk.component.video.api.NB.icD() { // from class: com.bytedance.sdk.openadsdk.component.reward.kj.2
                    @Override // com.bykv.vk.openvk.component.video.api.NB.pvs.InterfaceC0017pvs
                    public void pvs(com.bykv.vk.openvk.component.video.api.vG.vG vGVar, int i) {
                        Log.d("RewardVideoLoadManager", "onVideoPreloadSuccess: ");
                        if (pvsVar != null) {
                            if (z || mnm.Jd().uc() == 1) {
                                pvsVar.onAdLoaded(bns.pvs());
                            }
                        }
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.NB.pvs.InterfaceC0017pvs
                    public void pvs(com.bykv.vk.openvk.component.video.api.vG.vG vGVar, int i, String str) {
                        if (pvsVar != null) {
                            if (z || mnm.Jd().uc() == 1) {
                                pvsVar.onError(i, str);
                            }
                        }
                    }
                });
            } else {
                z3 = z2;
            }
            if (z3) {
                return;
            }
            pvsVar.onAdLoaded(bns.pvs());
            return;
        }
        z2 = false;
        if (rCZ.qh(cRVar)) {
        }
        if (z3) {
        }
    }

    private void pvs(final AdSlot adSlot, final boolean z, final com.bytedance.sdk.openadsdk.common.Jd jd) {
        if (com.bytedance.sdk.component.utils.Ju.Jd()) {
            com.bykv.vk.openvk.component.video.api.sUS.icD.pvs(adSlot.getBidAdm());
        }
        final long currentTimeMillis = System.currentTimeMillis();
        uc ucVar = new uc();
        ucVar.icD = z ? 2 : 1;
        if (mnm.Jd().kj(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            ucVar.so = 2;
        }
        mnm.vG().pvs(adSlot, ucVar, 7, new vA.pvs() { // from class: com.bytedance.sdk.openadsdk.component.reward.kj.3
            @Override // com.bytedance.sdk.openadsdk.core.vA.pvs
            public void pvs(int i, String str) {
                com.bytedance.sdk.openadsdk.common.Jd jd2;
                if (z || (jd2 = jd) == null) {
                    return;
                }
                jd2.onError(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.vA.pvs
            public void pvs(com.bytedance.sdk.openadsdk.core.model.pvs pvsVar, com.bytedance.sdk.openadsdk.core.model.icD icd) {
                com.bytedance.sdk.openadsdk.common.Jd jd2;
                if (pvsVar.vG() != null && !pvsVar.vG().isEmpty()) {
                    bNS bns = new bNS(kj.this.icD, pvsVar, adSlot);
                    if (!z) {
                        if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                            com.bytedance.sdk.openadsdk.Wyp.vG.pvs(pvsVar.NB(), System.currentTimeMillis() - currentTimeMillis);
                        }
                        if (!pvsVar.sUS() && (jd instanceof PAGRewardedAdLoadListener) && mnm.Jd().uc() == 0) {
                            ((PAGRewardedAdLoadListener) jd).onAdLoaded(bns.pvs());
                        }
                    }
                    pvs pvsVar2 = new pvs(jd, pvsVar);
                    for (int i = 0; i < pvsVar.vG().size(); i++) {
                        kj.this.pvs(pvsVar, pvsVar.vG().get(i), bns, adSlot, z, pvsVar2, pvsVar.sUS());
                        if (pvsVar.qh()) {
                            return;
                        }
                    }
                    return;
                }
                if (z || (jd2 = jd) == null) {
                    return;
                }
                jd2.onError(-3, com.bytedance.sdk.openadsdk.core.yiw.pvs(-3));
                icd.pvs(-3);
                com.bytedance.sdk.openadsdk.core.model.icD.pvs(icd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(final com.bytedance.sdk.openadsdk.core.model.pvs pvsVar, cR cRVar, final bNS bns, final AdSlot adSlot, final boolean z, final pvs pvsVar2, final boolean z2) {
        com.bytedance.sdk.openadsdk.core.video.icD.pvs.pvs().pvs(cRVar, new pvs.InterfaceC0082pvs() { // from class: com.bytedance.sdk.openadsdk.component.reward.kj.4
        });
        boolean z3 = true;
        if (z && !rCZ.qh(cRVar) && mnm.Jd().Gp(adSlot.getCodeId()).Jd == 1 && !com.bytedance.sdk.component.utils.mnm.Jd(this.icD)) {
            pvs(new icD(cRVar, adSlot, pvsVar));
            return;
        }
        boolean z4 = false;
        if (pvsVar2 == null || (!z2 && mnm.Jd().uc() != 1)) {
            z3 = false;
        }
        if (!rCZ.qh(cRVar)) {
            if (cRVar.od() != null) {
                com.bytedance.sdk.openadsdk.core.video.pvs.icD pvs2 = cR.pvs(CacheDirFactory.getICacheDir(cRVar.LHy()).pvs(), cRVar);
                pvs2.pvs("material_meta", cRVar);
                pvs2.pvs("ad_slot", adSlot);
                com.bytedance.sdk.openadsdk.core.video.Jd.pvs.pvs(pvs2, new com.bykv.vk.openvk.component.video.api.NB.icD() { // from class: com.bytedance.sdk.openadsdk.component.reward.kj.5
                    @Override // com.bykv.vk.openvk.component.video.api.NB.pvs.InterfaceC0017pvs
                    public void pvs(com.bykv.vk.openvk.component.video.api.vG.vG vGVar, int i) {
                        bns.icD();
                        if (z) {
                            qh.pvs(kj.this.icD).pvs(adSlot, pvsVar);
                        } else if (pvsVar2 != null) {
                            if (z2 || mnm.Jd().uc() == 1) {
                                pvsVar2.onAdLoaded(bns.pvs());
                            }
                        }
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.NB.pvs.InterfaceC0017pvs
                    public void pvs(com.bykv.vk.openvk.component.video.api.vG.vG vGVar, int i, String str) {
                        if (pvsVar2 != null) {
                            if (z2 || mnm.Jd().uc() == 1) {
                                pvsVar2.onError(i, str);
                            }
                        }
                    }
                });
            } else {
                z4 = z3;
            }
            z3 = z4;
        } else {
            qh.pvs(this.icD).pvs(adSlot, pvsVar);
        }
        if (z3) {
            pvsVar2.onAdLoaded(bns.pvs());
        }
    }

    /* compiled from: RewardVideoLoadManager.java */
    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.kj$6, reason: invalid class name */
    class AnonymousClass6 implements qh.pvs<Object> {
        final /* synthetic */ boolean Jd;
        final /* synthetic */ AdSlot NB;
        final /* synthetic */ bNS icD;
        final /* synthetic */ boolean pvs;
        final /* synthetic */ com.bytedance.sdk.openadsdk.core.model.pvs sUS;
        final /* synthetic */ pvs vG;

        AnonymousClass6(boolean z, bNS bns, pvs pvsVar, boolean z2, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.pvs pvsVar2) {
            this.pvs = z;
            this.icD = bns;
            this.vG = pvsVar;
            this.Jd = z2;
            this.NB = adSlot;
            this.sUS = pvsVar2;
        }

        @Override // com.bytedance.sdk.openadsdk.component.reward.qh.pvs
        public void pvs(boolean z, Object obj) {
            if (z) {
                this.icD.icD();
            }
            if (this.pvs) {
                if (z) {
                    qh.pvs(kj.this.icD).pvs(this.NB, this.sUS);
                }
            } else {
                if (z) {
                    if (this.vG != null) {
                        if (this.Jd || mnm.Jd().uc() == 1) {
                            this.vG.onAdLoaded(this.icD.pvs());
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (this.vG != null) {
                    if (this.Jd || mnm.Jd().uc() == 1) {
                        this.vG.onError(-1, "");
                    }
                }
            }
        }
    }

    public void pvs(String str) {
        qh.pvs(this.icD).pvs(str);
    }

    private void pvs(icD icd) {
        if (icd == null) {
            return;
        }
        if (this.Jd.size() > 0) {
            this.Jd.remove(0);
        }
        this.Jd.add(icd);
    }

    private void icD() {
        if (this.vG.get()) {
            return;
        }
        this.vG.set(true);
        ny.pvs(this.sUS, this.icD);
    }

    private void vG() {
        if (this.vG.get()) {
            this.vG.set(false);
            try {
                ny.pvs(this.sUS);
            } catch (Exception unused) {
            }
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.NB != null) {
            try {
                com.bytedance.sdk.component.utils.so.pvs().removeCallbacks(this.NB);
            } catch (Exception unused) {
            }
            this.NB = null;
        }
        vG();
    }

    /* compiled from: RewardVideoLoadManager.java */
    public static class icD extends com.bytedance.sdk.component.so.so {
        AdSlot icD;
        cR pvs;
        com.bytedance.sdk.openadsdk.core.model.pvs vG;

        icD(cR cRVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.pvs pvsVar) {
            super("Reward Task");
            this.pvs = cRVar;
            this.icD = adSlot;
            this.vG = pvsVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.pvs == null || this.pvs.od() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.video.pvs.icD pvs = cR.pvs(CacheDirFactory.getICacheDir(this.pvs.LHy()).pvs(), this.pvs);
            pvs.pvs("material_meta", this.pvs);
            pvs.pvs("ad_slot", this.icD);
            com.bytedance.sdk.openadsdk.core.video.Jd.pvs.pvs(pvs, new com.bykv.vk.openvk.component.video.api.NB.icD() { // from class: com.bytedance.sdk.openadsdk.component.reward.kj.icD.1
                @Override // com.bykv.vk.openvk.component.video.api.NB.pvs.InterfaceC0017pvs
                public void pvs(com.bykv.vk.openvk.component.video.api.vG.vG vGVar, int i, String str) {
                }

                @Override // com.bykv.vk.openvk.component.video.api.NB.pvs.InterfaceC0017pvs
                public void pvs(com.bykv.vk.openvk.component.video.api.vG.vG vGVar, int i) {
                    qh.pvs(mnm.pvs()).pvs(icD.this.icD, icD.this.vG);
                }
            });
        }

        /* compiled from: RewardVideoLoadManager.java */
        /* renamed from: com.bytedance.sdk.openadsdk.component.reward.kj$icD$2, reason: invalid class name */
        class AnonymousClass2 implements qh.pvs<Object> {
            AnonymousClass2() {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.qh.pvs
            public void pvs(boolean z, Object obj) {
                if (z) {
                    qh.pvs(mnm.pvs()).pvs(icD.this.icD, icD.this.vG);
                }
            }
        }
    }

    /* compiled from: RewardVideoLoadManager.java */
    private static class pvs implements PAGRewardedAdLoadListener {
        private final com.bytedance.sdk.openadsdk.core.model.pvs Jd;
        private final AtomicBoolean icD;
        private final com.bytedance.sdk.openadsdk.common.Jd pvs;
        private final AtomicInteger vG;

        private pvs(com.bytedance.sdk.openadsdk.common.Jd jd, com.bytedance.sdk.openadsdk.core.model.pvs pvsVar) {
            this.icD = new AtomicBoolean(false);
            this.pvs = jd;
            this.Jd = pvsVar;
            this.vG = new AtomicInteger(pvs());
        }

        private int pvs() {
            if (!this.Jd.Jd()) {
                return 0;
            }
            int i = 0;
            for (int i2 = 0; i2 < this.Jd.vG().size(); i2++) {
                cR cRVar = this.Jd.vG().get(i2);
                if (cRVar != null && !rCZ.qh(cRVar) && cRVar.od() != null) {
                    i++;
                }
            }
            return i;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.Jd
        public void onError(int i, String str) {
            if (this.vG.decrementAndGet() <= 0 && (this.pvs instanceof PAGRewardedAdLoadListener) && this.icD.compareAndSet(false, true)) {
                this.pvs.onError(i, str);
                com.bytedance.sdk.openadsdk.Wyp.vG.pvs("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.Wyp.icD() { // from class: com.bytedance.sdk.openadsdk.component.reward.kj.pvs.1
                    @Override // com.bytedance.sdk.openadsdk.Wyp.icD
                    public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("req_id", pvs.this.Jd.pvs());
                        return com.bytedance.sdk.openadsdk.Wyp.pvs.Jd.icD().pvs("choose_ad_load_error").icD(jSONObject.toString());
                    }
                });
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            this.vG.decrementAndGet();
            if ((this.pvs instanceof PAGRewardedAdLoadListener) && this.icD.compareAndSet(false, true)) {
                ((PAGRewardedAdLoadListener) this.pvs).onAdLoaded(pAGRewardedAd);
            }
        }
    }
}
