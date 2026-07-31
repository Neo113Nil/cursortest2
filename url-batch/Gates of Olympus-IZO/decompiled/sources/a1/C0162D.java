package a1;

import android.os.Build;
import android.view.animation.Interpolator;

/* renamed from: a1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162D {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0161C f3511a;

    public C0162D(int i3, Interpolator interpolator, long j3) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f3511a = new C0160B(C0.i.h(i3, interpolator, j3));
        } else {
            this.f3511a = new z(interpolator, j3);
        }
    }
}
