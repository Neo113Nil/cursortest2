package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class aa implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ zw0 e;

    public /* synthetic */ aa(zw0 zw0Var, int i) {
        this.d = i;
        this.e = zw0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        zw0 zw0Var = this.e;
        yw0 yw0Var = (yw0) obj;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                yw0.n(yw0Var, zw0Var, 0, 0);
                break;
            case 1:
                yw0.n(yw0Var, zw0Var, 0, 0);
                break;
            case 2:
                yw0.n(yw0Var, zw0Var, 0, 0);
                break;
            case 3:
                yw0.h(yw0Var, zw0Var, 0, 0);
                break;
            case 4:
                yw0.n(yw0Var, zw0Var, 0, 0);
                break;
            default:
                yw0.h(yw0Var, zw0Var, 0, 0);
                break;
        }
        return Unit.a;
    }
}
