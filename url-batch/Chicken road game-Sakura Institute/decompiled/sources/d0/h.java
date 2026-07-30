package d0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1996g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q6.e f1997h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o0.a f1998i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(q6.e eVar, o0.a aVar, int i7) {
        super(2);
        this.f1996g = i7;
        this.f1997h = eVar;
        this.f1998i = aVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        int i7 = this.f1996g;
        d6.z zVar = d6.z.f2639a;
        int i8 = 0;
        o0.a aVar = this.f1998i;
        q6.e eVar = this.f1997h;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g0.p pVar = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar.x()) {
                    pVar.Q(1497073862);
                    if (eVar != null) {
                        eVar.d(pVar, 0);
                    }
                    pVar.p(false);
                    aVar.d(pVar, 0);
                    break;
                } else {
                    pVar.L();
                    break;
                }
                break;
            default:
                g0.p pVar2 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar2.x()) {
                    float f9 = m.f2155a;
                    m.b(o0.f.b(1887135077, new h(eVar, aVar, i8), pVar2), pVar2, 438);
                    break;
                } else {
                    pVar2.L();
                    break;
                }
        }
        return zVar;
    }
}
