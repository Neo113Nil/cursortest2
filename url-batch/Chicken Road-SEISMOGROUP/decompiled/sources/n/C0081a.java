package n;

import A.c;
import a.AbstractC0016a;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import com.quantumriftgate.arqntmrg.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o.AbstractC0083a;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0081a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0081a f1077d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f1078e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f1081c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f1080b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1079a = new HashMap();

    public C0081a(Context context) {
        this.f1081c = context.getApplicationContext();
    }

    public static C0081a c(Context context) {
        if (f1077d == null) {
            synchronized (f1078e) {
                try {
                    if (f1077d == null) {
                        f1077d = new C0081a(context);
                    }
                } finally {
                }
            }
        }
        return f1077d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f1081c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f1080b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0082b.class.isAssignableFrom(cls)) {
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
        boolean z;
        if (Build.VERSION.SDK_INT >= 29) {
            z = AbstractC0083a.c();
        } else {
            try {
                if (AbstractC0016a.f461d == null) {
                    AbstractC0016a.f460c = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    AbstractC0016a.f461d = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                z = ((Boolean) AbstractC0016a.f461d.invoke(null, Long.valueOf(AbstractC0016a.f460c))).booleanValue();
            } catch (Exception e2) {
                AbstractC0016a.r("isTagEnabled", e2);
                z = false;
            }
        }
        if (z) {
            try {
                Trace.beginSection(AbstractC0016a.E(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap hashMap = this.f1079a;
        if (hashMap.containsKey(cls)) {
            hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0082b interfaceC0082b = (InterfaceC0082b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a2 = interfaceC0082b.a();
                if (!a2.isEmpty()) {
                    for (Class cls2 : a2) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                Object b2 = interfaceC0082b.b(this.f1081c);
                hashSet.remove(cls);
                hashMap.put(cls, b2);
            } catch (Throwable th2) {
                throw new c(th2);
            }
        }
        Trace.endSection();
    }
}
