package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qd extends qi1 {
    public float OPXfSBeufaJ8;
    public final int RAsUl2FVSrh6;
    public final long a92UlCVFR9N8;
    public final ym0 e9gEMXR7LXtO;
    public final long rtx2ld2ELZv4;
    public jl wdg6QnbFHrFF;

    public qd(ym0 ym0Var) {
        int i;
        wq0.Companion.getClass();
        long width = (((w3) ym0Var).PxuCJdSBwIXG.getWidth() << 32) | (((w3) ym0Var).PxuCJdSBwIXG.getHeight() & 4294967295L);
        this.e9gEMXR7LXtO = ym0Var;
        this.a92UlCVFR9N8 = width;
        b80.Companion.getClass();
        this.RAsUl2FVSrh6 = 1;
        int i2 = (int) (width >> 32);
        if (i2 >= 0 && (i = (int) (width & 4294967295L)) >= 0) {
            w3 w3Var = (w3) ym0Var;
            if (i2 <= w3Var.PxuCJdSBwIXG.getWidth() && i <= w3Var.PxuCJdSBwIXG.getHeight()) {
                this.rtx2ld2ELZv4 = width;
                this.OPXfSBeufaJ8 = 1.0f;
                return;
            }
        }
        u9.XL4ISE6Oc65B("Failed requirement.");
        throw null;
    }

    @Override // defpackage.qi1
    public final void PxuCJdSBwIXG(float f) {
        this.OPXfSBeufaJ8 = f;
    }

    @Override // defpackage.qi1
    public final long Y1f8riQaR6yg() {
        return kj0.gGoUzNp9JO5I(this.rtx2ld2ELZv4);
    }

    @Override // defpackage.qi1
    public final void e9gEMXR7LXtO(xw0 xw0Var) {
        ji jiVar = xw0Var.rtx2ld2ELZv4;
        k30.gPXPFXrUH4XX(xw0Var, this.e9gEMXR7LXtO, this.a92UlCVFR9N8, (Math.round(Float.intBitsToFloat((int) (jiVar.Y1f8riQaR6yg() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (jiVar.Y1f8riQaR6yg() & 4294967295L))) & 4294967295L), this.OPXfSBeufaJ8, this.wdg6QnbFHrFF, this.RAsUl2FVSrh6, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd)) {
            return false;
        }
        qd qdVar = (qd) obj;
        return cs0.wdg6QnbFHrFF(this.e9gEMXR7LXtO, qdVar.e9gEMXR7LXtO) && wq0.PxuCJdSBwIXG(0L, 0L) && ir0.PxuCJdSBwIXG(this.a92UlCVFR9N8, qdVar.a92UlCVFR9N8) && this.RAsUl2FVSrh6 == qdVar.RAsUl2FVSrh6;
    }

    public final int hashCode() {
        return Integer.hashCode(this.RAsUl2FVSrh6) + o0.TSizfFm2Yiuu(o0.TSizfFm2Yiuu(this.e9gEMXR7LXtO.hashCode() * 31, 31, 0L), 31, this.a92UlCVFR9N8);
    }

    @Override // defpackage.qi1
    public final void lS5Rgt96tfkO(jl jlVar) {
        this.wdg6QnbFHrFF = jlVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.e9gEMXR7LXtO);
        sb.append(", srcOffset=");
        sb.append((Object) wq0.Y1f8riQaR6yg(0L));
        sb.append(", srcSize=");
        sb.append((Object) ir0.lS5Rgt96tfkO(this.a92UlCVFR9N8));
        sb.append(", filterQuality=");
        int i = this.RAsUl2FVSrh6;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
