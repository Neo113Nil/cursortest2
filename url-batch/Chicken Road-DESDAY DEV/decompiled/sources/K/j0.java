package K;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public i0 f416a;

    public j0(int i, Interpolator interpolator, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f416a = new h0(A0.c.i(i, interpolator, j2));
        } else {
            this.f416a = new f0(i, interpolator, j2);
        }
    }
}
