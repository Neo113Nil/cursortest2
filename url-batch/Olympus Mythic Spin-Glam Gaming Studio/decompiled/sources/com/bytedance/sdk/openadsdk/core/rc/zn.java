package com.bytedance.sdk.openadsdk.core.rc;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.iv;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.uqh;
import com.bytedance.sdk.openadsdk.cyb.zmn.btk;
import com.bytedance.sdk.openadsdk.utils.nqi;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zn {
    private fb fs;
    private final AtomicInteger zmn = new AtomicInteger(0);
    private final Runnable zn = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rc.zn.3
        @Override // java.lang.Runnable
        public void run() {
            zn.this.zmn();
        }
    };

    public void zmn(fb fbVar) {
        this.fs = fbVar;
    }

    public void zmn() {
        try {
            if (fs.zmn().hhw()) {
                zmn(true);
                return;
            }
            JSONObject zn = zn();
            com.bytedance.sdk.component.nps.fs.fb fs = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().fs();
            final String zmn = oub.zmn("/api/ad/union/sdk/register_status/", false, true);
            fs.zn(zmn);
            fs.fs("User-Agent", "");
            fs.btk(fs(zn).toString());
            fs.zmn(6);
            fs.fs("register_stats");
            com.bytedance.sdk.openadsdk.kgc.zn.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.rc.zn.1
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("register_status");
                    zmnVar.nps(zn.this.zmn(kgc.zmn()).toString());
                    return zmnVar;
                }
            });
            fs.fs(new com.bytedance.sdk.component.nps.zmn.zmn() { // from class: com.bytedance.sdk.openadsdk.core.rc.zn.2
                @Override // com.bytedance.sdk.component.nps.zmn.zmn
                public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, com.bytedance.sdk.component.nps.fs fsVar) {
                    String fb = fsVar.fb();
                    if (!fsVar.hhw() || TextUtils.isEmpty(fb)) {
                        zn.this.fs();
                        com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.rc.zn.2.2
                            @Override // com.bytedance.sdk.openadsdk.kgc.fb
                            public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                zmnVar.fs("register_status");
                                zmnVar.nps(zn.this.zmn(kgc.zmn()).toString());
                                return zmnVar;
                            }
                        });
                        if (znVar != null) {
                            nqi.zmn(znVar.hhw());
                            btk.zmn("register_status", zmn, fsVar.zmn(), fsVar.fs(), null, null);
                            return;
                        }
                        return;
                    }
                    try {
                        com.bytedance.sdk.openadsdk.kgc.zn.fs(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.rc.zn.2.1
                            @Override // com.bytedance.sdk.openadsdk.kgc.fb
                            public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                zmnVar.fs("register_status");
                                zmnVar.nps(zn.this.zmn(kgc.zmn()).toString());
                                return zmnVar;
                            }
                        });
                        nqi.fs();
                        JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(fb);
                        String zmn2 = uqh.zmn(jsonObjectInit.optInt("cypher", -1), jsonObjectInit.optString("message"));
                        if (TextUtils.isEmpty(zmn2)) {
                            zn.this.fs();
                            return;
                        }
                        zn.this.zmn(zn.this.zmn(PangleNetworkBridge.jsonObjectInit(zmn2)));
                    } catch (Throwable unused) {
                        zn.this.fs();
                    }
                }

                @Override // com.bytedance.sdk.component.nps.zmn.zmn
                public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, IOException iOException) {
                    zn.this.fs();
                    com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.rc.zn.2.3
                        @Override // com.bytedance.sdk.openadsdk.kgc.fb
                        public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                            com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                            zmnVar.fs("register_status");
                            zmnVar.nps(zn.this.zmn(kgc.zmn()).toString());
                            return zmnVar;
                        }
                    });
                    if (znVar != null) {
                        nqi.zmn(znVar.hhw());
                        btk.zmn("register_status", znVar.hhw(), -1, iOException != null ? iOException.getMessage() : null, null, null);
                    }
                }
            });
        } catch (Throwable unused) {
            fs();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(boolean z) {
        fb fbVar = this.fs;
        if (fbVar != null) {
            fbVar.zmn(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zmn(JSONObject jSONObject) {
        int zn = fs.zmn().zn();
        if (jSONObject.has("app_reg")) {
            zn = jSONObject.optInt("app_reg", -1);
            fs.zmn().zmn(zn);
        }
        return zn == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs() {
        if (fs.zmn().nps()) {
            if (this.zmn.incrementAndGet() <= 3) {
                cn.fs().removeCallbacks(this.zn);
                cn.fs().postDelayed(this.zn, r0 * 10000);
                return;
            } else {
                zmn(false);
                return;
            }
        }
        zmn(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject zmn(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("net_status", com.bytedance.sdk.component.utils.kgc.zmn(context) ? 1 : 0);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private JSONObject fs(JSONObject jSONObject) {
        return uqh.zmn(PangleEncryptConstant.CryptDataScene.REGISTER_STATUS, jSONObject);
    }

    private JSONObject zn() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_id", iv.fs().fb());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
