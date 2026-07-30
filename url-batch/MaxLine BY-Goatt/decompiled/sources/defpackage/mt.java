package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mt extends pr2 implements Function2 {
    public final /* synthetic */ int m = 0;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ pt p;
    public final /* synthetic */ ym0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt(pt ptVar, ym0 ym0Var, Object obj, o30 o30Var) {
        super(2, o30Var);
        this.p = ptVar;
        this.q = ym0Var;
        this.o = obj;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        ym0 ym0Var = this.q;
        pt ptVar = this.p;
        switch (i) {
            case 0:
                return new mt(ptVar, ym0Var, this.o, o30Var);
            default:
                mt mtVar = new mt(ptVar, ym0Var, o30Var);
                mtVar.o = obj;
                return mtVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a50 a50Var = (a50) obj;
        o30 o30Var = (o30) obj2;
        switch (this.m) {
        }
        return ((mt) create(a50Var, o30Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        switch (this.m) {
            case 0:
                b50 b50Var = b50.m;
                int i = this.n;
                if (i == 0) {
                    ca2.b(obj);
                    xt0 xt0Var = this.p.q;
                    Object obj2 = this.o;
                    this.n = 1;
                    if (xt0Var.a(this.q, obj2, this) == b50Var) {
                        break;
                    }
                } else if (i != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                }
                break;
            default:
                b50 b50Var2 = b50.m;
                int i2 = this.n;
                if (i2 == 0) {
                    ca2.b(obj);
                    a50 a50Var = (a50) this.o;
                    c82 c82Var = new c82();
                    pt ptVar = this.p;
                    xm0 xm0Var = ptVar.p;
                    ot otVar = new ot(c82Var, a50Var, ptVar, this.q, 0);
                    this.n = 1;
                    if (xm0Var.a(otVar, this) == b50Var2) {
                        break;
                    }
                } else if (i2 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt(pt ptVar, ym0 ym0Var, o30 o30Var) {
        super(2, o30Var);
        this.p = ptVar;
        this.q = ym0Var;
    }
}
