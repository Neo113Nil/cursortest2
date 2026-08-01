package com.apm.insight.runtime;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import com.apm.insight.nativecrash.NativeImpl;
import java.io.File;
import java.util.Map;

/* loaded from: classes.dex */
public class o {
    private static boolean a = false;
    private static boolean b = false;
    private static boolean c = false;
    private static boolean d = false;
    private static boolean e = false;
    private static c f = new c();
    private static volatile boolean g = false;
    private static boolean h = false;

    public static c a() {
        return f;
    }

    public static void a(long j) {
        NativeImpl.a(j);
    }

    public static synchronized void a(Application application, Context context, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        synchronized (o.class) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (a) {
                return;
            }
            a = true;
            if (context == null || application == null) {
                throw new IllegalArgumentException("context or Application must be not null.");
            }
            com.apm.insight.i.a(application, context);
            if (com.apm.insight.i.t() && (a(application) || b(application) || q())) {
                Log.e("apminsight", "Inner npth checked.");
                return;
            }
            if (z || z2) {
                com.apm.insight.g.a a2 = com.apm.insight.g.a.a();
                if (z2) {
                    a2.a(new com.apm.insight.i.b(context));
                }
                if (z) {
                    a2.b(new com.apm.insight.g.d(context));
                }
                b = true;
            }
            NativeImpl.a();
            if (z3) {
                boolean a3 = NativeImpl.a(context);
                d = a3;
                if (!a3) {
                    e = true;
                }
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                g = true;
                NativeImpl.h();
            }
            g(z4);
            com.apm.insight.l.q.a((Object) ("Npth.init takes " + (SystemClock.uptimeMillis() - uptimeMillis) + " ms."));
        }
    }

    public static synchronized void a(Context context, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        Application application;
        synchronized (o.class) {
            if (com.apm.insight.i.h() != null) {
                application = com.apm.insight.i.h();
            } else if (context instanceof Application) {
                application = (Application) context;
                if (application.getBaseContext() == null) {
                    throw new IllegalArgumentException("The Application passed in when init has not been attached, please pass a attachBaseContext as param and call Npth.setApplication(Application) before init.");
                }
            } else {
                application = (Application) context.getApplicationContext();
                if (application == null) {
                    throw new IllegalArgumentException("Can not get the Application instance since a baseContext was passed in when init, please call Npth.setApplication(Application) before init.");
                }
                if (application.getBaseContext() != null) {
                    context = application.getBaseContext();
                }
            }
            a(application, context, z, z2, z3, z4, j);
        }
    }

    public static void a(ICrashCallback iCrashCallback, CrashType crashType) {
        a().a(iCrashCallback, crashType);
    }

    public static void a(IOOMCallback iOOMCallback) {
        a().a(iOOMCallback);
    }

    public static void a(IOOMCallback iOOMCallback, CrashType crashType) {
        a().b(iOOMCallback);
    }

    public static void a(com.apm.insight.e eVar) {
        com.apm.insight.i.i().setEncryptImpl(eVar);
    }

    public static void a(com.apm.insight.k.h hVar) {
        com.apm.insight.k.e.a(hVar);
    }

    public static void a(j jVar) {
        k.a(jVar);
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.apm.insight.d.a.a(str);
    }

    public static void a(String str, com.apm.insight.a.b bVar, com.apm.insight.a.c cVar) {
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return;
        }
        com.apm.insight.a.a.a().a(str, bVar, cVar);
    }

    public static void a(final String str, final com.apm.insight.f fVar) {
        p.b().a(new Runnable() { // from class: com.apm.insight.runtime.o.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.apm.insight.l.a.b(com.apm.insight.i.g())) {
                    com.apm.insight.b.d.a(str, fVar);
                }
            }
        });
    }

    public static void a(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, com.apm.insight.g gVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.apm.insight.d.a.a(str, map, map2, gVar);
    }

    public static void a(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, Map<String, String> map3, com.apm.insight.g gVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.apm.insight.d.a.a(str, map, map2, map3, gVar);
    }

    @Deprecated
    public static void a(Throwable th) {
        if (com.apm.insight.i.i().isReportErrorEnable()) {
            com.apm.insight.g.a.a(th);
        }
    }

    public static void a(boolean z) {
        com.apm.insight.i.b(z);
    }

    private static boolean a(Context context) {
        try {
            return new File(com.apm.insight.l.o.j(context), "npth").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void b(long j) {
        NativeImpl.b(j);
    }

    public static void b(ICrashCallback iCrashCallback, CrashType crashType) {
        a().b(iCrashCallback, crashType);
    }

    @Deprecated
    public static void b(String str) {
        if (com.apm.insight.i.i().isReportErrorEnable()) {
            com.apm.insight.g.a.c(str);
        }
    }

    public static void b(boolean z) {
        com.apm.insight.i.c(z);
    }

    public static boolean b() {
        return b;
    }

    private static boolean b(Context context) {
        try {
            return new File(context.getApplicationInfo().nativeLibraryDir, "libnpth.so").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void c(long j) {
        NativeImpl.c(j);
    }

    public static void c(String str) {
        NativeImpl.b(str);
    }

    public static void c(boolean z) {
        com.apm.insight.i.d(z);
    }

    public static boolean c() {
        return c;
    }

    public static void d(boolean z) {
        com.apm.insight.i.e(z);
    }

    public static boolean d() {
        return d;
    }

    public static boolean e() {
        return a;
    }

    public static void f() {
        if (!a || b) {
            return;
        }
        Context g2 = com.apm.insight.i.g();
        com.apm.insight.g.a a2 = com.apm.insight.g.a.a();
        a2.a(new com.apm.insight.i.b(g2));
        a2.b(new com.apm.insight.g.d(g2));
    }

    public static void g() {
        if (a) {
            com.apm.insight.b.g.a(com.apm.insight.i.g()).c();
            c = true;
        }
    }

    private static void g(final boolean z) {
        p.b().a(new Runnable() { // from class: com.apm.insight.runtime.o.2
            @Override // java.lang.Runnable
            public void run() {
                if (!o.g) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.apm.insight.runtime.o.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            boolean unused = o.g = true;
                            NativeImpl.h();
                        }
                    });
                }
                o.h(z);
            }
        }, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(boolean z) {
        com.apm.insight.d a2;
        String str;
        Context g2 = com.apm.insight.i.g();
        com.apm.insight.runtime.a.f.a();
        m.a();
        com.apm.insight.k.a("Npth.initAsync-createCallbackThread");
        int b2 = NativeImpl.b();
        com.apm.insight.k.a();
        NativeImpl.c();
        if (!e) {
            if (b2 < 0) {
                a2 = com.apm.insight.c.a();
                str = "createCallbackThread faild";
            }
            com.apm.insight.k.a("Npth.initAsync-NpthDataManager");
            com.apm.insight.e.a.a().a(g2);
            com.apm.insight.k.a();
            com.apm.insight.c.a();
            com.apm.insight.k.a("Npth.initAsync-LaunchScanner");
            com.apm.insight.k.i.a(g2);
            com.apm.insight.k.a();
            if (z) {
                com.apm.insight.k.a("Npth.initAsync-CrashANRHandler");
                com.apm.insight.b.g.a(g2).c();
                com.apm.insight.k.a();
                c = z;
            }
            com.apm.insight.k.a("Npth.initAsync-EventUploadQueue");
            com.apm.insight.k.g.a().b();
            com.apm.insight.k.a();
            com.apm.insight.k.a("Npth.initAsync-BlockMonitor");
            com.apm.insight.k.a();
            com.apm.insight.k.a("Npth.initAsync-OriginExceptionMonitor");
            com.apm.insight.k.a();
            NativeImpl.f();
            com.apm.insight.j.a();
            com.apm.insight.k.k.d();
            NativeImpl.j();
            r.a("afterNpthInitAsync", "noValue");
        }
        a2 = com.apm.insight.c.a();
        str = "NativeLibraryLoad faild";
        a2.a(str);
        com.apm.insight.k.a("Npth.initAsync-NpthDataManager");
        com.apm.insight.e.a.a().a(g2);
        com.apm.insight.k.a();
        com.apm.insight.c.a();
        com.apm.insight.k.a("Npth.initAsync-LaunchScanner");
        com.apm.insight.k.i.a(g2);
        com.apm.insight.k.a();
        if (z) {
        }
        com.apm.insight.k.a("Npth.initAsync-EventUploadQueue");
        com.apm.insight.k.g.a().b();
        com.apm.insight.k.a();
        com.apm.insight.k.a("Npth.initAsync-BlockMonitor");
        com.apm.insight.k.a();
        com.apm.insight.k.a("Npth.initAsync-OriginExceptionMonitor");
        com.apm.insight.k.a();
        NativeImpl.f();
        com.apm.insight.j.a();
        com.apm.insight.k.k.d();
        NativeImpl.j();
        r.a("afterNpthInitAsync", "noValue");
    }

    public static boolean h() {
        if (a && !d) {
            boolean a2 = NativeImpl.a(com.apm.insight.i.g());
            d = a2;
            if (!a2) {
                e = true;
            }
        }
        return d;
    }

    public static boolean i() {
        return com.apm.insight.b.c.c();
    }

    public static void j() {
        if (a) {
            com.apm.insight.b.g.a(com.apm.insight.i.g()).d();
            c = false;
        }
    }

    public static boolean k() {
        return com.apm.insight.g.a.b() || NativeImpl.d();
    }

    public static boolean l() {
        return com.apm.insight.g.a.c() || NativeImpl.d();
    }

    public static boolean m() {
        return com.apm.insight.g.a.b();
    }

    public static boolean n() {
        return h;
    }

    public static void o() {
        h = true;
    }

    private static boolean q() {
        return false;
    }
}
