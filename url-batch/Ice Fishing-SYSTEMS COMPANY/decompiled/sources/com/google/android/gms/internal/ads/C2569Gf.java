package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import q2.C4907p;

/* renamed from: com.google.android.gms.internal.ads.Gf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2569Gf {

    /* renamed from: e, reason: collision with root package name */
    public C3165eo f25184e;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f25180a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final Object f25181b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public String f25182c = null;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f25183d = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f25185f = new AtomicInteger(-1);

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f25186g = new AtomicReference(null);

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f25187h = new AtomicReference(null);
    public final ConcurrentHashMap i = new ConcurrentHashMap(9);

    /* renamed from: j, reason: collision with root package name */
    public final Object f25188j = new Object();

    public static final Bundle f(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (Objects.equals(str, "value")) {
                        bundle.putDouble(str, Double.parseDouble((String) map.get(str)));
                    } else {
                        bundle.putString(str, (String) map.get(str));
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    public static final boolean g(Context context) {
        C3151ea c3151ea = AbstractC3368ia.f31553T0;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            int a9 = W2.c.a(context);
            C3151ea c3151ea2 = AbstractC3368ia.f31562U0;
            SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
            if (a9 >= ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).intValue()) {
                if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31570V0)).booleanValue()) {
                    return true;
                }
                try {
                    context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    return false;
                } catch (ClassNotFoundException unused) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean a(Context context) {
        int c4;
        C3151ea c3151ea = AbstractC3368ia.f31483L0;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && !this.f25183d.get()) {
            if (!((Boolean) rVar.f40119c.a(AbstractC3368ia.f31579W0)).booleanValue()) {
                AtomicInteger atomicInteger = this.f25185f;
                if (atomicInteger.get() == -1) {
                    u2.d dVar = C4907p.f40108g.f40109a;
                    L2.f fVar = L2.f.f1726b;
                    if (fVar.c(context, 12451000) != 0 && ((c4 = fVar.c(context, 12451000)) == 0 || c4 == 2)) {
                        int i = t2.C.f40822b;
                        u2.i.f("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        atomicInteger.set(0);
                    } else {
                        atomicInteger.set(1);
                    }
                }
                if (atomicInteger.get() == 1) {
                }
            }
            return true;
        }
        return false;
    }

    public final String b(Context context) {
        if (!a(context)) {
            return null;
        }
        synchronized (this.f25181b) {
            try {
                String str = this.f25182c;
                if (str != null) {
                    return str;
                }
                String str2 = (String) k(context, "getGmpAppId");
                this.f25182c = str2;
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String c(Context context) {
        if (a(context)) {
            C3151ea c3151ea = AbstractC3368ia.f31535R0;
            q2.r rVar = q2.r.f40116e;
            long longValue = ((Long) rVar.f40119c.a(c3151ea)).longValue();
            if (longValue < 0) {
                return (String) k(context, "getAppInstanceId");
            }
            AtomicReference atomicReference = this.f25180a;
            if (atomicReference.get() == null) {
                C3151ea c3151ea2 = AbstractC3368ia.f31544S0;
                SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).intValue(), ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new ThreadFactoryC2552Ff(this));
                while (!atomicReference.compareAndSet(null, threadPoolExecutor) && atomicReference.get() == null) {
                }
            }
            try {
                return (String) ((ExecutorService) atomicReference.get()).submit(new T6(3, this, context)).get(longValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    public final String d(Context context) {
        Object k6;
        if (a(context) && (k6 = k(context, "generateEventId")) != null) {
            return k6.toString();
        }
        return null;
    }

    public final void e(Context context, String str, String str2, String str3, int i) {
        if (a(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            h(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 64 + String.valueOf(i).length());
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i);
            t2.C.k(sb.toString());
        }
    }

    public final void h(Context context, String str, String str2, Bundle bundle) {
        if (a(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e6) {
                String valueOf = String.valueOf(str2);
                int i = t2.C.f40822b;
                u2.i.d("Invalid event ID: ".concat(valueOf), e6);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            AtomicReference atomicReference = this.f25186g;
            if (m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                ConcurrentHashMap concurrentHashMap = this.i;
                Method method = (Method) concurrentHashMap.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        concurrentHashMap.put("logEventInternal", method);
                    } catch (Exception unused) {
                        l("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(atomicReference.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    l("logEventInternal", true);
                }
            }
        }
    }

    public final Method i(Context context, String str) {
        ConcurrentHashMap concurrentHashMap = this.i;
        Method method = (Method) concurrentHashMap.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            l(str, false);
            return null;
        }
    }

    public final void j(Context context, String str, String str2) {
        AtomicReference atomicReference = this.f25186g;
        if (m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            ConcurrentHashMap concurrentHashMap = this.i;
            Method method = (Method) concurrentHashMap.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    concurrentHashMap.put(str2, method);
                } catch (Exception unused) {
                    l(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(atomicReference.get(), str);
                StringBuilder sb = new StringBuilder(str2.length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                t2.C.k(sb.toString());
            } catch (Exception unused2) {
                l(str2, false);
            }
        }
    }

    public final Object k(Context context, String str) {
        AtomicReference atomicReference = this.f25186g;
        if (!m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            return null;
        }
        try {
            return i(context, str).invoke(atomicReference.get(), new Object[0]);
        } catch (Exception unused) {
            l(str, true);
            return null;
        }
    }

    public final void l(String str, boolean z8) {
        AtomicBoolean atomicBoolean = this.f25183d;
        if (atomicBoolean.get()) {
            return;
        }
        String o9 = D.y.o(new StringBuilder(str.length() + 30), "Invoke Firebase method ", str, " error.");
        int i = t2.C.f40822b;
        u2.i.f(o9);
        if (z8) {
            u2.i.f("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            atomicBoolean.set(true);
        }
        if (this.f25184e != null) {
            if (this.f25187h.get() == null && this.f25186g.get() == null) {
                return;
            }
            C2593Hm a9 = this.f25184e.a();
            a9.r(NativeAdvancedJsUtils.f18064p, "ga_log_event_error");
            a9.r("method_name", str);
            a9.s();
        }
    }

    public final boolean m(Context context, String str, AtomicReference atomicReference, boolean z8) {
        if (atomicReference.get() != null) {
            return true;
        }
        try {
            Object invoke = context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context);
            while (!atomicReference.compareAndSet(null, invoke) && atomicReference.get() == null) {
            }
            return true;
        } catch (Exception unused) {
            l("getInstance", z8);
            return false;
        }
    }
}
