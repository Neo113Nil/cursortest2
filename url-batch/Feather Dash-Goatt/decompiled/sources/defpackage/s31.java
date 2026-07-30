package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class s31 implements zs {
    public final /* synthetic */ int d;
    public final /* synthetic */ w31 e;

    public /* synthetic */ s31(w31 w31Var, int i) {
        this.d = i;
        this.e = w31Var;
    }

    @Override // defpackage.zs
    public final double b(double d) {
        int i = this.d;
        w31 w31Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return b11.a(w31Var.k.b(d), w31Var.e, w31Var.f);
            default:
                return w31Var.n.b(b11.a(d, w31Var.e, w31Var.f));
        }
    }
}
