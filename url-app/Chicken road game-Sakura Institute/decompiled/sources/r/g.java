package r;

import com.android.installreferrer.api.InstallReferrerClient;
import d6.z;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7600g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f7601h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7602i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f7603j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i7, Object obj, h hVar) {
        super(2);
        this.f7601h = hVar;
        this.f7602i = i7;
        this.f7603j = obj;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f7600g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Number) obj2).intValue();
                int T = g0.d.T(1);
                this.f7601h.a(this.f7602i, this.f7603j, (g0.p) obj, T);
                break;
            default:
                g0.p pVar = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
                    pVar.L();
                } else {
                    this.f7601h.a(this.f7602i, this.f7603j, pVar, 0);
                }
                break;
        }
        return z.f2639a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, int i7, Object obj, int i8) {
        super(2);
        this.f7601h = hVar;
        this.f7602i = i7;
        this.f7603j = obj;
    }
}
