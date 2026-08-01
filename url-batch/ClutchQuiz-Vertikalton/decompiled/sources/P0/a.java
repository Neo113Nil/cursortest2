package P0;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class a extends A.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f597e;

    /* renamed from: f, reason: collision with root package name */
    public final SideSheetBehavior f598f;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f597e = i;
        this.f598f = sideSheetBehavior;
    }

    @Override // A.c
    public final boolean I0(View view, float f2) {
        switch (this.f597e) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f598f;
                float abs = Math.abs((f2 * sideSheetBehavior.f1948k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f598f;
                float abs2 = Math.abs((f2 * sideSheetBehavior2.f1948k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // A.c
    public final void K0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.f597e) {
            case 0:
                if (i <= this.f598f.f1950m) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i3 = this.f598f.f1950m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    break;
                }
                break;
        }
    }

    @Override // A.c
    public final int M() {
        switch (this.f597e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f598f;
                return Math.max(0, sideSheetBehavior.f1951n + sideSheetBehavior.f1952o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f598f;
                return Math.max(0, (sideSheetBehavior2.f1950m - sideSheetBehavior2.f1949l) - sideSheetBehavior2.f1952o);
        }
    }

    @Override // A.c
    public final int N() {
        switch (this.f597e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f598f;
                return (-sideSheetBehavior.f1949l) - sideSheetBehavior.f1952o;
            default:
                return this.f598f.f1950m;
        }
    }

    @Override // A.c
    public final int P() {
        switch (this.f597e) {
            case 0:
                return this.f598f.f1952o;
            default:
                return this.f598f.f1950m;
        }
    }

    @Override // A.c
    public final int Q() {
        switch (this.f597e) {
            case 0:
                return -this.f598f.f1949l;
            default:
                return M();
        }
    }

    @Override // A.c
    public final int R(View view) {
        switch (this.f597e) {
            case 0:
                return view.getRight() + this.f598f.f1952o;
            default:
                return view.getLeft() - this.f598f.f1952o;
        }
    }

    @Override // A.c
    public final int S(CoordinatorLayout coordinatorLayout) {
        switch (this.f597e) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // A.c
    public final int T() {
        switch (this.f597e) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // A.c
    public final boolean c0(float f2) {
        switch (this.f597e) {
            case 0:
                if (f2 > 0.0f) {
                }
                break;
            default:
                if (f2 < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // A.c
    public final boolean f0(View view) {
        switch (this.f597e) {
            case 0:
                if (view.getRight() < (M() - N()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (M() + this.f598f.f1950m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // A.c
    public final int g(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f597e) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // A.c
    public final boolean g0(float f2, float f3) {
        switch (this.f597e) {
            case 0:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs = Math.abs(f2);
                    this.f598f.getClass();
                    if (abs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs2 = Math.abs(f2);
                    this.f598f.getClass();
                    if (abs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // A.c
    public final float h(int i) {
        switch (this.f597e) {
            case 0:
                float N2 = N();
                return (i - N2) / (M() - N2);
            default:
                float f2 = this.f598f.f1950m;
                return (f2 - i) / (f2 - M());
        }
    }
}
