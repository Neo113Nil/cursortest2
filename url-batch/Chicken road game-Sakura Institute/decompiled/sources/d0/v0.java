package d0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v0 extends r6.l implements q6.f {

    /* renamed from: h, reason: collision with root package name */
    public static final v0 f2463h;

    /* renamed from: i, reason: collision with root package name */
    public static final v0 f2464i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2465g;

    static {
        int i7 = 3;
        f2463h = new v0(i7, 0);
        f2464i = new v0(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(int i7, int i8) {
        super(i7);
        this.f2465g = i8;
    }

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.f2465g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g0.p pVar = (g0.p) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && pVar.x()) {
                    pVar.L();
                }
                return d6.z.f2639a;
            default:
                p1.h0 h0Var = (p1.h0) obj;
                long j8 = ((m2.a) obj3).f6306a;
                int K = h0Var.K(b3.f1859a);
                int i7 = K * 2;
                p1.n0 b9 = ((p1.e0) obj2).b(r4.a.M(0, i7, j8));
                int i8 = b9.f7064g - i7;
                return h0Var.C(b9.f7063f, i8, e6.v.f2827f, new x2(b9, K));
        }
    }
}
