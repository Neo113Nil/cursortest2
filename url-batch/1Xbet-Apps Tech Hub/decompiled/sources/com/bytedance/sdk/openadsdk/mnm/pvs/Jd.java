package com.bytedance.sdk.openadsdk.mnm.pvs;

import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.yiw.icD.vG;
import com.bytedance.sdk.openadsdk.mnm.pvs.NB;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.jlb;
import org.json.JSONObject;

/* compiled from: PAGMRCEventManager.java */
/* loaded from: classes2.dex */
public class Jd {
    public static void pvs(final cR cRVar, final pvs pvsVar, final NB.pvs pvsVar2) {
        cRVar.RGX();
        ae.vG(new com.bytedance.sdk.component.so.so("mrc_report") { // from class: com.bytedance.sdk.openadsdk.mnm.pvs.Jd.1
            @Override // java.lang.Runnable
            public void run() {
                if (cRVar.Oa()) {
                    if (cRVar.OBt()) {
                        com.bytedance.sdk.openadsdk.core.yiw.icD.vG.pvs(cRVar.OyE(), new vG.icD("show_urls", cRVar));
                    } else {
                        com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar);
                    }
                }
                String pvs = jlb.pvs(cRVar);
                JSONObject jSONObject = new JSONObject();
                pvs pvsVar3 = pvsVar;
                if (pvsVar3 != null) {
                    try {
                        jSONObject.put("root_view", pvs.pvs(pvsVar3));
                        NB.pvs pvsVar4 = pvsVar2;
                        if (pvsVar4 != null) {
                            if (pvsVar4.pvs != -1) {
                                jSONObject.put("dynamic_show_type", pvsVar2.pvs);
                            }
                            if (pvsVar2.icD != -1) {
                                jSONObject.put("ad_show_order", pvsVar2.icD + 1);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                com.bytedance.sdk.openadsdk.icD.vG.icD(cRVar, pvs, "mrc_show", jSONObject);
            }
        });
    }
}
