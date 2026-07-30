package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hc extends pr2 implements Function1 {
    public nd m;
    public y72 n;
    public int o;
    public final /* synthetic */ jc p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ bt2 r;
    public final /* synthetic */ long s;
    public final /* synthetic */ Function1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(jc jcVar, Object obj, bt2 bt2Var, long j, Function1 function1, o30 o30Var) {
        super(1, o30Var);
        this.p = jcVar;
        this.q = obj;
        this.r = bt2Var;
        this.s = j;
        this.t = function1;
    }

    @Override // defpackage.hn
    public final o30 create(o30 o30Var) {
        return new hc(this.p, this.q, this.r, this.s, this.t, o30Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((hc) create((o30) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        nd ndVar;
        y72 y72Var;
        bt2 bt2Var = this.r;
        b50 b50Var = b50.m;
        int i = this.o;
        int i2 = 1;
        jc jcVar = this.p;
        try {
            if (i == 0) {
                ca2.b(obj);
                jcVar.c.o = (sd) jcVar.a.a.invoke(this.q);
                jcVar.e.setValue(bt2Var.c);
                jcVar.d.setValue(Boolean.TRUE);
                nd ndVar2 = jcVar.c;
                nd ndVar3 = new nd(ndVar2.m, ndVar2.n.getValue(), yk3.A(ndVar2.o), ndVar2.p, Long.MIN_VALUE, ndVar2.r);
                y72 y72Var2 = new y72();
                long j = this.s;
                gc gcVar = new gc(jcVar, ndVar3, this.t, y72Var2, 0);
                this.m = ndVar3;
                this.n = y72Var2;
                this.o = 1;
                if (nk2.c(ndVar3, bt2Var, j, gcVar, this) == b50Var) {
                    return b50Var;
                }
                ndVar = ndVar3;
                y72Var = y72Var2;
            } else {
                if (i != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y72Var = this.n;
                ndVar = this.m;
                ca2.b(obj);
            }
            if (!y72Var.m) {
                i2 = 2;
            }
            jc.b(jcVar);
            return new kd(ndVar, i2);
        } catch (CancellationException e) {
            jc.b(jcVar);
            throw e;
        }
    }
}
