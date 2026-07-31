package a5;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.snovikpovik.vuevnxsj.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f232d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f233e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f236c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f235b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f234a = new HashMap();

    public a(Context context) {
        this.f236c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f232d == null) {
            synchronized (f233e) {
                try {
                    if (f232d == null) {
                        f232d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f232d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f236c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f235b;
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
            } catch (ClassNotFoundException e8) {
                throw new c(e8);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = this.f234a;
        if (a.a.o()) {
            try {
                a.a.e(cls.getSimpleName());
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
                List<Class> a8 = bVar.a();
                if (!a8.isEmpty()) {
                    for (Class cls2 : a8) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.b(this.f236c);
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
