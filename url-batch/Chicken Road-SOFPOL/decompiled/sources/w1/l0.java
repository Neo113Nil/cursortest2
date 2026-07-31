package w1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l0 extends q6.j implements p6.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0 f7708e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f7709f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f7710g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o1 f7711h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, long j7, long j8, o1 o1Var) {
        super(0);
        this.f7708e = n0Var;
        this.f7709f = j7;
        this.f7710g = j8;
        this.f7711h = o1Var;
    }

    @Override // p6.a
    public final Object b() {
        n0 n0Var = this.f7708e;
        n0Var.p0().f7702d = false;
        n0Var.p0().f7703e = this.f7709f;
        n0Var.p0().f7704f = this.f7710g;
        p6.c d8 = this.f7711h.f7743d.d();
        if (d8 != null) {
            d8.i(n0Var.p0());
        }
        return c6.m.f1757a;
    }
}
