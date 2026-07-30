package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lo1 extends pr2 implements Function2 {
    public oo1 m;
    public Object n;
    public v80 o;
    public mo1 p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ ho1 s;
    public final /* synthetic */ mo1 t;
    public final /* synthetic */ ed u;
    public final /* synthetic */ v80 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo1(ho1 ho1Var, mo1 mo1Var, ed edVar, v80 v80Var, o30 o30Var) {
        super(2, o30Var);
        this.s = ho1Var;
        this.t = mo1Var;
        this.u = edVar;
        this.v = v80Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        lo1 lo1Var = new lo1(this.s, this.t, this.u, this.v, o30Var);
        lo1Var.r = obj;
        return lo1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((lo1) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, oo1] */
    /* JADX WARN: Type inference failed for: r5v7, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r6v5, types: [oo1] */
    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        jo1 jo1Var;
        mo1 mo1Var;
        qo1 qo1Var;
        ed edVar;
        v80 v80Var;
        mo1 mo1Var2;
        Throwable th;
        jo1 jo1Var2;
        oo1 oo1Var;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        b50 b50Var = b50.m;
        ?? r1 = this.q;
        try {
            try {
                if (r1 == 0) {
                    ca2.b(obj);
                    CoroutineContext.Element m = ((a50) this.r).n().m(qb2.U);
                    m.getClass();
                    jo1Var = new jo1(this.s, (g61) m);
                    mo1Var = this.t;
                    AtomicReference atomicReference3 = mo1Var.a;
                    while (true) {
                        jo1 jo1Var3 = (jo1) atomicReference3.get();
                        if (jo1Var3 != null && jo1Var.a.compareTo(jo1Var3.a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(jo1Var3, jo1Var)) {
                            if (atomicReference3.get() != jo1Var3) {
                                break;
                            }
                        }
                        if (jo1Var3 != null) {
                            jo1Var3.b.f(new io1("Mutation interrupted", 0));
                        }
                        qo1Var = mo1Var.b;
                        this.r = jo1Var;
                        this.m = qo1Var;
                        edVar = this.u;
                        this.n = edVar;
                        v80 v80Var2 = this.v;
                        this.o = v80Var2;
                        this.p = mo1Var;
                        this.q = 1;
                        if (qo1Var.f(this) != b50Var) {
                            v80Var = v80Var2;
                        }
                    }
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mo1Var2 = (mo1) this.n;
                        oo1Var = this.m;
                        jo1Var2 = (jo1) this.r;
                        try {
                            ca2.b(obj);
                            atomicReference2 = mo1Var2.a;
                            while (!atomicReference2.compareAndSet(jo1Var2, null) && atomicReference2.get() == jo1Var2) {
                            }
                            oo1Var.b(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = mo1Var2.a;
                            while (!atomicReference.compareAndSet(jo1Var2, null)) {
                            }
                            throw th;
                        }
                    }
                    mo1 mo1Var3 = this.p;
                    v80Var = this.o;
                    ?? r5 = (Function2) this.n;
                    ?? r6 = this.m;
                    jo1 jo1Var4 = (jo1) this.r;
                    ca2.b(obj);
                    edVar = r5;
                    qo1Var = r6;
                    mo1Var = mo1Var3;
                    jo1Var = jo1Var4;
                }
                this.r = jo1Var;
                this.m = qo1Var;
                this.n = mo1Var;
                this.o = null;
                this.p = null;
                this.q = 2;
                Object invoke = edVar.invoke(v80Var, this);
                if (invoke != b50Var) {
                    mo1Var2 = mo1Var;
                    obj = invoke;
                    jo1Var2 = jo1Var;
                    oo1Var = qo1Var;
                    atomicReference2 = mo1Var2.a;
                    while (!atomicReference2.compareAndSet(jo1Var2, null)) {
                    }
                    oo1Var.b(null);
                    return obj;
                }
                return b50Var;
            } catch (Throwable th3) {
                mo1Var2 = mo1Var;
                th = th3;
                jo1Var2 = jo1Var;
                atomicReference = mo1Var2.a;
                while (!atomicReference.compareAndSet(jo1Var2, null) && atomicReference.get() == jo1Var2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r1.b(null);
            throw th4;
        }
    }
}
