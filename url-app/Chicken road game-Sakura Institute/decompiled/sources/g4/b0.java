package g4;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements q6.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4253f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g0.z0 f4254g;

    public /* synthetic */ b0(g0.z0 z0Var, int i7) {
        this.f4253f = i7;
        this.f4254g = z0Var;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f4253f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.f4254g.setValue(Boolean.FALSE);
                break;
            case 1:
                this.f4254g.setValue(Boolean.TRUE);
                break;
            case 2:
                this.f4254g.setValue(Boolean.FALSE);
                break;
            case 3:
                this.f4254g.setValue(Boolean.FALSE);
                break;
            case 4:
                this.f4254g.setValue(null);
                break;
            case 5:
                this.f4254g.setValue(Boolean.TRUE);
                break;
            default:
                this.f4254g.setValue(null);
                break;
        }
        return d6.z.f2639a;
    }
}
