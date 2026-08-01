package g0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: g0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0158w extends U.g {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0158w(H h, int i) {
        super(h);
        this.d = i;
    }

    @Override // U.g
    public final int b(View view) {
        switch (this.d) {
            case 0:
                I i = (I) view.getLayoutParams();
                ((H) this.f1086b).getClass();
                return view.getRight() + ((I) view.getLayoutParams()).f2737b.right + ((ViewGroup.MarginLayoutParams) i).rightMargin;
            default:
                I i2 = (I) view.getLayoutParams();
                ((H) this.f1086b).getClass();
                return view.getBottom() + ((I) view.getLayoutParams()).f2737b.bottom + ((ViewGroup.MarginLayoutParams) i2).bottomMargin;
        }
    }

    @Override // U.g
    public final int c(View view) {
        switch (this.d) {
            case 0:
                I i = (I) view.getLayoutParams();
                ((H) this.f1086b).getClass();
                return H.A(view) + ((ViewGroup.MarginLayoutParams) i).leftMargin + ((ViewGroup.MarginLayoutParams) i).rightMargin;
            default:
                I i2 = (I) view.getLayoutParams();
                ((H) this.f1086b).getClass();
                return H.z(view) + ((ViewGroup.MarginLayoutParams) i2).topMargin + ((ViewGroup.MarginLayoutParams) i2).bottomMargin;
        }
    }

    @Override // U.g
    public final int d(View view) {
        switch (this.d) {
            case 0:
                I i = (I) view.getLayoutParams();
                ((H) this.f1086b).getClass();
                return H.z(view) + ((ViewGroup.MarginLayoutParams) i).topMargin + ((ViewGroup.MarginLayoutParams) i).bottomMargin;
            default:
                I i2 = (I) view.getLayoutParams();
                ((H) this.f1086b).getClass();
                return H.A(view) + ((ViewGroup.MarginLayoutParams) i2).leftMargin + ((ViewGroup.MarginLayoutParams) i2).rightMargin;
        }
    }

    @Override // U.g
    public final int e(View view) {
        switch (this.d) {
            case 0:
                I i = (I) view.getLayoutParams();
                ((H) this.f1086b).getClass();
                return (view.getLeft() - ((I) view.getLayoutParams()).f2737b.left) - ((ViewGroup.MarginLayoutParams) i).leftMargin;
            default:
                I i2 = (I) view.getLayoutParams();
                ((H) this.f1086b).getClass();
                return (view.getTop() - ((I) view.getLayoutParams()).f2737b.top) - ((ViewGroup.MarginLayoutParams) i2).topMargin;
        }
    }

    @Override // U.g
    public final int f() {
        switch (this.d) {
            case 0:
                return ((H) this.f1086b).f2734n;
            default:
                return ((H) this.f1086b).f2735o;
        }
    }

    @Override // U.g
    public final int g() {
        switch (this.d) {
            case 0:
                H h = (H) this.f1086b;
                return h.f2734n - h.F();
            default:
                H h2 = (H) this.f1086b;
                return h2.f2735o - h2.D();
        }
    }

    @Override // U.g
    public final int h() {
        switch (this.d) {
            case 0:
                return ((H) this.f1086b).F();
            default:
                return ((H) this.f1086b).D();
        }
    }

    @Override // U.g
    public final int i() {
        switch (this.d) {
            case 0:
                return ((H) this.f1086b).f2732l;
            default:
                return ((H) this.f1086b).f2733m;
        }
    }

    @Override // U.g
    public final int j() {
        switch (this.d) {
            case 0:
                return ((H) this.f1086b).f2733m;
            default:
                return ((H) this.f1086b).f2732l;
        }
    }

    @Override // U.g
    public final int k() {
        switch (this.d) {
            case 0:
                return ((H) this.f1086b).E();
            default:
                return ((H) this.f1086b).G();
        }
    }

    @Override // U.g
    public final int l() {
        switch (this.d) {
            case 0:
                H h = (H) this.f1086b;
                return (h.f2734n - h.E()) - h.F();
            default:
                H h2 = (H) this.f1086b;
                return (h2.f2735o - h2.G()) - h2.D();
        }
    }

    @Override // U.g
    public final int n(View view) {
        switch (this.d) {
            case 0:
                H h = (H) this.f1086b;
                Rect rect = (Rect) this.f1087c;
                h.K(view, rect);
                return rect.right;
            default:
                H h2 = (H) this.f1086b;
                Rect rect2 = (Rect) this.f1087c;
                h2.K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // U.g
    public final int o(View view) {
        switch (this.d) {
            case 0:
                H h = (H) this.f1086b;
                Rect rect = (Rect) this.f1087c;
                h.K(view, rect);
                return rect.left;
            default:
                H h2 = (H) this.f1086b;
                Rect rect2 = (Rect) this.f1087c;
                h2.K(view, rect2);
                return rect2.top;
        }
    }

    @Override // U.g
    public final void p(int i) {
        switch (this.d) {
            case 0:
                ((H) this.f1086b).O(i);
                break;
            default:
                ((H) this.f1086b).P(i);
                break;
        }
    }
}
