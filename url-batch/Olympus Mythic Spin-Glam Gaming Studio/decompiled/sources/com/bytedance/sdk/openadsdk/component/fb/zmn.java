package com.bytedance.sdk.openadsdk.component.fb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.nps;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.cyb.fb;
import com.bytedance.sdk.openadsdk.cyb.zmn.zn;
import com.bytedance.sdk.openadsdk.uqh.btk;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.ironsource.X3;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class zmn {
    public static void zmn(final nqi nqiVar, final int i) {
        if (com.bytedance.sdk.openadsdk.nqi.zmn.zmn.zmn()) {
            try {
                fb.zmn("ad_show_detail", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.component.fb.zmn.1
                    @Override // com.bytedance.sdk.openadsdk.cyb.fs
                    public zn zmn() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.putOpt("request_id", nqi.this.wbj());
                        jSONObject.putOpt("creative_info", nqi.this.iyj());
                        jSONObject.putOpt("dynamic_show_type", Integer.valueOf(i));
                        jSONObject.putOpt("settings", zmn.fs(nqi.this.qvo()));
                        jSONObject.putOpt(X3.f.e, btk.zmn());
                        return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("ad_show_detail").fs(jSONObject.toString());
                    }
                });
            } catch (Throwable th) {
                iqz.zmn("AbnormalCloseReport", "report exception", th);
            }
        }
    }

    public static void zmn() {
        Map<String, ?> all;
        if (com.bytedance.sdk.openadsdk.nqi.zmn.zmn.zmn()) {
            try {
                SharedPreferences zmn = com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn(kgc.zmn(), "abnormal_close_file");
                if (zmn != null && (all = zmn.getAll()) != null && !all.isEmpty()) {
                    HashSet hashSet = new HashSet(all.keySet());
                    final String jSONObject = new JSONObject(all).toString();
                    if (TextUtils.isEmpty(jSONObject)) {
                        return;
                    }
                    fb.zmn("ad_show_detail", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.component.fb.zmn.2
                        @Override // com.bytedance.sdk.openadsdk.cyb.fs
                        public zn zmn() throws Exception {
                            return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("ad_show_detail").fs(jSONObject);
                        }
                    });
                    fs(hashSet);
                }
            } catch (Throwable th) {
                iqz.zmn("AbnormalCloseReport", "delayReport exception", th);
            }
        }
    }

    public static void fs(final nqi nqiVar, final int i) {
        if (com.bytedance.sdk.openadsdk.nqi.zmn.zmn.zmn()) {
            nu.zn((Runnable) new com.bytedance.sdk.component.zg.fs.zn("save_ad_detail") { // from class: com.bytedance.sdk.openadsdk.component.fb.zmn.3
                @Override // java.lang.Runnable
                public void run() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        String wbj = nqiVar.wbj();
                        jSONObject.putOpt("request_id", wbj);
                        jSONObject.putOpt("creative_info", nqiVar.iyj());
                        jSONObject.putOpt("dynamic_show_type", Integer.valueOf(i));
                        jSONObject.putOpt("settings", zmn.fs(nqiVar.qvo()));
                        jSONObject.putOpt(X3.f.e, btk.zmn());
                        jSONObject.putOpt("timestamp", Long.valueOf(System.currentTimeMillis()));
                        SharedPreferences zmn = com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn(kgc.zmn(), "abnormal_close_file");
                        if (zmn == null) {
                            zmn.fs("abnormal_close_key".concat(String.valueOf(wbj)), jSONObject.toString());
                            return;
                        }
                        Map<String, ?> all = zmn.getAll();
                        if (all.size() >= com.bytedance.sdk.openadsdk.nqi.zmn.zmn.fs()) {
                            String str = null;
                            long j = Long.MAX_VALUE;
                            for (Map.Entry<String, ?> entry : all.entrySet()) {
                                String key = entry.getKey();
                                try {
                                    long optLong = PangleNetworkBridge.jsonObjectInit((String) entry.getValue()).optLong("timestamp", Long.MAX_VALUE);
                                    if (optLong < j) {
                                        str = key;
                                        j = optLong;
                                    }
                                } catch (Throwable th) {
                                    iqz.zmn("AbnormalCloseReport", "parse entry json error", th);
                                }
                            }
                            if (str != null) {
                                zmn.fs((Set<String>) Collections.singleton(str));
                            }
                        }
                        zmn.fs("abnormal_close_key".concat(String.valueOf(wbj)), jSONObject.toString());
                    } catch (Throwable th2) {
                        iqz.zmn("AbnormalCloseReport", "save exception", th2);
                    }
                }
            });
        }
    }

    public static void zmn(nqi nqiVar) {
        if (nqiVar == null) {
            return;
        }
        fs((Set<String>) Collections.singleton("abnormal_close_key".concat(String.valueOf(nqiVar.wbj()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String fs(int i) {
        try {
            File zmn = com.bytedance.sdk.openadsdk.core.settings.zn.zmn();
            zmn.getAbsolutePath();
            zmn.exists();
            if (!zmn.exists()) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray(new String(nps.fb(zmn)));
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                if (jSONObject2.getInt("code_id") == i) {
                    jSONObject.putOpt("ad_slot_conf", jSONObject2);
                }
            }
            jSONObject.putOpt("abtest", fs());
            jSONObject.putOpt("app_common_config", zmn(String.valueOf(i)));
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String fs() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("version", kgc.fb().bvs());
            jSONObject.putOpt("params", kgc.fb().zak());
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String zmn(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return kgc.fb().kw(str).optString("app_common_config");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fs(String str, String str2) {
        SharedPreferences zmn;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (zmn = com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn(kgc.zmn(), "abnormal_close_file")) == null) {
            return;
        }
        SharedPreferences.Editor edit = zmn.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fs(final Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        set.toString();
        nu.zn((Runnable) new com.bytedance.sdk.component.zg.fs.zn("remove_entries_from_sp") { // from class: com.bytedance.sdk.openadsdk.component.fb.zmn.4
            @Override // java.lang.Runnable
            public void run() {
                SharedPreferences zmn = com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn(kgc.zmn(), "abnormal_close_file");
                if (zmn == null) {
                    return;
                }
                SharedPreferences.Editor edit = zmn.edit();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    edit.remove((String) it.next());
                }
                edit.apply();
            }
        });
    }
}
