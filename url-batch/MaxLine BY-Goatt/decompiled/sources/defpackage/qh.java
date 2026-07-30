package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class qh implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ vl1 n;

    public /* synthetic */ qh(vl1 vl1Var, int i, int i2) {
        this.m = i2;
        this.n = vl1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        a00 a00Var = (a00) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ap.a(this.n, a00Var, s03.R(1));
                break;
            case 1:
                ph2.b(this.n, a00Var, s03.R(1));
                break;
            default:
                yh2.b(this.n, a00Var, s03.R(1));
                break;
        }
        return Unit.a;
    }
}
