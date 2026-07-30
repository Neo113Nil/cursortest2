package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xc0 implements Comparable {
    public static final wc0 Companion = new wc0();
    public static final xc0 OPXfSBeufaJ8;
    public static final xc0 cpQdD2nAriOS;
    public static final xc0 dgRBjINgWbAK;
    public static final xc0 r3s1LDPKFs1S;
    public static final xc0 wdg6QnbFHrFF;
    public static final xc0 x50lh2ztY7Y5;
    public final int rtx2ld2ELZv4;

    static {
        xc0 xc0Var = new xc0(100);
        xc0 xc0Var2 = new xc0(200);
        xc0 xc0Var3 = new xc0(300);
        xc0 xc0Var4 = new xc0(400);
        OPXfSBeufaJ8 = xc0Var4;
        xc0 xc0Var5 = new xc0(500);
        wdg6QnbFHrFF = xc0Var5;
        xc0 xc0Var6 = new xc0(600);
        dgRBjINgWbAK = xc0Var6;
        xc0 xc0Var7 = new xc0(700);
        xc0 xc0Var8 = new xc0(800);
        xc0 xc0Var9 = new xc0(900);
        x50lh2ztY7Y5 = xc0Var4;
        cpQdD2nAriOS = xc0Var5;
        r3s1LDPKFs1S = xc0Var7;
        fx1.D0aTLcX6Uhyo(xc0Var, xc0Var2, xc0Var3, xc0Var4, xc0Var5, xc0Var6, xc0Var7, xc0Var8, xc0Var9);
    }

    public xc0(int i) {
        this.rtx2ld2ELZv4 = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        fp0.PxuCJdSBwIXG("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    /* renamed from: PxuCJdSBwIXG, reason: merged with bridge method [inline-methods] */
    public final int compareTo(xc0 xc0Var) {
        return cs0.gPXPFXrUH4XX(this.rtx2ld2ELZv4, xc0Var.rtx2ld2ELZv4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xc0) {
            return this.rtx2ld2ELZv4 == ((xc0) obj).rtx2ld2ELZv4;
        }
        return false;
    }

    public final int hashCode() {
        return this.rtx2ld2ELZv4;
    }

    public final String toString() {
        return o0.r3s1LDPKFs1S(new StringBuilder("FontWeight(weight="), this.rtx2ld2ELZv4, ')');
    }
}
