package a0;

import P0.h;
import android.content.Context;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import y.Q;

/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0088b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0088b f1139a = new C0088b();

    public final Q a(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        h.e(context, "context");
        currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        h.d(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        return Q.a(windowInsets, null);
    }
}
