package p2;

import com.android.installreferrer.api.InstallReferrerClient;
import g0.z0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7123g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z0 f7124h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(z0 z0Var, int i7) {
        super(2);
        this.f7123g = i7;
        this.f7124h = z0Var;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        int i7 = this.f7123g;
        d6.z zVar = d6.z.f2639a;
        z0 z0Var = this.f7124h;
        int i8 = 0;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g0.p pVar = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar.x()) {
                    ((q6.e) z0Var.getValue()).d(pVar, 0);
                    break;
                } else {
                    pVar.L();
                    break;
                }
            case 1:
                g0.p pVar2 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar2.x()) {
                    a8.m.e(y1.k.a(s0.l.f8103a, false, b.f7116h), o0.f.b(-533674951, new c(z0Var, i8), pVar2), pVar2, 48);
                    break;
                } else {
                    pVar2.L();
                    break;
                }
            default:
                g0.p pVar3 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar3.x()) {
                    g0.z zVar2 = l.f7153a;
                    ((q6.e) z0Var.getValue()).d(pVar3, 0);
                    break;
                } else {
                    pVar3.L();
                    break;
                }
                break;
        }
        return zVar;
    }
}
