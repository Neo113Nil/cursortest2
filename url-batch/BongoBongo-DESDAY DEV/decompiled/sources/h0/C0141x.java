package h0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: h0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0141x extends V.g {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0141x(J j2, int i) {
        super(j2);
        this.d = i;
    }

    @Override // V.g
    public final int b(View view) {
        switch (this.d) {
            case 0:
                K k2 = (K) view.getLayoutParams();
                ((J) this.f894b).getClass();
                return view.getRight() + ((K) view.getLayoutParams()).f2410b.right + ((ViewGroup.MarginLayoutParams) k2).rightMargin;
            default:
                K k3 = (K) view.getLayoutParams();
                ((J) this.f894b).getClass();
                return view.getBottom() + ((K) view.getLayoutParams()).f2410b.bottom + ((ViewGroup.MarginLayoutParams) k3).bottomMargin;
        }
    }

    @Override // V.g
    public final int c(View view) {
        switch (this.d) {
            case 0:
                K k2 = (K) view.getLayoutParams();
                ((J) this.f894b).getClass();
                return J.A(view) + ((ViewGroup.MarginLayoutParams) k2).leftMargin + ((ViewGroup.MarginLayoutParams) k2).rightMargin;
            default:
                K k3 = (K) view.getLayoutParams();
                ((J) this.f894b).getClass();
                return J.z(view) + ((ViewGroup.MarginLayoutParams) k3).topMargin + ((ViewGroup.MarginLayoutParams) k3).bottomMargin;
        }
    }

    @Override // V.g
    public final int d(View view) {
        switch (this.d) {
            case 0:
                K k2 = (K) view.getLayoutParams();
                ((J) this.f894b).getClass();
                return J.z(view) + ((ViewGroup.MarginLayoutParams) k2).topMargin + ((ViewGroup.MarginLayoutParams) k2).bottomMargin;
            default:
                K k3 = (K) view.getLayoutParams();
                ((J) this.f894b).getClass();
                return J.A(view) + ((ViewGroup.MarginLayoutParams) k3).leftMargin + ((ViewGroup.MarginLayoutParams) k3).rightMargin;
        }
    }

    @Override // V.g
    public final int e(View view) {
        switch (this.d) {
            case 0:
                K k2 = (K) view.getLayoutParams();
                ((J) this.f894b).getClass();
                return (view.getLeft() - ((K) view.getLayoutParams()).f2410b.left) - ((ViewGroup.MarginLayoutParams) k2).leftMargin;
            default:
                K k3 = (K) view.getLayoutParams();
                ((J) this.f894b).getClass();
                return (view.getTop() - ((K) view.getLayoutParams()).f2410b.top) - ((ViewGroup.MarginLayoutParams) k3).topMargin;
        }
    }

    @Override // V.g
    public final int f() {
        switch (this.d) {
            case 0:
                return ((J) this.f894b).f2407n;
            default:
                return ((J) this.f894b).f2408o;
        }
    }

    @Override // V.g
    public final int g() {
        switch (this.d) {
            case 0:
                J j2 = (J) this.f894b;
                return j2.f2407n - j2.F();
            default:
                J j3 = (J) this.f894b;
                return j3.f2408o - j3.D();
        }
    }

    @Override // V.g
    public final int h() {
        switch (this.d) {
            case 0:
                return ((J) this.f894b).F();
            default:
                return ((J) this.f894b).D();
        }
    }

    @Override // V.g
    public final int i() {
        switch (this.d) {
            case 0:
                return ((J) this.f894b).f2405l;
            default:
                return ((J) this.f894b).f2406m;
        }
    }

    @Override // V.g
    public final int j() {
        switch (this.d) {
            case 0:
                return ((J) this.f894b).f2406m;
            default:
                return ((J) this.f894b).f2405l;
        }
    }

    @Override // V.g
    public final int k() {
        switch (this.d) {
            case 0:
                return ((J) this.f894b).E();
            default:
                return ((J) this.f894b).G();
        }
    }

    @Override // V.g
    public final int l() {
        switch (this.d) {
            case 0:
                J j2 = (J) this.f894b;
                return (j2.f2407n - j2.E()) - j2.F();
            default:
                J j3 = (J) this.f894b;
                return (j3.f2408o - j3.G()) - j3.D();
        }
    }

    @Override // V.g
    public final int n(View view) {
        switch (this.d) {
            case 0:
                J j2 = (J) this.f894b;
                Rect rect = (Rect) this.f895c;
                j2.K(view, rect);
                return rect.right;
            default:
                J j3 = (J) this.f894b;
                Rect rect2 = (Rect) this.f895c;
                j3.K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // V.g
    public final int o(View view) {
        switch (this.d) {
            case 0:
                J j2 = (J) this.f894b;
                Rect rect = (Rect) this.f895c;
                j2.K(view, rect);
                return rect.left;
            default:
                J j3 = (J) this.f894b;
                Rect rect2 = (Rect) this.f895c;
                j3.K(view, rect2);
                return rect2.top;
        }
    }

    @Override // V.g
    public final void p(int i) {
        switch (this.d) {
            case 0:
                ((J) this.f894b).O(i);
                break;
            default:
                ((J) this.f894b).P(i);
                break;
        }
    }
}
