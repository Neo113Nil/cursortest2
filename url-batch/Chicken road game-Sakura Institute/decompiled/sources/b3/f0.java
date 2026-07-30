package b3;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public e0 f1322a;

    public f0(int i7, Interpolator interpolator, long j8) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f1322a = new d0(b2.j.h(i7, interpolator, j8));
        } else {
            this.f1322a = new b0(interpolator, j8);
        }
    }
}
