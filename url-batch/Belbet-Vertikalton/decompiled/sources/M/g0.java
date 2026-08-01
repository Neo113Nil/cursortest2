package M;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public f0 f755a;

    public g0(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f755a = new e0(F0.c.i(i, interpolator, j));
        } else {
            this.f755a = new c0(i, interpolator, j);
        }
    }
}
