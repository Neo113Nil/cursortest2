package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a2 extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v1 f1820g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f1821h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f1822i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q6.e f1823j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(v1 v1Var, boolean z8, boolean z9, q6.e eVar) {
        super(2);
        this.f1820g = v1Var;
        this.f1821h = z8;
        this.f1822i = z9;
        this.f1823j = eVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        g0.p pVar = (g0.p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
            pVar.L();
        } else {
            a2.k0 a3 = b4.a(f0.l.f2965h, pVar);
            boolean z8 = this.f1822i;
            v1 v1Var = this.f1820g;
            e0.a.a(((z0.u) k.n0.a(!z8 ? v1Var.f2472g : this.f1821h ? v1Var.f2467b : v1Var.f2470e, l.e.l(150, 6, null), pVar, 48).getValue()).f10059a, a3, this.f1823j, pVar, 0);
        }
        return d6.z.f2639a;
    }
}
