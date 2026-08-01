package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ee0 {
    public de0 a;

    public ee0(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new ce0(d0.i(i, interpolator, j));
        } else {
            this.a = new ae0(i, interpolator, j);
        }
    }
}
