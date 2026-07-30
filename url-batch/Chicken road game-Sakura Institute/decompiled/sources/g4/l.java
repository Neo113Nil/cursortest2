package g4;

import com.android.installreferrer.api.InstallReferrerClient;
import d0.d3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l implements q6.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4331f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q6.a f4332g;

    public /* synthetic */ l(q6.a aVar, int i7) {
        this.f4331f = i7;
        this.f4332g = aVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f4331f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g0.p pVar = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
                    pVar.L();
                } else {
                    d3.e(this.f4332g, null, false, null, null, null, v.f4417e, pVar, 805306368, 510);
                }
                break;
            case 1:
                g0.p pVar2 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar2.x()) {
                    pVar2.L();
                } else {
                    d3.e(this.f4332g, null, false, null, null, null, v.f4413a, pVar2, 805306368, 510);
                }
                break;
            default:
                g0.p pVar3 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar3.x()) {
                    pVar3.L();
                } else {
                    d3.e(this.f4332g, null, false, null, null, null, v.f4414b, pVar3, 805306368, 510);
                }
                break;
        }
        return d6.z.f2639a;
    }
}
