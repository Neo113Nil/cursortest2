package f0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: f0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0116w extends T.h {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0116w(H h, int i) {
        super(h);
        this.d = i;
    }

    @Override // T.h
    public final int b(View view) {
        switch (this.d) {
            case 0:
                I i = (I) view.getLayoutParams();
                ((H) this.f813b).getClass();
                return view.getRight() + ((I) view.getLayoutParams()).f2155b.right + ((ViewGroup.MarginLayoutParams) i).rightMargin;
            default:
                I i2 = (I) view.getLayoutParams();
                ((H) this.f813b).getClass();
                return view.getBottom() + ((I) view.getLayoutParams()).f2155b.bottom + ((ViewGroup.MarginLayoutParams) i2).bottomMargin;
        }
    }

    @Override // T.h
    public final int c(View view) {
        switch (this.d) {
            case 0:
                I i = (I) view.getLayoutParams();
                ((H) this.f813b).getClass();
                return H.A(view) + ((ViewGroup.MarginLayoutParams) i).leftMargin + ((ViewGroup.MarginLayoutParams) i).rightMargin;
            default:
                I i2 = (I) view.getLayoutParams();
                ((H) this.f813b).getClass();
                return H.z(view) + ((ViewGroup.MarginLayoutParams) i2).topMargin + ((ViewGroup.MarginLayoutParams) i2).bottomMargin;
        }
    }

    @Override // T.h
    public final int d(View view) {
        switch (this.d) {
            case 0:
                I i = (I) view.getLayoutParams();
                ((H) this.f813b).getClass();
                return H.z(view) + ((ViewGroup.MarginLayoutParams) i).topMargin + ((ViewGroup.MarginLayoutParams) i).bottomMargin;
            default:
                I i2 = (I) view.getLayoutParams();
                ((H) this.f813b).getClass();
                return H.A(view) + ((ViewGroup.MarginLayoutParams) i2).leftMargin + ((ViewGroup.MarginLayoutParams) i2).rightMargin;
        }
    }

    @Override // T.h
    public final int e(View view) {
        switch (this.d) {
            case 0:
                I i = (I) view.getLayoutParams();
                ((H) this.f813b).getClass();
                return (view.getLeft() - ((I) view.getLayoutParams()).f2155b.left) - ((ViewGroup.MarginLayoutParams) i).leftMargin;
            default:
                I i2 = (I) view.getLayoutParams();
                ((H) this.f813b).getClass();
                return (view.getTop() - ((I) view.getLayoutParams()).f2155b.top) - ((ViewGroup.MarginLayoutParams) i2).topMargin;
        }
    }

    @Override // T.h
    public final int f() {
        switch (this.d) {
            case 0:
                return ((H) this.f813b).f2152n;
            default:
                return ((H) this.f813b).f2153o;
        }
    }

    @Override // T.h
    public final int g() {
        switch (this.d) {
            case 0:
                H h = (H) this.f813b;
                return h.f2152n - h.F();
            default:
                H h2 = (H) this.f813b;
                return h2.f2153o - h2.D();
        }
    }

    @Override // T.h
    public final int h() {
        switch (this.d) {
            case 0:
                return ((H) this.f813b).F();
            default:
                return ((H) this.f813b).D();
        }
    }

    @Override // T.h
    public final int i() {
        switch (this.d) {
            case 0:
                return ((H) this.f813b).f2150l;
            default:
                return ((H) this.f813b).f2151m;
        }
    }

    @Override // T.h
    public final int j() {
        switch (this.d) {
            case 0:
                return ((H) this.f813b).f2151m;
            default:
                return ((H) this.f813b).f2150l;
        }
    }

    @Override // T.h
    public final int k() {
        switch (this.d) {
            case 0:
                return ((H) this.f813b).E();
            default:
                return ((H) this.f813b).G();
        }
    }

    @Override // T.h
    public final int l() {
        switch (this.d) {
            case 0:
                H h = (H) this.f813b;
                return (h.f2152n - h.E()) - h.F();
            default:
                H h2 = (H) this.f813b;
                return (h2.f2153o - h2.G()) - h2.D();
        }
    }

    @Override // T.h
    public final int n(View view) {
        switch (this.d) {
            case 0:
                H h = (H) this.f813b;
                Rect rect = (Rect) this.f814c;
                h.K(view, rect);
                return rect.right;
            default:
                H h2 = (H) this.f813b;
                Rect rect2 = (Rect) this.f814c;
                h2.K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // T.h
    public final int o(View view) {
        switch (this.d) {
            case 0:
                H h = (H) this.f813b;
                Rect rect = (Rect) this.f814c;
                h.K(view, rect);
                return rect.left;
            default:
                H h2 = (H) this.f813b;
                Rect rect2 = (Rect) this.f814c;
                h2.K(view, rect2);
                return rect2.top;
        }
    }

    @Override // T.h
    public final void p(int i) {
        switch (this.d) {
            case 0:
                ((H) this.f813b).O(i);
                break;
            default:
                ((H) this.f813b).P(i);
                break;
        }
    }
}
