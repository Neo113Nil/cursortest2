package e0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: e0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134w extends T.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2363d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0134w(I i, int i2) {
        super(i);
        this.f2363d = i2;
    }

    @Override // T.g
    public final int b(View view) {
        switch (this.f2363d) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                ((I) this.f785b).getClass();
                return view.getRight() + ((J) view.getLayoutParams()).f2124b.right + ((ViewGroup.MarginLayoutParams) j2).rightMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                ((I) this.f785b).getClass();
                return view.getBottom() + ((J) view.getLayoutParams()).f2124b.bottom + ((ViewGroup.MarginLayoutParams) j3).bottomMargin;
        }
    }

    @Override // T.g
    public final int c(View view) {
        switch (this.f2363d) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                ((I) this.f785b).getClass();
                return I.A(view) + ((ViewGroup.MarginLayoutParams) j2).leftMargin + ((ViewGroup.MarginLayoutParams) j2).rightMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                ((I) this.f785b).getClass();
                return I.z(view) + ((ViewGroup.MarginLayoutParams) j3).topMargin + ((ViewGroup.MarginLayoutParams) j3).bottomMargin;
        }
    }

    @Override // T.g
    public final int d(View view) {
        switch (this.f2363d) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                ((I) this.f785b).getClass();
                return I.z(view) + ((ViewGroup.MarginLayoutParams) j2).topMargin + ((ViewGroup.MarginLayoutParams) j2).bottomMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                ((I) this.f785b).getClass();
                return I.A(view) + ((ViewGroup.MarginLayoutParams) j3).leftMargin + ((ViewGroup.MarginLayoutParams) j3).rightMargin;
        }
    }

    @Override // T.g
    public final int e(View view) {
        switch (this.f2363d) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                ((I) this.f785b).getClass();
                return (view.getLeft() - ((J) view.getLayoutParams()).f2124b.left) - ((ViewGroup.MarginLayoutParams) j2).leftMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                ((I) this.f785b).getClass();
                return (view.getTop() - ((J) view.getLayoutParams()).f2124b.top) - ((ViewGroup.MarginLayoutParams) j3).topMargin;
        }
    }

    @Override // T.g
    public final int f() {
        switch (this.f2363d) {
            case 0:
                return ((I) this.f785b).f2121n;
            default:
                return ((I) this.f785b).f2122o;
        }
    }

    @Override // T.g
    public final int g() {
        switch (this.f2363d) {
            case 0:
                I i = (I) this.f785b;
                return i.f2121n - i.F();
            default:
                I i2 = (I) this.f785b;
                return i2.f2122o - i2.D();
        }
    }

    @Override // T.g
    public final int h() {
        switch (this.f2363d) {
            case 0:
                return ((I) this.f785b).F();
            default:
                return ((I) this.f785b).D();
        }
    }

    @Override // T.g
    public final int i() {
        switch (this.f2363d) {
            case 0:
                return ((I) this.f785b).f2119l;
            default:
                return ((I) this.f785b).f2120m;
        }
    }

    @Override // T.g
    public final int j() {
        switch (this.f2363d) {
            case 0:
                return ((I) this.f785b).f2120m;
            default:
                return ((I) this.f785b).f2119l;
        }
    }

    @Override // T.g
    public final int k() {
        switch (this.f2363d) {
            case 0:
                return ((I) this.f785b).E();
            default:
                return ((I) this.f785b).G();
        }
    }

    @Override // T.g
    public final int l() {
        switch (this.f2363d) {
            case 0:
                I i = (I) this.f785b;
                return (i.f2121n - i.E()) - i.F();
            default:
                I i2 = (I) this.f785b;
                return (i2.f2122o - i2.G()) - i2.D();
        }
    }

    @Override // T.g
    public final int n(View view) {
        switch (this.f2363d) {
            case 0:
                I i = (I) this.f785b;
                Rect rect = (Rect) this.f786c;
                i.K(view, rect);
                return rect.right;
            default:
                I i2 = (I) this.f785b;
                Rect rect2 = (Rect) this.f786c;
                i2.K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // T.g
    public final int o(View view) {
        switch (this.f2363d) {
            case 0:
                I i = (I) this.f785b;
                Rect rect = (Rect) this.f786c;
                i.K(view, rect);
                return rect.left;
            default:
                I i2 = (I) this.f785b;
                Rect rect2 = (Rect) this.f786c;
                i2.K(view, rect2);
                return rect2.top;
        }
    }

    @Override // T.g
    public final void p(int i) {
        switch (this.f2363d) {
            case 0:
                ((I) this.f785b).O(i);
                break;
            default:
                ((I) this.f785b).P(i);
                break;
        }
    }
}
