package m6;

import v5.k;

/* loaded from: classes.dex */
public final class c0 {
    public static final <T> Object a(Object obj, y5.d<? super T> dVar) {
        if (obj instanceof y) {
            k.a aVar = v5.k.f22832f;
            Throwable th = ((y) obj).f19365a;
            if (p0.d() && (dVar instanceof kotlin.coroutines.jvm.internal.e)) {
                th = kotlinx.coroutines.internal.x.j(th, (kotlin.coroutines.jvm.internal.e) dVar);
            }
            obj = v5.l.a(th);
        } else {
            k.a aVar2 = v5.k.f22832f;
        }
        return v5.k.a(obj);
    }

    public static final <T> Object b(Object obj, f6.l<? super Throwable, v5.q> lVar) {
        Throwable b7 = v5.k.b(obj);
        return b7 == null ? lVar != null ? new z(obj, lVar) : obj : new y(b7, false, 2, null);
    }

    public static final <T> Object c(Object obj, k<?> kVar) {
        Throwable b7 = v5.k.b(obj);
        if (b7 != null) {
            if (p0.d() && (kVar instanceof kotlin.coroutines.jvm.internal.e)) {
                b7 = kotlinx.coroutines.internal.x.j(b7, (kotlin.coroutines.jvm.internal.e) kVar);
            }
            obj = new y(b7, false, 2, null);
        }
        return obj;
    }

    public static /* synthetic */ Object d(Object obj, f6.l lVar, int i7, Object obj2) {
        if ((i7 & 1) != 0) {
            lVar = null;
        }
        return b(obj, lVar);
    }
}
