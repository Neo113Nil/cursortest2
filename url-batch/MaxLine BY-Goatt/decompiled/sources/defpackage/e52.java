package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class e52 extends e0 implements gt, ui2 {
    public final lq r;

    public e52(CoroutineContext coroutineContext, lq lqVar) {
        super(coroutineContext, true);
        this.r = lqVar;
    }

    @Override // defpackage.ui2
    public final Object a(o30 o30Var, Object obj) {
        return this.r.a(o30Var, obj);
    }

    @Override // defpackage.ui2
    public final Object d(Object obj) {
        return this.r.d(obj);
    }

    @Override // defpackage.n61, defpackage.g61, defpackage.gt
    public final void f(CancellationException cancellationException) {
        Object O = O();
        if (O instanceof gx) {
            return;
        }
        if ((O instanceof m61) && ((m61) O).f()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new h61(z(), null, this);
        }
        w(cancellationException);
    }

    @Override // defpackage.gt
    public final Object h(pr2 pr2Var) {
        lq lqVar = this.r;
        lqVar.getClass();
        return lq.F(lqVar, pr2Var);
    }

    @Override // defpackage.gt
    public final Object i() {
        return this.r.i();
    }

    @Override // defpackage.gt
    public final iq iterator() {
        lq lqVar = this.r;
        lqVar.getClass();
        return new iq(lqVar);
    }

    @Override // defpackage.gt
    public final Object j(vw vwVar) {
        lq lqVar = this.r;
        lqVar.getClass();
        Object G = lq.G(lqVar, vwVar);
        b50 b50Var = b50.m;
        return G;
    }

    @Override // defpackage.e0
    public final void l0(Throwable th, boolean z) {
        if (this.r.k(th, false) || z) {
            return;
        }
        zm3.B(th, this.q);
    }

    @Override // defpackage.e0
    public final void m0(Object obj) {
        ti2.d(this.r);
    }

    @Override // defpackage.n61
    public final void w(CancellationException cancellationException) {
        this.r.k(cancellationException, true);
        u(cancellationException);
    }
}
