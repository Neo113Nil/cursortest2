package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class et0 implements xs0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater OPXfSBeufaJ8;
    public static final /* synthetic */ long dgRBjINgWbAK;
    public static final /* synthetic */ AtomicReferenceFieldUpdater rtx2ld2ELZv4 = AtomicReferenceFieldUpdater.newUpdater(et0.class, Object.class, "_state$volatile");
    public static final /* synthetic */ long wdg6QnbFHrFF;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = ty1.PxuCJdSBwIXG;
        dgRBjINgWbAK = unsafe.objectFieldOffset(et0.class.getDeclaredField("_state$volatile"));
        OPXfSBeufaJ8 = AtomicReferenceFieldUpdater.newUpdater(et0.class, Object.class, "_parentHandle$volatile");
        wdg6QnbFHrFF = unsafe.objectFieldOffset(et0.class.getDeclaredField("_parentHandle$volatile"));
    }

    public et0(boolean z) {
        this._state$volatile = z ? f2.XL4ISE6Oc65B : f2.BRwzKIf41E4i;
    }

    public static tj ngxnMNrpiKat(t21 t21Var) {
        while (t21Var.r3s1LDPKFs1S()) {
            t21Var = t21Var.cpQdD2nAriOS();
        }
        while (true) {
            t21Var = t21Var.x50lh2ztY7Y5();
            if (!t21Var.r3s1LDPKFs1S()) {
                if (t21Var instanceof tj) {
                    return (tj) t21Var;
                }
                if (t21Var instanceof rd1) {
                    return null;
                }
            }
        }
    }

    public static String rxipThha848g(Object obj) {
        if (!(obj instanceof dt0)) {
            return obj instanceof pn0 ? ((pn0) obj).lS5Rgt96tfkO() ? "Active" : "New" : obj instanceof sm ? "Cancelled" : "Completed";
        }
        dt0 dt0Var = (dt0) obj;
        return dt0Var.a92UlCVFR9N8() ? "Cancelling" : dt0.OPXfSBeufaJ8.get(dt0Var) != 0 ? "Completing" : "Active";
    }

    public String BjEWd04qc7Mw() {
        return "Job was cancelled";
    }

    public final void D0aTLcX6Uhyo(at0 at0Var) {
        at0Var.RAsUl2FVSrh6(new rd1());
        t21 x50lh2ztY7Y5 = at0Var.x50lh2ztY7Y5();
        while (true) {
            rtx2ld2ELZv4.getClass();
            Unsafe unsafe = ty1.PxuCJdSBwIXG;
            long j = dgRBjINgWbAK;
            et0 et0Var = this;
            at0 at0Var2 = at0Var;
            if (unsafe.compareAndSwapObject(et0Var, j, at0Var2, x50lh2ztY7Y5) || unsafe.getObjectVolatile(et0Var, j) != at0Var2) {
                return;
            }
            this = et0Var;
            at0Var = at0Var2;
        }
    }

    public void EcgxDIVH5in8(Object obj) {
        gPXPFXrUH4XX(obj);
    }

    public final Object EpkonXwzFgDB(dt0 dt0Var, Object obj) {
        dt0 dt0Var2;
        Throwable th;
        Throwable xfACYKDMU6Dj;
        et0 et0Var;
        dt0 dt0Var3;
        sm smVar = obj instanceof sm ? (sm) obj : null;
        Throwable th2 = smVar != null ? smVar.PxuCJdSBwIXG : null;
        synchronized (dt0Var) {
            try {
                dt0Var.a92UlCVFR9N8();
                ArrayList RAsUl2FVSrh6 = dt0Var.RAsUl2FVSrh6(th2);
                xfACYKDMU6Dj = xfACYKDMU6Dj(dt0Var, RAsUl2FVSrh6);
                if (xfACYKDMU6Dj != null) {
                    try {
                        if (RAsUl2FVSrh6.size() > 1) {
                            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(RAsUl2FVSrh6.size()));
                            int size = RAsUl2FVSrh6.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = RAsUl2FVSrh6.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != xfACYKDMU6Dj && th3 != xfACYKDMU6Dj && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                                    f2.RAsUl2FVSrh6(xfACYKDMU6Dj, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        dt0Var2 = dt0Var;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                dt0Var2 = dt0Var;
                th = th5;
            }
        }
        if (xfACYKDMU6Dj != null && xfACYKDMU6Dj != th2) {
            obj = new sm(xfACYKDMU6Dj, false);
        }
        if (xfACYKDMU6Dj != null && (jyegZNwi31qc(xfACYKDMU6Dj) || zf8DYfih6EZu(xfACYKDMU6Dj))) {
            obj.getClass();
            sm.lS5Rgt96tfkO.compareAndSet((sm) obj, 0, 1);
        }
        KUoIVIumpKat(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = rtx2ld2ELZv4;
        Object qn0Var = obj instanceof pn0 ? new qn0((pn0) obj) : obj;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = ty1.PxuCJdSBwIXG;
            long j = dgRBjINgWbAK;
            et0Var = this;
            dt0Var3 = dt0Var;
            if (!unsafe.compareAndSwapObject(et0Var, j, dt0Var3, qn0Var) && unsafe.getObjectVolatile(et0Var, j) == dt0Var3) {
                this = et0Var;
                dt0Var = dt0Var3;
            }
        }
        et0Var.tmVwIGCQF4zR(dt0Var3, obj);
        return obj;
    }

    @Override // defpackage.hu
    public final Object IAToe7bXGz4N(pe0 pe0Var, Object obj) {
        return pe0Var.rtx2ld2ELZv4(obj, this);
    }

    public boolean IXK6ba3ucyzm() {
        return this instanceof wd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    public final Throwable J54yh1s3n4Aq(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        et0 et0Var = (et0) obj;
        Object i68hK7ahKtgp = et0Var.i68hK7ahKtgp();
        if (i68hK7ahKtgp instanceof dt0) {
            cancellationException = ((dt0) i68hK7ahKtgp).e9gEMXR7LXtO();
        } else if (i68hK7ahKtgp instanceof sm) {
            cancellationException = ((sm) i68hK7ahKtgp).PxuCJdSBwIXG;
        } else {
            if (i68hK7ahKtgp instanceof pn0) {
                u9.BRwzKIf41E4i(i68hK7ahKtgp, "Cannot be cancelling child in this state: ");
                return null;
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new ys0("Parent job is ".concat(rxipThha848g(i68hK7ahKtgp)), cancellationException, et0Var) : cancellationException2;
    }

    public final Object JHNfcAUfKc4G(Object obj) {
        Object fRTaYY6FBZcX;
        do {
            fRTaYY6FBZcX = fRTaYY6FBZcX(i68hK7ahKtgp(), obj);
            if (fRTaYY6FBZcX == f2.x50lh2ztY7Y5) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                sm smVar = obj instanceof sm ? (sm) obj : null;
                throw new IllegalStateException(str, smVar != null ? smVar.PxuCJdSBwIXG : null);
            }
        } while (fRTaYY6FBZcX == f2.r3s1LDPKFs1S);
        return fRTaYY6FBZcX;
    }

    public final void JTxCbbCwomzt(sj sjVar) {
        OPXfSBeufaJ8.getClass();
        ty1.PxuCJdSBwIXG.putObjectVolatile(this, wdg6QnbFHrFF, sjVar);
    }

    public Object OPXfSBeufaJ8() {
        Object i68hK7ahKtgp = i68hK7ahKtgp();
        if (i68hK7ahKtgp instanceof pn0) {
            u9.rtx2ld2ELZv4("This job has not completed yet");
            return null;
        }
        if (i68hK7ahKtgp instanceof sm) {
            throw ((sm) i68hK7ahKtgp).PxuCJdSBwIXG;
        }
        return f2.gGoUzNp9JO5I(i68hK7ahKtgp);
    }

    public final sj POWyO8hTM6YC() {
        OPXfSBeufaJ8.getClass();
        return (sj) ty1.PxuCJdSBwIXG.getObjectVolatile(this, wdg6QnbFHrFF);
    }

    public boolean Pf0ThKz3j5YS() {
        return this instanceof pm;
    }

    public final void PsecLrZVVK61(at0 at0Var) {
        et0 et0Var;
        while (true) {
            Object i68hK7ahKtgp = this.i68hK7ahKtgp();
            if (!(i68hK7ahKtgp instanceof at0)) {
                if (!(i68hK7ahKtgp instanceof pn0) || ((pn0) i68hK7ahKtgp).Y1f8riQaR6yg() == null) {
                    return;
                }
                at0Var.QrzZRwfaDlRX();
                return;
            }
            if (i68hK7ahKtgp != at0Var) {
                return;
            }
            j50 j50Var = f2.XL4ISE6Oc65B;
            while (true) {
                rtx2ld2ELZv4.getClass();
                Unsafe unsafe = ty1.PxuCJdSBwIXG;
                long j = dgRBjINgWbAK;
                et0Var = this;
                if (unsafe.compareAndSwapObject(et0Var, j, i68hK7ahKtgp, j50Var)) {
                    return;
                }
                if (unsafe.getObjectVolatile(et0Var, j) != i68hK7ahKtgp) {
                    break;
                } else {
                    this = et0Var;
                }
            }
            this = et0Var;
        }
    }

    @Override // defpackage.hu
    public final hu RfyTYNmI9Srp(hu huVar) {
        return f2.xfACYKDMU6Dj(this, huVar);
    }

    @Override // defpackage.hu
    public final fu S2OOm9zPNm0h(gu guVar) {
        return f2.EcgxDIVH5in8(this, guVar);
    }

    public final Object S9EYkSpbGuxq(ct ctVar) {
        Object i68hK7ahKtgp;
        do {
            i68hK7ahKtgp = i68hK7ahKtgp();
            if (!(i68hK7ahKtgp instanceof pn0)) {
                if (i68hK7ahKtgp instanceof sm) {
                    throw ((sm) i68hK7ahKtgp).PxuCJdSBwIXG;
                }
                return f2.gGoUzNp9JO5I(i68hK7ahKtgp);
            }
        } while (VzNxmvWisHL1(i68hK7ahKtgp) < 0);
        bt0 bt0Var = new bt0(ng0.IAToe7bXGz4N(ctVar), this);
        bt0Var.ZbWwgt3aGe7A();
        bt0Var.e6tOsSdd2EFb(new vh(2, ki0.amuv7NJvPxHu(this, true, new wv1(bt0Var))));
        return bt0Var.VhhvGxCb8gfr();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r0 == defpackage.f2.cpQdD2nAriOS) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0059, code lost:
    
        r0 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean VhhvGxCb8gfr(Object obj) {
        f50 f50Var;
        Object obj2 = f2.x50lh2ztY7Y5;
        if (Pf0ThKz3j5YS()) {
            do {
                Object i68hK7ahKtgp = i68hK7ahKtgp();
                if (i68hK7ahKtgp instanceof pn0) {
                    if (i68hK7ahKtgp instanceof dt0) {
                        if (dt0.OPXfSBeufaJ8.get((dt0) i68hK7ahKtgp) != 0) {
                        }
                    }
                    obj2 = fRTaYY6FBZcX(i68hK7ahKtgp, new sm(J54yh1s3n4Aq(obj), false));
                }
                obj2 = f2.x50lh2ztY7Y5;
                break;
            } while (obj2 == f2.r3s1LDPKFs1S);
        }
        if (obj2 == f2.x50lh2ztY7Y5) {
            Throwable th = null;
            while (true) {
                Object i68hK7ahKtgp2 = i68hK7ahKtgp();
                if (!(i68hK7ahKtgp2 instanceof dt0)) {
                    if (!(i68hK7ahKtgp2 instanceof pn0)) {
                        f50Var = f2.QrzZRwfaDlRX;
                        break;
                    }
                    if (th == null) {
                        th = J54yh1s3n4Aq(obj);
                    }
                    pn0 pn0Var = (pn0) i68hK7ahKtgp2;
                    if (!pn0Var.lS5Rgt96tfkO()) {
                        Object fRTaYY6FBZcX = fRTaYY6FBZcX(i68hK7ahKtgp2, new sm(th, false));
                        if (fRTaYY6FBZcX == f2.x50lh2ztY7Y5) {
                            u9.BRwzKIf41E4i(i68hK7ahKtgp2, "Cannot happen in ");
                            return false;
                        }
                        if (fRTaYY6FBZcX != f2.r3s1LDPKFs1S) {
                            obj2 = fRTaYY6FBZcX;
                            break;
                        }
                    } else if (uVlwi32qvXeJ(pn0Var, th)) {
                        f50Var = f2.x50lh2ztY7Y5;
                        break;
                    }
                } else {
                    synchronized (i68hK7ahKtgp2) {
                        if (((dt0) i68hK7ahKtgp2).TSizfFm2Yiuu() == f2.gPXPFXrUH4XX) {
                            f50Var = f2.QrzZRwfaDlRX;
                        } else {
                            boolean a92UlCVFR9N8 = ((dt0) i68hK7ahKtgp2).a92UlCVFR9N8();
                            if (th == null) {
                                th = J54yh1s3n4Aq(obj);
                            }
                            ((dt0) i68hK7ahKtgp2).PxuCJdSBwIXG(th);
                            Throwable e9gEMXR7LXtO = a92UlCVFR9N8 ? null : ((dt0) i68hK7ahKtgp2).e9gEMXR7LXtO();
                            if (e9gEMXR7LXtO != null) {
                                yQRudnv4La6p(((dt0) i68hK7ahKtgp2).rtx2ld2ELZv4, e9gEMXR7LXtO);
                            }
                            f50Var = f2.x50lh2ztY7Y5;
                        }
                    }
                }
            }
        }
        if (obj2 != f2.x50lh2ztY7Y5 && obj2 != f2.cpQdD2nAriOS) {
            if (obj2 == f2.QrzZRwfaDlRX) {
                return false;
            }
            gPXPFXrUH4XX(obj2);
            return true;
        }
        return true;
    }

    public final int VzNxmvWisHL1(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof j50;
        long j = dgRBjINgWbAK;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = rtx2ld2ELZv4;
        if (z) {
            if (((j50) obj).rtx2ld2ELZv4) {
                return 0;
            }
            j50 j50Var = f2.XL4ISE6Oc65B;
            do {
                atomicReferenceFieldUpdater.getClass();
                unsafe2 = ty1.PxuCJdSBwIXG;
                if (unsafe2.compareAndSwapObject(this, dgRBjINgWbAK, obj, j50Var)) {
                    qudtW7lwm99e();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof on0)) {
            return 0;
        }
        rd1 rd1Var = ((on0) obj).rtx2ld2ELZv4;
        do {
            atomicReferenceFieldUpdater.getClass();
            unsafe = ty1.PxuCJdSBwIXG;
            if (unsafe.compareAndSwapObject(this, dgRBjINgWbAK, obj, rd1Var)) {
                qudtW7lwm99e();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
    
        return r5;
     */
    @Override // defpackage.xs0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sj XL4ISE6Oc65B(et0 et0Var) {
        et0 et0Var2;
        tj tjVar = new tj(et0Var);
        tjVar.r3s1LDPKFs1S = this;
        loop0: while (true) {
            Object i68hK7ahKtgp = this.i68hK7ahKtgp();
            if (i68hK7ahKtgp instanceof j50) {
                j50 j50Var = (j50) i68hK7ahKtgp;
                if (j50Var.rtx2ld2ELZv4) {
                    while (true) {
                        rtx2ld2ELZv4.getClass();
                        Unsafe unsafe = ty1.PxuCJdSBwIXG;
                        long j = dgRBjINgWbAK;
                        et0Var2 = this;
                        if (unsafe.compareAndSwapObject(et0Var2, j, i68hK7ahKtgp, tjVar)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(et0Var2, j) != i68hK7ahKtgp) {
                            break;
                        }
                        this = et0Var2;
                    }
                } else {
                    et0Var2 = this;
                    et0Var2.jJwa0q7P5wHq(j50Var);
                }
                this = et0Var2;
            } else {
                et0Var2 = this;
                boolean z = i68hK7ahKtgp instanceof pn0;
                wd1 wd1Var = wd1.rtx2ld2ELZv4;
                if (!z) {
                    Object i68hK7ahKtgp2 = et0Var2.i68hK7ahKtgp();
                    sm smVar = i68hK7ahKtgp2 instanceof sm ? (sm) i68hK7ahKtgp2 : null;
                    tjVar.RfyTYNmI9Srp(smVar != null ? smVar.PxuCJdSBwIXG : null);
                    return wd1Var;
                }
                rd1 Y1f8riQaR6yg = ((pn0) i68hK7ahKtgp).Y1f8riQaR6yg();
                if (Y1f8riQaR6yg == null) {
                    et0Var2.D0aTLcX6Uhyo((at0) i68hK7ahKtgp);
                    this = et0Var2;
                } else if (!Y1f8riQaR6yg.e9gEMXR7LXtO(tjVar, 7)) {
                    boolean e9gEMXR7LXtO = Y1f8riQaR6yg.e9gEMXR7LXtO(tjVar, 3);
                    Object i68hK7ahKtgp3 = et0Var2.i68hK7ahKtgp();
                    if (i68hK7ahKtgp3 instanceof dt0) {
                        r0 = ((dt0) i68hK7ahKtgp3).e9gEMXR7LXtO();
                    } else {
                        sm smVar2 = i68hK7ahKtgp3 instanceof sm ? (sm) i68hK7ahKtgp3 : null;
                        if (smVar2 != null) {
                            r0 = smVar2.PxuCJdSBwIXG;
                        }
                    }
                    tjVar.RfyTYNmI9Srp(r0);
                    if (e9gEMXR7LXtO) {
                        break loop0;
                    }
                    return wd1Var;
                }
            }
        }
    }

    @Override // defpackage.xs0
    public void a92UlCVFR9N8(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new ys0(BjEWd04qc7Mw(), null, this);
        }
        e6tOsSdd2EFb(cancellationException);
    }

    @Override // defpackage.xs0
    public final s00 aF05bpZJlKEP(le0 le0Var) {
        return nxJAScVArhE9(true, new ps0(le0Var));
    }

    public boolean amuv7NJvPxHu() {
        return true;
    }

    public String bEKsvqmvPh2y() {
        return getClass().getSimpleName();
    }

    public void e6tOsSdd2EFb(CancellationException cancellationException) {
        VhhvGxCb8gfr(cancellationException);
    }

    public final Object fRTaYY6FBZcX(Object obj, Object obj2) {
        if (!(obj instanceof pn0)) {
            return f2.x50lh2ztY7Y5;
        }
        if (((obj instanceof j50) || (obj instanceof at0)) && !(obj instanceof tj) && !(obj2 instanceof sm)) {
            return hVNtCUZb4tYH((pn0) obj, obj2) ? obj2 : f2.r3s1LDPKFs1S;
        }
        pn0 pn0Var = (pn0) obj;
        rd1 gGoUzNp9JO5I = gGoUzNp9JO5I(pn0Var);
        if (gGoUzNp9JO5I == null) {
            return f2.r3s1LDPKFs1S;
        }
        dt0 dt0Var = pn0Var instanceof dt0 ? (dt0) pn0Var : null;
        if (dt0Var == null) {
            dt0Var = new dt0(gGoUzNp9JO5I, null);
        }
        synchronized (dt0Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = dt0.OPXfSBeufaJ8;
            if (atomicIntegerFieldUpdater.get(dt0Var) != 0) {
                return f2.x50lh2ztY7Y5;
            }
            atomicIntegerFieldUpdater.set(dt0Var, 1);
            if (dt0Var != pn0Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = rtx2ld2ELZv4;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, pn0Var, dt0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != pn0Var) {
                        return f2.r3s1LDPKFs1S;
                    }
                }
            }
            boolean a92UlCVFR9N8 = dt0Var.a92UlCVFR9N8();
            sm smVar = obj2 instanceof sm ? (sm) obj2 : null;
            if (smVar != null) {
                dt0Var.PxuCJdSBwIXG(smVar.PxuCJdSBwIXG);
            }
            Throwable e9gEMXR7LXtO = a92UlCVFR9N8 ? null : dt0Var.e9gEMXR7LXtO();
            if (e9gEMXR7LXtO != null) {
                yQRudnv4La6p(gGoUzNp9JO5I, e9gEMXR7LXtO);
            }
            tj ngxnMNrpiKat = ngxnMNrpiKat(gGoUzNp9JO5I);
            if (ngxnMNrpiKat != null && v6yxfmkxNKhL(dt0Var, ngxnMNrpiKat, obj2)) {
                return f2.cpQdD2nAriOS;
            }
            gGoUzNp9JO5I.e9gEMXR7LXtO(new a21(2), 2);
            tj ngxnMNrpiKat2 = ngxnMNrpiKat(gGoUzNp9JO5I);
            return (ngxnMNrpiKat2 == null || !v6yxfmkxNKhL(dt0Var, ngxnMNrpiKat2, obj2)) ? EpkonXwzFgDB(dt0Var, obj2) : f2.cpQdD2nAriOS;
        }
    }

    public final rd1 gGoUzNp9JO5I(pn0 pn0Var) {
        rd1 Y1f8riQaR6yg = pn0Var.Y1f8riQaR6yg();
        if (Y1f8riQaR6yg != null) {
            return Y1f8riQaR6yg;
        }
        if (pn0Var instanceof j50) {
            return new rd1();
        }
        if (pn0Var instanceof at0) {
            D0aTLcX6Uhyo((at0) pn0Var);
            return null;
        }
        u9.BRwzKIf41E4i(pn0Var, "State should have list: ");
        return null;
    }

    @Override // defpackage.fu
    public final gu getKey() {
        return ih0.BRwzKIf41E4i;
    }

    public final boolean hVNtCUZb4tYH(pn0 pn0Var, Object obj) {
        Object qn0Var = obj instanceof pn0 ? new qn0((pn0) obj) : obj;
        while (true) {
            rtx2ld2ELZv4.getClass();
            Unsafe unsafe = ty1.PxuCJdSBwIXG;
            long j = dgRBjINgWbAK;
            et0 et0Var = this;
            pn0 pn0Var2 = pn0Var;
            if (unsafe.compareAndSwapObject(et0Var, j, pn0Var2, qn0Var)) {
                et0Var.KUoIVIumpKat(obj);
                et0Var.tmVwIGCQF4zR(pn0Var2, obj);
                return true;
            }
            if (unsafe.getObjectVolatile(et0Var, j) != pn0Var2) {
                return false;
            }
            this = et0Var;
            pn0Var = pn0Var2;
        }
    }

    public final Object i68hK7ahKtgp() {
        rtx2ld2ELZv4.getClass();
        return ty1.PxuCJdSBwIXG.getObjectVolatile(this, dgRBjINgWbAK);
    }

    public final void jJwa0q7P5wHq(j50 j50Var) {
        rd1 rd1Var = new rd1();
        pn0 on0Var = j50Var.rtx2ld2ELZv4 ? rd1Var : new on0(rd1Var);
        while (true) {
            rtx2ld2ELZv4.getClass();
            Unsafe unsafe = ty1.PxuCJdSBwIXG;
            long j = dgRBjINgWbAK;
            et0 et0Var = this;
            j50 j50Var2 = j50Var;
            if (unsafe.compareAndSwapObject(et0Var, j, j50Var2, on0Var) || unsafe.getObjectVolatile(et0Var, j) != j50Var2) {
                return;
            }
            this = et0Var;
            j50Var = j50Var2;
        }
    }

    public final boolean jyegZNwi31qc(Throwable th) {
        if (IXK6ba3ucyzm()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        sj POWyO8hTM6YC = POWyO8hTM6YC();
        return (POWyO8hTM6YC == null || POWyO8hTM6YC == wd1.rtx2ld2ELZv4) ? z : POWyO8hTM6YC.TSizfFm2Yiuu(th) || z;
    }

    @Override // defpackage.hu
    public final hu kpCQ9veP6n3I(gu guVar) {
        return f2.IAToe7bXGz4N(this, guVar);
    }

    @Override // defpackage.xs0
    public boolean lS5Rgt96tfkO() {
        Object i68hK7ahKtgp = i68hK7ahKtgp();
        return (i68hK7ahKtgp instanceof pn0) && ((pn0) i68hK7ahKtgp).lS5Rgt96tfkO();
    }

    @Override // defpackage.xs0
    public final Object nLZGh9p8gVSu(ct ctVar) {
        Object i68hK7ahKtgp;
        no2 no2Var;
        do {
            i68hK7ahKtgp = i68hK7ahKtgp();
            boolean z = i68hK7ahKtgp instanceof pn0;
            no2Var = no2.PxuCJdSBwIXG;
            if (!z) {
                ki0.ZbWwgt3aGe7A(ctVar.e9gEMXR7LXtO());
                return no2Var;
            }
        } while (VzNxmvWisHL1(i68hK7ahKtgp) < 0);
        bi biVar = new bi(1, ng0.IAToe7bXGz4N(ctVar));
        biVar.ZbWwgt3aGe7A();
        biVar.e6tOsSdd2EFb(new vh(2, ki0.amuv7NJvPxHu(this, true, new xv1(biVar))));
        Object VhhvGxCb8gfr = biVar.VhhvGxCb8gfr();
        su suVar = su.rtx2ld2ELZv4;
        if (VhhvGxCb8gfr != suVar) {
            VhhvGxCb8gfr = no2Var;
        }
        return VhhvGxCb8gfr == suVar ? VhhvGxCb8gfr : no2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s00 nxJAScVArhE9(boolean z, at0 at0Var) {
        et0 et0Var;
        at0 at0Var2;
        wd1 wd1Var;
        boolean e9gEMXR7LXtO;
        at0Var.r3s1LDPKFs1S = this;
        loop0: while (true) {
            Object i68hK7ahKtgp = this.i68hK7ahKtgp();
            if (i68hK7ahKtgp instanceof j50) {
                j50 j50Var = (j50) i68hK7ahKtgp;
                if (j50Var.rtx2ld2ELZv4) {
                    while (true) {
                        rtx2ld2ELZv4.getClass();
                        Unsafe unsafe = ty1.PxuCJdSBwIXG;
                        long j = dgRBjINgWbAK;
                        et0Var = this;
                        at0Var2 = at0Var;
                        if (unsafe.compareAndSwapObject(et0Var, j, i68hK7ahKtgp, at0Var2)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(et0Var, j) != i68hK7ahKtgp) {
                            break;
                        }
                        this = et0Var;
                        at0Var = at0Var2;
                    }
                } else {
                    et0Var = this;
                    at0Var2 = at0Var;
                    et0Var.jJwa0q7P5wHq(j50Var);
                }
                this = et0Var;
                at0Var = at0Var2;
            } else {
                et0Var = this;
                at0Var2 = at0Var;
                boolean z2 = i68hK7ahKtgp instanceof pn0;
                wd1Var = wd1.rtx2ld2ELZv4;
                if (z2) {
                    pn0 pn0Var = (pn0) i68hK7ahKtgp;
                    rd1 Y1f8riQaR6yg = pn0Var.Y1f8riQaR6yg();
                    if (Y1f8riQaR6yg == null) {
                        et0Var.D0aTLcX6Uhyo((at0) i68hK7ahKtgp);
                    } else {
                        if (at0Var2.XL4ISE6Oc65B()) {
                            dt0 dt0Var = pn0Var instanceof dt0 ? (dt0) pn0Var : null;
                            Throwable e9gEMXR7LXtO2 = dt0Var != null ? dt0Var.e9gEMXR7LXtO() : null;
                            if (e9gEMXR7LXtO2 == null) {
                                e9gEMXR7LXtO = Y1f8riQaR6yg.e9gEMXR7LXtO(at0Var2, 5);
                            } else if (z) {
                                at0Var2.RfyTYNmI9Srp(e9gEMXR7LXtO2);
                                return wd1Var;
                            }
                        } else {
                            e9gEMXR7LXtO = Y1f8riQaR6yg.e9gEMXR7LXtO(at0Var2, 1);
                        }
                        if (e9gEMXR7LXtO) {
                            break;
                        }
                    }
                    this = et0Var;
                    at0Var = at0Var2;
                } else if (z) {
                    Object i68hK7ahKtgp2 = et0Var.i68hK7ahKtgp();
                    sm smVar = i68hK7ahKtgp2 instanceof sm ? (sm) i68hK7ahKtgp2 : null;
                    at0Var2.RfyTYNmI9Srp(smVar != null ? smVar.PxuCJdSBwIXG : null);
                }
            }
        }
        return wd1Var;
    }

    public boolean ozEBbv0hFTAB(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return VhhvGxCb8gfr(th) && amuv7NJvPxHu();
    }

    @Override // defpackage.xs0
    public final CancellationException pnx5pC0XzaCw() {
        CancellationException cancellationException;
        Object i68hK7ahKtgp = i68hK7ahKtgp();
        if (i68hK7ahKtgp instanceof dt0) {
            Throwable e9gEMXR7LXtO = ((dt0) i68hK7ahKtgp).e9gEMXR7LXtO();
            if (e9gEMXR7LXtO == null) {
                u9.BRwzKIf41E4i(this, "Job is still new or active: ");
                return null;
            }
            String concat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = e9gEMXR7LXtO instanceof CancellationException ? (CancellationException) e9gEMXR7LXtO : null;
            return cancellationException == null ? new ys0(concat, e9gEMXR7LXtO, this) : cancellationException;
        }
        if (i68hK7ahKtgp instanceof pn0) {
            u9.BRwzKIf41E4i(this, "Job is still new or active: ");
            return null;
        }
        if (!(i68hK7ahKtgp instanceof sm)) {
            return new ys0(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((sm) i68hK7ahKtgp).PxuCJdSBwIXG;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new ys0(BjEWd04qc7Mw(), th, this) : cancellationException;
    }

    @Override // defpackage.xs0
    public final s00 ryVscX7ZL4Ux(boolean z, boolean z2, RAsUl2FVSrh6 rAsUl2FVSrh6) {
        return nxJAScVArhE9(z2, z ? new os0(rAsUl2FVSrh6) : new ps0(rAsUl2FVSrh6));
    }

    @Override // defpackage.xs0
    public final boolean start() {
        int VzNxmvWisHL1;
        do {
            VzNxmvWisHL1 = VzNxmvWisHL1(i68hK7ahKtgp());
            if (VzNxmvWisHL1 == 0) {
                return false;
            }
        } while (VzNxmvWisHL1 != 1);
        return true;
    }

    public final void tmVwIGCQF4zR(pn0 pn0Var, Object obj) {
        sj POWyO8hTM6YC = POWyO8hTM6YC();
        if (POWyO8hTM6YC != null) {
            POWyO8hTM6YC.PxuCJdSBwIXG();
            JTxCbbCwomzt(wd1.rtx2ld2ELZv4);
        }
        tm tmVar = null;
        sm smVar = obj instanceof sm ? (sm) obj : null;
        Throwable th = smVar != null ? smVar.PxuCJdSBwIXG : null;
        if (pn0Var instanceof at0) {
            try {
                ((at0) pn0Var).RfyTYNmI9Srp(th);
                return;
            } catch (Throwable th2) {
                wLFCmsViZrNT(new tm("Exception in completion handler " + pn0Var + " for " + this, th2));
                return;
            }
        }
        rd1 Y1f8riQaR6yg = pn0Var.Y1f8riQaR6yg();
        if (Y1f8riQaR6yg != null) {
            Y1f8riQaR6yg.e9gEMXR7LXtO(new a21(1), 1);
            Object dgRBjINgWbAK2 = Y1f8riQaR6yg.dgRBjINgWbAK();
            dgRBjINgWbAK2.getClass();
            for (t21 t21Var = (t21) dgRBjINgWbAK2; !t21Var.equals(Y1f8riQaR6yg); t21Var = t21Var.x50lh2ztY7Y5()) {
                if (t21Var instanceof at0) {
                    try {
                        ((at0) t21Var).RfyTYNmI9Srp(th);
                    } catch (Throwable th3) {
                        if (tmVar != null) {
                            f2.RAsUl2FVSrh6(tmVar, th3);
                        } else {
                            tmVar = new tm("Exception in completion handler " + t21Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (tmVar != null) {
                wLFCmsViZrNT(tmVar);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(bEKsvqmvPh2y() + '{' + rxipThha848g(i68hK7ahKtgp()) + '}');
        sb.append('@');
        sb.append(zv.VhhvGxCb8gfr(this));
        return sb.toString();
    }

    public final boolean uVlwi32qvXeJ(pn0 pn0Var, Throwable th) {
        rd1 gGoUzNp9JO5I = gGoUzNp9JO5I(pn0Var);
        if (gGoUzNp9JO5I == null) {
            return false;
        }
        dt0 dt0Var = new dt0(gGoUzNp9JO5I, th);
        while (true) {
            rtx2ld2ELZv4.getClass();
            Unsafe unsafe = ty1.PxuCJdSBwIXG;
            long j = dgRBjINgWbAK;
            et0 et0Var = this;
            pn0 pn0Var2 = pn0Var;
            if (unsafe.compareAndSwapObject(et0Var, j, pn0Var2, dt0Var)) {
                et0Var.yQRudnv4La6p(gGoUzNp9JO5I, th);
                return true;
            }
            if (unsafe.getObjectVolatile(et0Var, j) != pn0Var2) {
                return false;
            }
            this = et0Var;
            pn0Var = pn0Var2;
        }
    }

    public final boolean v6yxfmkxNKhL(dt0 dt0Var, tj tjVar, Object obj) {
        while (ki0.amuv7NJvPxHu(tjVar.QrzZRwfaDlRX, false, new ct0(this, dt0Var, tjVar, obj)) == wd1.rtx2ld2ELZv4) {
            tjVar = ngxnMNrpiKat(tjVar);
            if (tjVar == null) {
                return false;
            }
        }
        return true;
    }

    public final void xbgXKYA2cIfu(xs0 xs0Var) {
        wd1 wd1Var = wd1.rtx2ld2ELZv4;
        if (xs0Var == null) {
            JTxCbbCwomzt(wd1Var);
            return;
        }
        xs0Var.start();
        sj XL4ISE6Oc65B = xs0Var.XL4ISE6Oc65B(this);
        JTxCbbCwomzt(XL4ISE6Oc65B);
        if (i68hK7ahKtgp() instanceof pn0) {
            return;
        }
        XL4ISE6Oc65B.PxuCJdSBwIXG();
        JTxCbbCwomzt(wd1Var);
    }

    public final Throwable xfACYKDMU6Dj(dt0 dt0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (dt0Var.a92UlCVFR9N8()) {
                return new ys0(BjEWd04qc7Mw(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof zj2) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof zj2)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public final void yQRudnv4La6p(rd1 rd1Var, Throwable th) {
        rd1Var.e9gEMXR7LXtO(new a21(4), 4);
        Object dgRBjINgWbAK2 = rd1Var.dgRBjINgWbAK();
        dgRBjINgWbAK2.getClass();
        tm tmVar = null;
        for (t21 t21Var = (t21) dgRBjINgWbAK2; !t21Var.equals(rd1Var); t21Var = t21Var.x50lh2ztY7Y5()) {
            if ((t21Var instanceof at0) && ((at0) t21Var).XL4ISE6Oc65B()) {
                try {
                    ((at0) t21Var).RfyTYNmI9Srp(th);
                } catch (Throwable th2) {
                    if (tmVar != null) {
                        f2.RAsUl2FVSrh6(tmVar, th2);
                    } else {
                        tmVar = new tm("Exception in completion handler " + t21Var + " for " + this, th2);
                    }
                }
            }
        }
        if (tmVar != null) {
            wLFCmsViZrNT(tmVar);
        }
        jyegZNwi31qc(th);
    }

    public boolean zf8DYfih6EZu(Throwable th) {
        return false;
    }

    public void qudtW7lwm99e() {
    }

    public void KUoIVIumpKat(Object obj) {
    }

    public void gPXPFXrUH4XX(Object obj) {
    }

    public void wLFCmsViZrNT(tm tmVar) {
        throw tmVar;
    }
}
