package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class kx implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ z30 j;

    public /* synthetic */ kx(Object obj, Object obj2, Object obj3, z30 z30Var, int i, int i2) {
        this.d = i2;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = z30Var;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        int i = this.d;
        int i2 = this.e;
        z30 z30Var = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Integer) obj2).getClass();
                uq1.k((w8) obj5, (u8) obj4, (z8) obj3, (Function0) z30Var, (hl) obj, gb0.P(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                mk0.b((mi) obj5, (y91) obj4, (fk1) obj3, (hk) z30Var, (hl) obj, gb0.P(i2 | 1));
                break;
        }
        return Unit.a;
    }
}
