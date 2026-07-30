package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class g40 implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ w8 e;
    public final /* synthetic */ z8 g;
    public final /* synthetic */ int h;

    public /* synthetic */ g40(w8 w8Var, z8 z8Var, int i, int i2) {
        this.d = i2;
        this.e = w8Var;
        this.g = z8Var;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        int i = this.d;
        int i2 = this.h;
        z8 z8Var = this.g;
        w8 w8Var = this.e;
        hl hlVar = (hl) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p4.g(w8Var, z8Var, hlVar, gb0.P(i2 | 1));
                break;
            case 1:
                p4.g(w8Var, z8Var, hlVar, gb0.P(i2 | 1));
                break;
            case 2:
                uq1.c(w8Var, z8Var, hlVar, gb0.P(i2 | 1));
                break;
            case 3:
                uq1.b(w8Var, z8Var, hlVar, gb0.P(i2 | 1));
                break;
            default:
                uq1.b(w8Var, z8Var, hlVar, gb0.P(i2 | 1));
                break;
        }
        return Unit.a;
    }
}
