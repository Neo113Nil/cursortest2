package k0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public v0 f2788a;

    public w0(int i4, Interpolator interpolator, long j4) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2788a = new u0(s0.i(i4, interpolator, j4));
        } else {
            this.f2788a = new r0(i4, interpolator, j4);
        }
    }
}
