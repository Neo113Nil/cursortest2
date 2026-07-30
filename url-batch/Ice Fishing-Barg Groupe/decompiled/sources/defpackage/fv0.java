package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fv0 {
    public static final ev0 Companion = new ev0();
    public static final fv0 TSizfFm2Yiuu = new fv0(127);
    public final Boolean PxuCJdSBwIXG;
    public final int lS5Rgt96tfkO;

    static {
        hv0.Companion.getClass();
        new fv0(121);
    }

    public fv0(int i) {
        int i2;
        Boolean bool = Boolean.FALSE;
        dv0.Companion.getClass();
        bool = (i & 2) != 0 ? null : bool;
        if ((i & 4) != 0) {
            hv0.Companion.getClass();
            i2 = 0;
        } else {
            i2 = 7;
        }
        jn0.Companion.getClass();
        this.PxuCJdSBwIXG = bool;
        this.lS5Rgt96tfkO = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv0)) {
            return false;
        }
        fv0 fv0Var = (fv0) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, fv0Var.PxuCJdSBwIXG) && this.lS5Rgt96tfkO == fv0Var.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(-1) * 31;
        Boolean bool = this.PxuCJdSBwIXG;
        return o0.lS5Rgt96tfkO(-1, o0.lS5Rgt96tfkO(this.lS5Rgt96tfkO, (hashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) "Unspecified") + ", autoCorrectEnabled=" + this.PxuCJdSBwIXG + ", keyboardType=" + ((Object) hv0.PxuCJdSBwIXG(this.lS5Rgt96tfkO)) + ", imeAction=" + ((Object) "Unspecified") + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
