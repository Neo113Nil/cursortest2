package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ei0 extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public int n;
    public final /* synthetic */ q80 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ei0(q80 q80Var, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.o = q80Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        q80 q80Var = this.o;
        switch (i) {
            case 0:
                return new ei0(q80Var, o30Var, 0);
            case 1:
                return new ei0(q80Var, o30Var, 1);
            default:
                return new ei0(q80Var, o30Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a50 a50Var = (a50) obj;
        o30 o30Var = (o30) obj2;
        switch (this.m) {
        }
        return ((ei0) create(a50Var, o30Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        Object f;
        Object obj2;
        Object obj3;
        int i = this.m;
        q80 q80Var = this.o;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                int i2 = this.n;
                if (i2 == 0) {
                    ca2.b(obj);
                    int j = q80Var.j() + 1;
                    this.n = 1;
                    f = q80Var.f(j, bd3.G(7, null), this);
                    if (f == b50Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                }
                break;
            case 1:
                Object obj4 = b50.m;
                int i3 = this.n;
                if (i3 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    ky1 ky1Var = uy1.a;
                    if (q80Var.j() - 1 >= 0) {
                        obj2 = q80Var.f(q80Var.j() - 1, bd3.G(7, null), this);
                        if (obj2 != obj4) {
                            obj2 = Unit.a;
                        }
                    } else {
                        obj2 = Unit.a;
                    }
                    if (obj2 == obj4) {
                        break;
                    }
                } else if (i3 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                }
                break;
            default:
                Object obj5 = b50.m;
                int i4 = this.n;
                if (i4 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    ky1 ky1Var2 = uy1.a;
                    if (q80Var.j() + 1 < q80Var.m()) {
                        obj3 = q80Var.f(q80Var.j() + 1, bd3.G(7, null), this);
                        if (obj3 != obj5) {
                            obj3 = Unit.a;
                        }
                    } else {
                        obj3 = Unit.a;
                    }
                    if (obj3 == obj5) {
                        break;
                    }
                } else if (i4 != 1) {
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
