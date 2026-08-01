package n5;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.appsflyer.R;
import com.google.android.gms.internal.measurement.d0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f7142d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f7143e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f7146c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f7145b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7144a = new HashMap();

    public a(Context context) {
        this.f7146c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f7142d == null) {
            synchronized (f7143e) {
                try {
                    if (f7142d == null) {
                        f7142d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f7142d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f7146c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f7145b;
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
            } catch (ClassNotFoundException e2) {
                throw new d0(e2);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = this.f7144a;
        if (i7.a.V()) {
            try {
                i7.a.n(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a9 = bVar.a();
                if (!a9.isEmpty()) {
                    for (Class cls2 : a9) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.b(this.f7146c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new d0(th2);
            }
        }
        Trace.endSection();
        return obj;
    }
}
