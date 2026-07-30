package p1;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u0 extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7089g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v0 f7090h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(v0 v0Var, int i7) {
        super(2);
        this.f7089g = i7;
        this.f7090h = v0Var;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f7089g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.f7090h.a().f7019g = (g0.r) obj2;
                break;
            case 1:
                b0 a3 = this.f7090h.a();
                ((r1.d0) obj).Y(new y(a3, (q6.e) obj2, a3.f7033u));
                break;
            default:
                r1.d0 d0Var = (r1.d0) obj;
                v0 v0Var = this.f7090h;
                y0 y0Var = v0Var.f7097a;
                b0 b0Var = d0Var.C;
                if (b0Var == null) {
                    b0Var = new b0(d0Var, y0Var);
                    d0Var.C = b0Var;
                }
                v0Var.f7098b = b0Var;
                v0Var.a().e();
                b0 a9 = v0Var.a();
                if (a9.f7020h != y0Var) {
                    a9.f7020h = y0Var;
                    a9.f(false);
                    r1.d0.T(a9.f7018f, false, 7);
                }
                break;
        }
        return d6.z.f2639a;
    }
}
