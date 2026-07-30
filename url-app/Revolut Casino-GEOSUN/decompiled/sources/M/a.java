package M;

import a.AbstractC0069a;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import com.aurifaber.valuta.rotatus.signum.modulus.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f610d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f611e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f614c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f613b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f612a = new HashMap();

    public a(Context context) {
        this.f614c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f610d == null) {
            synchronized (f611e) {
                try {
                    if (f610d == null) {
                        f610d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f610d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f614c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f613b;
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
        if (Build.VERSION.SDK_INT >= 29) {
            z2 = N.a.c();
        } else {
            try {
                if (AbstractC0069a.f1083f == null) {
                    AbstractC0069a.f1082e = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    AbstractC0069a.f1083f = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                z2 = ((Boolean) AbstractC0069a.f1083f.invoke(null, Long.valueOf(AbstractC0069a.f1082e))).booleanValue();
            } catch (Exception e2) {
                AbstractC0069a.r("isTagEnabled", e2);
                z2 = false;
            }
        }
        if (z2) {
            try {
                Trace.beginSection(AbstractC0069a.K(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap hashMap = this.f612a;
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
                Object b2 = bVar.b(this.f614c);
                hashSet.remove(cls);
                hashMap.put(cls, b2);
            } catch (Throwable th2) {
                throw new c(th2);
            }
        }
        Trace.endSection();
    }
}
