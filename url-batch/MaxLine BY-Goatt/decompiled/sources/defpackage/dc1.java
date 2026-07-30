package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dc1 extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dc1(Object obj, int i, o30 o30Var, int i2) {
        super(2, o30Var);
        this.m = i2;
        this.p = obj;
        this.o = i;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        int i2 = this.o;
        Object obj2 = this.p;
        switch (i) {
            case 0:
                return new dc1((ec1) obj2, i2, o30Var, 0);
            default:
                return new dc1((q80) obj2, i2, o30Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.m) {
            case 0:
                return ((dc1) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            default:
                return ((dc1) create((ff2) obj, (o30) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        int i = this.m;
        int i2 = this.o;
        Object obj2 = this.p;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                int i3 = this.n;
                if (i3 == 0) {
                    ca2.b(obj);
                    zb1 zb1Var = ((ec1) obj2).B;
                    this.n = 1;
                    if (zb1Var.d(i2, this) == b50Var) {
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
                q80 q80Var = (q80) obj2;
                b50 b50Var2 = b50.m;
                int i4 = this.n;
                if (i4 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    Object i5 = q80Var.v.i(this);
                    if (i5 != b50Var2) {
                        i5 = Unit.a;
                    }
                    if (i5 == b50Var2) {
                        break;
                    }
                } else if (i4 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                }
                int i6 = q80Var.i(i2);
                my1 my1Var = q80Var.c;
                ((iz1) my1Var.o).i(i6);
                ((pb1) my1Var.r).a(i6);
                ((hz1) my1Var.p).i(0.0f);
                my1Var.q = null;
                i91 i91Var = (i91) q80Var.w.getValue();
                if (i91Var != null) {
                    i91Var.k();
                }
                break;
        }
        return Unit.a;
    }
}
