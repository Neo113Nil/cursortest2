package J0;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class a extends u1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f346a;

    /* renamed from: b, reason: collision with root package name */
    public final SideSheetBehavior f347b;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f346a = i;
        this.f347b = sideSheetBehavior;
    }

    @Override // u1.d
    public final int J() {
        switch (this.f346a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f347b;
                return Math.max(0, sideSheetBehavior.f1806n + sideSheetBehavior.f1807o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f347b;
                return Math.max(0, (sideSheetBehavior2.f1805m - sideSheetBehavior2.f1804l) - sideSheetBehavior2.f1807o);
        }
    }

    @Override // u1.d
    public final int L() {
        switch (this.f346a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f347b;
                return (-sideSheetBehavior.f1804l) - sideSheetBehavior.f1807o;
            default:
                return this.f347b.f1805m;
        }
    }

    @Override // u1.d
    public final int M() {
        switch (this.f346a) {
            case 0:
                return this.f347b.f1807o;
            default:
                return this.f347b.f1805m;
        }
    }

    @Override // u1.d
    public final int N() {
        switch (this.f346a) {
            case 0:
                return -this.f347b.f1804l;
            default:
                return J();
        }
    }

    @Override // u1.d
    public final int O(View view) {
        switch (this.f346a) {
            case 0:
                return view.getRight() + this.f347b.f1807o;
            default:
                return view.getLeft() - this.f347b.f1807o;
        }
    }

    @Override // u1.d
    public final int P(CoordinatorLayout coordinatorLayout) {
        switch (this.f346a) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // u1.d
    public final int Q() {
        switch (this.f346a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // u1.d
    public final boolean U(float f2) {
        switch (this.f346a) {
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

    @Override // u1.d
    public final boolean W(View view) {
        switch (this.f346a) {
            case 0:
                if (view.getRight() < (J() - L()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (J() + this.f347b.f1805m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // u1.d
    public final boolean Y(float f2, float f3) {
        switch (this.f346a) {
            case 0:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs = Math.abs(f2);
                    this.f347b.getClass();
                    if (abs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs2 = Math.abs(f2);
                    this.f347b.getClass();
                    if (abs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // u1.d
    public final int i(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f346a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // u1.d
    public final float j(int i) {
        switch (this.f346a) {
            case 0:
                float L2 = L();
                return (i - L2) / (J() - L2);
            default:
                float f2 = this.f347b.f1805m;
                return (f2 - i) / (f2 - J());
        }
    }

    @Override // u1.d
    public final boolean q0(View view, float f2) {
        switch (this.f346a) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f347b;
                float abs = Math.abs((f2 * sideSheetBehavior.f1803k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f347b;
                float abs2 = Math.abs((f2 * sideSheetBehavior2.f1803k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // u1.d
    public final void t0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.f346a) {
            case 0:
                if (i <= this.f347b.f1805m) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i3 = this.f347b.f1805m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    break;
                }
                break;
        }
    }
}
