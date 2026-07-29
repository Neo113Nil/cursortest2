package com.moat.analytics.mobile.cha;

import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.moat.analytics.mobile.cha.r;
import com.moat.analytics.mobile.cha.t;
import java.net.URLEncoder;
import java.util.Locale;

/* loaded from: classes2.dex */
final class o extends Exception {

    /* renamed from: ॱ, reason: contains not printable characters */
    private static Long f972;

    /* renamed from: ˏ, reason: contains not printable characters */
    private static final Long f971 = 60000L;

    /* renamed from: ˋ, reason: contains not printable characters */
    private static Exception f970 = null;

    o(String str) {
        super(str);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    static String m1109(String str, Exception exc) {
        if (exc instanceof o) {
            return str + " failed: " + exc.getMessage();
        }
        return str + " failed unexpectedly";
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    static void m1110(Exception exc) {
        if (t.m1144().f1012) {
            Log.e("MoatException", Log.getStackTraceString(exc));
        } else {
            m1108(exc);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: ˋ, reason: contains not printable characters */
    private static void m1108(Exception exc) {
        String str;
        String str2;
        String str3;
        Long valueOf;
        try {
            if (t.m1144().f1011 == t.a.f1022) {
                int i = t.m1144().f1014;
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
                StringBuilder sb2 = new StringBuilder("&zt=");
                sb2.append(exc instanceof o ? 1 : 0);
                sb.append(sb2.toString());
                sb.append("&zr=" + i);
                try {
                    StringBuilder sb3 = new StringBuilder("&zm=");
                    sb3.append(exc.getMessage() == null ? "null" : URLEncoder.encode(Base64.encodeToString(exc.getMessage().getBytes("UTF-8"), 0), "UTF-8"));
                    sb.append(sb3.toString());
                    sb.append("&k=" + URLEncoder.encode(Base64.encodeToString(Log.getStackTraceString(exc).getBytes("UTF-8"), 0), "UTF-8"));
                } catch (Exception unused) {
                }
                try {
                    sb.append("&zMoatMMAKv=35d482907bc2811c2e46b96f16eb5f9fe00185f3");
                    str2 = BuildConfig.JMMAK_VERSION;
                    try {
                        r.e m1124 = r.m1124();
                        sb.append("&zMoatMMAKan=" + m1124.m1135());
                        str = m1124.m1134();
                        try {
                            str3 = Integer.toString(Build.VERSION.SDK_INT);
                        } catch (Exception unused2) {
                            str3 = "";
                            sb.append("&d=Android:" + BuildConfig.NAMESPACE + ":" + str + ":-");
                            StringBuilder sb4 = new StringBuilder("&bo=");
                            sb4.append(str2);
                            sb.append(sb4.toString());
                            sb.append("&bd=" + str3);
                            valueOf = Long.valueOf(System.currentTimeMillis());
                            sb.append("&t=" + valueOf);
                            sb.append("&de=" + String.format(Locale.ROOT, "%.0f", Double.valueOf(Math.floor(Math.random() * Math.pow(10.0d, 12.0d)))));
                            sb.append("&cs=0");
                            if (f972 != null) {
                            }
                            new Thread() { // from class: com.moat.analytics.mobile.cha.m.2

                                /* renamed from: ˎ */
                                private /* synthetic */ String f959;

                                AnonymousClass2(String str4) {
                                    r1 = str4;
                                }

                                @Override // java.lang.Thread, java.lang.Runnable
                                public final void run() {
                                    try {
                                        m.m1088(r1);
                                    } catch (Exception unused3) {
                                    }
                                }
                            }.start();
                            f972 = valueOf;
                            return;
                        }
                    } catch (Exception unused3) {
                        str = "";
                    }
                } catch (Exception unused4) {
                    str = "";
                    str2 = "";
                }
                sb.append("&d=Android:" + BuildConfig.NAMESPACE + ":" + str + ":-");
                StringBuilder sb42 = new StringBuilder("&bo=");
                sb42.append(str2);
                sb.append(sb42.toString());
                sb.append("&bd=" + str3);
                valueOf = Long.valueOf(System.currentTimeMillis());
                sb.append("&t=" + valueOf);
                sb.append("&de=" + String.format(Locale.ROOT, "%.0f", Double.valueOf(Math.floor(Math.random() * Math.pow(10.0d, 12.0d)))));
                sb.append("&cs=0");
                if (f972 != null || valueOf.longValue() - f972.longValue() > f971.longValue()) {
                    new Thread() { // from class: com.moat.analytics.mobile.cha.m.2

                        /* renamed from: ˎ */
                        private /* synthetic */ String f959;

                        AnonymousClass2(String str4) {
                            r1 = str4;
                        }

                        @Override // java.lang.Thread, java.lang.Runnable
                        public final void run() {
                            try {
                                m.m1088(r1);
                            } catch (Exception unused32) {
                            }
                        }
                    }.start();
                    f972 = valueOf;
                    return;
                }
                return;
            }
            f970 = exc;
        } catch (Exception unused5) {
        }
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    static void m1111() {
        if (f970 != null) {
            m1108(f970);
            f970 = null;
        }
    }
}
