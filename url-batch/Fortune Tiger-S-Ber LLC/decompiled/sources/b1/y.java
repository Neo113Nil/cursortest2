package b1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class y extends androidx.emoji2.text.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f954d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(n0 n0Var, int i4) {
        super(n0Var);
        this.f954d = i4;
    }

    @Override // androidx.emoji2.text.g
    public final int b(View view) {
        int right;
        int i4;
        switch (this.f954d) {
            case 0:
                o0 o0Var = (o0) view.getLayoutParams();
                ((n0) this.f337b).getClass();
                right = view.getRight() + ((o0) view.getLayoutParams()).f890b.right;
                i4 = ((ViewGroup.MarginLayoutParams) o0Var).rightMargin;
                break;
            default:
                o0 o0Var2 = (o0) view.getLayoutParams();
                ((n0) this.f337b).getClass();
                right = view.getBottom() + ((o0) view.getLayoutParams()).f890b.bottom;
                i4 = ((ViewGroup.MarginLayoutParams) o0Var2).bottomMargin;
                break;
        }
        return right + i4;
    }

    @Override // androidx.emoji2.text.g
    public final int c(View view) {
        int A;
        int i4;
        switch (this.f954d) {
            case 0:
                o0 o0Var = (o0) view.getLayoutParams();
                ((n0) this.f337b).getClass();
                A = n0.A(view) + ((ViewGroup.MarginLayoutParams) o0Var).leftMargin;
                i4 = ((ViewGroup.MarginLayoutParams) o0Var).rightMargin;
                break;
            default:
                o0 o0Var2 = (o0) view.getLayoutParams();
                ((n0) this.f337b).getClass();
                A = n0.z(view) + ((ViewGroup.MarginLayoutParams) o0Var2).topMargin;
                i4 = ((ViewGroup.MarginLayoutParams) o0Var2).bottomMargin;
                break;
        }
        return A + i4;
    }

    @Override // androidx.emoji2.text.g
    public final int d(View view) {
        int z3;
        int i4;
        switch (this.f954d) {
            case 0:
                o0 o0Var = (o0) view.getLayoutParams();
                ((n0) this.f337b).getClass();
                z3 = n0.z(view) + ((ViewGroup.MarginLayoutParams) o0Var).topMargin;
                i4 = ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin;
                break;
            default:
                o0 o0Var2 = (o0) view.getLayoutParams();
                ((n0) this.f337b).getClass();
                z3 = n0.A(view) + ((ViewGroup.MarginLayoutParams) o0Var2).leftMargin;
                i4 = ((ViewGroup.MarginLayoutParams) o0Var2).rightMargin;
                break;
        }
        return z3 + i4;
    }

    @Override // androidx.emoji2.text.g
    public final int e(View view) {
        int left;
        int i4;
        switch (this.f954d) {
            case 0:
                o0 o0Var = (o0) view.getLayoutParams();
                ((n0) this.f337b).getClass();
                left = view.getLeft() - ((o0) view.getLayoutParams()).f890b.left;
                i4 = ((ViewGroup.MarginLayoutParams) o0Var).leftMargin;
                break;
            default:
                o0 o0Var2 = (o0) view.getLayoutParams();
                ((n0) this.f337b).getClass();
                left = view.getTop() - ((o0) view.getLayoutParams()).f890b.top;
                i4 = ((ViewGroup.MarginLayoutParams) o0Var2).topMargin;
                break;
        }
        return left - i4;
    }

    @Override // androidx.emoji2.text.g
    public final int f() {
        switch (this.f954d) {
            case 0:
                return ((n0) this.f337b).f884n;
            default:
                return ((n0) this.f337b).f885o;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int g() {
        int i4;
        int F;
        switch (this.f954d) {
            case 0:
                n0 n0Var = (n0) this.f337b;
                i4 = n0Var.f884n;
                F = n0Var.F();
                break;
            default:
                n0 n0Var2 = (n0) this.f337b;
                i4 = n0Var2.f885o;
                F = n0Var2.D();
                break;
        }
        return i4 - F;
    }

    @Override // androidx.emoji2.text.g
    public final int h() {
        switch (this.f954d) {
            case 0:
                return ((n0) this.f337b).F();
            default:
                return ((n0) this.f337b).D();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int i() {
        switch (this.f954d) {
            case 0:
                return ((n0) this.f337b).f882l;
            default:
                return ((n0) this.f337b).f883m;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int j() {
        switch (this.f954d) {
            case 0:
                return ((n0) this.f337b).f883m;
            default:
                return ((n0) this.f337b).f882l;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int k() {
        switch (this.f954d) {
            case 0:
                return ((n0) this.f337b).E();
            default:
                return ((n0) this.f337b).G();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int l() {
        int E;
        int F;
        switch (this.f954d) {
            case 0:
                n0 n0Var = (n0) this.f337b;
                E = n0Var.f884n - n0Var.E();
                F = n0Var.F();
                break;
            default:
                n0 n0Var2 = (n0) this.f337b;
                E = n0Var2.f885o - n0Var2.G();
                F = n0Var2.D();
                break;
        }
        return E - F;
    }

    @Override // androidx.emoji2.text.g
    public final int m(View view) {
        switch (this.f954d) {
            case 0:
                n0 n0Var = (n0) this.f337b;
                Rect rect = (Rect) this.c;
                n0Var.K(view, rect);
                return rect.right;
            default:
                n0 n0Var2 = (n0) this.f337b;
                Rect rect2 = (Rect) this.c;
                n0Var2.K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int n(View view) {
        switch (this.f954d) {
            case 0:
                n0 n0Var = (n0) this.f337b;
                Rect rect = (Rect) this.c;
                n0Var.K(view, rect);
                return rect.left;
            default:
                n0 n0Var2 = (n0) this.f337b;
                Rect rect2 = (Rect) this.c;
                n0Var2.K(view, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.emoji2.text.g
    public final void o(int i4) {
        switch (this.f954d) {
            case 0:
                ((n0) this.f337b).O(i4);
                break;
            default:
                ((n0) this.f337b).P(i4);
                break;
        }
    }
}
