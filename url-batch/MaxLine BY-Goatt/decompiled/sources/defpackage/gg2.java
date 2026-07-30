package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gg2 extends pr2 implements xt0 {
    public final /* synthetic */ int m;
    public int n;
    public /* synthetic */ ym0 o;
    public /* synthetic */ Object p;
    public final /* synthetic */ ig2 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gg2(o30 o30Var, ig2 ig2Var, int i) {
        super(3, o30Var);
        this.m = i;
        this.q = ig2Var;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i = this.m;
        ig2 ig2Var = this.q;
        ym0 ym0Var = (ym0) obj;
        o30 o30Var = (o30) obj3;
        switch (i) {
            case 0:
                gg2 gg2Var = new gg2(o30Var, ig2Var, 0);
                gg2Var.o = ym0Var;
                gg2Var.p = obj2;
                return gg2Var.invokeSuspend(Unit.a);
            default:
                gg2 gg2Var2 = new gg2(o30Var, ig2Var, 1);
                gg2Var2.o = ym0Var;
                gg2Var2.p = obj2;
                return gg2Var2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        int i = this.m;
        ig2 ig2Var = this.q;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                int i2 = this.n;
                if (i2 == 0) {
                    ca2.b(obj);
                    ym0 ym0Var = this.o;
                    String str = (String) this.p;
                    xm0 x60Var = up2.y(str) ? new x60(1, ah0.m) : ig2Var.b.f(str);
                    this.o = null;
                    this.p = null;
                    this.n = 1;
                    if (iv1.v(ym0Var, x60Var, this) == b50Var) {
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
                    ym0 ym0Var2 = this.o;
                    String str2 = (String) this.p;
                    xm0 x60Var2 = up2.y(str2) ? new x60(1, ah0.m) : ig2Var.b.g(str2);
                    this.o = null;
                    this.p = null;
                    this.n = 1;
                    if (iv1.v(ym0Var2, x60Var2, this) == b50Var2) {
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
