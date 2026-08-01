package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class gb0 {
    public fb0 a;

    public gb0(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new eb0(b0.i(i, interpolator, j));
        } else {
            this.a = new cb0(i, interpolator, j);
        }
    }
}
