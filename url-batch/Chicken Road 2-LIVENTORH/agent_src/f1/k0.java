package f1;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f1407b;

    public /* synthetic */ k0(m0 m0Var, int i) {
        this.f1406a = i;
        this.f1407b = m0Var;
    }

    public final int a(View view) {
        int right;
        int i;
        switch (this.f1406a) {
            case 0:
                n0 n0Var = (n0) view.getLayoutParams();
                right = view.getRight() + ((n0) view.getLayoutParams()).f1461b.right;
                i = ((ViewGroup.MarginLayoutParams) n0Var).rightMargin;
                break;
            default:
                n0 n0Var2 = (n0) view.getLayoutParams();
                right = view.getBottom() + ((n0) view.getLayoutParams()).f1461b.bottom;
                i = ((ViewGroup.MarginLayoutParams) n0Var2).bottomMargin;
                break;
        }
        return right + i;
    }

    public final int b(View view) {
        int left;
        int i;
        switch (this.f1406a) {
            case 0:
                n0 n0Var = (n0) view.getLayoutParams();
                left = view.getLeft() - ((n0) view.getLayoutParams()).f1461b.left;
                i = ((ViewGroup.MarginLayoutParams) n0Var).leftMargin;
                break;
            default:
                n0 n0Var2 = (n0) view.getLayoutParams();
                left = view.getTop() - ((n0) view.getLayoutParams()).f1461b.top;
                i = ((ViewGroup.MarginLayoutParams) n0Var2).topMargin;
                break;
        }
        return left - i;
    }

    public final int c() {
        int i;
        int F;
        switch (this.f1406a) {
            case 0:
                m0 m0Var = this.f1407b;
                i = m0Var.f1455n;
                F = m0Var.F();
                break;
            default:
                m0 m0Var2 = this.f1407b;
                i = m0Var2.f1456o;
                F = m0Var2.D();
                break;
        }
        return i - F;
    }

    public final int d() {
        switch (this.f1406a) {
            case 0:
                return this.f1407b.E();
            default:
                return this.f1407b.G();
        }
    }
}
