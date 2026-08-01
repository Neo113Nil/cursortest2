package K;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public i0 f398a;

    public j0(int i, Interpolator interpolator, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f398a = new h0(E0.b.i(i, interpolator, j2));
        } else {
            this.f398a = new f0(i, interpolator, j2);
        }
    }
}
