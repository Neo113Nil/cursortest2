package h0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: h0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0171v extends V.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3130d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0171v(AbstractC0141G abstractC0141G, int i) {
        super(abstractC0141G);
        this.f3130d = i;
    }

    @Override // V.g
    public final int b(View view) {
        switch (this.f3130d) {
            case 0:
                C0142H c0142h = (C0142H) view.getLayoutParams();
                ((AbstractC0141G) this.f1272b).getClass();
                return view.getRight() + ((C0142H) view.getLayoutParams()).f2917b.right + ((ViewGroup.MarginLayoutParams) c0142h).rightMargin;
            default:
                C0142H c0142h2 = (C0142H) view.getLayoutParams();
                ((AbstractC0141G) this.f1272b).getClass();
                return view.getBottom() + ((C0142H) view.getLayoutParams()).f2917b.bottom + ((ViewGroup.MarginLayoutParams) c0142h2).bottomMargin;
        }
    }

    @Override // V.g
    public final int c(View view) {
        switch (this.f3130d) {
            case 0:
                C0142H c0142h = (C0142H) view.getLayoutParams();
                ((AbstractC0141G) this.f1272b).getClass();
                return AbstractC0141G.A(view) + ((ViewGroup.MarginLayoutParams) c0142h).leftMargin + ((ViewGroup.MarginLayoutParams) c0142h).rightMargin;
            default:
                C0142H c0142h2 = (C0142H) view.getLayoutParams();
                ((AbstractC0141G) this.f1272b).getClass();
                return AbstractC0141G.z(view) + ((ViewGroup.MarginLayoutParams) c0142h2).topMargin + ((ViewGroup.MarginLayoutParams) c0142h2).bottomMargin;
        }
    }

    @Override // V.g
    public final int d(View view) {
        switch (this.f3130d) {
            case 0:
                C0142H c0142h = (C0142H) view.getLayoutParams();
                ((AbstractC0141G) this.f1272b).getClass();
                return AbstractC0141G.z(view) + ((ViewGroup.MarginLayoutParams) c0142h).topMargin + ((ViewGroup.MarginLayoutParams) c0142h).bottomMargin;
            default:
                C0142H c0142h2 = (C0142H) view.getLayoutParams();
                ((AbstractC0141G) this.f1272b).getClass();
                return AbstractC0141G.A(view) + ((ViewGroup.MarginLayoutParams) c0142h2).leftMargin + ((ViewGroup.MarginLayoutParams) c0142h2).rightMargin;
        }
    }

    @Override // V.g
    public final int e(View view) {
        switch (this.f3130d) {
            case 0:
                C0142H c0142h = (C0142H) view.getLayoutParams();
                ((AbstractC0141G) this.f1272b).getClass();
                return (view.getLeft() - ((C0142H) view.getLayoutParams()).f2917b.left) - ((ViewGroup.MarginLayoutParams) c0142h).leftMargin;
            default:
                C0142H c0142h2 = (C0142H) view.getLayoutParams();
                ((AbstractC0141G) this.f1272b).getClass();
                return (view.getTop() - ((C0142H) view.getLayoutParams()).f2917b.top) - ((ViewGroup.MarginLayoutParams) c0142h2).topMargin;
        }
    }

    @Override // V.g
    public final int f() {
        switch (this.f3130d) {
            case 0:
                return ((AbstractC0141G) this.f1272b).f2914n;
            default:
                return ((AbstractC0141G) this.f1272b).f2915o;
        }
    }

    @Override // V.g
    public final int g() {
        switch (this.f3130d) {
            case 0:
                AbstractC0141G abstractC0141G = (AbstractC0141G) this.f1272b;
                return abstractC0141G.f2914n - abstractC0141G.F();
            default:
                AbstractC0141G abstractC0141G2 = (AbstractC0141G) this.f1272b;
                return abstractC0141G2.f2915o - abstractC0141G2.D();
        }
    }

    @Override // V.g
    public final int h() {
        switch (this.f3130d) {
            case 0:
                return ((AbstractC0141G) this.f1272b).F();
            default:
                return ((AbstractC0141G) this.f1272b).D();
        }
    }

    @Override // V.g
    public final int i() {
        switch (this.f3130d) {
            case 0:
                return ((AbstractC0141G) this.f1272b).f2912l;
            default:
                return ((AbstractC0141G) this.f1272b).f2913m;
        }
    }

    @Override // V.g
    public final int j() {
        switch (this.f3130d) {
            case 0:
                return ((AbstractC0141G) this.f1272b).f2913m;
            default:
                return ((AbstractC0141G) this.f1272b).f2912l;
        }
    }

    @Override // V.g
    public final int k() {
        switch (this.f3130d) {
            case 0:
                return ((AbstractC0141G) this.f1272b).E();
            default:
                return ((AbstractC0141G) this.f1272b).G();
        }
    }

    @Override // V.g
    public final int l() {
        switch (this.f3130d) {
            case 0:
                AbstractC0141G abstractC0141G = (AbstractC0141G) this.f1272b;
                return (abstractC0141G.f2914n - abstractC0141G.E()) - abstractC0141G.F();
            default:
                AbstractC0141G abstractC0141G2 = (AbstractC0141G) this.f1272b;
                return (abstractC0141G2.f2915o - abstractC0141G2.G()) - abstractC0141G2.D();
        }
    }

    @Override // V.g
    public final int n(View view) {
        switch (this.f3130d) {
            case 0:
                AbstractC0141G abstractC0141G = (AbstractC0141G) this.f1272b;
                Rect rect = (Rect) this.f1273c;
                abstractC0141G.K(view, rect);
                return rect.right;
            default:
                AbstractC0141G abstractC0141G2 = (AbstractC0141G) this.f1272b;
                Rect rect2 = (Rect) this.f1273c;
                abstractC0141G2.K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // V.g
    public final int o(View view) {
        switch (this.f3130d) {
            case 0:
                AbstractC0141G abstractC0141G = (AbstractC0141G) this.f1272b;
                Rect rect = (Rect) this.f1273c;
                abstractC0141G.K(view, rect);
                return rect.left;
            default:
                AbstractC0141G abstractC0141G2 = (AbstractC0141G) this.f1272b;
                Rect rect2 = (Rect) this.f1273c;
                abstractC0141G2.K(view, rect2);
                return rect2.top;
        }
    }

    @Override // V.g
    public final void p(int i) {
        switch (this.f3130d) {
            case 0:
                ((AbstractC0141G) this.f1272b).O(i);
                break;
            default:
                ((AbstractC0141G) this.f1272b).P(i);
                break;
        }
    }
}
