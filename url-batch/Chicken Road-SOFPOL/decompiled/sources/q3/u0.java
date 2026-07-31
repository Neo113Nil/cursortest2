package q3;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public t0 f6160a;

    public u0(int i, Interpolator interpolator, long j7) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f6160a = new s0(h2.a.i(i, interpolator, j7));
        } else {
            this.f6160a = new q0(i, interpolator, j7);
        }
    }
}
