package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class cq extends vw {
    public final /* synthetic */ int o;
    public final SideSheetBehavior p;

    public /* synthetic */ cq(SideSheetBehavior sideSheetBehavior, int i) {
        this.o = i;
        this.p = sideSheetBehavior;
    }

    @Override // defpackage.vw
    public final int A() {
        int i = this.o;
        SideSheetBehavior sideSheetBehavior = this.p;
        switch (i) {
            case 0:
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                return Math.max(0, (sideSheetBehavior.m - sideSheetBehavior.l) - sideSheetBehavior.o);
        }
    }

    @Override // defpackage.vw
    public final int C() {
        int i = this.o;
        SideSheetBehavior sideSheetBehavior = this.p;
        switch (i) {
            case 0:
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    @Override // defpackage.vw
    public final int F() {
        int i = this.o;
        SideSheetBehavior sideSheetBehavior = this.p;
        switch (i) {
            case 0:
                return sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    @Override // defpackage.vw
    public final int G() {
        switch (this.o) {
            case 0:
                return -this.p.l;
            default:
                return A();
        }
    }

    @Override // defpackage.vw
    public final int H(View view) {
        int i = this.o;
        SideSheetBehavior sideSheetBehavior = this.p;
        switch (i) {
            case 0:
                return view.getRight() + sideSheetBehavior.o;
            default:
                return view.getLeft() - sideSheetBehavior.o;
        }
    }

    @Override // defpackage.vw
    public final int I(CoordinatorLayout coordinatorLayout) {
        switch (this.o) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // defpackage.vw
    public final int J() {
        switch (this.o) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // defpackage.vw
    public final boolean R(float f) {
        switch (this.o) {
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

    @Override // defpackage.vw
    public final boolean T(View view) {
        switch (this.o) {
            case 0:
                if (view.getRight() < (A() - C()) / 2) {
                    break;
                }
                break;
            default:
                if (view.getLeft() > (A() + this.p.m) / 2) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.vw
    public final boolean U(float f, float f2) {
        switch (this.o) {
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

    @Override // defpackage.vw
    public final int i(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.o) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.vw
    public final float j(int i) {
        switch (this.o) {
            case 0:
                float C = C();
                return (i - C) / (A() - C);
            default:
                float f = this.p.m;
                return (f - i) / (f - A());
        }
    }

    @Override // defpackage.vw
    public final boolean k0(View view, float f) {
        int i = this.o;
        SideSheetBehavior sideSheetBehavior = this.p;
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

    @Override // defpackage.vw
    public final void p0(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.o) {
            case 0:
                marginLayoutParams.leftMargin = i;
                break;
            default:
                marginLayoutParams.rightMargin = i;
                break;
        }
    }

    @Override // defpackage.vw
    public final void q0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3 = this.o;
        SideSheetBehavior sideSheetBehavior = this.p;
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

    @Override // defpackage.vw
    public final int z(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.o) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }
}
