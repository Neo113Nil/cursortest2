package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class x4 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ String n;

    public /* synthetic */ x4(String str) {
        this.m = 1;
        this.n = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        String str = this.n;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                iv1.d(str, (a00) obj, s03.R(1));
                break;
            case 1:
                a00 a00Var = (a00) obj;
                int intValue = ((Integer) obj2).intValue();
                if (a00Var.P(intValue & 1, (intValue & 3) != 2)) {
                    yv2.b(this.n, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, a00Var, 0, 0, 131070);
                } else {
                    a00Var.S();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                bd3.b(str, (a00) obj, s03.R(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                bd3.a(str, (a00) obj, s03.R(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                o70.l(str, (a00) obj, s03.R(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                tk3.r(str, (a00) obj, s03.R(1));
                break;
            default:
                ((Integer) obj2).getClass();
                zj2.c(str, (a00) obj, s03.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ x4(String str, int i, int i2) {
        this.m = i2;
        this.n = str;
    }
}
