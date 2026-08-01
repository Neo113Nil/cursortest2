package defpackage;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class d0 {
    public static /* synthetic */ WindowInsetsAnimation.Bounds h(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation i(int i, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i, interpolator, j);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation j(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* synthetic */ void m() {
    }
}
