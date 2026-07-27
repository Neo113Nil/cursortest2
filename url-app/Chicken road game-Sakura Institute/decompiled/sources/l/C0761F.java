package l;

import G.C0192d;
import G.C0205j0;

/* renamed from: l.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0761F extends t0 {

    /* renamed from: b, reason: collision with root package name */
    public final C0205j0 f7568b;

    /* renamed from: c, reason: collision with root package name */
    public final C0205j0 f7569c;

    public C0761F(Object obj) {
        super(0);
        G.W w4 = G.W.f2779l;
        this.f7568b = C0192d.K(obj, w4);
        this.f7569c = C0192d.K(obj, w4);
    }

    @Override // l.t0
    public final Object l() {
        return this.f7568b.getValue();
    }

    @Override // l.t0
    public final Object m() {
        return this.f7569c.getValue();
    }

    @Override // l.t0
    public final void n(Object obj) {
        this.f7568b.setValue(obj);
    }

    @Override // l.t0
    public final void o(m0 m0Var) {
    }

    @Override // l.t0
    public final void p() {
    }
}
