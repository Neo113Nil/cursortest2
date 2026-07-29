package com.tencent.bugly.crashreport.crash;

import android.content.Context;
import android.os.Process;
import com.tapjoy.TJAdUnitConstants;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.y;
import com.tencent.bugly.proguard.z;
import java.lang.Thread;
import java.util.HashMap;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class e implements Thread.UncaughtExceptionHandler {
    private static String h;
    private static final Object i = new Object();

    /* renamed from: a, reason: collision with root package name */
    private Context f8669a;

    /* renamed from: b, reason: collision with root package name */
    private b f8670b;

    /* renamed from: c, reason: collision with root package name */
    private com.tencent.bugly.crashreport.common.strategy.a f8671c;

    /* renamed from: d, reason: collision with root package name */
    private com.tencent.bugly.crashreport.common.info.a f8672d;
    private Thread.UncaughtExceptionHandler e;
    private Thread.UncaughtExceptionHandler f;
    private boolean g = false;
    private int j;

    public e(Context context, b bVar, com.tencent.bugly.crashreport.common.strategy.a aVar, com.tencent.bugly.crashreport.common.info.a aVar2) {
        this.f8669a = context;
        this.f8670b = bVar;
        this.f8671c = aVar;
        this.f8672d = aVar2;
    }

    public final synchronized void a() {
        if (this.j >= 10) {
            x.a("java crash handler over %d, no need set.", 10);
            return;
        }
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null) {
            if (getClass().getName().equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                return;
            }
            if ("com.android.internal.os.RuntimeInit$UncaughtHandler".equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                x.a("backup system java handler: %s", defaultUncaughtExceptionHandler.toString());
                this.f = defaultUncaughtExceptionHandler;
                this.e = defaultUncaughtExceptionHandler;
            } else {
                x.a("backup java handler: %s", defaultUncaughtExceptionHandler.toString());
                this.e = defaultUncaughtExceptionHandler;
            }
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
        this.g = true;
        this.j++;
        x.a("registered java monitor: %s", toString());
    }

    public final synchronized void b() {
        this.g = false;
        x.a("close java monitor!", new Object[0]);
        if (Thread.getDefaultUncaughtExceptionHandler().getClass().getName().contains("bugly")) {
            x.a("Java monitor to unregister: %s", toString());
            Thread.setDefaultUncaughtExceptionHandler(this.e);
            this.j--;
        }
    }

    private CrashDetailBean b(Thread thread, Throwable th, boolean z, String str, byte[] bArr) {
        String a2;
        boolean z2 = false;
        if (th == null) {
            x.d("We can do nothing with a null throwable.", new Object[0]);
            return null;
        }
        boolean l = c.a().l();
        String str2 = (l && z) ? " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]" : "";
        if (l && z) {
            x.e("This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
        }
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        crashDetailBean.B = com.tencent.bugly.crashreport.common.info.b.g();
        crashDetailBean.C = com.tencent.bugly.crashreport.common.info.b.e();
        crashDetailBean.D = com.tencent.bugly.crashreport.common.info.b.i();
        crashDetailBean.E = this.f8672d.p();
        crashDetailBean.F = this.f8672d.o();
        crashDetailBean.G = this.f8672d.q();
        crashDetailBean.w = z.a(this.f8669a, c.e, (String) null);
        crashDetailBean.x = y.a();
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(crashDetailBean.x == null ? 0 : crashDetailBean.x.length);
        x.a("user log size:%d", objArr);
        crashDetailBean.f8620b = z ? 0 : 2;
        crashDetailBean.e = this.f8672d.h();
        crashDetailBean.f = this.f8672d.j;
        crashDetailBean.g = this.f8672d.w();
        crashDetailBean.m = this.f8672d.g();
        String name = th.getClass().getName();
        String b2 = b(th, 1000);
        if (b2 == null) {
            b2 = "";
        }
        Object[] objArr2 = new Object[2];
        objArr2[0] = Integer.valueOf(th.getStackTrace().length);
        objArr2[1] = Boolean.valueOf(th.getCause() != null);
        x.e("stack frame :%d, has cause %b", objArr2);
        String stackTraceElement = th.getStackTrace().length > 0 ? th.getStackTrace()[0].toString() : "";
        Throwable th2 = th;
        while (th2 != null && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        if (th2 != null && th2 != th) {
            crashDetailBean.n = th2.getClass().getName();
            crashDetailBean.o = b(th2, 1000);
            if (crashDetailBean.o == null) {
                crashDetailBean.o = "";
            }
            if (th2.getStackTrace().length > 0) {
                crashDetailBean.p = th2.getStackTrace()[0].toString();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append(":");
            sb.append(b2);
            sb.append("\n");
            sb.append(stackTraceElement);
            sb.append("\n......");
            sb.append("\nCaused by:\n");
            sb.append(crashDetailBean.n);
            sb.append(":");
            sb.append(crashDetailBean.o);
            sb.append("\n");
            a2 = a(th2, c.f);
            sb.append(a2);
            crashDetailBean.q = sb.toString();
        } else {
            crashDetailBean.n = name;
            crashDetailBean.o = b2 + str2;
            if (crashDetailBean.o == null) {
                crashDetailBean.o = "";
            }
            crashDetailBean.p = stackTraceElement;
            a2 = a(th, c.f);
            crashDetailBean.q = a2;
        }
        crashDetailBean.r = System.currentTimeMillis();
        crashDetailBean.u = z.b(crashDetailBean.q.getBytes());
        try {
            crashDetailBean.y = z.a(c.f, false);
            crashDetailBean.z = this.f8672d.f8601d;
            crashDetailBean.A = thread.getName() + "(" + thread.getId() + ")";
            crashDetailBean.y.put(crashDetailBean.A, a2);
            crashDetailBean.H = this.f8672d.y();
            crashDetailBean.h = this.f8672d.v();
            crashDetailBean.i = this.f8672d.I();
            crashDetailBean.L = this.f8672d.f8598a;
            crashDetailBean.M = this.f8672d.a();
            crashDetailBean.O = this.f8672d.F();
            crashDetailBean.P = this.f8672d.G();
            crashDetailBean.Q = this.f8672d.z();
            crashDetailBean.R = this.f8672d.E();
        } catch (Throwable th3) {
            x.e("handle crash error %s", th3.toString());
        }
        if (z) {
            this.f8670b.c(crashDetailBean);
        } else {
            boolean z3 = str != null && str.length() > 0;
            if (bArr != null && bArr.length > 0) {
                z2 = true;
            }
            if (z3) {
                crashDetailBean.N = new HashMap(1);
                crashDetailBean.N.put("UserData", str);
            }
            if (z2) {
                crashDetailBean.S = bArr;
            }
        }
        return crashDetailBean;
    }

    private static boolean a(Thread thread) {
        synchronized (i) {
            if (h != null && thread.getName().equals(h)) {
                return true;
            }
            h = thread.getName();
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0216, code lost:
    
        if (r8.f != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d4, code lost:
    
        if (r8.f != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d8, code lost:
    
        com.tencent.bugly.proguard.x.e("crashreport last handle start!", new java.lang.Object[0]);
        com.tencent.bugly.proguard.x.e("current process die", new java.lang.Object[0]);
        android.os.Process.killProcess(android.os.Process.myPid());
        java.lang.System.exit(1);
        com.tencent.bugly.proguard.x.e("crashreport last handle end!", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01f7, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Thread thread, Throwable th, boolean z, String str, byte[] bArr) {
        if (z) {
            x.e("Java Crash Happen cause by %s(%d)", thread.getName(), Long.valueOf(thread.getId()));
            if (a(thread)) {
                x.a("this class has handled this exception", new Object[0]);
                if (this.f != null) {
                    x.a("call system handler", new Object[0]);
                    this.f.uncaughtException(thread, th);
                } else {
                    x.e("current process die", new Object[0]);
                    Process.killProcess(Process.myPid());
                    System.exit(1);
                }
            }
        } else {
            x.e("Java Catch Happen", new Object[0]);
        }
        try {
            try {
            } catch (Throwable th2) {
                if (!x.a(th2)) {
                    th2.printStackTrace();
                }
                if (!z) {
                    return;
                }
                if (this.e == null || !a(this.e)) {
                }
            }
            if (!this.g) {
                x.c("Java crash handler is disable. Just return.", new Object[0]);
                if (z) {
                    if (this.e == null || !a(this.e)) {
                        if (this.f == null) {
                            x.e("crashreport last handle start!", new Object[0]);
                            x.e("current process die", new Object[0]);
                            Process.killProcess(Process.myPid());
                            System.exit(1);
                            x.e("crashreport last handle end!", new Object[0]);
                            return;
                        }
                        x.e("system handle start!", new Object[0]);
                        this.f.uncaughtException(thread, th);
                        x.e("system handle end!", new Object[0]);
                        return;
                    }
                    x.e("sys default last handle start!", new Object[0]);
                    this.e.uncaughtException(thread, th);
                    x.e("sys default last handle end!", new Object[0]);
                }
                return;
            }
            if (!this.f8671c.b()) {
                x.e("waiting for remote sync", new Object[0]);
                int i2 = 0;
                while (!this.f8671c.b()) {
                    z.b(500L);
                    i2 += TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL;
                    if (i2 >= 3000) {
                        break;
                    }
                }
            }
            if (!this.f8671c.b()) {
                x.d("no remote but still store!", new Object[0]);
            }
            if (!this.f8671c.c().g && this.f8671c.b()) {
                x.e("crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
                b.a(z ? "JAVA_CRASH" : "JAVA_CATCH", z.a(), this.f8672d.f8601d, thread, z.a(th), null);
                if (z) {
                    if (this.e == null || !a(this.e)) {
                        if (this.f == null) {
                            x.e("crashreport last handle start!", new Object[0]);
                            x.e("current process die", new Object[0]);
                            Process.killProcess(Process.myPid());
                            System.exit(1);
                            x.e("crashreport last handle end!", new Object[0]);
                            return;
                        }
                        x.e("system handle start!", new Object[0]);
                        this.f.uncaughtException(thread, th);
                        x.e("system handle end!", new Object[0]);
                        return;
                    }
                    x.e("sys default last handle start!", new Object[0]);
                    this.e.uncaughtException(thread, th);
                    x.e("sys default last handle end!", new Object[0]);
                }
                return;
            }
            CrashDetailBean b2 = b(thread, th, z, str, bArr);
            if (b2 != null) {
                b.a(z ? "JAVA_CRASH" : "JAVA_CATCH", z.a(), this.f8672d.f8601d, thread, z.a(th), b2);
                if (!this.f8670b.a(b2)) {
                    this.f8670b.a(b2, 3000L, z);
                }
                this.f8670b.b(b2);
                if (z) {
                    if (this.e == null || !a(this.e)) {
                    }
                    x.e("sys default last handle start!", new Object[0]);
                    this.e.uncaughtException(thread, th);
                    x.e("sys default last handle end!", new Object[0]);
                }
                return;
            }
            x.e("pkg crash datas fail!", new Object[0]);
            if (z) {
                if (this.e == null || !a(this.e)) {
                    if (this.f == null) {
                        x.e("crashreport last handle start!", new Object[0]);
                        x.e("current process die", new Object[0]);
                        Process.killProcess(Process.myPid());
                        System.exit(1);
                        x.e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                    x.e("system handle start!", new Object[0]);
                    this.f.uncaughtException(thread, th);
                    x.e("system handle end!", new Object[0]);
                    return;
                }
                x.e("sys default last handle start!", new Object[0]);
                this.e.uncaughtException(thread, th);
                x.e("sys default last handle end!", new Object[0]);
            }
        } catch (Throwable th3) {
            if (z) {
                if (this.e != null && a(this.e)) {
                    x.e("sys default last handle start!", new Object[0]);
                    this.e.uncaughtException(thread, th);
                    x.e("sys default last handle end!", new Object[0]);
                } else if (this.f != null) {
                    x.e("system handle start!", new Object[0]);
                    this.f.uncaughtException(thread, th);
                    x.e("system handle end!", new Object[0]);
                } else {
                    x.e("crashreport last handle start!", new Object[0]);
                    x.e("current process die", new Object[0]);
                    Process.killProcess(Process.myPid());
                    System.exit(1);
                    x.e("crashreport last handle end!", new Object[0]);
                }
            }
            throw th3;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        synchronized (i) {
            a(thread, th, true, null, null);
        }
    }

    private static boolean a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (uncaughtExceptionHandler == null) {
            return true;
        }
        String name = uncaughtExceptionHandler.getClass().getName();
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            if (name.equals(className) && "uncaughtException".equals(methodName)) {
                return false;
            }
        }
        return true;
    }

    public final synchronized void a(StrategyBean strategyBean) {
        if (strategyBean != null) {
            if (strategyBean.g != this.g) {
                x.a("java changed to %b", Boolean.valueOf(strategyBean.g));
                if (strategyBean.g) {
                    a();
                    return;
                }
                b();
            }
        }
    }

    private static String a(Throwable th, int i2) {
        if (th == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            if (th.getStackTrace() != null) {
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    if (i2 > 0 && sb.length() >= i2) {
                        sb.append("\n[Stack over limit size :" + i2 + " , has been cutted !]");
                        return sb.toString();
                    }
                    sb.append(stackTraceElement.toString());
                    sb.append("\n");
                }
            }
        } catch (Throwable th2) {
            x.e("gen stack error %s", th2.toString());
        }
        return sb.toString();
    }

    private static String b(Throwable th, int i2) {
        if (th.getMessage() == null) {
            return "";
        }
        if (th.getMessage().length() <= 1000) {
            return th.getMessage();
        }
        return th.getMessage().substring(0, 1000) + "\n[Message over limit size:1000, has been cutted!]";
    }
}
