package defpackage;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class jc0 implements Interpolator {
    public final /* synthetic */ kc0 a;

    public jc0(kc0 kc0Var) {
        this.a = kc0Var;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.a.u.getInterpolation(f);
    }
}
