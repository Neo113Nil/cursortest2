package M0;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import z1.l;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f606a;

    /* renamed from: b, reason: collision with root package name */
    public final SideSheetBehavior f607b;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f606a = i;
        this.f607b = sideSheetBehavior;
    }

    @Override // z1.l
    public final int H() {
        switch (this.f606a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f607b;
                return Math.max(0, sideSheetBehavior.f1955n + sideSheetBehavior.f1956o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f607b;
                return Math.max(0, (sideSheetBehavior2.f1954m - sideSheetBehavior2.f1953l) - sideSheetBehavior2.f1956o);
        }
    }

    @Override // z1.l
    public final int I() {
        switch (this.f606a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f607b;
                return (-sideSheetBehavior.f1953l) - sideSheetBehavior.f1956o;
            default:
                return this.f607b.f1954m;
        }
    }

    @Override // z1.l
    public final int K() {
        switch (this.f606a) {
            case 0:
                return this.f607b.f1956o;
            default:
                return this.f607b.f1954m;
        }
    }

    @Override // z1.l
    public final int L() {
        switch (this.f606a) {
            case 0:
                return -this.f607b.f1953l;
            default:
                return H();
        }
    }

    @Override // z1.l
    public final int M(View view) {
        switch (this.f606a) {
            case 0:
                return view.getRight() + this.f607b.f1956o;
            default:
                return view.getLeft() - this.f607b.f1956o;
        }
    }

    @Override // z1.l
    public final int N(CoordinatorLayout coordinatorLayout) {
        switch (this.f606a) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // z1.l
    public final int P() {
        switch (this.f606a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // z1.l
    public final boolean W(float f2) {
        switch (this.f606a) {
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

    @Override // z1.l
    public final boolean Y(View view) {
        switch (this.f606a) {
            case 0:
                if (view.getRight() < (H() - I()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (H() + this.f607b.f1954m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // z1.l
    public final boolean Z(float f2, float f3) {
        switch (this.f606a) {
            case 0:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs = Math.abs(f2);
                    this.f607b.getClass();
                    if (abs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs2 = Math.abs(f2);
                    this.f607b.getClass();
                    if (abs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // z1.l
    public final int m(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f606a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // z1.l
    public final float n(int i) {
        switch (this.f606a) {
            case 0:
                float I2 = I();
                return (i - I2) / (H() - I2);
            default:
                float f2 = this.f607b.f1954m;
                return (f2 - i) / (f2 - H());
        }
    }

    @Override // z1.l
    public final boolean u0(View view, float f2) {
        switch (this.f606a) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f607b;
                float abs = Math.abs((f2 * sideSheetBehavior.f1952k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f607b;
                float abs2 = Math.abs((f2 * sideSheetBehavior2.f1952k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // z1.l
    public final void w0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.f606a) {
            case 0:
                if (i <= this.f607b.f1954m) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i3 = this.f607b.f1954m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    break;
                }
                break;
        }
    }
}
