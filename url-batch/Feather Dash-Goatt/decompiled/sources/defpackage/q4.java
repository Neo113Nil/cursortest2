package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class q4 extends pc0 implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ z30 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(d4 d4Var, s6 s6Var, Function2 function2) {
        super(2);
        this.d = 0;
        this.e = d4Var;
        this.g = s6Var;
        this.h = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        int i = this.d;
        z30 z30Var = this.h;
        Object obj3 = this.g;
        Object obj4 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                hl hlVar = (hl) obj;
                int intValue = ((Number) obj2).intValue();
                if (hlVar.O(intValue & 1, (intValue & 3) != 2)) {
                    yl.a((d4) obj4, (s6) obj3, (Function2) z30Var, hlVar, 0);
                } else {
                    hlVar.R();
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                m90.a((Function1) obj4, (am0) obj3, (Function1) z30Var, (hl) obj, gb0.P(433));
                break;
            case 2:
                ((Number) obj2).intValue();
                yl.a((eu0) obj4, (s6) obj3, (Function2) z30Var, (hl) obj, gb0.P(1));
                break;
            default:
                ((Number) obj2).intValue();
                la0.p((df1) obj4, (am0) obj3, (Function2) z30Var, (hl) obj, gb0.P(9));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q4(Object obj, Object obj2, z30 z30Var, int i, int i2) {
        super(2);
        this.d = i2;
        this.e = obj;
        this.g = obj2;
        this.h = z30Var;
    }
}
