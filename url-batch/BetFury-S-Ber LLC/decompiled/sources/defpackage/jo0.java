package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class jo0 {
    public io0 a;

    public jo0(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new ho0(f0.i(i, interpolator, j));
        } else {
            this.a = new fo0(i, interpolator, j);
        }
    }
}
