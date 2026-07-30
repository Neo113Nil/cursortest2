package s1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j1 extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f8247g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x3.e f8248h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f8249i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(boolean z8, x3.e eVar, String str) {
        super(0);
        this.f8247g = z8;
        this.f8248h = eVar;
        this.f8249i = str;
    }

    @Override // q6.a
    public final Object a() {
        if (this.f8247g) {
            x3.e eVar = this.f8248h;
            eVar.getClass();
            String str = this.f8249i;
            r6.k.f(str, "key");
            eVar.f9675a.g(str);
        }
        return d6.z.f2639a;
    }
}
