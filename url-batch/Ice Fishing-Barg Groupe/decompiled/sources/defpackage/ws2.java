package defpackage;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class ws2 {
    public final int PxuCJdSBwIXG;
    public final Interpolator TSizfFm2Yiuu;
    public final long Y1f8riQaR6yg;
    public float lS5Rgt96tfkO;

    public ws2(int i, Interpolator interpolator, long j) {
        this.PxuCJdSBwIXG = i;
        this.TSizfFm2Yiuu = interpolator;
        this.Y1f8riQaR6yg = j;
    }

    public float PxuCJdSBwIXG() {
        return 1.0f;
    }

    public float TSizfFm2Yiuu() {
        float f = this.lS5Rgt96tfkO;
        Interpolator interpolator = this.TSizfFm2Yiuu;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    public int Y1f8riQaR6yg() {
        return this.PxuCJdSBwIXG;
    }

    public void e9gEMXR7LXtO(float f) {
        this.lS5Rgt96tfkO = f;
    }

    public long lS5Rgt96tfkO() {
        return this.Y1f8riQaR6yg;
    }
}
