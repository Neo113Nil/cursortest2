package b;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1132g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0 f1133h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(i0 i0Var, int i7) {
        super(0);
        this.f1132g = i7;
        this.f1133h = i0Var;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f1132g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.f1133h.c();
                break;
            case 1:
                this.f1133h.b();
                break;
            default:
                this.f1133h.c();
                break;
        }
        return d6.z.f2639a;
    }
}
