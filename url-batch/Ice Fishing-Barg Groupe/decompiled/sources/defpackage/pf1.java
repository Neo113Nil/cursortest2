package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class pf1 extends jh0 {
    public final bc OPXfSBeufaJ8;
    public final o01 wdg6QnbFHrFF;

    public pf1(bc bcVar, o01 o01Var) {
        bcVar.getClass();
        this.OPXfSBeufaJ8 = bcVar;
        this.wdg6QnbFHrFF = o01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf1)) {
            return false;
        }
        pf1 pf1Var = (pf1) obj;
        return cs0.wdg6QnbFHrFF(this.OPXfSBeufaJ8, pf1Var.OPXfSBeufaJ8) && cs0.wdg6QnbFHrFF(this.wdg6QnbFHrFF, pf1Var.wdg6QnbFHrFF);
    }

    public final int hashCode() {
        int hashCode = this.OPXfSBeufaJ8.hashCode() * 31;
        o01 o01Var = this.wdg6QnbFHrFF;
        return hashCode + (o01Var == null ? 0 : o01Var.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.OPXfSBeufaJ8 + ", owner=" + this.wdg6QnbFHrFF + ')';
    }
}
