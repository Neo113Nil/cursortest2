package g0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i2 implements f7.g {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3754f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l1 f3755g;

    public /* synthetic */ i2(l1 l1Var, int i7) {
        this.f3754f = i7;
        this.f3755g = l1Var;
    }

    @Override // f7.g
    public final Object k(Object obj, h6.d dVar) {
        switch (this.f3754f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.f3755g.setValue(obj);
                break;
            case 1:
                this.f3755g.setValue(obj);
                break;
            case 2:
                this.f3755g.setValue(obj);
                break;
            default:
                this.f3755g.setValue(obj);
                break;
        }
        return d6.z.f2639a;
    }
}
