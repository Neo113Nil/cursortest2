package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class e00 extends g00 implements tu, bt {
    public static final /* synthetic */ AtomicReferenceFieldUpdater QrzZRwfaDlRX = AtomicReferenceFieldUpdater.newUpdater(e00.class, Object.class, "_reusableCancellableContinuation$volatile");
    public static final /* synthetic */ long gPXPFXrUH4XX = ty1.PxuCJdSBwIXG.objectFieldOffset(e00.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public Object cpQdD2nAriOS;
    public final ju dgRBjINgWbAK;
    public final Object r3s1LDPKFs1S;
    public final ct x50lh2ztY7Y5;

    public e00(ju juVar, ct ctVar) {
        super(-1);
        this.dgRBjINgWbAK = juVar;
        this.x50lh2ztY7Y5 = ctVar;
        this.cpQdD2nAriOS = bs0.RAsUl2FVSrh6;
        this.r3s1LDPKFs1S = hq0.xbgXKYA2cIfu(ctVar.e9gEMXR7LXtO());
    }

    public final Throwable EcgxDIVH5in8(bi biVar) {
        Unsafe unsafe;
        e00 e00Var;
        bi biVar2;
        while (true) {
            QrzZRwfaDlRX.getClass();
            Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
            long j = gPXPFXrUH4XX;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            f50 f50Var = bs0.rtx2ld2ELZv4;
            if (objectVolatile != f50Var) {
                e00 e00Var2 = this;
                if (!(objectVolatile instanceof Throwable)) {
                    u9.BRwzKIf41E4i(objectVolatile, "Inconsistent state ");
                    return null;
                }
                do {
                    unsafe = ty1.PxuCJdSBwIXG;
                    if (unsafe.compareAndSwapObject(e00Var2, gPXPFXrUH4XX, objectVolatile, (Object) null)) {
                        return (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(e00Var2, j) == objectVolatile);
                u9.XL4ISE6Oc65B("Failed requirement.");
                return null;
            }
            while (true) {
                Unsafe unsafe3 = ty1.PxuCJdSBwIXG;
                e00Var = this;
                biVar2 = biVar;
                if (unsafe3.compareAndSwapObject(e00Var, gPXPFXrUH4XX, f50Var, biVar2)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(e00Var, j) != f50Var) {
                    break;
                }
                this = e00Var;
                biVar = biVar2;
            }
            this = e00Var;
            biVar = biVar2;
        }
    }

    @Override // defpackage.bt
    public final void RAsUl2FVSrh6(Object obj) {
        Throwable PxuCJdSBwIXG = vv1.PxuCJdSBwIXG(obj);
        Object smVar = PxuCJdSBwIXG == null ? obj : new sm(PxuCJdSBwIXG, false);
        ct ctVar = this.x50lh2ztY7Y5;
        hu e9gEMXR7LXtO = ctVar.e9gEMXR7LXtO();
        ju juVar = this.dgRBjINgWbAK;
        if (juVar.POWyO8hTM6YC(e9gEMXR7LXtO)) {
            this.cpQdD2nAriOS = smVar;
            this.wdg6QnbFHrFF = 0;
            juVar.Pf0ThKz3j5YS(ctVar.e9gEMXR7LXtO(), this);
            return;
        }
        t60 PxuCJdSBwIXG2 = nj2.PxuCJdSBwIXG();
        if (PxuCJdSBwIXG2.wdg6QnbFHrFF >= 4294967296L) {
            this.cpQdD2nAriOS = smVar;
            this.wdg6QnbFHrFF = 0;
            PxuCJdSBwIXG2.wLFCmsViZrNT(this);
            return;
        }
        PxuCJdSBwIXG2.xbgXKYA2cIfu(true);
        try {
            hu e9gEMXR7LXtO2 = ctVar.e9gEMXR7LXtO();
            Object JHNfcAUfKc4G = hq0.JHNfcAUfKc4G(e9gEMXR7LXtO2, this.r3s1LDPKFs1S);
            try {
                ctVar.RAsUl2FVSrh6(obj);
                while (PxuCJdSBwIXG2.IXK6ba3ucyzm()) {
                }
            } finally {
                hq0.Pf0ThKz3j5YS(e9gEMXR7LXtO2, JHNfcAUfKc4G);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final boolean RfyTYNmI9Srp(Throwable th) {
        e00 e00Var;
        Throwable th2;
        Unsafe unsafe;
        while (true) {
            QrzZRwfaDlRX.getClass();
            Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
            long j = gPXPFXrUH4XX;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            f50 f50Var = bs0.rtx2ld2ELZv4;
            if (cs0.wdg6QnbFHrFF(objectVolatile, f50Var)) {
                while (true) {
                    Unsafe unsafe3 = ty1.PxuCJdSBwIXG;
                    e00 e00Var2 = this;
                    th2 = th;
                    e00Var = e00Var2;
                    if (unsafe3.compareAndSwapObject(e00Var2, gPXPFXrUH4XX, f50Var, th2)) {
                        return true;
                    }
                    if (unsafe3.getObjectVolatile(e00Var, j) != f50Var) {
                        break;
                    }
                    this = e00Var;
                    th = th2;
                }
            } else {
                e00Var = this;
                th2 = th;
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe = ty1.PxuCJdSBwIXG;
                    if (unsafe.compareAndSwapObject(e00Var, gPXPFXrUH4XX, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(e00Var, j) == objectVolatile);
            }
            this = e00Var;
            th = th2;
        }
    }

    @Override // defpackage.tu
    public final tu TSizfFm2Yiuu() {
        return this.x50lh2ztY7Y5;
    }

    public final boolean XL4ISE6Oc65B() {
        QrzZRwfaDlRX.getClass();
        return ty1.PxuCJdSBwIXG.getObjectVolatile(this, gPXPFXrUH4XX) != null;
    }

    public final void cpQdD2nAriOS() {
        do {
            QrzZRwfaDlRX.getClass();
        } while (ty1.PxuCJdSBwIXG.getObjectVolatile(this, gPXPFXrUH4XX) == bs0.rtx2ld2ELZv4);
    }

    @Override // defpackage.bt
    public final hu e9gEMXR7LXtO() {
        return this.x50lh2ztY7Y5.e9gEMXR7LXtO();
    }

    public final bi gPXPFXrUH4XX() {
        QrzZRwfaDlRX.getClass();
        Object objectVolatile = ty1.PxuCJdSBwIXG.getObjectVolatile(this, gPXPFXrUH4XX);
        if (objectVolatile instanceof bi) {
            return (bi) objectVolatile;
        }
        return null;
    }

    public final bi r3s1LDPKFs1S() {
        e00 e00Var;
        f50 f50Var = bs0.rtx2ld2ELZv4;
        while (true) {
            QrzZRwfaDlRX.getClass();
            Unsafe unsafe = ty1.PxuCJdSBwIXG;
            long j = gPXPFXrUH4XX;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, f50Var);
                return null;
            }
            if (objectVolatile instanceof bi) {
                while (true) {
                    Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
                    e00 e00Var2 = this;
                    boolean compareAndSwapObject = unsafe2.compareAndSwapObject(e00Var2, gPXPFXrUH4XX, objectVolatile, f50Var);
                    e00Var = e00Var2;
                    if (compareAndSwapObject) {
                        return (bi) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(e00Var, j) != objectVolatile) {
                        break;
                    }
                    this = e00Var;
                }
            } else {
                e00Var = this;
                if (objectVolatile != f50Var && !(objectVolatile instanceof Throwable)) {
                    u9.BRwzKIf41E4i(objectVolatile, "Inconsistent state ");
                    return null;
                }
            }
            this = e00Var;
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.dgRBjINgWbAK + ", " + zv.nxJAScVArhE9(this.x50lh2ztY7Y5) + ']';
    }

    @Override // defpackage.g00
    public final Object x50lh2ztY7Y5() {
        Object obj = this.cpQdD2nAriOS;
        this.cpQdD2nAriOS = bs0.RAsUl2FVSrh6;
        return obj;
    }

    @Override // defpackage.g00
    public final bt Y1f8riQaR6yg() {
        return this;
    }
}
