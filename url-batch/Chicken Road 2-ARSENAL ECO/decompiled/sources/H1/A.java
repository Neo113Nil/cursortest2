package H1;

import H1.A;
import android.content.Context;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: e, reason: collision with root package name */
    public static A f875e;

    /* renamed from: a, reason: collision with root package name */
    public Object f876a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public Object f877b;

    /* renamed from: c, reason: collision with root package name */
    public Object f878c;

    /* renamed from: d, reason: collision with root package name */
    public Object f879d;

    public A(Function function) {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.f877b = new Object();
        this.f878c = Collections.newSetFromMap(new IdentityHashMap());
        this.f879d = function;
    }

    public static synchronized A b() {
        A a7;
        synchronized (A.class) {
            try {
                if (f875e == null) {
                    A a8 = new A();
                    a8.f876a = null;
                    a8.f877b = null;
                    a8.f878c = null;
                    a8.f879d = new ArrayDeque();
                    f875e = a8;
                }
                a7 = f875e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a7;
    }

    public Object a(final V3.c cVar, String str) {
        return ((ConcurrentHashMap) this.f876a).computeIfAbsent(str, new Function() { // from class: Q4.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                A a7 = A.this;
                V3.c cVar2 = cVar;
                String str2 = (String) obj;
                int i7 = O4.a.f1777e;
                if (cVar2 == null) {
                    cVar2 = V3.a.f2706i;
                }
                Object apply = ((Function) a7.f879d).apply(O4.a.a(str2, null, null, cVar2));
                synchronized (a7.f877b) {
                    ((Set) a7.f878c).add(apply);
                }
                return apply;
            }
        });
    }

    public boolean c(Context context) {
        if (((Boolean) this.f878c) == null) {
            this.f878c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f877b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f878c).booleanValue();
    }

    public boolean d(Context context) {
        if (((Boolean) this.f877b) == null) {
            this.f877b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f877b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f877b).booleanValue();
    }
}
