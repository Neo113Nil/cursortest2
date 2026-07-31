package t;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m0 extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public i7.a f6804h;
    public Object i;

    /* renamed from: j, reason: collision with root package name */
    public u.j f6805j;

    /* renamed from: k, reason: collision with root package name */
    public n0 f6806k;

    /* renamed from: l, reason: collision with root package name */
    public int f6807l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f6808m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j0 f6809n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n0 f6810o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ b0.c f6811p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ u.j f6812q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(j0 j0Var, n0 n0Var, b0.c cVar, u.j jVar, g6.c cVar2) {
        super(2, cVar2);
        this.f6809n = j0Var;
        this.f6810o = n0Var;
        this.f6811p = cVar;
        this.f6812q = jVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        return ((m0) l((g6.c) obj2, (a7.u) obj)).p(c6.m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        m0 m0Var = new m0(this.f6809n, this.f6810o, this.f6811p, this.f6812q, cVar);
        m0Var.f6808m = obj;
        return m0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [p6.e] */
    /* JADX WARN: Type inference failed for: r6v5, types: [i7.a] */
    @Override // i6.a
    public final Object p(Object obj) {
        i7.c cVar;
        b0.c cVar2;
        u.j jVar;
        l0 l0Var;
        n0 n0Var;
        l0 l0Var2;
        i7.a aVar;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        int i = this.f6807l;
        h6.a aVar2 = h6.a.f3204d;
        try {
            try {
                if (i == 0) {
                    s6.a.K(obj);
                    g6.f l3 = ((a7.u) this.f6808m).h().l(a7.r.f297e);
                    q6.i.b(l3);
                    l0 l0Var3 = new l0(this.f6809n, (a7.s0) l3);
                    n0 n0Var2 = this.f6810o;
                    AtomicReference atomicReference3 = n0Var2.f6822a;
                    while (true) {
                        l0 l0Var4 = (l0) atomicReference3.get();
                        if (l0Var4 != null && l0Var3.f6802a.compareTo(l0Var4.f6802a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(l0Var4, l0Var3)) {
                            if (atomicReference3.get() != l0Var4) {
                                break;
                            }
                        }
                        if (l0Var4 != null) {
                            l0Var4.f6803b.a(new k0("Mutation interrupted", 2));
                        }
                        cVar = n0Var2.f6823b;
                        this.f6808m = l0Var3;
                        this.f6804h = cVar;
                        cVar2 = this.f6811p;
                        this.i = cVar2;
                        u.j jVar2 = this.f6812q;
                        this.f6805j = jVar2;
                        this.f6806k = n0Var2;
                        this.f6807l = 1;
                        if (cVar.d(this) != aVar2) {
                            jVar = jVar2;
                            l0Var = l0Var3;
                            n0Var = n0Var2;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        n0Var = (n0) this.i;
                        aVar = this.f6804h;
                        l0Var2 = (l0) this.f6808m;
                        try {
                            s6.a.K(obj);
                            atomicReference2 = n0Var.f6822a;
                            while (!atomicReference2.compareAndSet(l0Var2, null) && atomicReference2.get() == l0Var2) {
                            }
                            ((i7.c) aVar).f(null);
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            atomicReference = n0Var.f6822a;
                            while (!atomicReference.compareAndSet(l0Var2, null)) {
                            }
                            throw th;
                        }
                    }
                    n0Var = this.f6806k;
                    jVar = this.f6805j;
                    ?? r52 = (p6.e) this.i;
                    ?? r62 = this.f6804h;
                    l0Var = (l0) this.f6808m;
                    s6.a.K(obj);
                    cVar2 = r52;
                    cVar = r62;
                }
                this.f6808m = l0Var;
                this.f6804h = cVar;
                this.i = n0Var;
                this.f6805j = null;
                this.f6806k = null;
                this.f6807l = 2;
                obj = cVar2.g(jVar, this);
                if (obj != aVar2) {
                    aVar = cVar;
                    l0Var2 = l0Var;
                    atomicReference2 = n0Var.f6822a;
                    while (!atomicReference2.compareAndSet(l0Var2, null)) {
                    }
                    ((i7.c) aVar).f(null);
                    return obj;
                }
                return aVar2;
            } catch (Throwable th2) {
                th = th2;
                l0Var2 = l0Var;
                atomicReference = n0Var.f6822a;
                while (!atomicReference.compareAndSet(l0Var2, null) && atomicReference.get() == l0Var2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            ((i7.c) 2).f(null);
            throw th3;
        }
    }
}
