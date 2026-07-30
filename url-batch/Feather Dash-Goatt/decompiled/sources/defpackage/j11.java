package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class j11 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ o11 e;

    public /* synthetic */ j11(o11 o11Var, int i) {
        this.d = i;
        this.e = o11Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        o11 o11Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                o11Var.E();
                break;
            default:
                o11Var.E();
                break;
        }
        return Unit.a;
    }
}
