package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class n extends pc0 implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, Object obj) {
        super(2);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        int i = this.d;
        Object obj3 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                hl hlVar = (hl) obj;
                int intValue = ((Number) obj2).intValue();
                if (hlVar.O(intValue & 1, (intValue & 3) != 2)) {
                    ((o) obj3).a(0, hlVar);
                } else {
                    hlVar.R();
                }
                return Unit.a;
            case 1:
                ((z4) obj3).l(((Number) obj).intValue(), (l81) obj2);
                return Unit.a;
            case 2:
                ((Number) obj2).intValue();
                ((zk) obj3).a(gb0.P(1), (hl) obj);
                return Unit.a;
            default:
                am0 am0Var = (am0) obj;
                yl0 yl0Var = (yl0) obj2;
                if (!(yl0Var instanceof al)) {
                    return am0Var.c(yl0Var);
                }
                tj1.b(3, null);
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(zk zkVar, int i) {
        super(2);
        this.d = 2;
        this.e = zkVar;
    }
}
