package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class uq implements wn1 {
    public static final uq b = new uq(0);
    public final /* synthetic */ int a;

    public /* synthetic */ uq(int i) {
        this.a = i;
    }

    @Override // defpackage.wn1
    public final tn1 c(yg ygVar, bn0 bn0Var) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Class cls = ygVar.a;
                cls.getClass();
                return ca0.i(cls);
            default:
                return new a61();
        }
    }
}
