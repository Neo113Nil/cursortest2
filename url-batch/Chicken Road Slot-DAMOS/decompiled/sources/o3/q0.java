package o3;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public p0 f7435a;

    public q0(int i3, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f7435a = new o0(com.appsflyer.internal.n.k(i3, interpolator, j));
        } else {
            this.f7435a = new l0(i3, interpolator, j);
        }
    }
}
