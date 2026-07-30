package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qs0 {
    public final a00 OPXfSBeufaJ8;
    public final int PxuCJdSBwIXG;
    public final t61 RAsUl2FVSrh6;
    public final int TSizfFm2Yiuu;
    public final String Y1f8riQaR6yg;
    public final uh1 a92UlCVFR9N8;
    public final String dgRBjINgWbAK;
    public final int e9gEMXR7LXtO;
    public final String lS5Rgt96tfkO;
    public final int rtx2ld2ELZv4;
    public final kq2 wdg6QnbFHrFF;

    public qs0(int i, String str, int i2, String str2, int i3, uh1 uh1Var, t61 t61Var, int i4, a00 a00Var, kq2 kq2Var, String str3) {
        str.getClass();
        str2.getClass();
        uh1Var.getClass();
        t61Var.getClass();
        a00Var.getClass();
        kq2Var.getClass();
        str3.getClass();
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = str;
        this.TSizfFm2Yiuu = i2;
        this.Y1f8riQaR6yg = str2;
        this.e9gEMXR7LXtO = i3;
        this.a92UlCVFR9N8 = uh1Var;
        this.RAsUl2FVSrh6 = t61Var;
        this.rtx2ld2ELZv4 = i4;
        this.OPXfSBeufaJ8 = a00Var;
        this.wdg6QnbFHrFF = kq2Var;
        this.dgRBjINgWbAK = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs0)) {
            return false;
        }
        qs0 qs0Var = (qs0) obj;
        return this.PxuCJdSBwIXG == qs0Var.PxuCJdSBwIXG && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, qs0Var.lS5Rgt96tfkO) && this.TSizfFm2Yiuu == qs0Var.TSizfFm2Yiuu && cs0.wdg6QnbFHrFF(this.Y1f8riQaR6yg, qs0Var.Y1f8riQaR6yg) && this.e9gEMXR7LXtO == qs0Var.e9gEMXR7LXtO && this.a92UlCVFR9N8 == qs0Var.a92UlCVFR9N8 && this.RAsUl2FVSrh6 == qs0Var.RAsUl2FVSrh6 && this.rtx2ld2ELZv4 == qs0Var.rtx2ld2ELZv4 && this.OPXfSBeufaJ8 == qs0Var.OPXfSBeufaJ8 && this.wdg6QnbFHrFF == qs0Var.wdg6QnbFHrFF && cs0.wdg6QnbFHrFF(this.dgRBjINgWbAK, qs0Var.dgRBjINgWbAK);
    }

    public final int hashCode() {
        return this.dgRBjINgWbAK.hashCode() + ((this.wdg6QnbFHrFF.hashCode() + ((this.OPXfSBeufaJ8.hashCode() + o0.lS5Rgt96tfkO(this.rtx2ld2ELZv4, (this.RAsUl2FVSrh6.hashCode() + ((this.a92UlCVFR9N8.hashCode() + o0.lS5Rgt96tfkO(this.e9gEMXR7LXtO, (this.Y1f8riQaR6yg.hashCode() + o0.lS5Rgt96tfkO(this.TSizfFm2Yiuu, (this.lS5Rgt96tfkO.hashCode() + (Integer.hashCode(this.PxuCJdSBwIXG) * 31)) * 31, 31)) * 31, 31)) * 31)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Item(id=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(", name=");
        sb.append(this.lS5Rgt96tfkO);
        sb.append(", rating=");
        sb.append(this.TSizfFm2Yiuu);
        sb.append(", description=");
        sb.append(this.Y1f8riQaR6yg);
        sb.append(", protein=");
        sb.append(this.e9gEMXR7LXtO);
        sb.append(", origin=");
        sb.append(this.a92UlCVFR9N8);
        sb.append(", mood=");
        sb.append(this.RAsUl2FVSrh6);
        sb.append(", carbs=");
        sb.append(this.rtx2ld2ELZv4);
        sb.append(", dietary=");
        sb.append(this.OPXfSBeufaJ8);
        sb.append(", vessel=");
        sb.append(this.wdg6QnbFHrFF);
        sb.append(", hint=");
        return o0.gPXPFXrUH4XX(sb, this.dgRBjINgWbAK, ")");
    }
}
