package r1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x extends p0 {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f7911w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar) {
        super(yVar);
        this.f7911w = yVar;
    }

    @Override // p1.e0
    public final int a0(int i7) {
        y yVar = this.f7911w;
        w wVar = yVar.O;
        a1 a1Var = yVar.f7701r;
        r6.k.c(a1Var);
        p0 K0 = a1Var.K0();
        r6.k.c(K0);
        return wVar.h(this, K0, i7);
    }

    @Override // p1.e0
    public final p1.n0 b(long j8) {
        o0(j8);
        new m2.a(j8);
        y yVar = this.f7911w;
        w wVar = yVar.O;
        a1 a1Var = yVar.f7701r;
        r6.k.c(a1Var);
        p0 K0 = a1Var.K0();
        r6.k.c(K0);
        p0.A0(this, wVar.f(this, K0, j8));
        return this;
    }

    @Override // p1.e0
    public final int c(int i7) {
        y yVar = this.f7911w;
        w wVar = yVar.O;
        a1 a1Var = yVar.f7701r;
        r6.k.c(a1Var);
        p0 K0 = a1Var.K0();
        r6.k.c(K0);
        return wVar.e(this, K0, i7);
    }

    @Override // p1.e0
    public final int d0(int i7) {
        y yVar = this.f7911w;
        w wVar = yVar.O;
        a1 a1Var = yVar.f7701r;
        r6.k.c(a1Var);
        p0 K0 = a1Var.K0();
        r6.k.c(K0);
        return wVar.b(this, K0, i7);
    }

    @Override // p1.e0
    public final int e0(int i7) {
        y yVar = this.f7911w;
        w wVar = yVar.O;
        a1 a1Var = yVar.f7701r;
        r6.k.c(a1Var);
        p0 K0 = a1Var.K0();
        r6.k.c(K0);
        return wVar.i(this, K0, i7);
    }

    @Override // r1.o0
    public final int p0(p1.l lVar) {
        int c4 = f.c(this, lVar);
        this.f7875v.put(lVar, Integer.valueOf(c4));
        return c4;
    }
}
