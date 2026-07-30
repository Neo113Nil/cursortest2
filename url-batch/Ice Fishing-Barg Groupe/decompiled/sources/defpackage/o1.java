package defpackage;

import android.view.MotionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class o1 implements Runnable {
    public final Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public o1(rv2 rv2Var, um umVar) {
        this.rtx2ld2ELZv4 = 7;
        this.OPXfSBeufaJ8 = umVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int actionMasked;
        td2 lS5Rgt96tfkO;
        long j;
        switch (this.rtx2ld2ELZv4) {
            case 0:
                r1 r1Var = (r1) this.OPXfSBeufaJ8;
                r1Var.removeCallbacks(this);
                MotionEvent motionEvent = r1Var.OYiFbU3x63rc;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                int i = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i = 2;
                }
                r1Var.EpkonXwzFgDB(motionEvent, i, r1Var.IxJ9cAW40yOk, false);
                return;
            case 1:
                ((mz) this.OPXfSBeufaJ8).BRwzKIf41E4i.getClass();
                return;
            case 2:
                ((id0) this.OPXfSBeufaJ8).OPXfSBeufaJ8();
                throw null;
            case 3:
                be2 be2Var = (be2) this.OPXfSBeufaJ8;
                synchronized (be2Var) {
                    be2Var.RAsUl2FVSrh6++;
                    lS5Rgt96tfkO = be2Var.lS5Rgt96tfkO();
                }
                if (lS5Rgt96tfkO == null) {
                    return;
                }
                Thread currentThread = Thread.currentThread();
                String name = currentThread.getName();
                do {
                    td2 td2Var = lS5Rgt96tfkO;
                    try {
                        currentThread.setName(td2Var.PxuCJdSBwIXG);
                        Logger logger = ((be2) this.OPXfSBeufaJ8).lS5Rgt96tfkO;
                        zd2 zd2Var = td2Var.TSizfFm2Yiuu;
                        zd2Var.getClass();
                        boolean isLoggable = logger.isLoggable(Level.FINE);
                        if (isLoggable) {
                            j = System.nanoTime();
                            kj0.Y1f8riQaR6yg(logger, td2Var, zd2Var, "starting");
                        } else {
                            j = -1;
                        }
                        try {
                            long PxuCJdSBwIXG = td2Var.PxuCJdSBwIXG();
                            if (isLoggable) {
                                kj0.Y1f8riQaR6yg(logger, td2Var, zd2Var, "finished run in " + kj0.pnx5pC0XzaCw(System.nanoTime() - j));
                            }
                            be2 be2Var2 = (be2) this.OPXfSBeufaJ8;
                            synchronized (be2Var2) {
                                be2.PxuCJdSBwIXG(be2Var2, td2Var, PxuCJdSBwIXG, true);
                                lS5Rgt96tfkO = be2Var2.lS5Rgt96tfkO();
                            }
                        } catch (Throwable th) {
                            if (isLoggable) {
                                kj0.Y1f8riQaR6yg(logger, td2Var, zd2Var, "failed a run in " + kj0.pnx5pC0XzaCw(System.nanoTime() - j));
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            be2 be2Var3 = (be2) this.OPXfSBeufaJ8;
                            synchronized (be2Var3) {
                                be2.PxuCJdSBwIXG(be2Var3, td2Var, -1L, false);
                                if (!(th2 instanceof InterruptedException)) {
                                    throw th2;
                                }
                                Thread.currentThread().interrupt();
                            }
                        } catch (Throwable th3) {
                            currentThread.setName(name);
                            throw th3;
                        }
                    }
                } while (lS5Rgt96tfkO != null);
                currentThread.setName(name);
                return;
            case 4:
                ((uv2) this.OPXfSBeufaJ8).rtx2ld2ELZv4();
                return;
            case 5:
                y8 y8Var = ((uv2) ((b42) this.OPXfSBeufaJ8).OPXfSBeufaJ8).Y1f8riQaR6yg;
                y8Var.TSizfFm2Yiuu(y8Var.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 6:
                ((ew2) this.OPXfSBeufaJ8).wdg6QnbFHrFF.PxuCJdSBwIXG(new xq(4));
                return;
            default:
                throw null;
        }
    }

    public /* synthetic */ o1(int i, Object obj) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
    }
}
