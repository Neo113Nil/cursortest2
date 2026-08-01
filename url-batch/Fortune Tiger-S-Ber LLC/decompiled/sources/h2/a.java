package h2;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a extends k3.d {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2009f;
    public final SideSheetBehavior g;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i4) {
        this.f2009f = i4;
        this.g = sideSheetBehavior;
    }

    @Override // k3.d
    public final int G() {
        switch (this.f2009f) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.g;
                return Math.max(0, sideSheetBehavior.f1380n + sideSheetBehavior.f1381o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.g;
                return Math.max(0, (sideSheetBehavior2.f1379m - sideSheetBehavior2.f1378l) - sideSheetBehavior2.f1381o);
        }
    }

    @Override // k3.d
    public final int H() {
        switch (this.f2009f) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.g;
                return (-sideSheetBehavior.f1378l) - sideSheetBehavior.f1381o;
            default:
                return this.g.f1379m;
        }
    }

    @Override // k3.d
    public final int I() {
        switch (this.f2009f) {
            case 0:
                return this.g.f1381o;
            default:
                return this.g.f1379m;
        }
    }

    @Override // k3.d
    public final int J() {
        switch (this.f2009f) {
            case 0:
                return -this.g.f1378l;
            default:
                return G();
        }
    }

    @Override // k3.d
    public final int K(View view) {
        switch (this.f2009f) {
            case 0:
                return view.getRight() + this.g.f1381o;
            default:
                return view.getLeft() - this.g.f1381o;
        }
    }

    @Override // k3.d
    public final int L(CoordinatorLayout coordinatorLayout) {
        switch (this.f2009f) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // k3.d
    public final int M() {
        switch (this.f2009f) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // k3.d
    public final boolean N(float f4) {
        switch (this.f2009f) {
            case 0:
                if (f4 > 0.0f) {
                }
                break;
            default:
                if (f4 < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // k3.d
    public final boolean O(View view) {
        switch (this.f2009f) {
            case 0:
                if (view.getRight() < (G() - H()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (G() + this.g.f1379m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // k3.d
    public final boolean P(float f4, float f5) {
        switch (this.f2009f) {
            case 0:
                if (Math.abs(f4) <= Math.abs(f5) || Math.abs(f4) <= 500) {
                }
                break;
            default:
                if (Math.abs(f4) <= Math.abs(f5) || Math.abs(f4) <= 500) {
                }
                break;
        }
        return false;
    }

    @Override // k3.d
    public final int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f2009f) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // k3.d
    public final float d(int i4) {
        switch (this.f2009f) {
            case 0:
                float H = H();
                return (i4 - H) / (G() - H);
            default:
                float f4 = this.g.f1379m;
                return (f4 - i4) / (f4 - G());
        }
    }

    @Override // k3.d
    public final boolean f0(View view, float f4) {
        switch (this.f2009f) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.g;
                float abs = Math.abs((f4 * sideSheetBehavior.f1377k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.g;
                float abs2 = Math.abs((f4 * sideSheetBehavior2.f1377k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // k3.d
    public final void j0(ViewGroup.MarginLayoutParams marginLayoutParams, int i4, int i5) {
        switch (this.f2009f) {
            case 0:
                if (i4 <= this.g.f1379m) {
                    marginLayoutParams.leftMargin = i5;
                    break;
                }
                break;
            default:
                int i6 = this.g.f1379m;
                if (i4 <= i6) {
                    marginLayoutParams.rightMargin = i6 - i4;
                    break;
                }
                break;
        }
    }
}
