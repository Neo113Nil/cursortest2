package p;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import c0.c;
import com.khaderthree.fruitoddoneout.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f1028d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f1029e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f1032c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f1031b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1030a = new HashMap();

    public a(Context context) {
        this.f1032c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f1028d == null) {
            synchronized (f1029e) {
                try {
                    if (f1028d == null) {
                        f1028d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f1028d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f1032c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f1031b;
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
                throw new c(e2);
            }
        }
    }

    public final void b(Class cls, HashSet hashSet) {
        boolean z2;
        HashMap hashMap = this.f1030a;
        if (Build.VERSION.SDK_INT >= 29) {
            z2 = q.a.c();
        } else {
            try {
                if (a.a.f1c == null) {
                    a.a.f0b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    a.a.f1c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                z2 = ((Boolean) a.a.f1c.invoke(null, Long.valueOf(a.a.f0b))).booleanValue();
            } catch (Exception e2) {
                a.a.l("isTagEnabled", e2);
                z2 = false;
            }
        }
        if (z2) {
            try {
                Trace.beginSection(a.a.D(cls.getSimpleName()));
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
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a2 = bVar.a();
                if (!a2.isEmpty()) {
                    for (Class cls2 : a2) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                Object b2 = bVar.b(this.f1032c);
                hashSet.remove(cls);
                hashMap.put(cls, b2);
            } catch (Throwable th2) {
                throw new c(th2);
            }
        }
        Trace.endSection();
    }
}
