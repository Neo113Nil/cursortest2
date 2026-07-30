package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final class b62 extends r61 {
    public final float PxuCJdSBwIXG;
    public final float TSizfFm2Yiuu;
    public final float Y1f8riQaR6yg;
    public final boolean e9gEMXR7LXtO;
    public final float lS5Rgt96tfkO;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ b62(float f, float f2, float f3, float f4, int i) {
        this(r3, r4, r5, r6, true);
        float f5;
        float f6;
        float f7;
        float f8;
        if ((i & 1) != 0) {
            k10.Companion.getClass();
            f5 = Float.NaN;
        } else {
            f5 = f;
        }
        if ((i & 2) != 0) {
            k10.Companion.getClass();
            f6 = Float.NaN;
        } else {
            f6 = f2;
        }
        if ((i & 4) != 0) {
            k10.Companion.getClass();
            f7 = Float.NaN;
        } else {
            f7 = f3;
        }
        if ((i & 8) != 0) {
            k10.Companion.getClass();
            f8 = Float.NaN;
        } else {
            f8 = f4;
        }
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        d62 d62Var = new d62();
        d62Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        d62Var.S2OOm9zPNm0h = this.lS5Rgt96tfkO;
        d62Var.ZbWwgt3aGe7A = this.TSizfFm2Yiuu;
        d62Var.pnx5pC0XzaCw = this.Y1f8riQaR6yg;
        d62Var.IAToe7bXGz4N = this.e9gEMXR7LXtO;
        return d62Var;
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        d62 d62Var = (d62) m61Var;
        d62Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        d62Var.S2OOm9zPNm0h = this.lS5Rgt96tfkO;
        d62Var.ZbWwgt3aGe7A = this.TSizfFm2Yiuu;
        d62Var.pnx5pC0XzaCw = this.Y1f8riQaR6yg;
        d62Var.IAToe7bXGz4N = this.e9gEMXR7LXtO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b62)) {
            return false;
        }
        b62 b62Var = (b62) obj;
        return k10.lS5Rgt96tfkO(this.PxuCJdSBwIXG, b62Var.PxuCJdSBwIXG) && k10.lS5Rgt96tfkO(this.lS5Rgt96tfkO, b62Var.lS5Rgt96tfkO) && k10.lS5Rgt96tfkO(this.TSizfFm2Yiuu, b62Var.TSizfFm2Yiuu) && k10.lS5Rgt96tfkO(this.Y1f8riQaR6yg, b62Var.Y1f8riQaR6yg) && this.e9gEMXR7LXtO == b62Var.e9gEMXR7LXtO;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e9gEMXR7LXtO) + o0.PxuCJdSBwIXG(this.Y1f8riQaR6yg, o0.PxuCJdSBwIXG(this.TSizfFm2Yiuu, o0.PxuCJdSBwIXG(this.lS5Rgt96tfkO, Float.hashCode(this.PxuCJdSBwIXG) * 31, 31), 31), 31);
    }

    public b62(float f, float f2, float f3, float f4, boolean z) {
        this.PxuCJdSBwIXG = f;
        this.lS5Rgt96tfkO = f2;
        this.TSizfFm2Yiuu = f3;
        this.Y1f8riQaR6yg = f4;
        this.e9gEMXR7LXtO = z;
    }
}
