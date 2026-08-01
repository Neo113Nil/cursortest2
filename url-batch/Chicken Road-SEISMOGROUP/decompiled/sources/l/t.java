package l;

import a.AbstractC0016a;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class t extends AbstractC0016a {

    /* renamed from: g, reason: collision with root package name */
    public final WindowInsetsController f979g;

    /* renamed from: h, reason: collision with root package name */
    public final Window f980h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Window window) {
        super(22);
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f979g = insetsController;
        this.f980h = window;
    }

    @Override // a.AbstractC0016a
    public final void B(boolean z) {
        Window window = this.f980h;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f979g.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f979g.setSystemBarsAppearance(0, 16);
    }

    @Override // a.AbstractC0016a
    public final void C(boolean z) {
        Window window = this.f980h;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f979g.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f979g.setSystemBarsAppearance(0, 8);
    }
}
