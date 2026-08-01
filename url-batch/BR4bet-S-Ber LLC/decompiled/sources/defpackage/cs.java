package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class cs extends la0 {
    public final /* synthetic */ int r;
    public final SideSheetBehavior s;

    public /* synthetic */ cs(SideSheetBehavior sideSheetBehavior, int i) {
        this.r = i;
        this.s = sideSheetBehavior;
    }

    @Override // defpackage.la0
    public final int A() {
        int i = this.r;
        SideSheetBehavior sideSheetBehavior = this.s;
        switch (i) {
            case 0:
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    @Override // defpackage.la0
    public final int C() {
        int i = this.r;
        SideSheetBehavior sideSheetBehavior = this.s;
        switch (i) {
            case 0:
                return sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    @Override // defpackage.la0
    public final int D() {
        switch (this.r) {
            case 0:
                return -this.s.l;
            default:
                return z();
        }
    }

    @Override // defpackage.la0
    public final int E(View view) {
        int i = this.r;
        SideSheetBehavior sideSheetBehavior = this.s;
        switch (i) {
            case 0:
                return view.getRight() + sideSheetBehavior.o;
            default:
                return view.getLeft() - sideSheetBehavior.o;
        }
    }

    @Override // defpackage.la0
    public final int F(CoordinatorLayout coordinatorLayout) {
        switch (this.r) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // defpackage.la0
    public final int G() {
        switch (this.r) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // defpackage.la0
    public final boolean J(float f) {
        switch (this.r) {
            case 0:
                if (f > 0.0f) {
                }
                break;
            default:
                if (f < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.la0
    public final boolean L(View view) {
        switch (this.r) {
            case 0:
                if (view.getRight() < (z() - A()) / 2) {
                    break;
                }
                break;
            default:
                if (view.getLeft() > (z() + this.s.m) / 2) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.la0
    public final boolean M(float f, float f2) {
        switch (this.r) {
            case 0:
                if (Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= 500.0f) {
                }
                break;
            default:
                if (Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= 500.0f) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.la0
    public final boolean c0(View view, float f) {
        int i = this.r;
        SideSheetBehavior sideSheetBehavior = this.s;
        switch (i) {
            case 0:
                if (Math.abs((f * sideSheetBehavior.k) + view.getLeft()) > 0.5f) {
                    break;
                }
                break;
            default:
                if (Math.abs((f * sideSheetBehavior.k) + view.getRight()) > 0.5f) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.la0
    public final void g0(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.r) {
            case 0:
                marginLayoutParams.leftMargin = i;
                break;
            default:
                marginLayoutParams.rightMargin = i;
                break;
        }
    }

    @Override // defpackage.la0
    public final int h(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.r) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.la0
    public final void h0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3 = this.r;
        SideSheetBehavior sideSheetBehavior = this.s;
        switch (i3) {
            case 0:
                if (i <= sideSheetBehavior.m) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i4 = sideSheetBehavior.m;
                if (i <= i4) {
                    marginLayoutParams.rightMargin = i4 - i;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.la0
    public final float i(int i) {
        switch (this.r) {
            case 0:
                float A = A();
                return (i - A) / (z() - A);
            default:
                float f = this.s.m;
                return (f - i) / (f - z());
        }
    }

    @Override // defpackage.la0
    public final int x(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.r) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.la0
    public final int z() {
        int i = this.r;
        SideSheetBehavior sideSheetBehavior = this.s;
        switch (i) {
            case 0:
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                return Math.max(0, (sideSheetBehavior.m - sideSheetBehavior.l) - sideSheetBehavior.o);
        }
    }
}
