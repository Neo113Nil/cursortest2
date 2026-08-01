package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class pz extends ij {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pz(b20 b20Var, int i) {
        super(b20Var);
        this.d = i;
    }

    @Override // defpackage.ij
    public final int b(View view) {
        int right;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                c20 c20Var = (c20) view.getLayoutParams();
                ((b20) obj).getClass();
                right = view.getRight() + ((c20) view.getLayoutParams()).b.right;
                i = ((ViewGroup.MarginLayoutParams) c20Var).rightMargin;
                break;
            default:
                c20 c20Var2 = (c20) view.getLayoutParams();
                ((b20) obj).getClass();
                right = view.getBottom() + ((c20) view.getLayoutParams()).b.bottom;
                i = ((ViewGroup.MarginLayoutParams) c20Var2).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // defpackage.ij
    public final int c(View view) {
        int A;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                c20 c20Var = (c20) view.getLayoutParams();
                ((b20) obj).getClass();
                A = b20.A(view) + ((ViewGroup.MarginLayoutParams) c20Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c20Var).rightMargin;
                break;
            default:
                c20 c20Var2 = (c20) view.getLayoutParams();
                ((b20) obj).getClass();
                A = b20.z(view) + ((ViewGroup.MarginLayoutParams) c20Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c20Var2).bottomMargin;
                break;
        }
        return A + i;
    }

    @Override // defpackage.ij
    public final int d(View view) {
        int z;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                c20 c20Var = (c20) view.getLayoutParams();
                ((b20) obj).getClass();
                z = b20.z(view) + ((ViewGroup.MarginLayoutParams) c20Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c20Var).bottomMargin;
                break;
            default:
                c20 c20Var2 = (c20) view.getLayoutParams();
                ((b20) obj).getClass();
                z = b20.A(view) + ((ViewGroup.MarginLayoutParams) c20Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c20Var2).rightMargin;
                break;
        }
        return z + i;
    }

    @Override // defpackage.ij
    public final int e(View view) {
        int left;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                c20 c20Var = (c20) view.getLayoutParams();
                ((b20) obj).getClass();
                left = view.getLeft() - ((c20) view.getLayoutParams()).b.left;
                i = ((ViewGroup.MarginLayoutParams) c20Var).leftMargin;
                break;
            default:
                c20 c20Var2 = (c20) view.getLayoutParams();
                ((b20) obj).getClass();
                left = view.getTop() - ((c20) view.getLayoutParams()).b.top;
                i = ((ViewGroup.MarginLayoutParams) c20Var2).topMargin;
                break;
        }
        return left - i;
    }

    @Override // defpackage.ij
    public final int f() {
        switch (this.d) {
            case 0:
                return ((b20) this.b).n;
            default:
                return ((b20) this.b).o;
        }
    }

    @Override // defpackage.ij
    public final int g() {
        int i;
        int F;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                b20 b20Var = (b20) obj;
                i = b20Var.n;
                F = b20Var.F();
                break;
            default:
                b20 b20Var2 = (b20) obj;
                i = b20Var2.o;
                F = b20Var2.D();
                break;
        }
        return i - F;
    }

    @Override // defpackage.ij
    public final int h() {
        switch (this.d) {
            case 0:
                return ((b20) this.b).F();
            default:
                return ((b20) this.b).D();
        }
    }

    @Override // defpackage.ij
    public final int i() {
        switch (this.d) {
            case 0:
                return ((b20) this.b).l;
            default:
                return ((b20) this.b).m;
        }
    }

    @Override // defpackage.ij
    public final int j() {
        switch (this.d) {
            case 0:
                return ((b20) this.b).m;
            default:
                return ((b20) this.b).l;
        }
    }

    @Override // defpackage.ij
    public final int k() {
        switch (this.d) {
            case 0:
                return ((b20) this.b).E();
            default:
                return ((b20) this.b).G();
        }
    }

    @Override // defpackage.ij
    public final int l() {
        int E;
        int F;
        int i = this.d;
        Object obj = this.b;
        switch (i) {
            case 0:
                b20 b20Var = (b20) obj;
                E = b20Var.n - b20Var.E();
                F = b20Var.F();
                break;
            default:
                b20 b20Var2 = (b20) obj;
                E = b20Var2.o - b20Var2.G();
                F = b20Var2.D();
                break;
        }
        return E - F;
    }

    @Override // defpackage.ij
    public final int m(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((b20) obj2).K(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((b20) obj2).K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // defpackage.ij
    public final int n(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((b20) obj2).K(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((b20) obj2).K(view, rect2);
                return rect2.top;
        }
    }

    @Override // defpackage.ij
    public final void o(int i) {
        switch (this.d) {
            case 0:
                ((b20) this.b).O(i);
                break;
            default:
                ((b20) this.b).P(i);
                break;
        }
    }
}
