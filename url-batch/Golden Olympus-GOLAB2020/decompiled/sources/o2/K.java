package o2;

import a2.AbstractC1241b;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import t2.C3428C;
import t2.C3436g;
import u2.AbstractC3459b;

/* loaded from: classes3.dex */
public abstract class K {
    public static final InterfaceC3316J a(CoroutineContext coroutineContext) {
        InterfaceC3366z b4;
        if (coroutineContext.get(InterfaceC3359v0.f42105N2) == null) {
            b4 = B0.b(null, 1, null);
            coroutineContext = coroutineContext.plus(b4);
        }
        return new C3436g(coroutineContext);
    }

    public static final InterfaceC3316J b() {
        return new C3436g(R0.b(null, 1, null).plus(Z.c()));
    }

    public static final void c(InterfaceC3316J interfaceC3316J, String str, Throwable th) {
        d(interfaceC3316J, AbstractC3338k0.a(str, th));
    }

    public static final void d(InterfaceC3316J interfaceC3316J, CancellationException cancellationException) {
        InterfaceC3359v0 interfaceC3359v0 = (InterfaceC3359v0) interfaceC3316J.n().get(InterfaceC3359v0.f42105N2);
        if (interfaceC3359v0 != null) {
            interfaceC3359v0.cancel(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC3316J).toString());
    }

    public static /* synthetic */ void e(InterfaceC3316J interfaceC3316J, String str, Throwable th, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            th = null;
        }
        c(interfaceC3316J, str, th);
    }

    public static /* synthetic */ void f(InterfaceC3316J interfaceC3316J, CancellationException cancellationException, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cancellationException = null;
        }
        d(interfaceC3316J, cancellationException);
    }

    public static final Object g(Function2 function2, kotlin.coroutines.d dVar) {
        C3428C c3428c = new C3428C(dVar.getContext(), dVar);
        Object b4 = AbstractC3459b.b(c3428c, c3428c, function2);
        if (b4 == AbstractC1241b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return b4;
    }

    public static final void h(InterfaceC3316J interfaceC3316J) {
        AbstractC3367z0.i(interfaceC3316J.n());
    }

    public static final boolean i(InterfaceC3316J interfaceC3316J) {
        InterfaceC3359v0 interfaceC3359v0 = (InterfaceC3359v0) interfaceC3316J.n().get(InterfaceC3359v0.f42105N2);
        if (interfaceC3359v0 != null) {
            return interfaceC3359v0.isActive();
        }
        return true;
    }
}
