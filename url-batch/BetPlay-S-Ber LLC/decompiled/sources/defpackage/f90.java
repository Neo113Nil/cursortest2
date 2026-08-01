package defpackage;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class f90 implements Interpolator {
    public final /* synthetic */ h90 a;

    public f90(h90 h90Var) {
        this.a = h90Var;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.a.u.getInterpolation(f);
    }
}
