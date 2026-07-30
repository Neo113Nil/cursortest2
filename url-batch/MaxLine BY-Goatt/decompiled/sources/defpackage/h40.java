package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class h40 extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ gv2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h40(gv2 gv2Var, int i) {
        super(0);
        this.m = i;
        this.n = gv2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        gv2 gv2Var = this.n;
        switch (i) {
            case 0:
                gv2Var.l();
                break;
            case 1:
                gv2Var.f(true);
                break;
            case 2:
                gv2Var.b(true);
                break;
            case 3:
                gv2Var.d();
                break;
            case 4:
                gv2Var.b(true);
                gv2Var.k();
                break;
            case 5:
                gv2Var.d();
                gv2Var.k();
                break;
            case 6:
                gv2Var.l();
                gv2Var.k();
                break;
            default:
                gv2Var.m();
                break;
        }
        return Unit.a;
    }
}
