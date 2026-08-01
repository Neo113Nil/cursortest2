package q0;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f3107a;

    public d(e eVar) {
        this.f3107a = eVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f4) {
        return this.f3107a.f3126u.getInterpolation(f4);
    }
}
