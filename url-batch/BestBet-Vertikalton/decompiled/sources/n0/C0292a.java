package n0;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import c1.AbstractC0091d;
import com.fortunequest.neontrack.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292a {
    public static volatile C0292a d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f3554e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f3557c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f3556b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3555a = new HashMap();

    public C0292a(Context context) {
        this.f3557c = context.getApplicationContext();
    }

    public static C0292a c(Context context) {
        if (d == null) {
            synchronized (f3554e) {
                try {
                    if (d == null) {
                        d = new C0292a(context);
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f3557c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f3556b;
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
                throw new X0.b(e2);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (AbstractC0091d.n()) {
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
        HashMap hashMap = this.f3555a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a2 = bVar.a();
                if (!a2.isEmpty()) {
                    for (Class cls2 : a2) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.b(this.f3557c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new X0.b(th2);
            }
        }
        Trace.endSection();
        return obj;
    }
}
