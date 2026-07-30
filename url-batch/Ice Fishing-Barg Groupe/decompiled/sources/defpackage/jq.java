package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class jq {
    public static final /* synthetic */ AtomicReferenceFieldUpdater PxuCJdSBwIXG = AtomicReferenceFieldUpdater.newUpdater(jq.class, Object.class, "_next$volatile");
    public static final /* synthetic */ long TSizfFm2Yiuu;
    public static final /* synthetic */ long Y1f8riQaR6yg;
    public static final /* synthetic */ AtomicReferenceFieldUpdater lS5Rgt96tfkO;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = ty1.PxuCJdSBwIXG;
        TSizfFm2Yiuu = unsafe.objectFieldOffset(jq.class.getDeclaredField("_next$volatile"));
        lS5Rgt96tfkO = AtomicReferenceFieldUpdater.newUpdater(jq.class, Object.class, "_prev$volatile");
        Y1f8riQaR6yg = unsafe.objectFieldOffset(jq.class.getDeclaredField("_prev$volatile"));
    }

    public jq(a22 a22Var) {
        this._prev$volatile = a22Var;
    }

    public final void OPXfSBeufaJ8() {
        jq jqVar;
        Unsafe unsafe;
        if (Y1f8riQaR6yg() == null) {
            return;
        }
        while (true) {
            jq TSizfFm2Yiuu2 = TSizfFm2Yiuu();
            jq Y1f8riQaR6yg2 = Y1f8riQaR6yg();
            Y1f8riQaR6yg2.getClass();
            do {
                jqVar = Y1f8riQaR6yg2;
                if (!jqVar.RAsUl2FVSrh6()) {
                    break;
                } else {
                    Y1f8riQaR6yg2 = jqVar.Y1f8riQaR6yg();
                }
            } while (Y1f8riQaR6yg2 != null);
            while (true) {
                lS5Rgt96tfkO.getClass();
                Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
                long j = Y1f8riQaR6yg;
                Object objectVolatile = unsafe2.getObjectVolatile(jqVar, j);
                jq jqVar2 = ((jq) objectVolatile) == null ? null : TSizfFm2Yiuu2;
                do {
                    unsafe = ty1.PxuCJdSBwIXG;
                    if (unsafe.compareAndSwapObject(jqVar, Y1f8riQaR6yg, objectVolatile, jqVar2)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(jqVar, j) == objectVolatile);
            }
            if (TSizfFm2Yiuu2 != null) {
                PxuCJdSBwIXG.getClass();
                unsafe.putObjectVolatile(TSizfFm2Yiuu2, TSizfFm2Yiuu, jqVar);
            }
            if (!jqVar.RAsUl2FVSrh6() || jqVar.Y1f8riQaR6yg() == null) {
                if (TSizfFm2Yiuu2 == null || !TSizfFm2Yiuu2.RAsUl2FVSrh6()) {
                    return;
                }
            }
        }
    }

    public abstract boolean RAsUl2FVSrh6();

    public final jq TSizfFm2Yiuu() {
        jq a92UlCVFR9N8 = a92UlCVFR9N8();
        while (a92UlCVFR9N8 != null && a92UlCVFR9N8.RAsUl2FVSrh6()) {
            lS5Rgt96tfkO.getClass();
            a92UlCVFR9N8 = (jq) ty1.PxuCJdSBwIXG.getObjectVolatile(a92UlCVFR9N8, Y1f8riQaR6yg);
        }
        return a92UlCVFR9N8;
    }

    public final jq Y1f8riQaR6yg() {
        Object e9gEMXR7LXtO = e9gEMXR7LXtO();
        if (e9gEMXR7LXtO == fx1.PxuCJdSBwIXG) {
            return null;
        }
        return (jq) e9gEMXR7LXtO;
    }

    public final jq a92UlCVFR9N8() {
        lS5Rgt96tfkO.getClass();
        return (jq) ty1.PxuCJdSBwIXG.getObjectVolatile(this, Y1f8riQaR6yg);
    }

    public final Object e9gEMXR7LXtO() {
        PxuCJdSBwIXG.getClass();
        return ty1.PxuCJdSBwIXG.getObjectVolatile(this, TSizfFm2Yiuu);
    }

    public final void lS5Rgt96tfkO() {
        lS5Rgt96tfkO.getClass();
        ty1.PxuCJdSBwIXG.putObjectVolatile(this, Y1f8riQaR6yg, (Object) null);
    }

    public final boolean rtx2ld2ELZv4() {
        f50 f50Var = fx1.PxuCJdSBwIXG;
        while (true) {
            PxuCJdSBwIXG.getClass();
            Unsafe unsafe = ty1.PxuCJdSBwIXG;
            long j = TSizfFm2Yiuu;
            jq jqVar = this;
            if (unsafe.compareAndSwapObject(jqVar, j, (Object) null, f50Var)) {
                return true;
            }
            if (unsafe.getObjectVolatile(jqVar, j) != null) {
                return false;
            }
            this = jqVar;
        }
    }

    public final boolean wdg6QnbFHrFF(a22 a22Var) {
        while (true) {
            PxuCJdSBwIXG.getClass();
            Unsafe unsafe = ty1.PxuCJdSBwIXG;
            long j = TSizfFm2Yiuu;
            jq jqVar = this;
            a22 a22Var2 = a22Var;
            if (unsafe.compareAndSwapObject(jqVar, j, (Object) null, a22Var2)) {
                return true;
            }
            if (unsafe.getObjectVolatile(jqVar, j) != null) {
                return false;
            }
            this = jqVar;
            a22Var = a22Var2;
        }
    }
}
