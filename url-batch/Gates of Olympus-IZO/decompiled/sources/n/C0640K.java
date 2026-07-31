package n;

import I.C0125v0;
import t0.AbstractC0898f;
import t0.InterfaceC0903k;
import u.C0921C;

/* renamed from: n.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0640K extends U.k implements InterfaceC0903k, t0.c0 {

    /* renamed from: q, reason: collision with root package name */
    public C0921C f6013q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6014r;

    @Override // t0.c0
    public final void d0() {
        Z1.t tVar = new Z1.t();
        AbstractC0898f.q(this, new C0125v0(tVar, 5, this));
        C0921C c0921c = (C0921C) tVar.f3480d;
        if (this.f6014r) {
            C0921C c0921c2 = this.f6013q;
            if (c0921c2 != null) {
                c0921c2.b();
            }
            if (c0921c != null) {
                c0921c.a();
            } else {
                c0921c = null;
            }
            this.f6013q = c0921c;
        }
    }

    @Override // U.k
    public final boolean k0() {
        return false;
    }

    @Override // U.k
    public final void p0() {
        C0921C c0921c = this.f6013q;
        if (c0921c != null) {
            c0921c.b();
        }
        this.f6013q = null;
    }
}
