package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class zq1 extends rh implements iu0 {
    public final boolean r3s1LDPKFs1S;

    public zq1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.r3s1LDPKFs1S = false;
    }

    public final du0 RAsUl2FVSrh6() {
        if (this.r3s1LDPKFs1S) {
            return this;
        }
        du0 du0Var = this.rtx2ld2ELZv4;
        if (du0Var != null) {
            return du0Var;
        }
        du0 TSizfFm2Yiuu = TSizfFm2Yiuu();
        this.rtx2ld2ELZv4 = TSizfFm2Yiuu;
        return TSizfFm2Yiuu;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zq1) {
            zq1 zq1Var = (zq1) obj;
            return e9gEMXR7LXtO().equals(zq1Var.e9gEMXR7LXtO()) && this.dgRBjINgWbAK.equals(zq1Var.dgRBjINgWbAK) && this.x50lh2ztY7Y5.equals(zq1Var.x50lh2ztY7Y5) && cs0.wdg6QnbFHrFF(this.OPXfSBeufaJ8, zq1Var.OPXfSBeufaJ8);
        }
        if (obj instanceof iu0) {
            return obj.equals(RAsUl2FVSrh6());
        }
        return false;
    }

    public final int hashCode() {
        return this.x50lh2ztY7Y5.hashCode() + ((this.dgRBjINgWbAK.hashCode() + (e9gEMXR7LXtO().hashCode() * 31)) * 31);
    }

    public final String toString() {
        du0 RAsUl2FVSrh6 = RAsUl2FVSrh6();
        return RAsUl2FVSrh6 != this ? RAsUl2FVSrh6.toString() : o0.gPXPFXrUH4XX(new StringBuilder("property "), this.dgRBjINgWbAK, " (Kotlin reflection is not available)");
    }
}
