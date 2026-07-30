package O;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class B0 extends p8.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2216a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Window f2217b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2218c;

    public B0(Window window, I0.j jVar) {
        this.f2217b = window;
        this.f2218c = jVar;
    }

    public void A(int i) {
        View decorView = this.f2217b.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public void B(int i) {
        View decorView = this.f2217b.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // p8.g
    public final void i() {
        switch (this.f2216a) {
            case 0:
                for (int i = 1; i <= 256; i <<= 1) {
                    if ((2 & i) != 0) {
                        if (i == 1) {
                            A(4);
                        } else if (i == 2) {
                            A(2);
                        } else if (i == 8) {
                            ((h4.c) ((I0.j) this.f2218c).f1233u).C();
                        }
                    }
                }
                break;
            default:
                ((WindowInsetsController) this.f2218c).hide(2);
                break;
        }
    }

    @Override // p8.g
    public void m(boolean z8) {
        switch (this.f2216a) {
            case 1:
                Window window = this.f2217b;
                if (!z8) {
                    if (window != null) {
                        View decorView = window.getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
                    }
                    ((WindowInsetsController) this.f2218c).setSystemBarsAppearance(0, 16);
                    break;
                } else {
                    if (window != null) {
                        View decorView2 = window.getDecorView();
                        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
                    }
                    ((WindowInsetsController) this.f2218c).setSystemBarsAppearance(16, 16);
                    break;
                }
        }
    }

    @Override // p8.g
    public final void n(boolean z8) {
        switch (this.f2216a) {
            case 0:
                if (!z8) {
                    B(8192);
                    break;
                } else {
                    Window window = this.f2217b;
                    window.clearFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                    A(8192);
                    break;
                }
            default:
                Window window2 = this.f2217b;
                if (!z8) {
                    if (window2 != null) {
                        View decorView = window2.getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
                    }
                    ((WindowInsetsController) this.f2218c).setSystemBarsAppearance(0, 8);
                    break;
                } else {
                    if (window2 != null) {
                        View decorView2 = window2.getDecorView();
                        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
                    }
                    ((WindowInsetsController) this.f2218c).setSystemBarsAppearance(8, 8);
                    break;
                }
        }
    }

    @Override // p8.g
    public final void o() {
        switch (this.f2216a) {
            case 0:
                B(4096);
                A(2048);
                break;
            default:
                ((WindowInsetsController) this.f2218c).setSystemBarsBehavior(1);
                break;
        }
    }

    public B0(WindowInsetsController windowInsetsController, I0.j jVar) {
        this.f2218c = windowInsetsController;
    }
}
