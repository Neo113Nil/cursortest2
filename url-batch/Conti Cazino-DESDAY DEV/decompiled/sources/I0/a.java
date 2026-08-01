package I0;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class a extends q1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f341e;

    /* renamed from: f, reason: collision with root package name */
    public final SideSheetBehavior f342f;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f341e = i;
        this.f342f = sideSheetBehavior;
    }

    @Override // q1.d
    public final int F() {
        switch (this.f341e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f342f;
                return Math.max(0, sideSheetBehavior.f1743n + sideSheetBehavior.f1744o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f342f;
                return Math.max(0, (sideSheetBehavior2.f1742m - sideSheetBehavior2.f1741l) - sideSheetBehavior2.f1744o);
        }
    }

    @Override // q1.d
    public final int G() {
        switch (this.f341e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f342f;
                return (-sideSheetBehavior.f1741l) - sideSheetBehavior.f1744o;
            default:
                return this.f342f.f1742m;
        }
    }

    @Override // q1.d
    public final int J() {
        switch (this.f341e) {
            case 0:
                return this.f342f.f1744o;
            default:
                return this.f342f.f1742m;
        }
    }

    @Override // q1.d
    public final int K() {
        switch (this.f341e) {
            case 0:
                return -this.f342f.f1741l;
            default:
                return F();
        }
    }

    @Override // q1.d
    public final int L(View view) {
        switch (this.f341e) {
            case 0:
                return view.getRight() + this.f342f.f1744o;
            default:
                return view.getLeft() - this.f342f.f1744o;
        }
    }

    @Override // q1.d
    public final int M(CoordinatorLayout coordinatorLayout) {
        switch (this.f341e) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // q1.d
    public final int O() {
        switch (this.f341e) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // q1.d
    public final boolean S(float f2) {
        switch (this.f341e) {
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

    @Override // q1.d
    public final boolean U(View view) {
        switch (this.f341e) {
            case 0:
                if (view.getRight() < (F() - G()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (F() + this.f342f.f1742m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // q1.d
    public final boolean W(float f2, float f3) {
        switch (this.f341e) {
            case 0:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs = Math.abs(f2);
                    this.f342f.getClass();
                    if (abs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs2 = Math.abs(f2);
                    this.f342f.getClass();
                    if (abs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // q1.d
    public final int h(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f341e) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // q1.d
    public final float i(int i) {
        switch (this.f341e) {
            case 0:
                float G2 = G();
                return (i - G2) / (F() - G2);
            default:
                float f2 = this.f342f.f1742m;
                return (f2 - i) / (f2 - F());
        }
    }

    @Override // q1.d
    public final boolean s0(View view, float f2) {
        switch (this.f341e) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f342f;
                float abs = Math.abs((f2 * sideSheetBehavior.f1740k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f342f;
                float abs2 = Math.abs((f2 * sideSheetBehavior2.f1740k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // q1.d
    public final void v0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.f341e) {
            case 0:
                if (i <= this.f342f.f1742m) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i3 = this.f342f.f1742m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    break;
                }
                break;
        }
    }
}
