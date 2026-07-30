package androidx.activity;

import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
final class EdgeToEdgeBase implements EdgeToEdgeImpl {
    @Override // androidx.activity.EdgeToEdgeImpl
    public void setUp(SystemBarStyle statusBarStyle, SystemBarStyle navigationBarStyle, Window window, View view, boolean z7, boolean z8) {
        s.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        s.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        s.checkNotNullParameter(window, "window");
        s.checkNotNullParameter(view, "view");
    }
}
