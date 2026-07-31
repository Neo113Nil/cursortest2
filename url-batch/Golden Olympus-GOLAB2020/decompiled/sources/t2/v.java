package t2;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import o2.H0;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f46262a;

    /* renamed from: b, reason: collision with root package name */
    public static final H0 f46263b;

    static {
        v vVar = new v();
        f46262a = vVar;
        H.f("kotlinx.coroutines.fast.service.loader", true);
        f46263b = vVar.a();
    }

    private v() {
    }

    private final H0 a() {
        Object next;
        H0 e4;
        try {
            List D4 = kotlin.sequences.k.D(kotlin.sequences.k.c(ServiceLoader.load(u.class, u.class.getClassLoader()).iterator()));
            Iterator it = D4.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int c4 = ((u) next).c();
                    do {
                        Object next2 = it.next();
                        int c5 = ((u) next2).c();
                        if (c4 < c5) {
                            next = next2;
                            c4 = c5;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            u uVar = (u) next;
            if (uVar != null && (e4 = w.e(uVar, D4)) != null) {
                return e4;
            }
            w.b(null, null, 3, null);
            return null;
        } catch (Throwable th) {
            w.b(th, null, 2, null);
            return null;
        }
    }
}
