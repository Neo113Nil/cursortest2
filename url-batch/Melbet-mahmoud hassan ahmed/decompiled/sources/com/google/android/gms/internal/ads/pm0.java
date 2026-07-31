package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class pm0 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<ExecutorService> f10275a = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name */
    private final Object f10276b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private String f10277c = null;

    /* renamed from: d, reason: collision with root package name */
    private String f10278d = null;

    /* renamed from: e, reason: collision with root package name */
    final AtomicBoolean f10279e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicInteger f10280f = new AtomicInteger(-1);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference<Object> f10281g = new AtomicReference<>(null);

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference<Object> f10282h = new AtomicReference<>(null);

    /* renamed from: i, reason: collision with root package name */
    private final ConcurrentMap<String, Method> f10283i = new ConcurrentHashMap(9);

    /* renamed from: j, reason: collision with root package name */
    private final AtomicReference<xv0> f10284j = new AtomicReference<>(null);

    /* renamed from: k, reason: collision with root package name */
    private final BlockingQueue<FutureTask<?>> f10285k = new ArrayBlockingQueue(20);

    /* renamed from: l, reason: collision with root package name */
    private final Object f10286l = new Object();

    static final boolean A(Context context) {
        if (!((Boolean) sw.c().b(m10.f8169c0)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) sw.c().b(m10.f8177d0)).intValue()) {
            return false;
        }
        if (((Boolean) sw.c().b(m10.f8185e0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final <T> T B(String str, T t6, nm0<T> nm0Var) {
        synchronized (this.f10284j) {
            if (this.f10284j.get() != null) {
                try {
                    return nm0Var.a(this.f10284j.get());
                } catch (Exception unused) {
                    c(str, false);
                }
            }
            return t6;
        }
    }

    private final Object C(String str, Context context) {
        if (!e(context, "com.google.android.gms.measurement.AppMeasurement", this.f10281g, true)) {
            return null;
        }
        try {
            return D(context, str).invoke(this.f10281g.get(), new Object[0]);
        } catch (Exception unused) {
            c(str, true);
            return null;
        }
    }

    private final Method D(Context context, String str) {
        Method method = this.f10283i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f10283i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            c(str, false);
            return null;
        }
    }

    private final ExecutorService E() {
        ExecutorService threadPoolExecutor;
        if (this.f10275a.get() == null) {
            if (v3.c.a()) {
                threadPoolExecutor = r33.a().b(((Integer) sw.c().b(m10.f8161b0)).intValue(), new mm0(this), 2);
            } else {
                e10<Integer> e10Var = m10.f8161b0;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) sw.c().b(e10Var)).intValue(), ((Integer) sw.c().b(e10Var)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new mm0(this));
            }
            this.f10275a.compareAndSet(null, threadPoolExecutor);
        }
        return this.f10275a.get();
    }

    private final void a(Context context, String str, String str2) {
        if (e(context, "com.google.android.gms.measurement.AppMeasurement", this.f10281g, true)) {
            Method method = this.f10283i.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    this.f10283i.put(str2, method);
                } catch (Exception unused) {
                    c(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(this.f10281g.get(), str);
                StringBuilder sb = new StringBuilder(str2.length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                a3.r1.k(sb.toString());
            } catch (Exception unused2) {
                c(str2, false);
            }
        }
    }

    private final void b(Context context, final String str, String str2, Bundle bundle) {
        if (z(context)) {
            final Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e7) {
                String valueOf = String.valueOf(str2);
                io0.e(valueOf.length() != 0 ? "Invalid event ID: ".concat(valueOf) : new String("Invalid event ID: "), e7);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (A(context)) {
                d("logEventInternal", new om0() { // from class: com.google.android.gms.internal.ads.zl0
                    @Override // com.google.android.gms.internal.ads.om0
                    public final void a(xv0 xv0Var) {
                        xv0Var.J2("am", str, bundle2);
                    }
                });
                return;
            }
            if (e(context, "com.google.android.gms.measurement.AppMeasurement", this.f10281g, true)) {
                Method method = this.f10283i.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.f10283i.put("logEventInternal", method);
                    } catch (Exception unused) {
                        c("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.f10281g.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    c("logEventInternal", true);
                }
            }
        }
    }

    private final void c(String str, boolean z6) {
        if (this.f10279e.get()) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 30);
        sb.append("Invoke Firebase method ");
        sb.append(str);
        sb.append(" error.");
        io0.g(sb.toString());
        if (z6) {
            io0.g("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.f10279e.set(true);
        }
    }

    private final void d(final String str, final om0 om0Var) {
        synchronized (this.f10284j) {
            FutureTask<?> futureTask = new FutureTask<>(new Runnable() { // from class: com.google.android.gms.internal.ads.am0
                @Override // java.lang.Runnable
                public final void run() {
                    pm0.this.o(om0Var, str);
                }
            }, null);
            if (this.f10284j.get() != null) {
                futureTask.run();
            } else {
                this.f10285k.offer(futureTask);
            }
        }
    }

    private final boolean e(Context context, String str, AtomicReference<Object> atomicReference, boolean z6) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception unused) {
                c("getInstance", z6);
                return false;
            }
        }
        return true;
    }

    public final String f(Context context) {
        if (!z(context)) {
            return null;
        }
        if (A(context)) {
            Long l7 = (Long) B("getAdEventId", null, new nm0() { // from class: com.google.android.gms.internal.ads.dm0
                @Override // com.google.android.gms.internal.ads.nm0
                public final Object a(xv0 xv0Var) {
                    return Long.valueOf(xv0Var.c());
                }
            });
            if (l7 != null) {
                return Long.toString(l7.longValue());
            }
            return null;
        }
        Object C = C("generateEventId", context);
        if (C != null) {
            return C.toString();
        }
        return null;
    }

    public final String g(Context context) {
        if (!z(context)) {
            return null;
        }
        synchronized (this.f10276b) {
            String str = this.f10278d;
            if (str != null) {
                return str;
            }
            this.f10278d = A(context) ? (String) B("getAppIdOrigin", this.f10278d, new nm0() { // from class: com.google.android.gms.internal.ads.em0
                @Override // com.google.android.gms.internal.ads.nm0
                public final Object a(xv0 xv0Var) {
                    return xv0Var.b();
                }
            }) : "fa";
            return this.f10278d;
        }
    }

    public final String h(final Context context) {
        if (!z(context)) {
            return null;
        }
        long longValue = ((Long) sw.c().b(m10.f8153a0)).longValue();
        if (A(context)) {
            try {
                return longValue < 0 ? (String) B("getAppInstanceId", null, fm0.f5153a) : (String) E().submit(new Callable() { // from class: com.google.android.gms.internal.ads.bm0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return pm0.this.k();
                    }
                }).get(longValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
                return null;
            }
        }
        if (longValue < 0) {
            return (String) C("getAppInstanceId", context);
        }
        try {
            return (String) E().submit(new Callable() { // from class: com.google.android.gms.internal.ads.cm0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return pm0.this.l(context);
                }
            }).get(longValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused3) {
            return "TIME_OUT";
        } catch (Exception unused4) {
            return null;
        }
    }

    public final String i(Context context) {
        if (!z(context)) {
            return "";
        }
        if (A(context)) {
            return (String) B("getCurrentScreenNameOrScreenClass", "", new nm0() { // from class: com.google.android.gms.internal.ads.yl0
                @Override // com.google.android.gms.internal.ads.nm0
                public final Object a(xv0 xv0Var) {
                    String f7 = xv0Var.f();
                    return (f7 == null && (f7 = xv0Var.e()) == null) ? "" : f7;
                }
            });
        }
        if (!e(context, "com.google.android.gms.measurement.AppMeasurement", this.f10281g, true)) {
            return "";
        }
        try {
            String str = (String) D(context, "getCurrentScreenName").invoke(this.f10281g.get(), new Object[0]);
            if (str == null) {
                str = (String) D(context, "getCurrentScreenClass").invoke(this.f10281g.get(), new Object[0]);
            }
            return str != null ? str : "";
        } catch (Exception unused) {
            c("getCurrentScreenName", false);
            return "";
        }
    }

    public final String j(Context context) {
        if (!z(context)) {
            return null;
        }
        synchronized (this.f10276b) {
            String str = this.f10277c;
            if (str != null) {
                return str;
            }
            this.f10277c = A(context) ? (String) B("getGmpAppId", this.f10277c, new nm0() { // from class: com.google.android.gms.internal.ads.gm0
                @Override // com.google.android.gms.internal.ads.nm0
                public final Object a(xv0 xv0Var) {
                    return xv0Var.h();
                }
            }) : (String) C("getGmpAppId", context);
            return this.f10277c;
        }
    }

    final /* synthetic */ String k() {
        return (String) B("getAppInstanceId", null, fm0.f5153a);
    }

    final /* synthetic */ String l(Context context) {
        return (String) C("getAppInstanceId", context);
    }

    public final void m(Context context, final String str) {
        if (z(context)) {
            if (A(context)) {
                d("beginAdUnitExposure", new om0() { // from class: com.google.android.gms.internal.ads.km0
                    @Override // com.google.android.gms.internal.ads.om0
                    public final void a(xv0 xv0Var) {
                        xv0Var.m0(str);
                    }
                });
            } else {
                a(context, str, "beginAdUnitExposure");
            }
        }
    }

    public final void n(Context context, final String str) {
        if (z(context)) {
            if (A(context)) {
                d("endAdUnitExposure", new om0() { // from class: com.google.android.gms.internal.ads.lm0
                    @Override // com.google.android.gms.internal.ads.om0
                    public final void a(xv0 xv0Var) {
                        xv0Var.O4(str);
                    }
                });
            } else {
                a(context, str, "endAdUnitExposure");
            }
        }
    }

    final /* synthetic */ void o(om0 om0Var, String str) {
        if (this.f10284j.get() != null) {
            try {
                om0Var.a(this.f10284j.get());
            } catch (Exception unused) {
                c(str, false);
            }
        }
    }

    public final void p(Context context, String str) {
        b(context, "_aa", str, null);
    }

    public final void q(Context context, String str) {
        b(context, "_aq", str, null);
    }

    public final void r(Context context, String str) {
        b(context, "_ac", str, null);
    }

    public final void s(Context context, String str) {
        b(context, "_ai", str, null);
    }

    public final void t(Context context, String str, String str2, String str3, int i7) {
        if (z(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i7);
            b(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i7);
            a3.r1.k(sb.toString());
        }
    }

    public final void u(Context context, kv kvVar) {
        if (((Boolean) sw.c().b(m10.f8209h0)).booleanValue() && z(context) && A(context)) {
            synchronized (this.f10286l) {
            }
        }
    }

    public final void v(Context context, n00 n00Var) {
        qm0.d(context).b().d(n00Var);
        if (((Boolean) sw.c().b(m10.f8209h0)).booleanValue() && z(context) && A(context)) {
            synchronized (this.f10286l) {
            }
        }
    }

    public final void w(final Bundle bundle) {
        d("setConsent", new om0() { // from class: com.google.android.gms.internal.ads.jm0
            @Override // com.google.android.gms.internal.ads.om0
            public final void a(xv0 xv0Var) {
                xv0Var.y0(bundle);
            }
        });
    }

    @Deprecated
    public final void x(final Context context, final String str) {
        if (z(context) && (context instanceof Activity)) {
            if (A(context)) {
                d("setScreenName", new om0() { // from class: com.google.android.gms.internal.ads.im0
                    @Override // com.google.android.gms.internal.ads.om0
                    public final void a(xv0 xv0Var) {
                        Context context2 = context;
                        xv0Var.L5(x3.b.B3(context2), str, context2.getPackageName());
                    }
                });
                return;
            }
            if (e(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f10282h, false)) {
                Method method = this.f10283i.get("setCurrentScreen");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                        this.f10283i.put("setCurrentScreen", method);
                    } catch (Exception unused) {
                        c("setCurrentScreen", false);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.f10282h.get(), (Activity) context, str, context.getPackageName());
                } catch (Exception unused2) {
                    c("setCurrentScreen", false);
                }
            }
        }
    }

    public final boolean y() {
        synchronized (this.f10286l) {
        }
        return false;
    }

    public final boolean z(Context context) {
        if (((Boolean) sw.c().b(m10.V)).booleanValue() && !this.f10279e.get()) {
            if (((Boolean) sw.c().b(m10.f8193f0)).booleanValue()) {
                return true;
            }
            if (this.f10280f.get() == -1) {
                qw.b();
                if (!bo0.n(context, o3.j.f19861a)) {
                    qw.b();
                    if (bo0.o(context)) {
                        io0.g("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.f10280f.set(0);
                    }
                }
                this.f10280f.set(1);
            }
            if (this.f10280f.get() == 1) {
                return true;
            }
        }
        return false;
    }
}
