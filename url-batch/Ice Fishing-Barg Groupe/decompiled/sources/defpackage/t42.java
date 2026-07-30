package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class t42 {
    public static final s42 Companion = new s42();
    public int PxuCJdSBwIXG;
    public final int[] lS5Rgt96tfkO = new int[10];

    public final int PxuCJdSBwIXG() {
        if ((this.PxuCJdSBwIXG & 16) != 0) {
            return this.lS5Rgt96tfkO[4];
        }
        return 65535;
    }

    public final void lS5Rgt96tfkO(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.lS5Rgt96tfkO;
            if (i >= iArr.length) {
                return;
            }
            this.PxuCJdSBwIXG = (1 << i) | this.PxuCJdSBwIXG;
            iArr[i] = i2;
        }
    }
}
