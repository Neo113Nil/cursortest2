package f1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class x extends androidx.emoji2.text.g {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(m0 m0Var, int i) {
        super(m0Var);
        this.d = i;
    }

    @Override // androidx.emoji2.text.g
    public final int b(View view) {
        int right;
        int i;
        switch (this.d) {
            case 0:
                n0 n0Var = (n0) view.getLayoutParams();
                ((m0) this.f326b).getClass();
                right = view.getRight() + ((n0) view.getLayoutParams()).f1461b.right;
                i = ((ViewGroup.MarginLayoutParams) n0Var).rightMargin;
                break;
            default:
                n0 n0Var2 = (n0) view.getLayoutParams();
                ((m0) this.f326b).getClass();
                right = view.getBottom() + ((n0) view.getLayoutParams()).f1461b.bottom;
                i = ((ViewGroup.MarginLayoutParams) n0Var2).bottomMargin;
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
                n0 n0Var = (n0) view.getLayoutParams();
                ((m0) this.f326b).getClass();
                A = m0.A(view) + ((ViewGroup.MarginLayoutParams) n0Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) n0Var).rightMargin;
                break;
            default:
                n0 n0Var2 = (n0) view.getLayoutParams();
                ((m0) this.f326b).getClass();
                A = m0.z(view) + ((ViewGroup.MarginLayoutParams) n0Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) n0Var2).bottomMargin;
                break;
        }
        return A + i;
    }

    @Override // androidx.emoji2.text.g
    public final int d(View view) {
        int z3;
        int i;
        switch (this.d) {
            case 0:
                n0 n0Var = (n0) view.getLayoutParams();
                ((m0) this.f326b).getClass();
                z3 = m0.z(view) + ((ViewGroup.MarginLayoutParams) n0Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) n0Var).bottomMargin;
                break;
            default:
                n0 n0Var2 = (n0) view.getLayoutParams();
                ((m0) this.f326b).getClass();
                z3 = m0.A(view) + ((ViewGroup.MarginLayoutParams) n0Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) n0Var2).rightMargin;
                break;
        }
        return z3 + i;
    }

    @Override // androidx.emoji2.text.g
    public final int e(View view) {
        int left;
        int i;
        switch (this.d) {
            case 0:
                n0 n0Var = (n0) view.getLayoutParams();
                ((m0) this.f326b).getClass();
                left = view.getLeft() - ((n0) view.getLayoutParams()).f1461b.left;
                i = ((ViewGroup.MarginLayoutParams) n0Var).leftMargin;
                break;
            default:
                n0 n0Var2 = (n0) view.getLayoutParams();
                ((m0) this.f326b).getClass();
                left = view.getTop() - ((n0) view.getLayoutParams()).f1461b.top;
                i = ((ViewGroup.MarginLayoutParams) n0Var2).topMargin;
                break;
        }
        return left - i;
    }

    @Override // androidx.emoji2.text.g
    public final int f() {
        switch (this.d) {
            case 0:
                return ((m0) this.f326b).f1455n;
            default:
                return ((m0) this.f326b).f1456o;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int g() {
        int i;
        int F;
        switch (this.d) {
            case 0:
                m0 m0Var = (m0) this.f326b;
                i = m0Var.f1455n;
                F = m0Var.F();
                break;
            default:
                m0 m0Var2 = (m0) this.f326b;
                i = m0Var2.f1456o;
                F = m0Var2.D();
                break;
        }
        return i - F;
    }

    @Override // androidx.emoji2.text.g
    public final int h() {
        switch (this.d) {
            case 0:
                return ((m0) this.f326b).F();
            default:
                return ((m0) this.f326b).D();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int i() {
        switch (this.d) {
            case 0:
                return ((m0) this.f326b).f1453l;
            default:
                return ((m0) this.f326b).f1454m;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int j() {
        switch (this.d) {
            case 0:
                return ((m0) this.f326b).f1454m;
            default:
                return ((m0) this.f326b).f1453l;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int k() {
        switch (this.d) {
            case 0:
                return ((m0) this.f326b).E();
            default:
                return ((m0) this.f326b).G();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int l() {
        int E;
        int F;
        switch (this.d) {
            case 0:
                m0 m0Var = (m0) this.f326b;
                E = m0Var.f1455n - m0Var.E();
                F = m0Var.F();
                break;
            default:
                m0 m0Var2 = (m0) this.f326b;
                E = m0Var2.f1456o - m0Var2.G();
                F = m0Var2.D();
                break;
        }
        return E - F;
    }

    @Override // androidx.emoji2.text.g
    public final int m(View view) {
        switch (this.d) {
            case 0:
                m0 m0Var = (m0) this.f326b;
                Rect rect = (Rect) this.f327c;
                m0Var.K(view, rect);
                return rect.right;
            default:
                m0 m0Var2 = (m0) this.f326b;
                Rect rect2 = (Rect) this.f327c;
                m0Var2.K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int n(View view) {
        switch (this.d) {
            case 0:
                m0 m0Var = (m0) this.f326b;
                Rect rect = (Rect) this.f327c;
                m0Var.K(view, rect);
                return rect.left;
            default:
                m0 m0Var2 = (m0) this.f326b;
                Rect rect2 = (Rect) this.f327c;
                m0Var2.K(view, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.emoji2.text.g
    public final void o(int i) {
        switch (this.d) {
            case 0:
                ((m0) this.f326b).O(i);
                break;
            default:
                ((m0) this.f326b).P(i);
                break;
        }
    }
}
