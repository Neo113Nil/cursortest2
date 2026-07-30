package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fj0 {
    public static final ej0 Companion = new ej0();
    public static final ah OPXfSBeufaJ8;
    public static final ah RAsUl2FVSrh6;
    public static final ah Y1f8riQaR6yg;
    public static final ah a92UlCVFR9N8;
    public static final ah e9gEMXR7LXtO;
    public static final ah rtx2ld2ELZv4;
    public final ah PxuCJdSBwIXG;
    public final int TSizfFm2Yiuu;
    public final ah lS5Rgt96tfkO;

    static {
        ah.Companion.getClass();
        Y1f8riQaR6yg = zg.lS5Rgt96tfkO(":");
        e9gEMXR7LXtO = zg.lS5Rgt96tfkO(":status");
        a92UlCVFR9N8 = zg.lS5Rgt96tfkO(":method");
        RAsUl2FVSrh6 = zg.lS5Rgt96tfkO(":path");
        rtx2ld2ELZv4 = zg.lS5Rgt96tfkO(":scheme");
        OPXfSBeufaJ8 = zg.lS5Rgt96tfkO(":authority");
    }

    public fj0(ah ahVar, ah ahVar2) {
        ahVar.getClass();
        ahVar2.getClass();
        this.PxuCJdSBwIXG = ahVar;
        this.lS5Rgt96tfkO = ahVar2;
        this.TSizfFm2Yiuu = ahVar2.TSizfFm2Yiuu() + ahVar.TSizfFm2Yiuu() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj0)) {
            return false;
        }
        fj0 fj0Var = (fj0) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, fj0Var.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, fj0Var.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        return this.lS5Rgt96tfkO.hashCode() + (this.PxuCJdSBwIXG.hashCode() * 31);
    }

    public final String toString() {
        return this.PxuCJdSBwIXG.x50lh2ztY7Y5() + ": " + this.lS5Rgt96tfkO.x50lh2ztY7Y5();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fj0(String str, String str2) {
        this(zg.lS5Rgt96tfkO(str), zg.lS5Rgt96tfkO(str2));
        ah.Companion.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fj0(ah ahVar, String str) {
        this(ahVar, zg.lS5Rgt96tfkO(str));
        ahVar.getClass();
        str.getClass();
        ah.Companion.getClass();
    }
}
