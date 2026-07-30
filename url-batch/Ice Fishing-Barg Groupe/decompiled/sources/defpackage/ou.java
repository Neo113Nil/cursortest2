package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ou extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater gPXPFXrUH4XX = AtomicIntegerFieldUpdater.newUpdater(ou.class, "workerCtl$volatile");
    public final zt1 OPXfSBeufaJ8;
    public final /* synthetic */ qu QrzZRwfaDlRX;
    public int cpQdD2nAriOS;
    public long dgRBjINgWbAK;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    public boolean r3s1LDPKFs1S;
    public final uu2 rtx2ld2ELZv4;
    public pu wdg6QnbFHrFF;
    private volatile /* synthetic */ int workerCtl$volatile;
    public long x50lh2ztY7Y5;

    public ou(qu quVar, int i) {
        this.QrzZRwfaDlRX = quVar;
        setDaemon(true);
        setContextClassLoader(qu.class.getClassLoader());
        this.rtx2ld2ELZv4 = new uu2();
        this.OPXfSBeufaJ8 = new zt1();
        this.wdg6QnbFHrFF = pu.dgRBjINgWbAK;
        this.nextParkedWorker = qu.XL4ISE6Oc65B;
        int nanoTime = (int) System.nanoTime();
        this.cpQdD2nAriOS = nanoTime == 0 ? 42 : nanoTime;
        a92UlCVFR9N8(i);
    }

    public final ud2 OPXfSBeufaJ8(int i) {
        ud2 ud2Var;
        long OPXfSBeufaJ8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = qu.gPXPFXrUH4XX;
        qu quVar = this.QrzZRwfaDlRX;
        int i2 = (int) (atomicLongFieldUpdater.get(quVar) & 2097151);
        if (i2 < 2) {
            return null;
        }
        int Y1f8riQaR6yg = Y1f8riQaR6yg(i2);
        long j = Long.MAX_VALUE;
        for (int i3 = 0; i3 < i2; i3++) {
            Y1f8riQaR6yg++;
            if (Y1f8riQaR6yg > i2) {
                Y1f8riQaR6yg = 1;
            }
            ou ouVar = (ou) quVar.r3s1LDPKFs1S.lS5Rgt96tfkO(Y1f8riQaR6yg);
            if (ouVar != null && ouVar != this) {
                uu2 uu2Var = ouVar.rtx2ld2ELZv4;
                if (i == 3) {
                    ud2Var = uu2Var.a92UlCVFR9N8();
                } else {
                    uu2Var.getClass();
                    int i4 = uu2.Y1f8riQaR6yg.get(uu2Var);
                    int i5 = uu2.TSizfFm2Yiuu.get(uu2Var);
                    boolean z = i == 1;
                    while (i4 != i5 && (!z || uu2.e9gEMXR7LXtO.get(uu2Var) != 0)) {
                        int i6 = i4 + 1;
                        ud2Var = uu2Var.rtx2ld2ELZv4(i4, z);
                        if (ud2Var != null) {
                            break;
                        }
                        i4 = i6;
                    }
                    ud2Var = null;
                }
                zt1 zt1Var = this.OPXfSBeufaJ8;
                if (ud2Var != null) {
                    zt1Var.rtx2ld2ELZv4 = ud2Var;
                    OPXfSBeufaJ8 = -1;
                } else {
                    OPXfSBeufaJ8 = uu2Var.OPXfSBeufaJ8(i, zt1Var);
                }
                if (OPXfSBeufaJ8 == -1) {
                    ud2 ud2Var2 = (ud2) zt1Var.rtx2ld2ELZv4;
                    zt1Var.rtx2ld2ELZv4 = null;
                    return ud2Var2;
                }
                if (OPXfSBeufaJ8 > 0) {
                    j = Math.min(j, OPXfSBeufaJ8);
                }
            }
        }
        if (j == Long.MAX_VALUE) {
            j = 0;
        }
        this.x50lh2ztY7Y5 = j;
        return null;
    }

    public final ud2 PxuCJdSBwIXG(boolean z) {
        ud2 e9gEMXR7LXtO;
        ud2 e9gEMXR7LXtO2;
        long j;
        pu puVar = this.wdg6QnbFHrFF;
        qu quVar = this.QrzZRwfaDlRX;
        uu2 uu2Var = this.rtx2ld2ELZv4;
        pu puVar2 = pu.rtx2ld2ELZv4;
        if (puVar != puVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = qu.gPXPFXrUH4XX;
            do {
                j = atomicLongFieldUpdater.get(quVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    ud2 RAsUl2FVSrh6 = uu2Var.RAsUl2FVSrh6();
                    return (RAsUl2FVSrh6 == null && (RAsUl2FVSrh6 = (ud2) quVar.cpQdD2nAriOS.Y1f8riQaR6yg()) == null) ? OPXfSBeufaJ8(1) : RAsUl2FVSrh6;
                }
            } while (!qu.gPXPFXrUH4XX.compareAndSet(quVar, j, j - 4398046511104L));
            this.wdg6QnbFHrFF = puVar2;
        }
        if (z) {
            boolean z2 = Y1f8riQaR6yg(quVar.rtx2ld2ELZv4 * 2) == 0;
            if (z2 && (e9gEMXR7LXtO2 = e9gEMXR7LXtO()) != null) {
                return e9gEMXR7LXtO2;
            }
            ud2 e9gEMXR7LXtO3 = uu2Var.e9gEMXR7LXtO();
            if (e9gEMXR7LXtO3 != null) {
                return e9gEMXR7LXtO3;
            }
            if (!z2 && (e9gEMXR7LXtO = e9gEMXR7LXtO()) != null) {
                return e9gEMXR7LXtO;
            }
        } else {
            ud2 e9gEMXR7LXtO4 = e9gEMXR7LXtO();
            if (e9gEMXR7LXtO4 != null) {
                return e9gEMXR7LXtO4;
            }
        }
        return OPXfSBeufaJ8(3);
    }

    public final void RAsUl2FVSrh6(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final Object TSizfFm2Yiuu() {
        return this.nextParkedWorker;
    }

    public final int Y1f8riQaR6yg(int i) {
        int i2 = this.cpQdD2nAriOS;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.cpQdD2nAriOS = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final void a92UlCVFR9N8(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.QrzZRwfaDlRX.dgRBjINgWbAK);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final ud2 e9gEMXR7LXtO() {
        int Y1f8riQaR6yg = Y1f8riQaR6yg(2);
        qu quVar = this.QrzZRwfaDlRX;
        tg0 tg0Var = quVar.cpQdD2nAriOS;
        tg0 tg0Var2 = quVar.x50lh2ztY7Y5;
        if (Y1f8riQaR6yg == 0) {
            ud2 ud2Var = (ud2) tg0Var2.Y1f8riQaR6yg();
            return ud2Var != null ? ud2Var : (ud2) tg0Var.Y1f8riQaR6yg();
        }
        ud2 ud2Var2 = (ud2) tg0Var.Y1f8riQaR6yg();
        return ud2Var2 != null ? ud2Var2 : (ud2) tg0Var2.Y1f8riQaR6yg();
    }

    public final int lS5Rgt96tfkO() {
        return this.indexInArray;
    }

    public final boolean rtx2ld2ELZv4(pu puVar) {
        pu puVar2 = this.wdg6QnbFHrFF;
        boolean z = puVar2 == pu.rtx2ld2ELZv4;
        if (z) {
            qu.gPXPFXrUH4XX.addAndGet(this.QrzZRwfaDlRX, 4398046511104L);
        }
        if (puVar2 != puVar) {
            this.wdg6QnbFHrFF = puVar;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (qu.BRwzKIf41E4i.get(this.QrzZRwfaDlRX) == 0) {
                pu puVar = this.wdg6QnbFHrFF;
                pu puVar2 = pu.x50lh2ztY7Y5;
                if (puVar == puVar2) {
                    break loop0;
                }
                ud2 PxuCJdSBwIXG = PxuCJdSBwIXG(this.r3s1LDPKFs1S);
                if (PxuCJdSBwIXG != null) {
                    this.x50lh2ztY7Y5 = 0L;
                    qu quVar = this.QrzZRwfaDlRX;
                    this.dgRBjINgWbAK = 0L;
                    if (this.wdg6QnbFHrFF == pu.wdg6QnbFHrFF) {
                        this.wdg6QnbFHrFF = pu.OPXfSBeufaJ8;
                    }
                    if (PxuCJdSBwIXG.OPXfSBeufaJ8) {
                        if (rtx2ld2ELZv4(pu.OPXfSBeufaJ8) && !quVar.XL4ISE6Oc65B() && !quVar.gPXPFXrUH4XX(qu.gPXPFXrUH4XX.get(quVar))) {
                            quVar.XL4ISE6Oc65B();
                        }
                        try {
                            PxuCJdSBwIXG.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        qu.gPXPFXrUH4XX.addAndGet(quVar, -2097152L);
                        if (this.wdg6QnbFHrFF != puVar2) {
                            this.wdg6QnbFHrFF = pu.dgRBjINgWbAK;
                        }
                    } else {
                        try {
                            PxuCJdSBwIXG.run();
                        } catch (Throwable th2) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.r3s1LDPKFs1S = false;
                    if (this.x50lh2ztY7Y5 == 0) {
                        Object obj = this.nextParkedWorker;
                        f50 f50Var = qu.XL4ISE6Oc65B;
                        if (obj != f50Var) {
                            gPXPFXrUH4XX.set(this, -1);
                            while (this.nextParkedWorker != qu.XL4ISE6Oc65B) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = gPXPFXrUH4XX;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    qu quVar2 = this.QrzZRwfaDlRX;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = qu.BRwzKIf41E4i;
                                    if (atomicIntegerFieldUpdater2.get(quVar2) != 0) {
                                        break;
                                    }
                                    pu puVar3 = this.wdg6QnbFHrFF;
                                    pu puVar4 = pu.x50lh2ztY7Y5;
                                    if (puVar3 == puVar4) {
                                        break;
                                    }
                                    rtx2ld2ELZv4(pu.wdg6QnbFHrFF);
                                    Thread.interrupted();
                                    if (this.dgRBjINgWbAK == 0) {
                                        j = 2097151;
                                        this.dgRBjINgWbAK = System.nanoTime() + this.QrzZRwfaDlRX.wdg6QnbFHrFF;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.QrzZRwfaDlRX.wdg6QnbFHrFF);
                                    if (System.nanoTime() - this.dgRBjINgWbAK >= 0) {
                                        this.dgRBjINgWbAK = 0L;
                                        qu quVar3 = this.QrzZRwfaDlRX;
                                        synchronized (quVar3.r3s1LDPKFs1S) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(quVar3) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = qu.gPXPFXrUH4XX;
                                                    if (((int) (atomicLongFieldUpdater.get(quVar3) & j)) > quVar3.rtx2ld2ELZv4) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i = this.indexInArray;
                                                            a92UlCVFR9N8(0);
                                                            quVar3.cpQdD2nAriOS(this, i, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(quVar3) & j);
                                                            if (andDecrement != i) {
                                                                Object lS5Rgt96tfkO = quVar3.r3s1LDPKFs1S.lS5Rgt96tfkO(andDecrement);
                                                                lS5Rgt96tfkO.getClass();
                                                                ou ouVar = (ou) lS5Rgt96tfkO;
                                                                quVar3.r3s1LDPKFs1S.TSizfFm2Yiuu(i, ouVar);
                                                                ouVar.a92UlCVFR9N8(i);
                                                                quVar3.cpQdD2nAriOS(ouVar, andDecrement, i);
                                                            }
                                                            quVar3.r3s1LDPKFs1S.TSizfFm2Yiuu(andDecrement, null);
                                                            this.wdg6QnbFHrFF = puVar4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            qu quVar4 = this.QrzZRwfaDlRX;
                            if (this.nextParkedWorker == f50Var) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = qu.QrzZRwfaDlRX;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(quVar4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = quVar4.r3s1LDPKFs1S.lS5Rgt96tfkO((int) (j2 & 2097151));
                                    qu quVar5 = quVar4;
                                    if (qu.QrzZRwfaDlRX.compareAndSet(quVar5, j2, ((j2 + 2097152) & (-2097152)) | i2)) {
                                        break;
                                    } else {
                                        quVar4 = quVar5;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        rtx2ld2ELZv4(pu.wdg6QnbFHrFF);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.x50lh2ztY7Y5);
                        this.x50lh2ztY7Y5 = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        rtx2ld2ELZv4(pu.x50lh2ztY7Y5);
    }
}
