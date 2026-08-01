package n0;

import H1.l;
import W0.c;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.winpower.neonfit.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0314a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0314a f3751d;
    public static final Object e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f3754c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f3753b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3752a = new HashMap();

    public C0314a(Context context) {
        this.f3754c = context.getApplicationContext();
    }

    public static C0314a c(Context context) {
        if (f3751d == null) {
            synchronized (e) {
                try {
                    if (f3751d == null) {
                        f3751d = new C0314a(context);
                    }
                } finally {
                }
            }
        }
        return f3751d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f3754c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f3753b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0315b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new c(e2);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (l.F()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap hashMap = this.f3752a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0315b interfaceC0315b = (InterfaceC0315b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a2 = interfaceC0315b.a();
                if (!a2.isEmpty()) {
                    for (Class cls2 : a2) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = interfaceC0315b.b(this.f3754c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new c(th2);
            }
        }
        Trace.endSection();
        return obj;
    }
}
