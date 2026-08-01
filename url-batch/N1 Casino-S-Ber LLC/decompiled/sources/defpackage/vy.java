package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class vy {
    public final /* synthetic */ int a;
    public final /* synthetic */ xy b;

    public /* synthetic */ vy(xy xyVar, int i) {
        this.a = i;
        this.b = xyVar;
    }

    public final int a(View view) {
        int right;
        int i;
        switch (this.a) {
            case 0:
                yy yyVar = (yy) view.getLayoutParams();
                right = view.getRight() + ((yy) view.getLayoutParams()).b.right;
                i = ((ViewGroup.MarginLayoutParams) yyVar).rightMargin;
                break;
            default:
                yy yyVar2 = (yy) view.getLayoutParams();
                right = view.getBottom() + ((yy) view.getLayoutParams()).b.bottom;
                i = ((ViewGroup.MarginLayoutParams) yyVar2).bottomMargin;
                break;
        }
        return right + i;
    }

    public final int b(View view) {
        int left;
        int i;
        switch (this.a) {
            case 0:
                yy yyVar = (yy) view.getLayoutParams();
                left = view.getLeft() - ((yy) view.getLayoutParams()).b.left;
                i = ((ViewGroup.MarginLayoutParams) yyVar).leftMargin;
                break;
            default:
                yy yyVar2 = (yy) view.getLayoutParams();
                left = view.getTop() - ((yy) view.getLayoutParams()).b.top;
                i = ((ViewGroup.MarginLayoutParams) yyVar2).topMargin;
                break;
        }
        return left - i;
    }

    public final int c() {
        int i;
        int F;
        int i2 = this.a;
        xy xyVar = this.b;
        switch (i2) {
            case 0:
                i = xyVar.n;
                F = xyVar.F();
                break;
            default:
                i = xyVar.o;
                F = xyVar.D();
                break;
        }
        return i - F;
    }

    public final int d() {
        int i = this.a;
        xy xyVar = this.b;
        switch (i) {
            case 0:
                return xyVar.E();
            default:
                return xyVar.G();
        }
    }
}
