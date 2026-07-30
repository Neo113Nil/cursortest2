package m;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f1 extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6155g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g1 f6156h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(g1 g1Var, int i7) {
        super(0);
        this.f6155g = i7;
        this.f6156h = g1Var;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f6155g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Boolean.valueOf(this.f6156h.f6159a.e() > 0);
            default:
                g1 g1Var = this.f6156h;
                return Boolean.valueOf(g1Var.f6159a.e() < g1Var.f6162d.e());
        }
    }
}
