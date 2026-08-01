package com.apm.insight.entity;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.core.os.EnvironmentCompat;
import com.apm.insight.i;
import com.apm.insight.l.p;
import com.apm.insight.l.q;
import com.apm.insight.l.t;
import com.apm.insight.runtime.s;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Header {
    private static final String[] a = {"version_code", "manifest_version_code", "aid", "update_version_code"};
    private static String d = null;
    private static int e = -1;
    private static int f = -1;
    private Context b;
    private JSONObject c = new JSONObject();

    public Header(Context context) {
        this.b = context;
    }

    public static Header a(Context context) {
        Header header = new Header(context);
        header.e(header.f());
        return header;
    }

    public static Header a(Context context, long j) {
        Header a2;
        s a3 = s.a();
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        JSONObject a4 = a3.a(j);
        if (a4 == null || a4.length() == 0) {
            a2 = a(i.g());
            a2.c();
            try {
                a2.f().put("errHeader", 1);
            } catch (Throwable unused) {
            }
        } else {
            a2 = new Header(i.g());
        }
        b(a2);
        a2.a(a4);
        return a2;
    }

    public static Header a(Header header) {
        addRuntimeHeader(header.f());
        return header;
    }

    public static boolean a() {
        if (e == -1) {
            e = g().contains("64") ? 1 : 0;
        }
        return e == 1;
    }

    public static void addOtherHeader(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        h(jSONObject);
        f(jSONObject);
        g(jSONObject);
        try {
            jSONObject.put("os", "Android");
            jSONObject.put("device_id", i.c().a());
            jSONObject.put("os_version", h());
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            String str = Build.MODEL;
            String str2 = Build.BRAND;
            if (str == null) {
                str = str2;
            } else if (str2 != null && !str.contains(str2)) {
                str = str2 + ' ' + str;
            }
            jSONObject.put("device_model", str);
            jSONObject.put("device_brand", Build.BRAND);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put("cpu_abi", g());
            Context g = i.g();
            String packageName = g.getPackageName();
            jSONObject.put("package", packageName);
            PackageInfo packageInfo = g.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo.applicationInfo != null) {
                int i = packageInfo.applicationInfo.labelRes;
                jSONObject.put("display_name", i > 0 ? g.getString(i) : g.getPackageManager().getApplicationLabel(packageInfo.applicationInfo));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        d.a(jSONObject);
    }

    public static void addRuntimeHeader(JSONObject jSONObject) {
        i(jSONObject);
        j(jSONObject);
    }

    public static Header b(Context context) {
        Header a2 = a(context);
        a(a2);
        b(a2);
        a2.c();
        a2.d();
        a2.e();
        return a2;
    }

    public static void b(Header header) {
        if (header == null) {
            return;
        }
        addOtherHeader(header.f());
    }

    public static boolean b() {
        if (f == -1) {
            f = g().contains("86") ? 1 : 0;
        }
        return f == 1;
    }

    public static boolean b(JSONObject jSONObject) {
        return jSONObject.optInt("unauthentic_version", 0) == 1;
    }

    public static boolean c(JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() == 0 || (jSONObject.opt("app_version") == null && jSONObject.opt("version_name") == null) || jSONObject.opt("version_code") == null || jSONObject.opt("update_version_code") == null;
    }

    public static boolean d(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            String optString = jSONObject.optString("aid");
            if (TextUtils.isEmpty(optString)) {
                return true;
            }
            try {
                return Integer.parseInt(optString) <= 0;
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    private void e(JSONObject jSONObject) {
        try {
            jSONObject.put("sdk_version", 1030839);
            jSONObject.put("sdk_version_name", "1.3.8.nourl-alpha.19");
        } catch (Exception unused) {
        }
    }

    private static void f(JSONObject jSONObject) {
        try {
            DisplayMetrics displayMetrics = i.g().getResources().getDisplayMetrics();
            int i = displayMetrics.densityDpi;
            String str = i != 120 ? i != 240 ? i != 320 ? "mdpi" : "xhdpi" : "hdpi" : "ldpi";
            jSONObject.put("density_dpi", i);
            jSONObject.put("display_density", str);
            jSONObject.put("resolution", displayMetrics.heightPixels + "x" + displayMetrics.widthPixels);
        } catch (Exception unused) {
        }
    }

    private static String g() {
        if (d == null) {
            try {
                StringBuilder sb = new StringBuilder();
                if (Build.SUPPORTED_ABIS.length > 0) {
                    for (int i = 0; i < Build.SUPPORTED_ABIS.length; i++) {
                        sb.append(Build.SUPPORTED_ABIS[i]);
                        if (i != Build.SUPPORTED_ABIS.length - 1) {
                            sb.append(", ");
                        }
                    }
                } else {
                    sb = new StringBuilder(Build.CPU_ABI);
                }
                if (TextUtils.isEmpty(sb.toString())) {
                    d = EnvironmentCompat.MEDIA_UNKNOWN;
                }
                d = sb.toString();
            } catch (Exception e2) {
                q.b((Throwable) e2);
                d = EnvironmentCompat.MEDIA_UNKNOWN;
            }
        }
        return d;
    }

    private static void g(JSONObject jSONObject) {
        try {
            String language = i.g().getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put("language", language);
            }
            int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
            if (rawOffset < -12) {
                rawOffset = -12;
            }
            if (rawOffset > 12) {
                rawOffset = 12;
            }
            jSONObject.put("timezone", rawOffset);
        } catch (Exception unused) {
        }
    }

    private static String h() {
        String str = Build.VERSION.RELEASE;
        return str.contains(".") ? str : str + ".0";
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0043 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:3:0x0005, B:6:0x000d, B:7:0x0038, B:9:0x0043, B:10:0x004c, B:14:0x0011, B:17:0x001a, B:19:0x0024, B:20:0x0029, B:22:0x002f), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void h(JSONObject jSONObject) {
        String str;
        StringBuilder sb = new StringBuilder();
        try {
            if (com.apm.insight.l.d.c()) {
                str = "MIUI-";
            } else {
                if (!com.apm.insight.l.d.d()) {
                    String a2 = com.apm.insight.l.d.a();
                    if (com.apm.insight.l.d.a(a2)) {
                        sb.append("EMUI-");
                    }
                    if (!TextUtils.isEmpty(a2)) {
                        sb.append(a2).append("-");
                    }
                    sb.append(Build.VERSION.INCREMENTAL);
                    if (sb.length() > 0) {
                        jSONObject.put("rom", sb.toString());
                    }
                    jSONObject.put("rom_version", t.a());
                }
                str = "FLYME-";
            }
            sb.append(str);
            sb.append(Build.VERSION.INCREMENTAL);
            if (sb.length() > 0) {
            }
            jSONObject.put("rom_version", t.a());
        } catch (Throwable unused) {
        }
    }

    private static void i(JSONObject jSONObject) {
        try {
            jSONObject.put("access", p.a(i.g()));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private static void j(JSONObject jSONObject) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) i.g().getSystemService("phone");
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (!TextUtils.isEmpty(networkOperatorName)) {
                    jSONObject.put("carrier", networkOperatorName);
                }
                String networkOperator = telephonyManager.getNetworkOperator();
                if (TextUtils.isEmpty(networkOperator)) {
                    return;
                }
                jSONObject.put("mcc_mnc", networkOperator);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public JSONObject a(Map<String, Object> map) {
        if (map == null) {
            return this.c;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!this.c.has(entry.getKey())) {
                this.c.put(entry.getKey(), entry.getValue());
            }
        }
        for (String str : a) {
            if (map.containsKey(str)) {
                try {
                    this.c.put(str, Integer.parseInt(String.valueOf(map.get(str))));
                } catch (Throwable unused) {
                    this.c.put(str, map.get(str));
                }
            }
        }
        if (map.containsKey("version_code") && !map.containsKey("manifest_version_code")) {
            try {
                this.c.put("manifest_version_code", Integer.parseInt(String.valueOf(map.get("version_code"))));
            } catch (Throwable unused2) {
            }
        }
        if (map.containsKey("iid")) {
            this.c.put("udid", map.get("iid"));
            this.c.remove("iid");
        }
        if (map.containsKey("version_name")) {
            this.c.put("app_version", map.get("version_name"));
            this.c.remove("version_name");
        }
        return this.c;
    }

    public JSONObject a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return this.c;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                this.c.put(next, jSONObject.opt(next));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return this.c;
    }

    public JSONObject c() {
        return a(i.a().a());
    }

    public JSONObject d() {
        try {
            this.c.put("device_id", i.c().a());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return this.c;
    }

    public JSONObject e() {
        try {
            long f2 = i.a().f();
            if (f2 > 0) {
                this.c.put("user_id", f2);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return this.c;
    }

    public JSONObject f() {
        return this.c;
    }
}
