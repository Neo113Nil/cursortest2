package defpackage;

import android.animation.TimeInterpolator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fjo implements TimeInterpolator {
    private final TimeInterpolator a;

    public fjo(TimeInterpolator timeInterpolator) {
        this.a = timeInterpolator;
    }

    public static TimeInterpolator a(boolean z, TimeInterpolator timeInterpolator) {
        return z ? timeInterpolator : new fjo(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return 1.0f - this.a.getInterpolation(f);
    }
}
