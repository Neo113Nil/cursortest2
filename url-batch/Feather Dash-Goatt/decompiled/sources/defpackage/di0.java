package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class di0 implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ am0 e;

    public /* synthetic */ di0(int i, int i2, am0 am0Var) {
        this.d = i2;
        this.e = am0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        int i = this.d;
        hl hlVar = (hl) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                la0.n(this.e, hlVar, gb0.P(1));
                break;
            case 1:
                la0.k(this.e, hlVar, gb0.P(7));
                break;
            default:
                op.i(this.e, hlVar, gb0.P(1));
                break;
        }
        return Unit.a;
    }
}
