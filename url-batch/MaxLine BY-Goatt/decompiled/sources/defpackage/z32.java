package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class z32 extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ Function2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z32(Function2 function2, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.p = function2;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        Function2 function2 = this.p;
        switch (i) {
            case 0:
                z32 z32Var = new z32(function2, o30Var, 0);
                z32Var.o = obj;
                return z32Var;
            default:
                z32 z32Var2 = new z32(function2, o30Var, 1);
                z32Var2.o = obj;
                return z32Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        d42 d42Var = (d42) obj;
        o30 o30Var = (o30) obj2;
        switch (this.m) {
        }
        return ((z32) create(d42Var, o30Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        int i = this.m;
        Function2 function2 = this.p;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                int i2 = this.n;
                if (i2 == 0) {
                    ca2.b(obj);
                    d42 d42Var = (d42) this.o;
                    this.n = 1;
                    obj = function2.invoke(d42Var, this);
                    if (obj == b50Var) {
                        return b50Var;
                    }
                } else {
                    if (i2 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                d42 d42Var2 = (d42) obj;
                d42Var2.getClass();
                ((AtomicBoolean) ((on1) d42Var2).b.n).set(true);
                return d42Var2;
            default:
                b50 b50Var2 = b50.m;
                int i3 = this.n;
                if (i3 == 0) {
                    ca2.b(obj);
                    on1 on1Var = new on1(new LinkedHashMap(((d42) this.o).a()), false);
                    this.o = on1Var;
                    this.n = 1;
                    return function2.invoke(on1Var, this) == b50Var2 ? b50Var2 : on1Var;
                }
                if (i3 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                on1 on1Var2 = (on1) this.o;
                ca2.b(obj);
                return on1Var2;
        }
    }
}
