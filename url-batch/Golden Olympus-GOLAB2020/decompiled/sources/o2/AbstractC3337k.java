package o2;

import a2.AbstractC1241b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t2.C3428C;
import u2.AbstractC3458a;
import u2.AbstractC3459b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o2.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC3337k {
    public static final Q a(InterfaceC3316J interfaceC3316J, CoroutineContext coroutineContext, L l4, Function2 function2) {
        CoroutineContext e4 = AbstractC3312F.e(interfaceC3316J, coroutineContext);
        S f02 = l4.e() ? new F0(e4, function2) : new S(e4, true);
        f02.R0(l4, f02, function2);
        return f02;
    }

    public static /* synthetic */ Q b(InterfaceC3316J interfaceC3316J, CoroutineContext coroutineContext, L l4, Function2 function2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f41113b;
        }
        if ((i4 & 2) != 0) {
            l4 = L.f42009b;
        }
        return AbstractC3333i.a(interfaceC3316J, coroutineContext, l4, function2);
    }

    public static final InterfaceC3359v0 c(InterfaceC3316J interfaceC3316J, CoroutineContext coroutineContext, L l4, Function2 function2) {
        CoroutineContext e4 = AbstractC3312F.e(interfaceC3316J, coroutineContext);
        P0 g02 = l4.e() ? new G0(e4, function2) : new P0(e4, true);
        g02.R0(l4, g02, function2);
        return g02;
    }

    public static /* synthetic */ InterfaceC3359v0 d(InterfaceC3316J interfaceC3316J, CoroutineContext coroutineContext, L l4, Function2 function2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f41113b;
        }
        if ((i4 & 2) != 0) {
            l4 = L.f42009b;
        }
        return AbstractC3333i.c(interfaceC3316J, coroutineContext, l4, function2);
    }

    public static final Object e(CoroutineContext coroutineContext, Function2 function2, kotlin.coroutines.d dVar) {
        Object S02;
        CoroutineContext context = dVar.getContext();
        CoroutineContext d4 = AbstractC3312F.d(context, coroutineContext);
        AbstractC3367z0.i(d4);
        if (d4 == context) {
            C3428C c3428c = new C3428C(d4, dVar);
            S02 = AbstractC3459b.b(c3428c, c3428c, function2);
        } else {
            e.b bVar = kotlin.coroutines.e.f41111K2;
            if (Intrinsics.areEqual(d4.get(bVar), context.get(bVar))) {
                Y0 y02 = new Y0(d4, dVar);
                CoroutineContext context2 = y02.getContext();
                Object c4 = t2.K.c(context2, null);
                try {
                    Object b4 = AbstractC3459b.b(y02, y02, function2);
                    t2.K.a(context2, c4);
                    S02 = b4;
                } catch (Throwable th) {
                    t2.K.a(context2, c4);
                    throw th;
                }
            } else {
                V v4 = new V(d4, dVar);
                AbstractC3458a.d(function2, v4, v4, null, 4, null);
                S02 = v4.S0();
            }
        }
        if (S02 == AbstractC1241b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return S02;
    }
}
