package d0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2134g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d6.e f2135h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2136i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2137j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2138k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2139l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Object obj2, Object obj3, o0.a aVar, int i7, int i8) {
        super(2);
        this.f2134g = i8;
        this.f2137j = obj;
        this.f2138k = obj2;
        this.f2139l = obj3;
        this.f2135h = aVar;
        this.f2136i = i7;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f2134g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Number) obj2).intValue();
                m.d((q6.a) this.f2137j, (s0.o) this.f2138k, (p2.r) this.f2139l, (o0.a) this.f2135h, (g0.p) obj, g0.d.T(this.f2136i | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                s1.a((q0) this.f2137j, (n3) this.f2138k, (a4) this.f2139l, (o0.a) this.f2135h, (g0.p) obj, g0.d.T(this.f2136i | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                j1.c.D((n.j) this.f2139l, (q6.a) this.f2137j, (s0.o) this.f2138k, (a0.y) this.f2135h, (g0.p) obj, g0.d.T(this.f2136i | 1));
                break;
            default:
                ((Number) obj2).intValue();
                n.k.d((p2.y) this.f2138k, (q6.a) this.f2137j, (n.a) this.f2139l, (a0.y) this.f2135h, (g0.p) obj, g0.d.T(this.f2136i | 1));
                break;
        }
        return d6.z.f2639a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n.j jVar, q6.a aVar, s0.o oVar, a0.y yVar, int i7) {
        super(2);
        this.f2134g = 2;
        this.f2139l = jVar;
        this.f2137j = aVar;
        this.f2138k = oVar;
        this.f2135h = yVar;
        this.f2136i = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p2.y yVar, q6.a aVar, n.a aVar2, a0.y yVar2, int i7) {
        super(2);
        this.f2134g = 3;
        this.f2138k = yVar;
        this.f2137j = aVar;
        this.f2139l = aVar2;
        this.f2135h = yVar2;
        this.f2136i = i7;
    }
}
