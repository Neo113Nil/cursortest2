package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class y01 extends ju implements rx {
    public static final /* synthetic */ AtomicIntegerFieldUpdater QrzZRwfaDlRX = AtomicIntegerFieldUpdater.newUpdater(y01.class, "runningWorkers$volatile");
    public final u21 cpQdD2nAriOS;
    public final ju dgRBjINgWbAK;
    public final Object r3s1LDPKFs1S;
    private volatile /* synthetic */ int runningWorkers$volatile;
    public final /* synthetic */ rx wdg6QnbFHrFF;
    public final int x50lh2ztY7Y5;

    /* JADX WARN: Multi-variable type inference failed */
    public y01(ju juVar, int i) {
        rx rxVar = juVar instanceof rx ? (rx) juVar : null;
        this.wdg6QnbFHrFF = rxVar == null ? jw.PxuCJdSBwIXG : rxVar;
        this.dgRBjINgWbAK = juVar;
        this.x50lh2ztY7Y5 = i;
        this.cpQdD2nAriOS = new u21();
        this.r3s1LDPKFs1S = new Object();
    }

    @Override // defpackage.ju
    public final void Pf0ThKz3j5YS(hu huVar, Runnable runnable) {
        Runnable zf8DYfih6EZu;
        this.cpQdD2nAriOS.PxuCJdSBwIXG(runnable);
        if (QrzZRwfaDlRX.get(this) >= this.x50lh2ztY7Y5 || !wLFCmsViZrNT() || (zf8DYfih6EZu = zf8DYfih6EZu()) == null) {
            return;
        }
        this.dgRBjINgWbAK.Pf0ThKz3j5YS(this, new sh(2, this, zf8DYfih6EZu, false));
    }

    @Override // defpackage.rx
    public final s00 cpQdD2nAriOS(long j, ak2 ak2Var, hu huVar) {
        return this.wdg6QnbFHrFF.cpQdD2nAriOS(j, ak2Var, huVar);
    }

    @Override // defpackage.ju
    public final void gGoUzNp9JO5I(hu huVar, Runnable runnable) {
        Runnable zf8DYfih6EZu;
        this.cpQdD2nAriOS.PxuCJdSBwIXG(runnable);
        if (QrzZRwfaDlRX.get(this) >= this.x50lh2ztY7Y5 || !wLFCmsViZrNT() || (zf8DYfih6EZu = zf8DYfih6EZu()) == null) {
            return;
        }
        this.dgRBjINgWbAK.gGoUzNp9JO5I(this, new sh(2, this, zf8DYfih6EZu, false));
    }

    @Override // defpackage.rx
    public final void gPXPFXrUH4XX(long j, bi biVar) {
        this.wdg6QnbFHrFF.gPXPFXrUH4XX(j, biVar);
    }

    @Override // defpackage.ju
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.dgRBjINgWbAK);
        sb.append(".limitedParallelism(");
        return o0.r3s1LDPKFs1S(sb, this.x50lh2ztY7Y5, ')');
    }

    public final boolean wLFCmsViZrNT() {
        synchronized (this.r3s1LDPKFs1S) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = QrzZRwfaDlRX;
            if (atomicIntegerFieldUpdater.get(this) >= this.x50lh2ztY7Y5) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    public final Runnable zf8DYfih6EZu() {
        while (true) {
            Runnable runnable = (Runnable) this.cpQdD2nAriOS.Y1f8riQaR6yg();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.r3s1LDPKFs1S) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = QrzZRwfaDlRX;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.cpQdD2nAriOS.TSizfFm2Yiuu() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
