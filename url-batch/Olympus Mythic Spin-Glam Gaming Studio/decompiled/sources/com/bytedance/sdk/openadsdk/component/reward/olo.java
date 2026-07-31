package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.rp;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
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
public class olo {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile olo zmn;
    private com.bytedance.sdk.component.zg.fs.zn btk;
    private final Context fs;
    private final AtomicBoolean zn = new AtomicBoolean(false);
    private final List<fs> fb = Collections.synchronizedList(new ArrayList());
    private final rp.zmn hhw = new rp.zmn() { // from class: com.bytedance.sdk.openadsdk.component.reward.olo.6
        @Override // com.bytedance.sdk.component.utils.rp.zmn
        public void zmn(Context context, Intent intent, boolean z, int i) {
            if (z) {
                if (olo.this.btk == null) {
                    olo oloVar = olo.this;
                    oloVar.btk = new com.bytedance.sdk.openadsdk.component.reward.zn("net connect task", oloVar.fb);
                }
                com.bytedance.sdk.component.utils.bvs.zmn().post(olo.this.btk);
            }
        }
    };

    public static olo zmn(Context context) {
        if (zmn == null) {
            synchronized (olo.class) {
                try {
                    if (zmn == null) {
                        zmn = new olo(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    private olo(Context context) {
        this.fs = context == null ? com.bytedance.sdk.openadsdk.core.kgc.zmn() : context.getApplicationContext();
        fs();
    }

    public void zmn(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        fs(adSlot);
    }

    private void fs(final AdSlot adSlot) {
        kjb kjbVar = new kjb();
        kjbVar.fs = 2;
        if (com.bytedance.sdk.openadsdk.core.kgc.fb().mw(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            kjbVar.bvs = 2;
        }
        com.bytedance.sdk.openadsdk.core.kgc.zn().zmn(adSlot, kjbVar, 7, new doe() { // from class: com.bytedance.sdk.openadsdk.component.reward.olo.1
            boolean zmn = false;

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
            public void zmn(int i, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.phc
            public String zmn() {
                return cyb.zmn(olo.this.fs).zmn(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.phc
            public boolean zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
                boolean zmn2 = cyb.zmn(olo.this.fs).zmn(zmnVar);
                this.zmn = zmn2;
                return zmn2;
            }

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
            public void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, com.bytedance.sdk.openadsdk.core.model.zn znVar) {
                if (this.zmn || zmnVar.btk() == null || zmnVar.btk().isEmpty()) {
                    return;
                }
                olo.this.zmn(zmnVar, new iqz(olo.this.fs, zmnVar, adSlot), adSlot, true, (PAGRewardedAdLoadListener) null);
            }
        });
    }

    public void zmn(String str, nqi nqiVar) {
        cyb.zmn(this.fs).zmn(str, nqiVar);
    }

    public void zmn() {
        try {
            cyb.zmn(this.fs).zmn();
        } catch (Throwable unused) {
        }
    }

    public void zmn(AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        fs(adSlot, pAGRewardedAdLoadListener);
    }

    private void fs(final AdSlot adSlot, final PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (com.bytedance.sdk.component.utils.cn.zn()) {
            com.bykv.vk.openvk.zmn.zmn.zmn.nps.fs.zmn(adSlot.getBidAdm());
        }
        final long currentTimeMillis = System.currentTimeMillis();
        kjb kjbVar = new kjb();
        kjbVar.fs = 1;
        if (com.bytedance.sdk.openadsdk.core.kgc.fb().mw(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            kjbVar.bvs = 2;
        }
        com.bytedance.sdk.openadsdk.core.kgc.zn().zmn(adSlot, kjbVar, 7, new doe() { // from class: com.bytedance.sdk.openadsdk.component.reward.olo.2
            boolean zmn = false;

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
            public void zmn(int i, String str) {
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                if (pAGRewardedAdLoadListener2 != null) {
                    pAGRewardedAdLoadListener2.onError(i, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
            public void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, com.bytedance.sdk.openadsdk.core.model.zn znVar) {
                if (zmnVar.btk() != null && !zmnVar.btk().isEmpty()) {
                    iqz iqzVar = new iqz(olo.this.fs, zmnVar, adSlot);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.doe.zmn.fb.zmn().zmn(zmnVar.btk().isEmpty() ? null : zmnVar.btk().get(0));
                        com.bytedance.sdk.openadsdk.cyb.fb.zmn(zmnVar.nps(), System.currentTimeMillis() - currentTimeMillis);
                    }
                    if (pAGRewardedAdLoadListener != null && com.bytedance.sdk.openadsdk.core.kgc.fb().kjb() == 0) {
                        olo.this.zmn(adSlot, zmnVar, pAGRewardedAdLoadListener, iqzVar.zmn(), this.zmn);
                    }
                    olo.this.zmn(zmnVar, iqzVar, adSlot, false, pAGRewardedAdLoadListener);
                    return;
                }
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                if (pAGRewardedAdLoadListener2 != null) {
                    pAGRewardedAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.bvs.zmn(-3));
                    znVar.zmn(-3);
                    znVar.zn(6);
                    com.bytedance.sdk.openadsdk.core.model.zn.zmn(znVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.phc
            public String zmn() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String zmn2 = cyb.zmn(olo.this.fs).zmn(adSlot.getCodeId(), true);
                if (TextUtils.isEmpty(zmn2)) {
                    return null;
                }
                return zmn2;
            }

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.phc
            public boolean zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
                boolean zmn2 = cyb.zmn(olo.this.fs).zmn(zmnVar);
                this.zmn = zmn2;
                return zmn2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, iqz iqzVar, AdSlot adSlot, boolean z, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (!z) {
            com.bytedance.sdk.openadsdk.rt.zn.zmn().zmn(zmnVar.nps());
        }
        zn znVar = new zn(new zmn(this.fs, adSlot, zmnVar, pAGRewardedAdLoadListener, false), zmnVar);
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
                if (!zmnVar.bvs() && cd != 43) {
                    return;
                }
            }
            zmn(zmnVar, nqiVar, iqzVar, adSlot, z, znVar);
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
        for (final int i2 = 0; i2 < zmnVar.btk().size(); i2++) {
            nqi nqiVar = zmnVar.btk().get(i2);
            if (i2 >= i) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.cn.zn.zmn.zmn().zmn(nqiVar, new zmn.InterfaceC0157zmn() { // from class: com.bytedance.sdk.openadsdk.component.reward.olo.3
                @Override // com.bytedance.sdk.openadsdk.core.cn.zn.zmn.InterfaceC0157zmn
                public void zmn(boolean z) {
                    com.bytedance.sdk.component.utils.iqz.zmn("RewardVideoLoadManager", "onCachedResponse: i=" + i2 + ", isSuccess=" + z);
                }
            });
        }
    }

    private void zmn(final com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, nqi nqiVar, final iqz iqzVar, final AdSlot adSlot, final boolean z, final zn znVar) {
        if (z && !am.zn(nqiVar) && com.bytedance.sdk.openadsdk.core.kgc.fb().kjb(adSlot.getCodeId()).fb == 1 && !com.bytedance.sdk.component.utils.kgc.fb(this.fs)) {
            zmn(new fs(nqiVar, adSlot, zmnVar));
            return;
        }
        boolean z2 = false;
        boolean z3 = znVar != null && com.bytedance.sdk.openadsdk.core.kgc.fb().kjb() == 1;
        if (!am.zn(nqiVar)) {
            if (nqiVar.mrt() != null) {
                com.bytedance.sdk.openadsdk.core.cn.zmn.fs zmn2 = nqi.zmn(CacheDirFactory.getICacheDir(nqiVar.hqs()).zmn(), nqiVar);
                zmn2.zmn("material_meta", nqiVar);
                zmn2.zmn("ad_slot", adSlot);
                com.bytedance.sdk.openadsdk.core.cn.btk.zmn.zmn(zmn2, new com.bykv.vk.openvk.zmn.zmn.zmn.btk.fs() { // from class: com.bytedance.sdk.openadsdk.component.reward.olo.4
                    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn.InterfaceC0101zmn
                    public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar2, int i) {
                        iqzVar.fs();
                        if (z) {
                            cyb.zmn(olo.this.fs).zmn(adSlot, zmnVar);
                        } else {
                            if (znVar == null || com.bytedance.sdk.openadsdk.core.kgc.fb().kjb() != 1) {
                                return;
                            }
                            znVar.onAdLoaded(iqzVar.zmn());
                        }
                    }

                    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn.InterfaceC0101zmn
                    public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar2, int i, String str) {
                        if (znVar == null || com.bytedance.sdk.openadsdk.core.kgc.fb().kjb() != 1) {
                            return;
                        }
                        znVar.onError(i, str);
                    }
                });
            } else {
                z2 = z3;
            }
            z3 = z2;
        } else if (z) {
            cyb.zmn(this.fs).zmn(adSlot, zmnVar);
        }
        if (z3) {
            znVar.onAdLoaded(iqzVar.zmn());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, PAGRewardedAd pAGRewardedAd, final boolean z) {
        com.bytedance.sdk.openadsdk.core.cn.fs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.olo.5
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    olo.this.zn(adSlot);
                } else {
                    cyb.zmn(olo.this.fs).zmn(adSlot, zmnVar);
                    olo.this.zn(adSlot);
                }
            }
        });
        if (pAGRewardedAdLoadListener != null) {
            pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn(AdSlot adSlot) {
        cyb.zmn(this.fs).zmn(adSlot.getCodeId());
    }

    private void zmn(fs fsVar) {
        if (fsVar == null) {
            return;
        }
        if (this.fb.size() > 0) {
            this.fb.remove(0);
        }
        this.fb.add(fsVar);
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

    public static class fs extends com.bytedance.sdk.component.zg.fs.zn {
        final AdSlot fs;
        final nqi zmn;
        final com.bytedance.sdk.openadsdk.core.model.zmn zn;

        fs(nqi nqiVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
            super("Reward Task");
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
            com.bytedance.sdk.openadsdk.core.cn.btk.zmn.zmn(zmn, new com.bykv.vk.openvk.zmn.zmn.zmn.btk.fs() { // from class: com.bytedance.sdk.openadsdk.component.reward.olo.fs.1
                @Override // com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn.InterfaceC0101zmn
                public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar, int i, String str) {
                }

                @Override // com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn.InterfaceC0101zmn
                public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar, int i) {
                    cyb zmn2 = cyb.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn());
                    fs fsVar = fs.this;
                    zmn2.zmn(fsVar.fs, fsVar.zn);
                }
            });
        }
    }

    private static class zmn implements PAGRewardedAdLoadListener {
        private final boolean btk;
        private final PAGRewardedAdLoadListener fb;
        private final AdSlot fs;
        private final Context zmn;
        private final com.bytedance.sdk.openadsdk.core.model.zmn zn;

        public zmn(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, boolean z) {
            this.zmn = context;
            this.fs = adSlot;
            this.zn = zmnVar;
            this.fb = pAGRewardedAdLoadListener;
            this.btk = z;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.nps
        public void onError(int i, String str) {
            PAGRewardedAdLoadListener pAGRewardedAdLoadListener = this.fb;
            if (pAGRewardedAdLoadListener != null) {
                pAGRewardedAdLoadListener.onError(i, str);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            olo.zmn(this.zmn).zmn(this.fs, this.zn, this.fb, pAGRewardedAd, this.btk);
        }
    }

    private static class zn implements PAGRewardedAdLoadListener {
        private final com.bytedance.sdk.openadsdk.core.model.zmn fb;
        private final AtomicBoolean fs;
        private final PAGRewardedAdLoadListener zmn;
        private final AtomicInteger zn;

        private zn(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
            this.fs = new AtomicBoolean(false);
            this.zmn = pAGRewardedAdLoadListener;
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
            if (this.zn.decrementAndGet() > 0 || this.zmn == null || !this.fs.compareAndSet(false, true)) {
                return;
            }
            this.zmn.onError(i, str);
            com.bytedance.sdk.openadsdk.cyb.fb.zmn("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.component.reward.olo.zn.1
                @Override // com.bytedance.sdk.openadsdk.cyb.fs
                @Nullable
                public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", zn.this.fb.zn());
                    return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("choose_ad_load_error").fs(jSONObject.toString());
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            this.zn.decrementAndGet();
            if (this.zmn == null || !this.fs.compareAndSet(false, true)) {
                return;
            }
            this.zmn.onAdLoaded(pAGRewardedAd);
        }
    }
}
