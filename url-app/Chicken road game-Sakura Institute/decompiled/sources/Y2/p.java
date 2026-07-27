package Y2;

import W2.AbstractC0275a;
import W2.B;
import W2.C0282d0;
import W2.C0294p;
import W2.j0;
import W2.k0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class p extends AbstractC0275a implements q, i {

    /* renamed from: j, reason: collision with root package name */
    public final e f4447j;

    public p(CoroutineContext coroutineContext, e eVar) {
        super(coroutineContext, true);
        this.f4447j = eVar;
    }

    @Override // W2.k0
    public final void D(CancellationException cancellationException) {
        this.f4447j.g(cancellationException, true);
        C(cancellationException);
    }

    @Override // W2.k0, W2.InterfaceC0280c0
    public final void a(CancellationException cancellationException) {
        Object obj = k0.f4279d.get(this);
        if (obj instanceof C0294p) {
            return;
        }
        if ((obj instanceof j0) && ((j0) obj).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C0282d0(F(), null, this);
        }
        D(cancellationException);
    }

    @Override // W2.AbstractC0275a
    public final void h0(Throwable th, boolean z4) {
        if (this.f4447j.g(th, false) || z4) {
            return;
        }
        B.i(th, this.f4246i);
    }

    @Override // W2.AbstractC0275a
    public final void i0(Object obj) {
        this.f4447j.g(null, false);
    }

    @Override // Y2.r
    public final c iterator() {
        e eVar = this.f4447j;
        eVar.getClass();
        return new c(eVar);
    }

    @Override // Y2.r
    public final Object l(E2.j jVar) {
        return this.f4447j.l(jVar);
    }

    @Override // Y2.r
    public final Object m() {
        return this.f4447j.m();
    }

    @Override // Y2.s
    public final Object o(Object obj) {
        return this.f4447j.o(obj);
    }

    @Override // Y2.s
    public final Object t(C2.a aVar, Object obj) {
        return this.f4447j.t(aVar, obj);
    }
}
