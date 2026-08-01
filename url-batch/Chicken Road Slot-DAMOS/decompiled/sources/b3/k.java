package b3;

import android.graphics.Insets;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f1068a = new k();

    public final int a(Window window) {
        WindowMetrics currentWindowMetrics = window.getWindowManager().getCurrentWindowMetrics();
        Insets insets = currentWindowMetrics.getWindowInsets().getInsets(WindowInsets.Type.systemBars());
        return currentWindowMetrics.getBounds().height() - (insets.top + insets.bottom);
    }

    public final void b(WindowManager.LayoutParams layoutParams, int i3) {
        layoutParams.setFitInsetsSides(i3);
    }

    public final void c(WindowManager.LayoutParams layoutParams, int i3) {
        layoutParams.setFitInsetsTypes(i3);
    }
}
