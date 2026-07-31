package c1;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public E f5557a;

    public F(int i3, Interpolator interpolator, long j3) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f5557a = new D(D0.l.h(i3, interpolator, j3));
        } else {
            this.f5557a = new C0375B(interpolator, j3);
        }
    }
}
