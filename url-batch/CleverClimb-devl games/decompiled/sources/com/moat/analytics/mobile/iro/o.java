package com.moat.analytics.mobile.iro;

import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.moat.analytics.mobile.iro.p;
import com.moat.analytics.mobile.iro.t;
import java.net.URLEncoder;
import java.util.Locale;

/* loaded from: classes2.dex */
final class o extends Exception {

    /* renamed from: ˎ, reason: contains not printable characters */
    private static Long f1194;

    /* renamed from: ˏ, reason: contains not printable characters */
    private static final Long f1195 = 60000L;

    /* renamed from: ˋ, reason: contains not printable characters */
    private static Exception f1193 = null;

    o(String str) {
        super(str);
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    static String m1289(String str, Exception exc) {
        if (exc instanceof o) {
            return str + " failed: " + exc.getMessage();
        }
        return str + " failed unexpectedly";
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    static void m1290(Exception exc) {
        if (t.m1319().f1232) {
            Log.e("MoatException", Log.getStackTraceString(exc));
        } else {
            m1288(exc);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: ˊ, reason: contains not printable characters */
    private static void m1288(Exception exc) {
        String str;
        String str2;
        String str3;
        Long valueOf;
        try {
            if (t.m1319().f1230 == t.c.f1247) {
                int i = t.m1319().f1228;
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
                    sb.append("&zMoatMMAKv=2bc3418b93f01686fcbd1ebebcc04694651821b2");
                    str2 = "2.4.0";
                    try {
                        p.b m1297 = p.m1297();
                        sb.append("&zMoatMMAKan=" + m1297.m1305());
                        str = m1297.m1304();
                        try {
                            str3 = Integer.toString(Build.VERSION.SDK_INT);
                        } catch (Exception unused2) {
                            str3 = "";
                            sb.append("&d=Android:IRO:" + str + ":-");
                            StringBuilder sb4 = new StringBuilder("&bo=");
                            sb4.append(str2);
                            sb.append(sb4.toString());
                            sb.append("&bd=" + str3);
                            valueOf = Long.valueOf(System.currentTimeMillis());
                            sb.append("&t=" + valueOf);
                            sb.append("&de=" + String.format(Locale.ROOT, "%.0f", Double.valueOf(Math.floor(Math.random() * Math.pow(10.0d, 12.0d)))));
                            sb.append("&cs=0");
                            if (f1194 != null) {
                            }
                            new Thread() { // from class: com.moat.analytics.mobile.iro.l.1

                                /* renamed from: ˎ */
                                private /* synthetic */ String f1183;

                                AnonymousClass1(String str4) {
                                    r1 = str4;
                                }

                                @Override // java.lang.Thread, java.lang.Runnable
                                public final void run() {
                                    try {
                                        l.m1286(r1);
                                    } catch (Exception unused3) {
                                    }
                                }
                            }.start();
                            f1194 = valueOf;
                            return;
                        }
                    } catch (Exception unused3) {
                        str = "";
                    }
                } catch (Exception unused4) {
                    str = "";
                    str2 = "";
                }
                sb.append("&d=Android:IRO:" + str + ":-");
                StringBuilder sb42 = new StringBuilder("&bo=");
                sb42.append(str2);
                sb.append(sb42.toString());
                sb.append("&bd=" + str3);
                valueOf = Long.valueOf(System.currentTimeMillis());
                sb.append("&t=" + valueOf);
                sb.append("&de=" + String.format(Locale.ROOT, "%.0f", Double.valueOf(Math.floor(Math.random() * Math.pow(10.0d, 12.0d)))));
                sb.append("&cs=0");
                if (f1194 != null || valueOf.longValue() - f1194.longValue() > f1195.longValue()) {
                    new Thread() { // from class: com.moat.analytics.mobile.iro.l.1

                        /* renamed from: ˎ */
                        private /* synthetic */ String f1183;

                        AnonymousClass1(String str4) {
                            r1 = str4;
                        }

                        @Override // java.lang.Thread, java.lang.Runnable
                        public final void run() {
                            try {
                                l.m1286(r1);
                            } catch (Exception unused32) {
                            }
                        }
                    }.start();
                    f1194 = valueOf;
                    return;
                }
                return;
            }
            f1193 = exc;
        } catch (Exception unused5) {
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static void m1287() {
        if (f1193 != null) {
            m1288(f1193);
            f1193 = null;
        }
    }
}
