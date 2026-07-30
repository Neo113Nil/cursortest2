package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class w92 {
    public static final v92 Companion = new v92();
    public final fr1 PxuCJdSBwIXG;
    public final String TSizfFm2Yiuu;
    public final int lS5Rgt96tfkO;

    public w92(fr1 fr1Var, int i, String str) {
        this.PxuCJdSBwIXG = fr1Var;
        this.lS5Rgt96tfkO = i;
        this.TSizfFm2Yiuu = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.PxuCJdSBwIXG == fr1.OPXfSBeufaJ8) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.lS5Rgt96tfkO);
        sb.append(' ');
        sb.append(this.TSizfFm2Yiuu);
        return sb.toString();
    }
}
