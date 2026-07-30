package d0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n0 extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2200g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f2201h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2202i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2203j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2204k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2205l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n0(String str, boolean z8, n.a aVar, q6.a aVar2, int i7) {
        super(2);
        this.f2203j = str;
        this.f2201h = z8;
        this.f2204k = aVar;
        this.f2205l = (r6.l) aVar2;
        this.f2202i = i7;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [q6.a, r6.l] */
    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f2200g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Number) obj2).intValue();
                z1.a aVar = (z1.a) this.f2203j;
                s0.o oVar = (s0.o) this.f2204k;
                j0 j0Var = (j0) this.f2205l;
                p0.b(this.f2201h, aVar, oVar, j0Var, (g0.p) obj, g0.d.T(this.f2202i | 1));
                break;
            default:
                ((Number) obj2).intValue();
                String str = (String) this.f2203j;
                n.a aVar2 = (n.a) this.f2204k;
                ?? r42 = (r6.l) this.f2205l;
                n.k.b(str, this.f2201h, aVar2, r42, (g0.p) obj, g0.d.T(this.f2202i | 1));
                break;
        }
        return d6.z.f2639a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(boolean z8, z1.a aVar, s0.o oVar, j0 j0Var, int i7) {
        super(2);
        this.f2201h = z8;
        this.f2203j = aVar;
        this.f2204k = oVar;
        this.f2205l = j0Var;
        this.f2202i = i7;
    }
}
