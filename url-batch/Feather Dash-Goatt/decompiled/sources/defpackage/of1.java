package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class of1 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ q7 e;

    public /* synthetic */ of1(q7 q7Var, int i) {
        this.d = i;
        this.e = q7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        q7 q7Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                q7Var.j = false;
                break;
            default:
                q7Var.j = false;
                break;
        }
        return Unit.a;
    }
}
