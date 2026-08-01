package n0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public a1 f2759a;

    public b1(int i, Interpolator interpolator, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2759a = new z0(d2.b.i(i, interpolator, j2));
        } else {
            this.f2759a = new x0(i, interpolator, j2);
        }
    }
}
