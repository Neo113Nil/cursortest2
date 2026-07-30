package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class xb1 implements d00 {
    public final /* synthetic */ int d;
    public final /* synthetic */ iz0 e;

    public /* synthetic */ xb1(iz0 iz0Var, int i) {
        this.d = i;
        this.e = iz0Var;
    }

    @Override // defpackage.d00
    public final Object e(Object obj, dn dnVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.e.setValue(obj);
                break;
            default:
                this.e.setValue(obj);
                break;
        }
        return Unit.a;
    }
}
