package e0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: e0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0135w extends T.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2367d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0135w(I i, int i2) {
        super(i);
        this.f2367d = i2;
    }

    @Override // T.g
    public final int b(View view) {
        switch (this.f2367d) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                ((I) this.f786b).getClass();
                return view.getRight() + ((J) view.getLayoutParams()).f2128b.right + ((ViewGroup.MarginLayoutParams) j2).rightMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                ((I) this.f786b).getClass();
                return view.getBottom() + ((J) view.getLayoutParams()).f2128b.bottom + ((ViewGroup.MarginLayoutParams) j3).bottomMargin;
        }
    }

    @Override // T.g
    public final int c(View view) {
        switch (this.f2367d) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                ((I) this.f786b).getClass();
                return I.A(view) + ((ViewGroup.MarginLayoutParams) j2).leftMargin + ((ViewGroup.MarginLayoutParams) j2).rightMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                ((I) this.f786b).getClass();
                return I.z(view) + ((ViewGroup.MarginLayoutParams) j3).topMargin + ((ViewGroup.MarginLayoutParams) j3).bottomMargin;
        }
    }

    @Override // T.g
    public final int d(View view) {
        switch (this.f2367d) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                ((I) this.f786b).getClass();
                return I.z(view) + ((ViewGroup.MarginLayoutParams) j2).topMargin + ((ViewGroup.MarginLayoutParams) j2).bottomMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                ((I) this.f786b).getClass();
                return I.A(view) + ((ViewGroup.MarginLayoutParams) j3).leftMargin + ((ViewGroup.MarginLayoutParams) j3).rightMargin;
        }
    }

    @Override // T.g
    public final int e(View view) {
        switch (this.f2367d) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                ((I) this.f786b).getClass();
                return (view.getLeft() - ((J) view.getLayoutParams()).f2128b.left) - ((ViewGroup.MarginLayoutParams) j2).leftMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                ((I) this.f786b).getClass();
                return (view.getTop() - ((J) view.getLayoutParams()).f2128b.top) - ((ViewGroup.MarginLayoutParams) j3).topMargin;
        }
    }

    @Override // T.g
    public final int f() {
        switch (this.f2367d) {
            case 0:
                return ((I) this.f786b).f2125n;
            default:
                return ((I) this.f786b).f2126o;
        }
    }

    @Override // T.g
    public final int g() {
        switch (this.f2367d) {
            case 0:
                I i = (I) this.f786b;
                return i.f2125n - i.F();
            default:
                I i2 = (I) this.f786b;
                return i2.f2126o - i2.D();
        }
    }

    @Override // T.g
    public final int h() {
        switch (this.f2367d) {
            case 0:
                return ((I) this.f786b).F();
            default:
                return ((I) this.f786b).D();
        }
    }

    @Override // T.g
    public final int i() {
        switch (this.f2367d) {
            case 0:
                return ((I) this.f786b).f2123l;
            default:
                return ((I) this.f786b).f2124m;
        }
    }

    @Override // T.g
    public final int j() {
        switch (this.f2367d) {
            case 0:
                return ((I) this.f786b).f2124m;
            default:
                return ((I) this.f786b).f2123l;
        }
    }

    @Override // T.g
    public final int k() {
        switch (this.f2367d) {
            case 0:
                return ((I) this.f786b).E();
            default:
                return ((I) this.f786b).G();
        }
    }

    @Override // T.g
    public final int l() {
        switch (this.f2367d) {
            case 0:
                I i = (I) this.f786b;
                return (i.f2125n - i.E()) - i.F();
            default:
                I i2 = (I) this.f786b;
                return (i2.f2126o - i2.G()) - i2.D();
        }
    }

    @Override // T.g
    public final int n(View view) {
        switch (this.f2367d) {
            case 0:
                I i = (I) this.f786b;
                Rect rect = (Rect) this.f787c;
                i.K(view, rect);
                return rect.right;
            default:
                I i2 = (I) this.f786b;
                Rect rect2 = (Rect) this.f787c;
                i2.K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // T.g
    public final int o(View view) {
        switch (this.f2367d) {
            case 0:
                I i = (I) this.f786b;
                Rect rect = (Rect) this.f787c;
                i.K(view, rect);
                return rect.left;
            default:
                I i2 = (I) this.f786b;
                Rect rect2 = (Rect) this.f787c;
                i2.K(view, rect2);
                return rect2.top;
        }
    }

    @Override // T.g
    public final void p(int i) {
        switch (this.f2367d) {
            case 0:
                ((I) this.f786b).O(i);
                break;
            default:
                ((I) this.f786b).P(i);
                break;
        }
    }
}
