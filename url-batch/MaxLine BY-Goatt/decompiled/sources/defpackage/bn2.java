package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bn2 extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ Function2 p;
    public final /* synthetic */ zn1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bn2(Function2 function2, zn1 zn1Var, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.p = function2;
        this.q = zn1Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        switch (this.m) {
            case 0:
                bn2 bn2Var = new bn2(this.p, this.q, o30Var, 0);
                bn2Var.o = obj;
                return bn2Var;
            default:
                bn2 bn2Var2 = new bn2(this.p, this.q, o30Var, 1);
                bn2Var2.o = obj;
                return bn2Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a50 a50Var = (a50) obj;
        o30 o30Var = (o30) obj2;
        switch (this.m) {
        }
        return ((bn2) create(a50Var, o30Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        int i = this.m;
        zn1 zn1Var = this.q;
        Function2 function2 = this.p;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                int i2 = this.n;
                if (i2 == 0) {
                    ca2.b(obj);
                    d52 d52Var = new d52(zn1Var, ((a50) this.o).n());
                    this.n = 1;
                    if (function2.invoke(d52Var, this) == b50Var) {
                        break;
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
                    d52 d52Var2 = new d52(zn1Var, ((a50) this.o).n());
                    this.n = 1;
                    if (function2.invoke(d52Var2, this) == b50Var2) {
                        break;
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
