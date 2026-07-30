package defpackage;

import defpackage.aa2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class lq implements gt {
    public static final /* synthetic */ long A;
    public static final /* synthetic */ AtomicLongFieldUpdater n = AtomicLongFieldUpdater.newUpdater(lq.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater o = AtomicLongFieldUpdater.newUpdater(lq.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater p = AtomicLongFieldUpdater.newUpdater(lq.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater q = AtomicLongFieldUpdater.newUpdater(lq.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater r = AtomicReferenceFieldUpdater.newUpdater(lq.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater s;
    public static final /* synthetic */ AtomicReferenceFieldUpdater t;
    public static final /* synthetic */ AtomicReferenceFieldUpdater u;
    public static final /* synthetic */ AtomicReferenceFieldUpdater v;
    public static final /* synthetic */ long w;
    public static final /* synthetic */ long x;
    public static final /* synthetic */ long y;
    public static final /* synthetic */ long z;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final int m;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = hd2.a;
        A = unsafe.objectFieldOffset(lq.class.getDeclaredField("sendSegment$volatile"));
        s = AtomicReferenceFieldUpdater.newUpdater(lq.class, Object.class, "receiveSegment$volatile");
        z = unsafe.objectFieldOffset(lq.class.getDeclaredField("receiveSegment$volatile"));
        t = AtomicReferenceFieldUpdater.newUpdater(lq.class, Object.class, "bufferEndSegment$volatile");
        x = unsafe.objectFieldOffset(lq.class.getDeclaredField("bufferEndSegment$volatile"));
        u = AtomicReferenceFieldUpdater.newUpdater(lq.class, Object.class, "_closeCause$volatile");
        w = unsafe.objectFieldOffset(lq.class.getDeclaredField("_closeCause$volatile"));
        v = AtomicReferenceFieldUpdater.newUpdater(lq.class, Object.class, "closeHandler$volatile");
        y = unsafe.objectFieldOffset(lq.class.getDeclaredField("closeHandler$volatile"));
    }

    public lq(int i) {
        this.m = i;
        if (i < 0) {
            lh.c(in1.l(i, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        tt ttVar = nq.a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = p.get(this);
        tt ttVar2 = new tt(0L, null, this, 3);
        this.sendSegment$volatile = ttVar2;
        this.receiveSegment$volatile = ttVar2;
        if (C()) {
            ttVar2 = nq.a;
            ttVar2.getClass();
        }
        this.bufferEndSegment$volatile = ttVar2;
        this._closeCause$volatile = nq.s;
    }

    public static Object F(lq lqVar, pr2 pr2Var) {
        tt ttVar;
        Throwable th;
        tt ttVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
        atomicReferenceFieldUpdater.getClass();
        if (lqVar == null) {
            b71.o();
            return null;
        }
        tt ttVar3 = (tt) hd2.a.getObjectVolatile(lqVar, z);
        while (!lqVar.A()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = o;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(lqVar);
            long j = nq.b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (ttVar3.e != j2) {
                tt q2 = lqVar.q(j2, ttVar3);
                if (q2 == null) {
                    continue;
                } else {
                    ttVar = q2;
                }
            } else {
                ttVar = ttVar3;
            }
            lq lqVar2 = lqVar;
            Object N = lqVar2.N(ttVar, i, andIncrement, null);
            ng0 ng0Var = nq.m;
            if (N == ng0Var) {
                lh.g("unexpected");
                return null;
            }
            ng0 ng0Var2 = nq.o;
            if (N == ng0Var2) {
                if (andIncrement < lqVar2.v()) {
                    ttVar.a();
                }
                lqVar = lqVar2;
                ttVar3 = ttVar;
            } else {
                if (N != nq.n) {
                    ttVar.a();
                    return N;
                }
                fs I = ll3.I(q41.b(pr2Var));
                try {
                    Object N2 = lqVar2.N(ttVar, i, andIncrement, I);
                    if (N2 == ng0Var) {
                        I.a(ttVar, i);
                    } else {
                        if (N2 == ng0Var2) {
                            if (andIncrement < lqVar2.v()) {
                                ttVar.a();
                            }
                            tt ttVar4 = (tt) atomicReferenceFieldUpdater.get(lqVar2);
                            while (true) {
                                if (lqVar2.A()) {
                                    aa2.a aVar = aa2.m;
                                    I.resumeWith(new ba2(lqVar2.t()));
                                    break;
                                }
                                fs fsVar = I;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(lqVar2);
                                    long j3 = nq.b;
                                    long j4 = andIncrement2 / j3;
                                    int i2 = (int) (andIncrement2 % j3);
                                    if (ttVar4.e != j4) {
                                        try {
                                            tt q3 = lqVar2.q(j4, ttVar4);
                                            if (q3 == null) {
                                                I = fsVar;
                                            } else {
                                                ttVar2 = q3;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            I = fsVar;
                                            I.B();
                                            throw th;
                                        }
                                    } else {
                                        ttVar2 = ttVar4;
                                    }
                                    lq lqVar3 = lqVar2;
                                    N2 = lqVar3.N(ttVar2, i2, andIncrement2, fsVar);
                                    lqVar2 = lqVar3;
                                    tt ttVar5 = ttVar2;
                                    I = fsVar;
                                    if (N2 == nq.m) {
                                        I.a(ttVar5, i2);
                                        break;
                                    }
                                    if (N2 == nq.o) {
                                        if (andIncrement2 < lqVar2.v()) {
                                            ttVar5.a();
                                        }
                                        ttVar4 = ttVar5;
                                    } else {
                                        if (N2 == nq.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        ttVar5.a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    I = fsVar;
                                    th = th;
                                    I.B();
                                    throw th;
                                }
                            }
                        } else {
                            ttVar.a();
                        }
                        I.c(N2, null);
                    }
                    Object s2 = I.s();
                    b50 b50Var = b50.m;
                    return s2;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable t2 = lqVar.t();
        int i3 = ho2.a;
        throw t2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object G(lq lqVar, r30 r30Var) {
        jq jqVar;
        int i;
        tt ttVar;
        if (r30Var instanceof jq) {
            jqVar = (jq) r30Var;
            int i2 = jqVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jqVar.o = i2 - Integer.MIN_VALUE;
                jq jqVar2 = jqVar;
                Object obj = jqVar2.m;
                b50 b50Var = b50.m;
                i = jqVar2.o;
                if (i == 0) {
                    if (i == 1) {
                        ca2.b(obj);
                        return ((st) obj).a;
                    }
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca2.b(obj);
                s.getClass();
                tt ttVar2 = (tt) hd2.a.getObjectVolatile(lqVar, z);
                while (!lqVar.A()) {
                    long andIncrement = o.getAndIncrement(lqVar);
                    long j = nq.b;
                    long j2 = andIncrement / j;
                    int i3 = (int) (andIncrement % j);
                    if (ttVar2.e != j2) {
                        tt q2 = lqVar.q(j2, ttVar2);
                        if (q2 == null) {
                            continue;
                        } else {
                            ttVar = q2;
                        }
                    } else {
                        ttVar = ttVar2;
                    }
                    lq lqVar2 = lqVar;
                    Object N = lqVar2.N(ttVar, i3, andIncrement, null);
                    if (N == nq.m) {
                        lh.g("unexpected");
                        return null;
                    }
                    if (N != nq.o) {
                        if (N != nq.n) {
                            ttVar.a();
                            return N;
                        }
                        jqVar2.o = 1;
                        Object H = lqVar2.H(ttVar, i3, andIncrement, jqVar2);
                        return H == b50Var ? b50Var : H;
                    }
                    if (andIncrement < lqVar2.v()) {
                        ttVar.a();
                    }
                    lqVar = lqVar2;
                    ttVar2 = ttVar;
                }
                return new qt(lqVar.s());
            }
        }
        jqVar = new jq(lqVar, r30Var);
        jq jqVar22 = jqVar;
        Object obj2 = jqVar22.m;
        b50 b50Var2 = b50.m;
        i = jqVar22.o;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object J(lq lqVar, Object obj, o30 o30Var) {
        Object s2;
        b50 b50Var;
        String str;
        int i;
        int i2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r;
        atomicReferenceFieldUpdater.getClass();
        tt ttVar = (tt) hd2.a.getObjectVolatile(lqVar, A);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = n;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(lqVar);
            long j = andIncrement & 1152921504606846975L;
            boolean z2 = lqVar.z(false, andIncrement);
            int i3 = nq.b;
            long j2 = i3;
            long j3 = j / j2;
            int i4 = (int) (j % j2);
            if (ttVar.e != j3) {
                tt r2 = lqVar.r(j3, ttVar);
                if (r2 != null) {
                    ttVar = r2;
                } else if (z2) {
                    Object E = lqVar.E(o30Var, obj);
                    if (E == b50.m) {
                        return E;
                    }
                }
            }
            int c = c(lqVar, ttVar, i4, obj, j, null, z2);
            if (c == 0) {
                ttVar.a();
                break;
            }
            if (c == 1) {
                break;
            }
            if (c != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = o;
                if (c == 3) {
                    fs I = ll3.I(q41.b(o30Var));
                    try {
                        int c2 = c(lqVar, ttVar, i4, obj, j, I, false);
                        if (c2 == 0) {
                            ttVar.a();
                            aa2.a aVar = aa2.m;
                        } else if (c2 != 1) {
                            if (c2 != 2) {
                                if (c2 != 4) {
                                    String str2 = "unexpected";
                                    if (c2 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    ttVar.a();
                                    tt ttVar2 = (tt) atomicReferenceFieldUpdater.get(lqVar);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(lqVar);
                                        long j4 = andIncrement2 & 1152921504606846975L;
                                        boolean z3 = lqVar.z(false, andIncrement2);
                                        int i5 = nq.b;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                        long j5 = i5;
                                        long j6 = j4 / j5;
                                        int i6 = (int) (j4 % j5);
                                        if (ttVar2.e != j6) {
                                            tt r3 = lqVar.r(j6, ttVar2);
                                            if (r3 != null) {
                                                ttVar2 = r3;
                                                str = str2;
                                                i2 = i6;
                                                i = i5;
                                            } else {
                                                if (z3) {
                                                    break;
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                            }
                                        } else {
                                            str = str2;
                                            i = i5;
                                            i2 = i6;
                                        }
                                        int c3 = c(lqVar, ttVar2, i2, obj, j4, I, z3);
                                        if (c3 == 0) {
                                            ttVar2.a();
                                            aa2.a aVar2 = aa2.m;
                                            break;
                                        }
                                        if (c3 == 1) {
                                            aa2.a aVar3 = aa2.m;
                                            break;
                                        }
                                        if (c3 != 2) {
                                            if (c3 == 3) {
                                                throw new IllegalStateException(str);
                                            }
                                            if (c3 != 4) {
                                                if (c3 == 5) {
                                                    ttVar2.a();
                                                }
                                                str2 = str;
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                            } else if (j4 < atomicLongFieldUpdater2.get(lqVar)) {
                                                ttVar2.a();
                                            }
                                        } else if (z3) {
                                            ttVar2.m();
                                        } else {
                                            I.a(ttVar2, i2 + i);
                                        }
                                    }
                                } else if (j < atomicLongFieldUpdater2.get(lqVar)) {
                                    ttVar.a();
                                }
                                b(lqVar, obj, I);
                            } else {
                                I.a(ttVar, i4 + i3);
                            }
                            s2 = I.s();
                            b50Var = b50.m;
                            if (s2 != b50Var) {
                                s2 = Unit.a;
                            }
                            if (s2 == b50Var) {
                                return s2;
                            }
                        } else {
                            aa2.a aVar4 = aa2.m;
                        }
                        I.resumeWith(Unit.a);
                        s2 = I.s();
                        b50Var = b50.m;
                        if (s2 != b50Var) {
                        }
                        if (s2 == b50Var) {
                        }
                    } catch (Throwable th) {
                        I.B();
                        throw th;
                    }
                } else if (c == 4) {
                    if (j < atomicLongFieldUpdater2.get(lqVar)) {
                        ttVar.a();
                    }
                    Object E2 = lqVar.E(o30Var, obj);
                    if (E2 == b50.m) {
                        return E2;
                    }
                } else if (c == 5) {
                    ttVar.a();
                }
            } else if (z2) {
                ttVar.m();
                Object E3 = lqVar.E(o30Var, obj);
                if (E3 == b50.m) {
                    return E3;
                }
            }
        }
        return Unit.a;
    }

    public static boolean L(Object obj) {
        if (obj instanceof ds) {
            return nq.a((ds) obj, Unit.a, null);
        }
        dm0.i(obj, "Unexpected waiter: ");
        return false;
    }

    public static final void b(lq lqVar, Object obj, fs fsVar) {
        Throwable u2 = lqVar.u();
        aa2.a aVar = aa2.m;
        fsVar.resumeWith(new ba2(u2));
    }

    public static final int c(lq lqVar, tt ttVar, int i, Object obj, long j, Object obj2, boolean z2) {
        ttVar.r(i, obj);
        if (z2) {
            return lqVar.O(ttVar, i, obj, j, obj2, z2);
        }
        Object p2 = ttVar.p(i);
        if (p2 == null) {
            if (lqVar.e(j)) {
                if (ttVar.o(i, null, nq.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (ttVar.o(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (p2 instanceof g63) {
            ttVar.r(i, null);
            if (lqVar.K(p2, obj)) {
                ttVar.s(i, nq.i);
                return 0;
            }
            ng0 ng0Var = nq.k;
            if (ttVar.h.getAndSet((i * 2) + 1, ng0Var) == ng0Var) {
                return 5;
            }
            ttVar.q(i, true);
            return 5;
        }
        return lqVar.O(ttVar, i, obj, j, obj2, z2);
    }

    public static void x(lq lqVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = q;
        if ((atomicLongFieldUpdater.addAndGet(lqVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(lqVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean A() {
        return z(true, n.get(this));
    }

    public boolean B() {
        return false;
    }

    public final boolean C() {
        long j = p.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r5.j() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        r5.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(long j, tt ttVar) {
        lq lqVar;
        tt ttVar2;
        tt ttVar3;
        while (ttVar.e < j && (ttVar3 = (tt) ttVar.c()) != null) {
            ttVar = ttVar3;
        }
        while (true) {
            tt ttVar4 = ttVar;
            while (ttVar4.f() && (ttVar2 = (tt) ttVar4.c()) != null) {
                ttVar4 = ttVar2;
            }
            while (true) {
                t.getClass();
                Unsafe unsafe = hd2.a;
                long j2 = x;
                vg2 vg2Var = (vg2) unsafe.getObjectVolatile(this, j2);
                if (vg2Var.e >= ttVar4.e) {
                    return;
                }
                if (!ttVar4.n()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = hd2.a;
                    lqVar = this;
                    if (unsafe2.compareAndSwapObject(lqVar, x, vg2Var, ttVar4)) {
                        if (vg2Var.j()) {
                            vg2Var.h();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(lqVar, j2) != vg2Var) {
                        break;
                    } else {
                        this = lqVar;
                    }
                }
                this = lqVar;
            }
            ttVar = ttVar4;
        }
    }

    public final Object E(o30 o30Var, Object obj) {
        fs fsVar = new fs(1, q41.b(o30Var));
        fsVar.u();
        Throwable u2 = u();
        aa2.a aVar = aa2.m;
        fsVar.resumeWith(new ba2(u2));
        Object s2 = fsVar.s();
        return s2 == b50.m ? s2 : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(tt ttVar, int i, long j, r30 r30Var) {
        kq kqVar;
        int i2;
        st stVar;
        tt ttVar2;
        if (r30Var instanceof kq) {
            kqVar = (kq) r30Var;
            int i3 = kqVar.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kqVar.o = i3 - Integer.MIN_VALUE;
                Object obj = kqVar.m;
                b50 b50Var = b50.m;
                i2 = kqVar.o;
                if (i2 != 0) {
                    ca2.b(obj);
                    kqVar.o = 1;
                    fs I = ll3.I(q41.b(kqVar));
                    try {
                        l72 l72Var = new l72(I);
                        Object N = N(ttVar, i, j, l72Var);
                        if (N == nq.m) {
                            l72Var.a(ttVar, i);
                        } else {
                            if (N == nq.o) {
                                if (j < v()) {
                                    ttVar.a();
                                }
                                tt ttVar3 = (tt) s.get(this);
                                while (true) {
                                    if (A()) {
                                        aa2.a aVar = aa2.m;
                                        I.resumeWith(new st(new qt(s())));
                                        break;
                                    }
                                    long andIncrement = o.getAndIncrement(this);
                                    long j2 = nq.b;
                                    long j3 = andIncrement / j2;
                                    int i4 = (int) (andIncrement % j2);
                                    if (ttVar3.e != j3) {
                                        tt q2 = q(j3, ttVar3);
                                        if (q2 != null) {
                                            ttVar2 = q2;
                                        }
                                    } else {
                                        ttVar2 = ttVar3;
                                    }
                                    Object N2 = N(ttVar2, i4, andIncrement, l72Var);
                                    tt ttVar4 = ttVar2;
                                    if (N2 == nq.m) {
                                        l72Var.a(ttVar4, i4);
                                        break;
                                    }
                                    if (N2 == nq.o) {
                                        if (andIncrement < v()) {
                                            ttVar4.a();
                                        }
                                        ttVar3 = ttVar4;
                                    } else {
                                        if (N2 == nq.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        ttVar4.a();
                                        stVar = new st(N2);
                                    }
                                }
                            } else {
                                ttVar.a();
                                stVar = new st(N);
                            }
                            I.c(stVar, null);
                        }
                        obj = I.s();
                        b50 b50Var2 = b50.m;
                        if (obj == b50Var) {
                            return b50Var;
                        }
                    } catch (Throwable th) {
                        I.B();
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return ((st) obj).a;
            }
        }
        kqVar = new kq(this, r30Var);
        Object obj2 = kqVar.m;
        b50 b50Var3 = b50.m;
        i2 = kqVar.o;
        if (i2 != 0) {
        }
        return ((st) obj2).a;
    }

    public final void I(g63 g63Var, boolean z2) {
        if (g63Var instanceof ds) {
            o30 o30Var = (o30) g63Var;
            aa2.a aVar = aa2.m;
            o30Var.resumeWith(new ba2(z2 ? t() : u()));
            return;
        }
        if (g63Var instanceof l72) {
            fs fsVar = ((l72) g63Var).m;
            aa2.a aVar2 = aa2.m;
            fsVar.resumeWith(new st(new qt(s())));
            return;
        }
        if (!(g63Var instanceof iq)) {
            dm0.i(g63Var, "Unexpected waiter: ");
            return;
        }
        iq iqVar = (iq) g63Var;
        fs fsVar2 = iqVar.n;
        fsVar2.getClass();
        iqVar.n = null;
        iqVar.m = nq.l;
        Throwable s2 = iqVar.o.s();
        if (s2 == null) {
            aa2.a aVar3 = aa2.m;
            fsVar2.resumeWith(Boolean.FALSE);
        } else {
            aa2.a aVar4 = aa2.m;
            fsVar2.resumeWith(new ba2(s2));
        }
    }

    public final boolean K(Object obj, Object obj2) {
        if (obj instanceof l72) {
            return nq.a(((l72) obj).m, new st(obj2), null);
        }
        if (!(obj instanceof iq)) {
            if (obj instanceof ds) {
                return nq.a((ds) obj, obj2, null);
            }
            dm0.i(obj, "Unexpected receiver type: ");
            return false;
        }
        iq iqVar = (iq) obj;
        fs fsVar = iqVar.n;
        fsVar.getClass();
        iqVar.n = null;
        iqVar.m = obj2;
        Boolean bool = Boolean.TRUE;
        iqVar.o.getClass();
        return nq.a(fsVar, bool, null);
    }

    public final Object M(Object obj) {
        tt ttVar;
        int i;
        lq lqVar;
        lg0 lg0Var = nq.d;
        r.getClass();
        tt ttVar2 = (tt) hd2.a.getObjectVolatile(this, A);
        while (true) {
            long andIncrement = n.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean z2 = this.z(false, andIncrement);
            int i2 = nq.b;
            long j2 = i2;
            long j3 = j / j2;
            int i3 = (int) (j % j2);
            if (ttVar2.e != j3) {
                ttVar = this.r(j3, ttVar2);
                if (ttVar != null) {
                    lqVar = this;
                    i = i3;
                } else if (z2) {
                    return new qt(this.u());
                }
            } else {
                ttVar = ttVar2;
                i = i3;
                lqVar = this;
            }
            Object obj2 = obj;
            int c = c(lqVar, ttVar, i, obj2, j, lg0Var, z2);
            lq lqVar2 = lqVar;
            ttVar2 = ttVar;
            if (c == 0) {
                ttVar2.a();
                return Unit.a;
            }
            if (c == 1) {
                return Unit.a;
            }
            if (c == 2) {
                if (z2) {
                    ttVar2.m();
                    return new qt(lqVar2.u());
                }
                g63 g63Var = lg0Var instanceof g63 ? (g63) lg0Var : null;
                if (g63Var != null) {
                    g63Var.a(ttVar2, i + i2);
                }
                lqVar2.n((ttVar2.e * j2) + i);
                return Unit.a;
            }
            if (c == 3) {
                lh.g("unexpected");
                return null;
            }
            if (c == 4) {
                if (j < o.get(lqVar2)) {
                    ttVar2.a();
                }
                return new qt(lqVar2.u());
            }
            if (c == 5) {
                ttVar2.a();
            }
            this = lqVar2;
            obj = obj2;
        }
    }

    public final Object N(tt ttVar, int i, long j, Object obj) {
        Object p2 = ttVar.p(i);
        AtomicReferenceArray atomicReferenceArray = ttVar.h;
        AtomicLongFieldUpdater atomicLongFieldUpdater = n;
        if (p2 == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return nq.n;
                }
                if (ttVar.o(i, p2, obj)) {
                    o();
                    return nq.m;
                }
            }
        } else if (p2 == nq.d && ttVar.o(i, p2, nq.i)) {
            o();
            Object obj2 = atomicReferenceArray.get(i * 2);
            ttVar.r(i, null);
            return obj2;
        }
        while (true) {
            Object p3 = ttVar.p(i);
            if (p3 == null || p3 == nq.e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (ttVar.o(i, p3, nq.h)) {
                        o();
                        return nq.o;
                    }
                } else {
                    if (obj == null) {
                        return nq.n;
                    }
                    if (ttVar.o(i, p3, obj)) {
                        o();
                        return nq.m;
                    }
                }
            } else if (p3 != nq.d) {
                ng0 ng0Var = nq.j;
                if (p3 == ng0Var) {
                    return nq.o;
                }
                if (p3 == nq.h) {
                    return nq.o;
                }
                if (p3 == nq.l) {
                    o();
                    return nq.o;
                }
                if (p3 != nq.g && ttVar.o(i, p3, nq.f)) {
                    boolean z2 = p3 instanceof h63;
                    if (z2) {
                        p3 = ((h63) p3).a;
                    }
                    if (L(p3)) {
                        ttVar.s(i, nq.i);
                        o();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        ttVar.r(i, null);
                        return obj3;
                    }
                    ttVar.s(i, ng0Var);
                    ttVar.m();
                    if (z2) {
                        o();
                    }
                    return nq.o;
                }
            } else if (ttVar.o(i, p3, nq.i)) {
                o();
                Object obj4 = atomicReferenceArray.get(i * 2);
                ttVar.r(i, null);
                return obj4;
            }
        }
    }

    public final int O(tt ttVar, int i, Object obj, long j, Object obj2, boolean z2) {
        while (true) {
            Object p2 = ttVar.p(i);
            if (p2 == null) {
                if (!e(j) || z2) {
                    if (z2) {
                        if (ttVar.o(i, null, nq.j)) {
                            ttVar.m();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (ttVar.o(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (ttVar.o(i, null, nq.d)) {
                    break;
                }
            } else {
                if (p2 != nq.e) {
                    ng0 ng0Var = nq.k;
                    if (p2 == ng0Var) {
                        ttVar.r(i, null);
                        return 5;
                    }
                    if (p2 == nq.h) {
                        ttVar.r(i, null);
                        return 5;
                    }
                    if (p2 == nq.l) {
                        ttVar.r(i, null);
                        m();
                        return 4;
                    }
                    ttVar.r(i, null);
                    if (p2 instanceof h63) {
                        p2 = ((h63) p2).a;
                    }
                    if (K(p2, obj)) {
                        ttVar.s(i, nq.i);
                        return 0;
                    }
                    if (ttVar.h.getAndSet((i * 2) + 1, ng0Var) != ng0Var) {
                        ttVar.q(i, true);
                    }
                    return 5;
                }
                if (ttVar.o(i, p2, nq.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void P(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        lq lqVar = this;
        if (lqVar.C()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = p;
            if (atomicLongFieldUpdater.get(lqVar) > j) {
                break;
            } else {
                lqVar = this;
            }
        }
        int i = nq.c;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = q;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(lqVar);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(lqVar)) && j2 == atomicLongFieldUpdater.get(lqVar)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(lqVar);
                    if (atomicLongFieldUpdater2.compareAndSet(lqVar, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        lqVar = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(lqVar);
                    long j5 = atomicLongFieldUpdater2.get(lqVar);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z2 = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(lqVar)) {
                        break;
                    }
                    if (z2) {
                        lqVar = this;
                    } else {
                        lqVar = this;
                        atomicLongFieldUpdater2.compareAndSet(lqVar, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(lqVar);
                    if (atomicLongFieldUpdater2.compareAndSet(lqVar, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        lqVar = this;
                    }
                }
            }
        }
    }

    @Override // defpackage.ui2
    public Object a(o30 o30Var, Object obj) {
        return J(this, obj, o30Var);
    }

    @Override // defpackage.ui2
    public Object d(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = n;
        boolean z2 = false;
        long j = 1152921504606846975L;
        boolean z3 = z(false, atomicLongFieldUpdater.get(this)) ? false : !e(r1 & 1152921504606846975L);
        rt rtVar = st.b;
        if (z3) {
            return rtVar;
        }
        lg0 lg0Var = nq.j;
        r.getClass();
        tt ttVar = (tt) hd2.a.getObjectVolatile(this, A);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & j;
            boolean z4 = z(z2, andIncrement);
            int i = nq.b;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (ttVar.e != j4) {
                tt r2 = r(j4, ttVar);
                if (r2 != null) {
                    ttVar = r2;
                } else {
                    if (z4) {
                        return new qt(u());
                    }
                    z2 = false;
                    j = 1152921504606846975L;
                }
            }
            int c = c(this, ttVar, i2, obj, j2, lg0Var, z4);
            if (c == 0) {
                ttVar.a();
                return Unit.a;
            }
            if (c == 1) {
                return Unit.a;
            }
            if (c == 2) {
                if (z4) {
                    ttVar.m();
                    return new qt(u());
                }
                g63 g63Var = lg0Var instanceof g63 ? (g63) lg0Var : null;
                if (g63Var != null) {
                    g63Var.a(ttVar, i2 + i);
                }
                ttVar.m();
                return rtVar;
            }
            if (c == 3) {
                lh.g("unexpected");
                return null;
            }
            if (c == 4) {
                if (j2 < o.get(this)) {
                    ttVar.a();
                }
                return new qt(u());
            }
            if (c == 5) {
                ttVar.a();
            }
            z2 = false;
            j = 1152921504606846975L;
        }
    }

    public final boolean e(long j) {
        return j < p.get(this) || j < o.get(this) + ((long) this.m);
    }

    @Override // defpackage.gt
    public final void f(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        k(cancellationException, true);
    }

    public final tt g() {
        t.getClass();
        Unsafe unsafe = hd2.a;
        Object objectVolatile = unsafe.getObjectVolatile(this, x);
        r.getClass();
        tt ttVar = (tt) unsafe.getObjectVolatile(this, A);
        if (ttVar.e > ((tt) objectVolatile).e) {
            objectVolatile = ttVar;
        }
        s.getClass();
        tt ttVar2 = (tt) unsafe.getObjectVolatile(this, z);
        if (ttVar2.e > ((tt) objectVolatile).e) {
            objectVolatile = ttVar2;
        }
        v00 v00Var = (v00) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v00.a;
            Object d = v00Var.d();
            if (d == tk3.f) {
                break;
            }
            v00 v00Var2 = (v00) d;
            if (v00Var2 != null) {
                v00Var = v00Var2;
            } else if (v00Var.g()) {
                break;
            }
        }
        return (tt) v00Var;
    }

    @Override // defpackage.gt
    public final Object h(pr2 pr2Var) {
        return F(this, pr2Var);
    }

    @Override // defpackage.gt
    public final Object i() {
        tt ttVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = o;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = n.get(this);
        if (z(true, j2)) {
            return new qt(s());
        }
        long j3 = j2 & 1152921504606846975L;
        rt rtVar = st.b;
        if (j >= j3) {
            return rtVar;
        }
        Object obj = nq.k;
        s.getClass();
        tt ttVar2 = (tt) hd2.a.getObjectVolatile(this, z);
        while (!this.A()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = nq.b;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (ttVar2.e != j5) {
                tt q2 = this.q(j5, ttVar2);
                if (q2 == null) {
                    continue;
                } else {
                    ttVar = q2;
                }
            } else {
                ttVar = ttVar2;
            }
            lq lqVar = this;
            Object N = lqVar.N(ttVar, i, andIncrement, obj);
            ttVar2 = ttVar;
            if (N == nq.m) {
                g63 g63Var = obj instanceof g63 ? (g63) obj : null;
                if (g63Var != null) {
                    g63Var.a(ttVar2, i);
                }
                lqVar.P(andIncrement);
                ttVar2.m();
                return rtVar;
            }
            if (N != nq.o) {
                if (N != nq.n) {
                    ttVar2.a();
                    return N;
                }
                lh.g("unexpected");
                return null;
            }
            if (andIncrement < lqVar.v()) {
                ttVar2.a();
            }
            this = lqVar;
        }
        return new qt(this.s());
    }

    @Override // defpackage.gt
    public final iq iterator() {
        return new iq(this);
    }

    @Override // defpackage.gt
    public final Object j(vw vwVar) {
        return G(this, vwVar);
    }

    public final boolean k(Throwable th, boolean z2) {
        lq lqVar;
        boolean z3;
        long j;
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = n;
        if (z2) {
            while (true) {
                long j4 = atomicLongFieldUpdater.get(this);
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
                tt ttVar = nq.a;
                lqVar = this;
                if (atomicLongFieldUpdater.compareAndSet(lqVar, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = lqVar;
            }
        }
        lqVar = this;
        ng0 ng0Var = nq.s;
        while (true) {
            u.getClass();
            lq lqVar2 = lqVar;
            Unsafe unsafe = hd2.a;
            long j5 = w;
            Throwable th2 = th;
            boolean compareAndSwapObject = unsafe.compareAndSwapObject(lqVar2, j5, ng0Var, th2);
            lqVar = lqVar2;
            if (compareAndSwapObject) {
                z3 = true;
                break;
            }
            if (unsafe.getObjectVolatile(lqVar, j5) != ng0Var) {
                z3 = false;
                break;
            }
            th = th2;
        }
        if (z2) {
            do {
                j3 = atomicLongFieldUpdater.get(lqVar);
            } while (!atomicLongFieldUpdater.compareAndSet(lqVar, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(lqVar);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(lqVar, j, j2));
        }
        lqVar.m();
        if (z3) {
            lqVar.y();
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
    
        r1 = (defpackage.tt) r1.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tt l(long j) {
        long j2;
        tt g = g();
        if (B()) {
            tt ttVar = g;
            loop0: do {
                int i = nq.b - 1;
                while (true) {
                    if (-1 >= i) {
                        break;
                    }
                    j2 = (ttVar.e * nq.b) + i;
                    if (j2 < o.get(this)) {
                        break loop0;
                    }
                    while (true) {
                        Object p2 = ttVar.p(i);
                        if (p2 != null && p2 != nq.e) {
                            if (p2 == nq.d) {
                                break loop0;
                            }
                        } else {
                            if (ttVar.o(i, p2, nq.l)) {
                                ttVar.m();
                                break;
                            }
                        }
                    }
                    i--;
                }
            } while (ttVar != null);
            j2 = -1;
            if (j2 != -1) {
                n(j2);
            }
        }
        Object obj = null;
        loop3: for (tt ttVar2 = g; ttVar2 != null; ttVar2 = (tt) ttVar2.e()) {
            for (int i2 = nq.b - 1; -1 < i2; i2--) {
                if ((ttVar2.e * nq.b) + i2 < j) {
                    break loop3;
                }
                while (true) {
                    Object p3 = ttVar2.p(i2);
                    if (p3 != null && p3 != nq.e) {
                        if (!(p3 instanceof h63)) {
                            if (!(p3 instanceof g63)) {
                                break;
                            }
                            if (ttVar2.o(i2, p3, nq.l)) {
                                obj = s93.O(obj, p3);
                                ttVar2.q(i2, true);
                                break;
                            }
                        } else {
                            if (ttVar2.o(i2, p3, nq.l)) {
                                obj = s93.O(obj, ((h63) p3).a);
                                ttVar2.q(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (ttVar2.o(i2, p3, nq.l)) {
                            ttVar2.m();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                I((g63) obj, true);
                return g;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                I((g63) arrayList.get(size), true);
            }
        }
        return g;
    }

    public final void m() {
        z(false, n.get(this));
    }

    public final void n(long j) {
        s.getClass();
        tt ttVar = (tt) hd2.a.getObjectVolatile(this, z);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = o;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.m + j2, p.get(this))) {
                return;
            }
            lq lqVar = this;
            if (atomicLongFieldUpdater.compareAndSet(lqVar, j2, 1 + j2)) {
                long j3 = nq.b;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (ttVar.e != j4) {
                    tt q2 = lqVar.q(j4, ttVar);
                    if (q2 != null) {
                        ttVar = q2;
                    }
                }
                tt ttVar2 = ttVar;
                if (lqVar.N(ttVar2, i, j2, null) != nq.o) {
                    ttVar2.a();
                } else if (j2 < lqVar.v()) {
                    ttVar2.a();
                }
                this = lqVar;
                ttVar = ttVar2;
            }
            this = lqVar;
        }
    }

    public final void o() {
        lq lqVar;
        if (C()) {
            return;
        }
        t.getClass();
        tt ttVar = (tt) hd2.a.getObjectVolatile(this, x);
        loop0: while (true) {
            long andIncrement = p.getAndIncrement(this);
            long j = nq.b;
            long j2 = andIncrement / j;
            if (this.v() <= andIncrement) {
                if (ttVar.e < j2 && ttVar.c() != null) {
                    this.D(j2, ttVar);
                }
                x(this);
                return;
            }
            lqVar = this;
            if (ttVar.e != j2) {
                tt p2 = lqVar.p(j2, ttVar, andIncrement);
                if (p2 == null) {
                    continue;
                    this = lqVar;
                } else {
                    ttVar = p2;
                }
            }
            int i = (int) (andIncrement % j);
            Object p3 = ttVar.p(i);
            boolean z2 = p3 instanceof g63;
            AtomicLongFieldUpdater atomicLongFieldUpdater = o;
            if (!z2 || andIncrement < atomicLongFieldUpdater.get(lqVar) || !ttVar.o(i, p3, nq.g)) {
                while (true) {
                    Object p4 = ttVar.p(i);
                    if (!(p4 instanceof g63)) {
                        if (p4 != nq.j) {
                            if (p4 != null) {
                                if (p4 == nq.d || p4 == nq.h || p4 == nq.i || p4 == nq.k || p4 == nq.l) {
                                    break loop0;
                                } else if (p4 != nq.f) {
                                    dm0.i(p4, "Unexpected cell state: ");
                                    return;
                                }
                            } else if (ttVar.o(i, p4, nq.e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater.get(lqVar)) {
                        if (ttVar.o(i, p4, new h63((g63) p4))) {
                            break loop0;
                        }
                    } else if (ttVar.o(i, p4, nq.g)) {
                        if (L(p4)) {
                            ttVar.s(i, nq.d);
                            break;
                        } else {
                            ttVar.s(i, nq.j);
                            ttVar.m();
                        }
                    }
                }
                x(lqVar);
            } else if (L(p3)) {
                ttVar.s(i, nq.d);
                break;
            } else {
                ttVar.s(i, nq.j);
                ttVar.m();
                x(lqVar);
            }
            this = lqVar;
        }
        x(lqVar);
    }

    public final tt p(long j, tt ttVar, long j2) {
        Object M;
        Unsafe unsafe;
        tt ttVar2 = nq.a;
        mq mqVar = mq.o;
        loop0: while (true) {
            M = tk3.M(ttVar, j, mqVar);
            if (!yk3.H(M)) {
                vg2 F = yk3.F(M);
                while (true) {
                    t.getClass();
                    Unsafe unsafe2 = hd2.a;
                    long j3 = x;
                    vg2 vg2Var = (vg2) unsafe2.getObjectVolatile(this, j3);
                    if (vg2Var.e >= F.e) {
                        break loop0;
                    }
                    if (!F.n()) {
                        break;
                    }
                    do {
                        unsafe = hd2.a;
                        if (unsafe.compareAndSwapObject(this, x, vg2Var, F)) {
                            if (vg2Var.j()) {
                                vg2Var.h();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == vg2Var);
                    if (F.j()) {
                        F.h();
                    }
                }
            } else {
                break;
            }
        }
        if (yk3.H(M)) {
            m();
            D(j, ttVar);
            x(this);
            return null;
        }
        tt ttVar3 = (tt) yk3.F(M);
        long j4 = ttVar3.e;
        if (j4 <= j) {
            return ttVar3;
        }
        long j5 = j4 * nq.b;
        if (!p.compareAndSet(this, j2 + 1, j5)) {
            x(this);
            return null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = q;
        if ((atomicLongFieldUpdater.addAndGet(this, j5 - j2) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d0, code lost:
    
        if (r8.j() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
    
        r8.h();
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0107 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tt q(long j, tt ttVar) {
        Object M;
        tt ttVar2;
        long j2;
        Unsafe unsafe;
        tt ttVar3 = nq.a;
        mq mqVar = mq.o;
        loop0: while (true) {
            M = tk3.M(ttVar, j, mqVar);
            if (!yk3.H(M)) {
                vg2 F = yk3.F(M);
                while (true) {
                    s.getClass();
                    Unsafe unsafe2 = hd2.a;
                    long j3 = z;
                    vg2 vg2Var = (vg2) unsafe2.getObjectVolatile(this, j3);
                    if (vg2Var.e >= F.e) {
                        break loop0;
                    }
                    if (!F.n()) {
                        break;
                    }
                    do {
                        unsafe = hd2.a;
                        if (unsafe.compareAndSwapObject(this, z, vg2Var, F)) {
                            if (vg2Var.j()) {
                                vg2Var.h();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == vg2Var);
                    if (F.j()) {
                        F.h();
                    }
                }
            } else {
                break;
            }
        }
        if (yk3.H(M)) {
            m();
            if (ttVar.e * nq.b < v()) {
                ttVar.a();
                return null;
            }
        } else {
            tt ttVar4 = (tt) yk3.F(M);
            long j4 = ttVar4.e;
            if (!C() && j <= p.get(this) / nq.b) {
                while (true) {
                    t.getClass();
                    Unsafe unsafe3 = hd2.a;
                    long j5 = x;
                    vg2 vg2Var2 = (vg2) unsafe3.getObjectVolatile(this, j5);
                    if (vg2Var2.e >= j4 || !ttVar4.n()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = hd2.a;
                        ttVar2 = ttVar4;
                        if (unsafe4.compareAndSwapObject(this, x, vg2Var2, ttVar4)) {
                            if (vg2Var2.j()) {
                                vg2Var2.h();
                            }
                        } else {
                            if (unsafe4.getObjectVolatile(this, j5) != vg2Var2) {
                                break;
                            }
                            ttVar4 = ttVar2;
                        }
                    }
                    ttVar4 = ttVar2;
                }
                if (j4 > j) {
                    return ttVar2;
                }
                long j6 = j4 * nq.b;
                do {
                    j2 = o.get(this);
                    if (j2 >= j6) {
                        break;
                    }
                } while (!o.compareAndSet(this, j2, j6));
                if (j4 * nq.b < v()) {
                    ttVar2.a();
                }
            }
            ttVar2 = ttVar4;
            if (j4 > j) {
            }
        }
        return null;
    }

    public final tt r(long j, tt ttVar) {
        Object M;
        long j2;
        long j3;
        Unsafe unsafe;
        tt ttVar2 = nq.a;
        mq mqVar = mq.o;
        loop0: while (true) {
            M = tk3.M(ttVar, j, mqVar);
            if (!yk3.H(M)) {
                vg2 F = yk3.F(M);
                while (true) {
                    r.getClass();
                    Unsafe unsafe2 = hd2.a;
                    long j4 = A;
                    vg2 vg2Var = (vg2) unsafe2.getObjectVolatile(this, j4);
                    if (vg2Var.e >= F.e) {
                        break loop0;
                    }
                    if (!F.n()) {
                        break;
                    }
                    do {
                        unsafe = hd2.a;
                        if (unsafe.compareAndSwapObject(this, A, vg2Var, F)) {
                            if (vg2Var.j()) {
                                vg2Var.h();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == vg2Var);
                    if (F.j()) {
                        F.h();
                    }
                }
            } else {
                break;
            }
        }
        boolean H = yk3.H(M);
        AtomicLongFieldUpdater atomicLongFieldUpdater = o;
        if (H) {
            m();
            if (ttVar.e * nq.b < atomicLongFieldUpdater.get(this)) {
                ttVar.a();
                return null;
            }
        } else {
            tt ttVar3 = (tt) yk3.F(M);
            long j5 = ttVar3.e;
            if (j5 <= j) {
                return ttVar3;
            }
            long j6 = j5 * nq.b;
            do {
                j2 = n.get(this);
                j3 = 1152921504606846975L & j2;
                if (j3 >= j6) {
                    break;
                }
            } while (!n.compareAndSet(this, j2, j3 + (((int) (j2 >> 60)) << 60)));
            if (j5 * nq.b < atomicLongFieldUpdater.get(this)) {
                ttVar3.a();
            }
        }
        return null;
    }

    public final Throwable s() {
        u.getClass();
        return (Throwable) hd2.a.getObjectVolatile(this, w);
    }

    public final Throwable t() {
        Throwable s2 = s();
        return s2 == null ? new av("Channel was closed") : s2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ae, code lost:
    
        r15 = r8;
        r16 = null;
        r3 = (defpackage.tt) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b8, code lost:
    
        if (r3 != null) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        int i;
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (n.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.m + ',');
        sb.append("data=[");
        s.getClass();
        Unsafe unsafe = hd2.a;
        int i3 = 0;
        r.getClass();
        Object objectVolatile = unsafe.getObjectVolatile(this, A);
        int i4 = 1;
        t.getClass();
        List g = qv.g(unsafe.getObjectVolatile(this, z), objectVolatile, unsafe.getObjectVolatile(this, x));
        ArrayList arrayList = new ArrayList();
        for (Object obj : g) {
            if (((tt) obj) != nq.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            b71.f();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((tt) next).e;
            do {
                Object next2 = it.next();
                long j2 = ((tt) next2).e;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        tt ttVar = (tt) next;
        long j3 = o.get(this);
        long v2 = v();
        loop2: while (true) {
            int i5 = nq.b;
            int i6 = i3;
            while (true) {
                if (i6 >= i5) {
                    break;
                }
                i = i4;
                long j4 = (ttVar.e * nq.b) + i6;
                if (j4 >= v2 && j4 >= j3) {
                    str = null;
                    break loop2;
                }
                Object p2 = ttVar.p(i6);
                Object obj2 = ttVar.h.get(i6 * 2);
                if (p2 instanceof ds) {
                    str2 = (j4 >= j3 || j4 < v2) ? (j4 >= v2 || j4 < j3) ? "cont" : "send" : "receive";
                } else if (p2 instanceof l72) {
                    str2 = "receiveCatching";
                } else if (p2 instanceof h63) {
                    str2 = "EB(" + p2 + ')';
                } else if (Intrinsics.b(p2, nq.f) || Intrinsics.b(p2, nq.g)) {
                    str2 = "resuming_sender";
                } else {
                    if (p2 != null && !p2.equals(nq.e) && !p2.equals(nq.i) && !p2.equals(nq.h) && !p2.equals(nq.k) && !p2.equals(nq.j) && !p2.equals(nq.l)) {
                        str2 = p2.toString();
                    }
                    i6++;
                    i4 = i;
                }
                if (obj2 != null) {
                    sb.append("(" + str2 + ',' + obj2 + "),");
                } else {
                    sb.append(str2 + ',');
                }
                i6++;
                i4 = i;
            }
            i4 = i;
            i3 = 0;
        }
        if (sb.length() == 0) {
            ch2.k("Char sequence is empty.");
            return str;
        }
        if (sb.charAt(sb.length() - i) == ',') {
            sb.deleteCharAt(sb.length() - i).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    public final Throwable u() {
        Throwable s2 = s();
        return s2 == null ? new bv("Channel was closed") : s2;
    }

    public final long v() {
        return n.get(this) & 1152921504606846975L;
    }

    public final boolean w() {
        while (true) {
            s.getClass();
            Unsafe unsafe = hd2.a;
            long j = z;
            tt ttVar = (tt) unsafe.getObjectVolatile(this, j);
            AtomicLongFieldUpdater atomicLongFieldUpdater = o;
            long j2 = atomicLongFieldUpdater.get(this);
            if (v() <= j2) {
                return false;
            }
            long j3 = nq.b;
            long j4 = j2 / j3;
            if (ttVar.e == j4 || (ttVar = q(j4, ttVar)) != null) {
                ttVar.a();
                int i = (int) (j2 % j3);
                while (true) {
                    Object p2 = ttVar.p(i);
                    if (p2 == null || p2 == nq.e) {
                        if (ttVar.o(i, p2, nq.h)) {
                            o();
                            break;
                        }
                    } else {
                        if (p2 == nq.d) {
                            return true;
                        }
                        if (p2 != nq.j && p2 != nq.l && p2 != nq.i && p2 != nq.h) {
                            if (p2 == nq.g) {
                                return true;
                            }
                            if (p2 != nq.f && j2 == atomicLongFieldUpdater.get(this)) {
                                return true;
                            }
                        }
                    }
                }
                o.compareAndSet(this, j2, j2 + 1);
            } else if (((tt) unsafe.getObjectVolatile(this, j)).e < j4) {
                return false;
            }
        }
    }

    public final void y() {
        Object objectVolatile;
        lq lqVar;
        loop0: while (true) {
            v.getClass();
            Unsafe unsafe = hd2.a;
            long j = y;
            objectVolatile = unsafe.getObjectVolatile(this, j);
            ng0 ng0Var = objectVolatile == null ? nq.q : nq.r;
            while (true) {
                Unsafe unsafe2 = hd2.a;
                lqVar = this;
                if (unsafe2.compareAndSwapObject(lqVar, y, objectVolatile, ng0Var)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(lqVar, j) != objectVolatile) {
                    break;
                } else {
                    this = lqVar;
                }
            }
            this = lqVar;
        }
        if (objectVolatile == null) {
            return;
        }
        s03.f(1, objectVolatile);
        ((Function1) objectVolatile).invoke(lqVar.s());
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a4, code lost:
    
        r10 = (defpackage.tt) r10.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean z(boolean z2, long j) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            if (i == 2) {
                l(j & 1152921504606846975L);
                if (!z2 || !w()) {
                }
            } else {
                if (i != 3) {
                    b71.h(in1.k(i, "unexpected close status: "));
                    return false;
                }
                tt l = l(j & 1152921504606846975L);
                Object obj = null;
                loop0: do {
                    int i2 = nq.b - 1;
                    while (true) {
                        if (-1 >= i2) {
                            break;
                        }
                        long j2 = (l.e * nq.b) + i2;
                        while (true) {
                            Object p2 = l.p(i2);
                            if (p2 == nq.i) {
                                break loop0;
                            }
                            ng0 ng0Var = nq.d;
                            AtomicLongFieldUpdater atomicLongFieldUpdater = o;
                            if (p2 == ng0Var) {
                                if (j2 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (l.o(i2, p2, nq.l)) {
                                    l.r(i2, null);
                                    l.m();
                                    break;
                                }
                            } else if (p2 != nq.e && p2 != null) {
                                if (!(p2 instanceof g63) && !(p2 instanceof h63)) {
                                    ng0 ng0Var2 = nq.g;
                                    if (p2 == ng0Var2 || p2 == nq.f) {
                                        break loop0;
                                    }
                                    if (p2 != ng0Var2) {
                                        break;
                                    }
                                } else {
                                    if (j2 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    g63 g63Var = p2 instanceof h63 ? ((h63) p2).a : (g63) p2;
                                    if (l.o(i2, p2, nq.l)) {
                                        obj = s93.O(obj, g63Var);
                                        l.r(i2, null);
                                        l.m();
                                        break;
                                    }
                                }
                            } else if (l.o(i2, p2, nq.l)) {
                                l.m();
                                break;
                            }
                        }
                        i2--;
                    }
                } while (l != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            I((g63) arrayList.get(size), false);
                        }
                    } else {
                        I((g63) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }
}
