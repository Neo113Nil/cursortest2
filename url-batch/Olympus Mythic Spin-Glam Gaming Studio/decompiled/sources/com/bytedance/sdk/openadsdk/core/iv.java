package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.fb.nps;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class iv {
    public static final Set<String> fs = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.iv.1
        {
            add("8025677");
            add("5001121");
        }
    };
    private static boolean rc;
    public static rt zmn;
    private String btk;
    private int bvs;
    private com.bytedance.sdk.openadsdk.core.cn.zn.zn cn;
    private volatile ConcurrentHashMap<String, nps.zmn> cyb;

    @NonNull
    private String fb;

    @NonNull
    private String hhw;
    private int iv;
    private String klz;
    private boolean mw;
    private int nps;
    private String rt;

    @Nullable
    private String zg;
    private boolean zn;

    public boolean rt() {
        return true;
    }

    public static void zmn(rt rtVar) {
        zmn = rtVar;
    }

    public boolean zmn() {
        return this.mw;
    }

    public void zmn(boolean z) {
        this.mw = z;
    }

    private iv() {
        this.zn = false;
        this.bvs = 0;
        this.iv = -1;
        this.cyb = null;
    }

    @NonNull
    public static iv fs() {
        return zmn.zmn;
    }

    private static class zmn {
        private static final iv zmn = new iv();
    }

    public boolean zn() {
        return com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_global_file", "sdk_activate_init", true);
    }

    public void fs(boolean z) {
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_global_file", "sdk_activate_init", Boolean.valueOf(z));
    }

    @Nullable
    public String fb() {
        if (TextUtils.isEmpty(this.fb)) {
            String zmn2 = zmn("app_id", Long.MAX_VALUE);
            if (!TextUtils.isEmpty(zmn2)) {
                this.fb = zmn2;
            }
        }
        return this.fb;
    }

    public static void zmn(int i) {
        if (i >= 0) {
            zmn("domain_index", String.valueOf(i));
        }
    }

    public static int btk() {
        try {
            String zmn2 = zmn("domain_index", Long.MAX_VALUE);
            if (TextUtils.isEmpty(zmn2)) {
                return 0;
            }
            return Integer.valueOf(zmn2).intValue();
        } catch (Throwable th) {
            th.getMessage();
            return 0;
        }
    }

    public static void fs(int i) {
        if (i >= 0) {
            zmn("config_fail_times", String.valueOf(i));
        }
    }

    public static int hhw() {
        try {
            String zmn2 = zmn("config_fail_times", Long.MAX_VALUE);
            if (TextUtils.isEmpty(zmn2)) {
                return 0;
            }
            return Integer.valueOf(zmn2).intValue();
        } catch (Throwable th) {
            th.getMessage();
            return 0;
        }
    }

    public void zmn(@NonNull String str) {
        iv(str);
        this.fb = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zmn("app_id", str);
    }

    public String nps() {
        String str = this.btk;
        if (str != null) {
            return str;
        }
        String zmn2 = zmn("mediation_info", Long.MAX_VALUE);
        this.btk = zmn2;
        if (zmn2 == null) {
            this.btk = "";
        }
        return this.btk;
    }

    public void fs(String str) {
        this.btk = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zmn("mediation_info", str);
    }

    @NonNull
    public String zg() {
        if (TextUtils.isEmpty(this.hhw)) {
            this.hhw = zmn(kgc.zmn());
        }
        return this.hhw;
    }

    private String zmn(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (Throwable unused) {
            return "";
        }
    }

    public void zn(int i) {
        this.nps = i;
    }

    public int bvs() {
        return this.nps;
    }

    public void fb(int i) {
        this.iv = i;
    }

    public int iv() {
        return this.iv;
    }

    public boolean rc() {
        int i = this.iv;
        return i < -1 || i > 1;
    }

    @Nullable
    public String klz() {
        return this.zg;
    }

    public void zn(@Nullable final String str) {
        rc(str);
        if (com.bytedance.sdk.openadsdk.utils.nu.hhw()) {
            cn.fs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iv.2
                @Override // java.lang.Runnable
                public void run() {
                    iv.this.bvs(str);
                }
            });
        } else {
            bvs(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bvs(String str) {
        if (!TextUtils.isEmpty(this.zg)) {
            try {
                HashMap hashMap = new HashMap();
                JSONArray jSONArray = new JSONArray(this.zg);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("name");
                        if (!TextUtils.isEmpty(optString)) {
                            hashMap.put(optString, optJSONObject);
                        }
                    }
                }
                JSONArray jSONArray2 = new JSONArray(str);
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    JSONObject optJSONObject2 = jSONArray2.optJSONObject(i2);
                    if (optJSONObject2 != null) {
                        String optString2 = optJSONObject2.optString("name");
                        String optString3 = optJSONObject2.optString("value");
                        if (!TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3)) {
                            hashMap.put(optString2, optJSONObject2);
                        }
                    }
                }
                Collection values = hashMap.values();
                JSONArray jSONArray3 = new JSONArray();
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    jSONArray3.put((JSONObject) it.next());
                }
                this.zg = jSONArray3.toString();
                return;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        this.zg = str;
    }

    public void btk(int i) {
        this.bvs = i;
    }

    private static void iv(String str) {
        rt rtVar;
        if (TextUtils.isEmpty(str) && (rtVar = zmn) != null) {
            rtVar.zmn(4000, "appid cannot be empty");
        }
        com.bytedance.sdk.component.utils.iqz.zn("TTAD.GlobalInfo", "appid cannot be empty");
    }

    private static void rc(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 1000) {
            return;
        }
        rt rtVar = zmn;
        if (rtVar != null) {
            rtVar.zmn(4000, "Data is very long, the longest is 1000");
        }
        com.bytedance.sdk.component.utils.iqz.zn("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
    }

    public com.bytedance.sdk.openadsdk.core.cn.zn.zn mw() {
        if (this.cn == null) {
            this.cn = new com.bytedance.sdk.openadsdk.core.cn.zn.zn(10, 8);
        }
        return this.cn;
    }

    public boolean cn() {
        return fs.contains(this.fb);
    }

    public boolean cyb() {
        return "5001121".contains(this.fb);
    }

    public boolean olo() {
        return "com.union_test.internationad".equals(com.bytedance.sdk.openadsdk.utils.oub.hhw());
    }

    public String kgc() {
        if (!TextUtils.isEmpty(this.rt)) {
            return this.rt;
        }
        String zmn2 = com.bytedance.sdk.openadsdk.utils.klz.zmn();
        this.rt = zmn2;
        if (!TextUtils.isEmpty(zmn2)) {
            return this.rt;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        com.bytedance.sdk.openadsdk.utils.klz.zmn(valueOf);
        this.rt = valueOf;
        return valueOf;
    }

    private static JSONObject klz(String str) {
        String fs2 = com.bytedance.sdk.openadsdk.kw.fb.zmn.fs("sp_global_file", str, (String) null);
        if (TextUtils.isEmpty(fs2)) {
            return null;
        }
        try {
            return PangleNetworkBridge.jsonObjectInit(fs2);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.iqz.zn("TTAD.GlobalInfo", e.getMessage());
            return null;
        }
    }

    public static void zmn(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", str2);
            jSONObject.put("time", System.currentTimeMillis());
            com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_global_file", str, jSONObject.toString());
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.iqz.zn("TTAD.GlobalInfo", e.getMessage());
        }
    }

    public static String zmn(String str, long j) {
        JSONObject klz;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            klz = klz(str);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.iqz.zn("TTAD.GlobalInfo", e.getMessage());
        }
        if (klz == null) {
            return null;
        }
        if (System.currentTimeMillis() - klz.getLong("time") <= j) {
            return klz.getString("value");
        }
        return null;
    }

    public static Pair<String, Long> fb(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject klz = klz(str);
            if (klz == null) {
                return null;
            }
            return new Pair<>(klz.getString("value"), Long.valueOf(klz.getLong("time")));
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.iqz.zn("TTAD.GlobalInfo", e.getMessage());
            return null;
        }
    }

    public nps.zmn btk(String str) {
        try {
            if (this.cyb == null || str == null) {
                return null;
            }
            return this.cyb.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void zmn(String str, nps.zmn zmnVar) {
        try {
            if (TextUtils.isEmpty(str) || zmnVar == null) {
                return;
            }
            if (this.cyb == null) {
                synchronized (iv.class) {
                    try {
                        if (this.cyb == null) {
                            this.cyb = new ConcurrentHashMap<>();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (this.cyb != null) {
                this.cyb.put(str, zmnVar);
            }
        } catch (Throwable unused) {
        }
    }

    public void hhw(String str) {
        try {
            if (TextUtils.isEmpty(str) || this.cyb == null) {
                return;
            }
            this.cyb.remove(str);
        } catch (Throwable unused) {
        }
    }

    public void kw() {
        try {
            if (this.cyb == null || this.cyb.size() != 0) {
                return;
            }
            this.cyb = null;
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void zn(boolean z) {
        this.zn = z;
    }

    public static boolean iqz() {
        return rc;
    }

    public static void phc() {
        if (Build.VERSION.SDK_INT == 26 && "MI 6".equals(Build.MODEL)) {
            rc = true;
        }
    }

    public static boolean nps(String str) {
        return (TextUtils.isEmpty(str) || str.contains("sp_full_screen_video") || str.contains("sp_reward_video") || str.contains("tt_openad") || str.contains("pag_sp_bad_par")) ? false : true;
    }

    public void zg(String str) {
        this.klz = str;
    }

    public String doe() {
        return this.klz;
    }
}
