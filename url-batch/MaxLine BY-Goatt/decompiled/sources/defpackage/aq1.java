package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class aq1 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ ez n;
    public final /* synthetic */ Function1 o;
    public final /* synthetic */ Function1 p;
    public final /* synthetic */ zn1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aq1(ez ezVar, Function1 function1, Function1 function12, zn1 zn1Var, int i) {
        super(1);
        this.m = i;
        this.n = ezVar;
        this.o = function1;
        this.p = function12;
        this.q = zn1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        Function1 function1 = this.o;
        Function1 function12 = this.p;
        zn1 zn1Var = this.q;
        ez ezVar = this.n;
        switch (i) {
            case 0:
                zc zcVar = (zc) obj;
                bl0 bl0Var = bl0.K;
                op1 op1Var = ((cp1) zcVar.c()).n;
                op1Var.getClass();
                dz dzVar = (dz) op1Var;
                if (((Boolean) ezVar.c.getValue()).booleanValue() || o70.j(zn1Var)) {
                    int i2 = op1.u;
                    for (op1 op1Var2 : aj2.c(dzVar, bl0Var)) {
                    }
                    return (ai0) function1.invoke(zcVar);
                }
                int i3 = op1.u;
                for (op1 op1Var3 : aj2.c(dzVar, bl0Var)) {
                }
                return (ai0) function12.invoke(zcVar);
            default:
                zc zcVar2 = (zc) obj;
                bl0 bl0Var2 = bl0.K;
                op1 op1Var4 = ((cp1) zcVar2.b()).n;
                op1Var4.getClass();
                dz dzVar2 = (dz) op1Var4;
                if (((Boolean) ezVar.c.getValue()).booleanValue() || o70.j(zn1Var)) {
                    int i4 = op1.u;
                    for (op1 op1Var5 : aj2.c(dzVar2, bl0Var2)) {
                    }
                    return (uj0) function1.invoke(zcVar2);
                }
                int i5 = op1.u;
                for (op1 op1Var6 : aj2.c(dzVar2, bl0Var2)) {
                }
                return (uj0) function12.invoke(zcVar2);
        }
    }
}
