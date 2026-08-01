package J0;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import x1.l;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f399a;

    /* renamed from: b, reason: collision with root package name */
    public final SideSheetBehavior f400b;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f399a = i;
        this.f400b = sideSheetBehavior;
    }

    @Override // x1.l
    public final int C() {
        switch (this.f399a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f400b;
                return Math.max(0, sideSheetBehavior.f1843n + sideSheetBehavior.f1844o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f400b;
                return Math.max(0, (sideSheetBehavior2.f1842m - sideSheetBehavior2.f1841l) - sideSheetBehavior2.f1844o);
        }
    }

    @Override // x1.l
    public final int E() {
        switch (this.f399a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f400b;
                return (-sideSheetBehavior.f1841l) - sideSheetBehavior.f1844o;
            default:
                return this.f400b.f1842m;
        }
    }

    @Override // x1.l
    public final int F() {
        switch (this.f399a) {
            case 0:
                return this.f400b.f1844o;
            default:
                return this.f400b.f1842m;
        }
    }

    @Override // x1.l
    public final int G() {
        switch (this.f399a) {
            case 0:
                return -this.f400b.f1841l;
            default:
                return C();
        }
    }

    @Override // x1.l
    public final int H(View view) {
        switch (this.f399a) {
            case 0:
                return view.getRight() + this.f400b.f1844o;
            default:
                return view.getLeft() - this.f400b.f1844o;
        }
    }

    @Override // x1.l
    public final int I(CoordinatorLayout coordinatorLayout) {
        switch (this.f399a) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // x1.l
    public final int K() {
        switch (this.f399a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // x1.l
    public final boolean O(float f2) {
        switch (this.f399a) {
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

    @Override // x1.l
    public final boolean Q(View view) {
        switch (this.f399a) {
            case 0:
                if (view.getRight() < (C() - E()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (C() + this.f400b.f1842m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // x1.l
    public final boolean R(float f2, float f3) {
        switch (this.f399a) {
            case 0:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs = Math.abs(f2);
                    this.f400b.getClass();
                    if (abs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs2 = Math.abs(f2);
                    this.f400b.getClass();
                    if (abs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // x1.l
    public final boolean e0(View view, float f2) {
        switch (this.f399a) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f400b;
                float abs = Math.abs((f2 * sideSheetBehavior.f1840k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f400b;
                float abs2 = Math.abs((f2 * sideSheetBehavior2.f1840k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // x1.l
    public final int h(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f399a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // x1.l
    public final float i(int i) {
        switch (this.f399a) {
            case 0:
                float E2 = E();
                return (i - E2) / (C() - E2);
            default:
                float f2 = this.f400b.f1842m;
                return (f2 - i) / (f2 - C());
        }
    }

    @Override // x1.l
    public final void k0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.f399a) {
            case 0:
                if (i <= this.f400b.f1842m) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i3 = this.f400b.f1842m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    break;
                }
                break;
        }
    }
}
