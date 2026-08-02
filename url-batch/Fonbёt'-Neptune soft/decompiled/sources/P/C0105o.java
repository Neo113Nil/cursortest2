package P;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: P.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0105o {

    /* renamed from: a, reason: collision with root package name */
    public final v f940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f941b;

    public C0105o(v vVar, int i2) {
        this.f941b = i2;
        new Rect();
        this.f940a = vVar;
    }

    public static C0105o a(v vVar, int i2) {
        if (i2 == 0) {
            return new C0105o(vVar, 0);
        }
        if (i2 == 1) {
            return new C0105o(vVar, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public final int b(View view) {
        switch (this.f941b) {
            case 0:
                w wVar = (w) view.getLayoutParams();
                this.f940a.getClass();
                return view.getRight() + ((w) view.getLayoutParams()).f955a.right + ((ViewGroup.MarginLayoutParams) wVar).rightMargin;
            default:
                w wVar2 = (w) view.getLayoutParams();
                this.f940a.getClass();
                return view.getBottom() + ((w) view.getLayoutParams()).f955a.bottom + ((ViewGroup.MarginLayoutParams) wVar2).bottomMargin;
        }
    }

    public final int c(View view) {
        switch (this.f941b) {
            case 0:
                w wVar = (w) view.getLayoutParams();
                this.f940a.getClass();
                return (view.getLeft() - ((w) view.getLayoutParams()).f955a.left) - ((ViewGroup.MarginLayoutParams) wVar).leftMargin;
            default:
                w wVar2 = (w) view.getLayoutParams();
                this.f940a.getClass();
                return (view.getTop() - ((w) view.getLayoutParams()).f955a.top) - ((ViewGroup.MarginLayoutParams) wVar2).topMargin;
        }
    }

    public final int d() {
        switch (this.f941b) {
            case 0:
                v vVar = this.f940a;
                return vVar.f953f - vVar.t();
            default:
                v vVar2 = this.f940a;
                return vVar2.f954g - vVar2.r();
        }
    }

    public final int e() {
        switch (this.f941b) {
            case 0:
                return this.f940a.s();
            default:
                return this.f940a.u();
        }
    }
}
