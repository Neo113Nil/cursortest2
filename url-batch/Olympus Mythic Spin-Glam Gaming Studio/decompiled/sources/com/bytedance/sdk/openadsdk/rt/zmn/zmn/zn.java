package com.bytedance.sdk.openadsdk.rt.zmn.zmn;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.bjh;
import com.bytedance.sdk.openadsdk.core.model.doe;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.lang.ref.SoftReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class zn {
    private static final LinkedHashMap<String, SoftReference<String>> fb = new LinkedHashMap<String, SoftReference<String>>(16, 0.75f, true) { // from class: com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.1
        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<String, SoftReference<String>> entry) {
            return size() > 5;
        }
    };
    private static volatile zn zmn;
    private nqi btk;
    private final Object fs = new Object();
    private nqi zn = null;

    public interface fs {
        void zmn(List<com.bytedance.sdk.openadsdk.rt.zmn.zmn> list);
    }

    public interface zmn {
        void zmn();

        default void zmn(Exception exc) {
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn$zn, reason: collision with other inner class name */
    public interface InterfaceC0206zn {
        default void fs(String str) {
        }

        void zmn(String str);
    }

    public static zn zmn() {
        if (zmn == null) {
            synchronized (zn.class) {
                try {
                    if (zmn == null) {
                        zmn = new zn();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(String str, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        synchronized (this.fs) {
            LinkedHashMap<String, SoftReference<String>> linkedHashMap = fb;
            linkedHashMap.put(str, new SoftReference<>(str2));
            linkedHashMap.size();
        }
    }

    private String btk(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.fs) {
            try {
                LinkedHashMap<String, SoftReference<String>> linkedHashMap = fb;
                SoftReference<String> softReference = linkedHashMap.get(str);
                if (softReference != null) {
                    String str2 = softReference.get();
                    if (str2 != null) {
                        hhw("After add: ".concat(String.valueOf(str)));
                        return str2;
                    }
                    linkedHashMap.remove(str);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void hhw(String str) {
        Iterator<Map.Entry<String, SoftReference<String>>> it = fb.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey();
        }
    }

    public void zmn(final com.bytedance.sdk.openadsdk.rt.zmn.zmn zmnVar) {
        if (zmnVar == null) {
            return;
        }
        nu.zmn(new com.bytedance.sdk.component.zg.fs.zn("iabhistory_insert") { // from class: com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.rt.zmn.zmn.fs.zmn().zmn(zmnVar);
                } catch (Exception unused) {
                }
            }
        }, 8);
    }

    public void fs(final com.bytedance.sdk.openadsdk.rt.zmn.zmn zmnVar) {
        if (zmnVar == null) {
            return;
        }
        nu.zmn(new com.bytedance.sdk.component.zg.fs.zn("iabhistory_insert") { // from class: com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.rt.zmn.zmn.fs.zmn().fs(zmnVar);
                } catch (Exception unused) {
                }
            }
        }, 8);
    }

    public void zmn(final String str, final InterfaceC0206zn interfaceC0206zn) {
        if (TextUtils.isEmpty(str)) {
            if (interfaceC0206zn != null) {
                interfaceC0206zn.fs("materialKey is empty");
                return;
            }
            return;
        }
        String btk = btk(str);
        if (btk == null) {
            nu.zmn(new com.bytedance.sdk.component.zg.fs.zn("iabhistory_query_material") { // from class: com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String fb2 = zn.this.fb(com.bytedance.sdk.openadsdk.rt.zmn.zmn.fs.zmn().zmn(str));
                        if (!TextUtils.isEmpty(fb2)) {
                            zn.this.zmn(str, fb2);
                        }
                        InterfaceC0206zn interfaceC0206zn2 = interfaceC0206zn;
                        if (interfaceC0206zn2 != null) {
                            interfaceC0206zn2.zmn(fb2);
                        }
                    } catch (Exception e) {
                        InterfaceC0206zn interfaceC0206zn3 = interfaceC0206zn;
                        if (interfaceC0206zn3 != null) {
                            interfaceC0206zn3.fs(e.getMessage());
                        }
                    }
                }
            }, 8);
        } else if (interfaceC0206zn != null) {
            interfaceC0206zn.zmn(btk);
        }
    }

    public void zmn(final fs fsVar) {
        nu.zmn(new com.bytedance.sdk.component.zg.fs.zn("iabhistory_get_all") { // from class: com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    List<com.bytedance.sdk.openadsdk.rt.zmn.zmn> fs2 = com.bytedance.sdk.openadsdk.rt.zmn.zmn.fs.zmn().fs();
                    fs fsVar2 = fsVar;
                    if (fsVar2 != null) {
                        if (fs2 == null) {
                            fs2 = Collections.emptyList();
                        }
                        fsVar2.zmn(fs2);
                    }
                } catch (Exception unused) {
                }
            }
        }, 8);
    }

    public void zmn(final zmn zmnVar) {
        nu.zmn(new com.bytedance.sdk.component.zg.fs.zn("iabhistory_clear") { // from class: com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.rt.zmn.zmn.fs.zmn().zn();
                    zn.fb.clear();
                    zmn zmnVar2 = zmnVar;
                    if (zmnVar2 != null) {
                        zmnVar2.zmn();
                    }
                } catch (Exception e) {
                    zmn zmnVar3 = zmnVar;
                    if (zmnVar3 != null) {
                        zmnVar3.zmn(e);
                    }
                }
            }
        }, 8);
    }

    public void fs() {
        nu.zmn(new com.bytedance.sdk.component.zg.fs.zn("iabhistory_clear_overlimit") { // from class: com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.rt.zmn.zmn.fs.zmn().fb();
                } catch (Exception unused) {
                }
            }
        }, 8);
    }

    public String zmn(String str) {
        try {
            return d.u + new URL(str).getHost() + "/favicon.ico";
        } catch (Exception unused) {
            return null;
        }
    }

    public static List<nqi> fs(String str) {
        if (str == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        com.bytedance.sdk.openadsdk.core.model.zmn zmnVar = new com.bytedance.sdk.openadsdk.core.model.zmn();
        try {
            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
            zmnVar.zmn(jsonObjectInit.optString("request_id"));
            zmnVar.zmn(jsonObjectInit.optInt("ret"));
            zmnVar.fs(jsonObjectInit.optInt("multi_ad_style", 0));
            zmnVar.fs(jsonObjectInit.optString("message"));
            String optString = jsonObjectInit.optString("gdid_encrypted");
            zmnVar.zmn(doe.zmn(jsonObjectInit.optJSONObject("loop_config")));
            String optString2 = jsonObjectInit.optString("auction_price");
            if (zmnVar.fb() != 0) {
                return null;
            }
            zmnVar.zmn(bjh.zmn(jsonObjectInit.optString("multi_ad_config")));
            JSONArray optJSONArray = jsonObjectInit.optJSONArray("creatives");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    nqi zmn2 = com.bytedance.sdk.openadsdk.core.fs.zmn(optJSONArray.optJSONObject(i), null, null, zmnVar, i);
                    if (zmn2 != null) {
                        zmn2.rt(optString2);
                        if (TextUtils.isEmpty(zmn2.iyj())) {
                            zmn2.tf(jsonObjectInit.toString());
                        }
                        if (!TextUtils.isEmpty(optString)) {
                            zmn2.bvs(optString);
                        }
                    }
                    zmnVar.zmn(zmn2);
                    arrayList.add(zmn2);
                }
            }
            return arrayList.isEmpty() ? zmnVar.btk() : arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    public String zn(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.bytedance.sdk.openadsdk.rt.zmn.zmn.zmn.zmn(str, "XOR$1_");
        } catch (Exception unused) {
            return null;
        }
    }

    public String fb(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            String fs2 = com.bytedance.sdk.openadsdk.rt.zmn.zmn.zmn.fs(str, "XOR$1_");
            return !TextUtils.isEmpty(fs2) ? fs2 : str;
        } catch (Exception unused) {
            return null;
        }
    }

    public void zmn(nqi nqiVar) {
        this.btk = nqiVar;
    }

    public nqi zn() {
        return this.btk;
    }
}
