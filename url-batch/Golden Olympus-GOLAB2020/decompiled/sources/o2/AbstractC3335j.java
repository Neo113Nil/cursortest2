package o2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o2.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC3335j {
    public static final Object a(CoroutineContext coroutineContext, Function2 function2) {
        AbstractC3328f0 a4;
        CoroutineContext e4;
        Thread currentThread = Thread.currentThread();
        kotlin.coroutines.e eVar = (kotlin.coroutines.e) coroutineContext.get(kotlin.coroutines.e.f41111K2);
        if (eVar == null) {
            a4 = T0.f42024a.b();
            e4 = AbstractC3312F.e(C3346o0.f42094b, coroutineContext.plus(a4));
        } else {
            AbstractC3328f0 abstractC3328f0 = eVar instanceof AbstractC3328f0 ? (AbstractC3328f0) eVar : null;
            if (abstractC3328f0 != null) {
                AbstractC3328f0 abstractC3328f02 = abstractC3328f0.d0() ? abstractC3328f0 : null;
                if (abstractC3328f02 != null) {
                    a4 = abstractC3328f02;
                    e4 = AbstractC3312F.e(C3346o0.f42094b, coroutineContext);
                }
            }
            a4 = T0.f42024a.a();
            e4 = AbstractC3312F.e(C3346o0.f42094b, coroutineContext);
        }
        C3329g c3329g = new C3329g(e4, currentThread, a4);
        c3329g.R0(L.f42009b, c3329g, function2);
        return c3329g.S0();
    }

    public static /* synthetic */ Object b(CoroutineContext coroutineContext, Function2 function2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f41113b;
        }
        return AbstractC3333i.e(coroutineContext, function2);
    }
}
