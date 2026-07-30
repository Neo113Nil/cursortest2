package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class y extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public int n;
    public final /* synthetic */ nu o;
    public final /* synthetic */ u42 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(nu nuVar, u42 u42Var, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.o = nuVar;
        this.p = u42Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        u42 u42Var = this.p;
        nu nuVar = this.o;
        switch (i) {
            case 0:
                return new y(nuVar, u42Var, o30Var, 0);
            default:
                return new y(nuVar, u42Var, o30Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a50 a50Var = (a50) obj;
        o30 o30Var = (o30) obj2;
        switch (this.m) {
        }
        return ((y) create(a50Var, o30Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        int i = this.m;
        u42 u42Var = this.p;
        nu nuVar = this.o;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                int i2 = this.n;
                if (i2 == 0) {
                    ca2.b(obj);
                    bn1 bn1Var = nuVar.C;
                    if (bn1Var != null) {
                        this.n = 1;
                        if (bn1Var.b(u42Var, this) == b50Var) {
                            break;
                        }
                    }
                } else if (i2 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                }
                break;
            default:
                b50 b50Var2 = b50.m;
                int i3 = this.n;
                if (i3 == 0) {
                    ca2.b(obj);
                    bn1 bn1Var2 = nuVar.C;
                    if (bn1Var2 != null) {
                        v42 v42Var = new v42(u42Var);
                        this.n = 1;
                        if (bn1Var2.b(v42Var, this) == b50Var2) {
                            break;
                        }
                    }
                } else if (i3 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                }
                break;
        }
        return Unit.a;
    }
}
