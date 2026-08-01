package h0;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2391a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f2392b;

    public /* synthetic */ H(J j2, int i) {
        this.f2391a = i;
        this.f2392b = j2;
    }

    public final int a(View view) {
        switch (this.f2391a) {
            case 0:
                K k2 = (K) view.getLayoutParams();
                this.f2392b.getClass();
                return view.getRight() + ((K) view.getLayoutParams()).f2410b.right + ((ViewGroup.MarginLayoutParams) k2).rightMargin;
            default:
                K k3 = (K) view.getLayoutParams();
                this.f2392b.getClass();
                return view.getBottom() + ((K) view.getLayoutParams()).f2410b.bottom + ((ViewGroup.MarginLayoutParams) k3).bottomMargin;
        }
    }

    public final int b(View view) {
        switch (this.f2391a) {
            case 0:
                K k2 = (K) view.getLayoutParams();
                this.f2392b.getClass();
                return (view.getLeft() - ((K) view.getLayoutParams()).f2410b.left) - ((ViewGroup.MarginLayoutParams) k2).leftMargin;
            default:
                K k3 = (K) view.getLayoutParams();
                this.f2392b.getClass();
                return (view.getTop() - ((K) view.getLayoutParams()).f2410b.top) - ((ViewGroup.MarginLayoutParams) k3).topMargin;
        }
    }

    public final int c() {
        switch (this.f2391a) {
            case 0:
                J j2 = this.f2392b;
                return j2.f2407n - j2.F();
            default:
                J j3 = this.f2392b;
                return j3.f2408o - j3.D();
        }
    }

    public final int d() {
        switch (this.f2391a) {
            case 0:
                return this.f2392b.E();
            default:
                return this.f2392b.G();
        }
    }
}
