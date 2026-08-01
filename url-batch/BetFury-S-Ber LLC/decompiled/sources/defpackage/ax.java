package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ax extends ud0 {
    public final /* synthetic */ int a;
    public final SideSheetBehavior b;

    public /* synthetic */ ax(SideSheetBehavior sideSheetBehavior, int i) {
        this.a = i;
        this.b = sideSheetBehavior;
    }

    @Override // defpackage.ud0
    public final boolean A(View view, float f) {
        int i = this.a;
        SideSheetBehavior sideSheetBehavior = this.b;
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

    @Override // defpackage.ud0
    public final void C(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.a) {
            case 0:
                marginLayoutParams.leftMargin = i;
                break;
            default:
                marginLayoutParams.rightMargin = i;
                break;
        }
    }

    @Override // defpackage.ud0
    public final void D(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3 = this.a;
        SideSheetBehavior sideSheetBehavior = this.b;
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

    @Override // defpackage.ud0
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.ud0
    public final float b(int i) {
        switch (this.a) {
            case 0:
                float k = k();
                return (i - k) / (j() - k);
            default:
                float f = this.b.m;
                return (f - i) / (f - j());
        }
    }

    @Override // defpackage.ud0
    public final int i(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.ud0
    public final int j() {
        int i = this.a;
        SideSheetBehavior sideSheetBehavior = this.b;
        switch (i) {
            case 0:
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                return Math.max(0, (sideSheetBehavior.m - sideSheetBehavior.l) - sideSheetBehavior.o);
        }
    }

    @Override // defpackage.ud0
    public final int k() {
        int i = this.a;
        SideSheetBehavior sideSheetBehavior = this.b;
        switch (i) {
            case 0:
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    @Override // defpackage.ud0
    public final int l() {
        int i = this.a;
        SideSheetBehavior sideSheetBehavior = this.b;
        switch (i) {
            case 0:
                return sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    @Override // defpackage.ud0
    public final int m() {
        switch (this.a) {
            case 0:
                return -this.b.l;
            default:
                return j();
        }
    }

    @Override // defpackage.ud0
    public final int n(View view) {
        int i = this.a;
        SideSheetBehavior sideSheetBehavior = this.b;
        switch (i) {
            case 0:
                return view.getRight() + sideSheetBehavior.o;
            default:
                return view.getLeft() - sideSheetBehavior.o;
        }
    }

    @Override // defpackage.ud0
    public final int o(CoordinatorLayout coordinatorLayout) {
        switch (this.a) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // defpackage.ud0
    public final int p() {
        switch (this.a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // defpackage.ud0
    public final boolean s(float f) {
        switch (this.a) {
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

    @Override // defpackage.ud0
    public final boolean t(View view) {
        switch (this.a) {
            case 0:
                if (view.getRight() < (j() - k()) / 2) {
                    break;
                }
                break;
            default:
                if (view.getLeft() > (j() + this.b.m) / 2) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.ud0
    public final boolean u(float f, float f2) {
        switch (this.a) {
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
}
