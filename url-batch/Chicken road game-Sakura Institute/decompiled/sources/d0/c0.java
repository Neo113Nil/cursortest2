package d0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c0 extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1872g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f1873h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1874i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1875j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(long j8, q.h0 h0Var, o0.a aVar) {
        super(2);
        this.f1873h = j8;
        this.f1874i = h0Var;
        this.f1875j = aVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f1872g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g0.p pVar = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
                    pVar.L();
                } else {
                    e0.a.a(this.f1873h, ((a4) pVar.k(b4.f1865a)).f1843m, o0.f.b(1327513942, new b0((q.h0) this.f1874i, 0, (o0.a) this.f1875j), pVar), pVar, 384);
                }
                break;
            default:
                ((Number) obj2).intValue();
                a0.o oVar = (a0.o) this.f1874i;
                s0.o oVar2 = (s0.o) this.f1875j;
                w.d.a(oVar, oVar2, this.f1873h, (g0.p) obj, g0.d.T(1));
                break;
        }
        return d6.z.f2639a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(a0.o oVar, s0.o oVar2, long j8, int i7) {
        super(2);
        this.f1874i = oVar;
        this.f1875j = oVar2;
        this.f1873h = j8;
    }
}
