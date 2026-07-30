package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class a60 extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ Function1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a60(Function1 function1, o30 o30Var) {
        super(2, o30Var);
        this.m = 2;
        this.p = function1;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        Function1 function1 = this.p;
        switch (i) {
            case 0:
                a60 a60Var = new a60(o30Var, function1, 0);
                a60Var.o = obj;
                return a60Var;
            case 1:
                a60 a60Var2 = new a60(o30Var, function1, 1);
                a60Var2.o = obj;
                return a60Var2;
            default:
                a60 a60Var3 = new a60(function1, o30Var);
                a60Var3.o = obj;
                return a60Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.m) {
            case 0:
                return ((a60) create((d32) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((a60) create((d32) obj, (o30) obj2)).invokeSuspend(Unit.a);
            default:
                return ((a60) create((x22) obj, (o30) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        int i = this.m;
        Function1 function1 = this.p;
        o30 o30Var = null;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
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
                this.n = 1;
                Object invoke = function1.invoke(this);
                return invoke == b50Var ? b50Var : invoke;
            case 1:
                b50 b50Var2 = b50.m;
                int i3 = this.n;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ca2.b(obj);
                        return obj;
                    }
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca2.b(obj);
                this.n = 1;
                Object invoke2 = function1.invoke(this);
                return invoke2 == b50Var2 ? b50Var2 : invoke2;
            default:
                b50 b50Var3 = b50.m;
                int i4 = this.n;
                if (i4 == 0) {
                    ca2.b(obj);
                    x22 x22Var = (x22) this.o;
                    p9 p9Var = new p9(2, o30Var, function1);
                    this.n = 1;
                    if (((vr2) x22Var).G0(p9Var, this) == b50Var3) {
                        return b50Var3;
                    }
                } else {
                    if (i4 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a60(o30 o30Var, Function1 function1, int i) {
        super(2, o30Var);
        this.m = i;
        this.p = function1;
    }
}
