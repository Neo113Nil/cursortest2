package com.bytedance.sdk.openadsdk.component.fs;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.common.nps;
import com.bytedance.sdk.openadsdk.core.bvs;
import com.bytedance.sdk.openadsdk.core.cn.zmn.fs;
import com.bytedance.sdk.openadsdk.core.doe;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.kjb;
import com.bytedance.sdk.openadsdk.core.model.zn;
import com.bytedance.sdk.openadsdk.core.nqi;
import com.bytedance.sdk.openadsdk.cyb.fb;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.ww;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public class zmn {
    private static volatile zmn zmn;
    private final nqi fs = kgc.zn();

    public static zmn zmn() {
        if (zmn == null) {
            synchronized (zmn.class) {
                try {
                    if (zmn == null) {
                        zmn = new zmn();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    private zmn() {
    }

    public void zmn(final Context context, final AdSlot adSlot, final nps npsVar) {
        final ww fs = ww.fs();
        this.fs.zmn(adSlot, new kjb(), 5, new doe() { // from class: com.bytedance.sdk.openadsdk.component.fs.zmn.1
            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
            public void zmn(int i, String str) {
                npsVar.onError(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
            public void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, zn znVar) {
                zmn.this.zmn(zmnVar, znVar, context, adSlot, npsVar, fs);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, zn znVar, Context context, AdSlot adSlot, nps npsVar, ww wwVar) {
        if (zmnVar.btk() != null && !zmnVar.btk().isEmpty()) {
            List<com.bytedance.sdk.openadsdk.core.model.nqi> btk = zmnVar.btk();
            ArrayList arrayList = new ArrayList(btk.size());
            for (com.bytedance.sdk.openadsdk.core.model.nqi nqiVar : btk) {
                if (com.bytedance.sdk.openadsdk.core.model.nqi.btk(nqiVar) || (nqiVar != null && nqiVar.ir())) {
                    PAGNativeAd zmn2 = zmn(context, nqiVar, adSlot);
                    if (npsVar instanceof PAGNativeAdLoadListener) {
                        arrayList.add(zmn2);
                    }
                }
                if (com.bytedance.sdk.openadsdk.core.model.nqi.btk(nqiVar) && nqiVar.mrt() != null && nqiVar.mrt().rc() != null) {
                    if (kgc.fb().btk(String.valueOf(nqiVar.qvo())) && kgc.fb().cd()) {
                        if (nqiVar.mrt() != null) {
                            nqiVar.mrt().hhw(1);
                        }
                        if (nqiVar.ghr() != null) {
                            nqiVar.ghr().hhw(1);
                        }
                        fs zmn3 = com.bytedance.sdk.openadsdk.core.model.nqi.zmn(CacheDirFactory.getICacheDir(nqiVar.hqs()).zn(), nqiVar);
                        zmn3.zmn("material_meta", nqiVar);
                        zmn3.zmn("ad_slot", adSlot);
                        com.bytedance.sdk.openadsdk.core.cn.btk.zmn.zmn(zmn3, null);
                    }
                    IPBroadcastReceiver.fs(context, nqiVar);
                }
            }
            boolean z = npsVar instanceof PAGNativeAdLoadListener;
            if (z && !arrayList.isEmpty()) {
                if (adSlot != null && !TextUtils.isEmpty(adSlot.getBidAdm())) {
                    fb.zmn(btk.get(0), wwVar.fb());
                }
                if (z) {
                    ((PAGNativeAdLoadListener) npsVar).onAdLoaded(arrayList.get(0));
                }
                if (znVar.btk() == null || znVar.btk().isEmpty()) {
                    return;
                }
                znVar.zn(4);
                zn.zmn(znVar);
                return;
            }
            npsVar.onError(-4, bvs.zmn(-4));
            znVar.zmn(-4);
            znVar.zn(4);
            zn.zmn(znVar);
            return;
        }
        npsVar.onError(-3, bvs.zmn(-3));
        znVar.zmn(-3);
        znVar.zn(4);
        zn.zmn(znVar);
    }

    private PAGNativeAd zmn(Context context, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, AdSlot adSlot) {
        if (nqiVar.nkt() == 2) {
            if (nqiVar.mrt() != null) {
                return new com.bytedance.sdk.openadsdk.zmn.fs.zmn.fs(context, nqiVar, adSlot);
            }
            return new com.bytedance.sdk.openadsdk.zmn.fs.zmn.zn(context, nqiVar, adSlot);
        }
        return new com.bytedance.sdk.openadsdk.zmn.fs.fs(context, nqiVar, 5, adSlot);
    }
}
