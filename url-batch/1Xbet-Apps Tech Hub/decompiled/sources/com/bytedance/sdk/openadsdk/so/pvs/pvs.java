package com.bytedance.sdk.openadsdk.so.pvs;

import com.bytedance.sdk.component.pvs.Jd;
import com.bytedance.sdk.component.pvs.vA;
import com.bytedance.sdk.openadsdk.core.CvL;
import com.bytedance.sdk.openadsdk.core.model.cR;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DoGetAdsFromNetworkAsyncMethod.java */
/* loaded from: classes2.dex */
public class pvs extends com.bytedance.sdk.component.pvs.Jd<JSONObject, JSONObject> {
    private final WeakReference<CvL> pvs;

    public static void pvs(vA vAVar, final CvL cvL) {
        vAVar.pvs("getNetworkData", new Jd.icD() { // from class: com.bytedance.sdk.openadsdk.so.pvs.pvs.1
            @Override // com.bytedance.sdk.component.pvs.Jd.icD
            public com.bytedance.sdk.component.pvs.Jd pvs() {
                return new pvs(CvL.this);
            }
        });
    }

    public pvs(CvL cvL) {
        this.pvs = new WeakReference<>(cvL);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.pvs.Jd
    public void pvs(JSONObject jSONObject, com.bytedance.sdk.component.pvs.sUS sus) throws Exception {
        CvL cvL = this.pvs.get();
        if (cvL == null) {
            vG();
        } else {
            cvL.pvs(jSONObject, new com.bytedance.sdk.openadsdk.Mxy.vG() { // from class: com.bytedance.sdk.openadsdk.so.pvs.pvs.2
                @Override // com.bytedance.sdk.openadsdk.Mxy.vG
                public void pvs(boolean z, List<cR> list) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        if (!z) {
                            pvs.this.pvs((pvs) jSONObject2);
                        } else {
                            jSONObject2.put("creatives", CvL.icD(list));
                            pvs.this.pvs((pvs) jSONObject2);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
