package C1;

import E.e0;
import android.content.Context;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f261a = new b();

    public final e0 a(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        i.e(context, "context");
        currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        i.d(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        return e0.a(null, windowInsets);
    }
}
