package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class mw extends hh {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mw(xy xyVar, int i) {
        super(xyVar);
        this.d = i;
    }

    @Override // defpackage.hh
    public final int b(View view) {
        int right;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                yy yyVar = (yy) view.getLayoutParams();
                ((xy) obj).getClass();
                right = view.getRight() + ((yy) view.getLayoutParams()).b.right;
                i = ((ViewGroup.MarginLayoutParams) yyVar).rightMargin;
                break;
            default:
                yy yyVar2 = (yy) view.getLayoutParams();
                ((xy) obj).getClass();
                right = view.getBottom() + ((yy) view.getLayoutParams()).b.bottom;
                i = ((ViewGroup.MarginLayoutParams) yyVar2).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // defpackage.hh
    public final int c(View view) {
        int A;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                yy yyVar = (yy) view.getLayoutParams();
                ((xy) obj).getClass();
                A = xy.A(view) + ((ViewGroup.MarginLayoutParams) yyVar).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) yyVar).rightMargin;
                break;
            default:
                yy yyVar2 = (yy) view.getLayoutParams();
                ((xy) obj).getClass();
                A = xy.z(view) + ((ViewGroup.MarginLayoutParams) yyVar2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) yyVar2).bottomMargin;
                break;
        }
        return A + i;
    }

    @Override // defpackage.hh
    public final int d(View view) {
        int z;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                yy yyVar = (yy) view.getLayoutParams();
                ((xy) obj).getClass();
                z = xy.z(view) + ((ViewGroup.MarginLayoutParams) yyVar).topMargin;
                i = ((ViewGroup.MarginLayoutParams) yyVar).bottomMargin;
                break;
            default:
                yy yyVar2 = (yy) view.getLayoutParams();
                ((xy) obj).getClass();
                z = xy.A(view) + ((ViewGroup.MarginLayoutParams) yyVar2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) yyVar2).rightMargin;
                break;
        }
        return z + i;
    }

    @Override // defpackage.hh
    public final int e(View view) {
        int left;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                yy yyVar = (yy) view.getLayoutParams();
                ((xy) obj).getClass();
                left = view.getLeft() - ((yy) view.getLayoutParams()).b.left;
                i = ((ViewGroup.MarginLayoutParams) yyVar).leftMargin;
                break;
            default:
                yy yyVar2 = (yy) view.getLayoutParams();
                ((xy) obj).getClass();
                left = view.getTop() - ((yy) view.getLayoutParams()).b.top;
                i = ((ViewGroup.MarginLayoutParams) yyVar2).topMargin;
                break;
        }
        return left - i;
    }

    @Override // defpackage.hh
    public final int f() {
        switch (this.d) {
            case 0:
                return ((xy) this.b).n;
            default:
                return ((xy) this.b).o;
        }
    }

    @Override // defpackage.hh
    public final int g() {
        int i;
        int F;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                xy xyVar = (xy) obj;
                i = xyVar.n;
                F = xyVar.F();
                break;
            default:
                xy xyVar2 = (xy) obj;
                i = xyVar2.o;
                F = xyVar2.D();
                break;
        }
        return i - F;
    }

    @Override // defpackage.hh
    public final int h() {
        switch (this.d) {
            case 0:
                return ((xy) this.b).F();
            default:
                return ((xy) this.b).D();
        }
    }

    @Override // defpackage.hh
    public final int i() {
        switch (this.d) {
            case 0:
                return ((xy) this.b).l;
            default:
                return ((xy) this.b).m;
        }
    }

    @Override // defpackage.hh
    public final int j() {
        switch (this.d) {
            case 0:
                return ((xy) this.b).m;
            default:
                return ((xy) this.b).l;
        }
    }

    @Override // defpackage.hh
    public final int k() {
        switch (this.d) {
            case 0:
                return ((xy) this.b).E();
            default:
                return ((xy) this.b).G();
        }
    }

    @Override // defpackage.hh
    public final int l() {
        int E;
        int F;
        int i = this.d;
        Object obj = this.b;
        switch (i) {
            case 0:
                xy xyVar = (xy) obj;
                E = xyVar.n - xyVar.E();
                F = xyVar.F();
                break;
            default:
                xy xyVar2 = (xy) obj;
                E = xyVar2.o - xyVar2.G();
                F = xyVar2.D();
                break;
        }
        return E - F;
    }

    @Override // defpackage.hh
    public final int m(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((xy) obj2).K(rect, view);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((xy) obj2).K(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // defpackage.hh
    public final int n(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((xy) obj2).K(rect, view);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((xy) obj2).K(rect2, view);
                return rect2.top;
        }
    }

    @Override // defpackage.hh
    public final void o(int i) {
        switch (this.d) {
            case 0:
                ((xy) this.b).O(i);
                break;
            default:
                ((xy) this.b).P(i);
                break;
        }
    }
}
