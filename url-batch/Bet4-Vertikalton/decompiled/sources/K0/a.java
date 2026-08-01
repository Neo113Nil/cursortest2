package K0;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class a extends w1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f520a;

    /* renamed from: b, reason: collision with root package name */
    public final SideSheetBehavior f521b;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f520a = i;
        this.f521b = sideSheetBehavior;
    }

    @Override // w1.d
    public final int C() {
        switch (this.f520a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f521b;
                return Math.max(0, sideSheetBehavior.f1867n + sideSheetBehavior.f1868o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f521b;
                return Math.max(0, (sideSheetBehavior2.f1866m - sideSheetBehavior2.f1865l) - sideSheetBehavior2.f1868o);
        }
    }

    @Override // w1.d
    public final int E() {
        switch (this.f520a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f521b;
                return (-sideSheetBehavior.f1865l) - sideSheetBehavior.f1868o;
            default:
                return this.f521b.f1866m;
        }
    }

    @Override // w1.d
    public final int I() {
        switch (this.f520a) {
            case 0:
                return this.f521b.f1868o;
            default:
                return this.f521b.f1866m;
        }
    }

    @Override // w1.d
    public final int J() {
        switch (this.f520a) {
            case 0:
                return -this.f521b.f1865l;
            default:
                return C();
        }
    }

    @Override // w1.d
    public final int K(View view) {
        switch (this.f520a) {
            case 0:
                return view.getRight() + this.f521b.f1868o;
            default:
                return view.getLeft() - this.f521b.f1868o;
        }
    }

    @Override // w1.d
    public final int L(CoordinatorLayout coordinatorLayout) {
        switch (this.f520a) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // w1.d
    public final int M() {
        switch (this.f520a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // w1.d
    public final boolean T(float f2) {
        switch (this.f520a) {
            case 0:
                if (f2 > RecyclerView.f1530C0) {
                }
                break;
            default:
                if (f2 < RecyclerView.f1530C0) {
                }
                break;
        }
        return false;
    }

    @Override // w1.d
    public final boolean V(View view) {
        switch (this.f520a) {
            case 0:
                if (view.getRight() < (C() - E()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (C() + this.f521b.f1866m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // w1.d
    public final boolean X(float f2, float f3) {
        switch (this.f520a) {
            case 0:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs = Math.abs(f2);
                    this.f521b.getClass();
                    if (abs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs2 = Math.abs(f2);
                    this.f521b.getClass();
                    if (abs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // w1.d
    public final int h(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f520a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // w1.d
    public final float i(int i) {
        switch (this.f520a) {
            case 0:
                float E2 = E();
                return (i - E2) / (C() - E2);
            default:
                float f2 = this.f521b.f1866m;
                return (f2 - i) / (f2 - C());
        }
    }

    @Override // w1.d
    public final boolean r0(View view, float f2) {
        switch (this.f520a) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f521b;
                float abs = Math.abs((f2 * sideSheetBehavior.f1864k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f521b;
                float abs2 = Math.abs((f2 * sideSheetBehavior2.f1864k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // w1.d
    public final void v0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.f520a) {
            case 0:
                if (i <= this.f521b.f1866m) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i3 = this.f521b.f1866m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    break;
                }
                break;
        }
    }
}
