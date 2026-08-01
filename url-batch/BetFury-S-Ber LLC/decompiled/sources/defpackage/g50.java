package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class g50 extends wl {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g50(h80 h80Var, int i) {
        super(h80Var);
        this.d = i;
    }

    @Override // defpackage.wl
    public final int b(View view) {
        int right;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                i80 i80Var = (i80) view.getLayoutParams();
                ((h80) obj).getClass();
                right = view.getRight() + ((i80) view.getLayoutParams()).b.right;
                i = ((ViewGroup.MarginLayoutParams) i80Var).rightMargin;
                break;
            default:
                i80 i80Var2 = (i80) view.getLayoutParams();
                ((h80) obj).getClass();
                right = view.getBottom() + ((i80) view.getLayoutParams()).b.bottom;
                i = ((ViewGroup.MarginLayoutParams) i80Var2).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // defpackage.wl
    public final int c(View view) {
        int A;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                i80 i80Var = (i80) view.getLayoutParams();
                ((h80) obj).getClass();
                A = h80.A(view) + ((ViewGroup.MarginLayoutParams) i80Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) i80Var).rightMargin;
                break;
            default:
                i80 i80Var2 = (i80) view.getLayoutParams();
                ((h80) obj).getClass();
                A = h80.z(view) + ((ViewGroup.MarginLayoutParams) i80Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) i80Var2).bottomMargin;
                break;
        }
        return A + i;
    }

    @Override // defpackage.wl
    public final int d(View view) {
        int z;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                i80 i80Var = (i80) view.getLayoutParams();
                ((h80) obj).getClass();
                z = h80.z(view) + ((ViewGroup.MarginLayoutParams) i80Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) i80Var).bottomMargin;
                break;
            default:
                i80 i80Var2 = (i80) view.getLayoutParams();
                ((h80) obj).getClass();
                z = h80.A(view) + ((ViewGroup.MarginLayoutParams) i80Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) i80Var2).rightMargin;
                break;
        }
        return z + i;
    }

    @Override // defpackage.wl
    public final int e(View view) {
        int left;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                i80 i80Var = (i80) view.getLayoutParams();
                ((h80) obj).getClass();
                left = view.getLeft() - ((i80) view.getLayoutParams()).b.left;
                i = ((ViewGroup.MarginLayoutParams) i80Var).leftMargin;
                break;
            default:
                i80 i80Var2 = (i80) view.getLayoutParams();
                ((h80) obj).getClass();
                left = view.getTop() - ((i80) view.getLayoutParams()).b.top;
                i = ((ViewGroup.MarginLayoutParams) i80Var2).topMargin;
                break;
        }
        return left - i;
    }

    @Override // defpackage.wl
    public final int f() {
        switch (this.d) {
            case 0:
                return ((h80) this.b).n;
            default:
                return ((h80) this.b).o;
        }
    }

    @Override // defpackage.wl
    public final int g() {
        int i;
        int F;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                h80 h80Var = (h80) obj;
                i = h80Var.n;
                F = h80Var.F();
                break;
            default:
                h80 h80Var2 = (h80) obj;
                i = h80Var2.o;
                F = h80Var2.D();
                break;
        }
        return i - F;
    }

    @Override // defpackage.wl
    public final int h() {
        switch (this.d) {
            case 0:
                return ((h80) this.b).F();
            default:
                return ((h80) this.b).D();
        }
    }

    @Override // defpackage.wl
    public final int i() {
        switch (this.d) {
            case 0:
                return ((h80) this.b).l;
            default:
                return ((h80) this.b).m;
        }
    }

    @Override // defpackage.wl
    public final int j() {
        switch (this.d) {
            case 0:
                return ((h80) this.b).m;
            default:
                return ((h80) this.b).l;
        }
    }

    @Override // defpackage.wl
    public final int k() {
        switch (this.d) {
            case 0:
                return ((h80) this.b).E();
            default:
                return ((h80) this.b).G();
        }
    }

    @Override // defpackage.wl
    public final int l() {
        int E;
        int F;
        int i = this.d;
        Object obj = this.b;
        switch (i) {
            case 0:
                h80 h80Var = (h80) obj;
                E = h80Var.n - h80Var.E();
                F = h80Var.F();
                break;
            default:
                h80 h80Var2 = (h80) obj;
                E = h80Var2.o - h80Var2.G();
                F = h80Var2.D();
                break;
        }
        return E - F;
    }

    @Override // defpackage.wl
    public final int m(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((h80) obj2).K(rect, view);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((h80) obj2).K(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // defpackage.wl
    public final int n(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((h80) obj2).K(rect, view);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((h80) obj2).K(rect2, view);
                return rect2.top;
        }
    }

    @Override // defpackage.wl
    public final void o(int i) {
        switch (this.d) {
            case 0:
                ((h80) this.b).O(i);
                break;
            default:
                ((h80) this.b).P(i);
                break;
        }
    }
}
