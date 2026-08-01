package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class f80 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h80 b;

    public /* synthetic */ f80(h80 h80Var, int i) {
        this.a = i;
        this.b = h80Var;
    }

    public final int a(View view) {
        int right;
        int i;
        switch (this.a) {
            case 0:
                i80 i80Var = (i80) view.getLayoutParams();
                right = view.getRight() + ((i80) view.getLayoutParams()).b.right;
                i = ((ViewGroup.MarginLayoutParams) i80Var).rightMargin;
                break;
            default:
                i80 i80Var2 = (i80) view.getLayoutParams();
                right = view.getBottom() + ((i80) view.getLayoutParams()).b.bottom;
                i = ((ViewGroup.MarginLayoutParams) i80Var2).bottomMargin;
                break;
        }
        return right + i;
    }

    public final int b(View view) {
        int left;
        int i;
        switch (this.a) {
            case 0:
                i80 i80Var = (i80) view.getLayoutParams();
                left = view.getLeft() - ((i80) view.getLayoutParams()).b.left;
                i = ((ViewGroup.MarginLayoutParams) i80Var).leftMargin;
                break;
            default:
                i80 i80Var2 = (i80) view.getLayoutParams();
                left = view.getTop() - ((i80) view.getLayoutParams()).b.top;
                i = ((ViewGroup.MarginLayoutParams) i80Var2).topMargin;
                break;
        }
        return left - i;
    }

    public final int c() {
        int i;
        int F;
        int i2 = this.a;
        h80 h80Var = this.b;
        switch (i2) {
            case 0:
                i = h80Var.n;
                F = h80Var.F();
                break;
            default:
                i = h80Var.o;
                F = h80Var.D();
                break;
        }
        return i - F;
    }

    public final int d() {
        int i = this.a;
        h80 h80Var = this.b;
        switch (i) {
            case 0:
                return h80Var.E();
            default:
                return h80Var.G();
        }
    }
}
