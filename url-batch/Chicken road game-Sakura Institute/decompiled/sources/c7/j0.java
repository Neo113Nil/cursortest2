package c7;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j0 extends b1 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1708j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f1709k;

    public /* synthetic */ j0(int i7, Object obj) {
        this.f1708j = i7;
        this.f1709k = obj;
    }

    @Override // c7.b1
    public final boolean k() {
        switch (this.f1708j) {
        }
        return false;
    }

    @Override // c7.b1
    public final void l(Throwable th) {
        switch (this.f1708j) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((i0) this.f1709k).a();
                break;
            case 1:
                ((q6.c) this.f1709k).f(th);
                break;
            default:
                c1 c1Var = (c1) this.f1709k;
                Object obj = f1.f1692f.get(j());
                if (!(obj instanceof p)) {
                    c1Var.resumeWith(a0.v(obj));
                    break;
                } else {
                    c1Var.resumeWith(d6.a.b(((p) obj).f1725a));
                    break;
                }
        }
    }
}
