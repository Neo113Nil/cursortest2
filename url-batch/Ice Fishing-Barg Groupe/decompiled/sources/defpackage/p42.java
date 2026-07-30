package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class p42 implements m40 {
    public final v8 PxuCJdSBwIXG;
    public final int lS5Rgt96tfkO;

    public p42(String str, int i) {
        this.PxuCJdSBwIXG = new v8(str);
        this.lS5Rgt96tfkO = i;
    }

    @Override // defpackage.m40
    public final void PxuCJdSBwIXG(o40 o40Var) {
        int i = o40Var.Y1f8riQaR6yg;
        v8 v8Var = this.PxuCJdSBwIXG;
        if (i != -1) {
            int i2 = o40Var.e9gEMXR7LXtO;
            String str = v8Var.OPXfSBeufaJ8;
            String str2 = v8Var.OPXfSBeufaJ8;
            o40Var.Y1f8riQaR6yg(i, i2, str);
            if (str2.length() > 0) {
                o40Var.e9gEMXR7LXtO(i, str2.length() + i);
            }
        } else {
            int i3 = o40Var.lS5Rgt96tfkO;
            int i4 = o40Var.TSizfFm2Yiuu;
            String str3 = v8Var.OPXfSBeufaJ8;
            String str4 = v8Var.OPXfSBeufaJ8;
            o40Var.Y1f8riQaR6yg(i3, i4, str3);
            if (str4.length() > 0) {
                o40Var.e9gEMXR7LXtO(i3, str4.length() + i3);
            }
        }
        int i5 = o40Var.lS5Rgt96tfkO;
        int i6 = o40Var.TSizfFm2Yiuu;
        int i7 = i5 == i6 ? i6 : -1;
        int i8 = this.lS5Rgt96tfkO;
        int wdg6QnbFHrFF = ng0.wdg6QnbFHrFF(i8 > 0 ? (i7 + i8) - 1 : (i7 + i8) - v8Var.OPXfSBeufaJ8.length(), 0, o40Var.PxuCJdSBwIXG.PxuCJdSBwIXG());
        o40Var.a92UlCVFR9N8(wdg6QnbFHrFF, wdg6QnbFHrFF);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p42)) {
            return false;
        }
        p42 p42Var = (p42) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG.OPXfSBeufaJ8, p42Var.PxuCJdSBwIXG.OPXfSBeufaJ8) && this.lS5Rgt96tfkO == p42Var.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        return (this.PxuCJdSBwIXG.OPXfSBeufaJ8.hashCode() * 31) + this.lS5Rgt96tfkO;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.PxuCJdSBwIXG.OPXfSBeufaJ8);
        sb.append("', newCursorPosition=");
        return o0.r3s1LDPKFs1S(sb, this.lS5Rgt96tfkO, ')');
    }
}
