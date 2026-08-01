package K;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public l0 f480a;

    public m0(int i, Interpolator interpolator, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f480a = new k0(B0.c.i(i, interpolator, j2));
        } else {
            this.f480a = new i0(i, interpolator, j2);
        }
    }
}
