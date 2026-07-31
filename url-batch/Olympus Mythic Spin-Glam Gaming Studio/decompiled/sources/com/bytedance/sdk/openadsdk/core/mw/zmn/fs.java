package com.bytedance.sdk.openadsdk.core.mw.zmn;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.iv;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class fs {
    private static volatile fs zmn;

    public interface zmn {
        void zmn(int i, String str, String str2);

        void zmn(JSONObject jSONObject, String str);
    }

    public static fs zmn() {
        if (zmn == null) {
            synchronized (fs.class) {
                try {
                    if (zmn == null) {
                        zmn = new fs();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.mw.zg.zmn zmnVar, String str) {
        if (zmnVar == null || TextUtils.isEmpty(zmnVar.zmn())) {
            return;
        }
        final String str2 = str + "_" + zmnVar.zmn();
        final String zn = zmnVar.zn();
        final String fs = zmnVar.fs();
        final String fb = zmnVar.fb();
        String btk = zmnVar.btk();
        if (TextUtils.isEmpty(btk)) {
            if (str.equals("ad")) {
                btk = iv.fs().fb();
            } else if (str.equals("adv3")) {
                btk = iv.fs().fb() + "_v3";
            }
        }
        final String str3 = btk;
        nu.zmn(new com.bytedance.sdk.component.zg.fs.zn("saveUGenTemplate") { // from class: com.bytedance.sdk.openadsdk.core.mw.zmn.fs.1
            @Override // java.lang.Runnable
            public void run() {
                fs.this.zmn(str2, zn, fs, fb, str3);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(String str, String str2, String str3, String str4, String str5) {
        if (zmn(str, str3) != null) {
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                return;
            }
            fs(str2, str3, str5, str4, str);
            return;
        }
        if (TextUtils.isEmpty(str4)) {
            zmn(str2, str, str3, str5, (zmn) null);
        } else {
            fs(str2, str3, str5, str4, str);
        }
    }

    public void zmn(String str, String str2, String str3, String str4, String str5, final zmn zmnVar) {
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            if (zmnVar != null) {
                zmnVar.zmn(1, "id  or md5 is empty", "net");
                return;
            }
            return;
        }
        String str6 = str + "_" + str3;
        com.bytedance.sdk.openadsdk.core.mw.zmn.zmn zmn2 = zmn(str6, str4);
        if (zmn2 == null || TextUtils.isEmpty(zmn2.btk())) {
            zmn(str2, str6, str4, str5, new zmn() { // from class: com.bytedance.sdk.openadsdk.core.mw.zmn.fs.2
                @Override // com.bytedance.sdk.openadsdk.core.mw.zmn.fs.zmn
                public void zmn(JSONObject jSONObject, String str7) {
                    zmn zmnVar2 = zmnVar;
                    if (zmnVar2 != null) {
                        zmnVar2.zmn(jSONObject, str7);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.mw.zmn.fs.zmn
                public void zmn(int i, String str7, String str8) {
                    zmn zmnVar2 = zmnVar;
                    if (zmnVar2 != null) {
                        zmnVar2.zmn(i, str7, str8);
                    }
                }
            });
            return;
        }
        zmn(zmn2);
        if (zmnVar != null) {
            try {
                zmnVar.zmn(PangleNetworkBridge.jsonObjectInit(zmn2.btk()), "local");
            } catch (JSONException unused) {
                zmnVar.zmn(2, "parse json exception data is " + zmn2.btk(), "local");
            }
        }
    }

    private void zmn(final String str, final String str2, final String str3, final String str4, final zmn zmnVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            if (zmnVar != null) {
                zmnVar.zmn(1, "template url or id  or md5 is empty", "net");
            }
        } else {
            com.bytedance.sdk.component.nps.fs.fs zn = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().zn();
            zn.zn(str);
            zn.zmn(7);
            zn.fs("load_ug_t");
            zn.fs(new com.bytedance.sdk.component.nps.zmn.zmn() { // from class: com.bytedance.sdk.openadsdk.core.mw.zmn.fs.3
                @Override // com.bytedance.sdk.component.nps.zmn.zmn
                public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, com.bytedance.sdk.component.nps.fs fsVar) {
                    if (fsVar == null) {
                        return;
                    }
                    if (fsVar.hhw()) {
                        String fb = fsVar.fb();
                        if (TextUtils.isEmpty(fb)) {
                            zmn zmnVar2 = zmnVar;
                            if (zmnVar2 != null) {
                                zmnVar2.zmn(3, "net data is null", "net");
                                return;
                            }
                            return;
                        }
                        zn.zmn().zmn(new com.bytedance.sdk.openadsdk.core.mw.zmn.zmn().zmn(str2).fs(str3).zn(str).btk(str4).fb(fb).zmn(Long.valueOf(System.currentTimeMillis())));
                        fs.this.fs();
                        if (zmnVar != null) {
                            try {
                                zmnVar.zmn(PangleNetworkBridge.jsonObjectInit(fb), "net");
                                return;
                            } catch (JSONException unused) {
                                zmnVar.zmn(2, "parse json exception data is".concat(String.valueOf(fb)), "net");
                                return;
                            }
                        }
                        return;
                    }
                    zmn zmnVar3 = zmnVar;
                    if (zmnVar3 != null) {
                        zmnVar3.zmn(3, "net code error code is " + fsVar.zmn() + " message is " + fsVar.fs(), "net");
                    }
                }

                @Override // com.bytedance.sdk.component.nps.zmn.zmn
                public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, IOException iOException) {
                    zmn zmnVar2 = zmnVar;
                    if (zmnVar2 != null) {
                        zmnVar2.zmn(3, "net error " + iOException.getMessage(), "net");
                    }
                }
            });
        }
    }

    public Set<com.bytedance.sdk.openadsdk.core.mw.zmn.zmn> zmn(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return zn.zmn().zmn(str);
    }

    public String zmn(String str, String str2, String str3) {
        com.bytedance.sdk.openadsdk.core.mw.zmn.zmn zmn2 = zmn(str + "_" + str2, str3);
        if (zmn2 == null) {
            return null;
        }
        zmn(zmn2);
        return zmn2.btk();
    }

    private com.bytedance.sdk.openadsdk.core.mw.zmn.zmn zmn(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return zn.zmn().zmn(str, str2);
    }

    private void fs(String str, String str2, String str3, String str4, String str5) {
        com.bytedance.sdk.openadsdk.core.mw.zmn.zmn zmnVar = new com.bytedance.sdk.openadsdk.core.mw.zmn.zmn();
        zmnVar.zn(str).btk(str3).fb(str4).fs(str2).zmn(str5).zmn(Long.valueOf(System.currentTimeMillis()));
        zn.zmn().zmn(zmnVar);
        fs();
    }

    private void zmn(final com.bytedance.sdk.openadsdk.core.mw.zmn.zmn zmnVar) {
        zmnVar.zmn(Long.valueOf(System.currentTimeMillis()));
        nu.zmn(new com.bytedance.sdk.component.zg.fs.zn("updateTmplTime") { // from class: com.bytedance.sdk.openadsdk.core.mw.zmn.fs.4
            @Override // java.lang.Runnable
            public void run() {
                zn.zmn().zmn(zmnVar);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs() {
        int btk = kgc.fb().btk();
        if (btk <= 0) {
            btk = 100;
        }
        List<com.bytedance.sdk.openadsdk.core.mw.zmn.zmn> fs = zn.zmn().fs();
        if (fs == null || fs.isEmpty() || btk >= fs.size()) {
            if (fs == null) {
                return;
            }
            fs.size();
            return;
        }
        int size = (int) (fs.size() - (btk * 0.75f));
        if (size <= 0) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.openadsdk.core.mw.zmn.zmn zmnVar : fs) {
            treeMap.put(zmnVar.fb(), zmnVar);
        }
        HashSet hashSet = new HashSet();
        int i = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i < size) {
                i++;
                com.bytedance.sdk.openadsdk.core.mw.zmn.zmn zmnVar2 = (com.bytedance.sdk.openadsdk.core.mw.zmn.zmn) entry.getValue();
                if (zmnVar2 != null) {
                    hashSet.add(zmnVar2.zmn());
                }
            }
        }
        zmn(hashSet);
    }

    public void zmn(Set<String> set) {
        try {
            zn.zmn().zmn(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
