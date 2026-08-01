package h0;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: h0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0141G f2899b;

    public /* synthetic */ C0139E(AbstractC0141G abstractC0141G, int i) {
        this.f2898a = i;
        this.f2899b = abstractC0141G;
    }

    public final int a(View view) {
        switch (this.f2898a) {
            case 0:
                C0142H c0142h = (C0142H) view.getLayoutParams();
                this.f2899b.getClass();
                return view.getRight() + ((C0142H) view.getLayoutParams()).f2917b.right + ((ViewGroup.MarginLayoutParams) c0142h).rightMargin;
            default:
                C0142H c0142h2 = (C0142H) view.getLayoutParams();
                this.f2899b.getClass();
                return view.getBottom() + ((C0142H) view.getLayoutParams()).f2917b.bottom + ((ViewGroup.MarginLayoutParams) c0142h2).bottomMargin;
        }
    }

    public final int b(View view) {
        switch (this.f2898a) {
            case 0:
                C0142H c0142h = (C0142H) view.getLayoutParams();
                this.f2899b.getClass();
                return (view.getLeft() - ((C0142H) view.getLayoutParams()).f2917b.left) - ((ViewGroup.MarginLayoutParams) c0142h).leftMargin;
            default:
                C0142H c0142h2 = (C0142H) view.getLayoutParams();
                this.f2899b.getClass();
                return (view.getTop() - ((C0142H) view.getLayoutParams()).f2917b.top) - ((ViewGroup.MarginLayoutParams) c0142h2).topMargin;
        }
    }

    public final int c() {
        switch (this.f2898a) {
            case 0:
                AbstractC0141G abstractC0141G = this.f2899b;
                return abstractC0141G.f2914n - abstractC0141G.F();
            default:
                AbstractC0141G abstractC0141G2 = this.f2899b;
                return abstractC0141G2.f2915o - abstractC0141G2.D();
        }
    }

    public final int d() {
        switch (this.f2898a) {
            case 0:
                return this.f2899b.E();
            default:
                return this.f2899b.G();
        }
    }
}
