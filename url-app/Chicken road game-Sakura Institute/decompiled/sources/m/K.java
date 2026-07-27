package m;

import r0.AbstractC1065f;
import r0.InterfaceC1071l;

/* loaded from: classes.dex */
public final class K extends S.n implements InterfaceC1071l, r0.c0 {

    /* renamed from: t, reason: collision with root package name */
    public s.v f8028t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8029u;

    @Override // r0.c0
    public final void l0() {
        M2.E e4 = new M2.E();
        AbstractC1065f.s(this, new A.f0(e4, 6, this));
        s.v vVar = (s.v) e4.f3580d;
        if (this.f8029u) {
            s.v vVar2 = this.f8028t;
            if (vVar2 != null) {
                vVar2.b();
            }
            if (vVar != null) {
                vVar.a();
            } else {
                vVar = null;
            }
            this.f8028t = vVar;
        }
    }

    @Override // S.n
    public final boolean q0() {
        return false;
    }

    @Override // S.n
    public final void v0() {
        s.v vVar = this.f8028t;
        if (vVar != null) {
            vVar.b();
        }
        this.f8028t = null;
    }
}
