package N0;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import u1.l;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f563e;

    /* renamed from: f, reason: collision with root package name */
    public final SideSheetBehavior f564f;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f563e = i;
        this.f564f = sideSheetBehavior;
    }

    @Override // u1.l
    public final int D() {
        switch (this.f563e) {
            case 0:
                return this.f564f.f1873o;
            default:
                return this.f564f.f1871m;
        }
    }

    @Override // u1.l
    public final int E() {
        switch (this.f563e) {
            case 0:
                return -this.f564f.f1870l;
            default:
                return y();
        }
    }

    @Override // u1.l
    public final int F(View view) {
        switch (this.f563e) {
            case 0:
                return view.getRight() + this.f564f.f1873o;
            default:
                return view.getLeft() - this.f564f.f1873o;
        }
    }

    @Override // u1.l
    public final int G(CoordinatorLayout coordinatorLayout) {
        switch (this.f563e) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // u1.l
    public final int I() {
        switch (this.f563e) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // u1.l
    public final boolean N(float f2) {
        switch (this.f563e) {
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

    @Override // u1.l
    public final boolean P(View view) {
        switch (this.f563e) {
            case 0:
                if (view.getRight() < (y() - z()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (y() + this.f564f.f1871m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // u1.l
    public final boolean Q(float f2, float f3) {
        switch (this.f563e) {
            case 0:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs = Math.abs(f2);
                    this.f564f.getClass();
                    if (abs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs2 = Math.abs(f2);
                    this.f564f.getClass();
                    if (abs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // u1.l
    public final int i(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f563e) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // u1.l
    public final float j(int i) {
        switch (this.f563e) {
            case 0:
                float z2 = z();
                return (i - z2) / (y() - z2);
            default:
                float f2 = this.f564f.f1871m;
                return (f2 - i) / (f2 - y());
        }
    }

    @Override // u1.l
    public final boolean n0(View view, float f2) {
        switch (this.f563e) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f564f;
                float abs = Math.abs((f2 * sideSheetBehavior.f1869k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f564f;
                float abs2 = Math.abs((f2 * sideSheetBehavior2.f1869k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // u1.l
    public final void q0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.f563e) {
            case 0:
                if (i <= this.f564f.f1871m) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i3 = this.f564f.f1871m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    break;
                }
                break;
        }
    }

    @Override // u1.l
    public final int y() {
        switch (this.f563e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f564f;
                return Math.max(0, sideSheetBehavior.f1872n + sideSheetBehavior.f1873o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f564f;
                return Math.max(0, (sideSheetBehavior2.f1871m - sideSheetBehavior2.f1870l) - sideSheetBehavior2.f1873o);
        }
    }

    @Override // u1.l
    public final int z() {
        switch (this.f563e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f564f;
                return (-sideSheetBehavior.f1870l) - sideSheetBehavior.f1873o;
            default:
                return this.f564f.f1871m;
        }
    }
}
