package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class oh2 {
    public static final nh2 Companion = new nh2();
    public final v8 PxuCJdSBwIXG;
    public final vi2 TSizfFm2Yiuu;
    public final long lS5Rgt96tfkO;

    public oh2(v8 v8Var, long j, vi2 vi2Var) {
        vi2 vi2Var2;
        this.PxuCJdSBwIXG = v8Var;
        this.lS5Rgt96tfkO = jh0.r3s1LDPKFs1S(v8Var.OPXfSBeufaJ8.length(), j);
        if (vi2Var != null) {
            vi2Var2 = new vi2(jh0.r3s1LDPKFs1S(v8Var.OPXfSBeufaJ8.length(), vi2Var.PxuCJdSBwIXG));
        } else {
            vi2Var2 = null;
        }
        this.TSizfFm2Yiuu = vi2Var2;
    }

    public static oh2 PxuCJdSBwIXG(oh2 oh2Var, v8 v8Var, long j, int i) {
        if ((i & 1) != 0) {
            v8Var = oh2Var.PxuCJdSBwIXG;
        }
        if ((i & 2) != 0) {
            j = oh2Var.lS5Rgt96tfkO;
        }
        vi2 vi2Var = (i & 4) != 0 ? oh2Var.TSizfFm2Yiuu : null;
        oh2Var.getClass();
        return new oh2(v8Var, j, vi2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh2)) {
            return false;
        }
        oh2 oh2Var = (oh2) obj;
        return vi2.lS5Rgt96tfkO(this.lS5Rgt96tfkO, oh2Var.lS5Rgt96tfkO) && cs0.wdg6QnbFHrFF(this.TSizfFm2Yiuu, oh2Var.TSizfFm2Yiuu) && cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, oh2Var.PxuCJdSBwIXG);
    }

    public final int hashCode() {
        int hashCode = this.PxuCJdSBwIXG.hashCode() * 31;
        ui2 ui2Var = vi2.Companion;
        int TSizfFm2Yiuu = o0.TSizfFm2Yiuu(hashCode, 31, this.lS5Rgt96tfkO);
        vi2 vi2Var = this.TSizfFm2Yiuu;
        return TSizfFm2Yiuu + (vi2Var != null ? Long.hashCode(vi2Var.PxuCJdSBwIXG) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.PxuCJdSBwIXG) + "', selection=" + ((Object) vi2.rtx2ld2ELZv4(this.lS5Rgt96tfkO)) + ", composition=" + this.TSizfFm2Yiuu + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oh2(int i, long j, String str) {
        this(new v8(str), j, (vi2) null);
        str = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            vi2.Companion.getClass();
            j = vi2.lS5Rgt96tfkO;
        }
    }
}
