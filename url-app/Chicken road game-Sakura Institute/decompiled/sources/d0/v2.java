package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v2 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f2473g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b1.i f2474h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g0.m2 f2475i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g0.m2 f2476j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g0.m2 f2477k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g0.m2 f2478l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f2479m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f2480n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(long j8, b1.i iVar, l.f0 f0Var, l.f0 f0Var2, l.f0 f0Var3, l.f0 f0Var4, float f9, long j9) {
        super(1);
        this.f2473g = j8;
        this.f2474h = iVar;
        this.f2475i = f0Var;
        this.f2476j = f0Var2;
        this.f2477k = f0Var3;
        this.f2478l = f0Var4;
        this.f2479m = f9;
        this.f2480n = j9;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        float f9;
        b1.e eVar = (b1.e) obj;
        long j8 = this.f2473g;
        b1.i iVar = this.f2474h;
        b3.d(eVar, 0.0f, 360.0f, j8, iVar);
        float floatValue = (((Number) this.f2475i.getValue()).floatValue() * 216.0f) % 360.0f;
        float floatValue2 = ((Number) this.f2476j.getValue()).floatValue();
        g0.m2 m2Var = this.f2477k;
        float abs = Math.abs(floatValue2 - ((Number) m2Var.getValue()).floatValue());
        float floatValue3 = ((Number) m2Var.getValue()).floatValue() + ((Number) this.f2478l.getValue()).floatValue() + (floatValue - 90.0f);
        if (iVar.f1241c == 0) {
            f9 = 0.0f;
        } else {
            f9 = ((this.f2479m / (b3.f1863e / 2)) * 57.29578f) / 2.0f;
        }
        b3.d(eVar, floatValue3 + f9, Math.max(abs, 0.1f), this.f2480n, iVar);
        return d6.z.f2639a;
    }
}
