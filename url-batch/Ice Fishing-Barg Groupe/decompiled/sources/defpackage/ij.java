package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ij extends zp1 {
    public char[] PxuCJdSBwIXG;
    public int lS5Rgt96tfkO;

    @Override // defpackage.zp1
    public final Object PxuCJdSBwIXG() {
        return Arrays.copyOf(this.PxuCJdSBwIXG, this.lS5Rgt96tfkO);
    }

    @Override // defpackage.zp1
    public final int Y1f8riQaR6yg() {
        return this.lS5Rgt96tfkO;
    }

    @Override // defpackage.zp1
    public final void lS5Rgt96tfkO(int i) {
        char[] cArr = this.PxuCJdSBwIXG;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.PxuCJdSBwIXG = Arrays.copyOf(cArr, i);
        }
    }
}
