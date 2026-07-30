package g4;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements q6.c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4336f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g0.z0 f4337g;

    public /* synthetic */ m(g0.z0 z0Var, int i7) {
        this.f4336f = i7;
        this.f4337g = z0Var;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        String str = (String) obj;
        switch (this.f4336f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r6.k.f(str, "it");
                this.f4337g.setValue(str);
                break;
            case 1:
                r6.k.f(str, "it");
                this.f4337g.setValue(str);
                break;
            case 2:
                r6.k.f(str, "it");
                this.f4337g.setValue(str);
                break;
            case 3:
                r6.k.f(str, "it");
                this.f4337g.setValue(str);
                break;
            default:
                r6.k.f(str, "it");
                this.f4337g.setValue(str);
                break;
        }
        return d6.z.f2639a;
    }
}
