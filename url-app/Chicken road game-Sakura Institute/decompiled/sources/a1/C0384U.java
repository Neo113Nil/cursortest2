package a1;

import a.AbstractC0345a;
import android.view.View;
import android.view.Window;

/* renamed from: a1.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0384U extends AbstractC0345a {

    /* renamed from: i, reason: collision with root package name */
    public final Window f4872i;

    public C0384U(Window window) {
        this.f4872i = window;
    }

    @Override // a.AbstractC0345a
    public final void F(boolean z4) {
        Window window = this.f4872i;
        if (!z4) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }

    @Override // a.AbstractC0345a
    public final void G(boolean z4) {
        Window window = this.f4872i;
        if (!z4) {
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
