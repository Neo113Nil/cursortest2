package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class rt0 implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ z8 e;
    public final /* synthetic */ int g;

    public /* synthetic */ rt0(z8 z8Var, int i, int i2) {
        this.d = i2;
        this.e = z8Var;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        int i = this.d;
        int i2 = this.g;
        z8 z8Var = this.e;
        hl hlVar = (hl) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                uq1.l(z8Var, hlVar, gb0.P(i2 | 1));
                break;
            case 1:
                uq1.e(z8Var, hlVar, gb0.P(i2 | 1));
                break;
            default:
                uq1.n(z8Var, hlVar, gb0.P(i2 | 1));
                break;
        }
        return Unit.a;
    }
}
