package n0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public x0 f2803a;

    public y0(int i, Interpolator interpolator, long j4) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2803a = new w0(c2.b.i(i, interpolator, j4));
        } else {
            this.f2803a = new u0(i, interpolator, j4);
        }
    }
}
