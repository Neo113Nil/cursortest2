package m2;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a extends h.a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2685k;

    /* renamed from: l, reason: collision with root package name */
    public final SideSheetBehavior f2686l;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f2685k = i;
        this.f2686l = sideSheetBehavior;
    }

    @Override // h.a
    public final int A() {
        switch (this.f2685k) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f2686l;
                return (-sideSheetBehavior.f993l) - sideSheetBehavior.f996o;
            default:
                return this.f2686l.f994m;
        }
    }

    @Override // h.a
    public final int B() {
        switch (this.f2685k) {
            case 0:
                return this.f2686l.f996o;
            default:
                return this.f2686l.f994m;
        }
    }

    @Override // h.a
    public final int C() {
        switch (this.f2685k) {
            case 0:
                return -this.f2686l.f993l;
            default:
                return z();
        }
    }

    @Override // h.a
    public final int D(View view) {
        switch (this.f2685k) {
            case 0:
                return view.getRight() + this.f2686l.f996o;
            default:
                return view.getLeft() - this.f2686l.f996o;
        }
    }

    @Override // h.a
    public final int E(CoordinatorLayout coordinatorLayout) {
        switch (this.f2685k) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // h.a
    public final int F() {
        switch (this.f2685k) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // h.a
    public final boolean O(float f2) {
        switch (this.f2685k) {
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

    @Override // h.a
    public final boolean Q(View view) {
        switch (this.f2685k) {
            case 0:
                if (view.getRight() < (z() - A()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (z() + this.f2686l.f994m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // h.a
    public final boolean R(float f2, float f4) {
        switch (this.f2685k) {
            case 0:
                if (Math.abs(f2) <= Math.abs(f4) || Math.abs(f2) <= 500) {
                }
                break;
            default:
                if (Math.abs(f2) <= Math.abs(f4) || Math.abs(f2) <= 500) {
                }
                break;
        }
        return false;
    }

    @Override // h.a
    public final int f(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f2685k) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // h.a
    public final float g(int i) {
        switch (this.f2685k) {
            case 0:
                float A = A();
                return (i - A) / (z() - A);
            default:
                float f2 = this.f2686l.f994m;
                return (f2 - i) / (f2 - z());
        }
    }

    @Override // h.a
    public final boolean o0(View view, float f2) {
        switch (this.f2685k) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f2686l;
                float abs = Math.abs((f2 * sideSheetBehavior.f992k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f2686l;
                float abs2 = Math.abs((f2 * sideSheetBehavior2.f992k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // h.a
    public final void r0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i4) {
        switch (this.f2685k) {
            case 0:
                if (i <= this.f2686l.f994m) {
                    marginLayoutParams.leftMargin = i4;
                    break;
                }
                break;
            default:
                int i5 = this.f2686l.f994m;
                if (i <= i5) {
                    marginLayoutParams.rightMargin = i5 - i;
                    break;
                }
                break;
        }
    }

    @Override // h.a
    public final int z() {
        switch (this.f2685k) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f2686l;
                return Math.max(0, sideSheetBehavior.f995n + sideSheetBehavior.f996o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f2686l;
                return Math.max(0, (sideSheetBehavior2.f994m - sideSheetBehavior2.f993l) - sideSheetBehavior2.f996o);
        }
    }
}
