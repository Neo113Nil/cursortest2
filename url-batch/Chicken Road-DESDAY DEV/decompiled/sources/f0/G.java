package f0;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2020a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f2021b;

    public /* synthetic */ G(I i, int i2) {
        this.f2020a = i2;
        this.f2021b = i;
    }

    public final int a(View view) {
        switch (this.f2020a) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                this.f2021b.getClass();
                return view.getRight() + ((J) view.getLayoutParams()).f2038b.right + ((ViewGroup.MarginLayoutParams) j2).rightMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                this.f2021b.getClass();
                return view.getBottom() + ((J) view.getLayoutParams()).f2038b.bottom + ((ViewGroup.MarginLayoutParams) j3).bottomMargin;
        }
    }

    public final int b(View view) {
        switch (this.f2020a) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                this.f2021b.getClass();
                return (view.getLeft() - ((J) view.getLayoutParams()).f2038b.left) - ((ViewGroup.MarginLayoutParams) j2).leftMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                this.f2021b.getClass();
                return (view.getTop() - ((J) view.getLayoutParams()).f2038b.top) - ((ViewGroup.MarginLayoutParams) j3).topMargin;
        }
    }

    public final int c() {
        switch (this.f2020a) {
            case 0:
                I i = this.f2021b;
                return i.f2035n - i.F();
            default:
                I i2 = this.f2021b;
                return i2.f2036o - i2.D();
        }
    }

    public final int d() {
        switch (this.f2020a) {
            case 0:
                return this.f2021b.E();
            default:
                return this.f2021b.G();
        }
    }
}
