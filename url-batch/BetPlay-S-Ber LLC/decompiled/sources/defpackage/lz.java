package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class lz {
    public final /* synthetic */ int a;
    public final /* synthetic */ nz b;

    public /* synthetic */ lz(nz nzVar, int i) {
        this.a = i;
        this.b = nzVar;
    }

    public final int a(View view) {
        int right;
        int i;
        switch (this.a) {
            case 0:
                oz ozVar = (oz) view.getLayoutParams();
                right = view.getRight() + ((oz) view.getLayoutParams()).b.right;
                i = ((ViewGroup.MarginLayoutParams) ozVar).rightMargin;
                break;
            default:
                oz ozVar2 = (oz) view.getLayoutParams();
                right = view.getBottom() + ((oz) view.getLayoutParams()).b.bottom;
                i = ((ViewGroup.MarginLayoutParams) ozVar2).bottomMargin;
                break;
        }
        return right + i;
    }

    public final int b(View view) {
        int left;
        int i;
        switch (this.a) {
            case 0:
                oz ozVar = (oz) view.getLayoutParams();
                left = view.getLeft() - ((oz) view.getLayoutParams()).b.left;
                i = ((ViewGroup.MarginLayoutParams) ozVar).leftMargin;
                break;
            default:
                oz ozVar2 = (oz) view.getLayoutParams();
                left = view.getTop() - ((oz) view.getLayoutParams()).b.top;
                i = ((ViewGroup.MarginLayoutParams) ozVar2).topMargin;
                break;
        }
        return left - i;
    }

    public final int c() {
        int i;
        int F;
        int i2 = this.a;
        nz nzVar = this.b;
        switch (i2) {
            case 0:
                i = nzVar.n;
                F = nzVar.F();
                break;
            default:
                i = nzVar.o;
                F = nzVar.D();
                break;
        }
        return i - F;
    }

    public final int d() {
        int i = this.a;
        nz nzVar = this.b;
        switch (i) {
            case 0:
                return nzVar.E();
            default:
                return nzVar.G();
        }
    }
}
