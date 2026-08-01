package f0;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f1952b;

    public /* synthetic */ G(I i, int i2) {
        this.f1951a = i2;
        this.f1952b = i;
    }

    public final int a(View view) {
        switch (this.f1951a) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                this.f1952b.getClass();
                return view.getRight() + ((J) view.getLayoutParams()).f1969b.right + ((ViewGroup.MarginLayoutParams) j2).rightMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                this.f1952b.getClass();
                return view.getBottom() + ((J) view.getLayoutParams()).f1969b.bottom + ((ViewGroup.MarginLayoutParams) j3).bottomMargin;
        }
    }

    public final int b(View view) {
        switch (this.f1951a) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                this.f1952b.getClass();
                return (view.getLeft() - ((J) view.getLayoutParams()).f1969b.left) - ((ViewGroup.MarginLayoutParams) j2).leftMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                this.f1952b.getClass();
                return (view.getTop() - ((J) view.getLayoutParams()).f1969b.top) - ((ViewGroup.MarginLayoutParams) j3).topMargin;
        }
    }

    public final int c() {
        switch (this.f1951a) {
            case 0:
                I i = this.f1952b;
                return i.f1966n - i.F();
            default:
                I i2 = this.f1952b;
                return i2.f1967o - i2.D();
        }
    }

    public final int d() {
        switch (this.f1951a) {
            case 0:
                return this.f1952b.E();
            default:
                return this.f1952b.G();
        }
    }
}
