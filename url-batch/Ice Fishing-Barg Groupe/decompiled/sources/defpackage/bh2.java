package defpackage;

import android.os.Parcel;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class bh2 {
    public boolean PxuCJdSBwIXG;
    public Object TSizfFm2Yiuu;
    public Object lS5Rgt96tfkO;

    public void PxuCJdSBwIXG(y8 y8Var, vd2 vd2Var) {
        b42 b42Var = (b42) ((b42) this.TSizfFm2Yiuu).OPXfSBeufaJ8;
        b42Var.getClass();
        mw2 mw2Var = (mw2) ((qw2) y8Var).BRwzKIf41E4i();
        ee2 ee2Var = (ee2) b42Var.OPXfSBeufaJ8;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(mw2Var.Y1f8riQaR6yg);
        int i = aw2.PxuCJdSBwIXG;
        if (ee2Var == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            ee2Var.writeToParcel(obtain, 0);
        }
        try {
            mw2Var.TSizfFm2Yiuu.transact(1, obtain, null, 1);
            obtain.recycle();
            uj ujVar = vd2Var.PxuCJdSBwIXG;
            synchronized (ujVar.lS5Rgt96tfkO) {
                ujVar.Y1f8riQaR6yg();
                ujVar.PxuCJdSBwIXG = true;
                ujVar.Y1f8riQaR6yg = null;
            }
            ((bh2) ujVar.TSizfFm2Yiuu).e9gEMXR7LXtO(ujVar);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public long TSizfFm2Yiuu(oh2 oh2Var, long j, boolean z, j22 j22Var) {
        eh2 eh2Var = (eh2) this.TSizfFm2Yiuu;
        long TSizfFm2Yiuu = eh2.TSizfFm2Yiuu(eh2Var, oh2Var, j, z, false, j22Var, false, null);
        if (!vi2.PxuCJdSBwIXG(TSizfFm2Yiuu, (vi2) this.lS5Rgt96tfkO)) {
            this.PxuCJdSBwIXG = false;
        }
        eh2Var.XL4ISE6Oc65B(vi2.TSizfFm2Yiuu(TSizfFm2Yiuu) ? mi0.wdg6QnbFHrFF : mi0.OPXfSBeufaJ8);
        return TSizfFm2Yiuu;
    }

    public void Y1f8riQaR6yg(lx2 lx2Var) {
        synchronized (this.lS5Rgt96tfkO) {
            try {
                if (((ArrayDeque) this.TSizfFm2Yiuu) == null) {
                    this.TSizfFm2Yiuu = new ArrayDeque();
                }
                ((ArrayDeque) this.TSizfFm2Yiuu).add(lx2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e9gEMXR7LXtO(uj ujVar) {
        lx2 lx2Var;
        boolean z;
        synchronized (this.lS5Rgt96tfkO) {
            if (((ArrayDeque) this.TSizfFm2Yiuu) != null && !this.PxuCJdSBwIXG) {
                this.PxuCJdSBwIXG = true;
                while (true) {
                    synchronized (this.lS5Rgt96tfkO) {
                        try {
                            lx2Var = (lx2) ((ArrayDeque) this.TSizfFm2Yiuu).poll();
                            z = false;
                            if (lx2Var == null) {
                                this.PxuCJdSBwIXG = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    switch (lx2Var.PxuCJdSBwIXG) {
                        case 0:
                            synchronized (lx2Var.TSizfFm2Yiuu) {
                            }
                            lx2Var.lS5Rgt96tfkO.execute(new sh(7, lx2Var, ujVar, z));
                            break;
                        default:
                            if (!ujVar.PxuCJdSBwIXG()) {
                                synchronized (lx2Var.TSizfFm2Yiuu) {
                                }
                                lx2Var.lS5Rgt96tfkO.execute(new sh(8, lx2Var, ujVar, z));
                                break;
                            } else {
                                continue;
                            }
                    }
                }
            }
        }
    }

    public void lS5Rgt96tfkO() {
        if (this.PxuCJdSBwIXG) {
            eh2.lS5Rgt96tfkO((eh2) this.TSizfFm2Yiuu, (vi2) this.lS5Rgt96tfkO);
        }
    }
}
