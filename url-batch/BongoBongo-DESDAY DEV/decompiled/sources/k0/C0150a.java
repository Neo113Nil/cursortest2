package k0;

import V0.f;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.winfour.winrandom.R;
import h0.d0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0150a {
    public static volatile C0150a d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f2731e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f2734c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f2733b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2732a = new HashMap();

    public C0150a(Context context) {
        this.f2734c = context.getApplicationContext();
    }

    public static C0150a c(Context context) {
        if (d == null) {
            synchronized (f2731e) {
                try {
                    if (d == null) {
                        d = new C0150a(context);
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f2734c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f2733b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0151b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new f(e2);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (d0.k()) {
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
        HashMap hashMap = this.f2732a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0151b interfaceC0151b = (InterfaceC0151b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a2 = interfaceC0151b.a();
                if (!a2.isEmpty()) {
                    for (Class cls2 : a2) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = interfaceC0151b.b(this.f2734c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new f(th2);
            }
        }
        Trace.endSection();
        return obj;
    }
}
