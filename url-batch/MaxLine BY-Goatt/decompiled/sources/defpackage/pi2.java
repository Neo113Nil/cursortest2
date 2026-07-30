package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class pi2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(pi2.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater p;
    public static final /* synthetic */ AtomicReferenceFieldUpdater q;
    public static final /* synthetic */ AtomicLongFieldUpdater r;
    public static final /* synthetic */ AtomicIntegerFieldUpdater s;
    public static final /* synthetic */ long t;
    public static final /* synthetic */ long u;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    public final int m;
    public final es n;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = hd2.a;
        t = unsafe.objectFieldOffset(pi2.class.getDeclaredField("head$volatile"));
        p = AtomicLongFieldUpdater.newUpdater(pi2.class, "deqIdx$volatile");
        q = AtomicReferenceFieldUpdater.newUpdater(pi2.class, Object.class, "tail$volatile");
        u = unsafe.objectFieldOffset(pi2.class.getDeclaredField("tail$volatile"));
        r = AtomicLongFieldUpdater.newUpdater(pi2.class, "enqIdx$volatile");
        s = AtomicIntegerFieldUpdater.newUpdater(pi2.class, "_availablePermits$volatile");
    }

    public pi2(int i) {
        this.m = i;
        if (i <= 0) {
            lh.c(in1.k(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i < 0) {
            lh.c(in1.k(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        si2 si2Var = new si2(0L, null, 2);
        this.head$volatile = si2Var;
        this.tail$volatile = si2Var;
        this._availablePermits$volatile = i;
        this.n = new es(3, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0025, code lost:
    
        r4.c(kotlin.Unit.a, r3.n);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(r30 r30Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = s;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.m;
        } while (andDecrement > i);
        if (andDecrement > 0) {
            return Unit.a;
        }
        fs I = ll3.I(q41.b(r30Var));
        try {
            if (!c(I)) {
                while (true) {
                    int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement2 <= i) {
                        if (andDecrement2 > 0) {
                            break;
                        }
                        if (c(I)) {
                            break;
                        }
                    }
                }
            }
            Object s2 = I.s();
            b50 b50Var = b50.m;
            if (s2 != b50Var) {
                s2 = Unit.a;
            }
            return s2 == b50Var ? s2 : Unit.a;
        } catch (Throwable th) {
            I.B();
            throw th;
        }
    }

    public final boolean c(g63 g63Var) {
        Object M;
        Unsafe unsafe;
        pi2 pi2Var = this;
        q.getClass();
        Unsafe unsafe2 = hd2.a;
        long j = u;
        si2 si2Var = (si2) unsafe2.getObjectVolatile(pi2Var, j);
        long andIncrement = r.getAndIncrement(pi2Var);
        ni2 ni2Var = ni2.o;
        long j2 = andIncrement / ri2.f;
        loop0: while (true) {
            M = tk3.M(si2Var, j2, ni2Var);
            if (yk3.H(M)) {
                break;
            }
            vg2 F = yk3.F(M);
            while (true) {
                vg2 vg2Var = (vg2) hd2.a.getObjectVolatile(pi2Var, j);
                if (vg2Var.e >= F.e) {
                    pi2Var = this;
                    break loop0;
                }
                if (!F.n()) {
                    break;
                }
                do {
                    unsafe = hd2.a;
                    pi2Var = this;
                    if (unsafe.compareAndSwapObject(pi2Var, u, vg2Var, F)) {
                        if (vg2Var.j()) {
                            vg2Var.h();
                        }
                    }
                } while (unsafe.getObjectVolatile(pi2Var, j) == vg2Var);
                if (F.j()) {
                    F.h();
                }
            }
            pi2Var = this;
        }
        si2 si2Var2 = (si2) yk3.F(M);
        AtomicReferenceArray atomicReferenceArray = si2Var2.g;
        int i = (int) (andIncrement % ri2.f);
        while (!atomicReferenceArray.compareAndSet(i, null, g63Var)) {
            if (atomicReferenceArray.get(i) != null) {
                ng0 ng0Var = ri2.b;
                ng0 ng0Var2 = ri2.c;
                while (!atomicReferenceArray.compareAndSet(i, ng0Var, ng0Var2)) {
                    if (atomicReferenceArray.get(i) != ng0Var) {
                        return false;
                    }
                }
                ((ds) g63Var).c(Unit.a, pi2Var.n);
                return true;
            }
        }
        g63Var.a(si2Var2, i);
        return true;
    }

    public final void d() {
        int i;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = s;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.m;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!e());
    }

    public final boolean e() {
        Object M;
        Unsafe unsafe;
        o.getClass();
        Unsafe unsafe2 = hd2.a;
        long j = t;
        si2 si2Var = (si2) unsafe2.getObjectVolatile(this, j);
        long andIncrement = p.getAndIncrement(this);
        long j2 = andIncrement / ri2.f;
        oi2 oi2Var = oi2.o;
        loop0: while (true) {
            M = tk3.M(si2Var, j2, oi2Var);
            if (yk3.H(M)) {
                break;
            }
            vg2 F = yk3.F(M);
            while (true) {
                vg2 vg2Var = (vg2) hd2.a.getObjectVolatile(this, j);
                if (vg2Var.e >= F.e) {
                    break loop0;
                }
                if (!F.n()) {
                    break;
                }
                do {
                    unsafe = hd2.a;
                    if (unsafe.compareAndSwapObject(this, t, vg2Var, F)) {
                        if (vg2Var.j()) {
                            vg2Var.h();
                        }
                    }
                } while (unsafe.getObjectVolatile(this, j) == vg2Var);
                if (F.j()) {
                    F.h();
                }
            }
        }
        si2 si2Var2 = (si2) yk3.F(M);
        AtomicReferenceArray atomicReferenceArray = si2Var2.g;
        si2Var2.a();
        boolean z = false;
        if (si2Var2.e <= j2) {
            int i = (int) (andIncrement % ri2.f);
            Object andSet = atomicReferenceArray.getAndSet(i, ri2.b);
            if (andSet == null) {
                int i2 = ri2.a;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (atomicReferenceArray.get(i) == ri2.c) {
                        return true;
                    }
                }
                ng0 ng0Var = ri2.b;
                ng0 ng0Var2 = ri2.d;
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i, ng0Var, ng0Var2)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceArray.get(i) != ng0Var) {
                        break;
                    }
                }
                return !z;
            }
            if (andSet != ri2.e) {
                if (!(andSet instanceof ds)) {
                    dm0.i(andSet, "unexpected: ");
                    return false;
                }
                ds dsVar = (ds) andSet;
                ng0 e = dsVar.e(Unit.a, this.n);
                if (e != null) {
                    dsVar.l(e);
                    return true;
                }
            }
        }
        return false;
    }
}
