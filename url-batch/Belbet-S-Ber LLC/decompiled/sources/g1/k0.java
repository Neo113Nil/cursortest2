package g1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class k0 extends androidx.emoji2.text.g {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(a1 a1Var, int i) {
        super(a1Var);
        this.d = i;
    }

    @Override // androidx.emoji2.text.g
    public final int b(View view) {
        int right;
        int i;
        switch (this.d) {
            case 0:
                b1 b1Var = (b1) view.getLayoutParams();
                ((a1) this.f449b).getClass();
                right = view.getRight() + ((b1) view.getLayoutParams()).f1618b.right;
                i = ((ViewGroup.MarginLayoutParams) b1Var).rightMargin;
                break;
            default:
                b1 b1Var2 = (b1) view.getLayoutParams();
                ((a1) this.f449b).getClass();
                right = view.getBottom() + ((b1) view.getLayoutParams()).f1618b.bottom;
                i = ((ViewGroup.MarginLayoutParams) b1Var2).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // androidx.emoji2.text.g
    public final int c(View view) {
        int A;
        int i;
        switch (this.d) {
            case 0:
                b1 b1Var = (b1) view.getLayoutParams();
                ((a1) this.f449b).getClass();
                A = a1.A(view) + ((ViewGroup.MarginLayoutParams) b1Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) b1Var).rightMargin;
                break;
            default:
                b1 b1Var2 = (b1) view.getLayoutParams();
                ((a1) this.f449b).getClass();
                A = a1.z(view) + ((ViewGroup.MarginLayoutParams) b1Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) b1Var2).bottomMargin;
                break;
        }
        return A + i;
    }

    @Override // androidx.emoji2.text.g
    public final int d(View view) {
        int z4;
        int i;
        switch (this.d) {
            case 0:
                b1 b1Var = (b1) view.getLayoutParams();
                ((a1) this.f449b).getClass();
                z4 = a1.z(view) + ((ViewGroup.MarginLayoutParams) b1Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) b1Var).bottomMargin;
                break;
            default:
                b1 b1Var2 = (b1) view.getLayoutParams();
                ((a1) this.f449b).getClass();
                z4 = a1.A(view) + ((ViewGroup.MarginLayoutParams) b1Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) b1Var2).rightMargin;
                break;
        }
        return z4 + i;
    }

    @Override // androidx.emoji2.text.g
    public final int e(View view) {
        int left;
        int i;
        switch (this.d) {
            case 0:
                b1 b1Var = (b1) view.getLayoutParams();
                ((a1) this.f449b).getClass();
                left = view.getLeft() - ((b1) view.getLayoutParams()).f1618b.left;
                i = ((ViewGroup.MarginLayoutParams) b1Var).leftMargin;
                break;
            default:
                b1 b1Var2 = (b1) view.getLayoutParams();
                ((a1) this.f449b).getClass();
                left = view.getTop() - ((b1) view.getLayoutParams()).f1618b.top;
                i = ((ViewGroup.MarginLayoutParams) b1Var2).topMargin;
                break;
        }
        return left - i;
    }

    @Override // androidx.emoji2.text.g
    public final int f() {
        switch (this.d) {
            case 0:
                return ((a1) this.f449b).f1607n;
            default:
                return ((a1) this.f449b).f1608o;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int g() {
        int i;
        int E;
        switch (this.d) {
            case 0:
                a1 a1Var = (a1) this.f449b;
                i = a1Var.f1607n;
                E = a1Var.E();
                break;
            default:
                a1 a1Var2 = (a1) this.f449b;
                i = a1Var2.f1608o;
                E = a1Var2.C();
                break;
        }
        return i - E;
    }

    @Override // androidx.emoji2.text.g
    public final int h() {
        switch (this.d) {
            case 0:
                return ((a1) this.f449b).E();
            default:
                return ((a1) this.f449b).C();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int i() {
        switch (this.d) {
            case 0:
                return ((a1) this.f449b).f1605l;
            default:
                return ((a1) this.f449b).f1606m;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int j() {
        switch (this.d) {
            case 0:
                return ((a1) this.f449b).f1606m;
            default:
                return ((a1) this.f449b).f1605l;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int k() {
        switch (this.d) {
            case 0:
                return ((a1) this.f449b).D();
            default:
                return ((a1) this.f449b).F();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int l() {
        int D;
        int E;
        switch (this.d) {
            case 0:
                a1 a1Var = (a1) this.f449b;
                D = a1Var.f1607n - a1Var.D();
                E = a1Var.E();
                break;
            default:
                a1 a1Var2 = (a1) this.f449b;
                D = a1Var2.f1608o - a1Var2.F();
                E = a1Var2.C();
                break;
        }
        return D - E;
    }

    @Override // androidx.emoji2.text.g
    public final int m(View view) {
        switch (this.d) {
            case 0:
                a1 a1Var = (a1) this.f449b;
                Rect rect = (Rect) this.f450c;
                a1Var.J(view, rect);
                return rect.right;
            default:
                a1 a1Var2 = (a1) this.f449b;
                Rect rect2 = (Rect) this.f450c;
                a1Var2.J(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int n(View view) {
        switch (this.d) {
            case 0:
                a1 a1Var = (a1) this.f449b;
                Rect rect = (Rect) this.f450c;
                a1Var.J(view, rect);
                return rect.left;
            default:
                a1 a1Var2 = (a1) this.f449b;
                Rect rect2 = (Rect) this.f450c;
                a1Var2.J(view, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.emoji2.text.g
    public final void o(int i) {
        switch (this.d) {
            case 0:
                ((a1) this.f449b).O(i);
                break;
            default:
                ((a1) this.f449b).P(i);
                break;
        }
    }
}
