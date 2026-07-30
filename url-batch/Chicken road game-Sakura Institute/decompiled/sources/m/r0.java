package m;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r0 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public k7.a f6241g;

    /* renamed from: h, reason: collision with root package name */
    public Object f6242h;

    /* renamed from: i, reason: collision with root package name */
    public Object f6243i;

    /* renamed from: j, reason: collision with root package name */
    public s0 f6244j;

    /* renamed from: k, reason: collision with root package name */
    public int f6245k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6246l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p0 f6247m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s0 f6248n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j6.i f6249o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f6250p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r0(p0 p0Var, s0 s0Var, q6.e eVar, Object obj, h6.d dVar) {
        super(2, dVar);
        this.f6247m = p0Var;
        this.f6248n = s0Var;
        this.f6249o = (j6.i) eVar;
        this.f6250p = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [j6.i, q6.e] */
    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        r0 r0Var = new r0(this.f6247m, this.f6248n, this.f6249o, this.f6250p, dVar);
        r0Var.f6246l = obj;
        return r0Var;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((r0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [q6.e] */
    /* JADX WARN: Type inference failed for: r6v5, types: [k7.a] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        k7.c cVar;
        Object obj2;
        q0 q0Var;
        s0 s0Var;
        ?? r62;
        q0 q0Var2;
        k7.a aVar;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        int i7 = this.f6245k;
        i6.a aVar2 = i6.a.f4956f;
        try {
            try {
                if (i7 == 0) {
                    d6.a.e(obj);
                    h6.g u8 = ((c7.x) this.f6246l).k().u(c7.u.f1748g);
                    r6.k.c(u8);
                    q0 q0Var3 = new q0(this.f6247m, (c7.x0) u8);
                    s0 s0Var2 = this.f6248n;
                    AtomicReference atomicReference3 = s0Var2.f6254a;
                    while (true) {
                        q0 q0Var4 = (q0) atomicReference3.get();
                        if (q0Var4 != null && q0Var3.f6237a.compareTo(q0Var4.f6237a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(q0Var4, q0Var3)) {
                            if (atomicReference3.get() != q0Var4) {
                                break;
                            }
                        }
                        if (q0Var4 != null) {
                            q0Var4.f6238b.c(new g0.s0("Mutation interrupted", 3));
                        }
                        cVar = s0Var2.f6255b;
                        this.f6246l = q0Var3;
                        this.f6241g = cVar;
                        j6.i iVar = this.f6249o;
                        this.f6242h = iVar;
                        Object obj3 = this.f6250p;
                        this.f6243i = obj3;
                        this.f6244j = s0Var2;
                        this.f6245k = 1;
                        if (cVar.c(this) != aVar2) {
                            obj2 = obj3;
                            q0Var = q0Var3;
                            s0Var = s0Var2;
                            r62 = iVar;
                        }
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s0Var = (s0) this.f6242h;
                        aVar = this.f6241g;
                        q0Var2 = (q0) this.f6246l;
                        try {
                            d6.a.e(obj);
                            atomicReference2 = s0Var.f6254a;
                            while (!atomicReference2.compareAndSet(q0Var2, null) && atomicReference2.get() == q0Var2) {
                            }
                            ((k7.c) aVar).e(null);
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            atomicReference = s0Var.f6254a;
                            while (!atomicReference.compareAndSet(q0Var2, null)) {
                            }
                            throw th;
                        }
                    }
                    s0Var = this.f6244j;
                    obj2 = this.f6243i;
                    q6.e eVar = (q6.e) this.f6242h;
                    ?? r63 = this.f6241g;
                    q0Var = (q0) this.f6246l;
                    d6.a.e(obj);
                    r62 = eVar;
                    cVar = r63;
                }
                this.f6246l = q0Var;
                this.f6241g = cVar;
                this.f6242h = s0Var;
                this.f6243i = null;
                this.f6244j = null;
                this.f6245k = 2;
                obj = r62.d(obj2, this);
                if (obj != aVar2) {
                    aVar = cVar;
                    q0Var2 = q0Var;
                    atomicReference2 = s0Var.f6254a;
                    while (!atomicReference2.compareAndSet(q0Var2, null)) {
                    }
                    ((k7.c) aVar).e(null);
                    return obj;
                }
                return aVar2;
            } catch (Throwable th2) {
                th = th2;
                q0Var2 = q0Var;
                atomicReference = s0Var.f6254a;
                while (!atomicReference.compareAndSet(q0Var2, null) && atomicReference.get() == q0Var2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            ((k7.c) 2).e(null);
            throw th3;
        }
    }
}
