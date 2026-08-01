package S0;

import H1.d;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f987e;

    /* renamed from: f, reason: collision with root package name */
    public final SideSheetBehavior f988f;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f987e = i;
        this.f988f = sideSheetBehavior;
    }

    @Override // H1.d
    public final int B() {
        switch (this.f987e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f988f;
                return Math.max(0, sideSheetBehavior.f2348n + sideSheetBehavior.f2349o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f988f;
                return Math.max(0, (sideSheetBehavior2.f2347m - sideSheetBehavior2.f2346l) - sideSheetBehavior2.f2349o);
        }
    }

    @Override // H1.d
    public final int C() {
        switch (this.f987e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f988f;
                return (-sideSheetBehavior.f2346l) - sideSheetBehavior.f2349o;
            default:
                return this.f988f.f2347m;
        }
    }

    @Override // H1.d
    public final int D() {
        switch (this.f987e) {
            case 0:
                return this.f988f.f2349o;
            default:
                return this.f988f.f2347m;
        }
    }

    @Override // H1.d
    public final int E() {
        switch (this.f987e) {
            case 0:
                return -this.f988f.f2346l;
            default:
                return B();
        }
    }

    @Override // H1.d
    public final int F(View view) {
        switch (this.f987e) {
            case 0:
                return view.getRight() + this.f988f.f2349o;
            default:
                return view.getLeft() - this.f988f.f2349o;
        }
    }

    @Override // H1.d
    public final int G(CoordinatorLayout coordinatorLayout) {
        switch (this.f987e) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // H1.d
    public final int H() {
        switch (this.f987e) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // H1.d
    public final boolean N(float f2) {
        switch (this.f987e) {
            case 0:
                if (f2 > RecyclerView.f1937A0) {
                }
                break;
            default:
                if (f2 < RecyclerView.f1937A0) {
                }
                break;
        }
        return false;
    }

    @Override // H1.d
    public final boolean O(View view) {
        switch (this.f987e) {
            case 0:
                if (view.getRight() < (B() - C()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (B() + this.f988f.f2347m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // H1.d
    public final boolean Q(float f2, float f3) {
        switch (this.f987e) {
            case 0:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs = Math.abs(f2);
                    this.f988f.getClass();
                    if (abs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs2 = Math.abs(f2);
                    this.f988f.getClass();
                    if (abs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // H1.d
    public final int f(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f987e) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // H1.d
    public final float g(int i) {
        switch (this.f987e) {
            case 0:
                float C2 = C();
                return (i - C2) / (B() - C2);
            default:
                float f2 = this.f988f.f2347m;
                return (f2 - i) / (f2 - B());
        }
    }

    @Override // H1.d
    public final boolean q0(View view, float f2) {
        switch (this.f987e) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f988f;
                float abs = Math.abs((f2 * sideSheetBehavior.f2345k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f988f;
                float abs2 = Math.abs((f2 * sideSheetBehavior2.f2345k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // H1.d
    public final void w0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.f987e) {
            case 0:
                if (i <= this.f988f.f2347m) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i3 = this.f988f.f2347m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    break;
                }
                break;
        }
    }
}
