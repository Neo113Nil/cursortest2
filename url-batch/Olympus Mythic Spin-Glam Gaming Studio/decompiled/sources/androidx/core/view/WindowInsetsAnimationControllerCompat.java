package androidx.core.view;

import android.view.WindowInsetsAnimationController;
import androidx.annotation.RequiresApi;

/* loaded from: classes10.dex */
public final class WindowInsetsAnimationControllerCompat {
    private final Impl mImpl;

    WindowInsetsAnimationControllerCompat(WindowInsetsAnimationController windowInsetsAnimationController) {
        this.mImpl = new Impl30(windowInsetsAnimationController);
    }

    private static class Impl {
        Impl() {
        }
    }

    @RequiresApi
    private static class Impl30 extends Impl {
        private final WindowInsetsAnimationController mController;

        Impl30(WindowInsetsAnimationController windowInsetsAnimationController) {
            this.mController = windowInsetsAnimationController;
        }
    }
}
