package f0;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f2063b;

    public /* synthetic */ G(I i, int i2) {
        this.f2062a = i2;
        this.f2063b = i;
    }

    public final int a(View view) {
        switch (this.f2062a) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                this.f2063b.getClass();
                return view.getRight() + ((J) view.getLayoutParams()).f2080b.right + ((ViewGroup.MarginLayoutParams) j2).rightMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                this.f2063b.getClass();
                return view.getBottom() + ((J) view.getLayoutParams()).f2080b.bottom + ((ViewGroup.MarginLayoutParams) j3).bottomMargin;
        }
    }

    public final int b(View view) {
        switch (this.f2062a) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                this.f2063b.getClass();
                return (view.getLeft() - ((J) view.getLayoutParams()).f2080b.left) - ((ViewGroup.MarginLayoutParams) j2).leftMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                this.f2063b.getClass();
                return (view.getTop() - ((J) view.getLayoutParams()).f2080b.top) - ((ViewGroup.MarginLayoutParams) j3).topMargin;
        }
    }

    public final int c() {
        switch (this.f2062a) {
            case 0:
                I i = this.f2063b;
                return i.f2077n - i.F();
            default:
                I i2 = this.f2063b;
                return i2.f2078o - i2.D();
        }
    }

    public final int d() {
        switch (this.f2062a) {
            case 0:
                return this.f2063b.E();
            default:
                return this.f2063b.G();
        }
    }
}
