package g0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: g0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138y extends U.g {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0138y(L l2, int i) {
        super(l2);
        this.d = i;
    }

    @Override // U.g
    public final int b(View view) {
        switch (this.d) {
            case 0:
                M m2 = (M) view.getLayoutParams();
                ((L) this.f844b).getClass();
                return view.getRight() + ((M) view.getLayoutParams()).f2288b.right + ((ViewGroup.MarginLayoutParams) m2).rightMargin;
            default:
                M m3 = (M) view.getLayoutParams();
                ((L) this.f844b).getClass();
                return view.getBottom() + ((M) view.getLayoutParams()).f2288b.bottom + ((ViewGroup.MarginLayoutParams) m3).bottomMargin;
        }
    }

    @Override // U.g
    public final int c(View view) {
        switch (this.d) {
            case 0:
                M m2 = (M) view.getLayoutParams();
                ((L) this.f844b).getClass();
                return L.A(view) + ((ViewGroup.MarginLayoutParams) m2).leftMargin + ((ViewGroup.MarginLayoutParams) m2).rightMargin;
            default:
                M m3 = (M) view.getLayoutParams();
                ((L) this.f844b).getClass();
                return L.z(view) + ((ViewGroup.MarginLayoutParams) m3).topMargin + ((ViewGroup.MarginLayoutParams) m3).bottomMargin;
        }
    }

    @Override // U.g
    public final int d(View view) {
        switch (this.d) {
            case 0:
                M m2 = (M) view.getLayoutParams();
                ((L) this.f844b).getClass();
                return L.z(view) + ((ViewGroup.MarginLayoutParams) m2).topMargin + ((ViewGroup.MarginLayoutParams) m2).bottomMargin;
            default:
                M m3 = (M) view.getLayoutParams();
                ((L) this.f844b).getClass();
                return L.A(view) + ((ViewGroup.MarginLayoutParams) m3).leftMargin + ((ViewGroup.MarginLayoutParams) m3).rightMargin;
        }
    }

    @Override // U.g
    public final int e(View view) {
        switch (this.d) {
            case 0:
                M m2 = (M) view.getLayoutParams();
                ((L) this.f844b).getClass();
                return (view.getLeft() - ((M) view.getLayoutParams()).f2288b.left) - ((ViewGroup.MarginLayoutParams) m2).leftMargin;
            default:
                M m3 = (M) view.getLayoutParams();
                ((L) this.f844b).getClass();
                return (view.getTop() - ((M) view.getLayoutParams()).f2288b.top) - ((ViewGroup.MarginLayoutParams) m3).topMargin;
        }
    }

    @Override // U.g
    public final int f() {
        switch (this.d) {
            case 0:
                return ((L) this.f844b).f2285n;
            default:
                return ((L) this.f844b).f2286o;
        }
    }

    @Override // U.g
    public final int g() {
        switch (this.d) {
            case 0:
                L l2 = (L) this.f844b;
                return l2.f2285n - l2.F();
            default:
                L l3 = (L) this.f844b;
                return l3.f2286o - l3.D();
        }
    }

    @Override // U.g
    public final int h() {
        switch (this.d) {
            case 0:
                return ((L) this.f844b).F();
            default:
                return ((L) this.f844b).D();
        }
    }

    @Override // U.g
    public final int i() {
        switch (this.d) {
            case 0:
                return ((L) this.f844b).f2283l;
            default:
                return ((L) this.f844b).f2284m;
        }
    }

    @Override // U.g
    public final int j() {
        switch (this.d) {
            case 0:
                return ((L) this.f844b).f2284m;
            default:
                return ((L) this.f844b).f2283l;
        }
    }

    @Override // U.g
    public final int k() {
        switch (this.d) {
            case 0:
                return ((L) this.f844b).E();
            default:
                return ((L) this.f844b).G();
        }
    }

    @Override // U.g
    public final int l() {
        switch (this.d) {
            case 0:
                L l2 = (L) this.f844b;
                return (l2.f2285n - l2.E()) - l2.F();
            default:
                L l3 = (L) this.f844b;
                return (l3.f2286o - l3.G()) - l3.D();
        }
    }

    @Override // U.g
    public final int n(View view) {
        switch (this.d) {
            case 0:
                L l2 = (L) this.f844b;
                Rect rect = (Rect) this.f845c;
                l2.K(view, rect);
                return rect.right;
            default:
                L l3 = (L) this.f844b;
                Rect rect2 = (Rect) this.f845c;
                l3.K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // U.g
    public final int o(View view) {
        switch (this.d) {
            case 0:
                L l2 = (L) this.f844b;
                Rect rect = (Rect) this.f845c;
                l2.K(view, rect);
                return rect.left;
            default:
                L l3 = (L) this.f844b;
                Rect rect2 = (Rect) this.f845c;
                l3.K(view, rect2);
                return rect2.top;
        }
    }

    @Override // U.g
    public final void p(int i) {
        switch (this.d) {
            case 0:
                ((L) this.f844b).O(i);
                break;
            default:
                ((L) this.f844b).P(i);
                break;
        }
    }
}
