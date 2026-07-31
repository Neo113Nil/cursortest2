package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;

/* loaded from: classes14.dex */
public final class WindowInsetsControllerCompat {
    private final Impl mImpl;

    public interface OnControllableInsetsChangedListener {
    }

    private WindowInsetsControllerCompat(WindowInsetsController windowInsetsController) {
        this.mImpl = new Impl30(windowInsetsController, this, new SoftwareKeyboardControllerCompat(windowInsetsController));
    }

    public WindowInsetsControllerCompat(Window window, View view) {
        SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.mImpl = new Impl30(window, this, softwareKeyboardControllerCompat);
        } else if (i >= 26) {
            this.mImpl = new Impl26(window, softwareKeyboardControllerCompat);
        } else {
            this.mImpl = new Impl23(window, softwareKeyboardControllerCompat);
        }
    }

    public static WindowInsetsControllerCompat toWindowInsetsControllerCompat(WindowInsetsController windowInsetsController) {
        return new WindowInsetsControllerCompat(windowInsetsController);
    }

    public void show(int i) {
        this.mImpl.show(i);
    }

    public void hide(int i) {
        this.mImpl.hide(i);
    }

    public void setAppearanceLightStatusBars(boolean z) {
        this.mImpl.setAppearanceLightStatusBars(z);
    }

    public void setAppearanceLightNavigationBars(boolean z) {
        this.mImpl.setAppearanceLightNavigationBars(z);
    }

    public void setSystemBarsBehavior(int i) {
        this.mImpl.setSystemBarsBehavior(i);
    }

    private static class Impl {
        void hide(int i) {
        }

        public void setAppearanceLightNavigationBars(boolean z) {
        }

        public void setAppearanceLightStatusBars(boolean z) {
        }

        void setSystemBarsBehavior(int i) {
        }

        void show(int i) {
        }

        Impl() {
        }
    }

    @RequiresApi
    private static class Impl20 extends Impl {
        private final SoftwareKeyboardControllerCompat mSoftwareKeyboardControllerCompat;
        protected final Window mWindow;

        Impl20(Window window, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this.mWindow = window;
            this.mSoftwareKeyboardControllerCompat = softwareKeyboardControllerCompat;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void show(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    showForType(i2);
                }
            }
        }

        private void showForType(int i) {
            if (i == 1) {
                unsetSystemUiFlag(4);
                unsetWindowFlag(1024);
            } else if (i == 2) {
                unsetSystemUiFlag(2);
            } else {
                if (i != 8) {
                    return;
                }
                this.mSoftwareKeyboardControllerCompat.show();
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void hide(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    hideForType(i2);
                }
            }
        }

        private void hideForType(int i) {
            if (i == 1) {
                setSystemUiFlag(4);
            } else if (i == 2) {
                setSystemUiFlag(2);
            } else {
                if (i != 8) {
                    return;
                }
                this.mSoftwareKeyboardControllerCompat.hide();
            }
        }

        protected void setSystemUiFlag(int i) {
            View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        protected void unsetSystemUiFlag(int i) {
            View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        protected void setWindowFlag(int i) {
            this.mWindow.addFlags(i);
        }

        protected void unsetWindowFlag(int i) {
            this.mWindow.clearFlags(i);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void setSystemBarsBehavior(int i) {
            if (i == 0) {
                unsetSystemUiFlag(6144);
                return;
            }
            if (i == 1) {
                unsetSystemUiFlag(4096);
                setSystemUiFlag(2048);
            } else {
                if (i != 2) {
                    return;
                }
                unsetSystemUiFlag(2048);
                setSystemUiFlag(4096);
            }
        }
    }

    @RequiresApi
    private static class Impl23 extends Impl20 {
        Impl23(Window window, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, softwareKeyboardControllerCompat);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightStatusBars(boolean z) {
            if (z) {
                unsetWindowFlag(67108864);
                setWindowFlag(Integer.MIN_VALUE);
                setSystemUiFlag(8192);
                return;
            }
            unsetSystemUiFlag(8192);
        }
    }

    @RequiresApi
    private static class Impl26 extends Impl23 {
        Impl26(Window window, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, softwareKeyboardControllerCompat);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightNavigationBars(boolean z) {
            if (z) {
                unsetWindowFlag(134217728);
                setWindowFlag(Integer.MIN_VALUE);
                setSystemUiFlag(16);
                return;
            }
            unsetSystemUiFlag(16);
        }
    }

    @RequiresApi
    private static class Impl30 extends Impl {
        final WindowInsetsControllerCompat mCompatController;
        final WindowInsetsController mInsetsController;
        private final SimpleArrayMap mListeners;
        final SoftwareKeyboardControllerCompat mSoftwareKeyboardControllerCompat;
        protected Window mWindow;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        Impl30(Window window, WindowInsetsControllerCompat windowInsetsControllerCompat, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this(r0, windowInsetsControllerCompat, softwareKeyboardControllerCompat);
            WindowInsetsController insetsController;
            insetsController = window.getInsetsController();
            this.mWindow = window;
        }

        Impl30(WindowInsetsController windowInsetsController, WindowInsetsControllerCompat windowInsetsControllerCompat, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this.mListeners = new SimpleArrayMap();
            this.mInsetsController = windowInsetsController;
            this.mCompatController = windowInsetsControllerCompat;
            this.mSoftwareKeyboardControllerCompat = softwareKeyboardControllerCompat;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void show(int i) {
            if ((i & 8) != 0) {
                this.mSoftwareKeyboardControllerCompat.show();
            }
            this.mInsetsController.show(i & (-9));
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void hide(int i) {
            if ((i & 8) != 0) {
                this.mSoftwareKeyboardControllerCompat.hide();
            }
            this.mInsetsController.hide(i & (-9));
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightStatusBars(boolean z) {
            if (z) {
                if (this.mWindow != null) {
                    setSystemUiFlag(8192);
                }
                this.mInsetsController.setSystemBarsAppearance(8, 8);
            } else {
                if (this.mWindow != null) {
                    unsetSystemUiFlag(8192);
                }
                this.mInsetsController.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightNavigationBars(boolean z) {
            if (z) {
                if (this.mWindow != null) {
                    setSystemUiFlag(16);
                }
                this.mInsetsController.setSystemBarsAppearance(16, 16);
            } else {
                if (this.mWindow != null) {
                    unsetSystemUiFlag(16);
                }
                this.mInsetsController.setSystemBarsAppearance(0, 16);
            }
        }

        /* renamed from: androidx.core.view.WindowInsetsControllerCompat$Impl30$1, reason: invalid class name */
        class AnonymousClass1 implements WindowInsetsAnimationControlListener {
            private WindowInsetsAnimationControllerCompat mCompatAnimController;
            final /* synthetic */ WindowInsetsAnimationControlListenerCompat val$listener;

            public void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i) {
                WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat = new WindowInsetsAnimationControllerCompat(windowInsetsAnimationController);
                this.mCompatAnimController = windowInsetsAnimationControllerCompat;
                this.val$listener.onReady(windowInsetsAnimationControllerCompat, i);
            }

            public void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
                this.val$listener.onFinished(this.mCompatAnimController);
            }

            public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
                this.val$listener.onCancelled(windowInsetsAnimationController == null ? null : this.mCompatAnimController);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void setSystemBarsBehavior(int i) {
            this.mInsetsController.setSystemBarsBehavior(i);
        }

        protected void unsetSystemUiFlag(int i) {
            View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        protected void setSystemUiFlag(int i) {
            View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }
    }
}
