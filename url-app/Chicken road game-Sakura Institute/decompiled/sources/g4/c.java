package g4;

import com.android.installreferrer.api.InstallReferrerClient;
import d0.q1;
import d0.x3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c implements q6.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4257f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0 f4258g;

    public /* synthetic */ c(a0 a0Var, int i7) {
        this.f4257f = i7;
        this.f4258g = a0Var;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f4257f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g0.p pVar = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
                    pVar.L();
                } else {
                    a0 a0Var = this.f4258g;
                    q1.b(a0Var.f4246h, u3.q.j(a0Var.f4245g, pVar), null, 0L, pVar, 0);
                }
                break;
            default:
                g0.p pVar2 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar2.x()) {
                    pVar2.L();
                } else {
                    x3.b(u3.q.j(this.f4258g.f4245g, pVar2), null, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, pVar2, 0, 0, 131070);
                }
                break;
        }
        return d6.z.f2639a;
    }
}
