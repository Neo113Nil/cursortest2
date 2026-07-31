package n;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import k2.C0547t;
import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class Z extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public s2.a f6041e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6042f;

    /* renamed from: g, reason: collision with root package name */
    public Object f6043g;

    /* renamed from: h, reason: collision with root package name */
    public a0 f6044h;

    /* renamed from: i, reason: collision with root package name */
    public int f6045i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f6046j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ X f6047k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a0 f6048l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ R1.i f6049m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f6050n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Z(X x3, a0 a0Var, Y1.e eVar, Object obj, P1.d dVar) {
        super(2, dVar);
        this.f6047k = x3;
        this.f6048l = a0Var;
        this.f6049m = (R1.i) eVar;
        this.f6050n = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [R1.i, Y1.e] */
    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        Z z3 = new Z(this.f6047k, this.f6048l, this.f6049m, this.f6050n, dVar);
        z3.f6046j = obj;
        return z3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((Z) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6, types: [Y1.e] */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        a0 a0Var;
        Object obj2;
        Y y3;
        s2.a aVar;
        ?? r5;
        Y y4;
        a0 a0Var2;
        Throwable th;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Q1.a aVar2 = Q1.a.f3113d;
        ?? r12 = this.f6045i;
        try {
            try {
                if (r12 == 0) {
                    I2.l.Q(obj);
                    P1.g k3 = ((InterfaceC0550w) this.f6046j).u().k(C0547t.f5390e);
                    Z1.i.c(k3);
                    Y y5 = new Y(this.f6047k, (k2.X) k3);
                    while (true) {
                        a0Var = this.f6048l;
                        AtomicReference atomicReference3 = a0Var.f6054a;
                        Y y6 = (Y) atomicReference3.get();
                        if (y6 != null && y5.f6039a.compareTo(y6.f6039a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(y6, y5)) {
                            if (atomicReference3.get() != y6) {
                                break;
                            }
                        }
                        if (y6 != null) {
                            y6.f6040b.a(new I.W("Mutation interrupted", 3));
                        }
                        this.f6046j = y5;
                        s2.c cVar = a0Var.f6055b;
                        this.f6041e = cVar;
                        R1.i iVar = this.f6049m;
                        this.f6042f = iVar;
                        Object obj3 = this.f6050n;
                        this.f6043g = obj3;
                        this.f6044h = a0Var;
                        this.f6045i = 1;
                        if (cVar.c(null, this) == aVar2) {
                            return aVar2;
                        }
                        obj2 = obj3;
                        y3 = y5;
                        aVar = cVar;
                        r5 = iVar;
                    }
                } else {
                    if (r12 != 1) {
                        if (r12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a0Var2 = (a0) this.f6042f;
                        aVar = this.f6041e;
                        y4 = (Y) this.f6046j;
                        try {
                            I2.l.Q(obj);
                            atomicReference2 = a0Var2.f6054a;
                            while (!atomicReference2.compareAndSet(y4, null) && atomicReference2.get() == y4) {
                            }
                            ((s2.c) aVar).e(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = a0Var2.f6054a;
                            while (!atomicReference.compareAndSet(y4, null)) {
                            }
                            throw th;
                        }
                    }
                    a0 a0Var3 = this.f6044h;
                    obj2 = this.f6043g;
                    Y1.e eVar = (Y1.e) this.f6042f;
                    s2.a aVar3 = this.f6041e;
                    y3 = (Y) this.f6046j;
                    I2.l.Q(obj);
                    a0Var = a0Var3;
                    aVar = aVar3;
                    r5 = eVar;
                }
                this.f6046j = y3;
                this.f6041e = aVar;
                this.f6042f = a0Var;
                this.f6043g = null;
                this.f6044h = null;
                this.f6045i = 2;
                Object g3 = r5.g(obj2, this);
                if (g3 == aVar2) {
                    return aVar2;
                }
                a0Var2 = a0Var;
                obj = g3;
                y4 = y3;
                atomicReference2 = a0Var2.f6054a;
                while (!atomicReference2.compareAndSet(y4, null)) {
                }
                ((s2.c) aVar).e(null);
                return obj;
            } catch (Throwable th3) {
                y4 = y3;
                a0Var2 = a0Var;
                th = th3;
                atomicReference = a0Var2.f6054a;
                while (!atomicReference.compareAndSet(y4, null) && atomicReference.get() == y4) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            ((s2.c) r12).e(null);
            throw th4;
        }
    }
}
