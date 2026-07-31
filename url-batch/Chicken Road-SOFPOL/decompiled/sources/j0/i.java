package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p6.e f3689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p6.e f3690e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.i0 f3691f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f3692g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f3693h;
    public final /* synthetic */ long i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f3694j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f3695k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p6.e f3696l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u0.c f3697m;

    public i(p6.e eVar, p6.e eVar2, f1.i0 i0Var, long j7, float f6, long j8, long j9, long j10, p6.e eVar3, u0.c cVar) {
        this.f3689d = eVar;
        this.f3690e = eVar2;
        this.f3691f = i0Var;
        this.f3692g = j7;
        this.f3693h = f6;
        this.i = j8;
        this.f3694j = j9;
        this.f3695k = j10;
        this.f3696l = eVar3;
        this.f3697m = cVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        m0.s sVar = (m0.s) obj;
        int intValue = ((Number) obj2).intValue();
        if (sVar.N(intValue & 1, (intValue & 3) != 2)) {
            j.a(u0.h.d(1367541877, new h(this.f3696l, this.f3697m, 1), sVar), null, this.f3689d, this.f3690e, this.f3691f, this.f3692g, this.f3693h, c0.d(l0.f.f4527a, sVar), this.i, this.f3694j, this.f3695k, sVar, 6);
        } else {
            sVar.Q();
        }
        return c6.m.f1757a;
    }
}
