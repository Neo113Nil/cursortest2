package g0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: g0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139x extends U.g {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0139x(J j2, int i) {
        super(j2);
        this.d = i;
    }

    @Override // U.g
    public final int b(View view) {
        switch (this.d) {
            case 0:
                K k2 = (K) view.getLayoutParams();
                ((J) this.f853b).getClass();
                return view.getRight() + ((K) view.getLayoutParams()).f2323b.right + ((ViewGroup.MarginLayoutParams) k2).rightMargin;
            default:
                K k3 = (K) view.getLayoutParams();
                ((J) this.f853b).getClass();
                return view.getBottom() + ((K) view.getLayoutParams()).f2323b.bottom + ((ViewGroup.MarginLayoutParams) k3).bottomMargin;
        }
    }

    @Override // U.g
    public final int c(View view) {
        switch (this.d) {
            case 0:
                K k2 = (K) view.getLayoutParams();
                ((J) this.f853b).getClass();
                return J.A(view) + ((ViewGroup.MarginLayoutParams) k2).leftMargin + ((ViewGroup.MarginLayoutParams) k2).rightMargin;
            default:
                K k3 = (K) view.getLayoutParams();
                ((J) this.f853b).getClass();
                return J.z(view) + ((ViewGroup.MarginLayoutParams) k3).topMargin + ((ViewGroup.MarginLayoutParams) k3).bottomMargin;
        }
    }

    @Override // U.g
    public final int d(View view) {
        switch (this.d) {
            case 0:
                K k2 = (K) view.getLayoutParams();
                ((J) this.f853b).getClass();
                return J.z(view) + ((ViewGroup.MarginLayoutParams) k2).topMargin + ((ViewGroup.MarginLayoutParams) k2).bottomMargin;
            default:
                K k3 = (K) view.getLayoutParams();
                ((J) this.f853b).getClass();
                return J.A(view) + ((ViewGroup.MarginLayoutParams) k3).leftMargin + ((ViewGroup.MarginLayoutParams) k3).rightMargin;
        }
    }

    @Override // U.g
    public final int e(View view) {
        switch (this.d) {
            case 0:
                K k2 = (K) view.getLayoutParams();
                ((J) this.f853b).getClass();
                return (view.getLeft() - ((K) view.getLayoutParams()).f2323b.left) - ((ViewGroup.MarginLayoutParams) k2).leftMargin;
            default:
                K k3 = (K) view.getLayoutParams();
                ((J) this.f853b).getClass();
                return (view.getTop() - ((K) view.getLayoutParams()).f2323b.top) - ((ViewGroup.MarginLayoutParams) k3).topMargin;
        }
    }

    @Override // U.g
    public final int f() {
        switch (this.d) {
            case 0:
                return ((J) this.f853b).f2320n;
            default:
                return ((J) this.f853b).f2321o;
        }
    }

    @Override // U.g
    public final int g() {
        switch (this.d) {
            case 0:
                J j2 = (J) this.f853b;
                return j2.f2320n - j2.F();
            default:
                J j3 = (J) this.f853b;
                return j3.f2321o - j3.D();
        }
    }

    @Override // U.g
    public final int h() {
        switch (this.d) {
            case 0:
                return ((J) this.f853b).F();
            default:
                return ((J) this.f853b).D();
        }
    }

    @Override // U.g
    public final int i() {
        switch (this.d) {
            case 0:
                return ((J) this.f853b).f2318l;
            default:
                return ((J) this.f853b).f2319m;
        }
    }

    @Override // U.g
    public final int j() {
        switch (this.d) {
            case 0:
                return ((J) this.f853b).f2319m;
            default:
                return ((J) this.f853b).f2318l;
        }
    }

    @Override // U.g
    public final int k() {
        switch (this.d) {
            case 0:
                return ((J) this.f853b).E();
            default:
                return ((J) this.f853b).G();
        }
    }

    @Override // U.g
    public final int l() {
        switch (this.d) {
            case 0:
                J j2 = (J) this.f853b;
                return (j2.f2320n - j2.E()) - j2.F();
            default:
                J j3 = (J) this.f853b;
                return (j3.f2321o - j3.G()) - j3.D();
        }
    }

    @Override // U.g
    public final int n(View view) {
        switch (this.d) {
            case 0:
                J j2 = (J) this.f853b;
                Rect rect = (Rect) this.f854c;
                j2.K(view, rect);
                return rect.right;
            default:
                J j3 = (J) this.f853b;
                Rect rect2 = (Rect) this.f854c;
                j3.K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // U.g
    public final int o(View view) {
        switch (this.d) {
            case 0:
                J j2 = (J) this.f853b;
                Rect rect = (Rect) this.f854c;
                j2.K(view, rect);
                return rect.left;
            default:
                J j3 = (J) this.f853b;
                Rect rect2 = (Rect) this.f854c;
                j3.K(view, rect2);
                return rect2.top;
        }
    }

    @Override // U.g
    public final void p(int i) {
        switch (this.d) {
            case 0:
                ((J) this.f853b).O(i);
                break;
            default:
                ((J) this.f853b).P(i);
                break;
        }
    }
}
