package com.bytedance.sdk.openadsdk.fb.zmn;

import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.fb.zmn.zmn.rc;
import com.bytedance.sdk.openadsdk.utils.kjb;
import com.bytedance.sdk.openadsdk.utils.nu;
import org.json.JSONObject;

/* loaded from: classes11.dex */
class zg implements com.bytedance.sdk.openadsdk.cyb.fs.zn {
    public static final zg zmn = new zg();

    private zg() {
    }

    @Override // com.bytedance.sdk.openadsdk.cyb.fs.zn
    public void zmn(com.bytedance.sdk.openadsdk.cyb.fs fsVar) {
        zmn(fsVar, false);
    }

    @Override // com.bytedance.sdk.openadsdk.cyb.fs.zn
    public void zmn(final com.bytedance.sdk.openadsdk.cyb.fs fsVar, final boolean z) {
        zmn(new com.bytedance.sdk.component.zg.fs.zn("uploadLogEvent") { // from class: com.bytedance.sdk.openadsdk.fb.zmn.zg.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn2 = fsVar.zmn();
                    if (zmn2 == null) {
                        return;
                    }
                    JSONObject zmn3 = zmn2.zmn();
                    String zmn4 = kjb.zmn();
                    if (com.bytedance.sdk.openadsdk.fb.zmn.zmn.hhw.zmn(zmn3.optString("type")) && com.bytedance.sdk.openadsdk.fb.zmn.zmn.nps.zmn()) {
                        rc rcVar = new rc(zmn4, rc.zmn(zmn3));
                        rcVar.zmn(z ? 1 : 0);
                        com.bytedance.sdk.openadsdk.fb.zmn.zmn.nps.zmn(rcVar);
                        return;
                    }
                    com.bytedance.sdk.component.hhw.zmn.fb.zmn.zmn zmnVar = new com.bytedance.sdk.component.hhw.zmn.fb.zmn.zmn(zmn4, zmn3);
                    zmnVar.zmn((byte) 0);
                    zmnVar.zn(z ? (byte) 2 : (byte) 3);
                    zmnVar.fs((byte) 1);
                    if (com.bytedance.sdk.component.hhw.zmn.fs.fs()) {
                        fs.zmn(kgc.zmn());
                    }
                    com.bytedance.sdk.component.hhw.zmn.fs.zmn(zmnVar);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void zmn(com.bytedance.sdk.component.zg.fs.zn znVar) {
        if (znVar == null) {
            return;
        }
        if (!nu.nps()) {
            nu.fs(znVar, 5);
        } else {
            znVar.run();
        }
    }
}
