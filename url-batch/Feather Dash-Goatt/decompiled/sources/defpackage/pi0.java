package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class pi0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(pi0.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e;
    public static final /* synthetic */ AtomicReferenceFieldUpdater g;
    public static final /* synthetic */ long h;
    public static final /* synthetic */ long i;
    public static final /* synthetic */ long j;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = n51.a;
        h = unsafe.objectFieldOffset(pi0.class.getDeclaredField("_next$volatile"));
        e = AtomicReferenceFieldUpdater.newUpdater(pi0.class, Object.class, "_prev$volatile");
        i = unsafe.objectFieldOffset(pi0.class.getDeclaredField("_prev$volatile"));
        g = AtomicReferenceFieldUpdater.newUpdater(pi0.class, Object.class, "_removedRef$volatile");
        j = unsafe.objectFieldOffset(pi0.class.getDeclaredField("_removedRef$volatile"));
    }

    public static pi0 i(pi0 pi0Var) {
        while (pi0Var.n()) {
            e.getClass();
            pi0Var = (pi0) n51.a.getObjectVolatile(pi0Var, i);
        }
        return pi0Var;
    }

    public final boolean e(pi0 pi0Var, int i2) {
        pi0 m;
        do {
            m = m();
            if (m instanceof wh0) {
                return (((wh0) m).k & i2) == 0 && m.e(pi0Var, i2);
            }
        } while (!m.f(pi0Var, this));
        return true;
    }

    public final boolean f(pi0 pi0Var, pi0 pi0Var2) {
        e.getClass();
        Unsafe unsafe = n51.a;
        unsafe.putObjectVolatile(pi0Var, i, this);
        d.getClass();
        long j2 = h;
        unsafe.putObjectVolatile(pi0Var, j2, pi0Var2);
        while (true) {
            Unsafe unsafe2 = n51.a;
            pi0 pi0Var3 = this;
            pi0 pi0Var4 = pi0Var;
            pi0 pi0Var5 = pi0Var2;
            if (unsafe2.compareAndSwapObject(pi0Var3, h, pi0Var5, pi0Var4)) {
                pi0Var4.j(pi0Var5);
                return true;
            }
            if (unsafe2.getObjectVolatile(pi0Var3, j2) != pi0Var5) {
                return false;
            }
            this = pi0Var3;
            pi0Var2 = pi0Var5;
            pi0Var = pi0Var4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        r9 = r4;
        r10 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(sp0 sp0Var) {
        e.getClass();
        Unsafe unsafe = n51.a;
        unsafe.putObjectVolatile(sp0Var, i, this);
        d.getClass();
        long j2 = h;
        unsafe.putObjectVolatile(sp0Var, j2, this);
        while (this.k() == this) {
            while (true) {
                Unsafe unsafe2 = n51.a;
                pi0 pi0Var = this;
                sp0 sp0Var2 = sp0Var;
                if (unsafe2.compareAndSwapObject(pi0Var, h, this, sp0Var2)) {
                    sp0Var2.j(pi0Var);
                    return;
                } else {
                    if (unsafe2.getObjectVolatile(pi0Var, j2) != pi0Var) {
                        break;
                    }
                    this = pi0Var;
                    sp0Var = sp0Var2;
                }
            }
        }
    }

    public final pi0 h() {
        pi0 pi0Var;
        pi0 pi0Var2;
        Unsafe unsafe;
        loop0: while (true) {
            e.getClass();
            Unsafe unsafe2 = n51.a;
            long j2 = i;
            pi0 pi0Var3 = (pi0) unsafe2.getObjectVolatile(this, j2);
            pi0 pi0Var4 = null;
            pi0Var = pi0Var3;
            while (true) {
                d.getClass();
                if (pi0Var == null) {
                    af.c();
                    return null;
                }
                Unsafe unsafe3 = n51.a;
                long j3 = h;
                Object objectVolatile = unsafe3.getObjectVolatile(pi0Var, j3);
                if (objectVolatile != this) {
                    pi0 pi0Var5 = pi0Var3;
                    pi0Var2 = this;
                    if (pi0Var2.n()) {
                        return null;
                    }
                    if (!(objectVolatile instanceof p21)) {
                        objectVolatile.getClass();
                        pi0Var4 = pi0Var;
                        pi0Var = (pi0) objectVolatile;
                    } else if (pi0Var4 != null) {
                        pi0 pi0Var6 = ((p21) objectVolatile).a;
                        do {
                            pi0 pi0Var7 = pi0Var;
                            unsafe = n51.a;
                            boolean compareAndSwapObject = unsafe.compareAndSwapObject(pi0Var4, h, pi0Var7, pi0Var6);
                            pi0Var = pi0Var7;
                            if (compareAndSwapObject) {
                                this = pi0Var2;
                                pi0Var = pi0Var4;
                                pi0Var3 = pi0Var5;
                                pi0Var4 = null;
                            }
                        } while (unsafe.getObjectVolatile(pi0Var4, j3) == pi0Var);
                    } else {
                        if (pi0Var == null) {
                            af.c();
                            return null;
                        }
                        pi0Var = (pi0) unsafe3.getObjectVolatile(pi0Var, j2);
                    }
                    this = pi0Var2;
                    pi0Var3 = pi0Var5;
                } else {
                    if (pi0Var3 == pi0Var) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = n51.a;
                        pi0 pi0Var8 = this;
                        boolean compareAndSwapObject2 = unsafe4.compareAndSwapObject(pi0Var8, i, pi0Var3, pi0Var);
                        pi0 pi0Var9 = pi0Var3;
                        pi0Var2 = pi0Var8;
                        if (compareAndSwapObject2) {
                            break loop0;
                        }
                        if (unsafe4.getObjectVolatile(pi0Var2, j2) != pi0Var9) {
                            break;
                        }
                        this = pi0Var2;
                        pi0Var3 = pi0Var9;
                    }
                }
            }
            this = pi0Var2;
        }
        return pi0Var;
    }

    public final void j(pi0 pi0Var) {
        pi0 pi0Var2;
        while (true) {
            e.getClass();
            if (pi0Var == null) {
                af.c();
                return;
            }
            Unsafe unsafe = n51.a;
            long j2 = i;
            pi0 pi0Var3 = (pi0) unsafe.getObjectVolatile(pi0Var, j2);
            if (this.k() != pi0Var) {
                return;
            }
            while (pi0Var != null) {
                Unsafe unsafe2 = n51.a;
                pi0Var2 = this;
                pi0 pi0Var4 = pi0Var;
                if (unsafe2.compareAndSwapObject(pi0Var4, i, pi0Var3, pi0Var2)) {
                    if (pi0Var2.n()) {
                        pi0Var4.h();
                        return;
                    }
                    return;
                } else {
                    if (pi0Var4 == null) {
                        af.c();
                        return;
                    }
                    pi0Var = pi0Var4;
                    if (unsafe2.getObjectVolatile(pi0Var4, j2) != pi0Var3) {
                        break;
                    } else {
                        this = pi0Var2;
                    }
                }
            }
            af.c();
            return;
            this = pi0Var2;
        }
    }

    public final Object k() {
        d.getClass();
        return n51.a.getObjectVolatile(this, h);
    }

    public final pi0 l() {
        Object k = k();
        p21 p21Var = k instanceof p21 ? (p21) k : null;
        if (p21Var != null) {
            return p21Var.a;
        }
        k.getClass();
        return (pi0) k;
    }

    public final pi0 m() {
        pi0 h2 = h();
        if (h2 != null) {
            return h2;
        }
        e.getClass();
        return i((pi0) n51.a.getObjectVolatile(this, i));
    }

    public boolean n() {
        return k() instanceof p21;
    }

    public final pi0 o() {
        pi0 pi0Var;
        while (true) {
            Object k = this.k();
            if (k instanceof p21) {
                return ((p21) k).a;
            }
            if (k == this) {
                return (pi0) k;
            }
            k.getClass();
            pi0 pi0Var2 = (pi0) k;
            p21 p = pi0Var2.p();
            while (true) {
                d.getClass();
                Unsafe unsafe = n51.a;
                long j2 = h;
                pi0Var = this;
                if (unsafe.compareAndSwapObject(pi0Var, j2, k, p)) {
                    pi0Var2.h();
                    return null;
                }
                if (unsafe.getObjectVolatile(pi0Var, j2) != k) {
                    break;
                }
                this = pi0Var;
            }
            this = pi0Var;
        }
    }

    public final p21 p() {
        g.getClass();
        Unsafe unsafe = n51.a;
        long j2 = j;
        p21 p21Var = (p21) unsafe.getObjectVolatile(this, j2);
        if (p21Var != null) {
            return p21Var;
        }
        p21 p21Var2 = new p21(this);
        unsafe.putObjectVolatile(this, j2, p21Var2);
        return p21Var2;
    }

    public String toString() {
        return new nf0(1, 1, op.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + op.y(this);
    }
}
