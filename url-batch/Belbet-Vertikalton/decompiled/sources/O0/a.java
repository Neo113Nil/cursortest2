package O0;

import a.AbstractC0058a;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class a extends AbstractC0058a {
    public final /* synthetic */ int e;

    /* renamed from: f, reason: collision with root package name */
    public final SideSheetBehavior f972f;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.e = i;
        this.f972f = sideSheetBehavior;
    }

    @Override // a.AbstractC0058a
    public final int A() {
        switch (this.e) {
            case 0:
                return -this.f972f.f2460l;
            default:
                return v();
        }
    }

    @Override // a.AbstractC0058a
    public final int B(View view) {
        switch (this.e) {
            case 0:
                return view.getRight() + this.f972f.f2463o;
            default:
                return view.getLeft() - this.f972f.f2463o;
        }
    }

    @Override // a.AbstractC0058a
    public final int C(CoordinatorLayout coordinatorLayout) {
        switch (this.e) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // a.AbstractC0058a
    public final int E() {
        switch (this.e) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // a.AbstractC0058a
    public final boolean H(float f2) {
        switch (this.e) {
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

    @Override // a.AbstractC0058a
    public final boolean I(View view) {
        switch (this.e) {
            case 0:
                if (view.getRight() < (v() - w()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (v() + this.f972f.f2461m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // a.AbstractC0058a
    public final boolean J(float f2, float f3) {
        switch (this.e) {
            case 0:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs = Math.abs(f2);
                    this.f972f.getClass();
                    if (abs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs2 = Math.abs(f2);
                    this.f972f.getClass();
                    if (abs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // a.AbstractC0058a
    public final boolean a0(View view, float f2) {
        switch (this.e) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f972f;
                float abs = Math.abs((f2 * sideSheetBehavior.f2459k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f972f;
                float abs2 = Math.abs((f2 * sideSheetBehavior2.f2459k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // a.AbstractC0058a
    public final int e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.e) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // a.AbstractC0058a
    public final float f(int i) {
        switch (this.e) {
            case 0:
                float w2 = w();
                return (i - w2) / (v() - w2);
            default:
                float f2 = this.f972f.f2461m;
                return (f2 - i) / (f2 - v());
        }
    }

    @Override // a.AbstractC0058a
    public final void f0(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.e) {
            case 0:
                marginLayoutParams.leftMargin = i;
                break;
            default:
                marginLayoutParams.rightMargin = i;
                break;
        }
    }

    @Override // a.AbstractC0058a
    public final void g0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.e) {
            case 0:
                if (i <= this.f972f.f2461m) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i3 = this.f972f.f2461m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    break;
                }
                break;
        }
    }

    @Override // a.AbstractC0058a
    public final int u(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.e) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // a.AbstractC0058a
    public final int v() {
        switch (this.e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f972f;
                return Math.max(0, sideSheetBehavior.f2462n + sideSheetBehavior.f2463o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f972f;
                return Math.max(0, (sideSheetBehavior2.f2461m - sideSheetBehavior2.f2460l) - sideSheetBehavior2.f2463o);
        }
    }

    @Override // a.AbstractC0058a
    public final int w() {
        switch (this.e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f972f;
                return (-sideSheetBehavior.f2460l) - sideSheetBehavior.f2463o;
            default:
                return this.f972f.f2461m;
        }
    }

    @Override // a.AbstractC0058a
    public final int z() {
        switch (this.e) {
            case 0:
                return this.f972f.f2463o;
            default:
                return this.f972f.f2461m;
        }
    }
}
