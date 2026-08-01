package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class yw extends zg {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yw(nz nzVar, int i) {
        super(nzVar);
        this.d = i;
    }

    @Override // defpackage.zg
    public final int b(View view) {
        int right;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                oz ozVar = (oz) view.getLayoutParams();
                ((nz) obj).getClass();
                right = view.getRight() + ((oz) view.getLayoutParams()).b.right;
                i = ((ViewGroup.MarginLayoutParams) ozVar).rightMargin;
                break;
            default:
                oz ozVar2 = (oz) view.getLayoutParams();
                ((nz) obj).getClass();
                right = view.getBottom() + ((oz) view.getLayoutParams()).b.bottom;
                i = ((ViewGroup.MarginLayoutParams) ozVar2).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // defpackage.zg
    public final int c(View view) {
        int A;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                oz ozVar = (oz) view.getLayoutParams();
                ((nz) obj).getClass();
                A = nz.A(view) + ((ViewGroup.MarginLayoutParams) ozVar).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) ozVar).rightMargin;
                break;
            default:
                oz ozVar2 = (oz) view.getLayoutParams();
                ((nz) obj).getClass();
                A = nz.z(view) + ((ViewGroup.MarginLayoutParams) ozVar2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) ozVar2).bottomMargin;
                break;
        }
        return A + i;
    }

    @Override // defpackage.zg
    public final int d(View view) {
        int z;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                oz ozVar = (oz) view.getLayoutParams();
                ((nz) obj).getClass();
                z = nz.z(view) + ((ViewGroup.MarginLayoutParams) ozVar).topMargin;
                i = ((ViewGroup.MarginLayoutParams) ozVar).bottomMargin;
                break;
            default:
                oz ozVar2 = (oz) view.getLayoutParams();
                ((nz) obj).getClass();
                z = nz.A(view) + ((ViewGroup.MarginLayoutParams) ozVar2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) ozVar2).rightMargin;
                break;
        }
        return z + i;
    }

    @Override // defpackage.zg
    public final int e(View view) {
        int left;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                oz ozVar = (oz) view.getLayoutParams();
                ((nz) obj).getClass();
                left = view.getLeft() - ((oz) view.getLayoutParams()).b.left;
                i = ((ViewGroup.MarginLayoutParams) ozVar).leftMargin;
                break;
            default:
                oz ozVar2 = (oz) view.getLayoutParams();
                ((nz) obj).getClass();
                left = view.getTop() - ((oz) view.getLayoutParams()).b.top;
                i = ((ViewGroup.MarginLayoutParams) ozVar2).topMargin;
                break;
        }
        return left - i;
    }

    @Override // defpackage.zg
    public final int f() {
        switch (this.d) {
            case 0:
                return ((nz) this.b).n;
            default:
                return ((nz) this.b).o;
        }
    }

    @Override // defpackage.zg
    public final int g() {
        int i;
        int F;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                nz nzVar = (nz) obj;
                i = nzVar.n;
                F = nzVar.F();
                break;
            default:
                nz nzVar2 = (nz) obj;
                i = nzVar2.o;
                F = nzVar2.D();
                break;
        }
        return i - F;
    }

    @Override // defpackage.zg
    public final int h() {
        switch (this.d) {
            case 0:
                return ((nz) this.b).F();
            default:
                return ((nz) this.b).D();
        }
    }

    @Override // defpackage.zg
    public final int i() {
        switch (this.d) {
            case 0:
                return ((nz) this.b).l;
            default:
                return ((nz) this.b).m;
        }
    }

    @Override // defpackage.zg
    public final int j() {
        switch (this.d) {
            case 0:
                return ((nz) this.b).m;
            default:
                return ((nz) this.b).l;
        }
    }

    @Override // defpackage.zg
    public final int k() {
        switch (this.d) {
            case 0:
                return ((nz) this.b).E();
            default:
                return ((nz) this.b).G();
        }
    }

    @Override // defpackage.zg
    public final int l() {
        int E;
        int F;
        int i = this.d;
        Object obj = this.b;
        switch (i) {
            case 0:
                nz nzVar = (nz) obj;
                E = nzVar.n - nzVar.E();
                F = nzVar.F();
                break;
            default:
                nz nzVar2 = (nz) obj;
                E = nzVar2.o - nzVar2.G();
                F = nzVar2.D();
                break;
        }
        return E - F;
    }

    @Override // defpackage.zg
    public final int m(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((nz) obj2).K(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((nz) obj2).K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // defpackage.zg
    public final int n(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((nz) obj2).K(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((nz) obj2).K(view, rect2);
                return rect2.top;
        }
    }

    @Override // defpackage.zg
    public final void o(int i) {
        switch (this.d) {
            case 0:
                ((nz) this.b).O(i);
                break;
            default:
                ((nz) this.b).P(i);
                break;
        }
    }
}
