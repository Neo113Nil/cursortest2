package t0;

import e2.InterfaceC0422a;

/* loaded from: classes.dex */
public final class L extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ M f8623e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f8624f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(M m3, long j3) {
        super(0);
        this.f8623e = m3;
        this.f8624f = j3;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        Q I02 = this.f8623e.a().I0();
        f2.j.c(I02);
        I02.b(this.f8624f);
        return R1.y.f4171a;
    }
}
