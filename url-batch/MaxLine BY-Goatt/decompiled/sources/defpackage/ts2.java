package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ts2 extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public int n;
    public final /* synthetic */ xt0 o;
    public final /* synthetic */ s42 p;
    public final /* synthetic */ t22 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ts2(xt0 xt0Var, s42 s42Var, t22 t22Var, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.o = xt0Var;
        this.p = s42Var;
        this.q = t22Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        switch (this.m) {
            case 0:
                return new ts2(this.o, this.p, this.q, o30Var, 0);
            case 1:
                return new ts2(this.o, this.p, this.q, o30Var, 1);
            default:
                return new ts2(this.o, this.p, this.q, o30Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a50 a50Var = (a50) obj;
        o30 o30Var = (o30) obj2;
        switch (this.m) {
        }
        return ((ts2) create(a50Var, o30Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        int i = this.m;
        t22 t22Var = this.q;
        s42 s42Var = this.p;
        xt0 xt0Var = this.o;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                int i2 = this.n;
                if (i2 == 0) {
                    ca2.b(obj);
                    au1 au1Var = new au1(t22Var.c);
                    this.n = 1;
                    if (xt0Var.a(s42Var, au1Var, this) == b50Var) {
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
                b50 b50Var2 = b50.m;
                int i3 = this.n;
                if (i3 == 0) {
                    ca2.b(obj);
                    au1 au1Var2 = new au1(t22Var.c);
                    this.n = 1;
                    if (xt0Var.a(s42Var, au1Var2, this) == b50Var2) {
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
                b50 b50Var3 = b50.m;
                int i4 = this.n;
                if (i4 == 0) {
                    ca2.b(obj);
                    au1 au1Var3 = new au1(t22Var.c);
                    this.n = 1;
                    if (xt0Var.a(s42Var, au1Var3, this) == b50Var3) {
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
