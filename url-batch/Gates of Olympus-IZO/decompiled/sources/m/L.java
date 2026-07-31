package m;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import k2.C0547t;
import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class L extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public s2.a f5593e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5594f;

    /* renamed from: g, reason: collision with root package name */
    public M f5595g;

    /* renamed from: h, reason: collision with root package name */
    public int f5596h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f5597i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5598j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ M f5599k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ R1.i f5600l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public L(int i3, M m3, Y1.c cVar, P1.d dVar) {
        super(2, dVar);
        this.f5598j = i3;
        this.f5599k = m3;
        this.f5600l = (R1.i) cVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [R1.i, Y1.c] */
    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        L l3 = new L(this.f5598j, this.f5599k, this.f5600l, dVar);
        l3.f5597i = obj;
        return l3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((L) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0077, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [Y1.c] */
    /* JADX WARN: Type inference failed for: r5v6, types: [s2.a] */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m3;
        ?? r3;
        C0586K c0586k;
        s2.c cVar;
        s2.a aVar;
        C0586K c0586k2;
        M m4;
        Throwable th;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Q1.a aVar2 = Q1.a.f3113d;
        ?? r12 = this.f5596h;
        try {
            try {
                if (r12 == 0) {
                    I2.l.Q(obj);
                    P1.g k3 = ((InterfaceC0550w) this.f5597i).u().k(C0547t.f5390e);
                    Z1.i.c(k3);
                    C0586K c0586k3 = new C0586K(this.f5598j, (k2.X) k3);
                    while (true) {
                        m3 = this.f5599k;
                        AtomicReference atomicReference3 = m3.f5601a;
                        C0586K c0586k4 = (C0586K) atomicReference3.get();
                        if (c0586k4 != null) {
                            int i3 = c0586k3.f5591a;
                            int i4 = c0586k4.f5591a;
                            if (i3 == 0 || i4 == 0) {
                                break;
                            }
                            if (i3 - i4 < 0) {
                                throw new CancellationException("Current mutation had a higher priority");
                            }
                        }
                        while (!atomicReference3.compareAndSet(c0586k4, c0586k3)) {
                            if (atomicReference3.get() != c0586k4) {
                                break;
                            }
                        }
                        if (c0586k4 != null) {
                            c0586k4.f5592b.a(new I.W("Mutation interrupted", 2));
                        }
                        this.f5597i = c0586k3;
                        s2.c cVar2 = m3.f5602b;
                        this.f5593e = cVar2;
                        R1.i iVar = this.f5600l;
                        this.f5594f = iVar;
                        this.f5595g = m3;
                        this.f5596h = 1;
                        if (cVar2.c(null, this) == aVar2) {
                            return aVar2;
                        }
                        r3 = iVar;
                        c0586k = c0586k3;
                        cVar = cVar2;
                    }
                } else {
                    if (r12 != 1) {
                        if (r12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        m4 = (M) this.f5594f;
                        aVar = this.f5593e;
                        c0586k2 = (C0586K) this.f5597i;
                        try {
                            I2.l.Q(obj);
                            atomicReference2 = m4.f5601a;
                            while (!atomicReference2.compareAndSet(c0586k2, null) && atomicReference2.get() == c0586k2) {
                            }
                            ((s2.c) aVar).e(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = m4.f5601a;
                            while (!atomicReference.compareAndSet(c0586k2, null) && atomicReference.get() == c0586k2) {
                            }
                            throw th;
                        }
                    }
                    M m5 = this.f5595g;
                    Y1.c cVar3 = (Y1.c) this.f5594f;
                    ?? r5 = this.f5593e;
                    c0586k = (C0586K) this.f5597i;
                    I2.l.Q(obj);
                    m3 = m5;
                    r3 = cVar3;
                    cVar = r5;
                }
                this.f5597i = c0586k;
                this.f5593e = aVar;
                this.f5594f = m3;
                this.f5595g = null;
                this.f5596h = 2;
                Object j3 = r3.j(this);
                if (j3 == aVar2) {
                    return aVar2;
                }
                m4 = m3;
                obj = j3;
                c0586k2 = c0586k;
                atomicReference2 = m4.f5601a;
                while (!atomicReference2.compareAndSet(c0586k2, null)) {
                }
                ((s2.c) aVar).e(null);
                return obj;
            } catch (Throwable th3) {
                c0586k2 = c0586k;
                m4 = m3;
                th = th3;
                atomicReference = m4.f5601a;
                while (!atomicReference.compareAndSet(c0586k2, null)) {
                }
                throw th;
            }
            aVar = cVar;
        } catch (Throwable th4) {
            ((s2.c) r12).e(null);
            throw th4;
        }
    }
}
