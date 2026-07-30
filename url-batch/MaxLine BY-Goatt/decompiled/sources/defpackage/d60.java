package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class d60 extends pr2 implements Function2 {
    public int m;
    public final /* synthetic */ lb2 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ Function1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d60(o30 o30Var, lb2 lb2Var, Function1 function1, boolean z, boolean z2) {
        super(2, o30Var);
        this.n = lb2Var;
        this.o = z;
        this.p = z2;
        this.q = function1;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        boolean z = this.p;
        return new d60(o30Var, this.n, this.q, this.o, z);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d60) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        b50 b50Var = b50.m;
        int i = this.m;
        if (i != 0) {
            if (i == 1) {
                ca2.b(obj);
                return obj;
            }
            lh.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ca2.b(obj);
        Function1 function1 = this.q;
        lb2 lb2Var = this.n;
        boolean z = this.p;
        boolean z2 = this.o;
        f60 f60Var = new f60(null, lb2Var, function1, z, z2);
        this.m = 1;
        Object i2 = lb2Var.i(z2, f60Var, this);
        return i2 == b50Var ? b50Var : i2;
    }
}
