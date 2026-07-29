package com.tencent.bugly.crashreport.crash;

import android.content.Context;
import com.tapjoy.TJAdUnitConstants;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.w;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.y;
import com.tencent.bugly.proguard.z;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static d f8660a;

    /* renamed from: b, reason: collision with root package name */
    private com.tencent.bugly.crashreport.common.strategy.a f8661b;

    /* renamed from: c, reason: collision with root package name */
    private com.tencent.bugly.crashreport.common.info.a f8662c;

    /* renamed from: d, reason: collision with root package name */
    private b f8663d;
    private Context e;

    static /* synthetic */ void a(d dVar) {
        x.c("[ExtraCrashManager] Trying to notify Bugly agents.", new Object[0]);
        try {
            Class<?> cls = Class.forName("com.tencent.bugly.agent.GameAgent");
            String str = "com.tencent.bugly";
            dVar.f8662c.getClass();
            if (!"".equals("")) {
                str = "com.tencent.bugly.";
            }
            z.a(cls, "sdkPackageName", str, (Object) null);
            x.c("[ExtraCrashManager] Bugly game agent has been notified.", new Object[0]);
        } catch (Throwable unused) {
            x.a("[ExtraCrashManager] no game agent", new Object[0]);
        }
    }

    static /* synthetic */ void a(d dVar, Thread thread, int i, String str, String str2, String str3, Map map) {
        String str4;
        String str5;
        String str6;
        switch (i) {
            case 4:
                str4 = "Unity";
                break;
            case 5:
            case 6:
                str4 = "Cocos";
                break;
            case 7:
            default:
                x.d("[ExtraCrashManager] Unknown extra crash type: %d", Integer.valueOf(i));
                return;
            case 8:
                str4 = "H5";
                break;
        }
        String str7 = str4;
        x.e("[ExtraCrashManager] %s Crash Happen", str7);
        try {
            try {
                if (!dVar.f8661b.b()) {
                    x.e("waiting for remote sync", new Object[0]);
                    int i2 = 0;
                    while (!dVar.f8661b.b()) {
                        z.b(500L);
                        i2 += TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL;
                        if (i2 >= 3000) {
                        }
                    }
                }
                if (!dVar.f8661b.b()) {
                    x.d("[ExtraCrashManager] There is no remote strategy, but still store it.", new Object[0]);
                }
                StrategyBean c2 = dVar.f8661b.c();
                if (!c2.g && dVar.f8661b.b()) {
                    x.e("[ExtraCrashManager] Crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
                    b.a(str7, z.a(), dVar.f8662c.f8601d, thread, str + "\n" + str2 + "\n" + str3, null);
                    x.e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                    return;
                }
                switch (i) {
                    case 5:
                    case 6:
                        if (!c2.l) {
                            x.e("[ExtraCrashManager] %s report is disabled.", str7);
                            x.e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                            return;
                        }
                        break;
                    case 8:
                        if (!c2.m) {
                            x.e("[ExtraCrashManager] %s report is disabled.", str7);
                            x.e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                            return;
                        }
                        break;
                }
                if (i == 8) {
                    i = 5;
                }
                CrashDetailBean crashDetailBean = new CrashDetailBean();
                crashDetailBean.B = com.tencent.bugly.crashreport.common.info.b.g();
                crashDetailBean.C = com.tencent.bugly.crashreport.common.info.b.e();
                crashDetailBean.D = com.tencent.bugly.crashreport.common.info.b.i();
                crashDetailBean.E = dVar.f8662c.p();
                crashDetailBean.F = dVar.f8662c.o();
                crashDetailBean.G = dVar.f8662c.q();
                crashDetailBean.w = z.a(dVar.e, c.e, (String) null);
                crashDetailBean.f8620b = i;
                crashDetailBean.e = dVar.f8662c.h();
                crashDetailBean.f = dVar.f8662c.j;
                crashDetailBean.g = dVar.f8662c.w();
                crashDetailBean.m = dVar.f8662c.g();
                crashDetailBean.n = str;
                crashDetailBean.o = str2;
                str5 = "";
                if (str3 != null) {
                    String[] split = str3.split("\n");
                    str5 = split.length > 0 ? split[0] : "";
                    str6 = str3;
                } else {
                    str6 = "";
                }
                crashDetailBean.p = str5;
                crashDetailBean.q = str6;
                crashDetailBean.r = System.currentTimeMillis();
                crashDetailBean.u = z.b(crashDetailBean.q.getBytes());
                crashDetailBean.y = z.a(c.f, false);
                crashDetailBean.z = dVar.f8662c.f8601d;
                crashDetailBean.A = thread.getName() + "(" + thread.getId() + ")";
                crashDetailBean.H = dVar.f8662c.y();
                crashDetailBean.h = dVar.f8662c.v();
                crashDetailBean.L = dVar.f8662c.f8598a;
                crashDetailBean.M = dVar.f8662c.a();
                crashDetailBean.O = dVar.f8662c.F();
                crashDetailBean.P = dVar.f8662c.G();
                crashDetailBean.Q = dVar.f8662c.z();
                crashDetailBean.R = dVar.f8662c.E();
                dVar.f8663d.c(crashDetailBean);
                crashDetailBean.x = y.a();
                if (crashDetailBean.N == null) {
                    crashDetailBean.N = new LinkedHashMap();
                }
                if (map != null) {
                    crashDetailBean.N.putAll(map);
                }
                b.a(str7, z.a(), dVar.f8662c.f8601d, thread, str + "\n" + str2 + "\n" + str3, crashDetailBean);
                if (!dVar.f8663d.a(crashDetailBean)) {
                    dVar.f8663d.a(crashDetailBean, 3000L, false);
                }
                x.e("[ExtraCrashManager] Successfully handled.", new Object[0]);
            } catch (Throwable th) {
                if (!x.a(th)) {
                    th.printStackTrace();
                }
                x.e("[ExtraCrashManager] Successfully handled.", new Object[0]);
            }
        } catch (Throwable th2) {
            x.e("[ExtraCrashManager] Successfully handled.", new Object[0]);
            throw th2;
        }
    }

    private d(Context context) {
        c a2 = c.a();
        if (a2 == null) {
            return;
        }
        this.f8661b = com.tencent.bugly.crashreport.common.strategy.a.a();
        this.f8662c = com.tencent.bugly.crashreport.common.info.a.a(context);
        this.f8663d = a2.o;
        this.e = context;
        w.a().a(new Runnable() { // from class: com.tencent.bugly.crashreport.crash.d.1
            @Override // java.lang.Runnable
            public final void run() {
                d.a(d.this);
            }
        });
    }

    public static d a(Context context) {
        if (f8660a == null) {
            f8660a = new d(context);
        }
        return f8660a;
    }

    public static void a(final Thread thread, final int i, final String str, final String str2, final String str3, final Map<String, String> map) {
        w.a().a(new Runnable() { // from class: com.tencent.bugly.crashreport.crash.d.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (d.f8660a != null) {
                        d.a(d.f8660a, thread, i, str, str2, str3, map);
                    } else {
                        x.e("[ExtraCrashManager] Extra crash manager has not been initialized.", new Object[0]);
                    }
                } catch (Throwable th) {
                    if (!x.b(th)) {
                        th.printStackTrace();
                    }
                    x.e("[ExtraCrashManager] Crash error %s %s %s", str, str2, str3);
                }
            }
        });
    }
}
