package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class f5 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ sh1 n;

    public /* synthetic */ f5(sh1 sh1Var, int i) {
        this.m = i;
        this.n = sh1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        sh1 sh1Var = this.n;
        switch (i) {
            case 0:
                d2.a();
                d2.a();
                i12 i12Var = new i12();
                i12Var.a = y3.a;
                d2.a();
                i12Var.a = z3.a;
                sh1Var.b(i12Var);
                break;
            default:
                sh1Var.b("application/json");
                break;
        }
        return Unit.a;
    }
}
