package D;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class b0 extends A3.c {

    /* renamed from: b, reason: collision with root package name */
    public final WindowInsetsController f278b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f279c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Window window) {
        super(2);
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f278b = insetsController;
        this.f279c = window;
    }

    @Override // A3.c
    public final void c0(boolean z5) {
        Window window = this.f279c;
        if (z5) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f278b.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f278b.setSystemBarsAppearance(0, 16);
    }

    @Override // A3.c
    public final void d0(boolean z5) {
        Window window = this.f279c;
        if (z5) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f278b.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f278b.setSystemBarsAppearance(0, 8);
    }
}
