package a1;

import a.AbstractC0345a;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* renamed from: a1.V, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0385V extends AbstractC0345a {

    /* renamed from: i, reason: collision with root package name */
    public final WindowInsetsController f4873i;

    /* renamed from: j, reason: collision with root package name */
    public final Window f4874j;

    public C0385V(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f4873i = insetsController;
        this.f4874j = window;
    }

    @Override // a.AbstractC0345a
    public final void F(boolean z4) {
        Window window = this.f4874j;
        if (z4) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f4873i.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f4873i.setSystemBarsAppearance(0, 16);
    }

    @Override // a.AbstractC0345a
    public final void G(boolean z4) {
        Window window = this.f4874j;
        if (z4) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f4873i.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f4873i.setSystemBarsAppearance(0, 8);
    }
}
