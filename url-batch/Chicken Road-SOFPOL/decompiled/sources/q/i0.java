package q;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i0 extends q6.j implements p6.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u1.l0 f5850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f5851f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f5852g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b1.f f5853h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(u1.l0 l0Var, long j7, long j8, b1.f fVar) {
        super(1);
        this.f5850e = l0Var;
        this.f5851f = j7;
        this.f5852g = j8;
        this.f5853h = fVar;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        u1.k0 k0Var = (u1.k0) obj;
        long j7 = this.f5851f;
        long j8 = this.f5852g;
        k0Var.getClass();
        u1.l0 l0Var = this.f5850e;
        u1.k0.a(k0Var, l0Var);
        l0Var.U(r2.i.c(((((int) (j7 >> 32)) + ((int) (j8 >> 32))) << 32) | ((((int) (j7 & 4294967295L)) + ((int) (j8 & 4294967295L))) & 4294967295L), l0Var.f7234h), 0.0f, this.f5853h);
        return c6.m.f1757a;
    }
}
