package J0;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class a extends s1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f339a;

    /* renamed from: b, reason: collision with root package name */
    public final SideSheetBehavior f340b;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f339a = i;
        this.f340b = sideSheetBehavior;
    }

    @Override // s1.d
    public final int A() {
        switch (this.f339a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f340b;
                return Math.max(0, sideSheetBehavior.f1775n + sideSheetBehavior.f1776o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f340b;
                return Math.max(0, (sideSheetBehavior2.f1774m - sideSheetBehavior2.f1773l) - sideSheetBehavior2.f1776o);
        }
    }

    @Override // s1.d
    public final int C() {
        switch (this.f339a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f340b;
                return (-sideSheetBehavior.f1773l) - sideSheetBehavior.f1776o;
            default:
                return this.f340b.f1774m;
        }
    }

    @Override // s1.d
    public final int F() {
        switch (this.f339a) {
            case 0:
                return this.f340b.f1776o;
            default:
                return this.f340b.f1774m;
        }
    }

    @Override // s1.d
    public final int G() {
        switch (this.f339a) {
            case 0:
                return -this.f340b.f1773l;
            default:
                return A();
        }
    }

    @Override // s1.d
    public final int H(View view) {
        switch (this.f339a) {
            case 0:
                return view.getRight() + this.f340b.f1776o;
            default:
                return view.getLeft() - this.f340b.f1776o;
        }
    }

    @Override // s1.d
    public final int I(CoordinatorLayout coordinatorLayout) {
        switch (this.f339a) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // s1.d
    public final int J() {
        switch (this.f339a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // s1.d
    public final boolean N(float f2) {
        switch (this.f339a) {
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

    @Override // s1.d
    public final boolean P(View view) {
        switch (this.f339a) {
            case 0:
                if (view.getRight() < (A() - C()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (A() + this.f340b.f1774m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // s1.d
    public final boolean R(float f2, float f3) {
        switch (this.f339a) {
            case 0:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs = Math.abs(f2);
                    this.f340b.getClass();
                    if (abs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs2 = Math.abs(f2);
                    this.f340b.getClass();
                    if (abs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // s1.d
    public final int g(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f339a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // s1.d
    public final float h(int i) {
        switch (this.f339a) {
            case 0:
                float C2 = C();
                return (i - C2) / (A() - C2);
            default:
                float f2 = this.f340b.f1774m;
                return (f2 - i) / (f2 - A());
        }
    }

    @Override // s1.d
    public final boolean j0(View view, float f2) {
        switch (this.f339a) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f340b;
                float abs = Math.abs((f2 * sideSheetBehavior.f1772k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f340b;
                float abs2 = Math.abs((f2 * sideSheetBehavior2.f1772k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // s1.d
    public final void m0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.f339a) {
            case 0:
                if (i <= this.f340b.f1774m) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i3 = this.f340b.f1774m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    break;
                }
                break;
        }
    }
}
