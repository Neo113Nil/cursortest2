package com.bytedance.sdk.openadsdk.bjh.fs;

import com.bytedance.sdk.openadsdk.bjh.fs.btk;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.rt.fs.zn;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.oub;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class fb {
    public static void zmn(final nqi nqiVar, final zmn zmnVar, final btk.zmn zmnVar2) {
        nqiVar.xt();
        nu.fs(new com.bytedance.sdk.component.zg.fs.zn("mrc_report") { // from class: com.bytedance.sdk.openadsdk.bjh.fs.fb.1
            @Override // java.lang.Runnable
            public void run() {
                if (nqiVar.qc()) {
                    if (nqiVar.wir()) {
                        com.bytedance.sdk.openadsdk.core.rt.fs.zn.zmn(nqiVar.vgx(), new zn.fs("show_urls", nqiVar));
                    } else {
                        com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar);
                    }
                }
                String zmn = oub.zmn(nqiVar);
                final JSONObject jSONObject = new JSONObject();
                zmn zmnVar3 = zmnVar;
                final JSONObject jSONObject2 = null;
                if (zmnVar3 != null) {
                    try {
                        jSONObject.put("root_view", zmn.zmn(zmnVar3));
                        btk.zmn zmnVar4 = zmnVar2;
                        if (zmnVar4 != null) {
                            int i = zmnVar4.zmn;
                            if (i != -1) {
                                jSONObject.put("dynamic_show_type", i);
                            }
                            int i2 = zmnVar2.fs;
                            if (i2 != -1) {
                                jSONObject2 = com.bytedance.sdk.openadsdk.fb.zn.zmn(i2 + 1);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), nqiVar, zmn, "mrc_show", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.bjh.fs.fb.1.1
                    @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                    public JSONObject zn() {
                        return jSONObject;
                    }

                    @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                    public JSONObject zmn() {
                        return jSONObject2;
                    }
                });
            }
        });
    }
}
