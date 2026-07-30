package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class st0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ z8 e;

    public /* synthetic */ st0(z8 z8Var, int i) {
        this.d = i;
        this.e = z8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        r8 r8Var = r8.a;
        z8 z8Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                z8Var.t(ds.EASY);
                break;
            case 1:
                z8Var.t(ds.NORMAL);
                break;
            case 2:
                z8Var.t(ds.HARD);
                break;
            case 3:
                z8Var.n(r8Var);
                break;
            case 4:
                z8Var.n(t8.a);
                break;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                z8Var.n(q8.a);
                break;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                z8Var.n(r8Var);
                break;
            default:
                z8Var.n(o8.a);
                break;
        }
        return Unit.a;
    }
}
