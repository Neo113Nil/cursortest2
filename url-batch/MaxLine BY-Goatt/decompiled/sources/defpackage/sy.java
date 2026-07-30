package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sy implements Function2 {
    public static final sy n = new sy(0);
    public static final sy o = new sy(1);
    public static final sy p = new sy(2);
    public final /* synthetic */ int m;

    public /* synthetic */ sy(int i) {
        this.m = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.m) {
            case 0:
                a00 a00Var = (a00) obj;
                int intValue = ((Number) obj2).intValue();
                if (!a00Var.P(intValue & 1, (intValue & 3) != 2)) {
                    a00Var.S();
                }
                return Unit.a;
            case 1:
                a00 a00Var2 = (a00) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (!a00Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    a00Var2.S();
                }
                return Unit.a;
            default:
                long j = ((aw) obj2).a;
                return j == 16 ? Boolean.FALSE : Integer.valueOf(ap.H(j));
        }
    }
}
