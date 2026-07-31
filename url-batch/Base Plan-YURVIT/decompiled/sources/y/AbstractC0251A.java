package y;

import android.view.ViewConfiguration;

/* renamed from: y.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0251A {
    public static int a(ViewConfiguration viewConfiguration, int i2, int i3, int i4) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i2, i3, i4);
    }

    public static int b(ViewConfiguration viewConfiguration, int i2, int i3, int i4) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i2, i3, i4);
    }
}
