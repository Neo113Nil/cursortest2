package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class en0 {
    public static final dn0 Companion;
    public static int dgRBjINgWbAK;
    public static final dn0 x50lh2ztY7Y5;
    public final boolean OPXfSBeufaJ8;
    public final String PxuCJdSBwIXG;
    public final long RAsUl2FVSrh6;
    public final float TSizfFm2Yiuu;
    public final float Y1f8riQaR6yg;
    public final np2 a92UlCVFR9N8;
    public final float e9gEMXR7LXtO;
    public final float lS5Rgt96tfkO;
    public final int rtx2ld2ELZv4;
    public final int wdg6QnbFHrFF;

    static {
        dn0 dn0Var = new dn0();
        Companion = dn0Var;
        x50lh2ztY7Y5 = dn0Var;
    }

    public en0(String str, float f, float f2, float f3, float f4, np2 np2Var, long j, int i, boolean z) {
        int i2;
        Companion.getClass();
        synchronized (x50lh2ztY7Y5) {
            i2 = dgRBjINgWbAK;
            dgRBjINgWbAK = i2 + 1;
        }
        this.PxuCJdSBwIXG = str;
        this.lS5Rgt96tfkO = f;
        this.TSizfFm2Yiuu = f2;
        this.Y1f8riQaR6yg = f3;
        this.e9gEMXR7LXtO = f4;
        this.a92UlCVFR9N8 = np2Var;
        this.RAsUl2FVSrh6 = j;
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = z;
        this.wdg6QnbFHrFF = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en0)) {
            return false;
        }
        en0 en0Var = (en0) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, en0Var.PxuCJdSBwIXG) && k10.lS5Rgt96tfkO(this.lS5Rgt96tfkO, en0Var.lS5Rgt96tfkO) && k10.lS5Rgt96tfkO(this.TSizfFm2Yiuu, en0Var.TSizfFm2Yiuu) && this.Y1f8riQaR6yg == en0Var.Y1f8riQaR6yg && this.e9gEMXR7LXtO == en0Var.e9gEMXR7LXtO && this.a92UlCVFR9N8.equals(en0Var.a92UlCVFR9N8) && hl.TSizfFm2Yiuu(this.RAsUl2FVSrh6, en0Var.RAsUl2FVSrh6) && this.rtx2ld2ELZv4 == en0Var.rtx2ld2ELZv4 && this.OPXfSBeufaJ8 == en0Var.OPXfSBeufaJ8;
    }

    public final int hashCode() {
        int hashCode = (this.a92UlCVFR9N8.hashCode() + o0.PxuCJdSBwIXG(this.e9gEMXR7LXtO, o0.PxuCJdSBwIXG(this.Y1f8riQaR6yg, o0.PxuCJdSBwIXG(this.TSizfFm2Yiuu, o0.PxuCJdSBwIXG(this.lS5Rgt96tfkO, this.PxuCJdSBwIXG.hashCode() * 31, 31), 31), 31), 31)) * 31;
        gl glVar = hl.Companion;
        return Boolean.hashCode(this.OPXfSBeufaJ8) + o0.lS5Rgt96tfkO(this.rtx2ld2ELZv4, o0.TSizfFm2Yiuu(hashCode, 31, this.RAsUl2FVSrh6), 31);
    }
}
