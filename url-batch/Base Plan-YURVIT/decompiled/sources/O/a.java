package O;

import a.AbstractC0086a;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import com.crane.slab.beam.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f783d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f784e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f787c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f786b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f785a = new HashMap();

    public a(Context context) {
        this.f787c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f783d == null) {
            synchronized (f784e) {
                try {
                    if (f783d == null) {
                        f783d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f783d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f787c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f786b;
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
                throw new D0.b(e2);
            }
        }
    }

    public final void b(Class cls, HashSet hashSet) {
        boolean z2;
        HashMap hashMap = this.f785a;
        if (Build.VERSION.SDK_INT >= 29) {
            z2 = P.a.c();
        } else {
            try {
                if (AbstractC0086a.f1136b == null) {
                    AbstractC0086a.f1135a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    AbstractC0086a.f1136b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                z2 = ((Boolean) AbstractC0086a.f1136b.invoke(null, Long.valueOf(AbstractC0086a.f1135a))).booleanValue();
            } catch (Exception e2) {
                AbstractC0086a.u("isTagEnabled", e2);
                z2 = false;
            }
        }
        if (z2) {
            try {
                Trace.beginSection(AbstractC0086a.J(cls.getSimpleName()));
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
                Object b2 = bVar.b(this.f787c);
                hashSet.remove(cls);
                hashMap.put(cls, b2);
            } catch (Throwable th2) {
                throw new D0.b(th2);
            }
        }
        Trace.endSection();
    }
}
