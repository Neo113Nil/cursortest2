package w4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class t extends u {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8033c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(d0 d0Var, int i) {
        super(d0Var);
        this.f8033c = i;
    }

    @Override // w4.u
    public final int c(View view) {
        int right;
        int i;
        switch (this.f8033c) {
            case 0:
                e0 e0Var = (e0) view.getLayoutParams();
                ((d0) this.f8038a).getClass();
                right = view.getRight() + ((e0) view.getLayoutParams()).f7908a.right;
                i = ((ViewGroup.MarginLayoutParams) e0Var).rightMargin;
                break;
            default:
                e0 e0Var2 = (e0) view.getLayoutParams();
                ((d0) this.f8038a).getClass();
                right = view.getBottom() + ((e0) view.getLayoutParams()).f7908a.bottom;
                i = ((ViewGroup.MarginLayoutParams) e0Var2).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // w4.u
    public final int d(View view) {
        int v7;
        int i;
        switch (this.f8033c) {
            case 0:
                e0 e0Var = (e0) view.getLayoutParams();
                ((d0) this.f8038a).getClass();
                v7 = d0.v(view) + ((ViewGroup.MarginLayoutParams) e0Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) e0Var).rightMargin;
                break;
            default:
                e0 e0Var2 = (e0) view.getLayoutParams();
                ((d0) this.f8038a).getClass();
                v7 = d0.u(view) + ((ViewGroup.MarginLayoutParams) e0Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) e0Var2).bottomMargin;
                break;
        }
        return v7 + i;
    }

    @Override // w4.u
    public final int e(View view) {
        int u7;
        int i;
        switch (this.f8033c) {
            case 0:
                e0 e0Var = (e0) view.getLayoutParams();
                ((d0) this.f8038a).getClass();
                u7 = d0.u(view) + ((ViewGroup.MarginLayoutParams) e0Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) e0Var).bottomMargin;
                break;
            default:
                e0 e0Var2 = (e0) view.getLayoutParams();
                ((d0) this.f8038a).getClass();
                u7 = d0.v(view) + ((ViewGroup.MarginLayoutParams) e0Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) e0Var2).rightMargin;
                break;
        }
        return u7 + i;
    }

    @Override // w4.u
    public final int f(View view) {
        int left;
        int i;
        switch (this.f8033c) {
            case 0:
                e0 e0Var = (e0) view.getLayoutParams();
                ((d0) this.f8038a).getClass();
                left = view.getLeft() - ((e0) view.getLayoutParams()).f7908a.left;
                i = ((ViewGroup.MarginLayoutParams) e0Var).leftMargin;
                break;
            default:
                e0 e0Var2 = (e0) view.getLayoutParams();
                ((d0) this.f8038a).getClass();
                left = view.getTop() - ((e0) view.getLayoutParams()).f7908a.top;
                i = ((ViewGroup.MarginLayoutParams) e0Var2).topMargin;
                break;
        }
        return left - i;
    }

    @Override // w4.u
    public final int g() {
        switch (this.f8033c) {
            case 0:
                return ((d0) this.f8038a).i;
            default:
                return ((d0) this.f8038a).f7907j;
        }
    }

    @Override // w4.u
    public final int h() {
        int i;
        int y7;
        switch (this.f8033c) {
            case 0:
                d0 d0Var = (d0) this.f8038a;
                i = d0Var.i;
                y7 = d0Var.y();
                break;
            default:
                d0 d0Var2 = (d0) this.f8038a;
                i = d0Var2.f7907j;
                y7 = d0Var2.w();
                break;
        }
        return i - y7;
    }

    @Override // w4.u
    public final int i() {
        switch (this.f8033c) {
            case 0:
                return ((d0) this.f8038a).y();
            default:
                return ((d0) this.f8038a).w();
        }
    }

    @Override // w4.u
    public final int j() {
        switch (this.f8033c) {
            case 0:
                return ((d0) this.f8038a).f7905g;
            default:
                return ((d0) this.f8038a).f7906h;
        }
    }

    @Override // w4.u
    public final int k() {
        switch (this.f8033c) {
            case 0:
                return ((d0) this.f8038a).f7906h;
            default:
                return ((d0) this.f8038a).f7905g;
        }
    }

    @Override // w4.u
    public final int m() {
        switch (this.f8033c) {
            case 0:
                return ((d0) this.f8038a).x();
            default:
                return ((d0) this.f8038a).z();
        }
    }

    @Override // w4.u
    public final int o() {
        int x7;
        int y7;
        switch (this.f8033c) {
            case 0:
                d0 d0Var = (d0) this.f8038a;
                x7 = d0Var.i - d0Var.x();
                y7 = d0Var.y();
                break;
            default:
                d0 d0Var2 = (d0) this.f8038a;
                x7 = d0Var2.f7907j - d0Var2.z();
                y7 = d0Var2.w();
                break;
        }
        return x7 - y7;
    }

    @Override // w4.u
    public final int p(View view) {
        switch (this.f8033c) {
            case 0:
                d0 d0Var = (d0) this.f8038a;
                Rect rect = (Rect) this.f8039b;
                d0Var.D(view, rect);
                return rect.right;
            default:
                d0 d0Var2 = (d0) this.f8038a;
                Rect rect2 = (Rect) this.f8039b;
                d0Var2.D(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // w4.u
    public final int q(View view) {
        switch (this.f8033c) {
            case 0:
                d0 d0Var = (d0) this.f8038a;
                Rect rect = (Rect) this.f8039b;
                d0Var.D(view, rect);
                return rect.left;
            default:
                d0 d0Var2 = (d0) this.f8038a;
                Rect rect2 = (Rect) this.f8039b;
                d0Var2.D(view, rect2);
                return rect2.top;
        }
    }

    @Override // w4.u
    public final void r(int i) {
        switch (this.f8033c) {
            case 0:
                ((d0) this.f8038a).H(i);
                break;
            default:
                ((d0) this.f8038a).I(i);
                break;
        }
    }
}
