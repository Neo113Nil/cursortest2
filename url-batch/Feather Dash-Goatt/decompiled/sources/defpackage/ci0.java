package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ci0 implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ci0(int i, int i2, Function0 function0, boolean z) {
        this.e = z;
        this.g = i;
        this.i = function0;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Integer) obj2).getClass();
                int P = gb0.P(this.g | 1);
                la0.j(this.e, (am0) this.i, (hl) obj, P, this.h);
                break;
            default:
                Function0 function0 = (Function0) this.i;
                ((Integer) obj2).getClass();
                int P2 = gb0.P(this.h | 1);
                uq1.p(this.g, P2, (hl) obj, function0, this.e);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ci0(boolean z, am0 am0Var, int i, int i2) {
        this.e = z;
        this.i = am0Var;
        this.g = i;
        this.h = i2;
    }
}
