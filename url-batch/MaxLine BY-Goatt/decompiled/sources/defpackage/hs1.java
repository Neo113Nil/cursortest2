package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hs1 extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ ks1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hs1(ks1 ks1Var, int i) {
        super(0);
        this.m = i;
        this.n = ks1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        ks1 ks1Var = this.n;
        switch (i) {
            case 0:
                ls lsVar = ks1Var.Q;
                lsVar.getClass();
                ks1Var.K0(lsVar, ks1Var.P);
                break;
            default:
                ks1 ks1Var2 = ks1Var.C;
                if (ks1Var2 != null) {
                    ks1Var2.X0();
                }
                break;
        }
        return Unit.a;
    }
}
