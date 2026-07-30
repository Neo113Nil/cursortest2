package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class t90 extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ u90 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t90(u90 u90Var, int i) {
        super(0);
        this.m = i;
        this.n = u90Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        u90 u90Var = this.n;
        switch (i) {
            case 0:
                return l41.i;
            default:
                va2 va2Var = (va2) tk3.J(u90Var, za2.b);
                bb2 bb2Var = u90Var.G;
                if (va2Var == null) {
                    if (bb2Var != null) {
                        u90Var.H0(bb2Var);
                    }
                } else if (bb2Var == null) {
                    s90 s90Var = new s90(0, u90Var);
                    t90 t90Var = new t90(u90Var, 0);
                    b41 b41Var = u90Var.C;
                    boolean z = u90Var.D;
                    float f = u90Var.E;
                    h03 h03Var = ab2.a;
                    bb2 zwVar = eb2.a ? new zw(b41Var, z, f, s90Var, t90Var) : new gb(b41Var, z, f, s90Var, t90Var);
                    u90Var.G0(zwVar);
                    u90Var.G = zwVar;
                }
                return Unit.a;
        }
    }
}
