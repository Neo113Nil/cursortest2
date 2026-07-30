package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l2 extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f2145g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p.j f2146h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t3 f2147i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z0.p0 f2148j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(boolean z8, p.j jVar, t3 t3Var, z0.p0 p0Var) {
        super(2);
        this.f2145g = z8;
        this.f2146h = jVar;
        this.f2147i = t3Var;
        this.f2148j = p0Var;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        g0.p pVar = (g0.p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
            pVar.L();
        } else {
            k2.f2128a.a(this.f2145g, this.f2146h, null, this.f2147i, this.f2148j, 0.0f, 0.0f, pVar, 100663296, 200);
        }
        return d6.z.f2639a;
    }
}
