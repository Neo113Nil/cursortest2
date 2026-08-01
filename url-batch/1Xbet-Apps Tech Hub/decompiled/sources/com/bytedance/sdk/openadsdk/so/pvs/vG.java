package com.bytedance.sdk.openadsdk.so.pvs;

import com.bytedance.sdk.component.pvs.Jd;
import com.bytedance.sdk.component.pvs.vA;
import com.bytedance.sdk.openadsdk.core.CvL;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: DoNewClickEventMethod.java */
/* loaded from: classes2.dex */
public class vG extends com.bytedance.sdk.component.pvs.Jd<JSONObject, JSONObject> {
    private final WeakReference<CvL> pvs;

    public static void pvs(vA vAVar, final CvL cvL) {
        vAVar.pvs("newClickEvent", new Jd.icD() { // from class: com.bytedance.sdk.openadsdk.so.pvs.vG.1
            @Override // com.bytedance.sdk.component.pvs.Jd.icD
            public com.bytedance.sdk.component.pvs.Jd pvs() {
                return new vG(CvL.this);
            }
        });
    }

    public vG(CvL cvL) {
        this.pvs = new WeakReference<>(cvL);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.pvs.Jd
    public void pvs(JSONObject jSONObject, com.bytedance.sdk.component.pvs.sUS sus) throws Exception {
        CvL cvL = this.pvs.get();
        if (cvL == null) {
            vG();
        } else {
            cvL.vG(jSONObject);
        }
    }
}
