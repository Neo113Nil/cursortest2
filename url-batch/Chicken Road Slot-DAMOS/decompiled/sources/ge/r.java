package ge;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class r {
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) coroutineContext.z(bool, new a1.e(7, (byte) 0))).booleanValue();
        boolean booleanValue2 = ((Boolean) coroutineContext2.z(bool, new a1.e(7, (byte) 0))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return coroutineContext.p(coroutineContext2);
        }
        wd.b0 b0Var = new wd.b0();
        b0Var.f10141d = coroutineContext2;
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f5592d;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.z(gVar, new a1.e(8, (byte) 0));
        if (booleanValue2) {
            b0Var.f10141d = ((CoroutineContext) b0Var.f10141d).z(gVar, new a1.e(9, (byte) 0));
        }
        return coroutineContext3.p((CoroutineContext) b0Var.f10141d);
    }

    public static final CoroutineContext b(x xVar, CoroutineContext coroutineContext) {
        CoroutineContext a9 = a(xVar.h(), coroutineContext, true);
        ne.e eVar = k0.f4372a;
        return (a9 == eVar || a9.m(kotlin.coroutines.d.f5591n) != null) ? a9 : a9.p(eVar);
    }

    public static final z1 c(ld.a aVar, CoroutineContext coroutineContext, Object obj) {
        z1 z1Var = null;
        if ((aVar instanceof nd.d) && coroutineContext.m(a2.f4332d) != null) {
            nd.d dVar = (nd.d) aVar;
            while (true) {
                if ((dVar instanceof h0) || (dVar = dVar.getCallerFrame()) == null) {
                    break;
                }
                if (dVar instanceof z1) {
                    z1Var = (z1) dVar;
                    break;
                }
            }
            if (z1Var != null) {
                z1Var.l0(coroutineContext, obj);
            }
        }
        return z1Var;
    }
}
