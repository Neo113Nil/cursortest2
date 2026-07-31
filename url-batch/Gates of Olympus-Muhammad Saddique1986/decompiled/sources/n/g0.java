package n;

import e2.InterfaceC0426e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import q2.C0832t;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class g0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public y2.a f7131h;

    /* renamed from: i, reason: collision with root package name */
    public Object f7132i;

    /* renamed from: j, reason: collision with root package name */
    public Object f7133j;

    /* renamed from: k, reason: collision with root package name */
    public h0 f7134k;

    /* renamed from: l, reason: collision with root package name */
    public int f7135l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f7136m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e0 f7137n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h0 f7138o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ X1.i f7139p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f7140q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g0(e0 e0Var, h0 h0Var, InterfaceC0426e interfaceC0426e, Object obj, V1.d dVar) {
        super(2, dVar);
        this.f7137n = e0Var;
        this.f7138o = h0Var;
        this.f7139p = (X1.i) interfaceC0426e;
        this.f7140q = obj;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((g0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X1.i, e2.e] */
    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        g0 g0Var = new g0(this.f7137n, this.f7138o, this.f7139p, this.f7140q, dVar);
        g0Var.f7136m = obj;
        return g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6, types: [e2.e] */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // X1.a
    public final Object q(Object obj) {
        h0 h0Var;
        Object obj2;
        f0 f0Var;
        y2.a aVar;
        ?? r5;
        f0 f0Var2;
        h0 h0Var2;
        Throwable th;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        W1.a aVar2 = W1.a.f4608d;
        ?? r12 = this.f7135l;
        try {
            try {
                if (r12 == 0) {
                    R1.a.e(obj);
                    V1.g v3 = ((InterfaceC0835w) this.f7136m).q().v(C0832t.f7929e);
                    f2.j.c(v3);
                    f0 f0Var3 = new f0(this.f7137n, (q2.X) v3);
                    while (true) {
                        h0Var = this.f7138o;
                        AtomicReference atomicReference3 = h0Var.f7142a;
                        f0 f0Var4 = (f0) atomicReference3.get();
                        if (f0Var4 != null && f0Var3.f7128a.compareTo(f0Var4.f7128a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(f0Var4, f0Var3)) {
                            if (atomicReference3.get() != f0Var4) {
                                break;
                            }
                        }
                        if (f0Var4 != null) {
                            f0Var4.f7129b.a(new I.V("Mutation interrupted", 3));
                        }
                        this.f7136m = f0Var3;
                        y2.c cVar = h0Var.f7143b;
                        this.f7131h = cVar;
                        X1.i iVar = this.f7139p;
                        this.f7132i = iVar;
                        Object obj3 = this.f7140q;
                        this.f7133j = obj3;
                        this.f7134k = h0Var;
                        this.f7135l = 1;
                        if (cVar.c(null, this) == aVar2) {
                            return aVar2;
                        }
                        obj2 = obj3;
                        f0Var = f0Var3;
                        aVar = cVar;
                        r5 = iVar;
                    }
                } else {
                    if (r12 != 1) {
                        if (r12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h0Var2 = (h0) this.f7132i;
                        aVar = this.f7131h;
                        f0Var2 = (f0) this.f7136m;
                        try {
                            R1.a.e(obj);
                            atomicReference2 = h0Var2.f7142a;
                            while (!atomicReference2.compareAndSet(f0Var2, null) && atomicReference2.get() == f0Var2) {
                            }
                            ((y2.c) aVar).e(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = h0Var2.f7142a;
                            while (!atomicReference.compareAndSet(f0Var2, null)) {
                            }
                            throw th;
                        }
                    }
                    h0 h0Var3 = this.f7134k;
                    obj2 = this.f7133j;
                    InterfaceC0426e interfaceC0426e = (InterfaceC0426e) this.f7132i;
                    y2.a aVar3 = this.f7131h;
                    f0Var = (f0) this.f7136m;
                    R1.a.e(obj);
                    h0Var = h0Var3;
                    aVar = aVar3;
                    r5 = interfaceC0426e;
                }
                this.f7136m = f0Var;
                this.f7131h = aVar;
                this.f7132i = h0Var;
                this.f7133j = null;
                this.f7134k = null;
                this.f7135l = 2;
                Object h3 = r5.h(obj2, this);
                if (h3 == aVar2) {
                    return aVar2;
                }
                h0Var2 = h0Var;
                obj = h3;
                f0Var2 = f0Var;
                atomicReference2 = h0Var2.f7142a;
                while (!atomicReference2.compareAndSet(f0Var2, null)) {
                }
                ((y2.c) aVar).e(null);
                return obj;
            } catch (Throwable th3) {
                f0Var2 = f0Var;
                h0Var2 = h0Var;
                th = th3;
                atomicReference = h0Var2.f7142a;
                while (!atomicReference.compareAndSet(f0Var2, null) && atomicReference.get() == f0Var2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            ((y2.c) r12).e(null);
            throw th4;
        }
    }
}
