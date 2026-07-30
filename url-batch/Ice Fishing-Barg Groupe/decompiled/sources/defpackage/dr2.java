package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class dr2 {
    public final er2 PxuCJdSBwIXG = new er2();

    public final void PxuCJdSBwIXG(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        er2 er2Var = this.PxuCJdSBwIXG;
        if (er2Var != null) {
            if (er2Var.Y1f8riQaR6yg) {
                er2.PxuCJdSBwIXG(autoCloseable);
                return;
            }
            synchronized (er2Var.PxuCJdSBwIXG) {
                autoCloseable2 = (AutoCloseable) er2Var.lS5Rgt96tfkO.put(str, autoCloseable);
            }
            er2.PxuCJdSBwIXG(autoCloseable2);
        }
    }

    public final AutoCloseable TSizfFm2Yiuu(String str) {
        AutoCloseable autoCloseable;
        er2 er2Var = this.PxuCJdSBwIXG;
        if (er2Var == null) {
            return null;
        }
        synchronized (er2Var.PxuCJdSBwIXG) {
            autoCloseable = (AutoCloseable) er2Var.lS5Rgt96tfkO.get(str);
        }
        return autoCloseable;
    }

    public final void lS5Rgt96tfkO() {
        er2 er2Var = this.PxuCJdSBwIXG;
        if (er2Var != null && !er2Var.Y1f8riQaR6yg) {
            er2Var.Y1f8riQaR6yg = true;
            synchronized (er2Var.PxuCJdSBwIXG) {
                try {
                    Iterator it = er2Var.lS5Rgt96tfkO.values().iterator();
                    while (it.hasNext()) {
                        er2.PxuCJdSBwIXG((AutoCloseable) it.next());
                    }
                    Iterator it2 = er2Var.TSizfFm2Yiuu.iterator();
                    while (it2.hasNext()) {
                        er2.PxuCJdSBwIXG((AutoCloseable) it2.next());
                    }
                    er2Var.TSizfFm2Yiuu.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Y1f8riQaR6yg();
    }

    public void Y1f8riQaR6yg() {
    }
}
