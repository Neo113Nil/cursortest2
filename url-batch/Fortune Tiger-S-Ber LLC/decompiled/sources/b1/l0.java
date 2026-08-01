package b1;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f838b;

    public /* synthetic */ l0(n0 n0Var, int i4) {
        this.f837a = i4;
        this.f838b = n0Var;
    }

    public final int a(View view) {
        int right;
        int i4;
        switch (this.f837a) {
            case 0:
                o0 o0Var = (o0) view.getLayoutParams();
                right = view.getRight() + ((o0) view.getLayoutParams()).f890b.right;
                i4 = ((ViewGroup.MarginLayoutParams) o0Var).rightMargin;
                break;
            default:
                o0 o0Var2 = (o0) view.getLayoutParams();
                right = view.getBottom() + ((o0) view.getLayoutParams()).f890b.bottom;
                i4 = ((ViewGroup.MarginLayoutParams) o0Var2).bottomMargin;
                break;
        }
        return right + i4;
    }

    public final int b(View view) {
        int left;
        int i4;
        switch (this.f837a) {
            case 0:
                o0 o0Var = (o0) view.getLayoutParams();
                left = view.getLeft() - ((o0) view.getLayoutParams()).f890b.left;
                i4 = ((ViewGroup.MarginLayoutParams) o0Var).leftMargin;
                break;
            default:
                o0 o0Var2 = (o0) view.getLayoutParams();
                left = view.getTop() - ((o0) view.getLayoutParams()).f890b.top;
                i4 = ((ViewGroup.MarginLayoutParams) o0Var2).topMargin;
                break;
        }
        return left - i4;
    }

    public final int c() {
        int i4;
        int F;
        switch (this.f837a) {
            case 0:
                n0 n0Var = this.f838b;
                i4 = n0Var.f884n;
                F = n0Var.F();
                break;
            default:
                n0 n0Var2 = this.f838b;
                i4 = n0Var2.f885o;
                F = n0Var2.D();
                break;
        }
        return i4 - F;
    }

    public final int d() {
        switch (this.f837a) {
            case 0:
                return this.f838b.E();
            default:
                return this.f838b.G();
        }
    }
}
