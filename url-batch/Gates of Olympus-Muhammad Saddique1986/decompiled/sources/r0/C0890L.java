package r0;

import e2.InterfaceC0424c;
import t0.InterfaceC1008v;

/* renamed from: r0.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0890L extends U.p implements InterfaceC1008v {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC0424c f8122q;

    /* renamed from: r, reason: collision with root package name */
    public long f8123r;

    @Override // t0.InterfaceC1008v
    public final void C(long j3) {
        if (O0.j.a(this.f8123r, j3)) {
            return;
        }
        this.f8122q.n(new O0.j(j3));
        this.f8123r = j3;
    }

    @Override // U.p
    public final boolean n0() {
        return true;
    }
}
