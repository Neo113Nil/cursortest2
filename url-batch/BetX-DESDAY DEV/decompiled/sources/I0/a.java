package I0;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import q1.l;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f369g;
    public final SideSheetBehavior h;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f369g = i;
        this.h = sideSheetBehavior;
    }

    @Override // q1.l
    public final int B() {
        switch (this.f369g) {
            case 0:
                return this.h.f1944o;
            default:
                return this.h.f1942m;
        }
    }

    @Override // q1.l
    public final int C() {
        switch (this.f369g) {
            case 0:
                return -this.h.f1941l;
            default:
                return x();
        }
    }

    @Override // q1.l
    public final int D(View view) {
        switch (this.f369g) {
            case 0:
                return view.getRight() + this.h.f1944o;
            default:
                return view.getLeft() - this.h.f1944o;
        }
    }

    @Override // q1.l
    public final int E(CoordinatorLayout coordinatorLayout) {
        switch (this.f369g) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // q1.l
    public final int G() {
        switch (this.f369g) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // q1.l
    public final boolean L(float f2) {
        switch (this.f369g) {
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

    @Override // q1.l
    public final boolean N(View view) {
        switch (this.f369g) {
            case 0:
                if (view.getRight() < (x() - z()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (x() + this.h.f1942m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // q1.l
    public final boolean O(float f2, float f3) {
        switch (this.f369g) {
            case 0:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs = Math.abs(f2);
                    this.h.getClass();
                    if (abs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs2 = Math.abs(f2);
                    this.h.getClass();
                    if (abs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // q1.l
    public final int e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f369g) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // q1.l
    public final float f(int i) {
        switch (this.f369g) {
            case 0:
                float z2 = z();
                return (i - z2) / (x() - z2);
            default:
                float f2 = this.h.f1942m;
                return (f2 - i) / (f2 - x());
        }
    }

    @Override // q1.l
    public final boolean r0(View view, float f2) {
        switch (this.f369g) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.h;
                float abs = Math.abs((f2 * sideSheetBehavior.f1940k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.h;
                float abs2 = Math.abs((f2 * sideSheetBehavior2.f1940k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // q1.l
    public final void t0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.f369g) {
            case 0:
                if (i <= this.h.f1942m) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i3 = this.h.f1942m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    break;
                }
                break;
        }
    }

    @Override // q1.l
    public final int x() {
        switch (this.f369g) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.h;
                return Math.max(0, sideSheetBehavior.f1943n + sideSheetBehavior.f1944o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.h;
                return Math.max(0, (sideSheetBehavior2.f1942m - sideSheetBehavior2.f1941l) - sideSheetBehavior2.f1944o);
        }
    }

    @Override // q1.l
    public final int z() {
        switch (this.f369g) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.h;
                return (-sideSheetBehavior.f1941l) - sideSheetBehavior.f1944o;
            default:
                return this.h.f1942m;
        }
    }
}
