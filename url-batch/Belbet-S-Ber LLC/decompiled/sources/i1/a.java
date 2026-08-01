package i1;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.fragment.app.t;
import b4.d;
import com.gdmhkmf.belbet.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a {
    public static volatile a d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f1997e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f2000c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f1999b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1998a = new HashMap();

    public a(Context context) {
        this.f2000c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (d == null) {
            synchronized (f1997e) {
                try {
                    if (d == null) {
                        d = new a(context);
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f2000c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f1999b;
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
        HashMap hashMap = this.f1998a;
        if (d.E()) {
            try {
                d.j(cls.getSimpleName());
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
                List<Class> a5 = bVar.a();
                if (!a5.isEmpty()) {
                    for (Class cls2 : a5) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.b(this.f2000c);
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
