package com.bytedance.sdk.openadsdk.component.icD;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.Wyp.vG;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.common.Jd;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.icD;
import com.bytedance.sdk.openadsdk.core.model.uc;
import com.bytedance.sdk.openadsdk.core.vA;
import com.bytedance.sdk.openadsdk.core.yiw;
import com.bytedance.sdk.openadsdk.utils.gA;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: FeedAdManager.java */
/* loaded from: classes2.dex */
public class pvs {
    private static volatile pvs pvs;
    private final vA icD = mnm.vG();

    public static pvs pvs() {
        if (pvs == null) {
            synchronized (pvs.class) {
                if (pvs == null) {
                    pvs = new pvs();
                }
            }
        }
        return pvs;
    }

    private pvs() {
    }

    public void pvs(final Context context, final AdSlot adSlot, final Jd jd) {
        final gA pvs2 = gA.pvs();
        this.icD.pvs(adSlot, new uc(), 5, new vA.pvs() { // from class: com.bytedance.sdk.openadsdk.component.icD.pvs.1
            @Override // com.bytedance.sdk.openadsdk.core.vA.pvs
            public void pvs(int i, String str) {
                jd.onError(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.vA.pvs
            public void pvs(com.bytedance.sdk.openadsdk.core.model.pvs pvsVar, icD icd) {
                if (pvsVar.vG() != null && !pvsVar.vG().isEmpty()) {
                    List<cR> vG = pvsVar.vG();
                    ArrayList arrayList = new ArrayList(vG.size());
                    Iterator<cR> it = vG.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        cR next = it.next();
                        if (cR.NB(next) || (next != null && next.FFl())) {
                            PAGNativeAd pvs3 = pvs(context, next, adSlot);
                            if (jd instanceof PAGNativeAdLoadListener) {
                                arrayList.add(pvs3);
                            }
                        }
                        if (cR.NB(next) && next.od() != null && next.od().qh() != null) {
                            if (mnm.Jd().NB(String.valueOf(next.yTz())) && mnm.Jd().joF()) {
                                if (next.od() != null) {
                                    next.od().sUS(1);
                                }
                                if (next.mo() != null) {
                                    next.mo().sUS(1);
                                }
                                com.bytedance.sdk.openadsdk.core.video.pvs.icD pvs4 = cR.pvs(CacheDirFactory.getICacheDir(next.LHy()).vG(), next);
                                pvs4.pvs("material_meta", next);
                                pvs4.pvs("ad_slot", adSlot);
                                com.bytedance.sdk.openadsdk.core.video.Jd.pvs.pvs(pvs4, null);
                            }
                        }
                    }
                    if ((jd instanceof PAGNativeAdLoadListener) && !arrayList.isEmpty()) {
                        AdSlot adSlot2 = adSlot;
                        if (adSlot2 != null && !TextUtils.isEmpty(adSlot2.getBidAdm())) {
                            vG.pvs(vG.get(0), pvs2.vG());
                        }
                        Jd jd2 = jd;
                        if (jd2 instanceof PAGNativeAdLoadListener) {
                            ((PAGNativeAdLoadListener) jd2).onAdLoaded(arrayList.get(0));
                        }
                        if (icd.NB() == null || icd.NB().isEmpty()) {
                            return;
                        }
                        icD.pvs(icd);
                        return;
                    }
                    jd.onError(-4, yiw.pvs(-4));
                    icd.pvs(-4);
                    icD.pvs(icd);
                    return;
                }
                jd.onError(-3, yiw.pvs(-3));
                icd.pvs(-3);
                icD.pvs(icd);
            }

            private PAGNativeAd pvs(Context context2, cR cRVar, AdSlot adSlot2) {
                if (cRVar.OT() == 2) {
                    if (cRVar.od() != null) {
                        return new com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.pvs(context2, cRVar, adSlot2);
                    }
                    return new com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.icD(context2, cRVar, adSlot2);
                }
                return new com.bytedance.sdk.openadsdk.apiImpl.feed.icD(context2, cRVar, 5, adSlot2);
            }
        });
    }
}
