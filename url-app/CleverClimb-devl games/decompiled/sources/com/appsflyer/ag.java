package com.appsflyer;

import android.content.pm.PackageManager;
import android.os.Build;
import com.tapjoy.TapjoyConstants;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class ag {

    /* renamed from: a, reason: collision with root package name */
    private static ag f3431a;
    private JSONObject B;
    private int D;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3432b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3433c = true;

    /* renamed from: d, reason: collision with root package name */
    private final String f3434d = "brand";
    private final String e = "model";
    private final String f = TapjoyConstants.TJC_PLATFORM;
    private final String g = "platform_version";
    private final String h = "advertiserId";
    private final String i = "imei";
    private final String j = TapjoyConstants.TJC_ANDROID_ID;
    private final String k = "sdk_version";
    private final String l = "devkey";
    private final String m = "originalAppsFlyerId";
    private final String n = "uid";
    private final String o = TapjoyConstants.TJC_APP_ID;
    private final String p = "app_version";
    private final String q = "channel";
    private final String r = "preInstall";
    private final String s = "data";
    private final String t = "r_debugging_off";
    private final String u = "r_debugging_on";
    private final String v = "public_api_call";
    private final String w = com.umeng.analytics.pro.b.ao;
    private final String x = "server_request";
    private final String y = "server_response";
    private final String z = "yyyy-MM-dd HH:mm:ssZ";
    private final String A = "MM-dd HH:mm:ss.SSS";
    private String F = "-1";
    private JSONArray C = new JSONArray();
    private boolean E = false;

    private ag() {
        this.D = 0;
        this.D = 0;
    }

    static ag a() {
        if (f3431a == null) {
            f3431a = new ag();
        }
        return f3431a;
    }

    final synchronized void a(String str) {
        this.F = str;
    }

    final synchronized void b() {
        this.E = true;
        a("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
    }

    final synchronized void c() {
        a("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.E = false;
        this.f3432b = false;
    }

    final synchronized void d() {
        this.B = null;
        this.C = null;
        f3431a = null;
    }

    private synchronized void a(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            this.B.put("brand", str);
            this.B.put("model", str2);
            this.B.put(TapjoyConstants.TJC_PLATFORM, "Android");
            this.B.put("platform_version", str3);
            if (str4 != null && str4.length() > 0) {
                this.B.put("advertiserId", str4);
            }
            if (str5 != null && str5.length() > 0) {
                this.B.put("imei", str5);
            }
            if (str6 != null && str6.length() > 0) {
                this.B.put(TapjoyConstants.TJC_ANDROID_ID, str6);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void a(String str, String str2, String str3, String str4) {
        try {
            this.B.put("sdk_version", str);
            if (str2 != null && str2.length() > 0) {
                this.B.put("devkey", str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.B.put("originalAppsFlyerId", str3);
            }
            if (str4 != null && str4.length() > 0) {
                this.B.put("uid", str4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void b(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    this.B.put(TapjoyConstants.TJC_APP_ID, str);
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null && str2.length() > 0) {
            this.B.put("app_version", str2);
        }
        if (str3 != null && str3.length() > 0) {
            this.B.put("channel", str3);
        }
        if (str4 != null && str4.length() > 0) {
            this.B.put("preInstall", str4);
        }
    }

    final void a(String str, String... strArr) {
        a("public_api_call", str, strArr);
    }

    final void a(Throwable th) {
        String[] strArr;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        String message = cause == null ? th.getMessage() : cause.getMessage();
        StackTraceElement[] stackTrace = cause == null ? th.getStackTrace() : cause.getStackTrace();
        if (stackTrace == null) {
            strArr = new String[]{message};
        } else {
            String[] strArr2 = new String[stackTrace.length + 1];
            strArr2[0] = message;
            for (int i = 1; i < stackTrace.length; i++) {
                strArr2[i] = stackTrace[i].toString();
            }
            strArr = strArr2;
        }
        a(com.umeng.analytics.pro.b.ao, simpleName, strArr);
    }

    final void a(String str, String str2) {
        a("server_request", str, str2);
    }

    final void a(String str, int i, String str2) {
        a("server_response", str, String.valueOf(i), str2);
    }

    final void b(String str, String str2) {
        a((String) null, str, str2);
    }

    private synchronized String g() {
        String str;
        try {
            this.B.put("data", this.C);
            str = this.B.toString();
            try {
                h();
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
            str = null;
        }
        return str;
    }

    private synchronized void b(String str, PackageManager packageManager) {
        j a2 = j.a();
        i c2 = i.c();
        String a3 = a2.a("remote_debug_static_data");
        if (a3 != null) {
            try {
                this.B = new JSONObject(a3);
            } catch (Throwable unused) {
            }
        } else {
            this.B = new JSONObject();
            a(Build.BRAND, Build.MODEL, Build.VERSION.RELEASE, a2.a("advertiserId"), c2.f3450d, c2.e);
            a("4.8.10.381", a2.a("AppsFlyerKey"), a2.a("KSAppsFlyerId"), a2.a("uid"));
            try {
                int i = packageManager.getPackageInfo(str, 0).versionCode;
                b(str, String.valueOf(i), a2.a("channel"), a2.a("preInstallName"));
            } catch (Throwable unused2) {
            }
            a2.a("remote_debug_static_data", this.B.toString());
        }
        try {
            this.B.put("launch_counter", this.F);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private synchronized void h() {
        this.C = null;
        this.C = new JSONArray();
        this.D = 0;
    }

    final synchronized void e() {
        this.f3432b = false;
        h();
    }

    final boolean f() {
        return this.E;
    }

    static void a(String str, PackageManager packageManager) {
        try {
            if (f3431a == null) {
                f3431a = new ag();
            }
            f3431a.b(str, packageManager);
            if (f3431a == null) {
                f3431a = new ag();
            }
            String g = f3431a.g();
            x xVar = new x(null, i.c().d());
            xVar.f3516b = g;
            xVar.a();
            StringBuilder sb = new StringBuilder();
            sb.append(m.b("https://monitorsdk.%s/remote-debug?app_id="));
            sb.append(str);
            xVar.execute(sb.toString());
        } catch (Throwable unused) {
        }
    }

    private synchronized void a(String str, String str2, String... strArr) {
        String format;
        if (!(this.f3433c && (this.f3432b || this.E)) || this.D >= 98304) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String str3 = "";
            if (strArr.length > 0) {
                StringBuilder sb = new StringBuilder();
                for (int length = strArr.length - 1; length > 0; length--) {
                    sb.append(strArr[length]);
                    sb.append(", ");
                }
                sb.append(strArr[0]);
                str3 = sb.toString();
            }
            String format2 = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.ENGLISH).format(Long.valueOf(currentTimeMillis));
            if (str != null) {
                format = String.format("%18s %5s _/%s [%s] %s %s", format2, Long.valueOf(Thread.currentThread().getId()), "AppsFlyer_4.8.10", str, str2, str3);
            } else {
                format = String.format("%18s %5s %s/%s %s", format2, Long.valueOf(Thread.currentThread().getId()), str2, "AppsFlyer_4.8.10", str3);
            }
            this.C.put(format);
            this.D += format.getBytes().length;
        } catch (Throwable unused) {
        }
    }
}
