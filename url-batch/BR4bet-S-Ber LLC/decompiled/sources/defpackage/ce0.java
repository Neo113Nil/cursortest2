package defpackage;

import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ce0 extends de0 {
    public final WindowInsetsAnimation e;

    public ce0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // defpackage.de0
    public final float a() {
        float alpha;
        alpha = this.e.getAlpha();
        return alpha;
    }

    @Override // defpackage.de0
    public final long b() {
        long durationMillis;
        durationMillis = this.e.getDurationMillis();
        return durationMillis;
    }

    @Override // defpackage.de0
    public final float c() {
        float interpolatedFraction;
        interpolatedFraction = this.e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // defpackage.de0
    public final int d() {
        int typeMask;
        typeMask = this.e.getTypeMask();
        return typeMask;
    }

    @Override // defpackage.de0
    public final void e(float f) {
        this.e.setFraction(f);
    }
}
