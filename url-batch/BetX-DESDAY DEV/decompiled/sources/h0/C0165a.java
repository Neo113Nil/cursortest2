package h0;

import N0.c;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.luckyarcade.spinthrow.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import q1.l;

/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0165a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0165a f2622d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f2623e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f2626c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f2625b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2624a = new HashMap();

    public C0165a(Context context) {
        this.f2626c = context.getApplicationContext();
    }

    public static C0165a c(Context context) {
        if (f2622d == null) {
            synchronized (f2623e) {
                try {
                    if (f2622d == null) {
                        f2622d = new C0165a(context);
                    }
                } finally {
                }
            }
        }
        return f2622d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f2626c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f2625b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0166b.class.isAssignableFrom(cls)) {
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
        HashMap hashMap = this.f2624a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0166b interfaceC0166b = (InterfaceC0166b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a2 = interfaceC0166b.a();
                if (!a2.isEmpty()) {
                    for (Class cls2 : a2) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = interfaceC0166b.b(this.f2626c);
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
