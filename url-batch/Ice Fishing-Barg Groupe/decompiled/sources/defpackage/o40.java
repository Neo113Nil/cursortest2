package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class o40 {
    public static final n40 Companion = new n40();
    public final pj1 PxuCJdSBwIXG;
    public int TSizfFm2Yiuu;
    public int Y1f8riQaR6yg;
    public int e9gEMXR7LXtO;
    public int lS5Rgt96tfkO;

    public o40(v8 v8Var, long j) {
        String str = v8Var.OPXfSBeufaJ8;
        pj1 pj1Var = new pj1();
        pj1Var.PxuCJdSBwIXG = str;
        pj1Var.TSizfFm2Yiuu = -1;
        pj1Var.Y1f8riQaR6yg = -1;
        this.PxuCJdSBwIXG = pj1Var;
        this.lS5Rgt96tfkO = vi2.a92UlCVFR9N8(j);
        this.TSizfFm2Yiuu = vi2.e9gEMXR7LXtO(j);
        this.Y1f8riQaR6yg = -1;
        this.e9gEMXR7LXtO = -1;
        int a92UlCVFR9N8 = vi2.a92UlCVFR9N8(j);
        int e9gEMXR7LXtO = vi2.e9gEMXR7LXtO(j);
        if (a92UlCVFR9N8 < 0 || a92UlCVFR9N8 > str.length()) {
            u9.r3s1LDPKFs1S(o0.BRwzKIf41E4i(a92UlCVFR9N8, "start (", ") offset is outside of text region "), str.length());
            throw null;
        }
        if (e9gEMXR7LXtO < 0 || e9gEMXR7LXtO > str.length()) {
            u9.r3s1LDPKFs1S(o0.BRwzKIf41E4i(e9gEMXR7LXtO, "end (", ") offset is outside of text region "), str.length());
            throw null;
        }
        if (a92UlCVFR9N8 <= e9gEMXR7LXtO) {
            return;
        }
        u9.XL4ISE6Oc65B(o0.rtx2ld2ELZv4(a92UlCVFR9N8, e9gEMXR7LXtO, "Do not set reversed range: ", " > "));
        throw null;
    }

    public final void PxuCJdSBwIXG(int i, int i2) {
        long rtx2ld2ELZv4 = jh0.rtx2ld2ELZv4(i, i2);
        this.PxuCJdSBwIXG.lS5Rgt96tfkO(i, i2, "");
        long IXK6ba3ucyzm = zv.IXK6ba3ucyzm(jh0.rtx2ld2ELZv4(this.lS5Rgt96tfkO, this.TSizfFm2Yiuu), rtx2ld2ELZv4);
        rtx2ld2ELZv4(vi2.a92UlCVFR9N8(IXK6ba3ucyzm));
        RAsUl2FVSrh6(vi2.e9gEMXR7LXtO(IXK6ba3ucyzm));
        int i3 = this.Y1f8riQaR6yg;
        if (i3 != -1) {
            long IXK6ba3ucyzm2 = zv.IXK6ba3ucyzm(jh0.rtx2ld2ELZv4(i3, this.e9gEMXR7LXtO), rtx2ld2ELZv4);
            if (vi2.TSizfFm2Yiuu(IXK6ba3ucyzm2)) {
                this.Y1f8riQaR6yg = -1;
                this.e9gEMXR7LXtO = -1;
            } else {
                this.Y1f8riQaR6yg = vi2.a92UlCVFR9N8(IXK6ba3ucyzm2);
                this.e9gEMXR7LXtO = vi2.e9gEMXR7LXtO(IXK6ba3ucyzm2);
            }
        }
    }

    public final void RAsUl2FVSrh6(int i) {
        if (!(i >= 0)) {
            fp0.PxuCJdSBwIXG("Cannot set selectionEnd to a negative value: " + i);
        }
        this.TSizfFm2Yiuu = i;
    }

    public final vi2 TSizfFm2Yiuu() {
        int i = this.Y1f8riQaR6yg;
        if (i != -1) {
            return new vi2(jh0.rtx2ld2ELZv4(i, this.e9gEMXR7LXtO));
        }
        return null;
    }

    public final void Y1f8riQaR6yg(int i, int i2, String str) {
        pj1 pj1Var = this.PxuCJdSBwIXG;
        if (i < 0 || i > pj1Var.PxuCJdSBwIXG()) {
            u9.r3s1LDPKFs1S(o0.BRwzKIf41E4i(i, "start (", ") offset is outside of text region "), pj1Var.PxuCJdSBwIXG());
            return;
        }
        if (i2 < 0 || i2 > pj1Var.PxuCJdSBwIXG()) {
            u9.r3s1LDPKFs1S(o0.BRwzKIf41E4i(i2, "end (", ") offset is outside of text region "), pj1Var.PxuCJdSBwIXG());
            return;
        }
        if (i > i2) {
            u9.XL4ISE6Oc65B(o0.rtx2ld2ELZv4(i, i2, "Do not set reversed range: ", " > "));
            return;
        }
        pj1Var.lS5Rgt96tfkO(i, i2, str);
        rtx2ld2ELZv4(str.length() + i);
        RAsUl2FVSrh6(str.length() + i);
        this.Y1f8riQaR6yg = -1;
        this.e9gEMXR7LXtO = -1;
    }

    public final void a92UlCVFR9N8(int i, int i2) {
        pj1 pj1Var = this.PxuCJdSBwIXG;
        if (i < 0 || i > pj1Var.PxuCJdSBwIXG()) {
            u9.r3s1LDPKFs1S(o0.BRwzKIf41E4i(i, "start (", ") offset is outside of text region "), pj1Var.PxuCJdSBwIXG());
            return;
        }
        if (i2 < 0 || i2 > pj1Var.PxuCJdSBwIXG()) {
            u9.r3s1LDPKFs1S(o0.BRwzKIf41E4i(i2, "end (", ") offset is outside of text region "), pj1Var.PxuCJdSBwIXG());
        } else if (i > i2) {
            u9.XL4ISE6Oc65B(o0.rtx2ld2ELZv4(i, i2, "Do not set reversed range: ", " > "));
        } else {
            rtx2ld2ELZv4(i);
            RAsUl2FVSrh6(i2);
        }
    }

    public final void e9gEMXR7LXtO(int i, int i2) {
        pj1 pj1Var = this.PxuCJdSBwIXG;
        if (i < 0 || i > pj1Var.PxuCJdSBwIXG()) {
            u9.r3s1LDPKFs1S(o0.BRwzKIf41E4i(i, "start (", ") offset is outside of text region "), pj1Var.PxuCJdSBwIXG());
            return;
        }
        if (i2 < 0 || i2 > pj1Var.PxuCJdSBwIXG()) {
            u9.r3s1LDPKFs1S(o0.BRwzKIf41E4i(i2, "end (", ") offset is outside of text region "), pj1Var.PxuCJdSBwIXG());
        } else if (i >= i2) {
            u9.XL4ISE6Oc65B(o0.rtx2ld2ELZv4(i, i2, "Do not set reversed or empty range: ", " > "));
        } else {
            this.Y1f8riQaR6yg = i;
            this.e9gEMXR7LXtO = i2;
        }
    }

    public final char lS5Rgt96tfkO(int i) {
        pj1 pj1Var = this.PxuCJdSBwIXG;
        of0 of0Var = pj1Var.lS5Rgt96tfkO;
        if (of0Var == null) {
            return pj1Var.PxuCJdSBwIXG.charAt(i);
        }
        if (i < pj1Var.TSizfFm2Yiuu) {
            return pj1Var.PxuCJdSBwIXG.charAt(i);
        }
        int lS5Rgt96tfkO = of0Var.lS5Rgt96tfkO - of0Var.lS5Rgt96tfkO();
        int i2 = pj1Var.TSizfFm2Yiuu;
        if (i >= lS5Rgt96tfkO + i2) {
            return pj1Var.PxuCJdSBwIXG.charAt(i - ((lS5Rgt96tfkO - pj1Var.Y1f8riQaR6yg) + i2));
        }
        int i3 = i - i2;
        int i4 = of0Var.TSizfFm2Yiuu;
        char[] cArr = (char[]) of0Var.e9gEMXR7LXtO;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + of0Var.Y1f8riQaR6yg];
    }

    public final void rtx2ld2ELZv4(int i) {
        if (!(i >= 0)) {
            fp0.PxuCJdSBwIXG("Cannot set selectionStart to a negative value: " + i);
        }
        this.lS5Rgt96tfkO = i;
    }

    public final String toString() {
        return this.PxuCJdSBwIXG.toString();
    }
}
