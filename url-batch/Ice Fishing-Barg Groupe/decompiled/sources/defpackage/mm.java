package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class mm implements m40 {
    public final v8 PxuCJdSBwIXG;
    public final int lS5Rgt96tfkO;

    public mm(String str, int i) {
        this(new v8(str), i);
    }

    @Override // defpackage.m40
    public final void PxuCJdSBwIXG(o40 o40Var) {
        int i = o40Var.Y1f8riQaR6yg;
        v8 v8Var = this.PxuCJdSBwIXG;
        if (i != -1) {
            o40Var.Y1f8riQaR6yg(i, o40Var.e9gEMXR7LXtO, v8Var.OPXfSBeufaJ8);
        } else {
            o40Var.Y1f8riQaR6yg(o40Var.lS5Rgt96tfkO, o40Var.TSizfFm2Yiuu, v8Var.OPXfSBeufaJ8);
        }
        int i2 = o40Var.lS5Rgt96tfkO;
        int i3 = o40Var.TSizfFm2Yiuu;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.lS5Rgt96tfkO;
        int wdg6QnbFHrFF = ng0.wdg6QnbFHrFF(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - v8Var.OPXfSBeufaJ8.length(), 0, o40Var.PxuCJdSBwIXG.PxuCJdSBwIXG());
        o40Var.a92UlCVFR9N8(wdg6QnbFHrFF, wdg6QnbFHrFF);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm)) {
            return false;
        }
        mm mmVar = (mm) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG.OPXfSBeufaJ8, mmVar.PxuCJdSBwIXG.OPXfSBeufaJ8) && this.lS5Rgt96tfkO == mmVar.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        return (this.PxuCJdSBwIXG.OPXfSBeufaJ8.hashCode() * 31) + this.lS5Rgt96tfkO;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.PxuCJdSBwIXG.OPXfSBeufaJ8);
        sb.append("', newCursorPosition=");
        return o0.r3s1LDPKFs1S(sb, this.lS5Rgt96tfkO, ')');
    }

    public mm(v8 v8Var, int i) {
        this.PxuCJdSBwIXG = v8Var;
        this.lS5Rgt96tfkO = i;
    }
}
