package a1;

import B0.E;
import b1.AbstractC0115a;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final E f1161a = new E(14, "NULL");

    public static Z0.d a(Z0.c cVar, X0.c cVar2, int i2, int i3, int i4) {
        G0.i iVar = cVar2;
        if ((i4 & 1) != 0) {
            iVar = G0.j.f500e;
        }
        if ((i4 & 2) != 0) {
            i2 = -3;
        }
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        int i5 = cVar.f1153g;
        int i6 = cVar.f1152f;
        G0.i iVar2 = cVar.f1151e;
        G0.i j2 = iVar.j(iVar2);
        if (i3 == 1) {
            if (i6 != -3) {
                if (i2 != -3) {
                    if (i6 != -2) {
                        if (i2 != -2) {
                            i2 += i6;
                            if (i2 < 0) {
                                i2 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i2 = i6;
            }
            i3 = i5;
        }
        return (P0.h.a(j2, iVar2) && i2 == i6 && i3 == i5) ? cVar : new Z0.c(cVar.f1080i, j2, i2, i3);
    }

    public static final Object b(G0.i iVar, Object obj, Object obj2, O0.p pVar, G0.d dVar) {
        Object l2 = AbstractC0115a.l(iVar, obj2);
        try {
            s sVar = new s(dVar, iVar);
            P0.r.a(2, pVar);
            Object i2 = pVar.i(obj, sVar);
            AbstractC0115a.f(iVar, l2);
            if (i2 == H0.a.f511e) {
                P0.h.e(dVar, "frame");
            }
            return i2;
        } catch (Throwable th) {
            AbstractC0115a.f(iVar, l2);
            throw th;
        }
    }
}
