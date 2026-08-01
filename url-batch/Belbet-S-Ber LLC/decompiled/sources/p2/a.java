package p2;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b4.l;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3079b;

    /* renamed from: c, reason: collision with root package name */
    public final SideSheetBehavior f3080c;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f3079b = i;
        this.f3080c = sideSheetBehavior;
    }

    @Override // b4.l
    public final int A() {
        switch (this.f3079b) {
            case 0:
                return this.f3080c.f1188o;
            default:
                return this.f3080c.f1186m;
        }
    }

    @Override // b4.l
    public final int B() {
        switch (this.f3079b) {
            case 0:
                return -this.f3080c.f1185l;
            default:
                return w();
        }
    }

    @Override // b4.l
    public final int C(View view) {
        switch (this.f3079b) {
            case 0:
                return view.getRight() + this.f3080c.f1188o;
            default:
                return view.getLeft() - this.f3080c.f1188o;
        }
    }

    @Override // b4.l
    public final int D(CoordinatorLayout coordinatorLayout) {
        switch (this.f3079b) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // b4.l
    public final int F() {
        switch (this.f3079b) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // b4.l
    public final boolean J(float f5) {
        switch (this.f3079b) {
            case 0:
                if (f5 > 0.0f) {
                }
                break;
            default:
                if (f5 < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // b4.l
    public final boolean N(View view) {
        switch (this.f3079b) {
            case 0:
                if (view.getRight() < (w() - x()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (w() + this.f3080c.f1186m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // b4.l
    public final boolean O(float f5, float f6) {
        switch (this.f3079b) {
            case 0:
                if (Math.abs(f5) <= Math.abs(f6) || Math.abs(f5) <= 500) {
                }
                break;
            default:
                if (Math.abs(f5) <= Math.abs(f6) || Math.abs(f5) <= 500) {
                }
                break;
        }
        return false;
    }

    @Override // b4.l
    public final int d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f3079b) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // b4.l
    public final float e(int i) {
        switch (this.f3079b) {
            case 0:
                float x4 = x();
                return (i - x4) / (w() - x4);
            default:
                float f5 = this.f3080c.f1186m;
                return (f5 - i) / (f5 - w());
        }
    }

    @Override // b4.l
    public final boolean g0(View view, float f5) {
        switch (this.f3079b) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f3080c;
                float abs = Math.abs((f5 * sideSheetBehavior.f1184k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f3080c;
                float abs2 = Math.abs((f5 * sideSheetBehavior2.f1184k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // b4.l
    public final void j0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i4) {
        switch (this.f3079b) {
            case 0:
                if (i <= this.f3080c.f1186m) {
                    marginLayoutParams.leftMargin = i4;
                    break;
                }
                break;
            default:
                int i5 = this.f3080c.f1186m;
                if (i <= i5) {
                    marginLayoutParams.rightMargin = i5 - i;
                    break;
                }
                break;
        }
    }

    @Override // b4.l
    public final int w() {
        switch (this.f3079b) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f3080c;
                return Math.max(0, sideSheetBehavior.f1187n + sideSheetBehavior.f1188o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f3080c;
                return Math.max(0, (sideSheetBehavior2.f1186m - sideSheetBehavior2.f1185l) - sideSheetBehavior2.f1188o);
        }
    }

    @Override // b4.l
    public final int x() {
        switch (this.f3079b) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f3080c;
                return (-sideSheetBehavior.f1185l) - sideSheetBehavior.f1188o;
            default:
                return this.f3080c.f1186m;
        }
    }
}
