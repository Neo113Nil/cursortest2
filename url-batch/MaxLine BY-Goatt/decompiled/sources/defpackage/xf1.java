package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class xf1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(xf1.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n;
    public static final /* synthetic */ AtomicReferenceFieldUpdater o;
    public static final /* synthetic */ long p;
    public static final /* synthetic */ long q;
    public static final /* synthetic */ long r;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = hd2.a;
        p = unsafe.objectFieldOffset(xf1.class.getDeclaredField("_next$volatile"));
        n = AtomicReferenceFieldUpdater.newUpdater(xf1.class, Object.class, "_prev$volatile");
        q = unsafe.objectFieldOffset(xf1.class.getDeclaredField("_prev$volatile"));
        o = AtomicReferenceFieldUpdater.newUpdater(xf1.class, Object.class, "_removedRef$volatile");
        r = unsafe.objectFieldOffset(xf1.class.getDeclaredField("_removedRef$volatile"));
    }

    public static xf1 i(xf1 xf1Var) {
        while (xf1Var.n()) {
            n.getClass();
            xf1Var = (xf1) hd2.a.getObjectVolatile(xf1Var, q);
        }
        return xf1Var;
    }

    public final boolean e(xf1 xf1Var, int i) {
        xf1 m2;
        do {
            m2 = m();
            if (m2 instanceof me1) {
                return (((me1) m2).s & i) == 0 && m2.e(xf1Var, i);
            }
        } while (!m2.f(xf1Var, this));
        return true;
    }

    public final boolean f(xf1 xf1Var, xf1 xf1Var2) {
        n.getClass();
        Unsafe unsafe = hd2.a;
        unsafe.putObjectVolatile(xf1Var, q, this);
        m.getClass();
        long j = p;
        unsafe.putObjectVolatile(xf1Var, j, xf1Var2);
        while (true) {
            Unsafe unsafe2 = hd2.a;
            xf1 xf1Var3 = this;
            xf1 xf1Var4 = xf1Var;
            xf1 xf1Var5 = xf1Var2;
            if (unsafe2.compareAndSwapObject(xf1Var3, p, xf1Var5, xf1Var4)) {
                xf1Var4.j(xf1Var5);
                return true;
            }
            if (unsafe2.getObjectVolatile(xf1Var3, j) != xf1Var5) {
                return false;
            }
            this = xf1Var3;
            xf1Var2 = xf1Var5;
            xf1Var = xf1Var4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        r9 = r4;
        r10 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(ms1 ms1Var) {
        n.getClass();
        Unsafe unsafe = hd2.a;
        unsafe.putObjectVolatile(ms1Var, q, this);
        m.getClass();
        long j = p;
        unsafe.putObjectVolatile(ms1Var, j, this);
        while (this.k() == this) {
            while (true) {
                Unsafe unsafe2 = hd2.a;
                xf1 xf1Var = this;
                ms1 ms1Var2 = ms1Var;
                if (unsafe2.compareAndSwapObject(xf1Var, p, this, ms1Var2)) {
                    ms1Var2.j(xf1Var);
                    return;
                } else {
                    if (unsafe2.getObjectVolatile(xf1Var, j) != xf1Var) {
                        break;
                    }
                    this = xf1Var;
                    ms1Var = ms1Var2;
                }
            }
        }
    }

    public final xf1 h() {
        xf1 xf1Var;
        xf1 xf1Var2;
        Unsafe unsafe;
        loop0: while (true) {
            n.getClass();
            Unsafe unsafe2 = hd2.a;
            long j = q;
            xf1 xf1Var3 = (xf1) unsafe2.getObjectVolatile(this, j);
            xf1 xf1Var4 = null;
            xf1Var = xf1Var3;
            while (true) {
                m.getClass();
                if (xf1Var == null) {
                    b71.o();
                    return null;
                }
                Unsafe unsafe3 = hd2.a;
                long j2 = p;
                Object objectVolatile = unsafe3.getObjectVolatile(xf1Var, j2);
                if (objectVolatile != this) {
                    xf1 xf1Var5 = xf1Var3;
                    xf1Var2 = this;
                    if (xf1Var2.n()) {
                        return null;
                    }
                    if (!(objectVolatile instanceof w82)) {
                        objectVolatile.getClass();
                        xf1Var4 = xf1Var;
                        xf1Var = (xf1) objectVolatile;
                    } else if (xf1Var4 != null) {
                        xf1 xf1Var6 = ((w82) objectVolatile).a;
                        do {
                            xf1 xf1Var7 = xf1Var;
                            unsafe = hd2.a;
                            boolean compareAndSwapObject = unsafe.compareAndSwapObject(xf1Var4, p, xf1Var7, xf1Var6);
                            xf1Var = xf1Var7;
                            if (compareAndSwapObject) {
                                this = xf1Var2;
                                xf1Var = xf1Var4;
                                xf1Var3 = xf1Var5;
                                xf1Var4 = null;
                            }
                        } while (unsafe.getObjectVolatile(xf1Var4, j2) == xf1Var);
                    } else {
                        if (xf1Var == null) {
                            b71.o();
                            return null;
                        }
                        xf1Var = (xf1) unsafe3.getObjectVolatile(xf1Var, j);
                    }
                    this = xf1Var2;
                    xf1Var3 = xf1Var5;
                } else {
                    if (xf1Var3 == xf1Var) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = hd2.a;
                        xf1 xf1Var8 = this;
                        boolean compareAndSwapObject2 = unsafe4.compareAndSwapObject(xf1Var8, q, xf1Var3, xf1Var);
                        xf1 xf1Var9 = xf1Var3;
                        xf1Var2 = xf1Var8;
                        if (compareAndSwapObject2) {
                            break loop0;
                        }
                        if (unsafe4.getObjectVolatile(xf1Var2, j) != xf1Var9) {
                            break;
                        }
                        this = xf1Var2;
                        xf1Var3 = xf1Var9;
                    }
                }
            }
            this = xf1Var2;
        }
        return xf1Var;
    }

    public final void j(xf1 xf1Var) {
        xf1 xf1Var2;
        while (true) {
            n.getClass();
            if (xf1Var == null) {
                b71.o();
                return;
            }
            Unsafe unsafe = hd2.a;
            long j = q;
            xf1 xf1Var3 = (xf1) unsafe.getObjectVolatile(xf1Var, j);
            if (this.k() != xf1Var) {
                return;
            }
            while (xf1Var != null) {
                Unsafe unsafe2 = hd2.a;
                xf1Var2 = this;
                xf1 xf1Var4 = xf1Var;
                if (unsafe2.compareAndSwapObject(xf1Var4, q, xf1Var3, xf1Var2)) {
                    if (xf1Var2.n()) {
                        xf1Var4.h();
                        return;
                    }
                    return;
                } else {
                    if (xf1Var4 == null) {
                        b71.o();
                        return;
                    }
                    xf1Var = xf1Var4;
                    if (unsafe2.getObjectVolatile(xf1Var4, j) != xf1Var3) {
                        break;
                    } else {
                        this = xf1Var2;
                    }
                }
            }
            b71.o();
            return;
            this = xf1Var2;
        }
    }

    public final Object k() {
        m.getClass();
        return hd2.a.getObjectVolatile(this, p);
    }

    public final xf1 l() {
        Object k = k();
        w82 w82Var = k instanceof w82 ? (w82) k : null;
        if (w82Var != null) {
            return w82Var.a;
        }
        k.getClass();
        return (xf1) k;
    }

    public final xf1 m() {
        xf1 h = h();
        if (h != null) {
            return h;
        }
        n.getClass();
        return i((xf1) hd2.a.getObjectVolatile(this, q));
    }

    public boolean n() {
        return k() instanceof w82;
    }

    public final xf1 o() {
        xf1 xf1Var;
        while (true) {
            Object k = this.k();
            if (k instanceof w82) {
                return ((w82) k).a;
            }
            if (k == this) {
                return (xf1) k;
            }
            k.getClass();
            xf1 xf1Var2 = (xf1) k;
            w82 p2 = xf1Var2.p();
            while (true) {
                m.getClass();
                Unsafe unsafe = hd2.a;
                long j = p;
                xf1Var = this;
                if (unsafe.compareAndSwapObject(xf1Var, j, k, p2)) {
                    xf1Var2.h();
                    return null;
                }
                if (unsafe.getObjectVolatile(xf1Var, j) != k) {
                    break;
                }
                this = xf1Var;
            }
            this = xf1Var;
        }
    }

    public final w82 p() {
        o.getClass();
        Unsafe unsafe = hd2.a;
        long j = r;
        w82 w82Var = (w82) unsafe.getObjectVolatile(this, j);
        if (w82Var != null) {
            return w82Var;
        }
        w82 w82Var2 = new w82(this);
        unsafe.putObjectVolatile(this, j, w82Var2);
        return w82Var2;
    }

    public String toString() {
        return new ga1(1, 2, o70.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + o70.x(this);
    }
}
