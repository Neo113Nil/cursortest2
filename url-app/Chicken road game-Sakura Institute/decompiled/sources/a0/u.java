package a0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f155g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f156h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f157i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s0 f158j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f159k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p pVar, int i7, int i8, s0 s0Var, d6.g gVar) {
        super(0);
        this.f155g = pVar;
        this.f156h = i7;
        this.f157i = i8;
        this.f158j = s0Var;
        this.f159k = gVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [d6.g, java.lang.Object] */
    @Override // q6.a
    public final Object a() {
        p pVar = this.f155g;
        a2.h0 h0Var = (a2.h0) pVar.f121e;
        int intValue = ((Number) this.f159k.getValue()).intValue();
        s0 s0Var = this.f158j;
        boolean z8 = s0Var.f136b;
        boolean z9 = s0Var.e() == 1;
        int i7 = this.f156h;
        long k8 = h0Var.k(i7);
        int i8 = a2.j0.f407c;
        int i9 = (int) (k8 >> 32);
        int e9 = h0Var.e(i9);
        int i10 = h0Var.f389b.f429f;
        if (e9 != intValue) {
            i9 = intValue >= i10 ? h0Var.h(i10 - 1) : h0Var.h(intValue);
        }
        int i11 = (int) (k8 & 4294967295L);
        if (h0Var.e(i11) != intValue) {
            i11 = intValue >= i10 ? h0Var.d(i10 - 1, false) : h0Var.d(intValue, false);
        }
        int i12 = this.f157i;
        if (i9 == i12) {
            return pVar.a(i11);
        }
        if (i11 == i12) {
            return pVar.a(i9);
        }
        if (!(z8 ^ z9) ? i7 >= i9 : i7 > i11) {
            i9 = i11;
        }
        return pVar.a(i9);
    }
}
