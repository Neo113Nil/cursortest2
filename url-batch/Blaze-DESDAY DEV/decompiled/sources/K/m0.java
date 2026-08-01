package K;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public l0 f497a;

    public m0(int i, Interpolator interpolator, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f497a = new k0(B0.b.i(i, interpolator, j2));
        } else {
            this.f497a = new i0(i, interpolator, j2);
        }
    }
}
