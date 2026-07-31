package n;

import t0.AbstractC0993f;
import t0.InterfaceC0998k;

/* renamed from: n.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0670M extends U.p implements InterfaceC0998k, t0.d0 {

    /* renamed from: q, reason: collision with root package name */
    public t.w f7058q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7059r;

    @Override // t0.d0
    public final void e0() {
        f2.u uVar = new f2.u();
        AbstractC0993f.q(this, new B.f0(uVar, 6, this));
        t.w wVar = (t.w) uVar.f5832d;
        if (this.f7059r) {
            t.w wVar2 = this.f7058q;
            if (wVar2 != null) {
                wVar2.b();
            }
            if (wVar != null) {
                wVar.a();
            } else {
                wVar = null;
            }
            this.f7058q = wVar;
        }
    }

    @Override // U.p
    public final boolean n0() {
        return false;
    }

    @Override // U.p
    public final void s0() {
        t.w wVar = this.f7058q;
        if (wVar != null) {
            wVar.b();
        }
        this.f7058q = null;
    }
}
