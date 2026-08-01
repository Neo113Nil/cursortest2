package g1;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f1855b;

    public /* synthetic */ y0(a1 a1Var, int i) {
        this.f1854a = i;
        this.f1855b = a1Var;
    }

    public final int a(View view) {
        int right;
        int i;
        switch (this.f1854a) {
            case 0:
                b1 b1Var = (b1) view.getLayoutParams();
                right = view.getRight() + ((b1) view.getLayoutParams()).f1618b.right;
                i = ((ViewGroup.MarginLayoutParams) b1Var).rightMargin;
                break;
            default:
                b1 b1Var2 = (b1) view.getLayoutParams();
                right = view.getBottom() + ((b1) view.getLayoutParams()).f1618b.bottom;
                i = ((ViewGroup.MarginLayoutParams) b1Var2).bottomMargin;
                break;
        }
        return right + i;
    }

    public final int b(View view) {
        int left;
        int i;
        switch (this.f1854a) {
            case 0:
                b1 b1Var = (b1) view.getLayoutParams();
                left = view.getLeft() - ((b1) view.getLayoutParams()).f1618b.left;
                i = ((ViewGroup.MarginLayoutParams) b1Var).leftMargin;
                break;
            default:
                b1 b1Var2 = (b1) view.getLayoutParams();
                left = view.getTop() - ((b1) view.getLayoutParams()).f1618b.top;
                i = ((ViewGroup.MarginLayoutParams) b1Var2).topMargin;
                break;
        }
        return left - i;
    }

    public final int c() {
        int i;
        int E;
        switch (this.f1854a) {
            case 0:
                a1 a1Var = this.f1855b;
                i = a1Var.f1607n;
                E = a1Var.E();
                break;
            default:
                a1 a1Var2 = this.f1855b;
                i = a1Var2.f1608o;
                E = a1Var2.C();
                break;
        }
        return i - E;
    }

    public final int d() {
        switch (this.f1854a) {
            case 0:
                return this.f1855b.D();
            default:
                return this.f1855b.F();
        }
    }
}
