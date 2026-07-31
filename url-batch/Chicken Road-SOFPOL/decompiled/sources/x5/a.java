package x5;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import r2.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a extends o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8657a;

    /* renamed from: b, reason: collision with root package name */
    public final SideSheetBehavior f8658b;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f8657a = i;
        this.f8658b = sideSheetBehavior;
    }

    @Override // r2.o
    public final int F() {
        switch (this.f8657a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f8658b;
                return Math.max(0, sideSheetBehavior.f1948n + sideSheetBehavior.f1949o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f8658b;
                return Math.max(0, (sideSheetBehavior2.f1947m - sideSheetBehavior2.f1946l) - sideSheetBehavior2.f1949o);
        }
    }

    @Override // r2.o
    public final int G() {
        switch (this.f8657a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f8658b;
                return (-sideSheetBehavior.f1946l) - sideSheetBehavior.f1949o;
            default:
                return this.f8658b.f1947m;
        }
    }

    @Override // r2.o
    public final int H() {
        switch (this.f8657a) {
            case 0:
                return this.f8658b.f1949o;
            default:
                return this.f8658b.f1947m;
        }
    }

    @Override // r2.o
    public final int I() {
        switch (this.f8657a) {
            case 0:
                return -this.f8658b.f1946l;
            default:
                return F();
        }
    }

    @Override // r2.o
    public final int J(View view) {
        switch (this.f8657a) {
            case 0:
                return view.getRight() + this.f8658b.f1949o;
            default:
                return view.getLeft() - this.f8658b.f1949o;
        }
    }

    @Override // r2.o
    public final int K(CoordinatorLayout coordinatorLayout) {
        switch (this.f8657a) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // r2.o
    public final int O() {
        switch (this.f8657a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // r2.o
    public final boolean T(float f6) {
        switch (this.f8657a) {
            case 0:
                if (f6 > 0.0f) {
                }
                break;
            default:
                if (f6 < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // r2.o
    public final boolean V(View view) {
        switch (this.f8657a) {
            case 0:
                if (view.getRight() < (F() - G()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (F() + this.f8658b.f1947m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // r2.o
    public final boolean W(float f6, float f8) {
        switch (this.f8657a) {
            case 0:
                if (Math.abs(f6) <= Math.abs(f8) || Math.abs(f6) <= 500) {
                }
                break;
            default:
                if (Math.abs(f6) <= Math.abs(f8) || Math.abs(f6) <= 500) {
                }
                break;
        }
        return false;
    }

    @Override // r2.o
    public final int k(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f8657a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // r2.o
    public final float l(int i) {
        switch (this.f8657a) {
            case 0:
                float G = G();
                return (i - G) / (F() - G);
            default:
                float f6 = this.f8658b.f1947m;
                return (f6 - i) / (f6 - F());
        }
    }

    @Override // r2.o
    public final boolean o0(View view, float f6) {
        switch (this.f8657a) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f8658b;
                float abs = Math.abs((f6 * sideSheetBehavior.f1945k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f8658b;
                float abs2 = Math.abs((f6 * sideSheetBehavior2.f1945k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // r2.o
    public final void w0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i8) {
        switch (this.f8657a) {
            case 0:
                if (i <= this.f8658b.f1947m) {
                    marginLayoutParams.leftMargin = i8;
                    break;
                }
                break;
            default:
                int i9 = this.f8658b.f1947m;
                if (i <= i9) {
                    marginLayoutParams.rightMargin = i9 - i;
                    break;
                }
                break;
        }
    }
}
