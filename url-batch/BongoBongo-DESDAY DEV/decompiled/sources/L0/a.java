package L0;

import A1.m;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class a extends m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f590a;

    /* renamed from: b, reason: collision with root package name */
    public final SideSheetBehavior f591b;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f590a = i;
        this.f591b = sideSheetBehavior;
    }

    @Override // A1.m
    public final int A() {
        switch (this.f590a) {
            case 0:
                return -this.f591b.f1966l;
            default:
                return u();
        }
    }

    @Override // A1.m
    public final int B(View view) {
        switch (this.f590a) {
            case 0:
                return view.getRight() + this.f591b.f1969o;
            default:
                return view.getLeft() - this.f591b.f1969o;
        }
    }

    @Override // A1.m
    public final int C(CoordinatorLayout coordinatorLayout) {
        switch (this.f590a) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // A1.m
    public final int D() {
        switch (this.f590a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // A1.m
    public final boolean J(float f2) {
        switch (this.f590a) {
            case 0:
                if (f2 > RecyclerView.A0) {
                }
                break;
            default:
                if (f2 < RecyclerView.A0) {
                }
                break;
        }
        return false;
    }

    @Override // A1.m
    public final boolean L(View view) {
        switch (this.f590a) {
            case 0:
                if (view.getRight() < (u() - v()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (u() + this.f591b.f1967m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // A1.m
    public final boolean M(float f2, float f3) {
        switch (this.f590a) {
            case 0:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs = Math.abs(f2);
                    this.f591b.getClass();
                    if (abs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs2 = Math.abs(f2);
                    this.f591b.getClass();
                    if (abs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // A1.m
    public final int f(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f590a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // A1.m
    public final float g(int i) {
        switch (this.f590a) {
            case 0:
                float v2 = v();
                return (i - v2) / (u() - v2);
            default:
                float f2 = this.f591b.f1967m;
                return (f2 - i) / (f2 - u());
        }
    }

    @Override // A1.m
    public final boolean j0(View view, float f2) {
        switch (this.f590a) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f591b;
                float abs = Math.abs((f2 * sideSheetBehavior.f1965k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f591b;
                float abs2 = Math.abs((f2 * sideSheetBehavior2.f1965k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // A1.m
    public final void o0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.f590a) {
            case 0:
                if (i <= this.f591b.f1967m) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i3 = this.f591b.f1967m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    break;
                }
                break;
        }
    }

    @Override // A1.m
    public final int u() {
        switch (this.f590a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f591b;
                return Math.max(0, sideSheetBehavior.f1968n + sideSheetBehavior.f1969o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f591b;
                return Math.max(0, (sideSheetBehavior2.f1967m - sideSheetBehavior2.f1966l) - sideSheetBehavior2.f1969o);
        }
    }

    @Override // A1.m
    public final int v() {
        switch (this.f590a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f591b;
                return (-sideSheetBehavior.f1966l) - sideSheetBehavior.f1969o;
            default:
                return this.f591b.f1967m;
        }
    }

    @Override // A1.m
    public final int z() {
        switch (this.f590a) {
            case 0:
                return this.f591b.f1969o;
            default:
                return this.f591b.f1967m;
        }
    }
}
