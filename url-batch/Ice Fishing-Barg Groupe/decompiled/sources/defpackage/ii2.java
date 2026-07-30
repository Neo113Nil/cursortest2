package defpackage;

import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ii2 {
    public final ob0 OPXfSBeufaJ8;
    public final v8 PxuCJdSBwIXG;
    public final hy RAsUl2FVSrh6;
    public final List TSizfFm2Yiuu;
    public final int Y1f8riQaR6yg;
    public final int a92UlCVFR9N8;
    public final boolean e9gEMXR7LXtO;
    public final dj2 lS5Rgt96tfkO;
    public final cw0 rtx2ld2ELZv4;
    public final long wdg6QnbFHrFF;

    public ii2(v8 v8Var, dj2 dj2Var, List list, int i, boolean z, int i2, hy hyVar, cw0 cw0Var, ob0 ob0Var, long j) {
        this.PxuCJdSBwIXG = v8Var;
        this.lS5Rgt96tfkO = dj2Var;
        this.TSizfFm2Yiuu = list;
        this.Y1f8riQaR6yg = i;
        this.e9gEMXR7LXtO = z;
        this.a92UlCVFR9N8 = i2;
        this.RAsUl2FVSrh6 = hyVar;
        this.rtx2ld2ELZv4 = cw0Var;
        this.OPXfSBeufaJ8 = ob0Var;
        this.wdg6QnbFHrFF = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii2)) {
            return false;
        }
        ii2 ii2Var = (ii2) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, ii2Var.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, ii2Var.lS5Rgt96tfkO) && cs0.wdg6QnbFHrFF(this.TSizfFm2Yiuu, ii2Var.TSizfFm2Yiuu) && this.Y1f8riQaR6yg == ii2Var.Y1f8riQaR6yg && this.e9gEMXR7LXtO == ii2Var.e9gEMXR7LXtO && this.a92UlCVFR9N8 == ii2Var.a92UlCVFR9N8 && cs0.wdg6QnbFHrFF(this.RAsUl2FVSrh6, ii2Var.RAsUl2FVSrh6) && this.rtx2ld2ELZv4 == ii2Var.rtx2ld2ELZv4 && cs0.wdg6QnbFHrFF(this.OPXfSBeufaJ8, ii2Var.OPXfSBeufaJ8) && rr.lS5Rgt96tfkO(this.wdg6QnbFHrFF, ii2Var.wdg6QnbFHrFF);
    }

    public final int hashCode() {
        return Long.hashCode(this.wdg6QnbFHrFF) + ((this.OPXfSBeufaJ8.hashCode() + ((this.rtx2ld2ELZv4.hashCode() + ((this.RAsUl2FVSrh6.hashCode() + o0.lS5Rgt96tfkO(this.a92UlCVFR9N8, o0.Y1f8riQaR6yg((((this.TSizfFm2Yiuu.hashCode() + o0.e9gEMXR7LXtO(this.lS5Rgt96tfkO, this.PxuCJdSBwIXG.hashCode() * 31, 31)) * 31) + this.Y1f8riQaR6yg) * 31, 31, this.e9gEMXR7LXtO), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.PxuCJdSBwIXG);
        sb.append(", style=");
        sb.append(this.lS5Rgt96tfkO);
        sb.append(", placeholders=");
        sb.append(this.TSizfFm2Yiuu);
        sb.append(", maxLines=");
        sb.append(this.Y1f8riQaR6yg);
        sb.append(", softWrap=");
        sb.append(this.e9gEMXR7LXtO);
        sb.append(", overflow=");
        int i = this.a92UlCVFR9N8;
        sb.append((Object) (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.RAsUl2FVSrh6);
        sb.append(", layoutDirection=");
        sb.append(this.rtx2ld2ELZv4);
        sb.append(", fontFamilyResolver=");
        sb.append(this.OPXfSBeufaJ8);
        sb.append(", constraints=");
        sb.append((Object) rr.dgRBjINgWbAK(this.wdg6QnbFHrFF));
        sb.append(')');
        return sb.toString();
    }
}
