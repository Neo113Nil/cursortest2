package M;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public h0 f559a;

    public i0(int i, Interpolator interpolator, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f559a = new g0(D0.b.i(i, interpolator, j2));
        } else {
            this.f559a = new e0(i, interpolator, j2);
        }
    }
}
