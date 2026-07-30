package g4;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements q6.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4259f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j0 f4260g;

    public /* synthetic */ c0(j0 j0Var, int i7) {
        this.f4259f = i7;
        this.f4260g = j0Var;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f4259f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                j0 j0Var = this.f4260g;
                c7.a0.p(androidx.lifecycle.q0.j(j0Var), null, null, new h0(j0Var, null, 0), 3);
                break;
            default:
                j0 j0Var2 = this.f4260g;
                c7.a0.p(androidx.lifecycle.q0.j(j0Var2), null, null, new h0(j0Var2, null, 1), 3);
                break;
        }
        return d6.z.f2639a;
    }
}
