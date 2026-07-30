package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z2 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2557g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f2558h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q6.a f2559i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f2560j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f2561k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q6.c f2562l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(int i7, float f9, q6.a aVar, long j8, long j9, q6.c cVar) {
        super(1);
        this.f2557g = i7;
        this.f2558h = f9;
        this.f2559i = aVar;
        this.f2560j = j8;
        this.f2561k = j9;
        this.f2562l = cVar;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        b1.e eVar = (b1.e) obj;
        float b9 = y0.f.b(eVar.d());
        int i7 = this.f2557g;
        float f9 = this.f2558h;
        if (i7 != 0 && y0.f.b(eVar.d()) <= y0.f.d(eVar.d())) {
            f9 += eVar.l0(b9);
        }
        float l02 = f9 / eVar.l0(y0.f.d(eVar.d()));
        float floatValue = ((Number) this.f2559i.a()).floatValue();
        float min = Math.min(floatValue, l02) + floatValue;
        if (min <= 1.0f) {
            b3.c(eVar, min, 1.0f, this.f2560j, b9, this.f2557g);
        }
        b3.c(eVar, 0.0f, floatValue, this.f2561k, b9, this.f2557g);
        this.f2562l.f(eVar);
        return d6.z.f2639a;
    }
}
