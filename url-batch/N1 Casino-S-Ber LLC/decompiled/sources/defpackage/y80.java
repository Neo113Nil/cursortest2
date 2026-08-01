package defpackage;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class y80 implements Interpolator {
    public final /* synthetic */ z80 a;

    public y80(z80 z80Var) {
        this.a = z80Var;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.a.u.getInterpolation(f);
    }
}
