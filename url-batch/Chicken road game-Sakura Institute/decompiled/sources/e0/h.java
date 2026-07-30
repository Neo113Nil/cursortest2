package e0;

import a2.k0;
import com.android.installreferrer.api.InstallReferrerClient;
import d6.z;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2683g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f2684h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k0 f2685i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q6.e f2686j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2687k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(long j8, k0 k0Var, q6.e eVar, int i7, int i8) {
        super(2);
        this.f2683g = i8;
        this.f2684h = j8;
        this.f2685i = k0Var;
        this.f2686j = eVar;
        this.f2687k = i7;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f2683g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Number) obj2).intValue();
                a.a(this.f2684h, this.f2685i, this.f2686j, (g0.p) obj, g0.d.T(this.f2687k | 1));
                break;
            default:
                ((Number) obj2).intValue();
                o.b(this.f2684h, this.f2685i, this.f2686j, (g0.p) obj, g0.d.T(this.f2687k | 1));
                break;
        }
        return z.f2639a;
    }
}
