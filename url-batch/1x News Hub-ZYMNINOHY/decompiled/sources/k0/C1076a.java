package k0;

import E.W;
import android.content.Context;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.jvm.internal.j;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1076a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1076a f9671a = new C1076a();

    public final W a(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        j.e(context, "context");
        currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        j.d(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        return W.b(windowInsets, null);
    }
}
