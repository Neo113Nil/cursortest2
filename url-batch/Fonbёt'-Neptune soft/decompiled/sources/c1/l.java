package c1;

import d1.AbstractC0184a;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final B.m f2019a = new B.m(19, "NULL");

    public static /* synthetic */ b1.d a(j jVar, Z0.c cVar, int i2, int i3, int i4) {
        H0.i iVar = cVar;
        if ((i4 & 1) != 0) {
            iVar = H0.j.f503e;
        }
        if ((i4 & 2) != 0) {
            i2 = -3;
        }
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        return jVar.j(iVar, i2, i3);
    }

    public static final Object b(H0.i iVar, Object obj, Object obj2, P0.p pVar, H0.d dVar) {
        Object m2 = AbstractC0184a.m(iVar, obj2);
        try {
            s sVar = new s(dVar, iVar);
            Q0.r.a(2, pVar);
            Object h2 = pVar.h(obj, sVar);
            AbstractC0184a.g(iVar, m2);
            if (h2 == I0.a.f733e) {
                Q0.h.e(dVar, "frame");
            }
            return h2;
        } catch (Throwable th) {
            AbstractC0184a.g(iVar, m2);
            throw th;
        }
    }
}
