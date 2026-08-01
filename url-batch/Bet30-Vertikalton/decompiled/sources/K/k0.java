package K;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public j0 f428a;

    public k0(int i, Interpolator interpolator, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f428a = new i0(AbstractC0021v.i(i, interpolator, j2));
        } else {
            this.f428a = new g0(i, interpolator, j2);
        }
    }
}
