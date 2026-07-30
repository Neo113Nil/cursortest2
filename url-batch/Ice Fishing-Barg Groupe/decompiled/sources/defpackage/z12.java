package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class z12 {
    public static final y12 Companion = new y12();
    public final byte[] PxuCJdSBwIXG;
    public z12 RAsUl2FVSrh6;
    public int TSizfFm2Yiuu;
    public boolean Y1f8riQaR6yg;
    public z12 a92UlCVFR9N8;
    public final boolean e9gEMXR7LXtO;
    public int lS5Rgt96tfkO;

    public z12(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        bArr.getClass();
        this.PxuCJdSBwIXG = bArr;
        this.lS5Rgt96tfkO = i;
        this.TSizfFm2Yiuu = i2;
        this.Y1f8riQaR6yg = z;
        this.e9gEMXR7LXtO = z2;
    }

    public final z12 PxuCJdSBwIXG() {
        z12 z12Var = this.a92UlCVFR9N8;
        if (z12Var == this) {
            z12Var = null;
        }
        z12 z12Var2 = this.RAsUl2FVSrh6;
        z12Var2.getClass();
        z12Var2.a92UlCVFR9N8 = this.a92UlCVFR9N8;
        z12 z12Var3 = this.a92UlCVFR9N8;
        z12Var3.getClass();
        z12Var3.RAsUl2FVSrh6 = this.RAsUl2FVSrh6;
        this.a92UlCVFR9N8 = null;
        this.RAsUl2FVSrh6 = null;
        return z12Var;
    }

    public final z12 TSizfFm2Yiuu() {
        this.Y1f8riQaR6yg = true;
        return new z12(this.PxuCJdSBwIXG, this.lS5Rgt96tfkO, this.TSizfFm2Yiuu, true, false);
    }

    public final void Y1f8riQaR6yg(z12 z12Var, int i) {
        z12Var.getClass();
        byte[] bArr = z12Var.PxuCJdSBwIXG;
        if (!z12Var.e9gEMXR7LXtO) {
            u9.rtx2ld2ELZv4("only owner can write");
            return;
        }
        int i2 = z12Var.TSizfFm2Yiuu;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (z12Var.Y1f8riQaR6yg) {
                throw new IllegalArgumentException();
            }
            int i4 = z12Var.lS5Rgt96tfkO;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            na.D0aTLcX6Uhyo(bArr, bArr, 0, i4, i2);
            z12Var.TSizfFm2Yiuu -= z12Var.lS5Rgt96tfkO;
            z12Var.lS5Rgt96tfkO = 0;
        }
        int i5 = z12Var.TSizfFm2Yiuu;
        int i6 = this.lS5Rgt96tfkO;
        na.D0aTLcX6Uhyo(this.PxuCJdSBwIXG, bArr, i5, i6, i6 + i);
        z12Var.TSizfFm2Yiuu += i;
        this.lS5Rgt96tfkO += i;
    }

    public final void lS5Rgt96tfkO(z12 z12Var) {
        z12Var.getClass();
        z12Var.RAsUl2FVSrh6 = this;
        z12Var.a92UlCVFR9N8 = this.a92UlCVFR9N8;
        z12 z12Var2 = this.a92UlCVFR9N8;
        z12Var2.getClass();
        z12Var2.RAsUl2FVSrh6 = z12Var;
        this.a92UlCVFR9N8 = z12Var;
    }

    public z12() {
        this.PxuCJdSBwIXG = new byte[8192];
        this.e9gEMXR7LXtO = true;
        this.Y1f8riQaR6yg = false;
    }
}
