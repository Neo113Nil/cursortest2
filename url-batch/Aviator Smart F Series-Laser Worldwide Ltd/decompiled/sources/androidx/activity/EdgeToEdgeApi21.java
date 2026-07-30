package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.view.WindowCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.exoplayer2.C;
import kotlin.jvm.internal.s;

@RequiresApi(21)
/* loaded from: classes.dex */
final class EdgeToEdgeApi21 implements EdgeToEdgeImpl {
    @Override // androidx.activity.EdgeToEdgeImpl
    @DoNotInline
    public void setUp(SystemBarStyle statusBarStyle, SystemBarStyle navigationBarStyle, Window window, View view, boolean z7, boolean z8) {
        s.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        s.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        s.checkNotNullParameter(window, "window");
        s.checkNotNullParameter(view, "view");
        WindowCompat.setDecorFitsSystemWindows(window, false);
        window.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        window.addFlags(C.BUFFER_FLAG_FIRST_SAMPLE);
    }
}
