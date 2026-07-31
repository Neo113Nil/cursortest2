package C1;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.gatesof.olympus.martu.marku.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f683d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f684e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f687c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f686b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f685a = new HashMap();

    public a(Context context) {
        this.f687c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f683d == null) {
            synchronized (f684e) {
                try {
                    if (f683d == null) {
                        f683d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f683d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f687c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f686b;
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
                throw new c(e3);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (l0.c.C()) {
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
        HashMap hashMap = this.f685a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a3 = bVar.a();
                if (!a3.isEmpty()) {
                    for (Class cls2 : a3) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.b(this.f687c);
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
