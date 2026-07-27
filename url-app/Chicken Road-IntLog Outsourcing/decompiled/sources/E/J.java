package E;

import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class J {
    public static int a(ViewConfiguration viewConfiguration, int i2, int i3, int i6) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i2, i3, i6);
    }

    public static int b(ViewConfiguration viewConfiguration, int i2, int i3, int i6) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i2, i3, i6);
    }
}
