package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.utils.rp;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class klz {
    private static final AtomicInteger zmn = new AtomicInteger(0);
    private static final AtomicBoolean fs = new AtomicBoolean(false);

    public static void zmn(String str) {
        AtomicBoolean atomicBoolean = fs;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!com.bytedance.sdk.component.utils.kgc.zg(kgc.zmn())) {
                atomicBoolean.set(false);
            } else {
                zmn.zmn();
                fs(str);
            }
        }
    }

    public static void fs(final String str) {
        if (com.bytedance.sdk.openadsdk.core.rc.fs.zmn().btk()) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.nu.fs(new com.bytedance.sdk.component.zg.fs.zn("ipv6") { // from class: com.bytedance.sdk.openadsdk.core.klz.1
            @Override // java.lang.Runnable
            public void run() {
                final List<String> list;
                final String kw = com.bytedance.sdk.openadsdk.utils.oub.kw();
                com.bytedance.sdk.openadsdk.cyb.fb.zmn(0, kw);
                final boolean zmn2 = com.bytedance.sdk.openadsdk.utils.fs.zmn();
                if (!zmn2) {
                    com.bytedance.sdk.openadsdk.kgc.zn.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.klz.1.1
                        @Override // com.bytedance.sdk.openadsdk.kgc.fb
                        public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                            com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                            zmnVar.fs("ipv6");
                            return zmnVar;
                        }
                    });
                }
                if (TextUtils.isEmpty(kw)) {
                    com.bytedance.sdk.openadsdk.cyb.fb.zmn(-1, kw, -1, "url is null");
                    com.bytedance.sdk.openadsdk.cyb.zmn.btk.zmn("ipv6", "", -2, "url is null", null, null);
                    if (zmn2) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.klz.1.2
                        @Override // com.bytedance.sdk.openadsdk.kgc.fb
                        public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                            com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                            zmnVar.fs("ipv6");
                            return zmnVar;
                        }
                    });
                    return;
                }
                final com.bytedance.sdk.component.nps.fs.fb fs2 = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().fs();
                if (zmn2) {
                    try {
                        fs2.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.klz.1.3
                            @Override // com.bytedance.sdk.openadsdk.kgc.fb
                            public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                zmnVar.fs("ipv6");
                                return zmnVar;
                            }
                        });
                    } catch (Exception e) {
                        com.bytedance.sdk.openadsdk.cyb.fb.zmn(-1, kw, -2, e.getMessage());
                        com.bytedance.sdk.openadsdk.cyb.zmn.btk.zmn("ipv6", kw, -3, e.getMessage(), null, null);
                        if (!zmn2) {
                            com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.klz.1.5
                                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                    zmnVar.fs("ipv6");
                                    return zmnVar;
                                }
                            });
                        }
                        com.bytedance.sdk.component.utils.iqz.zn("build ipv6 request failed:" + e.getMessage(), new Object[0]);
                        return;
                    }
                }
                fs2.zn(kw);
                if (com.bytedance.sdk.openadsdk.utils.fs.fs()) {
                    List<String> iqz = com.bytedance.sdk.openadsdk.utils.oub.iqz();
                    if (!iqz.isEmpty()) {
                        fs2.zmn(iqz);
                        fs2.zmn(60L, TimeUnit.SECONDS);
                    }
                    list = iqz;
                } else {
                    list = null;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("connect_type", com.bytedance.sdk.component.utils.rp.zmn(kgc.zmn(), 0L));
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("device_id", Long.parseLong(str));
                }
                jSONObject.put(POBCTAOverlayData.KEY_CTA_HEADER, com.bytedance.sdk.openadsdk.fb.zmn.zmn.zmn().fs());
                try {
                    jSONObject.put("id", kgc.zn().zmn((AdSlot) null, (com.bytedance.sdk.openadsdk.core.model.kjb) null, 0));
                } catch (Throwable th) {
                    th.getMessage();
                }
                JSONObject encryptType4 = PangleEncryptManager.encryptType4(jSONObject, new bjh(PangleEncryptConstant.CryptDataScene.DUAL_EVENT));
                if (encryptType4 != null && encryptType4.optInt("cypher") == 4) {
                    rp.fs(true);
                    fs2.fs("x-pgli18n", "4");
                    fs2.fs("Content-Type", "application/json; charset=utf-8");
                } else {
                    rp.fs(false);
                }
                if (klz.fs(encryptType4)) {
                    jSONObject = encryptType4;
                }
                fs2.fs("Content-Type", "application/json; charset=utf-8");
                fs2.fs("User-Agent", com.bytedance.sdk.openadsdk.utils.oub.fb());
                fs2.zmn(jSONObject);
                fs2.zmn(6);
                fs2.fs("send_i_p_v6");
                fs2.fs(new com.bytedance.sdk.component.nps.zmn.zmn() { // from class: com.bytedance.sdk.openadsdk.core.klz.1.4
                    @Override // com.bytedance.sdk.component.nps.zmn.zmn
                    public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, com.bytedance.sdk.component.nps.fs fsVar) {
                        if (fsVar.hhw()) {
                            klz.fs(fsVar.fb(), kw, znVar, list);
                            return;
                        }
                        com.bytedance.sdk.openadsdk.cyb.fb.zmn(-1, kw, fsVar.zmn(), fsVar.fs());
                        com.bytedance.sdk.openadsdk.cyb.zmn.btk.zmn("ipv6", kw, fsVar.zmn(), fsVar.fs(), fs2.zn(), list);
                        if (!zmn2) {
                            com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.klz.1.4.1
                                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                    zmnVar.fs("ipv6");
                                    return zmnVar;
                                }
                            });
                        }
                        klz.fb();
                    }

                    @Override // com.bytedance.sdk.component.nps.zmn.zmn
                    public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, IOException iOException) {
                        if (iOException != null) {
                            com.bytedance.sdk.openadsdk.cyb.fb.zmn(-1, kw, 1, iOException.getMessage());
                            com.bytedance.sdk.openadsdk.cyb.zmn.btk.zmn("ipv6", kw, -1, iOException.getMessage(), fs2.zn(), list);
                            if (!zmn2) {
                                com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.klz.1.4.2
                                    @Override // com.bytedance.sdk.openadsdk.kgc.fb
                                    public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                        com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                        zmnVar.fs("ipv6");
                                        return zmnVar;
                                    }
                                });
                            }
                        }
                        klz.fb();
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3 A[Catch: JSONException -> 0x016e, TryCatch #0 {JSONException -> 0x016e, blocks: (B:3:0x0005, B:5:0x0018, B:7:0x002e, B:11:0x0037, B:13:0x0045, B:25:0x0096, B:27:0x00ad, B:31:0x00b8, B:33:0x00be, B:35:0x00cd, B:38:0x00d6, B:40:0x00ea, B:43:0x00f3, B:45:0x00f9, B:47:0x0113, B:50:0x011c, B:52:0x0130, B:55:0x0067, B:58:0x0071, B:61:0x007b, B:64:0x0139, B:66:0x0165), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void fs(String str, String str2, com.bytedance.sdk.component.nps.fs.zn znVar, List<String> list) {
        char c;
        try {
            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
            int optInt = jsonObjectInit.optInt("cypher");
            boolean zmn2 = com.bytedance.sdk.openadsdk.utils.fs.zmn();
            if (optInt != 4) {
                com.bytedance.sdk.openadsdk.cyb.fb.zmn(-1, str2, 1, "cypher type error");
                com.bytedance.sdk.openadsdk.cyb.zmn.btk.zmn("ipv6", str2, -4, "cypher type error", znVar.zn(), list);
                if (zmn2) {
                    return;
                }
                com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.klz.3
                    @Override // com.bytedance.sdk.openadsdk.kgc.fb
                    public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                        com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                        zmnVar.fs("ipv6");
                        return zmnVar;
                    }
                });
                return;
            }
            Pair<Integer, String> decryptType4 = PangleEncryptManager.decryptType4(jsonObjectInit.optString("message"));
            if (decryptType4.second != null) {
                JSONObject jsonObjectInit2 = PangleNetworkBridge.jsonObjectInit((String) decryptType4.second);
                String optString = jsonObjectInit2.optString("ip_type");
                int hashCode = optString.hashCode();
                if (hashCode == 3239397) {
                    if (optString.equals("ipv4")) {
                        c = 1;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else if (hashCode != 3239399) {
                    if (hashCode == 1959784951 && optString.equals("invalid")) {
                        c = 2;
                        if (c != 0) {
                            if (jsonObjectInit2.has(POBConstants.KEY_IP)) {
                                String optString2 = jsonObjectInit2.optString(POBConstants.KEY_IP);
                                com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, optString2);
                                com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("ttopenadsdk", "key_ipv4");
                                HashMap hashMap = new HashMap();
                                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_IPV6, optString2);
                                com.bytedance.sdk.openadsdk.core.klz.zn.zmn(hashMap);
                                com.bytedance.sdk.openadsdk.cyb.fb.zmn(1, str2);
                                if (zmn2) {
                                    return;
                                }
                                com.bytedance.sdk.openadsdk.kgc.zn.fs(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.klz.5
                                    @Override // com.bytedance.sdk.openadsdk.kgc.fb
                                    public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                        com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                        zmnVar.fs("ipv6");
                                        return zmnVar;
                                    }
                                });
                                return;
                            }
                            com.bytedance.sdk.openadsdk.cyb.fb.zmn(-1, str2, 4, "no ip");
                            com.bytedance.sdk.openadsdk.cyb.zmn.btk.zmn("ipv6", str2, -6, "no ip", znVar.zn(), list);
                            if (zmn2) {
                                return;
                            }
                            com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.klz.6
                                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                    zmnVar.fs("ipv6");
                                    return zmnVar;
                                }
                            });
                            return;
                        }
                        if (c != 1) {
                            if (c != 2) {
                                com.bytedance.sdk.openadsdk.cyb.fb.zmn(-1, str2, 3, "no ip type ");
                                com.bytedance.sdk.openadsdk.cyb.zmn.btk.zmn("ipv6", str2, -7, "no ip type ", znVar.zn(), list);
                                if (zmn2) {
                                    return;
                                }
                                com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.klz.9
                                    @Override // com.bytedance.sdk.openadsdk.kgc.fb
                                    public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                        com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                        zmnVar.fs("ipv6");
                                        return zmnVar;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if (jsonObjectInit2.has(POBConstants.KEY_IP)) {
                            com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("ttopenadsdk", "key_ipv4", jsonObjectInit2.optString(POBConstants.KEY_IP));
                            com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6);
                            com.bytedance.sdk.openadsdk.cyb.fb.zmn(1, str2);
                            if (zmn2) {
                                return;
                            }
                            com.bytedance.sdk.openadsdk.kgc.zn.fs(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.klz.7
                                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                    zmnVar.fs("ipv6");
                                    return zmnVar;
                                }
                            });
                            return;
                        }
                        com.bytedance.sdk.openadsdk.cyb.fb.zmn(-1, str2, 4, "no ip");
                        com.bytedance.sdk.openadsdk.cyb.zmn.btk.zmn("ipv6", str2, -6, "no ip", znVar.zn(), list);
                        if (zmn2) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.klz.8
                            @Override // com.bytedance.sdk.openadsdk.kgc.fb
                            public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                zmnVar.fs("ipv6");
                                return zmnVar;
                            }
                        });
                        return;
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else {
                    if (optString.equals("ipv6")) {
                        c = 0;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                }
            } else {
                int intValue = ((Integer) decryptType4.first).intValue();
                com.bytedance.sdk.openadsdk.cyb.fb.zmn(-1, str2, 2, "decrypt failed ".concat(String.valueOf(intValue)));
                com.bytedance.sdk.openadsdk.cyb.zmn.btk.zmn("ipv6", str2, -5, "decrypt failed ".concat(String.valueOf(intValue)), znVar.zn(), list);
                if (zmn2) {
                    return;
                }
                com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.klz.4
                    @Override // com.bytedance.sdk.openadsdk.kgc.fb
                    public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                        com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                        zmnVar.fs("ipv6");
                        return zmnVar;
                    }
                });
            }
        } catch (JSONException unused) {
            com.bytedance.sdk.openadsdk.cyb.fb.zmn(-1, str2, 2, "decrypt failed, wrong data ");
            com.bytedance.sdk.openadsdk.cyb.zmn.btk.zmn("ipv6", str2, -8, "decrypt failed, wrong data ", znVar.zn(), list);
            if (com.bytedance.sdk.openadsdk.utils.fs.zmn()) {
                return;
            }
            com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.klz.10
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("ipv6");
                    return zmnVar;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean fs(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zn() {
        zmn.set(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fb() {
        if (zmn.getAndIncrement() <= 0) {
            com.bytedance.sdk.openadsdk.utils.nu.zmn().schedule(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.klz.2
                @Override // java.lang.Runnable
                public void run() {
                    klz.fs(mw.zmn(kgc.zmn()));
                }
            }, 10000L, TimeUnit.MILLISECONDS);
        }
    }

    private static class zmn implements rp.zmn {
        private static final AtomicBoolean zmn = new AtomicBoolean(false);
        private static volatile long fs = -1;

        private zmn() {
        }

        public static void zmn() {
            if (zmn.compareAndSet(false, true)) {
                fs = System.currentTimeMillis();
                com.bytedance.sdk.component.utils.rp.zmn(new zmn(), kgc.zmn());
            }
        }

        public void fs() {
            com.bytedance.sdk.component.utils.rp.zmn(this);
        }

        @Override // com.bytedance.sdk.component.utils.rp.zmn
        public void zmn(Context context, Intent intent, boolean z, int i) {
            if (System.currentTimeMillis() - fs >= 2000 && i != 0) {
                klz.zn();
                klz.fs(mw.zmn(kgc.zmn()));
                fs();
            }
        }
    }
}
