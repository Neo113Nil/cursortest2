package w;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u0 extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9442g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0 f9443h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(x0 x0Var, int i7) {
        super(0);
        this.f9442g = i7;
        this.f9443h = x0Var;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f9442g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Boolean.valueOf(this.f9443h.f9455a.e() > 0.0f);
            default:
                x0 x0Var = this.f9443h;
                return Boolean.valueOf(x0Var.f9455a.e() < x0Var.f9456b.e());
        }
    }
}
