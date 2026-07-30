package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class uj {
    public boolean PxuCJdSBwIXG;
    public Object TSizfFm2Yiuu;
    public Object Y1f8riQaR6yg;
    public Object e9gEMXR7LXtO;
    public Object lS5Rgt96tfkO;

    public boolean PxuCJdSBwIXG() {
        boolean z;
        synchronized (this.lS5Rgt96tfkO) {
            z = false;
            if (this.PxuCJdSBwIXG && ((Exception) this.e9gEMXR7LXtO) == null) {
                z = true;
            }
        }
        return z;
    }

    public void TSizfFm2Yiuu(int i, int i2) {
        if (i < 0.0f) {
            hp0.PxuCJdSBwIXG("Index should be non-negative (" + i + ')');
        }
        ((hj1) this.lS5Rgt96tfkO).OPXfSBeufaJ8(i);
        ((hy0) this.e9gEMXR7LXtO).PxuCJdSBwIXG(i);
        ((hj1) this.TSizfFm2Yiuu).OPXfSBeufaJ8(i2);
    }

    public void Y1f8riQaR6yg() {
        boolean z;
        Exception exc;
        String str;
        Boolean bool;
        if (this.PxuCJdSBwIXG) {
            synchronized (this.lS5Rgt96tfkO) {
                z = this.PxuCJdSBwIXG;
            }
            if (!z) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            synchronized (this.lS5Rgt96tfkO) {
                exc = (Exception) this.e9gEMXR7LXtO;
            }
            if (exc != null) {
                str = "failure";
            } else if (PxuCJdSBwIXG()) {
                synchronized (this.lS5Rgt96tfkO) {
                    if (!this.PxuCJdSBwIXG) {
                        throw new IllegalStateException("Task is not yet complete");
                    }
                    Exception exc2 = (Exception) this.e9gEMXR7LXtO;
                    if (exc2 != null) {
                        throw new tm(exc2);
                    }
                    bool = (Boolean) this.Y1f8riQaR6yg;
                }
                str = "result ".concat(String.valueOf(bool));
            } else {
                str = "unknown issue";
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int lS5Rgt96tfkO(op0 op0Var, r1 r1Var, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        wj0 wj0Var = (wj0) this.TSizfFm2Yiuu;
        zj0 zj0Var = (zj0) this.e9gEMXR7LXtO;
        if (this.PxuCJdSBwIXG) {
            return 0;
        }
        try {
            this.PxuCJdSBwIXG = true;
            op0 x50lh2ztY7Y5 = ((i2) this.Y1f8riQaR6yg).x50lh2ztY7Y5(op0Var, r1Var);
            p31 p31Var = (p31) x50lh2ztY7Y5.OPXfSBeufaJ8;
            int a92UlCVFR9N8 = p31Var.a92UlCVFR9N8();
            for (int i3 = 0; i3 < a92UlCVFR9N8; i3++) {
                ao1 ao1Var = (ao1) p31Var.RAsUl2FVSrh6(i3);
                if (!ao1Var.Y1f8riQaR6yg && !ao1Var.rtx2ld2ELZv4) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int a92UlCVFR9N82 = p31Var.a92UlCVFR9N8();
            for (int i4 = 0; i4 < a92UlCVFR9N82; i4++) {
                ao1 ao1Var2 = (ao1) p31Var.RAsUl2FVSrh6(i4);
                if (objArr != false || ni0.wdg6QnbFHrFF(ao1Var2)) {
                    ((vw0) this.lS5Rgt96tfkO).IAToe7bXGz4N(ao1Var2.TSizfFm2Yiuu, (zj0) this.e9gEMXR7LXtO, ao1Var2.OPXfSBeufaJ8, true);
                    if (!zj0Var.rtx2ld2ELZv4.rtx2ld2ELZv4()) {
                        wj0Var.PxuCJdSBwIXG(ao1Var2.PxuCJdSBwIXG, zj0Var, ni0.wdg6QnbFHrFF(ao1Var2));
                        zj0Var.clear();
                    }
                }
            }
            boolean lS5Rgt96tfkO = wj0Var.lS5Rgt96tfkO(x50lh2ztY7Y5, z);
            int a92UlCVFR9N83 = p31Var.a92UlCVFR9N8();
            int i5 = 0;
            while (true) {
                if (i5 >= a92UlCVFR9N83) {
                    i = 0;
                    break;
                }
                ao1 ao1Var3 = (ao1) p31Var.RAsUl2FVSrh6(i5);
                long EpkonXwzFgDB = ni0.EpkonXwzFgDB(ao1Var3, true);
                bf1.Companion.getClass();
                if (!bf1.lS5Rgt96tfkO(EpkonXwzFgDB, 0L) && ao1Var3.lS5Rgt96tfkO()) {
                    i = 1;
                    break;
                }
                i5++;
            }
            int a92UlCVFR9N84 = p31Var.a92UlCVFR9N8();
            int i6 = 0;
            while (true) {
                if (i6 >= a92UlCVFR9N84) {
                    i2 = 0;
                    break;
                }
                if (((ao1) p31Var.RAsUl2FVSrh6(i6)).lS5Rgt96tfkO()) {
                    i2 = 1;
                    break;
                }
                i6++;
            }
            int i7 = (lS5Rgt96tfkO ? 1 : 0) | (i << 1) | (i2 << 2);
            this.PxuCJdSBwIXG = false;
            return i7;
        } catch (Throwable th) {
            this.PxuCJdSBwIXG = false;
            throw th;
        }
    }
}
