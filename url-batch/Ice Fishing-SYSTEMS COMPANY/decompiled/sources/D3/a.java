package D3;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bumptech.glide.h;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes2.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f685a;

    /* renamed from: b, reason: collision with root package name */
    public final SideSheetBehavior f686b;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f685a = i;
        this.f686b = sideSheetBehavior;
    }

    @Override // com.bumptech.glide.h
    public final boolean B(View view, float f6) {
        switch (this.f685a) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f686b;
                float abs = Math.abs((f6 * sideSheetBehavior.f36212k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f686b;
                float abs2 = Math.abs((f6 * sideSheetBehavior2.f36212k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // com.bumptech.glide.h
    public final void C(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i4) {
        switch (this.f685a) {
            case 0:
                if (i <= this.f686b.f36214m) {
                    marginLayoutParams.leftMargin = i4;
                    break;
                }
                break;
            default:
                int i9 = this.f686b.f36214m;
                if (i <= i9) {
                    marginLayoutParams.rightMargin = i9 - i;
                    break;
                }
                break;
        }
    }

    @Override // com.bumptech.glide.h
    public final int d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f685a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // com.bumptech.glide.h
    public final float e(int i) {
        switch (this.f685a) {
            case 0:
                float h9 = h();
                return (i - h9) / (g() - h9);
            default:
                float f6 = this.f686b.f36214m;
                return (f6 - i) / (f6 - g());
        }
    }

    @Override // com.bumptech.glide.h
    public final int g() {
        switch (this.f685a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f686b;
                return Math.max(0, sideSheetBehavior.f36215n + sideSheetBehavior.f36216o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f686b;
                return Math.max(0, (sideSheetBehavior2.f36214m - sideSheetBehavior2.f36213l) - sideSheetBehavior2.f36216o);
        }
    }

    @Override // com.bumptech.glide.h
    public final int h() {
        switch (this.f685a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f686b;
                return (-sideSheetBehavior.f36213l) - sideSheetBehavior.f36216o;
            default:
                return this.f686b.f36214m;
        }
    }

    @Override // com.bumptech.glide.h
    public final int i() {
        switch (this.f685a) {
            case 0:
                return this.f686b.f36216o;
            default:
                return this.f686b.f36214m;
        }
    }

    @Override // com.bumptech.glide.h
    public final int j() {
        switch (this.f685a) {
            case 0:
                return -this.f686b.f36213l;
            default:
                return g();
        }
    }

    @Override // com.bumptech.glide.h
    public final int k(View view) {
        switch (this.f685a) {
            case 0:
                return view.getRight() + this.f686b.f36216o;
            default:
                return view.getLeft() - this.f686b.f36216o;
        }
    }

    @Override // com.bumptech.glide.h
    public final int l(CoordinatorLayout coordinatorLayout) {
        switch (this.f685a) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // com.bumptech.glide.h
    public final int m() {
        switch (this.f685a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // com.bumptech.glide.h
    public final boolean r(float f6) {
        switch (this.f685a) {
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

    @Override // com.bumptech.glide.h
    public final boolean t(View view) {
        switch (this.f685a) {
            case 0:
                if (view.getRight() < (g() - h()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (g() + this.f686b.f36214m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // com.bumptech.glide.h
    public final boolean u(float f6, float f9) {
        switch (this.f685a) {
            case 0:
                if (Math.abs(f6) > Math.abs(f9)) {
                    float abs = Math.abs(f6);
                    this.f686b.getClass();
                    if (abs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f6) > Math.abs(f9)) {
                    float abs2 = Math.abs(f6);
                    this.f686b.getClass();
                    if (abs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }
}
