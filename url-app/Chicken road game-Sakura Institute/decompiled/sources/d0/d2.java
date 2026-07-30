package d0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d2 extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1903g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q6.a f1904h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f1905i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o0.a f1906j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1907k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1908l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d6.e f1909m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1910n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(n.j jVar, q6.a aVar, a0.y yVar, s0.o oVar, boolean z8, o0.a aVar2, int i7) {
        super(2);
        this.f1908l = jVar;
        this.f1904h = aVar;
        this.f1909m = yVar;
        this.f1910n = oVar;
        this.f1905i = z8;
        this.f1906j = aVar2;
        this.f1907k = i7;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f1903g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Number) obj2).intValue();
                o0.a aVar = (o0.a) this.f1908l;
                o0.a aVar2 = (o0.a) this.f1909m;
                q6.e eVar = (q6.e) this.f1910n;
                g2.c(this.f1906j, aVar, aVar2, eVar, this.f1905i, this.f1904h, (g0.p) obj, g0.d.T(this.f1907k | 1));
                break;
            default:
                ((Number) obj2).intValue();
                n.j jVar = (n.j) this.f1908l;
                a0.y yVar = (a0.y) this.f1909m;
                s0.o oVar = (s0.o) this.f1910n;
                j1.c.E(jVar, this.f1904h, yVar, oVar, this.f1905i, this.f1906j, (g0.p) obj, g0.d.T(this.f1907k | 1));
                break;
        }
        return d6.z.f2639a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(o0.a aVar, o0.a aVar2, o0.a aVar3, q6.e eVar, boolean z8, q6.a aVar4, int i7) {
        super(2);
        this.f1906j = aVar;
        this.f1908l = aVar2;
        this.f1909m = aVar3;
        this.f1910n = eVar;
        this.f1905i = z8;
        this.f1904h = aVar4;
        this.f1907k = i7;
    }
}
