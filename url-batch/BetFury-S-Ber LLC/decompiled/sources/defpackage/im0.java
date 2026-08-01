package defpackage;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class im0 implements Interpolator {
    public final /* synthetic */ jm0 a;

    public im0(jm0 jm0Var) {
        this.a = jm0Var;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.a.u.getInterpolation(f);
    }
}
