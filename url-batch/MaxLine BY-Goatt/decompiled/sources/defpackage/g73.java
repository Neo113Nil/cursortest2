package defpackage;

import android.view.View;
import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class g73 extends h73 {
    public final WindowInsetsAnimation e;

    public g73(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    public static z21 f(WindowInsetsAnimation.Bounds bounds) {
        return z21.c(bounds.getUpperBound());
    }

    public static z21 g(WindowInsetsAnimation.Bounds bounds) {
        return z21.c(bounds.getLowerBound());
    }

    public static void h(View view, iv ivVar) {
        view.setWindowInsetsAnimationCallback(ivVar != null ? new f73(ivVar) : null);
    }

    @Override // defpackage.h73
    public final float a() {
        return this.e.getAlpha();
    }

    @Override // defpackage.h73
    public final long b() {
        return this.e.getDurationMillis();
    }

    @Override // defpackage.h73
    public final float c() {
        return this.e.getInterpolatedFraction();
    }

    @Override // defpackage.h73
    public final int d() {
        return this.e.getTypeMask();
    }

    @Override // defpackage.h73
    public final void e(float f) {
        this.e.setFraction(f);
    }
}
