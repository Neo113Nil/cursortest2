package A;

import a.AbstractC0345a;

/* renamed from: A.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0018n implements P0.E {

    /* renamed from: a, reason: collision with root package name */
    public final S.c f168a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0019o f169b;

    /* renamed from: c, reason: collision with root package name */
    public long f170c = 0;

    public C0018n(S.c cVar, InterfaceC0019o interfaceC0019o) {
        this.f168a = cVar;
        this.f169b = interfaceC0019o;
    }

    @Override // P0.E
    public final long a(M0.i iVar, long j4, M0.k kVar, long j5) {
        long a4 = this.f169b.a();
        if (!AbstractC0345a.z(a4)) {
            a4 = this.f170c;
        }
        this.f170c = a4;
        return M0.h.c(M0.h.c(j0.c.g(iVar.f3550a, iVar.f3551b), j0.c.L(a4)), this.f168a.a(j5, 0L, kVar));
    }
}
