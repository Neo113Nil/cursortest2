package l;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r1 implements g0.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5630a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f5631b;

    public /* synthetic */ r1(p1 p1Var, int i7) {
        this.f5630a = i7;
        this.f5631b = p1Var;
    }

    @Override // g0.g0
    public final void a() {
        switch (this.f5630a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p1 p1Var = this.f5631b;
                p1Var.i();
                p1Var.f5610a.e();
                break;
            default:
                p1 p1Var2 = this.f5631b;
                p1Var2.i();
                p1Var2.f5610a.e();
                break;
        }
    }
}
