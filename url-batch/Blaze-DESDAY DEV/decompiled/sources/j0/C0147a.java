package j0;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.winworm.neongrid.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k0.AbstractC0180a;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0147a {
    public static volatile C0147a d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f2632e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f2635c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f2634b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2633a = new HashMap();

    public C0147a(Context context) {
        this.f2635c = context.getApplicationContext();
    }

    public static C0147a c(Context context) {
        if (d == null) {
            synchronized (f2632e) {
                try {
                    if (d == null) {
                        d = new C0147a(context);
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f2635c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f2634b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0148b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new U0.b(e2);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (AbstractC0180a.k()) {
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
        HashMap hashMap = this.f2633a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0148b interfaceC0148b = (InterfaceC0148b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a2 = interfaceC0148b.a();
                if (!a2.isEmpty()) {
                    for (Class cls2 : a2) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = interfaceC0148b.b(this.f2635c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new U0.b(th2);
            }
        }
        Trace.endSection();
        return obj;
    }
}
