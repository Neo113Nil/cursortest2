package m6;

import v5.k;

/* loaded from: classes.dex */
public final class q0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(y5.d<?> dVar) {
        Object a7;
        if (dVar instanceof kotlinx.coroutines.internal.f) {
            return dVar.toString();
        }
        try {
            k.a aVar = v5.k.f22832f;
            a7 = v5.k.a(dVar + '@' + b(dVar));
        } catch (Throwable th) {
            k.a aVar2 = v5.k.f22832f;
            a7 = v5.k.a(v5.l.a(th));
        }
        if (v5.k.b(a7) != null) {
            a7 = ((Object) dVar.getClass().getName()) + '@' + b(dVar);
        }
        return (String) a7;
    }
}
