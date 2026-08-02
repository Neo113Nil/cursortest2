package e0;

import A.T;
import Q0.h;
import android.content.Context;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0186a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0186a f2175a = new C0186a();

    public final T a(Context context) {
        Object systemService;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        h.e(context, "context");
        systemService = context.getSystemService((Class<Object>) WindowManager.class);
        currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        h.d(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        return T.a(windowInsets, null);
    }
}
