package g0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3812b;

    public /* synthetic */ o(int i7, Object obj) {
        this.f3811a = i7;
        this.f3812b = obj;
    }

    public final void a() {
        switch (this.f3811a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p pVar = (p) this.f3812b;
                pVar.f3845z--;
                break;
            default:
                q0.s sVar = (q0.s) this.f3812b;
                sVar.f7451j--;
                break;
        }
    }

    public final void b() {
        switch (this.f3811a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((p) this.f3812b).f3845z++;
                break;
            default:
                ((q0.s) this.f3812b).f7451j++;
                break;
        }
    }
}
