package w1;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.chicken.road.kedro.laqer.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m3.z;

/* renamed from: w1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1290a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C1290a f11378d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f11379e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f11382c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f11381b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11380a = new HashMap();

    public C1290a(Context context) {
        this.f11382c = context.getApplicationContext();
    }

    public static C1290a c(Context context) {
        if (f11378d == null) {
            synchronized (f11379e) {
                try {
                    if (f11378d == null) {
                        f11378d = new C1290a(context);
                    }
                } finally {
                }
            }
        }
        return f11378d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f11382c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f11381b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC1291b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e4) {
                throw new I1.b(e4);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (z.p()) {
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
        HashMap hashMap = this.f11380a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC1291b interfaceC1291b = (InterfaceC1291b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a4 = interfaceC1291b.a();
                if (!a4.isEmpty()) {
                    for (Class cls2 : a4) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = interfaceC1291b.b(this.f11382c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new I1.b(th2);
            }
        }
        Trace.endSection();
        return obj;
    }
}
