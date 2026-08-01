package f0;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f1955b;

    public /* synthetic */ G(I i, int i2) {
        this.f1954a = i2;
        this.f1955b = i;
    }

    public final int a(View view) {
        switch (this.f1954a) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                this.f1955b.getClass();
                return view.getRight() + ((J) view.getLayoutParams()).f1972b.right + ((ViewGroup.MarginLayoutParams) j2).rightMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                this.f1955b.getClass();
                return view.getBottom() + ((J) view.getLayoutParams()).f1972b.bottom + ((ViewGroup.MarginLayoutParams) j3).bottomMargin;
        }
    }

    public final int b(View view) {
        switch (this.f1954a) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                this.f1955b.getClass();
                return (view.getLeft() - ((J) view.getLayoutParams()).f1972b.left) - ((ViewGroup.MarginLayoutParams) j2).leftMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                this.f1955b.getClass();
                return (view.getTop() - ((J) view.getLayoutParams()).f1972b.top) - ((ViewGroup.MarginLayoutParams) j3).topMargin;
        }
    }

    public final int c() {
        switch (this.f1954a) {
            case 0:
                I i = this.f1955b;
                return i.f1969n - i.F();
            default:
                I i2 = this.f1955b;
                return i2.f1970o - i2.D();
        }
    }

    public final int d() {
        switch (this.f1954a) {
            case 0:
                return this.f1955b.E();
            default:
                return this.f1955b.G();
        }
    }
}
