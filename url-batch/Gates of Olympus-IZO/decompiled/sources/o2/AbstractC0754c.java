package o2;

import M1.B;

/* renamed from: o2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0754c {

    /* renamed from: a, reason: collision with root package name */
    public static final P1.d[] f6698a = new P1.d[0];

    /* renamed from: b, reason: collision with root package name */
    public static final j1.p f6699b = new j1.p("NULL", 1);

    public static final Object a(P1.i iVar, Object obj, Object obj2, Y1.e eVar, P1.d dVar) {
        Object g3;
        Object n3 = p2.a.n(iVar, obj2);
        try {
            x xVar = new x(dVar, iVar);
            if (eVar instanceof R1.a) {
                Z1.w.d(2, eVar);
                g3 = eVar.g(obj, xVar);
            } else {
                g3 = B.S(eVar, obj, xVar);
            }
            p2.a.i(iVar, n3);
            if (g3 == Q1.a.f3113d) {
                Z1.i.f(dVar, "frame");
            }
            return g3;
        } catch (Throwable th) {
            p2.a.i(iVar, n3);
            throw th;
        }
    }
}
