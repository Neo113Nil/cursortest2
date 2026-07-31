package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes4.dex */
public final class WindowCompat {
    public static void setDecorFitsSystemWindows(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setDecorFitsSystemWindows(window, z);
        } else {
            Api16Impl.setDecorFitsSystemWindows(window, z);
        }
    }

    public static WindowInsetsControllerCompat getInsetsController(Window window, View view) {
        return new WindowInsetsControllerCompat(window, view);
    }

    static class Api16Impl {
        static void setDecorFitsSystemWindows(Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    @RequiresApi
    static class Api30Impl {
        @DoNotInline
        static void setDecorFitsSystemWindows(@NonNull Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    @RequiresApi
    static class Api28Impl {
        @DoNotInline
        static <T> T requireViewById(Window window, int i) {
            return (T) window.requireViewById(i);
        }
    }
}
