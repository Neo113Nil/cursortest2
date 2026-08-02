package A;

import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class C {
    public static int a(ViewConfiguration viewConfiguration, int i2, int i3, int i4) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i2, i3, i4);
    }

    public static int b(ViewConfiguration viewConfiguration, int i2, int i3, int i4) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i2, i3, i4);
    }
}
