package y;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.datastore.preferences.protobuf.k0;

/* loaded from: classes.dex */
public final class V extends k0 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsController f3132e;

    /* renamed from: f, reason: collision with root package name */
    public final Window f3133f;

    public V(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f3132e = insetsController;
        this.f3133f = window;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final void D(boolean z2) {
        Window window = this.f3133f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f3132e.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f3132e.setSystemBarsAppearance(0, 16);
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final void E(boolean z2) {
        Window window = this.f3133f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f3132e.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f3132e.setSystemBarsAppearance(0, 8);
    }
}
