package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ln0 {
    public static final kn0 Companion = new kn0();
    public static final ln0 a92UlCVFR9N8;
    public final int PxuCJdSBwIXG;
    public final int TSizfFm2Yiuu;
    public final int Y1f8riQaR6yg;
    public final p21 e9gEMXR7LXtO;
    public final boolean lS5Rgt96tfkO;

    static {
        dv0.Companion.getClass();
        hv0.Companion.getClass();
        jn0.Companion.getClass();
        p21.Companion.getClass();
        a92UlCVFR9N8 = new ln0(0, true, 1, 1, p21.wdg6QnbFHrFF);
    }

    public ln0(int i, boolean z, int i2, int i3, p21 p21Var) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = z;
        this.TSizfFm2Yiuu = i2;
        this.Y1f8riQaR6yg = i3;
        this.e9gEMXR7LXtO = p21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln0)) {
            return false;
        }
        ln0 ln0Var = (ln0) obj;
        return this.PxuCJdSBwIXG == ln0Var.PxuCJdSBwIXG && this.lS5Rgt96tfkO == ln0Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu == ln0Var.TSizfFm2Yiuu && this.Y1f8riQaR6yg == ln0Var.Y1f8riQaR6yg && cs0.wdg6QnbFHrFF(this.e9gEMXR7LXtO, ln0Var.e9gEMXR7LXtO);
    }

    public final int hashCode() {
        return this.e9gEMXR7LXtO.rtx2ld2ELZv4.hashCode() + o0.lS5Rgt96tfkO(this.Y1f8riQaR6yg, o0.lS5Rgt96tfkO(this.TSizfFm2Yiuu, o0.Y1f8riQaR6yg(o0.lS5Rgt96tfkO(this.PxuCJdSBwIXG, Boolean.hashCode(false) * 31, 31), 31, this.lS5Rgt96tfkO), 31), 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=false, capitalization=");
        int i = this.PxuCJdSBwIXG;
        sb.append((Object) (i == -1 ? "Unspecified" : i == 0 ? "None" : i == 1 ? "Characters" : i == 2 ? "Words" : i == 3 ? "Sentences" : "Invalid"));
        sb.append(", autoCorrect=");
        sb.append(this.lS5Rgt96tfkO);
        sb.append(", keyboardType=");
        sb.append((Object) hv0.PxuCJdSBwIXG(this.TSizfFm2Yiuu));
        sb.append(", imeAction=");
        sb.append((Object) jn0.PxuCJdSBwIXG(this.Y1f8riQaR6yg));
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.e9gEMXR7LXtO);
        sb.append(')');
        return sb.toString();
    }
}
