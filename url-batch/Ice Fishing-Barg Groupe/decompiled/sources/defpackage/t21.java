package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class t21 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater OPXfSBeufaJ8;
    public static final /* synthetic */ long cpQdD2nAriOS;
    public static final /* synthetic */ long dgRBjINgWbAK;
    public static final /* synthetic */ AtomicReferenceFieldUpdater rtx2ld2ELZv4 = AtomicReferenceFieldUpdater.newUpdater(t21.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater wdg6QnbFHrFF;
    public static final /* synthetic */ long x50lh2ztY7Y5;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = ty1.PxuCJdSBwIXG;
        dgRBjINgWbAK = unsafe.objectFieldOffset(t21.class.getDeclaredField("_next$volatile"));
        OPXfSBeufaJ8 = AtomicReferenceFieldUpdater.newUpdater(t21.class, Object.class, "_prev$volatile");
        x50lh2ztY7Y5 = unsafe.objectFieldOffset(t21.class.getDeclaredField("_prev$volatile"));
        wdg6QnbFHrFF = AtomicReferenceFieldUpdater.newUpdater(t21.class, Object.class, "_removedRef$volatile");
        cpQdD2nAriOS = unsafe.objectFieldOffset(t21.class.getDeclaredField("_removedRef$volatile"));
    }

    public static t21 OPXfSBeufaJ8(t21 t21Var) {
        while (t21Var.r3s1LDPKFs1S()) {
            OPXfSBeufaJ8.getClass();
            t21Var = (t21) ty1.PxuCJdSBwIXG.getObjectVolatile(t21Var, x50lh2ztY7Y5);
        }
        return t21Var;
    }

    public final t21 QrzZRwfaDlRX() {
        t21 t21Var;
        while (true) {
            Object dgRBjINgWbAK2 = this.dgRBjINgWbAK();
            if (dgRBjINgWbAK2 instanceof pu1) {
                return ((pu1) dgRBjINgWbAK2).PxuCJdSBwIXG;
            }
            if (dgRBjINgWbAK2 == this) {
                return (t21) dgRBjINgWbAK2;
            }
            dgRBjINgWbAK2.getClass();
            t21 t21Var2 = (t21) dgRBjINgWbAK2;
            pu1 gPXPFXrUH4XX = t21Var2.gPXPFXrUH4XX();
            while (true) {
                rtx2ld2ELZv4.getClass();
                Unsafe unsafe = ty1.PxuCJdSBwIXG;
                long j = dgRBjINgWbAK;
                t21Var = this;
                if (unsafe.compareAndSwapObject(t21Var, j, dgRBjINgWbAK2, gPXPFXrUH4XX)) {
                    t21Var2.rtx2ld2ELZv4();
                    return null;
                }
                if (unsafe.getObjectVolatile(t21Var, j) != dgRBjINgWbAK2) {
                    break;
                }
                this = t21Var;
            }
            this = t21Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        r9 = r4;
        r10 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void RAsUl2FVSrh6(rd1 rd1Var) {
        OPXfSBeufaJ8.getClass();
        Unsafe unsafe = ty1.PxuCJdSBwIXG;
        unsafe.putObjectVolatile(rd1Var, x50lh2ztY7Y5, this);
        rtx2ld2ELZv4.getClass();
        long j = dgRBjINgWbAK;
        unsafe.putObjectVolatile(rd1Var, j, this);
        while (this.dgRBjINgWbAK() == this) {
            while (true) {
                Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
                t21 t21Var = this;
                rd1 rd1Var2 = rd1Var;
                if (unsafe2.compareAndSwapObject(t21Var, dgRBjINgWbAK, this, rd1Var2)) {
                    rd1Var2.wdg6QnbFHrFF(t21Var);
                    return;
                } else {
                    if (unsafe2.getObjectVolatile(t21Var, j) != t21Var) {
                        break;
                    }
                    this = t21Var;
                    rd1Var = rd1Var2;
                }
            }
        }
    }

    public final boolean a92UlCVFR9N8(t21 t21Var, t21 t21Var2) {
        OPXfSBeufaJ8.getClass();
        Unsafe unsafe = ty1.PxuCJdSBwIXG;
        unsafe.putObjectVolatile(t21Var, x50lh2ztY7Y5, this);
        rtx2ld2ELZv4.getClass();
        long j = dgRBjINgWbAK;
        unsafe.putObjectVolatile(t21Var, j, t21Var2);
        while (true) {
            Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
            t21 t21Var3 = this;
            t21 t21Var4 = t21Var;
            t21 t21Var5 = t21Var2;
            if (unsafe2.compareAndSwapObject(t21Var3, dgRBjINgWbAK, t21Var5, t21Var4)) {
                t21Var4.wdg6QnbFHrFF(t21Var5);
                return true;
            }
            if (unsafe2.getObjectVolatile(t21Var3, j) != t21Var5) {
                return false;
            }
            this = t21Var3;
            t21Var2 = t21Var5;
            t21Var = t21Var4;
        }
    }

    public final t21 cpQdD2nAriOS() {
        t21 rtx2ld2ELZv42 = rtx2ld2ELZv4();
        if (rtx2ld2ELZv42 != null) {
            return rtx2ld2ELZv42;
        }
        OPXfSBeufaJ8.getClass();
        return OPXfSBeufaJ8((t21) ty1.PxuCJdSBwIXG.getObjectVolatile(this, x50lh2ztY7Y5));
    }

    public final Object dgRBjINgWbAK() {
        rtx2ld2ELZv4.getClass();
        return ty1.PxuCJdSBwIXG.getObjectVolatile(this, dgRBjINgWbAK);
    }

    public final boolean e9gEMXR7LXtO(t21 t21Var, int i) {
        t21 cpQdD2nAriOS2;
        do {
            cpQdD2nAriOS2 = cpQdD2nAriOS();
            if (cpQdD2nAriOS2 instanceof a21) {
                return (((a21) cpQdD2nAriOS2).r3s1LDPKFs1S & i) == 0 && cpQdD2nAriOS2.e9gEMXR7LXtO(t21Var, i);
            }
        } while (!cpQdD2nAriOS2.a92UlCVFR9N8(t21Var, this));
        return true;
    }

    public final pu1 gPXPFXrUH4XX() {
        wdg6QnbFHrFF.getClass();
        Unsafe unsafe = ty1.PxuCJdSBwIXG;
        long j = cpQdD2nAriOS;
        pu1 pu1Var = (pu1) unsafe.getObjectVolatile(this, j);
        if (pu1Var != null) {
            return pu1Var;
        }
        pu1 pu1Var2 = new pu1(this);
        unsafe.putObjectVolatile(this, j, pu1Var2);
        return pu1Var2;
    }

    public boolean r3s1LDPKFs1S() {
        return dgRBjINgWbAK() instanceof pu1;
    }

    public final t21 rtx2ld2ELZv4() {
        t21 t21Var;
        t21 t21Var2;
        Unsafe unsafe;
        loop0: while (true) {
            OPXfSBeufaJ8.getClass();
            Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
            long j = x50lh2ztY7Y5;
            t21 t21Var3 = (t21) unsafe2.getObjectVolatile(this, j);
            t21 t21Var4 = null;
            t21Var = t21Var3;
            while (true) {
                rtx2ld2ELZv4.getClass();
                if (t21Var == null) {
                    u9.VhhvGxCb8gfr();
                    return null;
                }
                Unsafe unsafe3 = ty1.PxuCJdSBwIXG;
                long j2 = dgRBjINgWbAK;
                Object objectVolatile = unsafe3.getObjectVolatile(t21Var, j2);
                if (objectVolatile != this) {
                    t21 t21Var5 = t21Var3;
                    t21Var2 = this;
                    if (t21Var2.r3s1LDPKFs1S()) {
                        return null;
                    }
                    if (!(objectVolatile instanceof pu1)) {
                        objectVolatile.getClass();
                        t21Var4 = t21Var;
                        t21Var = (t21) objectVolatile;
                    } else if (t21Var4 != null) {
                        t21 t21Var6 = ((pu1) objectVolatile).PxuCJdSBwIXG;
                        do {
                            t21 t21Var7 = t21Var;
                            unsafe = ty1.PxuCJdSBwIXG;
                            boolean compareAndSwapObject = unsafe.compareAndSwapObject(t21Var4, dgRBjINgWbAK, t21Var7, t21Var6);
                            t21Var = t21Var7;
                            if (compareAndSwapObject) {
                                this = t21Var2;
                                t21Var = t21Var4;
                                t21Var3 = t21Var5;
                                t21Var4 = null;
                            }
                        } while (unsafe.getObjectVolatile(t21Var4, j2) == t21Var);
                    } else {
                        if (t21Var == null) {
                            u9.VhhvGxCb8gfr();
                            return null;
                        }
                        t21Var = (t21) unsafe3.getObjectVolatile(t21Var, j);
                    }
                    this = t21Var2;
                    t21Var3 = t21Var5;
                } else {
                    if (t21Var3 == t21Var) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = ty1.PxuCJdSBwIXG;
                        t21 t21Var8 = this;
                        boolean compareAndSwapObject2 = unsafe4.compareAndSwapObject(t21Var8, x50lh2ztY7Y5, t21Var3, t21Var);
                        t21 t21Var9 = t21Var3;
                        t21Var2 = t21Var8;
                        if (compareAndSwapObject2) {
                            break loop0;
                        }
                        if (unsafe4.getObjectVolatile(t21Var2, j) != t21Var9) {
                            break;
                        }
                        this = t21Var2;
                        t21Var3 = t21Var9;
                    }
                }
            }
            this = t21Var2;
        }
        return t21Var;
    }

    public String toString() {
        return new az0(1, 1, zv.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + zv.VhhvGxCb8gfr(this);
    }

    public final void wdg6QnbFHrFF(t21 t21Var) {
        t21 t21Var2;
        while (true) {
            OPXfSBeufaJ8.getClass();
            if (t21Var == null) {
                u9.VhhvGxCb8gfr();
                return;
            }
            Unsafe unsafe = ty1.PxuCJdSBwIXG;
            long j = x50lh2ztY7Y5;
            t21 t21Var3 = (t21) unsafe.getObjectVolatile(t21Var, j);
            if (this.dgRBjINgWbAK() != t21Var) {
                return;
            }
            while (t21Var != null) {
                Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
                t21Var2 = this;
                t21 t21Var4 = t21Var;
                if (unsafe2.compareAndSwapObject(t21Var4, x50lh2ztY7Y5, t21Var3, t21Var2)) {
                    if (t21Var2.r3s1LDPKFs1S()) {
                        t21Var4.rtx2ld2ELZv4();
                        return;
                    }
                    return;
                } else {
                    if (t21Var4 == null) {
                        u9.VhhvGxCb8gfr();
                        return;
                    }
                    t21Var = t21Var4;
                    if (unsafe2.getObjectVolatile(t21Var4, j) != t21Var3) {
                        break;
                    } else {
                        this = t21Var2;
                    }
                }
            }
            u9.VhhvGxCb8gfr();
            return;
            this = t21Var2;
        }
    }

    public final t21 x50lh2ztY7Y5() {
        Object dgRBjINgWbAK2 = dgRBjINgWbAK();
        pu1 pu1Var = dgRBjINgWbAK2 instanceof pu1 ? (pu1) dgRBjINgWbAK2 : null;
        if (pu1Var != null) {
            return pu1Var.PxuCJdSBwIXG;
        }
        dgRBjINgWbAK2.getClass();
        return (t21) dgRBjINgWbAK2;
    }
}
