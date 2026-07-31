package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import m6.y1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f18370a;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f18371b;

    /* renamed from: c, reason: collision with root package name */
    public static final y1 f18372c;

    static {
        q qVar = new q();
        f18370a = qVar;
        f18371b = z.e("kotlinx.coroutines.fast.service.loader", true);
        f18372c = qVar.a();
    }

    private q() {
    }

    private final y1 a() {
        k6.b a7;
        List<MainDispatcherFactory> e7;
        Object next;
        try {
            if (f18371b) {
                e7 = i.f18351a.c();
            } else {
                a7 = k6.f.a(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator());
                e7 = k6.h.e(a7);
            }
            Iterator<T> it = e7.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
            return mainDispatcherFactory == null ? r.b(null, null, 3, null) : r.d(mainDispatcherFactory, e7);
        } catch (Throwable th) {
            return r.b(th, null, 2, null);
        }
    }
}
