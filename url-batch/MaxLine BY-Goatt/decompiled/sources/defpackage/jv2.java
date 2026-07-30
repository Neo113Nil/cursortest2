package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jv2 extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ g30 n;
    public final /* synthetic */ gv2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jv2(g30 g30Var, gv2 gv2Var, int i) {
        super(0);
        this.m = i;
        this.n = g30Var;
        this.o = gv2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        d30 d30Var = d30.a;
        g30 g30Var = this.n;
        gv2 gv2Var = this.o;
        switch (i) {
            case 0:
                gv2Var.d();
                g30Var.a.setValue(d30Var);
                break;
            case 1:
                gv2Var.b(false);
                g30Var.a.setValue(d30Var);
                break;
            case 2:
                gv2Var.l();
                g30Var.a.setValue(d30Var);
                break;
            default:
                gv2Var.m();
                g30Var.a.setValue(d30Var);
                break;
        }
        return Unit.a;
    }
}
