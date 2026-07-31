package t0;

import e2.InterfaceC0422a;

/* loaded from: classes.dex */
public final class a0 extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8690e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0 f8691f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ U.p f8692g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0991d f8693h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f8694i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f8695j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f8696k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f8697l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f8698m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(b0 b0Var, U.p pVar, C0991d c0991d, long j3, r rVar, boolean z3, boolean z4, float f3, int i3) {
        super(0);
        this.f8690e = i3;
        this.f8691f = b0Var;
        this.f8692g = pVar;
        this.f8693h = c0991d;
        this.f8694i = j3;
        this.f8695j = rVar;
        this.f8696k = z3;
        this.f8697l = z4;
        this.f8698m = f3;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f8690e) {
            case 0:
                U.p e3 = AbstractC0993f.e(this.f8692g, this.f8693h.a());
                boolean z3 = this.f8697l;
                b0 b0Var = this.f8691f;
                C0991d c0991d = this.f8693h;
                long j3 = this.f8694i;
                r rVar = this.f8695j;
                boolean z4 = this.f8696k;
                if (e3 == null) {
                    b0Var.P0(c0991d, j3, rVar, z4, z3);
                } else {
                    b0Var.getClass();
                    float f3 = this.f8698m;
                    rVar.c(e3, f3, z3, new a0(b0Var, e3, c0991d, j3, rVar, z4, z3, f3, 0));
                }
                break;
            default:
                this.f8691f.a1(AbstractC0993f.e(this.f8692g, this.f8693h.a()), this.f8693h, this.f8694i, this.f8695j, this.f8696k, this.f8697l, this.f8698m);
                break;
        }
        return R1.y.f4171a;
    }
}
