package a1;

import android.os.Build;
import android.view.animation.Interpolator;

/* renamed from: a1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0368D {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0367C f4839a;

    public C0368D(int i2, Interpolator interpolator, long j4) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f4839a = new C0366B(B0.k.h(i2, interpolator, j4));
        } else {
            this.f4839a = new C0411z(interpolator, j4);
        }
    }
}
