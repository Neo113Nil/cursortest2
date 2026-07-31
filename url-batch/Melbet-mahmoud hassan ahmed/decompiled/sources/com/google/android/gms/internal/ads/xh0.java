package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class xh0 implements zh0 {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f14205f = new Object();

    /* renamed from: g, reason: collision with root package name */
    static zh0 f14206g;

    /* renamed from: h, reason: collision with root package name */
    static zh0 f14207h;

    /* renamed from: b, reason: collision with root package name */
    private final Context f14209b;

    /* renamed from: d, reason: collision with root package name */
    private final ExecutorService f14211d;

    /* renamed from: e, reason: collision with root package name */
    private final po0 f14212e;

    /* renamed from: a, reason: collision with root package name */
    private final Object f14208a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final WeakHashMap<Thread, Boolean> f14210c = new WeakHashMap<>();

    protected xh0(Context context, po0 po0Var) {
        r33.a();
        this.f14211d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.f14209b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f14212e = po0Var;
    }

    public static zh0 c(Context context) {
        synchronized (f14205f) {
            if (f14206g == null) {
                if (j30.f6958e.e().booleanValue()) {
                    if (!((Boolean) sw.c().b(m10.G5)).booleanValue()) {
                        f14206g = new xh0(context, po0.c());
                    }
                }
                f14206g = new yh0();
            }
        }
        return f14206g;
    }

    public static zh0 d(Context context, po0 po0Var) {
        synchronized (f14205f) {
            if (f14207h == null) {
                if (j30.f6958e.e().booleanValue()) {
                    if (!((Boolean) sw.c().b(m10.G5)).booleanValue()) {
                        xh0 xh0Var = new xh0(context, po0Var);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (xh0Var.f14208a) {
                                xh0Var.f14210c.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new wh0(xh0Var, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new vh0(xh0Var, Thread.getDefaultUncaughtExceptionHandler()));
                        f14207h = xh0Var;
                    }
                }
                f14207h = new yh0();
            }
        }
        return f14207h;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final void a(Throwable th, String str) {
        b(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final void b(Throwable th, String str, float f7) {
        boolean z6;
        String str2;
        if (bo0.f(th) == null) {
            return;
        }
        String name = th.getClass().getName();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        double d7 = f7;
        double random = Math.random();
        int i7 = f7 > 0.0f ? (int) (1.0f / f7) : 1;
        if (random < d7) {
            ArrayList<String> arrayList = new ArrayList();
            try {
                z6 = w3.c.a(this.f14209b).g();
            } catch (Throwable th2) {
                io0.e("Error fetching instant app info", th2);
                z6 = false;
            }
            try {
                str2 = this.f14209b.getPackageName();
            } catch (Throwable unused) {
                io0.g("Cannot obtain package name, proceeding.");
                str2 = "unknown";
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z6)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str3 = Build.MANUFACTURER;
            String str4 = Build.MODEL;
            if (!str4.startsWith(str3)) {
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + str4.length());
                sb.append(str3);
                sb.append(" ");
                sb.append(str4);
                str4 = sb.toString();
            }
            arrayList.add(appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.f14212e.f10301f).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", stringWriter2).appendQueryParameter("eids", TextUtils.join(",", m10.a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "428884702").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i7)).appendQueryParameter("pb_tm", String.valueOf(j30.f6956c.e())).appendQueryParameter("gmscv", String.valueOf(o3.f.f().a(this.f14209b))).appendQueryParameter("lite", true != this.f14212e.f10305j ? "0" : "1").toString());
            for (final String str5 : arrayList) {
                final oo0 oo0Var = new oo0(null);
                this.f14211d.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.uh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        oo0.this.b(str5);
                    }
                });
            }
        }
    }

    protected final void e(Thread thread, Throwable th) {
        if (th != null) {
            boolean z6 = false;
            boolean z7 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z6 |= bo0.j(stackTraceElement.getClassName());
                    z7 |= xh0.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!z6 || z7) {
                return;
            }
            b(th, "", 1.0f);
        }
    }
}
