package X;

import H5.r;
import a.AbstractC0219a;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.strategylink.Row.Five.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f2855d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f2856e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f2859c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f2858b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2857a = new HashMap();

    public a(Context context) {
        this.f2859c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f2855d == null) {
            synchronized (f2856e) {
                try {
                    if (f2855d == null) {
                        f2855d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f2855d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f2859c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f2858b;
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
                throw new r(e4);
            }
        }
    }

    public final void b(Class cls, HashSet hashSet) {
        HashMap hashMap = this.f2857a;
        if (AbstractC0219a.u()) {
            try {
                Trace.beginSection(AbstractC0219a.D(cls.getSimpleName()));
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
                List<Class> dependencies = bVar.dependencies();
                if (!dependencies.isEmpty()) {
                    for (Class cls2 : dependencies) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                Object create = bVar.create(this.f2859c);
                hashSet.remove(cls);
                hashMap.put(cls, create);
            } catch (Throwable th2) {
                throw new r(th2);
            }
        }
        Trace.endSection();
    }
}
