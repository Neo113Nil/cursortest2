package g0;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: g0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2719a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f2720b;

    public /* synthetic */ C0136F(H h, int i) {
        this.f2719a = i;
        this.f2720b = h;
    }

    public final int a(View view) {
        switch (this.f2719a) {
            case 0:
                I i = (I) view.getLayoutParams();
                this.f2720b.getClass();
                return view.getRight() + ((I) view.getLayoutParams()).f2737b.right + ((ViewGroup.MarginLayoutParams) i).rightMargin;
            default:
                I i2 = (I) view.getLayoutParams();
                this.f2720b.getClass();
                return view.getBottom() + ((I) view.getLayoutParams()).f2737b.bottom + ((ViewGroup.MarginLayoutParams) i2).bottomMargin;
        }
    }

    public final int b(View view) {
        switch (this.f2719a) {
            case 0:
                I i = (I) view.getLayoutParams();
                this.f2720b.getClass();
                return (view.getLeft() - ((I) view.getLayoutParams()).f2737b.left) - ((ViewGroup.MarginLayoutParams) i).leftMargin;
            default:
                I i2 = (I) view.getLayoutParams();
                this.f2720b.getClass();
                return (view.getTop() - ((I) view.getLayoutParams()).f2737b.top) - ((ViewGroup.MarginLayoutParams) i2).topMargin;
        }
    }

    public final int c() {
        switch (this.f2719a) {
            case 0:
                H h = this.f2720b;
                return h.f2734n - h.F();
            default:
                H h2 = this.f2720b;
                return h2.f2735o - h2.D();
        }
    }

    public final int d() {
        switch (this.f2719a) {
            case 0:
                return this.f2720b.E();
            default:
                return this.f2720b.G();
        }
    }
}
