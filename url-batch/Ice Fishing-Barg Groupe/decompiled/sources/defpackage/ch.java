package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ch {
    public static final bh Companion = new bh();
    public final int OPXfSBeufaJ8;
    public final boolean PxuCJdSBwIXG;
    public final boolean RAsUl2FVSrh6;
    public final int TSizfFm2Yiuu;
    public final int Y1f8riQaR6yg;
    public final boolean a92UlCVFR9N8;
    public String cpQdD2nAriOS;
    public final boolean dgRBjINgWbAK;
    public final boolean e9gEMXR7LXtO;
    public final boolean lS5Rgt96tfkO;
    public final int rtx2ld2ELZv4;
    public final boolean wdg6QnbFHrFF;
    public final boolean x50lh2ztY7Y5;

    static {
        t30 t30Var = u30.Companion;
        long a92UlCVFR9N8 = u30.a92UlCVFR9N8(mm2.qudtW7lwm99e(Integer.MAX_VALUE), x30.SECONDS);
        if (a92UlCVFR9N8 >= 0) {
            return;
        }
        u9.OPXfSBeufaJ8("maxStale < 0: ", a92UlCVFR9N8);
    }

    public ch(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.PxuCJdSBwIXG = z;
        this.lS5Rgt96tfkO = z2;
        this.TSizfFm2Yiuu = i;
        this.Y1f8riQaR6yg = i2;
        this.e9gEMXR7LXtO = z3;
        this.a92UlCVFR9N8 = z4;
        this.RAsUl2FVSrh6 = z5;
        this.rtx2ld2ELZv4 = i3;
        this.OPXfSBeufaJ8 = i4;
        this.wdg6QnbFHrFF = z6;
        this.dgRBjINgWbAK = z7;
        this.x50lh2ztY7Y5 = z8;
        this.cpQdD2nAriOS = str;
    }

    public final String toString() {
        String str = this.cpQdD2nAriOS;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.PxuCJdSBwIXG) {
            sb.append("no-cache, ");
        }
        if (this.lS5Rgt96tfkO) {
            sb.append("no-store, ");
        }
        int i = this.TSizfFm2Yiuu;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.Y1f8riQaR6yg;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.e9gEMXR7LXtO) {
            sb.append("private, ");
        }
        if (this.a92UlCVFR9N8) {
            sb.append("public, ");
        }
        if (this.RAsUl2FVSrh6) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.rtx2ld2ELZv4;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.OPXfSBeufaJ8;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.wdg6QnbFHrFF) {
            sb.append("only-if-cached, ");
        }
        if (this.dgRBjINgWbAK) {
            sb.append("no-transform, ");
        }
        if (this.x50lh2ztY7Y5) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length()).getClass();
        String sb2 = sb.toString();
        this.cpQdD2nAriOS = sb2;
        return sb2;
    }
}
