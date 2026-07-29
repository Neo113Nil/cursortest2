package com.moat.analytics.mobile.you;

import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.moat.analytics.mobile.you.s;
import com.moat.analytics.mobile.you.w;
import java.net.URLEncoder;
import java.util.Locale;

/* loaded from: classes2.dex */
class m extends Exception {

    /* renamed from: b, reason: collision with root package name */
    private static Long f7508b;

    /* renamed from: a, reason: collision with root package name */
    private static final Long f7507a = 60000L;

    /* renamed from: c, reason: collision with root package name */
    private static Exception f7509c = null;

    m(String str) {
        super(str);
    }

    static String a(String str, Exception exc) {
        if (!(exc instanceof m)) {
            return str + " failed unexpectedly";
        }
        return str + " failed: " + exc.getMessage();
    }

    static void a() {
        if (f7509c != null) {
            b(f7509c);
            f7509c = null;
        }
    }

    static void a(Exception exc) {
        if (w.a().f7539b) {
            Log.e("MoatException", Log.getStackTraceString(exc));
        } else {
            b(exc);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private static void b(Exception exc) {
        String str;
        String str2;
        String str3;
        Long valueOf;
        try {
            if (w.a().f7538a != w.d.ON) {
                f7509c = exc;
                return;
            }
            int i = w.a().e;
            if (i == 0) {
                return;
            }
            if (i < 100) {
                double d2 = i;
                Double.isNaN(d2);
                if (d2 / 100.0d < Math.random()) {
                    return;
                }
            }
            StringBuilder sb = new StringBuilder("https://px.moatads.com/pixel.gif?e=0&i=MOATSDK1&ac=1");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("&zt=");
            sb2.append(exc instanceof m ? 1 : 0);
            sb.append(sb2.toString());
            sb.append("&zr=" + i);
            try {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("&zm=");
                sb3.append(exc.getMessage() == null ? "null" : URLEncoder.encode(Base64.encodeToString(exc.getMessage().getBytes("UTF-8"), 0), "UTF-8"));
                sb.append(sb3.toString());
                sb.append("&k=" + URLEncoder.encode(Base64.encodeToString(Log.getStackTraceString(exc).getBytes("UTF-8"), 0), "UTF-8"));
            } catch (Exception unused) {
            }
            try {
                sb.append("&zMoatMMAKv=9d24c90729bf464dce5d8fd1ace14a60656dbb2d");
                str2 = "2.4.5";
                try {
                    s.a d3 = s.d();
                    sb.append("&zMoatMMAKan=" + d3.a());
                    str = d3.b();
                } catch (Exception unused2) {
                    str = "";
                }
                try {
                    str3 = Integer.toString(Build.VERSION.SDK_INT);
                } catch (Exception unused3) {
                    str3 = "";
                    sb.append("&d=Android:YOU:" + str + ":-");
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("&bo=");
                    sb4.append(str2);
                    sb.append(sb4.toString());
                    sb.append("&bd=" + str3);
                    valueOf = Long.valueOf(System.currentTimeMillis());
                    sb.append("&t=" + valueOf);
                    sb.append("&de=" + String.format(Locale.ROOT, "%.0f", Double.valueOf(Math.floor(Math.random() * Math.pow(10.0d, 12.0d)))));
                    sb.append("&cs=0");
                    if (f7508b != null) {
                    }
                    q.b(sb.toString());
                    f7508b = valueOf;
                }
            } catch (Exception unused4) {
                str = "";
                str2 = "";
            }
            sb.append("&d=Android:YOU:" + str + ":-");
            StringBuilder sb42 = new StringBuilder();
            sb42.append("&bo=");
            sb42.append(str2);
            sb.append(sb42.toString());
            sb.append("&bd=" + str3);
            valueOf = Long.valueOf(System.currentTimeMillis());
            sb.append("&t=" + valueOf);
            sb.append("&de=" + String.format(Locale.ROOT, "%.0f", Double.valueOf(Math.floor(Math.random() * Math.pow(10.0d, 12.0d)))));
            sb.append("&cs=0");
            if (f7508b != null || valueOf.longValue() - f7508b.longValue() > f7507a.longValue()) {
                q.b(sb.toString());
                f7508b = valueOf;
            }
        } catch (Exception unused5) {
        }
    }
}
