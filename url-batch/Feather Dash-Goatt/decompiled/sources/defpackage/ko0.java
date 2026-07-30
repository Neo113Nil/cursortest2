package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ko0 extends sf1 implements Function2 {
    public oo0 i;
    public Object j;
    public pq k;
    public lo0 l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ go0 o;
    public final /* synthetic */ lo0 p;
    public final /* synthetic */ f q;
    public final /* synthetic */ pq r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko0(go0 go0Var, lo0 lo0Var, f fVar, pq pqVar, dn dnVar) {
        super(2, dnVar);
        this.o = go0Var;
        this.p = lo0Var;
        this.q = fVar;
        this.r = pqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        return ((ko0) h((dn) obj2, (sn) obj)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        ko0 ko0Var = new ko0(this.o, this.p, this.q, this.r, dnVar);
        ko0Var.n = obj;
        return ko0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, oo0] */
    /* JADX WARN: Type inference failed for: r5v7, types: [kotlin.jvm.functions.Function2] */
    @Override // defpackage.yc
    public final Object k(Object obj) {
        io0 io0Var;
        lo0 lo0Var;
        oo0 oo0Var;
        f fVar;
        pq pqVar;
        lo0 lo0Var2;
        Throwable th;
        io0 io0Var2;
        oo0 oo0Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        tn tnVar = tn.d;
        ?? r1 = this.m;
        try {
            try {
                if (r1 == 0) {
                    ca0.v(obj);
                    CoroutineContext.Element d = ((sn) this.n).f().d(j41.m);
                    d.getClass();
                    io0Var = new io0(this.o, (jb0) d);
                    lo0Var = this.p;
                    AtomicReference atomicReference3 = lo0Var.a;
                    while (true) {
                        io0 io0Var3 = (io0) atomicReference3.get();
                        if (io0Var3 != null && io0Var.a.compareTo(io0Var3.a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(io0Var3, io0Var)) {
                            if (atomicReference3.get() != io0Var3) {
                                break;
                            }
                        }
                        if (io0Var3 != null) {
                            io0Var3.b.a(new xz("Mutation interrupted", 0));
                        }
                        oo0Var = lo0Var.b;
                        this.n = io0Var;
                        this.i = oo0Var;
                        fVar = this.q;
                        this.j = fVar;
                        pq pqVar2 = this.r;
                        this.k = pqVar2;
                        this.l = lo0Var;
                        this.m = 1;
                        if (oo0Var.e(this) != tnVar) {
                            pqVar = pqVar2;
                        }
                    }
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        lo0Var2 = (lo0) this.j;
                        oo0Var2 = this.i;
                        io0Var2 = (io0) this.n;
                        try {
                            ca0.v(obj);
                            atomicReference2 = lo0Var2.a;
                            while (!atomicReference2.compareAndSet(io0Var2, null) && atomicReference2.get() == io0Var2) {
                            }
                            oo0Var2.h(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = lo0Var2.a;
                            while (!atomicReference.compareAndSet(io0Var2, null)) {
                            }
                            throw th;
                        }
                    }
                    lo0 lo0Var3 = this.l;
                    pqVar = this.k;
                    ?? r5 = (Function2) this.j;
                    oo0 oo0Var3 = this.i;
                    io0 io0Var4 = (io0) this.n;
                    ca0.v(obj);
                    fVar = r5;
                    oo0Var = oo0Var3;
                    lo0Var = lo0Var3;
                    io0Var = io0Var4;
                }
                this.n = io0Var;
                this.i = oo0Var;
                this.j = lo0Var;
                this.k = null;
                this.l = null;
                this.m = 2;
                Object b = fVar.b(pqVar, this);
                if (b != tnVar) {
                    lo0Var2 = lo0Var;
                    obj = b;
                    io0Var2 = io0Var;
                    oo0Var2 = oo0Var;
                    atomicReference2 = lo0Var2.a;
                    while (!atomicReference2.compareAndSet(io0Var2, null)) {
                    }
                    oo0Var2.h(null);
                    return obj;
                }
                return tnVar;
            } catch (Throwable th3) {
                lo0Var2 = lo0Var;
                th = th3;
                io0Var2 = io0Var;
                atomicReference = lo0Var2.a;
                while (!atomicReference.compareAndSet(io0Var2, null) && atomicReference.get() == io0Var2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r1.h(null);
            throw th4;
        }
    }
}
