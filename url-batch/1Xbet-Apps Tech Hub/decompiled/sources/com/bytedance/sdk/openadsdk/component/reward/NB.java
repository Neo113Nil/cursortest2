package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ny;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.component.reward.Jd;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.core.model.uc;
import com.bytedance.sdk.openadsdk.core.vA;
import com.bytedance.sdk.openadsdk.core.video.icD.pvs;
import com.bytedance.sdk.openadsdk.utils.gA;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: FullScreenVideoLoadManager.java */
/* loaded from: classes2.dex */
public class NB {
    private static volatile NB pvs;
    private com.bytedance.sdk.component.so.so NB;
    private final Context icD;
    private final AtomicBoolean vG = new AtomicBoolean(false);
    private final List<icD> Jd = Collections.synchronizedList(new ArrayList());
    private final ny.pvs sUS = new ny.pvs() { // from class: com.bytedance.sdk.openadsdk.component.reward.NB.7
        @Override // com.bytedance.sdk.component.utils.ny.pvs
        public void pvs(Context context, Intent intent, boolean z, int i) {
            if (z) {
                if (NB.this.NB == null) {
                    NB.this.NB = new com.bytedance.sdk.openadsdk.component.reward.icD("fsv net connect task", NB.this.Jd);
                }
                com.bytedance.sdk.component.utils.so.pvs().post(NB.this.NB);
            }
        }
    };

    public static NB pvs(Context context) {
        if (pvs == null) {
            synchronized (NB.class) {
                if (pvs == null) {
                    pvs = new NB(context);
                }
            }
        }
        return pvs;
    }

    private NB(Context context) {
        this.icD = context == null ? mnm.pvs() : context.getApplicationContext();
        icD();
    }

    public void pvs() {
        try {
            Jd.pvs(this.icD).pvs();
        } catch (Throwable unused) {
        }
    }

    public void pvs(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || Jd.pvs(this.icD).icD(adSlot.getCodeId()) != null) {
            return;
        }
        icD(adSlot);
    }

    public void pvs(AdSlot adSlot, com.bytedance.sdk.openadsdk.common.Jd jd) {
        icD(adSlot, jd);
    }

    public void icD(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getBidAdm())) {
            pvs(adSlot, true, gA.pvs(), null);
        }
    }

    private void icD(AdSlot adSlot, com.bytedance.sdk.openadsdk.common.Jd jd) {
        com.bytedance.sdk.openadsdk.core.model.pvs icD2;
        gA pvs2 = gA.pvs();
        if (TextUtils.isEmpty(adSlot.getBidAdm()) && (icD2 = Jd.pvs(this.icD).icD(adSlot.getCodeId())) != null && icD2.Jd()) {
            IP ip = new IP(this.icD, icD2);
            if (!icD2.sUS() && !rCZ.qh(icD2.NB())) {
                ip.icD();
            }
            if (jd != null) {
                if (!icD2.sUS() && (jd instanceof PAGInterstitialAdLoadListener) && mnm.Jd().uc() == 0) {
                    ((PAGInterstitialAdLoadListener) jd).onAdLoaded(ip.pvs());
                }
                pvs pvsVar = new pvs(jd, icD2);
                for (int i = 0; i < icD2.vG().size(); i++) {
                    pvs(icD2.vG().get(i), adSlot, pvsVar, pvs2, ip, icD2.sUS());
                    if (icD2.qh()) {
                        break;
                    }
                }
            }
            for (int i2 = 0; i2 < icD2.vG().size(); i2++) {
                com.bytedance.sdk.openadsdk.core.video.icD.pvs.pvs().pvs(icD2.vG().get(i2), new pvs.InterfaceC0082pvs() { // from class: com.bytedance.sdk.openadsdk.component.reward.NB.1
                });
            }
            return;
        }
        pvs(adSlot, false, pvs2, jd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (com.bytedance.sdk.openadsdk.core.mnm.Jd().uc() != 1) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pvs(cR cRVar, AdSlot adSlot, final pvs pvsVar, gA gAVar, final IP ip, final boolean z) {
        boolean z2;
        boolean z3 = false;
        if (pvsVar != null) {
            z2 = true;
            if (!z) {
            }
            if (rCZ.qh(cRVar) && cR.NB(cRVar)) {
                cRVar.od();
                com.bytedance.sdk.openadsdk.core.video.pvs.icD pvs2 = cR.pvs(CacheDirFactory.getICacheDir(cRVar.LHy()).pvs(), cRVar);
                pvs2.pvs("material_meta", cRVar);
                pvs2.pvs("ad_slot", adSlot);
                com.bytedance.sdk.openadsdk.core.video.Jd.pvs.pvs(pvs2, new com.bykv.vk.openvk.component.video.api.NB.icD() { // from class: com.bytedance.sdk.openadsdk.component.reward.NB.2
                    @Override // com.bykv.vk.openvk.component.video.api.NB.pvs.InterfaceC0017pvs
                    public void pvs(com.bykv.vk.openvk.component.video.api.vG.vG vGVar, int i) {
                        if (pvsVar != null) {
                            if (z || mnm.Jd().uc() == 1) {
                                pvsVar.onAdLoaded(ip.pvs());
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
            pvsVar.onAdLoaded(ip.pvs());
            return;
        }
        z2 = false;
        if (rCZ.qh(cRVar)) {
        }
        z3 = z2;
        if (z3) {
        }
    }

    private void pvs(final AdSlot adSlot, final boolean z, final gA gAVar, final com.bytedance.sdk.openadsdk.common.Jd jd) {
        final long currentTimeMillis = System.currentTimeMillis();
        uc ucVar = new uc();
        ucVar.vG = z ? 2 : 1;
        if (mnm.Jd().kj(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            ucVar.so = 2;
        }
        mnm.vG().pvs(adSlot, ucVar, 8, new vA.pvs() { // from class: com.bytedance.sdk.openadsdk.component.reward.NB.3
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
                    IP ip = new IP(NB.this.icD, pvsVar);
                    if (!z) {
                        if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                            com.bytedance.sdk.openadsdk.Wyp.vG.pvs(pvsVar.NB(), System.currentTimeMillis() - currentTimeMillis);
                        }
                        if (!pvsVar.sUS() && (jd instanceof PAGInterstitialAdLoadListener) && mnm.Jd().uc() == 0) {
                            ((PAGInterstitialAdLoadListener) jd).onAdLoaded(ip.pvs());
                        }
                    }
                    pvs pvsVar2 = new pvs(jd, pvsVar);
                    for (int i = 0; i < pvsVar.vG().size(); i++) {
                        NB.this.pvs(pvsVar, pvsVar.vG().get(i), ip, adSlot, z, gAVar, pvsVar2, pvsVar.sUS());
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
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
    
        if (r18 != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pvs(final com.bytedance.sdk.openadsdk.core.model.pvs pvsVar, cR cRVar, final IP ip, final AdSlot adSlot, final boolean z, gA gAVar, final pvs pvsVar2, final boolean z2) {
        com.bytedance.sdk.openadsdk.core.video.icD.pvs.pvs().pvs(cRVar, new pvs.InterfaceC0082pvs() { // from class: com.bytedance.sdk.openadsdk.component.reward.NB.4
        });
        boolean z3 = true;
        if (z && !rCZ.qh(cRVar) && cR.NB(cRVar) && mnm.Jd().Gp(adSlot.getCodeId()).Jd == 1 && !com.bytedance.sdk.component.utils.mnm.Jd(this.icD)) {
            pvs(new icD(cRVar, adSlot));
            return;
        }
        boolean z4 = false;
        if (pvsVar2 == null || (!z2 && mnm.Jd().uc() != 1)) {
            z3 = false;
        }
        if (!rCZ.qh(cRVar)) {
            if (cR.NB(cRVar)) {
                if (cRVar.od() != null) {
                    com.bytedance.sdk.openadsdk.core.video.pvs.icD pvs2 = cR.pvs(CacheDirFactory.getICacheDir(cRVar.LHy()).pvs(), cRVar);
                    pvs2.pvs("material_meta", cRVar);
                    pvs2.pvs("ad_slot", adSlot);
                    com.bytedance.sdk.openadsdk.core.video.Jd.pvs.pvs(pvs2, new com.bykv.vk.openvk.component.video.api.NB.icD() { // from class: com.bytedance.sdk.openadsdk.component.reward.NB.5
                        @Override // com.bykv.vk.openvk.component.video.api.NB.pvs.InterfaceC0017pvs
                        public void pvs(com.bykv.vk.openvk.component.video.api.vG.vG vGVar, int i) {
                            ip.icD();
                            if (z) {
                                Jd.pvs(NB.this.icD).pvs(adSlot, pvsVar);
                            } else if (pvsVar2 != null) {
                                if (z2 || mnm.Jd().uc() == 1) {
                                    pvsVar2.onAdLoaded(ip.pvs());
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
            }
            if (z3) {
                return;
            }
            pvsVar2.onAdLoaded(ip.pvs());
            return;
        }
        Jd.pvs(this.icD).pvs(adSlot, pvsVar);
        if (z3) {
        }
    }

    /* compiled from: FullScreenVideoLoadManager.java */
    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.NB$6, reason: invalid class name */
    class AnonymousClass6 implements Jd.pvs<Object> {
        final /* synthetic */ boolean Jd;
        final /* synthetic */ AdSlot NB;
        final /* synthetic */ IP icD;
        final /* synthetic */ boolean pvs;
        final /* synthetic */ com.bytedance.sdk.openadsdk.core.model.pvs sUS;
        final /* synthetic */ pvs vG;

        AnonymousClass6(boolean z, IP ip, pvs pvsVar, boolean z2, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.pvs pvsVar2) {
            this.pvs = z;
            this.icD = ip;
            this.vG = pvsVar;
            this.Jd = z2;
            this.NB = adSlot;
            this.sUS = pvsVar2;
        }

        @Override // com.bytedance.sdk.openadsdk.component.reward.Jd.pvs
        public void pvs(boolean z, Object obj) {
            if (z) {
                this.icD.icD();
            }
            if (this.pvs) {
                if (z) {
                    Jd.pvs(NB.this.icD).pvs(this.NB, this.sUS);
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
        Jd.pvs(this.icD).pvs(str);
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

    /* compiled from: FullScreenVideoLoadManager.java */
    private static class icD extends com.bytedance.sdk.component.so.so {
        AdSlot icD;
        cR pvs;
        com.bytedance.sdk.openadsdk.core.model.pvs vG;

        icD(cR cRVar, AdSlot adSlot) {
            super("Fullscreen Task");
            this.pvs = cRVar;
            this.icD = adSlot;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.pvs == null || this.pvs.od() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.video.pvs.icD pvs = cR.pvs(CacheDirFactory.getICacheDir(this.pvs.LHy()).pvs(), this.pvs);
            pvs.pvs("material_meta", this.pvs);
            pvs.pvs("ad_slot", this.icD);
            com.bytedance.sdk.openadsdk.core.video.Jd.pvs.pvs(pvs, new com.bykv.vk.openvk.component.video.api.NB.icD() { // from class: com.bytedance.sdk.openadsdk.component.reward.NB.icD.1
                @Override // com.bykv.vk.openvk.component.video.api.NB.pvs.InterfaceC0017pvs
                public void pvs(com.bykv.vk.openvk.component.video.api.vG.vG vGVar, int i, String str) {
                }

                @Override // com.bykv.vk.openvk.component.video.api.NB.pvs.InterfaceC0017pvs
                public void pvs(com.bykv.vk.openvk.component.video.api.vG.vG vGVar, int i) {
                    Jd.pvs(mnm.pvs()).pvs(icD.this.icD, icD.this.vG);
                }
            });
        }

        /* compiled from: FullScreenVideoLoadManager.java */
        /* renamed from: com.bytedance.sdk.openadsdk.component.reward.NB$icD$2, reason: invalid class name */
        class AnonymousClass2 implements Jd.pvs<Object> {
            AnonymousClass2() {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.Jd.pvs
            public void pvs(boolean z, Object obj) {
                if (z) {
                    Jd.pvs(mnm.pvs()).pvs(icD.this.icD, icD.this.vG);
                }
            }
        }
    }

    /* compiled from: FullScreenVideoLoadManager.java */
    private static class pvs implements PAGInterstitialAdLoadListener {
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
            if (this.vG.decrementAndGet() > 0 || !this.icD.compareAndSet(false, true)) {
                return;
            }
            this.pvs.onError(i, str);
            com.bytedance.sdk.openadsdk.Wyp.vG.pvs("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.Wyp.icD() { // from class: com.bytedance.sdk.openadsdk.component.reward.NB.pvs.1
                @Override // com.bytedance.sdk.openadsdk.Wyp.icD
                public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", pvs.this.Jd.pvs());
                    return com.bytedance.sdk.openadsdk.Wyp.pvs.Jd.icD().pvs("choose_ad_load_error").icD(jSONObject.toString());
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            this.vG.decrementAndGet();
            if ((this.pvs instanceof PAGInterstitialAdLoadListener) && this.icD.compareAndSet(false, true)) {
                ((PAGInterstitialAdLoadListener) this.pvs).onAdLoaded(pAGInterstitialAd);
            }
        }
    }
}
