package o3;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class l1 extends k7.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7420i;

    /* renamed from: r, reason: collision with root package name */
    public final Window f7421r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f7422s;

    public l1(Window window, l.d dVar, int i3) {
        WindowInsetsController insetsController;
        this.f7420i = i3;
        switch (i3) {
            case 1:
                insetsController = window.getInsetsController();
                this.f7422s = insetsController;
                this.f7421r = window;
                break;
            default:
                this.f7421r = window;
                this.f7422s = dVar;
                break;
        }
    }

    @Override // k7.e
    public void O(boolean z10) {
        switch (this.f7420i) {
            case 1:
                Window window = this.f7421r;
                if (window == null) {
                    WindowInsetsController windowInsetsController = (WindowInsetsController) this.f7422s;
                    if (!z10) {
                        windowInsetsController.setSystemBarsAppearance(0, 16);
                        break;
                    } else {
                        windowInsetsController.setSystemBarsAppearance(16, 16);
                        break;
                    }
                } else if (!z10) {
                    W(16);
                    break;
                } else {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
                    break;
                }
        }
    }

    @Override // k7.e
    public void P(boolean z10) {
        switch (this.f7420i) {
            case 0:
                if (!z10) {
                    W(8192);
                    break;
                } else {
                    Window window = this.f7421r;
                    window.clearFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                    V(8192);
                    break;
                }
            default:
                Window window2 = this.f7421r;
                if (window2 == null) {
                    WindowInsetsController windowInsetsController = (WindowInsetsController) this.f7422s;
                    if (!z10) {
                        windowInsetsController.setSystemBarsAppearance(0, 8);
                        break;
                    } else {
                        windowInsetsController.setSystemBarsAppearance(8, 8);
                        break;
                    }
                } else if (!z10) {
                    W(8192);
                    break;
                } else {
                    View decorView = window2.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                    break;
                }
        }
    }

    @Override // k7.e
    public void Q() {
        switch (this.f7420i) {
            case 0:
                this.f7421r.getDecorView().setTag(356039078, 2);
                W(2048);
                V(4096);
                break;
            default:
                Window window = this.f7421r;
                if (window == null) {
                    ((WindowInsetsController) this.f7422s).setSystemBarsBehavior(2);
                    break;
                } else {
                    window.getDecorView().setTag(356039078, 2);
                    W(2048);
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4096);
                    break;
                }
        }
    }

    public void V(int i3) {
        View decorView = this.f7421r.getDecorView();
        decorView.setSystemUiVisibility(i3 | decorView.getSystemUiVisibility());
    }

    public final void W(int i3) {
        switch (this.f7420i) {
            case 0:
                View decorView = this.f7421r.getDecorView();
                decorView.setSystemUiVisibility((~i3) & decorView.getSystemUiVisibility());
                break;
            default:
                View decorView2 = this.f7421r.getDecorView();
                decorView2.setSystemUiVisibility((~i3) & decorView2.getSystemUiVisibility());
                break;
        }
    }

    @Override // k7.e
    public final void w() {
        switch (this.f7420i) {
            case 0:
                for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                    if ((519 & i3) != 0) {
                        if (i3 == 1) {
                            V(4);
                        } else if (i3 == 2) {
                            V(2);
                        } else if (i3 == 8) {
                            ((l.d) ((l.d) this.f7422s).f5643e).t();
                        }
                    }
                }
                break;
            default:
                ((WindowInsetsController) this.f7422s).hide(519);
                break;
        }
    }
}
