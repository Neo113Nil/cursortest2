package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class jz0 extends p implements fg, c91 {
    public final we j;

    public jz0(CoroutineContext coroutineContext, we weVar) {
        super(coroutineContext, true);
        this.j = weVar;
    }

    @Override // defpackage.qb0
    public final void F(CancellationException cancellationException) {
        this.j.g(cancellationException, true);
        E(cancellationException);
    }

    @Override // defpackage.qb0, defpackage.jb0, defpackage.fg
    public final void a(CancellationException cancellationException) {
        Object R = R();
        if (R instanceof hj) {
            return;
        }
        if ((R instanceof pb0) && ((pb0) R).f()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new kb0(H(), null, this);
        }
        F(cancellationException);
    }

    @Override // defpackage.c91
    public final Object e(dn dnVar, Object obj) {
        return this.j.e(dnVar, obj);
    }

    @Override // defpackage.fg
    public final Object m(sf1 sf1Var) {
        we weVar = this.j;
        weVar.getClass();
        return we.D(weVar, sf1Var);
    }

    @Override // defpackage.p
    public final void p0(Throwable th, boolean z) {
        if (this.j.g(th, false) || z) {
            return;
        }
        m90.z(th, this.i);
    }

    @Override // defpackage.fg
    public final Object q() {
        return this.j.q();
    }

    @Override // defpackage.p
    public final void q0(Object obj) {
        this.j.g(null, false);
    }

    @Override // defpackage.c91
    public final Object s(Object obj) {
        return this.j.s(obj);
    }
}
