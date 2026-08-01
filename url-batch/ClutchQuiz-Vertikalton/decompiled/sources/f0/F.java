package f0;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2137a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f2138b;

    public /* synthetic */ F(H h, int i) {
        this.f2137a = i;
        this.f2138b = h;
    }

    public final int a(View view) {
        switch (this.f2137a) {
            case 0:
                I i = (I) view.getLayoutParams();
                this.f2138b.getClass();
                return view.getRight() + ((I) view.getLayoutParams()).f2155b.right + ((ViewGroup.MarginLayoutParams) i).rightMargin;
            default:
                I i2 = (I) view.getLayoutParams();
                this.f2138b.getClass();
                return view.getBottom() + ((I) view.getLayoutParams()).f2155b.bottom + ((ViewGroup.MarginLayoutParams) i2).bottomMargin;
        }
    }

    public final int b(View view) {
        switch (this.f2137a) {
            case 0:
                I i = (I) view.getLayoutParams();
                this.f2138b.getClass();
                return (view.getLeft() - ((I) view.getLayoutParams()).f2155b.left) - ((ViewGroup.MarginLayoutParams) i).leftMargin;
            default:
                I i2 = (I) view.getLayoutParams();
                this.f2138b.getClass();
                return (view.getTop() - ((I) view.getLayoutParams()).f2155b.top) - ((ViewGroup.MarginLayoutParams) i2).topMargin;
        }
    }

    public final int c() {
        switch (this.f2137a) {
            case 0:
                H h = this.f2138b;
                return h.f2152n - h.F();
            default:
                H h2 = this.f2138b;
                return h2.f2153o - h2.D();
        }
    }

    public final int d() {
        switch (this.f2137a) {
            case 0:
                return this.f2138b.E();
            default:
                return this.f2138b.G();
        }
    }
}
