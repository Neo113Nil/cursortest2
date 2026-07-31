package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActivityCompatHelper.kt */
@RequiresApi
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/window/layout/ActivityCompatHelperApi30;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", "currentWindowBounds", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ActivityCompatHelperApi30 {
    public static final ActivityCompatHelperApi30 INSTANCE = new ActivityCompatHelperApi30();

    private ActivityCompatHelperApi30() {
    }

    public final Rect currentWindowBounds(Activity activity) {
        android.view.WindowMetrics currentWindowMetrics;
        Rect bounds;
        Intrinsics.checkNotNullParameter(activity, "activity");
        currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }
}
