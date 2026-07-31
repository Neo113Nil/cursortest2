package B;

/* renamed from: B.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0012m implements R0.D {

    /* renamed from: a, reason: collision with root package name */
    public final U.d f424a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0013n f425b;

    /* renamed from: c, reason: collision with root package name */
    public long f426c = 0;

    public C0012m(U.d dVar, InterfaceC0013n interfaceC0013n) {
        this.f424a = dVar;
        this.f425b = interfaceC0013n;
    }

    @Override // R0.D
    public final long a(O0.i iVar, long j3, O0.k kVar, long j4) {
        long a3 = this.f425b.a();
        if (!l0.c.D(a3)) {
            a3 = this.f426c;
        }
        this.f426c = a3;
        return O0.h.c(O0.h.c(l0.c.c(iVar.f3736a, iVar.f3737b), l0.c.K(a3)), this.f424a.a(j4, 0L, kVar));
    }
}
