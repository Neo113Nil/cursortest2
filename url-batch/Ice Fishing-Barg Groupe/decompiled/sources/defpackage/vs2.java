package defpackage;

import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vs2 extends ws2 {
    public final WindowInsetsAnimation e9gEMXR7LXtO;

    public vs2(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e9gEMXR7LXtO = windowInsetsAnimation;
    }

    @Override // defpackage.ws2
    public final float PxuCJdSBwIXG() {
        float alpha;
        alpha = this.e9gEMXR7LXtO.getAlpha();
        return alpha;
    }

    @Override // defpackage.ws2
    public final float TSizfFm2Yiuu() {
        float interpolatedFraction;
        interpolatedFraction = this.e9gEMXR7LXtO.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // defpackage.ws2
    public final int Y1f8riQaR6yg() {
        int typeMask;
        typeMask = this.e9gEMXR7LXtO.getTypeMask();
        return typeMask;
    }

    @Override // defpackage.ws2
    public final void e9gEMXR7LXtO(float f) {
        this.e9gEMXR7LXtO.setFraction(f);
    }

    @Override // defpackage.ws2
    public final long lS5Rgt96tfkO() {
        long durationMillis;
        durationMillis = this.e9gEMXR7LXtO.getDurationMillis();
        return durationMillis;
    }
}
