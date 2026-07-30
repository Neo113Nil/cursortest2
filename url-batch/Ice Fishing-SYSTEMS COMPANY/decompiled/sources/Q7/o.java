package Q7;

import O7.AbstractC0376a;
import O7.AbstractC0399y;
import O7.C0391p;
import O7.Z;
import O7.f0;
import java.util.concurrent.CancellationException;
import v7.InterfaceC5133d;
import v7.InterfaceC5138i;

/* loaded from: classes2.dex */
public final class o extends AbstractC0376a implements p, g {

    /* renamed from: w, reason: collision with root package name */
    public final c f2776w;

    public o(InterfaceC5138i interfaceC5138i, c cVar) {
        super(interfaceC5138i, true);
        this.f2776w = cVar;
    }

    @Override // O7.AbstractC0376a
    public final void U(Throwable th, boolean z8) {
        if (this.f2776w.i(th, false) || z8) {
            return;
        }
        AbstractC0399y.l(th, this.f2578v);
    }

    @Override // O7.AbstractC0376a
    public final void V(Object obj) {
        this.f2776w.i(null, false);
    }

    @Override // O7.h0, O7.Y
    public final void a(CancellationException cancellationException) {
        Object C7 = C();
        if (C7 instanceof C0391p) {
            return;
        }
        if ((C7 instanceof f0) && ((f0) C7).c()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new Z(r(), null, this);
        }
        p(cancellationException);
    }

    @Override // Q7.r
    public final Object b(Object obj, InterfaceC5133d interfaceC5133d) {
        return this.f2776w.b(obj, interfaceC5133d);
    }

    @Override // Q7.q
    public final Object c(InterfaceC5133d interfaceC5133d) {
        return this.f2776w.c(interfaceC5133d);
    }

    @Override // Q7.r
    public final Object e(Object obj) {
        return this.f2776w.e(obj);
    }

    @Override // O7.h0
    public final void p(CancellationException cancellationException) {
        this.f2776w.i(cancellationException, true);
        o(cancellationException);
    }
}
