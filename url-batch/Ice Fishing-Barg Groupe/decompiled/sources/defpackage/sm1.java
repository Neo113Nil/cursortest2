package defpackage;

import android.widget.Magnifier;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class sm1 implements pm1 {
    public final Magnifier PxuCJdSBwIXG;

    public sm1(Magnifier magnifier) {
        this.PxuCJdSBwIXG = magnifier;
    }

    @Override // defpackage.pm1
    public void PxuCJdSBwIXG(long j, long j2) {
        this.PxuCJdSBwIXG.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final long TSizfFm2Yiuu() {
        return (this.PxuCJdSBwIXG.getWidth() << 32) | (this.PxuCJdSBwIXG.getHeight() & 4294967295L);
    }

    public final void Y1f8riQaR6yg() {
        this.PxuCJdSBwIXG.update();
    }

    public final void lS5Rgt96tfkO() {
        this.PxuCJdSBwIXG.dismiss();
    }
}
