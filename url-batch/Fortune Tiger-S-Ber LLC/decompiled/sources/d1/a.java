package d1;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.fragment.app.t;
import com.gglhk.bofio.fortunetiger.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k3.m;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f1466d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f1467e = new Object();
    public final Context c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f1469b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1468a = new HashMap();

    public a(Context context) {
        this.c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f1466d == null) {
            synchronized (f1467e) {
                try {
                    if (f1466d == null) {
                        f1466d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f1466d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f1469b;
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
            } catch (ClassNotFoundException e4) {
                throw new t(e4);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = this.f1468a;
        if (m.D()) {
            try {
                m.i(cls.getSimpleName());
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
                List<Class> a4 = bVar.a();
                if (!a4.isEmpty()) {
                    for (Class cls2 : a4) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.b(this.c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new t(th2);
            }
        }
        Trace.endSection();
        return obj;
    }
}
