package b;

import a.AbstractC0345a;
import a1.C0384U;
import a1.C0385V;
import a1.C0394i;
import android.os.Build;
import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class s extends r {
    @Override // b.q
    public void b(G statusBarStyle, G navigationBarStyle, Window window, View view, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(view, "view");
        u3.l.t0(window, false);
        statusBarStyle.getClass();
        window.setStatusBarColor(0);
        navigationBarStyle.getClass();
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        if (Build.VERSION.SDK_INT >= 30) {
            new C0394i(view).f4884i = view;
        }
        AbstractC0345a c0385v = Build.VERSION.SDK_INT >= 30 ? new C0385V(window) : new C0384U(window);
        c0385v.G(!z4);
        c0385v.F(!z5);
    }
}
