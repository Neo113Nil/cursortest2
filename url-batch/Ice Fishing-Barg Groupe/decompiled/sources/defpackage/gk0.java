package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class gk0 implements z42 {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public static final gk0 lS5Rgt96tfkO = new gk0(0);
    public static final gk0 TSizfFm2Yiuu = new gk0(1);

    public /* synthetic */ gk0(int i) {
        this.PxuCJdSBwIXG = i;
    }

    @Override // defpackage.z42
    public final th0 PxuCJdSBwIXG(long j, cw0 cw0Var, hy hyVar) {
        switch (this.PxuCJdSBwIXG) {
            case 0:
                float POWyO8hTM6YC = hyVar.POWyO8hTM6YC(30.0f);
                return new xh1(new qt1(0.0f, -POWyO8hTM6YC, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + POWyO8hTM6YC));
            case 1:
                float POWyO8hTM6YC2 = hyVar.POWyO8hTM6YC(30.0f);
                return new xh1(new qt1(-POWyO8hTM6YC2, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + POWyO8hTM6YC2, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new xh1(ni0.nxJAScVArhE9(j));
        }
    }

    public String toString() {
        switch (this.PxuCJdSBwIXG) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
