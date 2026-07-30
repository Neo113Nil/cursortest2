package defpackage;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qu implements Executor, Closeable {
    public final int OPXfSBeufaJ8;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final tg0 cpQdD2nAriOS;
    public final String dgRBjINgWbAK;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public final fv1 r3s1LDPKFs1S;
    public final int rtx2ld2ELZv4;
    public final long wdg6QnbFHrFF;
    public final tg0 x50lh2ztY7Y5;
    public static final nu Companion = new nu();
    public static final /* synthetic */ AtomicLongFieldUpdater QrzZRwfaDlRX = AtomicLongFieldUpdater.newUpdater(qu.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater gPXPFXrUH4XX = AtomicLongFieldUpdater.newUpdater(qu.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater BRwzKIf41E4i = AtomicIntegerFieldUpdater.newUpdater(qu.class, "_isTerminated$volatile");
    public static final f50 XL4ISE6Oc65B = new f50("NOT_IN_STACK", 1);

    public qu(int i, int i2, long j, String str) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = i2;
        this.wdg6QnbFHrFF = j;
        this.dgRBjINgWbAK = str;
        if (i < 1) {
            u9.e9gEMXR7LXtO(o0.OPXfSBeufaJ8(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            u9.e9gEMXR7LXtO(o0.rtx2ld2ELZv4(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            u9.e9gEMXR7LXtO(o0.OPXfSBeufaJ8(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.x50lh2ztY7Y5 = new tg0();
        this.cpQdD2nAriOS = new tg0();
        this.r3s1LDPKFs1S = new fv1((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void OPXfSBeufaJ8(qu quVar, Runnable runnable, int i) {
        quVar.a92UlCVFR9N8(runnable, false, (i & 4) == 0);
    }

    public final boolean XL4ISE6Oc65B() {
        qu quVar;
        f50 f50Var;
        int i;
        while (true) {
            long j = QrzZRwfaDlRX.get(this);
            ou ouVar = (ou) this.r3s1LDPKFs1S.lS5Rgt96tfkO((int) (2097151 & j));
            if (ouVar == null) {
                ouVar = null;
                quVar = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object TSizfFm2Yiuu = ouVar.TSizfFm2Yiuu();
                while (true) {
                    f50Var = XL4ISE6Oc65B;
                    if (TSizfFm2Yiuu == f50Var) {
                        i = -1;
                        break;
                    }
                    if (TSizfFm2Yiuu == null) {
                        i = 0;
                        break;
                    }
                    ou ouVar2 = (ou) TSizfFm2Yiuu;
                    i = ouVar2.lS5Rgt96tfkO();
                    if (i != 0) {
                        break;
                    }
                    TSizfFm2Yiuu = ouVar2.TSizfFm2Yiuu();
                    j = j;
                }
                if (i >= 0) {
                    qu quVar2 = this;
                    boolean compareAndSet = QrzZRwfaDlRX.compareAndSet(quVar2, j, i | j2);
                    quVar = quVar2;
                    if (compareAndSet) {
                        ouVar.RAsUl2FVSrh6(f50Var);
                    }
                    this = quVar;
                } else {
                    continue;
                }
            }
            if (ouVar == null) {
                return false;
            }
            if (ou.gPXPFXrUH4XX.compareAndSet(ouVar, -1, 0)) {
                LockSupport.unpark(ouVar);
                return true;
            }
            this = quVar;
        }
    }

    public final void a92UlCVFR9N8(Runnable runnable, boolean z, boolean z2) {
        ud2 xd2Var;
        pu puVar;
        de2.a92UlCVFR9N8.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof ud2) {
            xd2Var = (ud2) runnable;
            xd2Var.rtx2ld2ELZv4 = nanoTime;
            xd2Var.OPXfSBeufaJ8 = z;
        } else {
            xd2Var = new xd2(runnable, nanoTime, z);
        }
        boolean z3 = xd2Var.OPXfSBeufaJ8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = gPXPFXrUH4XX;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        ou ouVar = null;
        ou ouVar2 = currentThread instanceof ou ? (ou) currentThread : null;
        if (ouVar2 != null && ouVar2.QrzZRwfaDlRX == this) {
            ouVar = ouVar2;
        }
        if (ouVar != null && (puVar = ouVar.wdg6QnbFHrFF) != pu.x50lh2ztY7Y5 && (xd2Var.OPXfSBeufaJ8 || puVar != pu.OPXfSBeufaJ8)) {
            ouVar.r3s1LDPKFs1S = true;
            xd2Var = ouVar.rtx2ld2ELZv4.PxuCJdSBwIXG(xd2Var, z2);
        }
        if (xd2Var != null) {
            if (!(xd2Var.OPXfSBeufaJ8 ? this.cpQdD2nAriOS.PxuCJdSBwIXG(xd2Var) : this.x50lh2ztY7Y5.PxuCJdSBwIXG(xd2Var))) {
                throw new RejectedExecutionException(o0.gPXPFXrUH4XX(new StringBuilder(), this.dgRBjINgWbAK, " was terminated"));
            }
        }
        boolean z4 = z2 && ouVar != null;
        if (z3) {
            if (z4 || XL4ISE6Oc65B() || gPXPFXrUH4XX(addAndGet)) {
                return;
            }
            XL4ISE6Oc65B();
            return;
        }
        if (z4 || XL4ISE6Oc65B() || gPXPFXrUH4XX(atomicLongFieldUpdater.get(this))) {
            return;
        }
        XL4ISE6Oc65B();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        if (r0 == null) goto L33;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i;
        ud2 ud2Var;
        if (BRwzKIf41E4i.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            ou ouVar = null;
            ou ouVar2 = currentThread instanceof ou ? (ou) currentThread : null;
            if (ouVar2 != null && ouVar2.QrzZRwfaDlRX == this) {
                ouVar = ouVar2;
            }
            synchronized (this.r3s1LDPKFs1S) {
                i = (int) (gPXPFXrUH4XX.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object lS5Rgt96tfkO = this.r3s1LDPKFs1S.lS5Rgt96tfkO(i2);
                    lS5Rgt96tfkO.getClass();
                    ou ouVar3 = (ou) lS5Rgt96tfkO;
                    if (ouVar3 != ouVar) {
                        while (ouVar3.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(ouVar3);
                            ouVar3.join(10000L);
                        }
                        ouVar3.rtx2ld2ELZv4.Y1f8riQaR6yg(this.cpQdD2nAriOS);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.cpQdD2nAriOS.lS5Rgt96tfkO();
            this.x50lh2ztY7Y5.lS5Rgt96tfkO();
            while (true) {
                if (ouVar != null) {
                    ud2Var = ouVar.PxuCJdSBwIXG(true);
                }
                ud2Var = (ud2) this.x50lh2ztY7Y5.Y1f8riQaR6yg();
                if (ud2Var == null && (ud2Var = (ud2) this.cpQdD2nAriOS.Y1f8riQaR6yg()) == null) {
                    break;
                }
                try {
                    ud2Var.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (ouVar != null) {
                ouVar.rtx2ld2ELZv4(pu.x50lh2ztY7Y5);
            }
            QrzZRwfaDlRX.set(this, 0L);
            gPXPFXrUH4XX.set(this, 0L);
        }
    }

    public final void cpQdD2nAriOS(ou ouVar, int i, int i2) {
        while (true) {
            long j = QrzZRwfaDlRX.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object TSizfFm2Yiuu = ouVar.TSizfFm2Yiuu();
                    while (true) {
                        if (TSizfFm2Yiuu == XL4ISE6Oc65B) {
                            i3 = -1;
                            break;
                        }
                        if (TSizfFm2Yiuu == null) {
                            i3 = 0;
                            break;
                        }
                        ou ouVar2 = (ou) TSizfFm2Yiuu;
                        int lS5Rgt96tfkO = ouVar2.lS5Rgt96tfkO();
                        if (lS5Rgt96tfkO != 0) {
                            i3 = lS5Rgt96tfkO;
                            break;
                        }
                        TSizfFm2Yiuu = ouVar2.TSizfFm2Yiuu();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                qu quVar = this;
                if (QrzZRwfaDlRX.compareAndSet(quVar, j, i3 | j2)) {
                    return;
                } else {
                    this = quVar;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        OPXfSBeufaJ8(this, runnable, 6);
    }

    public final boolean gPXPFXrUH4XX(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.rtx2ld2ELZv4;
        if (i < i2) {
            int lS5Rgt96tfkO = lS5Rgt96tfkO();
            if (lS5Rgt96tfkO == 1 && i2 > 1) {
                lS5Rgt96tfkO();
            }
            if (lS5Rgt96tfkO > 0) {
                return true;
            }
        }
        return false;
    }

    public final int lS5Rgt96tfkO() {
        synchronized (this.r3s1LDPKFs1S) {
            try {
                if (BRwzKIf41E4i.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = gPXPFXrUH4XX;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.rtx2ld2ELZv4) {
                    return 0;
                }
                if (i >= this.OPXfSBeufaJ8) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.r3s1LDPKFs1S.lS5Rgt96tfkO(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                ou ouVar = new ou(this, i3);
                this.r3s1LDPKFs1S.TSizfFm2Yiuu(i3, ouVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                ouVar.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        fv1 fv1Var = this.r3s1LDPKFs1S;
        int PxuCJdSBwIXG = fv1Var.PxuCJdSBwIXG();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < PxuCJdSBwIXG; i6++) {
            ou ouVar = (ou) fv1Var.lS5Rgt96tfkO(i6);
            if (ouVar != null) {
                int TSizfFm2Yiuu = ouVar.rtx2ld2ELZv4.TSizfFm2Yiuu();
                int ordinal = ouVar.wdg6QnbFHrFF.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(TSizfFm2Yiuu);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(TSizfFm2Yiuu);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (TSizfFm2Yiuu > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(TSizfFm2Yiuu);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        u9.gPXPFXrUH4XX();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = gPXPFXrUH4XX.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.dgRBjINgWbAK);
        sb4.append('@');
        sb4.append(zv.VhhvGxCb8gfr(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.rtx2ld2ELZv4;
        sb4.append(i7);
        sb4.append(", max = ");
        sb4.append(this.OPXfSBeufaJ8);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.x50lh2ztY7Y5.TSizfFm2Yiuu());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.cpQdD2nAriOS.TSizfFm2Yiuu());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
