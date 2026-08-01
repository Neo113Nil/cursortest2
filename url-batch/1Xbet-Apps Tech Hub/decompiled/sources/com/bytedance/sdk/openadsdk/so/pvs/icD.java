package com.bytedance.sdk.openadsdk.so.pvs;

import com.bytedance.sdk.component.pvs.Jd;
import com.bytedance.sdk.component.pvs.vA;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.core.CvL;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: DoInterstitialWebViewCloseMethod.java */
/* loaded from: classes2.dex */
public class icD extends com.bytedance.sdk.component.pvs.Jd<JSONObject, JSONObject> {
    private final WeakReference<CvL> pvs;

    public static void pvs(vA vAVar, final CvL cvL) {
        vAVar.pvs("interstitial_webview_close", new Jd.icD() { // from class: com.bytedance.sdk.openadsdk.so.pvs.icD.1
            @Override // com.bytedance.sdk.component.pvs.Jd.icD
            public com.bytedance.sdk.component.pvs.Jd pvs() {
                return new icD(CvL.this);
            }
        });
    }

    public icD(CvL cvL) {
        this.pvs = new WeakReference<>(cvL);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.pvs.Jd
    public void pvs(JSONObject jSONObject, com.bytedance.sdk.component.pvs.sUS sus) throws Exception {
        com.bytedance.sdk.openadsdk.core.so.icD().vA();
        CvL cvL = this.pvs.get();
        if (cvL == null) {
            Ju.pvs("DoInterstitialWebViewCloseMethod", "invoke error");
            vG();
        } else {
            cvL.yiw();
        }
    }
}
