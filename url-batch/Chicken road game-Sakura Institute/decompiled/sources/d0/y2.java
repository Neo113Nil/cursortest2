package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y2 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f2538g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2539h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(long j8, int i7) {
        super(1);
        this.f2538g = j8;
        this.f2539h = i7;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        b1.e eVar = (b1.e) obj;
        float min = Math.min(eVar.y(u2.f2458d), y0.f.b(eVar.d()));
        float b9 = (y0.f.b(eVar.d()) - min) / 2;
        long j8 = this.f2538g;
        if (this.f2539h == 1) {
            float f9 = min / 2.0f;
            b1.e.p(eVar, j8, f9, u3.r.a((y0.f.d(eVar.d()) - f9) - b9, y0.f.b(eVar.d()) / 2.0f), 120);
        } else {
            b1.e.t(eVar, j8, u3.r.a((y0.f.d(eVar.d()) - min) - b9, (y0.f.b(eVar.d()) - min) / 2.0f), v0.d.a(min, min), 120);
        }
        return d6.z.f2639a;
    }
}
