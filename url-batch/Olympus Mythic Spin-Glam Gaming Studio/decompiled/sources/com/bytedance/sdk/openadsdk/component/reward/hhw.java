package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.rp;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.core.cn.zn.zmn;
import com.bytedance.sdk.openadsdk.core.doe;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.bjh;
import com.bytedance.sdk.openadsdk.core.model.kjb;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class hhw {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile hhw zmn;
    private com.bytedance.sdk.component.zg.fs.zn btk;
    private final Context fs;
    private final AtomicBoolean zn = new AtomicBoolean(false);
    private final List<zn> fb = Collections.synchronizedList(new ArrayList());
    private final rp.zmn hhw = new rp.zmn() { // from class: com.bytedance.sdk.openadsdk.component.reward.hhw.6
        @Override // com.bytedance.sdk.component.utils.rp.zmn
        public void zmn(Context context, Intent intent, boolean z, int i) {
            if (z) {
                if (hhw.this.btk == null) {
                    hhw hhwVar = hhw.this;
                    hhwVar.btk = new com.bytedance.sdk.openadsdk.component.reward.zn("fsv net connect task", hhwVar.fb);
                }
                com.bytedance.sdk.component.utils.bvs.zmn().post(hhw.this.btk);
            }
        }
    };

    public static hhw zmn(Context context) {
        if (zmn == null) {
            synchronized (hhw.class) {
                try {
                    if (zmn == null) {
                        zmn = new hhw(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    private hhw(Context context) {
        this.fs = context == null ? com.bytedance.sdk.openadsdk.core.kgc.zmn() : context.getApplicationContext();
        fs();
    }

    public void zmn() {
        try {
            btk.zmn(this.fs).zmn();
        } catch (Throwable unused) {
        }
    }

    public void zmn(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        fs(adSlot);
    }

    private void fs(final AdSlot adSlot) {
        kjb kjbVar = new kjb();
        kjbVar.zn = 2;
        if (com.bytedance.sdk.openadsdk.core.kgc.fb().mw(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            kjbVar.bvs = 2;
        }
        com.bytedance.sdk.openadsdk.core.kgc.zn().zmn(adSlot, kjbVar, 8, new doe() { // from class: com.bytedance.sdk.openadsdk.component.reward.hhw.1
            boolean zmn = false;

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
            public void zmn(int i, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.phc
            public String zmn() {
                return btk.zmn(hhw.this.fs).zmn(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.phc
            public boolean zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
                boolean zmn2 = btk.zmn(hhw.this.fs).zmn(zmnVar);
                this.zmn = zmn2;
                return zmn2;
            }

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
            public void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, com.bytedance.sdk.openadsdk.core.model.zn znVar) {
                if (this.zmn || zmnVar.btk() == null || zmnVar.btk().isEmpty()) {
                    return;
                }
                hhw.this.zmn(zmnVar, new kw(hhw.this.fs, zmnVar), adSlot, true, (PAGInterstitialAdLoadListener) null);
            }
        });
    }

    public void zmn(AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        fs(adSlot, pAGInterstitialAdLoadListener);
    }

    private void fs(final AdSlot adSlot, final PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        final long currentTimeMillis = System.currentTimeMillis();
        kjb kjbVar = new kjb();
        kjbVar.zn = 1;
        if (com.bytedance.sdk.openadsdk.core.kgc.fb().mw(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            kjbVar.bvs = 2;
        }
        com.bytedance.sdk.openadsdk.core.kgc.zn().zmn(adSlot, kjbVar, 8, new doe() { // from class: com.bytedance.sdk.openadsdk.component.reward.hhw.2
            boolean zmn = false;

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
            public void zmn(int i, String str) {
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(i, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
            public void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, com.bytedance.sdk.openadsdk.core.model.zn znVar) {
                if (zmnVar.btk() != null && !zmnVar.btk().isEmpty()) {
                    kw kwVar = new kw(hhw.this.fs, zmnVar);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.doe.zmn.fb.zmn().zmn(zmnVar.btk().isEmpty() ? null : zmnVar.btk().get(0));
                        com.bytedance.sdk.openadsdk.cyb.fb.zmn(zmnVar.nps(), System.currentTimeMillis() - currentTimeMillis);
                    }
                    if (pAGInterstitialAdLoadListener != null && com.bytedance.sdk.openadsdk.core.kgc.fb().kjb() == 0) {
                        hhw.this.zmn(adSlot, zmnVar, pAGInterstitialAdLoadListener, kwVar.zmn(), this.zmn);
                    }
                    hhw.this.zmn(zmnVar, kwVar, adSlot, false, pAGInterstitialAdLoadListener);
                    return;
                }
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.bvs.zmn(-3));
                    znVar.zmn(-3);
                    znVar.zn(5);
                    com.bytedance.sdk.openadsdk.core.model.zn.zmn(znVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.phc
            public String zmn() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String zmn2 = btk.zmn(hhw.this.fs).zmn(adSlot.getCodeId(), true);
                if (TextUtils.isEmpty(zmn2)) {
                    return null;
                }
                return zmn2;
            }

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.phc
            public boolean zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
                boolean zmn2 = btk.zmn(hhw.this.fs).zmn(zmnVar);
                this.zmn = zmn2;
                return zmn2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, PAGInterstitialAd pAGInterstitialAd, final boolean z) {
        com.bytedance.sdk.openadsdk.core.cn.fs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.hhw.3
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    hhw.this.zn(adSlot);
                } else {
                    btk.zmn(hhw.this.fs).zmn(adSlot, zmnVar);
                    hhw.this.zn(adSlot);
                }
            }
        });
        if (pAGInterstitialAdLoadListener != null) {
            pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, kw kwVar, AdSlot adSlot, boolean z, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        if (!z) {
            com.bytedance.sdk.openadsdk.rt.zn.zmn().zmn(zmnVar.nps());
        }
        fs fsVar = new fs(new zmn(this.fs, adSlot, zmnVar, pAGInterstitialAdLoadListener, false), zmnVar);
        zmn(zmnVar);
        for (int i = 0; i < zmnVar.btk().size(); i++) {
            nqi nqiVar = zmnVar.btk().get(i);
            int cd = nqiVar.cd();
            if (i == 0 && cd == 43) {
                nqiVar.mrt().hhw(0);
            }
            if (com.bytedance.sdk.openadsdk.component.reward.zn.zg.zmn(nqiVar)) {
                if (com.bytedance.sdk.openadsdk.component.reward.zn.zg.btk()) {
                    nqiVar.mrt().hhw(0);
                }
                if (!zmnVar.bvs() && nqiVar.cd() != 43) {
                    return;
                }
            }
            zmn(zmnVar, nqiVar, kwVar, adSlot, z, fsVar);
            if (!zmnVar.bvs()) {
            }
        }
    }

    private void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        bjh rc = zmnVar.rc();
        int i = zmnVar.bvs() ? 10 : 1;
        if (rc != null) {
            i = rc.cyb();
        }
        for (final int i2 = 0; i2 < zmnVar.btk().size() && i2 < i; i2++) {
            com.bytedance.sdk.openadsdk.core.cn.zn.zmn.zmn().zmn(zmnVar.btk().get(i2), new zmn.InterfaceC0157zmn() { // from class: com.bytedance.sdk.openadsdk.component.reward.hhw.4
                @Override // com.bytedance.sdk.openadsdk.core.cn.zn.zmn.InterfaceC0157zmn
                public void zmn(boolean z) {
                    com.bytedance.sdk.component.utils.iqz.zmn("ScreenVideoLoadM", "onCachedResponse: i=" + i2 + ", isSuccess=" + z);
                }
            });
        }
    }

    private void zmn(final com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, nqi nqiVar, final kw kwVar, final AdSlot adSlot, final boolean z, final fs fsVar) {
        if (z && !am.zn(nqiVar) && nqi.btk(nqiVar) && com.bytedance.sdk.openadsdk.core.kgc.fb().kjb(adSlot.getCodeId()).fb == 1 && !com.bytedance.sdk.component.utils.kgc.fb(this.fs)) {
            zmn(new zn(nqiVar, adSlot, zmnVar));
            return;
        }
        boolean z2 = false;
        boolean z3 = fsVar != null && com.bytedance.sdk.openadsdk.core.kgc.fb().kjb() == 1;
        if (am.zn(nqiVar)) {
            if (z) {
                btk.zmn(this.fs).zmn(adSlot, zmnVar);
            }
        } else if (nqi.btk(nqiVar)) {
            if (nqiVar.mrt() != null) {
                com.bytedance.sdk.openadsdk.core.cn.zmn.fs zmn2 = nqi.zmn(CacheDirFactory.getICacheDir(nqiVar.hqs()).zmn(), nqiVar);
                zmn2.zmn("material_meta", nqiVar);
                zmn2.zmn("ad_slot", adSlot);
                com.bytedance.sdk.openadsdk.core.cn.btk.zmn.zmn(zmn2, new com.bykv.vk.openvk.zmn.zmn.zmn.btk.fs() { // from class: com.bytedance.sdk.openadsdk.component.reward.hhw.5
                    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn.InterfaceC0101zmn
                    public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar, int i) {
                        kwVar.fs();
                        if (z) {
                            btk.zmn(hhw.this.fs).zmn(adSlot, zmnVar);
                        } else {
                            if (fsVar == null || com.bytedance.sdk.openadsdk.core.kgc.fb().kjb() != 1) {
                                return;
                            }
                            fsVar.onAdLoaded(kwVar.zmn());
                        }
                    }

                    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn.InterfaceC0101zmn
                    public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar, int i, String str) {
                        if (fsVar == null || com.bytedance.sdk.openadsdk.core.kgc.fb().kjb() != 1) {
                            return;
                        }
                        fsVar.onError(i, str);
                    }
                });
            } else {
                z2 = z3;
            }
            z3 = z2;
        } else if (z) {
            btk.zmn(this.fs).zmn(adSlot, zmnVar);
        }
        if (z3) {
            fsVar.onAdLoaded(kwVar.zmn());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn(AdSlot adSlot) {
        btk.zmn(this.fs).zmn(adSlot.getCodeId());
    }

    private void zmn(zn znVar) {
        if (znVar == null) {
            return;
        }
        if (this.fb.size() > 0) {
            this.fb.remove(0);
        }
        this.fb.add(znVar);
    }

    private void fs() {
        if (this.zn.get()) {
            return;
        }
        this.zn.set(true);
        rp.zmn(this.hhw, this.fs);
    }

    private void zn() {
        if (this.zn.get()) {
            this.zn.set(false);
            try {
                rp.zmn(this.hhw);
            } catch (Exception unused) {
            }
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.btk != null) {
            try {
                com.bytedance.sdk.component.utils.bvs.zmn().removeCallbacks(this.btk);
            } catch (Exception unused) {
            }
            this.btk = null;
        }
        zn();
    }

    private static class zn extends com.bytedance.sdk.component.zg.fs.zn {
        final AdSlot fs;
        final nqi zmn;
        final com.bytedance.sdk.openadsdk.core.model.zmn zn;

        zn(nqi nqiVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
            super("Fullscreen Task");
            this.zmn = nqiVar;
            this.fs = adSlot;
            this.zn = zmnVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            nqi nqiVar = this.zmn;
            if (nqiVar == null || nqiVar.mrt() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.cn.zmn.fs zmn = nqi.zmn(CacheDirFactory.getICacheDir(this.zmn.hqs()).zmn(), this.zmn);
            zmn.zmn("material_meta", this.zmn);
            zmn.zmn("ad_slot", this.fs);
            com.bytedance.sdk.openadsdk.core.cn.btk.zmn.zmn(zmn, new com.bykv.vk.openvk.zmn.zmn.zmn.btk.fs() { // from class: com.bytedance.sdk.openadsdk.component.reward.hhw.zn.1
                @Override // com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn.InterfaceC0101zmn
                public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar, int i, String str) {
                }

                @Override // com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn.InterfaceC0101zmn
                public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar, int i) {
                    btk zmn2 = btk.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn());
                    zn znVar2 = zn.this;
                    zmn2.zmn(znVar2.fs, znVar2.zn);
                }
            });
        }
    }

    private static class zmn implements PAGInterstitialAdLoadListener {
        private final boolean btk;
        private final PAGInterstitialAdLoadListener fb;
        private final AdSlot fs;
        private final Context zmn;
        private final com.bytedance.sdk.openadsdk.core.model.zmn zn;

        public zmn(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, boolean z) {
            this.zmn = context;
            this.fs = adSlot;
            this.zn = zmnVar;
            this.fb = pAGInterstitialAdLoadListener;
            this.btk = z;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.nps
        public void onError(int i, String str) {
            PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = this.fb;
            if (pAGInterstitialAdLoadListener != null) {
                pAGInterstitialAdLoadListener.onError(i, str);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            hhw.zmn(this.zmn).zmn(this.fs, this.zn, this.fb, pAGInterstitialAd, this.btk);
        }
    }

    private static class fs implements PAGInterstitialAdLoadListener {
        private final com.bytedance.sdk.openadsdk.core.model.zmn fb;
        private final AtomicBoolean fs;
        private final PAGInterstitialAdLoadListener zmn;
        private final AtomicInteger zn;

        private fs(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
            this.fs = new AtomicBoolean(false);
            this.zmn = pAGInterstitialAdLoadListener;
            this.fb = zmnVar;
            this.zn = new AtomicInteger(zmn());
        }

        private int zmn() {
            if (!this.fb.hhw()) {
                return 0;
            }
            int i = 0;
            for (int i2 = 0; i2 < this.fb.btk().size(); i2++) {
                nqi nqiVar = this.fb.btk().get(i2);
                if (nqiVar != null && !am.zn(nqiVar) && nqiVar.mrt() != null) {
                    i++;
                }
            }
            return i;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.nps
        public void onError(int i, String str) {
            if (this.zn.decrementAndGet() > 0 || !this.fs.compareAndSet(false, true)) {
                return;
            }
            this.zmn.onError(i, str);
            com.bytedance.sdk.openadsdk.cyb.fb.zmn("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.component.reward.hhw.fs.1
                @Override // com.bytedance.sdk.openadsdk.cyb.fs
                @Nullable
                public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", fs.this.fb.zn());
                    return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("choose_ad_load_error").fs(jSONObject.toString());
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            this.zn.decrementAndGet();
            if (this.zmn == null || !this.fs.compareAndSet(false, true)) {
                return;
            }
            this.zmn.onAdLoaded(pAGInterstitialAd);
        }
    }

    public void zmn(String str, nqi nqiVar) {
        btk.zmn(this.fs).zmn(str, nqiVar);
    }
}
