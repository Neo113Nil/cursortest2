package n1;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.rockchicken.pump.up.road.R;
import i2.AbstractC0457a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: n1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1318a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C1318a f14582d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f14583e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f14586c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f14585b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14584a = new HashMap();

    public C1318a(Context context) {
        this.f14586c = context.getApplicationContext();
    }

    public static C1318a c(Context context) {
        if (f14582d == null) {
            synchronized (f14583e) {
                try {
                    if (f14582d == null) {
                        f14582d = new C1318a(context);
                    }
                } finally {
                }
            }
        }
        return f14582d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f14586c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f14585b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC1319b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e4) {
                throw new G1.a(e4);
            }
        }
    }

    public final void b(Class cls, HashSet hashSet) {
        HashMap hashMap = this.f14584a;
        if (AbstractC0457a.u()) {
            try {
                Trace.beginSection(AbstractC0457a.E(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC1319b interfaceC1319b = (InterfaceC1319b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a3 = interfaceC1319b.a();
                if (!a3.isEmpty()) {
                    for (Class cls2 : a3) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                Object create = interfaceC1319b.create(this.f14586c);
                hashSet.remove(cls);
                hashMap.put(cls, create);
            } catch (Throwable th2) {
                throw new G1.a(th2);
            }
        }
        Trace.endSection();
    }
}
