package K;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public n0 f482a;

    public o0(int i, Interpolator interpolator, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f482a = new m0(AbstractC0029z.i(i, interpolator, j2));
        } else {
            this.f482a = new k0(i, interpolator, j2);
        }
    }
}
