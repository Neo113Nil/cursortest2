package Q;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import com.neptunesoft.languesbacdz.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f957d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f958e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f961c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f960b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f959a = new HashMap();

    public a(Context context) {
        this.f961c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f957d == null) {
            synchronized (f958e) {
                try {
                    if (f957d == null) {
                        f957d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f957d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f961c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f960b;
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
                throw new F0.b(e2);
            }
        }
    }

    public final void b(Class cls, HashSet hashSet) {
        boolean z2;
        boolean z3 = false;
        if (Build.VERSION.SDK_INT >= 29) {
            z2 = R.a.c();
        } else {
            try {
                if (i1.a.f2494f == null) {
                    i1.a.f2493e = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    i1.a.f2494f = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                z3 = ((Boolean) i1.a.f2494f.invoke(null, Long.valueOf(i1.a.f2493e))).booleanValue();
            } catch (Exception e2) {
                i1.a.s("isTagEnabled", e2);
            }
            z2 = z3;
        }
        if (z2) {
            try {
                Trace.beginSection(i1.a.H(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap hashMap = this.f959a;
        if (hashMap.containsKey(cls)) {
            hashMap.get(cls);
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
                Object b2 = bVar.b(this.f961c);
                hashSet.remove(cls);
                hashMap.put(cls, b2);
            } catch (Throwable th2) {
                throw new F0.b(th2);
            }
        }
        Trace.endSection();
    }
}
