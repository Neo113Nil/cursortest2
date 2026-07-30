package o0;

import E1.i;
import a.AbstractC0169a;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.icefishing.icefish.ice.fishing.s294s.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0796a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0796a f7111d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f7112e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f7115c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f7114b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7113a = new HashMap();

    public C0796a(Context context) {
        this.f7115c = context.getApplicationContext();
    }

    public static C0796a c(Context context) {
        if (f7111d == null) {
            synchronized (f7112e) {
                try {
                    if (f7111d == null) {
                        f7111d = new C0796a(context);
                    }
                } finally {
                }
            }
        }
        return f7111d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f7115c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f7114b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0797b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e7) {
                throw new i(e7);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = this.f7113a;
        if (AbstractC0169a.o()) {
            try {
                Trace.beginSection(AbstractC0169a.G(cls.getSimpleName()));
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
                InterfaceC0797b interfaceC0797b = (InterfaceC0797b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> dependencies = interfaceC0797b.dependencies();
                if (!dependencies.isEmpty()) {
                    for (Class cls2 : dependencies) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = interfaceC0797b.create(this.f7115c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new i(th2);
            }
        }
        Trace.endSection();
        return obj;
    }
}
