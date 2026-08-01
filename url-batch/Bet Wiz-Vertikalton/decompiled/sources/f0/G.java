package f0;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2087a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f2088b;

    public /* synthetic */ G(I i, int i2) {
        this.f2087a = i2;
        this.f2088b = i;
    }

    public final int a(View view) {
        switch (this.f2087a) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                this.f2088b.getClass();
                return view.getRight() + ((J) view.getLayoutParams()).f2105b.right + ((ViewGroup.MarginLayoutParams) j2).rightMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                this.f2088b.getClass();
                return view.getBottom() + ((J) view.getLayoutParams()).f2105b.bottom + ((ViewGroup.MarginLayoutParams) j3).bottomMargin;
        }
    }

    public final int b(View view) {
        switch (this.f2087a) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                this.f2088b.getClass();
                return (view.getLeft() - ((J) view.getLayoutParams()).f2105b.left) - ((ViewGroup.MarginLayoutParams) j2).leftMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                this.f2088b.getClass();
                return (view.getTop() - ((J) view.getLayoutParams()).f2105b.top) - ((ViewGroup.MarginLayoutParams) j3).topMargin;
        }
    }

    public final int c() {
        switch (this.f2087a) {
            case 0:
                I i = this.f2088b;
                return i.f2102n - i.F();
            default:
                I i2 = this.f2088b;
                return i2.f2103o - i2.D();
        }
    }

    public final int d() {
        switch (this.f2087a) {
            case 0:
                return this.f2088b.E();
            default:
                return this.f2088b.G();
        }
    }
}
