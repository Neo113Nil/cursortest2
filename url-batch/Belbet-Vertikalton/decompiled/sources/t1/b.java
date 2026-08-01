package t1;

import G1.AbstractC0001b;
import V.q;
import a.AbstractC0058a;
import androidx.room.C0086c;
import b1.EnumC0098a;
import i1.InterfaceC0192l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r1.AbstractC0369t;
import r1.C0355e;
import r1.InterfaceC0354d;
import r1.h0;
import w1.t;

/* loaded from: classes.dex */
public class b implements f {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4173d = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");
    public static final AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4174f = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4175g = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4176h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");
    public static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");
    public static final AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4177k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4178l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* renamed from: b, reason: collision with root package name */
    public final int f4179b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0192l f4180c;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public b(int i2, InterfaceC0192l interfaceC0192l) {
        this.f4179b = i2;
        this.f4180c = interfaceC0192l;
        if (i2 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i2 + ", should be >=0").toString());
        }
        j jVar = d.f4181a;
        this.bufferEnd = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f4174f.get(this);
        j jVar2 = new j(0L, null, this, 3);
        this.sendSegment = jVar2;
        this.receiveSegment = jVar2;
        if (r()) {
            jVar2 = d.f4181a;
            j1.h.c(jVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = jVar2;
        this._closeCause = d.f4196s;
    }

    public static final j c(b bVar, long j2, j jVar) {
        Object c2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j4;
        bVar.getClass();
        j jVar2 = d.f4181a;
        c cVar = c.i;
        loop0: while (true) {
            c2 = w1.a.c(j2, jVar);
            if (!w1.a.f(c2)) {
                t d2 = w1.a.d(c2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4176h;
                    t tVar = (t) atomicReferenceFieldUpdater.get(bVar);
                    if (tVar.f4500c >= d2.f4500c) {
                        break loop0;
                    }
                    if (!d2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(bVar, tVar, d2)) {
                        if (atomicReferenceFieldUpdater.get(bVar) != tVar) {
                            if (d2.e()) {
                                d2.d();
                            }
                        }
                    }
                    if (tVar.e()) {
                        tVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean f2 = w1.a.f(c2);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = e;
        if (f2) {
            bVar.h();
            if (jVar.f4500c * d.f4182b >= atomicLongFieldUpdater2.get(bVar)) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) w1.a.d(c2);
        long j5 = jVar3.f4500c;
        if (j5 <= j2) {
            return jVar3;
        }
        long j6 = d.f4182b * j5;
        do {
            atomicLongFieldUpdater = f4173d;
            j3 = atomicLongFieldUpdater.get(bVar);
            j4 = 1152921504606846975L & j3;
            if (j4 >= j6) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(bVar, j3, j4 + (((int) (j3 >> 60)) << 60)));
        if (j5 * d.f4182b >= atomicLongFieldUpdater2.get(bVar)) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public static final void d(b bVar, Object obj, C0355e c0355e) {
        InterfaceC0192l interfaceC0192l = bVar.f4180c;
        if (interfaceC0192l != null) {
            w1.a.a(interfaceC0192l, obj, c0355e.e);
        }
        c0355e.resumeWith(H1.d.r(bVar.m()));
    }

    public static final int e(b bVar, j jVar, int i2, Object obj, long j2, Object obj2, boolean z2) {
        bVar.getClass();
        jVar.m(i2, obj);
        if (z2) {
            return bVar.y(jVar, i2, obj, j2, obj2, z2);
        }
        Object k2 = jVar.k(i2);
        if (k2 == null) {
            if (bVar.f(j2)) {
                if (jVar.j(null, i2, d.f4184d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (jVar.j(null, i2, obj2)) {
                    return 2;
                }
            }
        } else if (k2 instanceof h0) {
            jVar.m(i2, null);
            if (bVar.v(k2, obj)) {
                jVar.n(i2, d.i);
                return 0;
            }
            q qVar = d.f4188k;
            if (jVar.f4202f.getAndSet((i2 * 2) + 1, qVar) != qVar) {
                jVar.l(i2, true);
            }
            return 5;
        }
        return bVar.y(jVar, i2, obj, j2, obj2, z2);
    }

    public static void o(b bVar) {
        bVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4175g;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean w(Object obj) {
        if (obj instanceof InterfaceC0354d) {
            j1.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return d.a((InterfaceC0354d) obj, W0.i.f1345a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ee, code lost:
    
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f2, code lost:
    
        d(r26, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f5, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fb, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c8, code lost:
    
        r2.t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01cb, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x014c, code lost:
    
        if (r24 >= r5.get(r26)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x014e, code lost:
    
        r19.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0151, code lost:
    
        r1 = r27;
        r2 = r28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // t1.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Object obj, C0086c c0086c) {
        j jVar;
        Object obj2;
        C0355e c0355e;
        C0355e c0355e2;
        W0.i iVar;
        C0355e c0355e3;
        j jVar2;
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4176h;
        j jVar3 = (j) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4173d;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean p2 = p(andIncrement, false);
            int i2 = d.f4182b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            long j5 = jVar3.f4500c;
            W0.i iVar2 = W0.i.f1345a;
            EnumC0098a enumC0098a = EnumC0098a.f2223a;
            if (j5 != j4) {
                j c2 = c(this, j4, jVar3);
                if (c2 != null) {
                    jVar = c2;
                } else if (p2) {
                    obj2 = t(obj, c0086c);
                    if (obj2 != enumC0098a) {
                        return iVar2;
                    }
                }
            } else {
                jVar = jVar3;
            }
            int e2 = e(this, jVar, i3, obj, j2, null, p2);
            if (e2 == 0) {
                jVar.a();
                return iVar2;
            }
            if (e2 == 1) {
                break;
            }
            if (e2 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = e;
                if (e2 == 3) {
                    C0355e d2 = AbstractC0369t.d(H1.l.C(c0086c));
                    j jVar4 = jVar;
                    try {
                        int e3 = e(this, jVar4, i3, obj, j2, d2, false);
                        try {
                            if (e3 != 0) {
                                if (e3 != 1) {
                                    if (e3 == 2) {
                                        c0355e2 = d2;
                                        iVar = iVar2;
                                        c0355e2.a(jVar, i3 + i2);
                                    } else if (e3 == 4) {
                                        c0355e2 = d2;
                                        iVar = iVar2;
                                        if (j2 < atomicLongFieldUpdater2.get(this)) {
                                            jVar.a();
                                        }
                                        d(this, obj, c0355e2);
                                    } else {
                                        if (e3 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        jVar.a();
                                        j jVar5 = (j) atomicReferenceFieldUpdater.get(this);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                            long j6 = andIncrement2 & 1152921504606846975L;
                                            boolean p3 = p(andIncrement2, false);
                                            int i4 = d.f4182b;
                                            long j7 = i4;
                                            long j8 = j6 / j7;
                                            int i5 = (int) (j6 % j7);
                                            if (jVar5.f4500c != j8) {
                                                try {
                                                    j c3 = c(this, j8, jVar5);
                                                    if (c3 != null) {
                                                        c0355e3 = d2;
                                                        jVar2 = c3;
                                                    } else if (p3) {
                                                        break;
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    C0355e c0355e4 = d2;
                                                }
                                            } else {
                                                c0355e3 = d2;
                                                jVar2 = jVar5;
                                            }
                                            d2 = c0355e3;
                                            j jVar6 = jVar2;
                                            int e4 = e(this, jVar2, i5, obj, j6, d2, p3);
                                            if (e4 == 0) {
                                                c0355e2 = d2;
                                                iVar = iVar2;
                                                jVar6.a();
                                                break;
                                            }
                                            if (e4 == 1) {
                                                break;
                                            }
                                            if (e4 == 2) {
                                                obj3 = obj;
                                                c0355e2 = d2;
                                                if (p3) {
                                                    jVar6.h();
                                                } else {
                                                    c0355e2.a(jVar6, i5 + i4);
                                                }
                                            } else {
                                                if (e4 == 3) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                if (e4 == 4) {
                                                    break;
                                                }
                                                if (e4 == 5) {
                                                    jVar6.a();
                                                }
                                                jVar5 = jVar6;
                                            }
                                        }
                                        d(this, obj3, c0355e2);
                                        iVar = iVar2;
                                    }
                                    obj2 = c0355e2.n();
                                    if (obj2 != enumC0098a) {
                                        obj2 = iVar;
                                    }
                                    if (obj2 != enumC0098a) {
                                        return iVar;
                                    }
                                }
                                c0355e2 = d2;
                                iVar = iVar2;
                                c0355e2.resumeWith(iVar);
                                obj2 = c0355e2.n();
                                if (obj2 != enumC0098a) {
                                }
                                if (obj2 != enumC0098a) {
                                }
                            } else {
                                c0355e2 = d2;
                                iVar = iVar2;
                                jVar.a();
                            }
                            c0355e2.resumeWith(iVar);
                            obj2 = c0355e2.n();
                            if (obj2 != enumC0098a) {
                            }
                            if (obj2 != enumC0098a) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c0355e = jVar4;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c0355e = d2;
                    }
                } else if (e2 != 4) {
                    if (e2 == 5) {
                        jVar.a();
                    }
                    jVar3 = jVar;
                } else {
                    if (j2 < atomicLongFieldUpdater2.get(this)) {
                        jVar.a();
                    }
                    Object t2 = t(obj, c0086c);
                    if (t2 == enumC0098a) {
                        return t2;
                    }
                }
            } else {
                if (!p2) {
                    return iVar2;
                }
                jVar.h();
                obj2 = t(obj, c0086c);
                if (obj2 != enumC0098a) {
                    return iVar2;
                }
            }
        }
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return r1;
     */
    @Override // t1.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(Object obj) {
        j jVar;
        j jVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4173d;
        boolean z2 = p(atomicLongFieldUpdater.get(this), false) ? false : !f(r0 & 1152921504606846975L);
        h hVar = i.f4201a;
        if (!z2) {
            V.p pVar = d.j;
            j jVar3 = (j) f4176h.get(this);
            while (true) {
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                long j2 = andIncrement & 1152921504606846975L;
                boolean p2 = p(andIncrement, false);
                int i2 = d.f4182b;
                long j3 = i2;
                long j4 = j2 / j3;
                int i3 = (int) (j2 % j3);
                if (jVar3.f4500c != j4) {
                    j c2 = c(this, j4, jVar3);
                    if (c2 != null) {
                        jVar = c2;
                    } else if (p2) {
                        return new g(m());
                    }
                } else {
                    jVar = jVar3;
                }
                j jVar4 = jVar;
                int e2 = e(this, jVar, i3, obj, j2, pVar, p2);
                W0.i iVar = W0.i.f1345a;
                if (e2 == 0) {
                    jVar4.a();
                    break;
                }
                if (e2 == 1) {
                    break;
                }
                if (e2 == 2) {
                    if (p2) {
                        jVar4.h();
                        return new g(m());
                    }
                    h0 h0Var = pVar instanceof h0 ? (h0) pVar : null;
                    if (h0Var != null) {
                        jVar2 = jVar4;
                        h0Var.a(jVar2, i3 + i2);
                    } else {
                        jVar2 = jVar4;
                    }
                    jVar2.h();
                    return hVar;
                }
                if (e2 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (e2 == 4) {
                    if (j2 < e.get(this)) {
                        jVar4.a();
                    }
                    return new g(m());
                }
                if (e2 == 5) {
                    jVar4.a();
                }
                jVar3 = jVar4;
            }
        } else {
            return hVar;
        }
    }

    public final boolean f(long j2) {
        return j2 < f4174f.get(this) || j2 < e.get(this) + ((long) this.f4179b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (t1.j) ((w1.d) w1.d.f4470b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j g(long j2) {
        Object obj;
        long j3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = j.get(this);
        j jVar = (j) f4176h.get(this);
        if (jVar.f4500c > ((j) obj2).f4500c) {
            obj2 = jVar;
        }
        j jVar2 = (j) i.get(this);
        if (jVar2.f4500c > ((j) obj2).f4500c) {
            obj2 = jVar2;
        }
        w1.d dVar = (w1.d) obj2;
        loop0: while (true) {
            dVar.getClass();
            Object obj3 = w1.d.f4469a.get(dVar);
            q qVar = w1.a.f4463b;
            obj = null;
            if (obj3 == qVar) {
                break;
            }
            w1.d dVar2 = (w1.d) obj3;
            if (dVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = w1.d.f4469a;
                    if (atomicReferenceFieldUpdater.compareAndSet(dVar, null, qVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(dVar) == null);
            } else {
                dVar = dVar2;
            }
        }
        j jVar3 = (j) dVar;
        if (q()) {
            j jVar4 = jVar3;
            loop2: do {
                int i2 = d.f4182b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j3 = (jVar4.f4500c * d.f4182b) + i2;
                    if (j3 < e.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k2 = jVar4.k(i2);
                        if (k2 != null && k2 != d.e) {
                            if (k2 == d.f4184d) {
                                break loop2;
                            }
                        } else {
                            if (jVar4.j(k2, i2, d.f4189l)) {
                                jVar4.h();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (jVar4 != null);
            j3 = -1;
            if (j3 != -1) {
                i(j3);
            }
        }
        loop5: for (j jVar5 = jVar3; jVar5 != null; jVar5 = (j) ((w1.d) w1.d.f4470b.get(jVar5))) {
            for (int i3 = d.f4182b - 1; -1 < i3; i3--) {
                if ((jVar5.f4500c * d.f4182b) + i3 < j2) {
                    break loop5;
                }
                while (true) {
                    Object k3 = jVar5.k(i3);
                    if (k3 != null && k3 != d.e) {
                        if (!(k3 instanceof p)) {
                            if (!(k3 instanceof h0)) {
                                break;
                            }
                            if (jVar5.j(k3, i3, d.f4189l)) {
                                obj = w1.a.g(obj, k3);
                                jVar5.l(i3, true);
                                break;
                            }
                        } else {
                            if (jVar5.j(k3, i3, d.f4189l)) {
                                obj = w1.a.g(obj, ((p) k3).f4204a);
                                jVar5.l(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (jVar5.j(k3, i3, d.f4189l)) {
                            jVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    u((h0) arrayList.get(size), true);
                }
            } else {
                u((h0) obj, true);
            }
        }
        return jVar3;
    }

    public final void h() {
        p(f4173d.get(this), false);
    }

    public final void i(long j2) {
        W0.c b2;
        j jVar = (j) i.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.f4179b + j3, f4174f.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j3 + 1)) {
                long j4 = d.f4182b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (jVar.f4500c != j5) {
                    j k2 = k(j5, jVar);
                    if (k2 == null) {
                        continue;
                    } else {
                        jVar = k2;
                    }
                }
                Object x2 = x(jVar, i2, j3, null);
                if (x2 != d.f4192o) {
                    jVar.a();
                    InterfaceC0192l interfaceC0192l = this.f4180c;
                    if (interfaceC0192l != null && (b2 = w1.a.b(interfaceC0192l, x2, null)) != null) {
                        throw b2;
                    }
                } else if (j3 < n()) {
                    jVar.a();
                }
            }
        }
    }

    public final void j() {
        Object c2;
        if (r()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f4174f.getAndIncrement(this);
            long j2 = andIncrement / d.f4182b;
            if (n() <= andIncrement) {
                if (jVar.f4500c < j2 && jVar.b() != null) {
                    s(j2, jVar);
                }
                o(this);
                return;
            }
            if (jVar.f4500c != j2) {
                c cVar = c.i;
                while (true) {
                    c2 = w1.a.c(j2, jVar);
                    if (!w1.a.f(c2)) {
                        t d2 = w1.a.d(c2);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            if (tVar.f4500c >= d2.f4500c) {
                                break;
                            }
                            if (!d2.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, d2)) {
                                if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                    if (d2.e()) {
                                        d2.d();
                                    }
                                }
                            }
                            if (tVar.e()) {
                                tVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                j jVar2 = null;
                if (w1.a.f(c2)) {
                    h();
                    s(j2, jVar);
                    o(this);
                } else {
                    j jVar3 = (j) w1.a.d(c2);
                    long j3 = jVar3.f4500c;
                    if (j3 > j2) {
                        long j4 = j3 * d.f4182b;
                        if (f4174f.compareAndSet(this, andIncrement + 1, j4)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f4175g;
                            if ((atomicLongFieldUpdater.addAndGet(this, j4 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            o(this);
                        }
                    } else {
                        jVar2 = jVar3;
                    }
                }
                if (jVar2 == null) {
                    continue;
                } else {
                    jVar = jVar2;
                }
            }
            int i2 = (int) (andIncrement % d.f4182b);
            Object k2 = jVar.k(i2);
            boolean z2 = k2 instanceof h0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = e;
            if (!z2 || andIncrement < atomicLongFieldUpdater2.get(this) || !jVar.j(k2, i2, d.f4186g)) {
                while (true) {
                    Object k3 = jVar.k(i2);
                    if (!(k3 instanceof h0)) {
                        if (k3 != d.j) {
                            if (k3 != null) {
                                if (k3 == d.f4184d || k3 == d.f4187h || k3 == d.i || k3 == d.f4188k || k3 == d.f4189l) {
                                    break loop0;
                                }
                                if (k3 != d.f4185f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k3).toString());
                                }
                            } else if (jVar.j(k3, i2, d.e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (jVar.j(k3, i2, new p((h0) k3))) {
                            break loop0;
                        }
                    } else if (jVar.j(k3, i2, d.f4186g)) {
                        if (w(k3)) {
                            jVar.n(i2, d.f4184d);
                            break;
                        } else {
                            jVar.n(i2, d.j);
                            jVar.h();
                        }
                    }
                }
            } else if (w(k2)) {
                jVar.n(i2, d.f4184d);
                break;
            } else {
                jVar.n(i2, d.j);
                jVar.h();
                o(this);
            }
        }
        o(this);
    }

    public final j k(long j2, j jVar) {
        Object c2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        j jVar2 = d.f4181a;
        c cVar = c.i;
        loop0: while (true) {
            c2 = w1.a.c(j2, jVar);
            if (!w1.a.f(c2)) {
                t d2 = w1.a.d(c2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f4500c >= d2.f4500c) {
                        break loop0;
                    }
                    if (!d2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, d2)) {
                        if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            if (d2.e()) {
                                d2.d();
                            }
                        }
                    }
                    if (tVar.e()) {
                        tVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (w1.a.f(c2)) {
            h();
            if (jVar.f4500c * d.f4182b >= n()) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) w1.a.d(c2);
        boolean r2 = r();
        long j4 = jVar3.f4500c;
        if (!r2 && j2 <= f4174f.get(this) / d.f4182b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = j;
                t tVar2 = (t) atomicReferenceFieldUpdater2.get(this);
                if (tVar2.f4500c >= j4 || !jVar3.i()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, tVar2, jVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != tVar2) {
                        if (jVar3.e()) {
                            jVar3.d();
                        }
                    }
                }
                if (tVar2.e()) {
                    tVar2.d();
                }
            }
        }
        if (j4 <= j2) {
            return jVar3;
        }
        long j5 = d.f4182b * j4;
        do {
            atomicLongFieldUpdater = e;
            j3 = atomicLongFieldUpdater.get(this);
            if (j3 >= j5) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, j5));
        if (j4 * d.f4182b >= n()) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public final Throwable l() {
        return (Throwable) f4177k.get(this);
    }

    public final Throwable m() {
        Throwable l2 = l();
        return l2 == null ? new l("Channel was closed") : l2;
    }

    public final long n() {
        return f4173d.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c6, code lost:
    
        r0 = (t1.j) ((w1.d) w1.d.f4470b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(long j2, boolean z2) {
        int i2 = (int) (j2 >> 60);
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if (i2 == 2) {
            g(j2 & 1152921504606846975L);
            if (z2) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                    j jVar = (j) atomicReferenceFieldUpdater.get(this);
                    long j3 = atomicLongFieldUpdater.get(this);
                    if (n() <= j3) {
                        break;
                    }
                    long j4 = d.f4182b;
                    long j5 = j3 / j4;
                    if (jVar.f4500c != j5 && (jVar = k(j5, jVar)) == null) {
                        if (((j) atomicReferenceFieldUpdater.get(this)).f4500c < j5) {
                            break;
                        }
                    } else {
                        jVar.a();
                        int i3 = (int) (j3 % j4);
                        while (true) {
                            Object k2 = jVar.k(i3);
                            if (k2 == null || k2 == d.e) {
                                if (jVar.j(k2, i3, d.f4187h)) {
                                    j();
                                    break;
                                }
                            } else {
                                if (k2 == d.f4184d) {
                                    return false;
                                }
                                if (k2 != d.j && k2 != d.f4189l && k2 != d.i && k2 != d.f4187h) {
                                    if (k2 == d.f4186g) {
                                        return false;
                                    }
                                    if (k2 != d.f4185f && j3 == atomicLongFieldUpdater.get(this)) {
                                        return false;
                                    }
                                }
                            }
                        }
                        e.compareAndSet(this, j3, j3 + 1);
                    }
                }
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException(AbstractC0001b.e("unexpected close status: ", i2).toString());
            }
            j g2 = g(j2 & 1152921504606846975L);
            W0.c cVar = null;
            Object obj = null;
            loop0: do {
                int i4 = d.f4182b - 1;
                while (true) {
                    if (-1 >= i4) {
                        break;
                    }
                    long j6 = (g2.f4500c * d.f4182b) + i4;
                    while (true) {
                        Object k3 = g2.k(i4);
                        if (k3 == d.i) {
                            break loop0;
                        }
                        q qVar = d.f4184d;
                        AtomicReferenceArray atomicReferenceArray = g2.f4202f;
                        InterfaceC0192l interfaceC0192l = this.f4180c;
                        if (k3 == qVar) {
                            if (j6 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (g2.j(k3, i4, d.f4189l)) {
                                if (interfaceC0192l != null) {
                                    cVar = w1.a.b(interfaceC0192l, atomicReferenceArray.get(i4 * 2), cVar);
                                }
                                g2.m(i4, null);
                                g2.h();
                            }
                        } else if (k3 == d.e || k3 == null) {
                            if (g2.j(k3, i4, d.f4189l)) {
                                g2.h();
                                break;
                            }
                        } else if (!(k3 instanceof h0) && !(k3 instanceof p)) {
                            q qVar2 = d.f4186g;
                            if (k3 == qVar2 || k3 == d.f4185f) {
                                break loop0;
                            }
                            if (k3 != qVar2) {
                                break;
                            }
                        } else {
                            if (j6 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            h0 h0Var = k3 instanceof p ? ((p) k3).f4204a : (h0) k3;
                            if (g2.j(k3, i4, d.f4189l)) {
                                if (interfaceC0192l != null) {
                                    cVar = w1.a.b(interfaceC0192l, atomicReferenceArray.get(i4 * 2), cVar);
                                }
                                obj = w1.a.g(obj, h0Var);
                                g2.m(i4, null);
                                g2.h();
                            }
                        }
                    }
                    i4--;
                }
            } while (g2 != null);
            if (obj != null) {
                if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        u((h0) arrayList.get(size), false);
                    }
                } else {
                    u((h0) obj, false);
                }
            }
            if (cVar != null) {
                throw cVar;
            }
        }
        return true;
    }

    public boolean q() {
        return false;
    }

    public final boolean r() {
        long j2 = f4174f.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(long j2, j jVar) {
        j jVar2;
        j jVar3;
        while (jVar.f4500c < j2 && (jVar3 = (j) jVar.b()) != null) {
            jVar = jVar3;
        }
        while (true) {
            if (!jVar.c() || (jVar2 = (j) jVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f4500c >= jVar.f4500c) {
                        return;
                    }
                    if (!jVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, jVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            if (jVar.e()) {
                                jVar.d();
                            }
                        }
                    }
                    if (tVar.e()) {
                        tVar.d();
                        return;
                    }
                    return;
                }
            }
            jVar = jVar2;
        }
    }

    public final Object t(Object obj, C0086c c0086c) {
        W0.c b2;
        C0355e c0355e = new C0355e(H1.l.C(c0086c), 1);
        c0355e.o();
        InterfaceC0192l interfaceC0192l = this.f4180c;
        if (interfaceC0192l == null || (b2 = w1.a.b(interfaceC0192l, obj, null)) == null) {
            c0355e.resumeWith(H1.d.r(m()));
        } else {
            AbstractC0058a.a(b2, m());
            c0355e.resumeWith(H1.d.r(b2));
        }
        Object n2 = c0355e.n();
        return n2 == EnumC0098a.f2223a ? n2 : W0.i.f1345a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x019a, code lost:
    
        r3 = (t1.j) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a1, code lost:
    
        if (r3 != null) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String obj;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (f4173d.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f4179b + ',');
        sb.append("data=[");
        int i3 = 0;
        List k02 = X0.l.k0(i.get(this), f4176h.get(this), j.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : k02) {
            if (((j) obj2) != d.f4181a) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((j) next).f4500c;
            do {
                Object next2 = it.next();
                long j3 = ((j) next2).f4500c;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        j jVar = (j) next;
        long j4 = e.get(this);
        long n2 = n();
        loop2: while (true) {
            int i4 = d.f4182b;
            int i5 = i3;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                long j5 = (jVar.f4500c * d.f4182b) + i5;
                if (j5 >= n2 && j5 >= j4) {
                    break loop2;
                }
                Object k2 = jVar.k(i5);
                Object obj3 = jVar.f4202f.get(i5 * 2);
                if (k2 instanceof InterfaceC0354d) {
                    obj = (j5 >= j4 || j5 < n2) ? (j5 >= n2 || j5 < j4) ? "cont" : "send" : "receive";
                } else if (k2 instanceof p) {
                    obj = "EB(" + k2 + ')';
                } else if (j1.h.a(k2, d.f4185f) ? true : j1.h.a(k2, d.f4186g)) {
                    obj = "resuming_sender";
                } else if (k2 == null ? true : k2.equals(d.e) ? true : j1.h.a(k2, d.i) ? true : j1.h.a(k2, d.f4187h) ? true : j1.h.a(k2, d.f4188k) ? true : j1.h.a(k2, d.j) ? true : j1.h.a(k2, d.f4189l)) {
                    i5++;
                } else {
                    obj = k2.toString();
                }
                if (obj3 != null) {
                    sb.append("(" + obj + ',' + obj3 + "),");
                } else {
                    sb.append(obj + ',');
                }
                i5++;
            }
            i3 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(q1.e.v0(sb)) == ',') {
            j1.h.d(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final void u(h0 h0Var, boolean z2) {
        Throwable m2;
        if (h0Var instanceof InterfaceC0354d) {
            a1.d dVar = (a1.d) h0Var;
            if (z2) {
                m2 = l();
                if (m2 == null) {
                    m2 = new k("Channel was closed");
                }
            } else {
                m2 = m();
            }
            dVar.resumeWith(H1.d.r(m2));
            return;
        }
        if (!(h0Var instanceof a)) {
            throw new IllegalStateException(("Unexpected waiter: " + h0Var).toString());
        }
        a aVar = (a) h0Var;
        C0355e c0355e = aVar.f4171b;
        j1.h.b(c0355e);
        aVar.f4171b = null;
        aVar.f4170a = d.f4189l;
        Throwable l2 = aVar.f4172c.l();
        if (l2 == null) {
            c0355e.resumeWith(Boolean.FALSE);
        } else {
            c0355e.resumeWith(H1.d.r(l2));
        }
    }

    public final boolean v(Object obj, Object obj2) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof InterfaceC0354d)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            j1.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0354d interfaceC0354d = (InterfaceC0354d) obj;
            InterfaceC0192l interfaceC0192l = this.f4180c;
            return d.a(interfaceC0354d, obj2, interfaceC0192l != null ? new w1.o(interfaceC0192l, obj2, ((C0355e) interfaceC0354d).e) : null);
        }
        j1.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C0355e c0355e = aVar.f4171b;
        j1.h.b(c0355e);
        aVar.f4171b = null;
        aVar.f4170a = obj2;
        Boolean bool = Boolean.TRUE;
        InterfaceC0192l interfaceC0192l2 = aVar.f4172c.f4180c;
        return d.a(c0355e, bool, interfaceC0192l2 != null ? new w1.o(interfaceC0192l2, obj2, c0355e.e) : null);
    }

    public final Object x(j jVar, int i2, long j2, a aVar) {
        Object k2 = jVar.k(i2);
        AtomicReferenceArray atomicReferenceArray = jVar.f4202f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4173d;
        if (k2 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (aVar == null) {
                    return d.f4191n;
                }
                if (jVar.j(k2, i2, aVar)) {
                    j();
                    return d.f4190m;
                }
            }
        } else if (k2 == d.f4184d && jVar.j(k2, i2, d.i)) {
            j();
            Object obj = atomicReferenceArray.get(i2 * 2);
            jVar.m(i2, null);
            return obj;
        }
        while (true) {
            Object k3 = jVar.k(i2);
            if (k3 == null || k3 == d.e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (jVar.j(k3, i2, d.f4187h)) {
                        j();
                        return d.f4192o;
                    }
                } else {
                    if (aVar == null) {
                        return d.f4191n;
                    }
                    if (jVar.j(k3, i2, aVar)) {
                        j();
                        return d.f4190m;
                    }
                }
            } else {
                if (k3 != d.f4184d) {
                    q qVar = d.j;
                    if (k3 != qVar && k3 != d.f4187h) {
                        if (k3 == d.f4189l) {
                            j();
                            return d.f4192o;
                        }
                        if (k3 != d.f4186g && jVar.j(k3, i2, d.f4185f)) {
                            boolean z2 = k3 instanceof p;
                            if (z2) {
                                k3 = ((p) k3).f4204a;
                            }
                            if (w(k3)) {
                                jVar.n(i2, d.i);
                                j();
                                Object obj2 = atomicReferenceArray.get(i2 * 2);
                                jVar.m(i2, null);
                                return obj2;
                            }
                            jVar.n(i2, qVar);
                            jVar.h();
                            if (z2) {
                                j();
                            }
                            return d.f4192o;
                        }
                    }
                    return d.f4192o;
                }
                if (jVar.j(k3, i2, d.i)) {
                    j();
                    Object obj3 = atomicReferenceArray.get(i2 * 2);
                    jVar.m(i2, null);
                    return obj3;
                }
            }
        }
    }

    public final int y(j jVar, int i2, Object obj, long j2, Object obj2, boolean z2) {
        while (true) {
            Object k2 = jVar.k(i2);
            if (k2 == null) {
                if (!f(j2) || z2) {
                    if (z2) {
                        if (jVar.j(null, i2, d.j)) {
                            jVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (jVar.j(null, i2, obj2)) {
                            return 2;
                        }
                    }
                } else if (jVar.j(null, i2, d.f4184d)) {
                    return 1;
                }
            } else {
                if (k2 != d.e) {
                    q qVar = d.f4188k;
                    if (k2 == qVar) {
                        jVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == d.f4187h) {
                        jVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == d.f4189l) {
                        jVar.m(i2, null);
                        h();
                        return 4;
                    }
                    jVar.m(i2, null);
                    if (k2 instanceof p) {
                        k2 = ((p) k2).f4204a;
                    }
                    if (v(k2, obj)) {
                        jVar.n(i2, d.i);
                        return 0;
                    }
                    if (jVar.f4202f.getAndSet((i2 * 2) + 1, qVar) == qVar) {
                        return 5;
                    }
                    jVar.l(i2, true);
                    return 5;
                }
                if (jVar.j(k2, i2, d.f4184d)) {
                    return 1;
                }
            }
        }
    }
}
