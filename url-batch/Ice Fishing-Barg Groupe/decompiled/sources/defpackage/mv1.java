package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class mv1 {
    public nv1 OPXfSBeufaJ8;
    public xb PxuCJdSBwIXG;
    public String Y1f8riQaR6yg;
    public long cpQdD2nAriOS;
    public nv1 dgRBjINgWbAK;
    public ti0 e9gEMXR7LXtO;
    public fr1 lS5Rgt96tfkO;
    public jv r3s1LDPKFs1S;
    public g82 rtx2ld2ELZv4;
    public nv1 wdg6QnbFHrFF;
    public long x50lh2ztY7Y5;
    public int TSizfFm2Yiuu = -1;
    public qv1 RAsUl2FVSrh6 = qv1.rtx2ld2ELZv4;
    public pk2 QrzZRwfaDlRX = pk2.RAsUl2FVSrh6;
    public jd0 a92UlCVFR9N8 = new jd0(1);

    public static void lS5Rgt96tfkO(String str, nv1 nv1Var) {
        if (nv1Var != null) {
            if (nv1Var.gPXPFXrUH4XX != null) {
                u9.e9gEMXR7LXtO(str.concat(".networkResponse != null"));
            } else if (nv1Var.BRwzKIf41E4i != null) {
                u9.e9gEMXR7LXtO(str.concat(".cacheResponse != null"));
            } else {
                if (nv1Var.XL4ISE6Oc65B == null) {
                    return;
                }
                u9.e9gEMXR7LXtO(str.concat(".priorResponse != null"));
            }
        }
    }

    public final nv1 PxuCJdSBwIXG() {
        int i = this.TSizfFm2Yiuu;
        if (i < 0) {
            rc1.rtx2ld2ELZv4("code < 0: ", this.TSizfFm2Yiuu);
            return null;
        }
        xb xbVar = this.PxuCJdSBwIXG;
        if (xbVar == null) {
            u9.rtx2ld2ELZv4("request == null");
            return null;
        }
        fr1 fr1Var = this.lS5Rgt96tfkO;
        if (fr1Var == null) {
            u9.rtx2ld2ELZv4("protocol == null");
            return null;
        }
        String str = this.Y1f8riQaR6yg;
        if (str != null) {
            return new nv1(xbVar, fr1Var, str, i, this.e9gEMXR7LXtO, this.a92UlCVFR9N8.PxuCJdSBwIXG(), this.RAsUl2FVSrh6, this.rtx2ld2ELZv4, this.OPXfSBeufaJ8, this.wdg6QnbFHrFF, this.dgRBjINgWbAK, this.x50lh2ztY7Y5, this.cpQdD2nAriOS, this.r3s1LDPKFs1S, this.QrzZRwfaDlRX);
        }
        u9.rtx2ld2ELZv4("message == null");
        return null;
    }
}
