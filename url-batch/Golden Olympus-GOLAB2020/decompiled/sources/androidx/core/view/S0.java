package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;

/* loaded from: classes.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    private final e f11899a;

    private static class a extends e {

        /* renamed from: a, reason: collision with root package name */
        protected final Window f11900a;

        /* renamed from: b, reason: collision with root package name */
        private final O f11901b;

        a(Window window, O o4) {
            this.f11900a = window;
            this.f11901b = o4;
        }

        private void c(int i4) {
            if (i4 == 1) {
                d(4);
            } else if (i4 == 2) {
                d(2);
            } else {
                if (i4 != 8) {
                    return;
                }
                this.f11901b.a();
            }
        }

        @Override // androidx.core.view.S0.e
        void a(int i4) {
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i4 & i5) != 0) {
                    c(i5);
                }
            }
        }

        @Override // androidx.core.view.S0.e
        void b(int i4) {
            if (i4 == 0) {
                e(6144);
                return;
            }
            if (i4 == 1) {
                e(Base64Utils.IO_BUFFER_SIZE);
                d(com.ironsource.mediationsdk.metadata.a.f17688n);
            } else {
                if (i4 != 2) {
                    return;
                }
                e(com.ironsource.mediationsdk.metadata.a.f17688n);
                d(Base64Utils.IO_BUFFER_SIZE);
            }
        }

        protected void d(int i4) {
            View decorView = this.f11900a.getDecorView();
            decorView.setSystemUiVisibility(i4 | decorView.getSystemUiVisibility());
        }

        protected void e(int i4) {
            View decorView = this.f11900a.getDecorView();
            decorView.setSystemUiVisibility((~i4) & decorView.getSystemUiVisibility());
        }
    }

    private static class b extends a {
        b(Window window, O o4) {
            super(window, o4);
        }
    }

    private static class c extends b {
        c(Window window, O o4) {
            super(window, o4);
        }
    }

    private static class e {
        e() {
        }

        abstract void a(int i4);

        abstract void b(int i4);
    }

    public S0(Window window, View view) {
        O o4 = new O(view);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            this.f11899a = new d(window, this, o4);
        } else if (i4 >= 26) {
            this.f11899a = new c(window, o4);
        } else {
            this.f11899a = new b(window, o4);
        }
    }

    public void a(int i4) {
        this.f11899a.a(i4);
    }

    public void b(int i4) {
        this.f11899a.b(i4);
    }

    private static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final S0 f11902a;

        /* renamed from: b, reason: collision with root package name */
        final WindowInsetsController f11903b;

        /* renamed from: c, reason: collision with root package name */
        final O f11904c;

        /* renamed from: d, reason: collision with root package name */
        private final androidx.collection.g f11905d;

        /* renamed from: e, reason: collision with root package name */
        protected Window f11906e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        d(Window window, S0 s02, O o4) {
            this(r0, s02, o4);
            WindowInsetsController insetsController;
            insetsController = window.getInsetsController();
            this.f11906e = window;
        }

        @Override // androidx.core.view.S0.e
        void a(int i4) {
            if ((i4 & 8) != 0) {
                this.f11904c.a();
            }
            this.f11903b.hide(i4 & (-9));
        }

        @Override // androidx.core.view.S0.e
        void b(int i4) {
            this.f11903b.setSystemBarsBehavior(i4);
        }

        d(WindowInsetsController windowInsetsController, S0 s02, O o4) {
            this.f11905d = new androidx.collection.g();
            this.f11903b = windowInsetsController;
            this.f11902a = s02;
            this.f11904c = o4;
        }
    }
}
