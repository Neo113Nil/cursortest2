package w;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k0 extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9280g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0 f9281h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(n0 n0Var, int i7) {
        super(0);
        this.f9280g = i7;
        this.f9281h = n0Var;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f9280g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.f9281h.a();
                break;
            default:
                this.f9281h.onCancel();
                break;
        }
        return d6.z.f2639a;
    }
}
