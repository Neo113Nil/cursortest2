package B0;

import S0.f;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.icefishing.icefishingliveapp.C5284R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f64d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f65e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f68c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f67b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f66a = new HashMap();

    public a(Context context) {
        this.f68c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f64d == null) {
            synchronized (f65e) {
                try {
                    if (f64d == null) {
                        f64d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f64d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f68c.getString(C5284R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f67b;
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
            } catch (ClassNotFoundException e6) {
                throw new c(e6);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (f.m()) {
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
        HashMap hashMap = this.f66a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> dependencies = bVar.dependencies();
                if (!dependencies.isEmpty()) {
                    for (Class cls2 : dependencies) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.create(this.f68c);
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
