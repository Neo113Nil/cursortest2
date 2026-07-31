package com.bytedance.sdk.openadsdk.core.iv;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.ww;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class zg {
    private PAGBannerAdLoadListener fb;
    private com.bytedance.sdk.openadsdk.core.model.nqi zg;
    private AdSlot zmn;
    private final Context zn;
    private final AtomicBoolean btk = new AtomicBoolean(false);
    private int hhw = 5;
    private final ww nps = ww.zn();
    private final com.bytedance.sdk.openadsdk.core.nqi fs = com.bytedance.sdk.openadsdk.core.kgc.zn();

    private zg(Context context) {
        if (context != null) {
            this.zn = context.getApplicationContext();
        } else {
            this.zn = com.bytedance.sdk.openadsdk.core.kgc.zmn();
        }
    }

    public static zg zmn(Context context) {
        return new zg(context);
    }

    public void zmn(AdSlot adSlot, int i, @Nullable com.bytedance.sdk.openadsdk.common.nps npsVar) {
        this.nps.btk();
        if (this.btk.get()) {
            return;
        }
        this.hhw = i;
        this.btk.set(true);
        this.zmn = adSlot;
        if (npsVar instanceof PAGBannerAdLoadListener) {
            this.fb = (PAGBannerAdLoadListener) npsVar;
        }
        zmn(adSlot);
    }

    private void zmn(final AdSlot adSlot) {
        if (adSlot == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.kjb kjbVar = new com.bytedance.sdk.openadsdk.core.model.kjb();
        kjbVar.bvs = 2;
        this.fs.zmn(adSlot, kjbVar, this.hhw, new com.bytedance.sdk.openadsdk.core.doe() { // from class: com.bytedance.sdk.openadsdk.core.iv.zg.1
            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
            public void zmn(int i, String str) {
                zg.this.zmn(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
            public void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, com.bytedance.sdk.openadsdk.core.model.zn znVar) {
                zg.this.zmn(zmnVar, znVar, adSlot);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, com.bytedance.sdk.openadsdk.core.model.zn znVar, AdSlot adSlot) {
        if (zmnVar.btk() != null && !zmnVar.btk().isEmpty()) {
            com.bytedance.sdk.openadsdk.core.model.nqi iv = zmnVar.iv();
            this.zg = iv;
            zmn(iv, adSlot);
            if (com.bytedance.sdk.component.utils.cn.zn()) {
                Log.e("ExpressAdLoadManager", "onAdLoad: net work response duration = " + this.nps.fb() + "run in  " + Thread.currentThread().getName());
            }
            if (this.btk.getAndSet(false)) {
                nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iv.zg.2
                    @Override // java.lang.Runnable
                    public void run() {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (zg.this.zg != null) {
                            zg zgVar = zg.this;
                            zgVar.zmn(zgVar.zg, elapsedRealtime);
                        }
                    }
                });
                return;
            }
            return;
        }
        zmn(-3, com.bytedance.sdk.openadsdk.core.bvs.zmn(-3));
        znVar.zmn(-3);
        znVar.zn(8);
        com.bytedance.sdk.openadsdk.core.model.zn.zmn(znVar);
    }

    private void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, AdSlot adSlot) {
        for (com.bytedance.sdk.openadsdk.core.model.nqi nqiVar2 : nqiVar.tl()) {
            if (com.bytedance.sdk.openadsdk.core.model.nqi.btk(nqiVar2) && nqiVar2.mrt() != null && nqiVar2.mrt().rc() != null) {
                if (com.bytedance.sdk.openadsdk.core.kgc.fb().btk(String.valueOf(nqiVar2.qvo())) && com.bytedance.sdk.openadsdk.core.kgc.fb().cd()) {
                    com.bytedance.sdk.openadsdk.core.cn.zmn.fs zmn = com.bytedance.sdk.openadsdk.core.model.nqi.zmn(CacheDirFactory.getICacheDir(nqiVar2.hqs()).zn(), nqiVar2);
                    zmn.zmn("material_meta", nqiVar2);
                    zmn.zmn("ad_slot", adSlot);
                    com.bytedance.sdk.openadsdk.core.cn.btk.zmn.zmn(zmn, null);
                }
            }
        }
    }

    private PAGBannerAd zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        int i;
        int i2;
        PAGBannerSize rxd = nqiVar.rxd();
        float min = Math.min(this.zmn.getExpressViewAcceptedHeight(), 250.0f);
        if (rxd != null) {
            i = rxd.getWidth();
            i2 = rxd.getHeight();
        } else {
            i = 0;
            i2 = 0;
        }
        float expressViewAcceptedWidth = i > 0 ? i : this.zmn.getExpressViewAcceptedWidth();
        if (i2 > 0) {
            min = i2;
        }
        this.zmn.setExpressViewAccepted(expressViewAcceptedWidth, min);
        return new com.bytedance.sdk.openadsdk.core.fb.nps(this.zn, nqiVar, this.zmn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, long j) {
        if (this.fb != null) {
            PAGBannerAd zmn = zmn(nqiVar);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long fb = this.nps.fb();
            if (!TextUtils.isEmpty(this.zmn.getBidAdm())) {
                com.bytedance.sdk.openadsdk.cyb.fb.zmn(nqiVar, fb);
            }
            this.fb.onAdLoaded(zmn);
            zmn(nqiVar, fb, j, elapsedRealtime);
        }
    }

    private void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, final long j, final long j2, final long j3) {
        try {
            if (com.bytedance.sdk.openadsdk.core.kgc.fb().ve()) {
                if (com.bytedance.sdk.openadsdk.uqh.btk.btk()) {
                    try {
                        if (this.hhw != 1 || nqiVar == null || nqiVar.tl() == null || nqiVar.tl().isEmpty() || nqiVar.fb().zmn() == null) {
                            return;
                        }
                        final JSONObject zmn = nqiVar.fb().zmn();
                        com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), nqiVar, zmn.optString("tag", ""), "load_ad_time", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.core.iv.zg.3
                            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                            public JSONObject fs() {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, zmn.optLong(IronSourceConstants.EVENTS_DURATION, 0L));
                                } catch (Throwable unused) {
                                }
                                return jSONObject;
                            }

                            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                            public JSONObject zn() {
                                try {
                                    long optLong = zmn.optLong("callback_start", 0L);
                                    long j4 = j2;
                                    long j5 = j4 - optLong;
                                    long j6 = j3 - j4;
                                    JSONObject optJSONObject = zmn.optJSONObject("extra_data");
                                    if (optJSONObject == null) {
                                        optJSONObject = new JSONObject();
                                    }
                                    optJSONObject.put("thread_dispatch_duration", j5);
                                    optJSONObject.put("build_banner_ad_duration", j6);
                                    optJSONObject.put("ad_load_duration_full", j);
                                    return optJSONObject;
                                } catch (Throwable unused) {
                                    return null;
                                }
                            }
                        });
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(int i, String str) {
        PAGBannerAdLoadListener pAGBannerAdLoadListener;
        if (!this.btk.getAndSet(false) || (pAGBannerAdLoadListener = this.fb) == null) {
            return;
        }
        pAGBannerAdLoadListener.onError(i, str);
    }
}
