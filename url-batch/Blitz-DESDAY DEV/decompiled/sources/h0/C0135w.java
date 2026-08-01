package h0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: h0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0135w extends V.g {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0135w(I i, int i2) {
        super(i);
        this.d = i2;
    }

    @Override // V.g
    public final int b(View view) {
        switch (this.d) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                ((I) this.f884b).getClass();
                return view.getRight() + ((J) view.getLayoutParams()).f2392b.right + ((ViewGroup.MarginLayoutParams) j2).rightMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                ((I) this.f884b).getClass();
                return view.getBottom() + ((J) view.getLayoutParams()).f2392b.bottom + ((ViewGroup.MarginLayoutParams) j3).bottomMargin;
        }
    }

    @Override // V.g
    public final int c(View view) {
        switch (this.d) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                ((I) this.f884b).getClass();
                return I.A(view) + ((ViewGroup.MarginLayoutParams) j2).leftMargin + ((ViewGroup.MarginLayoutParams) j2).rightMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                ((I) this.f884b).getClass();
                return I.z(view) + ((ViewGroup.MarginLayoutParams) j3).topMargin + ((ViewGroup.MarginLayoutParams) j3).bottomMargin;
        }
    }

    @Override // V.g
    public final int d(View view) {
        switch (this.d) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                ((I) this.f884b).getClass();
                return I.z(view) + ((ViewGroup.MarginLayoutParams) j2).topMargin + ((ViewGroup.MarginLayoutParams) j2).bottomMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                ((I) this.f884b).getClass();
                return I.A(view) + ((ViewGroup.MarginLayoutParams) j3).leftMargin + ((ViewGroup.MarginLayoutParams) j3).rightMargin;
        }
    }

    @Override // V.g
    public final int e(View view) {
        switch (this.d) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                ((I) this.f884b).getClass();
                return (view.getLeft() - ((J) view.getLayoutParams()).f2392b.left) - ((ViewGroup.MarginLayoutParams) j2).leftMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                ((I) this.f884b).getClass();
                return (view.getTop() - ((J) view.getLayoutParams()).f2392b.top) - ((ViewGroup.MarginLayoutParams) j3).topMargin;
        }
    }

    @Override // V.g
    public final int f() {
        switch (this.d) {
            case 0:
                return ((I) this.f884b).f2389n;
            default:
                return ((I) this.f884b).f2390o;
        }
    }

    @Override // V.g
    public final int g() {
        switch (this.d) {
            case 0:
                I i = (I) this.f884b;
                return i.f2389n - i.F();
            default:
                I i2 = (I) this.f884b;
                return i2.f2390o - i2.D();
        }
    }

    @Override // V.g
    public final int h() {
        switch (this.d) {
            case 0:
                return ((I) this.f884b).F();
            default:
                return ((I) this.f884b).D();
        }
    }

    @Override // V.g
    public final int i() {
        switch (this.d) {
            case 0:
                return ((I) this.f884b).f2387l;
            default:
                return ((I) this.f884b).f2388m;
        }
    }

    @Override // V.g
    public final int j() {
        switch (this.d) {
            case 0:
                return ((I) this.f884b).f2388m;
            default:
                return ((I) this.f884b).f2387l;
        }
    }

    @Override // V.g
    public final int k() {
        switch (this.d) {
            case 0:
                return ((I) this.f884b).E();
            default:
                return ((I) this.f884b).G();
        }
    }

    @Override // V.g
    public final int l() {
        switch (this.d) {
            case 0:
                I i = (I) this.f884b;
                return (i.f2389n - i.E()) - i.F();
            default:
                I i2 = (I) this.f884b;
                return (i2.f2390o - i2.G()) - i2.D();
        }
    }

    @Override // V.g
    public final int n(View view) {
        switch (this.d) {
            case 0:
                I i = (I) this.f884b;
                Rect rect = (Rect) this.f885c;
                i.K(view, rect);
                return rect.right;
            default:
                I i2 = (I) this.f884b;
                Rect rect2 = (Rect) this.f885c;
                i2.K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // V.g
    public final int o(View view) {
        switch (this.d) {
            case 0:
                I i = (I) this.f884b;
                Rect rect = (Rect) this.f885c;
                i.K(view, rect);
                return rect.left;
            default:
                I i2 = (I) this.f884b;
                Rect rect2 = (Rect) this.f885c;
                i2.K(view, rect2);
                return rect2.top;
        }
    }

    @Override // V.g
    public final void p(int i) {
        switch (this.d) {
            case 0:
                ((I) this.f884b).O(i);
                break;
            default:
                ((I) this.f884b).P(i);
                break;
        }
    }
}
