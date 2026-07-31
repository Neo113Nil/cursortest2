package u;

import U.p;

/* renamed from: u.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1077d extends p {

    /* renamed from: q, reason: collision with root package name */
    public C1076c f9095q;

    @Override // U.p
    public final boolean n0() {
        return false;
    }

    @Override // U.p
    public final void q0() {
        C1076c c1076c = this.f9095q;
        if (c1076c != null) {
            c1076c.f9094a.n(this);
        }
        if (c1076c != null) {
            c1076c.f9094a.b(this);
        }
        this.f9095q = c1076c;
    }

    @Override // U.p
    public final void r0() {
        C1076c c1076c = this.f9095q;
        if (c1076c != null) {
            f2.j.d(c1076c, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            c1076c.f9094a.n(this);
        }
    }
}
