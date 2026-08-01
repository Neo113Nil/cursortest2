package f0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: f0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113w extends T.g {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0113w(I i, int i2) {
        super(i);
        this.d = i2;
    }

    @Override // T.g
    public final int b(View view) {
        switch (this.d) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                ((I) this.f771b).getClass();
                return view.getRight() + ((J) view.getLayoutParams()).f2038b.right + ((ViewGroup.MarginLayoutParams) j2).rightMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                ((I) this.f771b).getClass();
                return view.getBottom() + ((J) view.getLayoutParams()).f2038b.bottom + ((ViewGroup.MarginLayoutParams) j3).bottomMargin;
        }
    }

    @Override // T.g
    public final int c(View view) {
        switch (this.d) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                ((I) this.f771b).getClass();
                return I.A(view) + ((ViewGroup.MarginLayoutParams) j2).leftMargin + ((ViewGroup.MarginLayoutParams) j2).rightMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                ((I) this.f771b).getClass();
                return I.z(view) + ((ViewGroup.MarginLayoutParams) j3).topMargin + ((ViewGroup.MarginLayoutParams) j3).bottomMargin;
        }
    }

    @Override // T.g
    public final int d(View view) {
        switch (this.d) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                ((I) this.f771b).getClass();
                return I.z(view) + ((ViewGroup.MarginLayoutParams) j2).topMargin + ((ViewGroup.MarginLayoutParams) j2).bottomMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                ((I) this.f771b).getClass();
                return I.A(view) + ((ViewGroup.MarginLayoutParams) j3).leftMargin + ((ViewGroup.MarginLayoutParams) j3).rightMargin;
        }
    }

    @Override // T.g
    public final int e(View view) {
        switch (this.d) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                ((I) this.f771b).getClass();
                return (view.getLeft() - ((J) view.getLayoutParams()).f2038b.left) - ((ViewGroup.MarginLayoutParams) j2).leftMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                ((I) this.f771b).getClass();
                return (view.getTop() - ((J) view.getLayoutParams()).f2038b.top) - ((ViewGroup.MarginLayoutParams) j3).topMargin;
        }
    }

    @Override // T.g
    public final int f() {
        switch (this.d) {
            case 0:
                return ((I) this.f771b).f2035n;
            default:
                return ((I) this.f771b).f2036o;
        }
    }

    @Override // T.g
    public final int g() {
        switch (this.d) {
            case 0:
                I i = (I) this.f771b;
                return i.f2035n - i.F();
            default:
                I i2 = (I) this.f771b;
                return i2.f2036o - i2.D();
        }
    }

    @Override // T.g
    public final int h() {
        switch (this.d) {
            case 0:
                return ((I) this.f771b).F();
            default:
                return ((I) this.f771b).D();
        }
    }

    @Override // T.g
    public final int i() {
        switch (this.d) {
            case 0:
                return ((I) this.f771b).f2033l;
            default:
                return ((I) this.f771b).f2034m;
        }
    }

    @Override // T.g
    public final int j() {
        switch (this.d) {
            case 0:
                return ((I) this.f771b).f2034m;
            default:
                return ((I) this.f771b).f2033l;
        }
    }

    @Override // T.g
    public final int k() {
        switch (this.d) {
            case 0:
                return ((I) this.f771b).E();
            default:
                return ((I) this.f771b).G();
        }
    }

    @Override // T.g
    public final int l() {
        switch (this.d) {
            case 0:
                I i = (I) this.f771b;
                return (i.f2035n - i.E()) - i.F();
            default:
                I i2 = (I) this.f771b;
                return (i2.f2036o - i2.G()) - i2.D();
        }
    }

    @Override // T.g
    public final int n(View view) {
        switch (this.d) {
            case 0:
                I i = (I) this.f771b;
                Rect rect = (Rect) this.f772c;
                i.K(view, rect);
                return rect.right;
            default:
                I i2 = (I) this.f771b;
                Rect rect2 = (Rect) this.f772c;
                i2.K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // T.g
    public final int o(View view) {
        switch (this.d) {
            case 0:
                I i = (I) this.f771b;
                Rect rect = (Rect) this.f772c;
                i.K(view, rect);
                return rect.left;
            default:
                I i2 = (I) this.f771b;
                Rect rect2 = (Rect) this.f772c;
                i2.K(view, rect2);
                return rect2.top;
        }
    }

    @Override // T.g
    public final void p(int i) {
        switch (this.d) {
            case 0:
                ((I) this.f771b).O(i);
                break;
            default:
                ((I) this.f771b).P(i);
                break;
        }
    }
}
