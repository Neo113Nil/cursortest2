package u0;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f3555a;

    public d(e eVar) {
        this.f3555a = eVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f5) {
        return this.f3555a.f3574u.getInterpolation(f5);
    }
}
