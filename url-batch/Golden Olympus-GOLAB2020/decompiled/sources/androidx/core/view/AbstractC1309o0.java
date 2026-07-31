package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: androidx.core.view.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1309o0 {

    /* renamed from: androidx.core.view.o0$a */
    static class a {
        static void a(Window window, boolean z4) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z4 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* renamed from: androidx.core.view.o0$b */
    static class b {
        static void a(Window window, boolean z4) {
            window.setDecorFitsSystemWindows(z4);
        }
    }

    public static S0 a(Window window, View view) {
        return new S0(window, view);
    }

    public static void b(Window window, boolean z4) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.a(window, z4);
        } else {
            a.a(window, z4);
        }
    }
}
