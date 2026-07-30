package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class bi extends g00 implements zh, tu, xr2 {
    public static final /* synthetic */ long BRwzKIf41E4i;
    public static final /* synthetic */ AtomicReferenceFieldUpdater QrzZRwfaDlRX;
    public static final /* synthetic */ long gPXPFXrUH4XX;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final bt dgRBjINgWbAK;
    public final hu x50lh2ztY7Y5;
    public static final /* synthetic */ AtomicIntegerFieldUpdater cpQdD2nAriOS = AtomicIntegerFieldUpdater.newUpdater(bi.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater r3s1LDPKFs1S = AtomicReferenceFieldUpdater.newUpdater(bi.class, Object.class, "_state$volatile");

    static {
        Unsafe unsafe = ty1.PxuCJdSBwIXG;
        BRwzKIf41E4i = unsafe.objectFieldOffset(bi.class.getDeclaredField("_state$volatile"));
        QrzZRwfaDlRX = AtomicReferenceFieldUpdater.newUpdater(bi.class, Object.class, "_parentHandle$volatile");
        gPXPFXrUH4XX = unsafe.objectFieldOffset(bi.class.getDeclaredField("_parentHandle$volatile"));
    }

    public bi(int i, bt btVar) {
        super(i);
        this.dgRBjINgWbAK = btVar;
        this.x50lh2ztY7Y5 = btVar.e9gEMXR7LXtO();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = qYgDo2Ye5PY7.PxuCJdSBwIXG;
    }

    public static Object J54yh1s3n4Aq(be1 be1Var, Object obj, int i, qe0 qe0Var) {
        if (obj instanceof sm) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (qe0Var != null || (be1Var instanceof wh)) {
            return new qm(obj, be1Var instanceof wh ? (wh) be1Var : null, qe0Var, (Throwable) null, 16);
        }
        return obj;
    }

    public static void aF05bpZJlKEP(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    @Override // defpackage.zh
    public final void BRwzKIf41E4i(Object obj) {
        RfyTYNmI9Srp(this.wdg6QnbFHrFF);
    }

    public final boolean BjEWd04qc7Mw() {
        r3s1LDPKFs1S.getClass();
        Unsafe unsafe = ty1.PxuCJdSBwIXG;
        long j = BRwzKIf41E4i;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if ((objectVolatile instanceof qm) && ((qm) objectVolatile).Y1f8riQaR6yg != null) {
            XL4ISE6Oc65B();
            return false;
        }
        cpQdD2nAriOS.set(this, 536870911);
        unsafe.putObjectVolatile(this, j, qYgDo2Ye5PY7.PxuCJdSBwIXG);
        return true;
    }

    public Throwable EcgxDIVH5in8(et0 et0Var) {
        return et0Var.pnx5pC0XzaCw();
    }

    public final f50 EpkonXwzFgDB(Object obj, qe0 qe0Var) {
        bi biVar;
        f50 f50Var = b51.PxuCJdSBwIXG;
        while (true) {
            r3s1LDPKFs1S.getClass();
            Unsafe unsafe = ty1.PxuCJdSBwIXG;
            long j = BRwzKIf41E4i;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof be1)) {
                return null;
            }
            Object J54yh1s3n4Aq = J54yh1s3n4Aq((be1) objectVolatile, obj, this.wdg6QnbFHrFF, qe0Var);
            while (true) {
                Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
                biVar = this;
                if (unsafe2.compareAndSwapObject(biVar, BRwzKIf41E4i, objectVolatile, J54yh1s3n4Aq)) {
                    if (!biVar.jyegZNwi31qc()) {
                        biVar.XL4ISE6Oc65B();
                    }
                    return f50Var;
                }
                if (unsafe2.getObjectVolatile(biVar, j) != objectVolatile) {
                    break;
                }
                this = biVar;
            }
            this = biVar;
        }
    }

    public final void IAToe7bXGz4N(le0 le0Var) {
        e6tOsSdd2EFb(new vh(1, le0Var));
    }

    @Override // defpackage.xr2
    public final void PxuCJdSBwIXG(a22 a22Var, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = cpQdD2nAriOS;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                u9.rtx2ld2ELZv4("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        e6tOsSdd2EFb(a22Var);
    }

    @Override // defpackage.zh
    public final boolean QrzZRwfaDlRX(Throwable th) {
        bi biVar;
        while (true) {
            r3s1LDPKFs1S.getClass();
            Unsafe unsafe = ty1.PxuCJdSBwIXG;
            long j = BRwzKIf41E4i;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof be1)) {
                return false;
            }
            ei eiVar = new ei(this, th, (objectVolatile instanceof wh) || (objectVolatile instanceof a22));
            while (true) {
                Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
                biVar = this;
                if (unsafe2.compareAndSwapObject(biVar, BRwzKIf41E4i, objectVolatile, eiVar)) {
                    be1 be1Var = (be1) objectVolatile;
                    if (be1Var instanceof wh) {
                        biVar.cpQdD2nAriOS((wh) objectVolatile, th);
                    } else if (be1Var instanceof a22) {
                        biVar.gPXPFXrUH4XX((a22) objectVolatile, th);
                    }
                    if (!biVar.jyegZNwi31qc()) {
                        biVar.XL4ISE6Oc65B();
                    }
                    biVar.RfyTYNmI9Srp(biVar.wdg6QnbFHrFF);
                    return true;
                }
                if (unsafe2.getObjectVolatile(biVar, j) != objectVolatile) {
                    break;
                }
                this = biVar;
            }
            this = biVar;
        }
    }

    @Override // defpackage.bt
    public final void RAsUl2FVSrh6(Object obj) {
        Throwable PxuCJdSBwIXG = vv1.PxuCJdSBwIXG(obj);
        if (PxuCJdSBwIXG != null) {
            obj = new sm(PxuCJdSBwIXG, false);
        }
        ozEBbv0hFTAB(obj, this.wdg6QnbFHrFF, null);
    }

    public final void RfyTYNmI9Srp(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = cpQdD2nAriOS;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    u9.rtx2ld2ELZv4("Already resumed");
                    return;
                }
                boolean z = i == 4;
                bt btVar = this.dgRBjINgWbAK;
                if (!z && (btVar instanceof e00)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.wdg6QnbFHrFF;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        e00 e00Var = (e00) btVar;
                        ju juVar = e00Var.dgRBjINgWbAK;
                        hu e9gEMXR7LXtO = e00Var.x50lh2ztY7Y5.e9gEMXR7LXtO();
                        if (juVar.POWyO8hTM6YC(e9gEMXR7LXtO)) {
                            juVar.Pf0ThKz3j5YS(e9gEMXR7LXtO, this);
                            return;
                        }
                        t60 PxuCJdSBwIXG = nj2.PxuCJdSBwIXG();
                        if (PxuCJdSBwIXG.wdg6QnbFHrFF >= 4294967296L) {
                            PxuCJdSBwIXG.wLFCmsViZrNT(this);
                            return;
                        }
                        PxuCJdSBwIXG.xbgXKYA2cIfu(true);
                        try {
                            ov2.POWyO8hTM6YC(this, btVar, true);
                            do {
                            } while (PxuCJdSBwIXG.IXK6ba3ucyzm());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                ov2.POWyO8hTM6YC(this, btVar, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public final Object S2OOm9zPNm0h() {
        r3s1LDPKFs1S.getClass();
        return ty1.PxuCJdSBwIXG.getObjectVolatile(this, BRwzKIf41E4i);
    }

    public final s00 S9EYkSpbGuxq() {
        QrzZRwfaDlRX.getClass();
        return (s00) ty1.PxuCJdSBwIXG.getObjectVolatile(this, gPXPFXrUH4XX);
    }

    @Override // defpackage.tu
    public final tu TSizfFm2Yiuu() {
        bt btVar = this.dgRBjINgWbAK;
        if (btVar instanceof tu) {
            return (tu) btVar;
        }
        return null;
    }

    public final Object VhhvGxCb8gfr() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        xs0 xs0Var;
        boolean jyegZNwi31qc = jyegZNwi31qc();
        do {
            atomicIntegerFieldUpdater = cpQdD2nAriOS;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    u9.rtx2ld2ELZv4("Already suspended");
                    return null;
                }
                if (jyegZNwi31qc) {
                    rZjpSjn4zoMv();
                }
                Object S2OOm9zPNm0h = S2OOm9zPNm0h();
                if (S2OOm9zPNm0h instanceof sm) {
                    throw ((sm) S2OOm9zPNm0h).PxuCJdSBwIXG;
                }
                int i3 = this.wdg6QnbFHrFF;
                if ((i3 != 1 && i3 != 2) || (xs0Var = (xs0) this.x50lh2ztY7Y5.S2OOm9zPNm0h(ih0.BRwzKIf41E4i)) == null || xs0Var.lS5Rgt96tfkO()) {
                    return rtx2ld2ELZv4(S2OOm9zPNm0h);
                }
                CancellationException pnx5pC0XzaCw = xs0Var.pnx5pC0XzaCw();
                lS5Rgt96tfkO(pnx5pC0XzaCw);
                throw pnx5pC0XzaCw;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (S9EYkSpbGuxq() == null) {
            pnx5pC0XzaCw();
        }
        if (jyegZNwi31qc) {
            rZjpSjn4zoMv();
        }
        return su.rtx2ld2ELZv4;
    }

    public final void XL4ISE6Oc65B() {
        s00 S9EYkSpbGuxq = S9EYkSpbGuxq();
        if (S9EYkSpbGuxq == null) {
            return;
        }
        S9EYkSpbGuxq.PxuCJdSBwIXG();
        QrzZRwfaDlRX.getClass();
        ty1.PxuCJdSBwIXG.putObjectVolatile(this, gPXPFXrUH4XX, wd1.rtx2ld2ELZv4);
    }

    @Override // defpackage.g00
    public final bt Y1f8riQaR6yg() {
        return this.dgRBjINgWbAK;
    }

    public final void ZbWwgt3aGe7A() {
        s00 pnx5pC0XzaCw = pnx5pC0XzaCw();
        if (pnx5pC0XzaCw == null || (S2OOm9zPNm0h() instanceof be1)) {
            return;
        }
        pnx5pC0XzaCw.PxuCJdSBwIXG();
        QrzZRwfaDlRX.getClass();
        ty1.PxuCJdSBwIXG.putObjectVolatile(this, gPXPFXrUH4XX, wd1.rtx2ld2ELZv4);
    }

    @Override // defpackage.g00
    public final Throwable a92UlCVFR9N8(Object obj) {
        Throwable a92UlCVFR9N8 = super.a92UlCVFR9N8(obj);
        if (a92UlCVFR9N8 != null) {
            return a92UlCVFR9N8;
        }
        return null;
    }

    public final void cpQdD2nAriOS(wh whVar, Throwable th) {
        try {
            whVar.PxuCJdSBwIXG(th);
        } catch (Throwable th2) {
            bs0.S2OOm9zPNm0h(this.x50lh2ztY7Y5, new tm("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.zh
    public final f50 dgRBjINgWbAK(Object obj, qe0 qe0Var) {
        return EpkonXwzFgDB(obj, qe0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ce, code lost:
    
        aF05bpZJlKEP(r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d1, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e6tOsSdd2EFb(be1 be1Var) {
        bi biVar;
        Unsafe unsafe;
        bi biVar2;
        while (true) {
            r3s1LDPKFs1S.getClass();
            Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
            long j = BRwzKIf41E4i;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof qYgDo2Ye5PY7) {
                while (true) {
                    Unsafe unsafe3 = ty1.PxuCJdSBwIXG;
                    biVar = this;
                    if (unsafe3.compareAndSwapObject(biVar, BRwzKIf41E4i, objectVolatile, be1Var)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(biVar, j) != objectVolatile) {
                        break;
                    } else {
                        this = biVar;
                    }
                }
            } else {
                biVar = this;
                if ((objectVolatile instanceof wh) || (objectVolatile instanceof a22)) {
                    break;
                }
                if (objectVolatile instanceof sm) {
                    sm smVar = (sm) objectVolatile;
                    if (!sm.lS5Rgt96tfkO.compareAndSet(smVar, 0, 1)) {
                        aF05bpZJlKEP(be1Var, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof ei) {
                        Throwable th = smVar.PxuCJdSBwIXG;
                        if (be1Var instanceof wh) {
                            biVar.cpQdD2nAriOS((wh) be1Var, th);
                            return;
                        } else {
                            be1Var.getClass();
                            biVar.gPXPFXrUH4XX((a22) be1Var, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof qm) {
                    qm qmVar = (qm) objectVolatile;
                    if (qmVar.lS5Rgt96tfkO != null) {
                        aF05bpZJlKEP(be1Var, objectVolatile);
                        throw null;
                    }
                    if (be1Var instanceof a22) {
                        return;
                    }
                    be1Var.getClass();
                    wh whVar = (wh) be1Var;
                    Throwable th2 = qmVar.e9gEMXR7LXtO;
                    if (th2 != null) {
                        biVar.cpQdD2nAriOS(whVar, th2);
                        return;
                    }
                    qm PxuCJdSBwIXG = qm.PxuCJdSBwIXG(qmVar, whVar, null, 29);
                    do {
                        unsafe = ty1.PxuCJdSBwIXG;
                        biVar2 = biVar;
                        if (unsafe.compareAndSwapObject(biVar, BRwzKIf41E4i, objectVolatile, PxuCJdSBwIXG)) {
                            return;
                        } else {
                            biVar = biVar2;
                        }
                    } while (unsafe.getObjectVolatile(biVar2, j) == objectVolatile);
                } else {
                    bi biVar3 = biVar;
                    if (be1Var instanceof a22) {
                        return;
                    }
                    be1Var.getClass();
                    qm qmVar2 = new qm(objectVolatile, (wh) be1Var, (qe0) null, (Throwable) null, 28);
                    while (true) {
                        qm qmVar3 = qmVar2;
                        Unsafe unsafe4 = ty1.PxuCJdSBwIXG;
                        biVar = biVar3;
                        boolean compareAndSwapObject = unsafe4.compareAndSwapObject(biVar, BRwzKIf41E4i, objectVolatile, qmVar3);
                        qmVar2 = qmVar3;
                        if (compareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(biVar, j) != objectVolatile) {
                            break;
                        } else {
                            biVar3 = biVar;
                        }
                    }
                }
            }
            this = biVar;
        }
    }

    @Override // defpackage.bt
    public final hu e9gEMXR7LXtO() {
        return this.x50lh2ztY7Y5;
    }

    public final void gPXPFXrUH4XX(a22 a22Var, Throwable th) {
        hu huVar = this.x50lh2ztY7Y5;
        int i = cpQdD2nAriOS.get(this) & 536870911;
        if (i == 536870911) {
            u9.rtx2ld2ELZv4("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            a22Var.cpQdD2nAriOS(i, huVar);
        } catch (Throwable th2) {
            bs0.S2OOm9zPNm0h(huVar, new tm("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final boolean jyegZNwi31qc() {
        return this.wdg6QnbFHrFF == 2 && ((e00) this.dgRBjINgWbAK).XL4ISE6Oc65B();
    }

    public String kpCQ9veP6n3I() {
        return "CancellableContinuation";
    }

    @Override // defpackage.g00
    public final void lS5Rgt96tfkO(CancellationException cancellationException) {
        CancellationException cancellationException2;
        bi biVar;
        while (true) {
            r3s1LDPKFs1S.getClass();
            Unsafe unsafe = ty1.PxuCJdSBwIXG;
            long j = BRwzKIf41E4i;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof be1) {
                u9.rtx2ld2ELZv4("Not completed");
                return;
            }
            if (objectVolatile instanceof sm) {
                return;
            }
            if (objectVolatile instanceof qm) {
                qm qmVar = (qm) objectVolatile;
                if (qmVar.e9gEMXR7LXtO != null) {
                    u9.rtx2ld2ELZv4("Must be called at most once");
                    return;
                }
                qm PxuCJdSBwIXG = qm.PxuCJdSBwIXG(qmVar, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
                    bi biVar2 = this;
                    if (unsafe2.compareAndSwapObject(biVar2, BRwzKIf41E4i, objectVolatile, PxuCJdSBwIXG)) {
                        wh whVar = qmVar.lS5Rgt96tfkO;
                        if (whVar != null) {
                            biVar2.cpQdD2nAriOS(whVar, cancellationException);
                        }
                        qe0 qe0Var = qmVar.TSizfFm2Yiuu;
                        if (qe0Var != null) {
                            biVar2.r3s1LDPKFs1S(qe0Var, cancellationException, qmVar.PxuCJdSBwIXG);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(biVar2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        biVar = biVar2;
                        break;
                    }
                    this = biVar2;
                }
            } else {
                bi biVar3 = this;
                CancellationException cancellationException3 = cancellationException;
                qm qmVar2 = new qm(objectVolatile, (wh) null, (qe0) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    qm qmVar3 = qmVar2;
                    Unsafe unsafe3 = ty1.PxuCJdSBwIXG;
                    biVar = biVar3;
                    boolean compareAndSwapObject = unsafe3.compareAndSwapObject(biVar, BRwzKIf41E4i, objectVolatile, qmVar3);
                    qmVar2 = qmVar3;
                    if (compareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(biVar, j) != objectVolatile) {
                        break;
                    } else {
                        biVar3 = biVar;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = biVar;
        }
    }

    public final void ozEBbv0hFTAB(Object obj, int i, qe0 qe0Var) {
        bi biVar;
        while (true) {
            r3s1LDPKFs1S.getClass();
            Unsafe unsafe = ty1.PxuCJdSBwIXG;
            long j = BRwzKIf41E4i;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof be1)) {
                bi biVar2 = this;
                if (objectVolatile instanceof ei) {
                    ei eiVar = (ei) objectVolatile;
                    if (ei.TSizfFm2Yiuu.compareAndSet(eiVar, 0, 1)) {
                        if (qe0Var != null) {
                            biVar2.r3s1LDPKFs1S(qe0Var, eiVar.PxuCJdSBwIXG, obj);
                            return;
                        }
                        return;
                    }
                }
                u9.BRwzKIf41E4i(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object J54yh1s3n4Aq = J54yh1s3n4Aq((be1) objectVolatile, obj, i, qe0Var);
            while (true) {
                Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
                biVar = this;
                if (unsafe2.compareAndSwapObject(biVar, BRwzKIf41E4i, objectVolatile, J54yh1s3n4Aq)) {
                    if (!biVar.jyegZNwi31qc()) {
                        biVar.XL4ISE6Oc65B();
                    }
                    biVar.RfyTYNmI9Srp(i);
                    return;
                } else if (unsafe2.getObjectVolatile(biVar, j) != objectVolatile) {
                    break;
                } else {
                    this = biVar;
                }
            }
            this = biVar;
        }
    }

    public final s00 pnx5pC0XzaCw() {
        xs0 xs0Var = (xs0) this.x50lh2ztY7Y5.S2OOm9zPNm0h(ih0.BRwzKIf41E4i);
        if (xs0Var == null) {
            return null;
        }
        s00 amuv7NJvPxHu = ki0.amuv7NJvPxHu(xs0Var, true, new rj(this));
        while (true) {
            QrzZRwfaDlRX.getClass();
            Unsafe unsafe = ty1.PxuCJdSBwIXG;
            long j = gPXPFXrUH4XX;
            bi biVar = this;
            if (!unsafe.compareAndSwapObject(biVar, j, (Object) null, amuv7NJvPxHu) && unsafe.getObjectVolatile(biVar, j) == null) {
                this = biVar;
            }
        }
        return amuv7NJvPxHu;
    }

    public final void r3s1LDPKFs1S(qe0 qe0Var, Throwable th, Object obj) {
        hu huVar = this.x50lh2ztY7Y5;
        try {
            qe0Var.a92UlCVFR9N8(th, obj, huVar);
        } catch (Throwable th2) {
            bs0.S2OOm9zPNm0h(huVar, new tm("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void rZjpSjn4zoMv() {
        Throwable EcgxDIVH5in8;
        bt btVar = this.dgRBjINgWbAK;
        e00 e00Var = btVar instanceof e00 ? (e00) btVar : null;
        if (e00Var == null || (EcgxDIVH5in8 = e00Var.EcgxDIVH5in8(this)) == null) {
            return;
        }
        XL4ISE6Oc65B();
        QrzZRwfaDlRX(EcgxDIVH5in8);
    }

    @Override // defpackage.g00
    public final Object rtx2ld2ELZv4(Object obj) {
        return obj instanceof qm ? ((qm) obj).PxuCJdSBwIXG : obj;
    }

    public final void tmVwIGCQF4zR(ju juVar) {
        bt btVar = this.dgRBjINgWbAK;
        e00 e00Var = btVar instanceof e00 ? (e00) btVar : null;
        ozEBbv0hFTAB(no2.PxuCJdSBwIXG, (e00Var != null ? e00Var.dgRBjINgWbAK : null) == juVar ? 4 : this.wdg6QnbFHrFF, null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(kpCQ9veP6n3I());
        sb.append('(');
        sb.append(zv.nxJAScVArhE9(this.dgRBjINgWbAK));
        sb.append("){");
        Object S2OOm9zPNm0h = S2OOm9zPNm0h();
        sb.append(S2OOm9zPNm0h instanceof be1 ? "Active" : S2OOm9zPNm0h instanceof ei ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(zv.VhhvGxCb8gfr(this));
        return sb.toString();
    }

    @Override // defpackage.zh
    public final void wdg6QnbFHrFF(Object obj, qe0 qe0Var) {
        ozEBbv0hFTAB(obj, this.wdg6QnbFHrFF, qe0Var);
    }

    @Override // defpackage.g00
    public final Object x50lh2ztY7Y5() {
        return S2OOm9zPNm0h();
    }
}
