package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import i0.InterfaceC2469a;
import i0.b;
import i0.c;
import j0.AbstractC3182b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f13192d;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f13193e = new Object();

    /* renamed from: c, reason: collision with root package name */
    final Context f13196c;

    /* renamed from: b, reason: collision with root package name */
    final Set f13195b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    final Map f13194a = new HashMap();

    a(Context context) {
        this.f13196c = context.getApplicationContext();
    }

    private Object d(Class cls, Set set) {
        Object obj;
        if (AbstractC3182b.d()) {
            try {
                AbstractC3182b.a(cls.getSimpleName());
            } catch (Throwable th) {
                AbstractC3182b.b();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f13194a.containsKey(cls)) {
            obj = this.f13194a.get(cls);
        } else {
            set.add(cls);
            try {
                InterfaceC2469a interfaceC2469a = (InterfaceC2469a) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a4 = interfaceC2469a.a();
                if (!a4.isEmpty()) {
                    for (Class cls2 : a4) {
                        if (!this.f13194a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                obj = interfaceC2469a.b(this.f13196c);
                set.remove(cls);
                this.f13194a.put(cls, obj);
            } catch (Throwable th2) {
                throw new c(th2);
            }
        }
        AbstractC3182b.b();
        return obj;
    }

    public static a e(Context context) {
        if (f13192d == null) {
            synchronized (f13193e) {
                try {
                    if (f13192d == null) {
                        f13192d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f13192d;
    }

    void a() {
        try {
            try {
                AbstractC3182b.a("Startup");
                b(this.f13196c.getPackageManager().getProviderInfo(new ComponentName(this.f13196c.getPackageName(), InitializationProvider.class.getName()), UserVerificationMethods.USER_VERIFY_PATTERN).metaData);
            } catch (PackageManager.NameNotFoundException e4) {
                throw new c(e4);
            }
        } finally {
            AbstractC3182b.b();
        }
    }

    void b(Bundle bundle) {
        String string = this.f13196c.getString(b.f36769a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC2469a.class.isAssignableFrom(cls)) {
                            this.f13195b.add(cls);
                        }
                    }
                }
                Iterator it = this.f13195b.iterator();
                while (it.hasNext()) {
                    d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e4) {
                throw new c(e4);
            }
        }
    }

    Object c(Class cls) {
        Object obj;
        synchronized (f13193e) {
            try {
                obj = this.f13194a.get(cls);
                if (obj == null) {
                    obj = d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.f13195b.contains(cls);
    }
}
