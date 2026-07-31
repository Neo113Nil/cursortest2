package com.bytedance.sdk.openadsdk.core.rc;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.settings.rc;
import com.bytedance.sdk.openadsdk.core.uqh;
import com.bytedance.sdk.openadsdk.cyb.zmn.btk;
import com.bytedance.sdk.openadsdk.utils.nqi;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.ironsource.O6;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class zmn {
    private boolean zn;
    private final AtomicInteger zmn = new AtomicInteger(0);
    private fb fs = null;
    private final Runnable fb = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rc.zmn.3
        @Override // java.lang.Runnable
        public void run() {
            zmn.this.zmn();
        }
    };

    public zmn(boolean z) {
        this.zn = false;
        this.zn = z;
    }

    public void zmn(fb fbVar) {
        this.fs = fbVar;
    }

    public void zmn() {
        try {
            if (!this.zn) {
                String fs = rc.fs(kgc.zmn());
                int zmn = rc.zmn(kgc.zmn());
                if (TextUtils.equals(fs, rc.fb) && zmn == rc.btk && fs.zmn().bvs()) {
                    zmn(true);
                    return;
                }
            }
            JSONObject zn = zn();
            com.bytedance.sdk.component.nps.fs.fb fs2 = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().fs();
            final String zmn2 = oub.zmn("/api/ad/union/sdk/compliance_status/", false, true);
            fs2.zn(zmn2);
            fs2.fs("User-Agent", "");
            fs2.btk(fs(zn).toString());
            fs2.zmn(6);
            fs2.fs("compliance_stats");
            com.bytedance.sdk.openadsdk.kgc.zn.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.rc.zmn.1
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("compliance_status");
                    zmnVar.nps(zmn.this.zmn(kgc.zmn()).toString());
                    return zmnVar;
                }
            });
            fs2.fs(new com.bytedance.sdk.component.nps.zmn.zmn() { // from class: com.bytedance.sdk.openadsdk.core.rc.zmn.2
                @Override // com.bytedance.sdk.component.nps.zmn.zmn
                public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, com.bytedance.sdk.component.nps.fs fsVar) {
                    String fb = fsVar.fb();
                    if (!fsVar.hhw() || TextUtils.isEmpty(fb)) {
                        zmn.this.fs();
                        com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.rc.zmn.2.2
                            @Override // com.bytedance.sdk.openadsdk.kgc.fb
                            public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                zmnVar.fs("compliance_status");
                                zmnVar.nps(zmn.this.zmn(kgc.zmn()).toString());
                                return zmnVar;
                            }
                        });
                        if (znVar != null) {
                            nqi.zmn(znVar.hhw());
                            btk.zmn("compliance_status", zmn2, fsVar.zmn(), fsVar.fs(), null, null);
                            return;
                        }
                        return;
                    }
                    try {
                        com.bytedance.sdk.openadsdk.kgc.zn.fs(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.rc.zmn.2.1
                            @Override // com.bytedance.sdk.openadsdk.kgc.fb
                            public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                zmnVar.fs("compliance_status");
                                zmnVar.nps(zmn.this.zmn(kgc.zmn()).toString());
                                return zmnVar;
                            }
                        });
                        nqi.fs();
                        JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(fb);
                        String zmn3 = uqh.zmn(jsonObjectInit.optInt("cypher", -1), jsonObjectInit.optString("message"));
                        if (TextUtils.isEmpty(zmn3)) {
                            zmn.this.fs();
                            return;
                        }
                        if (!zmn.this.zmn(PangleNetworkBridge.jsonObjectInit(zmn3))) {
                            zmn.this.zmn(false);
                        } else if (!zmn.this.zn || TextUtils.isEmpty(rc.fs().gn())) {
                            zmn.this.zmn(true);
                        } else {
                            zmn.this.zmn(false);
                        }
                    } catch (Throwable unused) {
                        zmn.this.fs();
                    }
                }

                @Override // com.bytedance.sdk.component.nps.zmn.zmn
                public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, IOException iOException) {
                    zmn.this.fs();
                    com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.rc.zmn.2.3
                        @Override // com.bytedance.sdk.openadsdk.kgc.fb
                        public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                            com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                            zmnVar.fs("compliance_status");
                            zmnVar.nps(zmn.this.zmn(kgc.zmn()).toString());
                            return zmnVar;
                        }
                    });
                    if (znVar != null) {
                        nqi.zmn(znVar.hhw());
                        btk.zmn("compliance_status", znVar.hhw(), -1, iOException != null ? iOException.getMessage() : null, null, null);
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
        int zg = fs.zmn().zg();
        if (jSONObject.has("user_compliance_status")) {
            zg = jSONObject.optInt("user_compliance_status", -1);
            fs.zmn().fs(zg);
        }
        if (jSONObject.has("user_compliance_status_reason")) {
            fs.zmn().zmn(jSONObject.optString("user_compliance_status_reason", ""));
        }
        if (jSONObject.has("allow_req_time")) {
            fs.zmn().zmn(jSONObject.optLong("allow_req_time", fs.zmn.longValue()));
        }
        return zg == 1 || zg == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs() {
        if (fs.zmn().iv()) {
            if (this.zmn.incrementAndGet() <= 3) {
                cn.fs().removeCallbacks(this.fb);
                cn.fs().postDelayed(this.fb, r0 * 10000);
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
            jSONObject.put("tcstring", rc.fs(kgc.zmn()));
            jSONObject.put("tcf_gdpr", rc.zmn(kgc.zmn()));
            jSONObject.put(O6.X0, com.bytedance.sdk.openadsdk.phc.zmn.fs.zmn.zmn().fs());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
