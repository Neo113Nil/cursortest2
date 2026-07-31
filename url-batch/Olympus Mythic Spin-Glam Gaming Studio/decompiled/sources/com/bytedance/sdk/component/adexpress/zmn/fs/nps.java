package com.bytedance.sdk.component.adexpress.zmn.fs;

import android.text.TextUtils;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class nps {
    private static volatile nps zmn;
    private AtomicBoolean fs = new AtomicBoolean(false);

    public static nps zmn() {
        if (zmn == null) {
            synchronized (nps.class) {
                try {
                    if (zmn == null) {
                        zmn = new nps();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    private nps() {
    }

    public com.bytedance.sdk.component.adexpress.zmn.zn.fs zmn(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return hhw.zmn().zmn(str);
    }

    public Set<String> fs(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return hhw.zmn().fs(str);
    }

    private void fs() {
        if (com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn() == null) {
            return;
        }
        int zmn2 = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn().zmn();
        if (zmn2 <= 0) {
            zmn2 = 100;
        }
        List<com.bytedance.sdk.component.adexpress.zmn.zn.fs> fs = hhw.zmn().fs();
        if (fs == null || fs.isEmpty() || zmn2 >= fs.size()) {
            if (fs == null) {
                return;
            }
            fs.size();
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.component.adexpress.zmn.zn.fs fsVar : fs) {
            treeMap.put(fsVar.nps(), fsVar);
        }
        HashSet hashSet = new HashSet();
        int size = (int) (fs.size() - (zmn2 * 0.75f));
        int i = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i < size) {
                i++;
                ((Long) entry.getKey()).longValue();
                com.bytedance.sdk.component.adexpress.zmn.zn.fs fsVar2 = (com.bytedance.sdk.component.adexpress.zmn.zn.fs) entry.getValue();
                if (fsVar2 != null) {
                    hashSet.add(fsVar2.fs());
                }
            }
        }
        zmn(hashSet);
        this.fs.set(false);
    }

    private JSONObject zn(String str) {
        com.bytedance.sdk.component.adexpress.zmn.zmn.zn zn = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn();
        if (zn == null) {
            return null;
        }
        com.bytedance.sdk.component.nps.fs.fs nps = zn.nps();
        nps.zn(str);
        com.bytedance.sdk.component.nps.fs btk = nps.btk();
        if (btk != null) {
            try {
                if (btk.hhw() && btk.fb() != null) {
                    return PangleNetworkBridge.jsonObjectInit(btk.fb());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public void zmn(com.bytedance.sdk.component.adexpress.zmn.zn.fb fbVar, String str) {
        String str2;
        if (fbVar == null) {
            return;
        }
        final String str3 = fbVar.zmn;
        final String str4 = fbVar.zn;
        final String str5 = fbVar.fs;
        final String str6 = fbVar.fb;
        final String str7 = fbVar.btk;
        if (com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn() == null) {
            str2 = "";
        } else {
            str2 = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn().zg();
        }
        final String str8 = TextUtils.isEmpty(str) ? str2 : str;
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.fb.fb.zmn(new com.bytedance.sdk.component.zg.fs.zn("saveTemplate") { // from class: com.bytedance.sdk.component.adexpress.zmn.fs.nps.1
            @Override // java.lang.Runnable
            public void run() {
                nps.this.zmn(str3, str4, str5, str6, str7, str8);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void zmn(String str, String str2, String str3, String str4, String str5, String str6) {
        if (zmn(str) != null) {
            if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
                fs(str6, str, str3, str2, str4, str5);
            }
            return;
        } else if (TextUtils.isEmpty(str4)) {
            zmn(str2, str6, str);
        } else if (TextUtils.isEmpty(str3)) {
            zmn(str2, str6, str);
        } else {
            fs(str6, str, str3, str2, str4, str5);
        }
        boolean zmn2 = zg.zmn(str5);
        if (!fs.btk() || zmn2) {
            btk.fs().zmn(true);
        }
    }

    private void zmn(String str, String str2, String str3) {
        JSONObject zn;
        if (TextUtils.isEmpty(str) || (zn = zn(str)) == null) {
            return;
        }
        String optString = zn.optString("md5");
        String optString2 = zn.optString("version");
        String optString3 = zn.optString("data");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.zmn.zn.fs zmn2 = new com.bytedance.sdk.component.adexpress.zmn.zn.fs().zmn(str2).fs(str3).zn(optString).fb(str).btk(optString3).hhw(optString2).zmn(Long.valueOf(System.currentTimeMillis()));
        hhw.zmn().zmn(zmn2, false);
        fs();
        if (zg.zmn(optString2)) {
            zmn2.hhw(optString2);
            btk.fs().zmn(true);
        }
    }

    private void fs(String str, String str2, String str3, String str4, String str5, String str6) {
        hhw.zmn().zmn(new com.bytedance.sdk.component.adexpress.zmn.zn.fs().zmn(str).fs(str2).zn(str3).fb(str4).btk(str5).hhw(str6).zmn(Long.valueOf(System.currentTimeMillis())), false);
        fs();
    }

    public void zmn(Set<String> set) {
        try {
            hhw.zmn().zmn(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
