package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b20 b;

    public /* synthetic */ z10(b20 b20Var, int i) {
        this.a = i;
        this.b = b20Var;
    }

    public final int a(View view) {
        int right;
        int i;
        switch (this.a) {
            case 0:
                c20 c20Var = (c20) view.getLayoutParams();
                right = view.getRight() + ((c20) view.getLayoutParams()).b.right;
                i = ((ViewGroup.MarginLayoutParams) c20Var).rightMargin;
                break;
            default:
                c20 c20Var2 = (c20) view.getLayoutParams();
                right = view.getBottom() + ((c20) view.getLayoutParams()).b.bottom;
                i = ((ViewGroup.MarginLayoutParams) c20Var2).bottomMargin;
                break;
        }
        return right + i;
    }

    public final int b(View view) {
        int left;
        int i;
        switch (this.a) {
            case 0:
                c20 c20Var = (c20) view.getLayoutParams();
                left = view.getLeft() - ((c20) view.getLayoutParams()).b.left;
                i = ((ViewGroup.MarginLayoutParams) c20Var).leftMargin;
                break;
            default:
                c20 c20Var2 = (c20) view.getLayoutParams();
                left = view.getTop() - ((c20) view.getLayoutParams()).b.top;
                i = ((ViewGroup.MarginLayoutParams) c20Var2).topMargin;
                break;
        }
        return left - i;
    }

    public final int c() {
        int i;
        int F;
        int i2 = this.a;
        b20 b20Var = this.b;
        switch (i2) {
            case 0:
                i = b20Var.n;
                F = b20Var.F();
                break;
            default:
                i = b20Var.o;
                F = b20Var.D();
                break;
        }
        return i - F;
    }

    public final int d() {
        int i = this.a;
        b20 b20Var = this.b;
        switch (i) {
            case 0:
                return b20Var.E();
            default:
                return b20Var.G();
        }
    }
}
