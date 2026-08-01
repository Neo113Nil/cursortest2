package n0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class x1 extends b4.l {

    /* renamed from: b, reason: collision with root package name */
    public final WindowInsetsController f2851b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f2852c;

    public x1(Window window, o2.f fVar) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f2851b = insetsController;
        this.f2852c = window;
    }

    @Override // b4.l
    public void Y(boolean z4) {
        l0(16, 16, z4);
    }

    @Override // b4.l
    public void Z(boolean z4) {
        l0(8192, 8, z4);
    }

    public final void l0(int i, int i4, boolean z4) {
        Window window = this.f2852c;
        if (window == null) {
            if (z4) {
                this.f2851b.setSystemBarsAppearance(i4, i4);
                return;
            } else {
                this.f2851b.setSystemBarsAppearance(0, i4);
                return;
            }
        }
        if (z4) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }
}
