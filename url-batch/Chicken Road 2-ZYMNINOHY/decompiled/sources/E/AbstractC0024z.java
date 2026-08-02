package E;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: E.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0024z {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        int i4 = J.f378a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static WindowInsets b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void c(View view) {
        view.requestApplyInsets();
    }
}
