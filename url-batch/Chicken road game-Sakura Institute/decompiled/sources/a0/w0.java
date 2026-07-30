package a0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w0 extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f169g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0 f170h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(x0 x0Var, int i7) {
        super(0);
        this.f169g = i7;
        this.f170h = x0Var;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f169g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                x0 x0Var = this.f170h;
                x0Var.b(true);
                x0Var.k();
                break;
            case 1:
                x0 x0Var2 = this.f170h;
                x0Var2.d();
                x0Var2.k();
                break;
            case 2:
                x0 x0Var3 = this.f170h;
                x0Var3.l();
                x0Var3.k();
                break;
            case 3:
                this.f170h.m();
                break;
            case 4:
                this.f170h.l();
                break;
            case 5:
                this.f170h.f(true);
                break;
            case 6:
                this.f170h.b(true);
                break;
            default:
                this.f170h.d();
                break;
        }
        return Boolean.TRUE;
    }
}
