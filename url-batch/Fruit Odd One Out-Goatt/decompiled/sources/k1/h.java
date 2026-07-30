package k1;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class h extends k0 implements g {

    /* renamed from: f, reason: collision with root package name */
    public final q0 f680f;

    public h(q0 q0Var) {
        this.f680f = q0Var;
    }

    @Override // k1.g
    public final boolean d(Throwable th) {
        q0 n2 = n();
        if (th instanceof CancellationException) {
            return true;
        }
        return n2.n(th) && n2.v();
    }

    @Override // c1.l
    public final /* bridge */ /* synthetic */ Object h(Object obj) {
        o((Throwable) obj);
        return t0.g.f1178a;
    }

    @Override // k1.m0
    public final void o(Throwable th) {
        this.f680f.n(n());
    }
}
