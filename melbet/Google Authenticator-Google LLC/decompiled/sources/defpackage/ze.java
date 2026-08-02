package defpackage;

import android.view.WindowInsetsAnimation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ze extends zf {
    private final WindowInsetsAnimation a;

    public ze(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.a = windowInsetsAnimation;
    }

    @Override // defpackage.zf
    public final float g() {
        float alpha;
        alpha = this.a.getAlpha();
        return alpha;
    }

    @Override // defpackage.zf
    public final float h() {
        float interpolatedFraction;
        interpolatedFraction = this.a.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // defpackage.zf
    public final int i() {
        int typeMask;
        typeMask = this.a.getTypeMask();
        return typeMask;
    }

    @Override // defpackage.zf
    public final long j() {
        long durationMillis;
        durationMillis = this.a.getDurationMillis();
        return durationMillis;
    }

    @Override // defpackage.zf
    public final void k(float f) {
        this.a.setFraction(f);
    }
}
