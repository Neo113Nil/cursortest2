package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    private final c f11895a;

    private static class a extends c {

        /* renamed from: a, reason: collision with root package name */
        private final View f11896a;

        a(View view) {
            this.f11896a = view;
        }

        @Override // androidx.core.view.O.c
        void a() {
            View view = this.f11896a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f11896a.getWindowToken(), 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b extends a {

        /* renamed from: b, reason: collision with root package name */
        private View f11897b;

        /* renamed from: c, reason: collision with root package name */
        private WindowInsetsController f11898c;

        b(View view) {
            super(view);
            this.f11897b = view;
        }

        @Override // androidx.core.view.O.a, androidx.core.view.O.c
        void a() {
            int ime;
            View view;
            WindowInsetsController windowInsetsController = this.f11898c;
            if (windowInsetsController == null) {
                View view2 = this.f11897b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.V
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i4) {
                    atomicBoolean.set((r2 & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f11897b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f11897b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            ime = WindowInsets.Type.ime();
            windowInsetsController.hide(ime);
        }
    }

    private static class c {
        c() {
        }

        abstract void a();
    }

    public O(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f11895a = new b(view);
        } else {
            this.f11895a = new a(view);
        }
    }

    public void a() {
        this.f11895a.a();
    }
}
