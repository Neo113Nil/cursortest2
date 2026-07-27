package W2;

import kotlin.coroutines.CoroutineContext;

/* renamed from: W2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0296s {
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z4) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) coroutineContext.i(bool, new r(0))).booleanValue();
        boolean booleanValue2 = ((Boolean) coroutineContext2.i(bool, new r(0))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return coroutineContext.s(coroutineContext2);
        }
        M2.E e4 = new M2.E();
        e4.f3580d = coroutineContext2;
        kotlin.coroutines.i iVar = kotlin.coroutines.i.f7498d;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.i(iVar, new r(1));
        if (booleanValue2) {
            e4.f3580d = ((CoroutineContext) e4.f3580d).i(iVar, new r(2));
        }
        return coroutineContext3.s((CoroutineContext) e4.f3580d);
    }

    public static final A0 b(C2.a aVar, CoroutineContext coroutineContext, Object obj) {
        A0 a02 = null;
        if (!(aVar instanceof E2.d)) {
            return null;
        }
        if (coroutineContext.k(B0.f4218d) != null) {
            E2.d dVar = (E2.d) aVar;
            while (true) {
                if ((dVar instanceof G) || (dVar = dVar.e()) == null) {
                    break;
                }
                if (dVar instanceof A0) {
                    a02 = (A0) dVar;
                    break;
                }
            }
            if (a02 != null) {
                a02.l0(coroutineContext, obj);
            }
        }
        return a02;
    }
}
