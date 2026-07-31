package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import y.b;
import y.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f1364d;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f1365e = new Object();

    /* renamed from: c, reason: collision with root package name */
    final Context f1368c;

    /* renamed from: b, reason: collision with root package name */
    final Set<Class<? extends y.a<?>>> f1367b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    final Map<Class<?>, Object> f1366a = new HashMap();

    a(Context context) {
        this.f1368c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f1364d == null) {
            synchronized (f1365e) {
                if (f1364d == null) {
                    f1364d = new a(context);
                }
            }
        }
        return f1364d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void a() {
        try {
            try {
                z.a.a("Startup");
                Bundle bundle = this.f1368c.getPackageManager().getProviderInfo(new ComponentName(this.f1368c.getPackageName(), InitializationProvider.class.getName()), 128).metaData;
                String string = this.f1368c.getString(b.f23196a);
                if (bundle != null) {
                    HashSet hashSet = new HashSet();
                    for (String str : bundle.keySet()) {
                        if (string.equals(bundle.getString(str, null))) {
                            Class<?> cls = Class.forName(str);
                            if (y.a.class.isAssignableFrom(cls)) {
                                this.f1367b.add(cls);
                                b(cls, hashSet);
                            }
                        }
                    }
                }
            } finally {
                z.a.b();
            }
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException e7) {
            throw new c(e7);
        }
    }

    <T> T b(Class<? extends y.a<?>> cls, Set<Class<?>> set) {
        T t6;
        synchronized (f1365e) {
            if (z.a.d()) {
                try {
                    z.a.a(cls.getSimpleName());
                } finally {
                    z.a.b();
                }
            }
            if (set.contains(cls)) {
                throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
            }
            if (this.f1366a.containsKey(cls)) {
                t6 = (T) this.f1366a.get(cls);
            } else {
                set.add(cls);
                try {
                    y.a<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    List<Class<? extends y.a<?>>> a7 = newInstance.a();
                    if (!a7.isEmpty()) {
                        for (Class<? extends y.a<?>> cls2 : a7) {
                            if (!this.f1366a.containsKey(cls2)) {
                                b(cls2, set);
                            }
                        }
                    }
                    t6 = (T) newInstance.b(this.f1368c);
                    set.remove(cls);
                    this.f1366a.put(cls, t6);
                } catch (Throwable th) {
                    throw new c(th);
                }
            }
        }
        return t6;
    }
}
