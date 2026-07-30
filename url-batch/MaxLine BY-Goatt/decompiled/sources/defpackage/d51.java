package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class d51 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ my n;

    public /* synthetic */ d51(my myVar, int i, int i2) {
        this.m = i2;
        this.n = myVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        my myVar = this.n;
        a00 a00Var = (a00) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                o70.a(myVar, a00Var, s03.R(7));
                break;
            default:
                yh2.a(myVar, a00Var, s03.R(7));
                break;
        }
        return Unit.a;
    }
}
