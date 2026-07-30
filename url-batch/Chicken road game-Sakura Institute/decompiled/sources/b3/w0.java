package b3;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w0 extends a8.m {

    /* renamed from: g, reason: collision with root package name */
    public final WindowInsetsController f1371g;

    /* renamed from: h, reason: collision with root package name */
    public final Window f1372h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(Window window) {
        super(5);
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f1371g = insetsController;
        this.f1372h = window;
    }

    @Override // a8.m
    public final void J(boolean z8) {
        Window window = this.f1372h;
        if (z8) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f1371g.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f1371g.setSystemBarsAppearance(0, 16);
    }

    @Override // a8.m
    public final void K(boolean z8) {
        Window window = this.f1372h;
        if (z8) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f1371g.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f1371g.setSystemBarsAppearance(0, 8);
    }
}
