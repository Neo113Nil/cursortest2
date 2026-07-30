package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ws2 extends z92 implements Function2 {
    public int n;
    public /* synthetic */ Object o;

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        ws2 ws2Var = new ws2(o30Var);
        ws2Var.o = obj;
        return ws2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ws2) create((ur2) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        b50 b50Var = b50.m;
        int i = this.n;
        if (i != 0) {
            if (i == 1) {
                ca2.b(obj);
                return obj;
            }
            lh.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ca2.b(obj);
        ur2 ur2Var = (ur2) this.o;
        this.n = 1;
        qd0 qd0Var = zs2.a;
        Object d = zs2.d(ur2Var, n22.n, this);
        return d == b50Var ? b50Var : d;
    }
}
