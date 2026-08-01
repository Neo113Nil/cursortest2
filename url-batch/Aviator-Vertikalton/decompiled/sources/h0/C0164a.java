package h0;

import N0.f;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.fortuneink.neonpad.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import q1.l;

/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0164a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0164a f2618d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f2619e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f2622c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f2621b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2620a = new HashMap();

    public C0164a(Context context) {
        this.f2622c = context.getApplicationContext();
    }

    public static C0164a c(Context context) {
        if (f2618d == null) {
            synchronized (f2619e) {
                try {
                    if (f2618d == null) {
                        f2618d = new C0164a(context);
                    }
                } finally {
                }
            }
        }
        return f2618d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f2622c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f2621b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0165b.class.isAssignableFrom(cls)) {
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
        if (l.K()) {
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
        HashMap hashMap = this.f2620a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0165b interfaceC0165b = (InterfaceC0165b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a2 = interfaceC0165b.a();
                if (!a2.isEmpty()) {
                    for (Class cls2 : a2) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = interfaceC0165b.b(this.f2622c);
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
