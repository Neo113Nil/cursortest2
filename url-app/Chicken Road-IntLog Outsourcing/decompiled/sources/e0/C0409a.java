package e0;

import a.AbstractC0169a;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.chickyneer.roadway.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0409a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0409a f5518d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f5519e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f5522c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f5521b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5520a = new HashMap();

    public C0409a(Context context) {
        this.f5522c = context.getApplicationContext();
    }

    public static C0409a c(Context context) {
        if (f5518d == null) {
            synchronized (f5519e) {
                try {
                    if (f5518d == null) {
                        f5518d = new C0409a(context);
                    }
                } finally {
                }
            }
        }
        return f5518d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f5522c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f5521b;
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
                throw new C1.b(e3);
            }
        }
    }

    public final void b(Class cls, HashSet hashSet) {
        if (AbstractC0169a.x()) {
            try {
                Trace.beginSection(AbstractC0169a.I(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap hashMap = this.f5520a;
        if (hashMap.containsKey(cls)) {
            hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a6 = bVar.a();
                if (!a6.isEmpty()) {
                    for (Class cls2 : a6) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                Object create = bVar.create(this.f5522c);
                hashSet.remove(cls);
                hashMap.put(cls, create);
            } catch (Throwable th2) {
                throw new C1.b(th2);
            }
        }
        Trace.endSection();
    }
}
