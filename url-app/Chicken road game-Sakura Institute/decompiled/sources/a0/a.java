package a0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d6.e f5k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Object obj2, q6.e eVar, int i7, int i8) {
        super(2);
        this.f1g = i8;
        this.f3i = obj;
        this.f4j = obj2;
        this.f5k = eVar;
        this.f2h = i7;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f1g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Number) obj2).intValue();
                a.a.c((o) this.f3i, (s0.c) this.f4j, (o0.a) this.f5k, (g0.p) obj, g0.d.T(this.f2h | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                n.j jVar = (n.j) this.f3i;
                q6.a aVar = (q6.a) this.f4j;
                y yVar = (y) this.f5k;
                j1.c.D(jVar, aVar, s0.l.f8103a, yVar, (g0.p) obj, g0.d.T(this.f2h | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                n.k.c((p2.y) this.f3i, (q6.a) this.f4j, (y) this.f5k, (g0.p) obj, g0.d.T(this.f2h | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                o0.a aVar2 = (o0.a) this.f5k;
                int T = g0.d.T(this.f2h) | 1;
                aVar2.h(this.f3i, this.f4j, (g0.p) obj, T);
                break;
            case 4:
                ((Number) obj2).intValue();
                p0.g gVar = (p0.g) this.f3i;
                o0.a aVar3 = (o0.a) this.f5k;
                int T2 = g0.d.T(this.f2h | 1);
                gVar.e(this.f4j, aVar3, (g0.p) obj, T2);
                break;
            case 5:
                ((Number) obj2).intValue();
                p1.s0.b((p1.v0) this.f3i, (s0.o) this.f4j, (q6.e) this.f5k, (g0.p) obj, g0.d.T(this.f2h | 1));
                break;
            case 6:
                ((Number) obj2).intValue();
                a8.m.a((q6.a) this.f3i, (p2.r) this.f4j, (o0.a) this.f5k, (g0.p) obj, g0.d.T(this.f2h | 1));
                break;
            default:
                ((Number) obj2).intValue();
                s.g0 g0Var = (s.g0) this.f3i;
                o0.a aVar4 = (o0.a) this.f5k;
                int T3 = g0.d.T(this.f2h | 1);
                g0Var.e(this.f4j, aVar4, (g0.p) obj, T3);
                break;
        }
        return d6.z.f2639a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(n.j jVar, q6.a aVar, y yVar, int i7) {
        super(2);
        this.f1g = 1;
        this.f3i = jVar;
        this.f4j = aVar;
        this.f5k = yVar;
        this.f2h = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(o0.a aVar, Object obj, Object obj2, int i7) {
        super(2);
        this.f1g = 3;
        this.f5k = aVar;
        this.f3i = obj;
        this.f4j = obj2;
        this.f2h = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p2.y yVar, q6.a aVar, y yVar2, int i7) {
        super(2);
        this.f1g = 2;
        this.f3i = yVar;
        this.f4j = aVar;
        this.f5k = yVar2;
        this.f2h = i7;
    }
}
