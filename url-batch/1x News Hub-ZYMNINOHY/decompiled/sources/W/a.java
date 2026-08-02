package W;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.fc.barca.football.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f1611d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f1612e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f1615c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f1614b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1613a = new HashMap();

    public a(Context context) {
        this.f1615c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f1611d == null) {
            synchronized (f1612e) {
                try {
                    if (f1611d == null) {
                        f1611d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f1611d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f1615c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f1614b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e3) {
                throw new O0.b(e3);
            }
        }
    }

    public final void b(Class cls, HashSet hashSet) {
        if (S0.a.v()) {
            try {
                Trace.beginSection(S0.a.N(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap hashMap = this.f1613a;
        if (hashMap.containsKey(cls)) {
            hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> a3 = bVar.a();
                if (!a3.isEmpty()) {
                    for (Class cls2 : a3) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                Object create = bVar.create(this.f1615c);
                hashSet.remove(cls);
                hashMap.put(cls, create);
            } catch (Throwable th2) {
                throw new O0.b(th2);
            }
        }
        Trace.endSection();
    }
}
