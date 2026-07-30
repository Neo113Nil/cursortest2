package l;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public class s extends a.a {

    /* renamed from: f, reason: collision with root package name */
    public final Window f760f;

    public s(Window window) {
        this.f760f = window;
    }

    @Override // a.a
    public final void z(boolean z2) {
        Window window = this.f760f;
        if (!z2) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
