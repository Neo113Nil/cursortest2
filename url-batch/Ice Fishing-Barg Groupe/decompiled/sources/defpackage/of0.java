package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class of0 {
    public final /* synthetic */ int PxuCJdSBwIXG = 0;
    public int TSizfFm2Yiuu;
    public int Y1f8riQaR6yg;
    public Object e9gEMXR7LXtO;
    public int lS5Rgt96tfkO;

    public of0(int i, int i2, int i3, ji2 ji2Var) {
        this.lS5Rgt96tfkO = i;
        this.TSizfFm2Yiuu = i2;
        this.Y1f8riQaR6yg = i3;
        this.e9gEMXR7LXtO = ji2Var;
    }

    public g22 PxuCJdSBwIXG(int i) {
        return new g22(sj0.rZjpSjn4zoMv((ji2) this.e9gEMXR7LXtO, i), i, 1L);
    }

    public int TSizfFm2Yiuu(int i) {
        return ((ph1) this.e9gEMXR7LXtO).e9gEMXR7LXtO[this.TSizfFm2Yiuu + i];
    }

    public Object Y1f8riQaR6yg(int i) {
        return ((ph1) this.e9gEMXR7LXtO).RAsUl2FVSrh6[this.Y1f8riQaR6yg + i];
    }

    public int lS5Rgt96tfkO() {
        return this.Y1f8riQaR6yg - this.TSizfFm2Yiuu;
    }

    public String toString() {
        switch (this.PxuCJdSBwIXG) {
            case 0:
                return "";
            case 1:
            default:
                return super.toString();
            case 2:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i = this.lS5Rgt96tfkO;
                sb.append(i);
                sb.append('-');
                ji2 ji2Var = (ji2) this.e9gEMXR7LXtO;
                sb.append(sj0.rZjpSjn4zoMv(ji2Var, i));
                sb.append(',');
                int i2 = this.TSizfFm2Yiuu;
                sb.append(i2);
                sb.append('-');
                sb.append(sj0.rZjpSjn4zoMv(ji2Var, i2));
                sb.append("), prevOffset=");
                return o0.r3s1LDPKFs1S(sb, this.Y1f8riQaR6yg, ')');
        }
    }

    public of0(ph1 ph1Var) {
        this.e9gEMXR7LXtO = ph1Var;
    }

    public /* synthetic */ of0() {
    }
}
