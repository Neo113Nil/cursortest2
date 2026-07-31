package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final e f585a;

    private static class a extends e {

        /* renamed from: a, reason: collision with root package name */
        protected final Window f586a;

        /* renamed from: b, reason: collision with root package name */
        private final View f587b;

        a(Window window, View view) {
            this.f586a = window;
            this.f587b = view;
        }

        protected void c(int i7) {
            View decorView = this.f586a.getDecorView();
            decorView.setSystemUiVisibility(i7 | decorView.getSystemUiVisibility());
        }

        protected void d(int i7) {
            this.f586a.addFlags(i7);
        }

        protected void e(int i7) {
            View decorView = this.f586a.getDecorView();
            decorView.setSystemUiVisibility((i7 ^ (-1)) & decorView.getSystemUiVisibility());
        }

        protected void f(int i7) {
            this.f586a.clearFlags(i7);
        }
    }

    private static class b extends a {
        b(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.l.e
        public void b(boolean z6) {
            if (!z6) {
                e(8192);
                return;
            }
            f(67108864);
            d(Integer.MIN_VALUE);
            c(8192);
        }
    }

    private static class c extends b {
        c(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.l.e
        public void a(boolean z6) {
            if (!z6) {
                e(16);
                return;
            }
            f(134217728);
            d(Integer.MIN_VALUE);
            c(16);
        }
    }

    private static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final l f588a;

        /* renamed from: b, reason: collision with root package name */
        final WindowInsetsController f589b;

        /* renamed from: c, reason: collision with root package name */
        private final h.e<Object, WindowInsetsController.OnControllableInsetsChangedListener> f590c;

        /* renamed from: d, reason: collision with root package name */
        protected Window f591d;

        d(Window window, l lVar) {
            this(window.getInsetsController(), lVar);
            this.f591d = window;
        }

        d(WindowInsetsController windowInsetsController, l lVar) {
            this.f590c = new h.e<>();
            this.f589b = windowInsetsController;
            this.f588a = lVar;
        }

        @Override // androidx.core.view.l.e
        public void a(boolean z6) {
            if (z6) {
                this.f589b.setSystemBarsAppearance(16, 16);
            } else {
                this.f589b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.l.e
        public void b(boolean z6) {
            if (!z6) {
                this.f589b.setSystemBarsAppearance(0, 8);
                return;
            }
            if (this.f591d != null) {
                c(8192);
            }
            this.f589b.setSystemBarsAppearance(8, 8);
        }

        protected void c(int i7) {
            View decorView = this.f591d.getDecorView();
            decorView.setSystemUiVisibility((i7 ^ (-1)) & decorView.getSystemUiVisibility());
        }
    }

    private static class e {
        e() {
        }

        public void a(boolean z6) {
        }

        public void b(boolean z6) {
        }
    }

    public l(Window window, View view) {
        e aVar;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            this.f585a = new d(window, this);
            return;
        }
        if (i7 >= 26) {
            aVar = new c(window, view);
        } else if (i7 >= 23) {
            aVar = new b(window, view);
        } else {
            if (i7 < 20) {
                this.f585a = new e();
                return;
            }
            aVar = new a(window, view);
        }
        this.f585a = aVar;
    }

    public void a(boolean z6) {
        this.f585a.a(z6);
    }

    public void b(boolean z6) {
        this.f585a.b(z6);
    }
}
