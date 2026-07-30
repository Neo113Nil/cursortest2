package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vd2 {
    public final uj PxuCJdSBwIXG;

    public vd2() {
        uj ujVar = new uj();
        ujVar.lS5Rgt96tfkO = new Object();
        bh2 bh2Var = new bh2();
        bh2Var.lS5Rgt96tfkO = new Object();
        ujVar.TSizfFm2Yiuu = bh2Var;
        this.PxuCJdSBwIXG = ujVar;
    }

    public final void PxuCJdSBwIXG(Exception exc) {
        uj ujVar = this.PxuCJdSBwIXG;
        ujVar.getClass();
        jh0.cpQdD2nAriOS(exc, "Exception must not be null");
        synchronized (ujVar.lS5Rgt96tfkO) {
            try {
                if (ujVar.PxuCJdSBwIXG) {
                    return;
                }
                ujVar.PxuCJdSBwIXG = true;
                ujVar.e9gEMXR7LXtO = exc;
                ((bh2) ujVar.TSizfFm2Yiuu).e9gEMXR7LXtO(ujVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
