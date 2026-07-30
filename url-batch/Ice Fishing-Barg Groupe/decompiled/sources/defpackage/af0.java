package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class af0 extends rh implements ze0, du0, xe0 {
    public final int r3s1LDPKFs1S;

    public af0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.r3s1LDPKFs1S = i;
    }

    @Override // defpackage.rh
    public final du0 TSizfFm2Yiuu() {
        bu1.PxuCJdSBwIXG.getClass();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [du0] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof af0) {
            af0 af0Var = (af0) obj;
            return this.dgRBjINgWbAK.equals(af0Var.dgRBjINgWbAK) && this.x50lh2ztY7Y5.equals(af0Var.x50lh2ztY7Y5) && cs0.wdg6QnbFHrFF(this.OPXfSBeufaJ8, af0Var.OPXfSBeufaJ8) && e9gEMXR7LXtO().equals(af0Var.e9gEMXR7LXtO());
        }
        if (!(obj instanceof af0)) {
            return false;
        }
        ?? r0 = this.rtx2ld2ELZv4;
        if (r0 == 0) {
            TSizfFm2Yiuu();
            this.rtx2ld2ELZv4 = this;
        } else {
            this = r0;
        }
        return obj.equals(this);
    }

    public final int hashCode() {
        e9gEMXR7LXtO();
        return this.x50lh2ztY7Y5.hashCode() + ((this.dgRBjINgWbAK.hashCode() + (e9gEMXR7LXtO().hashCode() * 31)) * 31);
    }

    @Override // defpackage.ze0
    public final int lS5Rgt96tfkO() {
        return this.r3s1LDPKFs1S;
    }

    public final String toString() {
        du0 du0Var = this.rtx2ld2ELZv4;
        if (du0Var == null) {
            TSizfFm2Yiuu();
            this.rtx2ld2ELZv4 = this;
            du0Var = this;
        }
        if (du0Var != this) {
            return du0Var.toString();
        }
        String str = this.dgRBjINgWbAK;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : o0.x50lh2ztY7Y5("function ", str, " (Kotlin reflection is not available)");
    }

    public af0(int i, Class cls, String str, String str2, int i2) {
        this(i, qh.rtx2ld2ELZv4, cls, str, str2, i2, 0);
    }
}
