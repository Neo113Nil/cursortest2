package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yu2 extends pr2 implements Function2 {
    public zn1 m;
    public int n;
    public final /* synthetic */ zn1 o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ bn1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu2(zn1 zn1Var, boolean z, bn1 bn1Var, o30 o30Var) {
        super(2, o30Var);
        this.o = zn1Var;
        this.p = z;
        this.q = bn1Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        return new yu2(this.o, this.p, this.q, o30Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((yu2) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        zn1 zn1Var;
        zn1 zn1Var2;
        b50 b50Var = b50.m;
        int i = this.n;
        if (i == 0) {
            ca2.b(obj);
            zn1Var = this.o;
            u42 u42Var = (u42) zn1Var.getValue();
            if (u42Var != null) {
                a41 v42Var = this.p ? new v42(u42Var) : new t42(u42Var);
                bn1 bn1Var = this.q;
                if (bn1Var != null) {
                    this.m = zn1Var;
                    this.n = 1;
                    if (bn1Var.b(v42Var, this) == b50Var) {
                        return b50Var;
                    }
                    zn1Var2 = zn1Var;
                }
                zn1Var.setValue(null);
            }
            return Unit.a;
        }
        if (i != 1) {
            lh.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        zn1Var2 = this.m;
        ca2.b(obj);
        zn1Var = zn1Var2;
        zn1Var.setValue(null);
        return Unit.a;
    }
}
