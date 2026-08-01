package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class qp extends o8 {
    public final /* synthetic */ int s;
    public final SideSheetBehavior t;

    public /* synthetic */ qp(SideSheetBehavior sideSheetBehavior, int i) {
        this.s = i;
        this.t = sideSheetBehavior;
    }

    @Override // defpackage.o8
    public final void A0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3 = this.s;
        SideSheetBehavior sideSheetBehavior = this.t;
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

    @Override // defpackage.o8
    public final int C() {
        int i = this.s;
        SideSheetBehavior sideSheetBehavior = this.t;
        switch (i) {
            case 0:
                return sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    @Override // defpackage.o8
    public final int D() {
        switch (this.s) {
            case 0:
                return -this.t.l;
            default:
                return y();
        }
    }

    @Override // defpackage.o8
    public final int E(View view) {
        int i = this.s;
        SideSheetBehavior sideSheetBehavior = this.t;
        switch (i) {
            case 0:
                return view.getRight() + sideSheetBehavior.o;
            default:
                return view.getLeft() - sideSheetBehavior.o;
        }
    }

    @Override // defpackage.o8
    public final int F(CoordinatorLayout coordinatorLayout) {
        switch (this.s) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // defpackage.o8
    public final int H() {
        switch (this.s) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // defpackage.o8
    public final boolean O(float f) {
        switch (this.s) {
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

    @Override // defpackage.o8
    public final boolean Q(View view) {
        switch (this.s) {
            case 0:
                if (view.getRight() < (y() - z()) / 2) {
                    break;
                }
                break;
            default:
                if (view.getLeft() > (y() + this.t.m) / 2) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.o8
    public final boolean R(float f, float f2) {
        switch (this.s) {
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

    @Override // defpackage.o8
    public final int e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.s) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.o8
    public final float f(int i) {
        switch (this.s) {
            case 0:
                float z = z();
                return (i - z) / (y() - z);
            default:
                float f = this.t.m;
                return (f - i) / (f - y());
        }
    }

    @Override // defpackage.o8
    public final boolean q0(View view, float f) {
        int i = this.s;
        SideSheetBehavior sideSheetBehavior = this.t;
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

    @Override // defpackage.o8
    public final int w(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.s) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.o8
    public final int y() {
        int i = this.s;
        SideSheetBehavior sideSheetBehavior = this.t;
        switch (i) {
            case 0:
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                return Math.max(0, (sideSheetBehavior.m - sideSheetBehavior.l) - sideSheetBehavior.o);
        }
    }

    @Override // defpackage.o8
    public final int z() {
        int i = this.s;
        SideSheetBehavior sideSheetBehavior = this.t;
        switch (i) {
            case 0:
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    @Override // defpackage.o8
    public final void z0(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.s) {
            case 0:
                marginLayoutParams.leftMargin = i;
                break;
            default:
                marginLayoutParams.rightMargin = i;
                break;
        }
    }
}
