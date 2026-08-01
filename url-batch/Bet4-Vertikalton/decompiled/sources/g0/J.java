package g0;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f2271b;

    public /* synthetic */ J(L l2, int i) {
        this.f2270a = i;
        this.f2271b = l2;
    }

    public final int a(View view) {
        switch (this.f2270a) {
            case 0:
                M m2 = (M) view.getLayoutParams();
                this.f2271b.getClass();
                return view.getRight() + ((M) view.getLayoutParams()).f2288b.right + ((ViewGroup.MarginLayoutParams) m2).rightMargin;
            default:
                M m3 = (M) view.getLayoutParams();
                this.f2271b.getClass();
                return view.getBottom() + ((M) view.getLayoutParams()).f2288b.bottom + ((ViewGroup.MarginLayoutParams) m3).bottomMargin;
        }
    }

    public final int b(View view) {
        switch (this.f2270a) {
            case 0:
                M m2 = (M) view.getLayoutParams();
                this.f2271b.getClass();
                return (view.getLeft() - ((M) view.getLayoutParams()).f2288b.left) - ((ViewGroup.MarginLayoutParams) m2).leftMargin;
            default:
                M m3 = (M) view.getLayoutParams();
                this.f2271b.getClass();
                return (view.getTop() - ((M) view.getLayoutParams()).f2288b.top) - ((ViewGroup.MarginLayoutParams) m3).topMargin;
        }
    }

    public final int c() {
        switch (this.f2270a) {
            case 0:
                L l2 = this.f2271b;
                return l2.f2285n - l2.F();
            default:
                L l3 = this.f2271b;
                return l3.f2286o - l3.D();
        }
    }

    public final int d() {
        switch (this.f2270a) {
            case 0:
                return this.f2271b.E();
            default:
                return this.f2271b.G();
        }
    }
}
