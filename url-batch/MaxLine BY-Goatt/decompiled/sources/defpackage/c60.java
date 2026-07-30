package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class c60 extends pr2 implements Function1 {
    public final /* synthetic */ int m = 1;
    public int n;
    public Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c60(lb2 lb2Var, Function1 function1, o30 o30Var) {
        super(1, o30Var);
        this.o = lb2Var;
        this.p = function1;
    }

    @Override // defpackage.hn
    public final o30 create(o30 o30Var) {
        int i = this.m;
        Object obj = this.p;
        switch (i) {
            case 0:
                return new c60((lb2) this.o, (Function1) obj, o30Var);
            default:
                return new c60((i70) obj, o30Var);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        o30 o30Var = (o30) obj;
        switch (this.m) {
        }
        return ((c60) create(o30Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        qo2 qo2Var;
        int i = this.m;
        Object obj2 = this.p;
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
                lb2 lb2Var = (lb2) this.o;
                b60 b60Var = new b60(lb2Var, null, (Function1) obj2, 0);
                this.n = 1;
                Object i3 = lb2Var.i(false, b60Var, this);
                return i3 == b50Var ? b50Var : i3;
            default:
                i70 i70Var = (i70) obj2;
                b50 b50Var2 = b50.m;
                int i4 = this.n;
                try {
                } catch (Throwable th2) {
                    ll2 h = i70Var.h();
                    this.o = th2;
                    this.n = 2;
                    Integer a = h.a();
                    if (a != b50Var2) {
                        obj = a;
                        th = th2;
                    }
                }
                if (i4 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    obj = i70.g(i70Var, true, this);
                    if (obj == b50Var2) {
                        return b50Var2;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = (Throwable) this.o;
                        ca2.b(obj);
                        qo2Var = new g62(th, ((Number) obj).intValue());
                        return new Pair(qo2Var, Boolean.TRUE);
                    }
                    ca2.b(obj);
                }
                qo2Var = (qo2) obj;
                return new Pair(qo2Var, Boolean.TRUE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c60(i70 i70Var, o30 o30Var) {
        super(1, o30Var);
        this.p = i70Var;
    }
}
