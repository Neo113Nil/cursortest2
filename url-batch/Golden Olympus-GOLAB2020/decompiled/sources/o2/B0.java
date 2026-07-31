package o2;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class B0 {

    /* synthetic */ class a extends kotlin.jvm.internal.p implements Function1 {
        a(Object obj) {
            super(1, obj, InterfaceC3353s0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.f41027a;
        }

        public final void invoke(Throwable th) {
            ((InterfaceC3353s0) this.receiver).a(th);
        }
    }

    public static final InterfaceC3366z a(InterfaceC3359v0 interfaceC3359v0) {
        return new C3365y0(interfaceC3359v0);
    }

    public static /* synthetic */ InterfaceC3366z b(InterfaceC3359v0 interfaceC3359v0, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            interfaceC3359v0 = null;
        }
        return AbstractC3367z0.a(interfaceC3359v0);
    }

    public static final void c(CoroutineContext coroutineContext, CancellationException cancellationException) {
        InterfaceC3359v0 interfaceC3359v0 = (InterfaceC3359v0) coroutineContext.get(InterfaceC3359v0.f42105N2);
        if (interfaceC3359v0 != null) {
            interfaceC3359v0.cancel(cancellationException);
        }
    }

    public static /* synthetic */ void d(CoroutineContext coroutineContext, CancellationException cancellationException, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cancellationException = null;
        }
        AbstractC3367z0.c(coroutineContext, cancellationException);
    }

    public static final void e(CoroutineContext coroutineContext, CancellationException cancellationException) {
        Sequence children;
        InterfaceC3359v0 interfaceC3359v0 = (InterfaceC3359v0) coroutineContext.get(InterfaceC3359v0.f42105N2);
        if (interfaceC3359v0 == null || (children = interfaceC3359v0.getChildren()) == null) {
            return;
        }
        Iterator it = children.iterator();
        while (it.hasNext()) {
            ((InterfaceC3359v0) it.next()).cancel(cancellationException);
        }
    }

    public static /* synthetic */ void f(CoroutineContext coroutineContext, CancellationException cancellationException, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cancellationException = null;
        }
        AbstractC3367z0.e(coroutineContext, cancellationException);
    }

    public static final InterfaceC3320b0 g(InterfaceC3359v0 interfaceC3359v0, InterfaceC3320b0 interfaceC3320b0) {
        return l(interfaceC3359v0, false, false, new C3324d0(interfaceC3320b0), 3, null);
    }

    public static final void h(CoroutineContext coroutineContext) {
        InterfaceC3359v0 interfaceC3359v0 = (InterfaceC3359v0) coroutineContext.get(InterfaceC3359v0.f42105N2);
        if (interfaceC3359v0 != null) {
            AbstractC3367z0.j(interfaceC3359v0);
        }
    }

    public static final void i(InterfaceC3359v0 interfaceC3359v0) {
        if (!interfaceC3359v0.isActive()) {
            throw interfaceC3359v0.getCancellationException();
        }
    }

    public static final InterfaceC3359v0 j(CoroutineContext coroutineContext) {
        InterfaceC3359v0 interfaceC3359v0 = (InterfaceC3359v0) coroutineContext.get(InterfaceC3359v0.f42105N2);
        if (interfaceC3359v0 != null) {
            return interfaceC3359v0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    public static final InterfaceC3320b0 k(InterfaceC3359v0 interfaceC3359v0, boolean z4, boolean z5, InterfaceC3353s0 interfaceC3353s0) {
        return interfaceC3359v0 instanceof D0 ? ((D0) interfaceC3359v0).i0(z4, z5, interfaceC3353s0) : interfaceC3359v0.invokeOnCompletion(z4, z5, new a(interfaceC3353s0));
    }

    public static /* synthetic */ InterfaceC3320b0 l(InterfaceC3359v0 interfaceC3359v0, boolean z4, boolean z5, InterfaceC3353s0 interfaceC3353s0, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        if ((i4 & 2) != 0) {
            z5 = true;
        }
        return AbstractC3367z0.l(interfaceC3359v0, z4, z5, interfaceC3353s0);
    }
}
