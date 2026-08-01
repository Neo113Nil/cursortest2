package com.bytedance.sdk.component.sUS.pvs.icD;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.component.sUS.pvs.NB;
import com.bytedance.sdk.component.sUS.pvs.so;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: LogThreadCenter.java */
/* loaded from: classes.dex */
public class Jd {
    private volatile com.bytedance.sdk.component.sUS.pvs.icD.vG.vG Mxy;
    private volatile Handler Wyp;
    private final PriorityBlockingQueue<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> kj;
    private final Comparator<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> qh;
    public static final Jd pvs = new Jd();
    public static final com.bytedance.sdk.component.sUS.pvs.icD.pvs.pvs Jd = new com.bytedance.sdk.component.sUS.pvs.icD.pvs.pvs();
    public static final AtomicLong NB = new AtomicLong(0);
    public static final AtomicLong sUS = new AtomicLong(0);
    public static final long yiw = System.currentTimeMillis();
    public static long so = 0;
    public volatile boolean icD = false;
    public volatile boolean vG = false;

    public PriorityBlockingQueue<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> pvs() {
        return this.kj;
    }

    private Jd() {
        Comparator<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> comparator = new Comparator<com.bytedance.sdk.component.sUS.pvs.Jd.pvs>() { // from class: com.bytedance.sdk.component.sUS.pvs.icD.Jd.1
            @Override // java.util.Comparator
            /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar, com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar2) {
                return Jd.this.pvs(pvsVar, pvsVar2);
            }
        };
        this.qh = comparator;
        this.kj = new PriorityBlockingQueue<>(8, comparator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int pvs(com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar, com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar2) {
        long j;
        long j2;
        long j3;
        long j4;
        if (pvsVar == null) {
            return pvsVar2 == null ? 0 : -1;
        }
        if (pvsVar2 == null) {
            return 1;
        }
        if (pvsVar.NB() == pvsVar2.NB()) {
            if (pvsVar.pvs() != null) {
                j = pvsVar.pvs().pvs();
                j2 = pvsVar.pvs().icD();
            } else {
                j = 0;
                j2 = 0;
            }
            if (pvsVar2.pvs() != null) {
                j4 = pvsVar2.pvs().pvs();
                j3 = pvsVar2.pvs().icD();
            } else {
                j3 = 0;
                j4 = 0;
            }
            if (j == 0 || j4 == 0) {
                return 0;
            }
            long j5 = j - j4;
            if (Math.abs(j5) > 2147483647L) {
                return 0;
            }
            if (j5 != 0) {
                return (int) j5;
            }
            if (j2 == 0 || j3 == 0) {
                return 0;
            }
            return (int) (j2 - j3);
        }
        return pvsVar.NB() - pvsVar2.NB();
    }

    public void icD() {
        Jd();
        NB();
    }

    public void pvs(Handler handler) {
        this.Wyp = handler;
    }

    public void vG() {
        if (this.Mxy == null || !this.Mxy.isAlive()) {
            return;
        }
        synchronized (this) {
            if (this.Mxy != null && this.Mxy.isAlive()) {
                if (this.Wyp != null) {
                    this.Wyp.removeCallbacksAndMessages(null);
                }
                this.Mxy.pvs(false);
                this.Mxy.quitSafely();
                this.Mxy = null;
            }
        }
    }

    public boolean Jd() {
        try {
            if (this.Mxy != null || com.bytedance.sdk.component.sUS.pvs.icD.icD()) {
                return false;
            }
            synchronized (this) {
                if (this.Mxy != null) {
                    return false;
                }
                this.Mxy = new com.bytedance.sdk.component.sUS.pvs.icD.vG.vG(this.kj);
                this.Mxy.start();
                return true;
            }
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public void pvs(com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar, int i) {
        Jd();
        NB mnm = so.yiw().mnm();
        com.bytedance.sdk.component.sUS.pvs.icD.vG.vG vGVar = this.Mxy;
        if (vGVar != null) {
            pvs(mnm, pvsVar);
            vGVar.pvs(pvsVar, pvsVar.NB() == 4);
        }
    }

    private void pvs(final NB nb, com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar) {
        if (nb != null) {
            try {
                if (nb.yiw()) {
                    final long icD = (pvsVar == null || pvsVar.pvs() == null) ? 0L : pvsVar.pvs().icD();
                    if (icD == 1) {
                        so = System.currentTimeMillis();
                    }
                    AtomicLong rW = Jd.rW();
                    com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(rW, 1);
                    if (rW.get() == 200) {
                        if (Looper.getMainLooper() == Looper.myLooper()) {
                            Executor Jd2 = nb.Jd();
                            if (Jd2 == null) {
                                Jd2 = nb.NB();
                            }
                            if (Jd2 != null) {
                                Jd2.execute(new com.bytedance.sdk.component.sUS.pvs.NB.NB("report") { // from class: com.bytedance.sdk.component.sUS.pvs.icD.Jd.2
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Jd.this.pvs(nb, icD);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        pvs(nb, icD);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(NB nb, long j) {
        com.bytedance.sdk.component.sUS.pvs.icD.vG.vG vGVar = this.Mxy;
        if (nb == null || vGVar == null) {
            return;
        }
        com.bytedance.sdk.component.sUS.pvs.icD.pvs.pvs pvsVar = Jd;
        vGVar.pvs(nb.pvs(pvsVar.icD(j)), true);
        pvsVar.yWX();
    }

    public void NB() {
        com.bytedance.sdk.component.sUS.pvs.vG.icD.pvs(Jd.cRf(), 1);
        final com.bytedance.sdk.component.sUS.pvs.icD.vG.vG vGVar = this.Mxy;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (vGVar != null) {
                vGVar.vG(2);
                return;
            }
            return;
        }
        NB mnm = so.yiw().mnm();
        if (mnm != null) {
            Executor Jd2 = mnm.Jd();
            if (Jd2 == null) {
                Jd2 = mnm.NB();
            }
            if (Jd2 != null) {
                Jd2.execute(new com.bytedance.sdk.component.sUS.pvs.NB.NB("flush") { // from class: com.bytedance.sdk.component.sUS.pvs.icD.Jd.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.sUS.pvs.icD.vG.vG vGVar2 = vGVar;
                        if (vGVar2 != null) {
                            vGVar2.vG(2);
                        }
                    }
                });
            }
        }
    }
}
