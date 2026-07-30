package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class v60 extends pr2 implements xt0 {
    public final /* synthetic */ int m = 1;
    public int n;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v60(i70 i70Var, o30 o30Var) {
        super(3, o30Var);
        this.o = i70Var;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        switch (this.m) {
            case 0:
                return new v60((i70) this.o, (o30) obj3).invokeSuspend(Unit.a);
            default:
                ((Boolean) obj2).getClass();
                v60 v60Var = new v60(3, (o30) obj3);
                v60Var.o = (al0) obj;
                return v60Var.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        switch (this.m) {
            case 0:
                b50 b50Var = b50.m;
                int i = this.n;
                if (i == 0) {
                    ca2.b(obj);
                    i70 i70Var = (i70) this.o;
                    this.n = 1;
                    if (i70.b(i70Var, this) == b50Var) {
                        return b50Var;
                    }
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            default:
                b50 b50Var2 = b50.m;
                int i2 = this.n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ca2.b(obj);
                        return obj;
                    }
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca2.b(obj);
                al0 al0Var = (al0) this.o;
                this.n = 1;
                al0Var.getClass();
                Object a = al0.a(al0Var, this);
                return a == b50Var2 ? b50Var2 : a;
        }
    }

    public /* synthetic */ v60(int i, o30 o30Var) {
        super(i, o30Var);
    }
}
