package r0;

import t0.InterfaceC0913v;

/* loaded from: classes.dex */
public final class E extends U.k implements InterfaceC0913v {

    /* renamed from: q, reason: collision with root package name */
    public Y1.c f7110q;

    /* renamed from: r, reason: collision with root package name */
    public long f7111r;

    @Override // t0.InterfaceC0913v
    public final void A(long j3) {
        if (M0.i.a(this.f7111r, j3)) {
            return;
        }
        this.f7110q.j(new M0.i(j3));
        this.f7111r = j3;
    }

    @Override // U.k
    public final boolean k0() {
        return true;
    }
}
