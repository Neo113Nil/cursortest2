package K0;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class a extends z1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f537a;

    /* renamed from: b, reason: collision with root package name */
    public final SideSheetBehavior f538b;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f537a = i;
        this.f538b = sideSheetBehavior;
    }

    @Override // z1.d
    public final int F() {
        switch (this.f537a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f538b;
                return Math.max(0, sideSheetBehavior.f1899n + sideSheetBehavior.f1900o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f538b;
                return Math.max(0, (sideSheetBehavior2.f1898m - sideSheetBehavior2.f1897l) - sideSheetBehavior2.f1900o);
        }
    }

    @Override // z1.d
    public final int H() {
        switch (this.f537a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f538b;
                return (-sideSheetBehavior.f1897l) - sideSheetBehavior.f1900o;
            default:
                return this.f538b.f1898m;
        }
    }

    @Override // z1.d
    public final int J() {
        switch (this.f537a) {
            case 0:
                return this.f538b.f1900o;
            default:
                return this.f538b.f1898m;
        }
    }

    @Override // z1.d
    public final int K() {
        switch (this.f537a) {
            case 0:
                return -this.f538b.f1897l;
            default:
                return F();
        }
    }

    @Override // z1.d
    public final int L(View view) {
        switch (this.f537a) {
            case 0:
                return view.getRight() + this.f538b.f1900o;
            default:
                return view.getLeft() - this.f538b.f1900o;
        }
    }

    @Override // z1.d
    public final int M(CoordinatorLayout coordinatorLayout) {
        switch (this.f537a) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // z1.d
    public final int O() {
        switch (this.f537a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // z1.d
    public final boolean T(float f2) {
        switch (this.f537a) {
            case 0:
                if (f2 > RecyclerView.f1559A0) {
                }
                break;
            default:
                if (f2 < RecyclerView.f1559A0) {
                }
                break;
        }
        return false;
    }

    @Override // z1.d
    public final boolean V(View view) {
        switch (this.f537a) {
            case 0:
                if (view.getRight() < (F() - H()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (F() + this.f538b.f1898m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // z1.d
    public final boolean X(float f2, float f3) {
        switch (this.f537a) {
            case 0:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs = Math.abs(f2);
                    this.f538b.getClass();
                    if (abs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs2 = Math.abs(f2);
                    this.f538b.getClass();
                    if (abs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // z1.d
    public final int m(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f537a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // z1.d
    public final float n(int i) {
        switch (this.f537a) {
            case 0:
                float H2 = H();
                return (i - H2) / (F() - H2);
            default:
                float f2 = this.f538b.f1898m;
                return (f2 - i) / (f2 - F());
        }
    }

    @Override // z1.d
    public final boolean s0(View view, float f2) {
        switch (this.f537a) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f538b;
                float abs = Math.abs((f2 * sideSheetBehavior.f1896k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f538b;
                float abs2 = Math.abs((f2 * sideSheetBehavior2.f1896k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // z1.d
    public final void t0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.f537a) {
            case 0:
                if (i <= this.f538b.f1898m) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i3 = this.f538b.f1898m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    break;
                }
                break;
        }
    }
}
