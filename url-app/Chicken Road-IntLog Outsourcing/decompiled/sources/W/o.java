package W;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final t f3361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3362b;

    public o(t tVar, int i2) {
        this.f3362b = i2;
        new Rect();
        this.f3361a = tVar;
    }

    public static o a(t tVar, int i2) {
        if (i2 == 0) {
            return new o(tVar, 0);
        }
        if (i2 == 1) {
            return new o(tVar, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public final int b(View view) {
        switch (this.f3362b) {
            case 0:
                u uVar = (u) view.getLayoutParams();
                this.f3361a.getClass();
                return view.getRight() + ((u) view.getLayoutParams()).f3374a.right + ((ViewGroup.MarginLayoutParams) uVar).rightMargin;
            default:
                u uVar2 = (u) view.getLayoutParams();
                this.f3361a.getClass();
                return view.getBottom() + ((u) view.getLayoutParams()).f3374a.bottom + ((ViewGroup.MarginLayoutParams) uVar2).bottomMargin;
        }
    }

    public final int c(View view) {
        switch (this.f3362b) {
            case 0:
                u uVar = (u) view.getLayoutParams();
                this.f3361a.getClass();
                return (view.getLeft() - ((u) view.getLayoutParams()).f3374a.left) - ((ViewGroup.MarginLayoutParams) uVar).leftMargin;
            default:
                u uVar2 = (u) view.getLayoutParams();
                this.f3361a.getClass();
                return (view.getTop() - ((u) view.getLayoutParams()).f3374a.top) - ((ViewGroup.MarginLayoutParams) uVar2).topMargin;
        }
    }

    public final int d() {
        switch (this.f3362b) {
            case 0:
                t tVar = this.f3361a;
                return tVar.f3372f - tVar.t();
            default:
                t tVar2 = this.f3361a;
                return tVar2.f3373g - tVar2.r();
        }
    }

    public final int e() {
        switch (this.f3362b) {
            case 0:
                return this.f3361a.s();
            default:
                return this.f3361a.u();
        }
    }
}
