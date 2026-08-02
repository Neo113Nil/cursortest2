package E;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final T f270a;

    static {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            W w3 = S.f267s;
        } else if (i3 >= 30) {
            W w4 = P.f266r;
        } else {
            W w5 = T.f268b;
        }
    }

    public W(WindowInsets windowInsets) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            this.f270a = new S(this, windowInsets);
            return;
        }
        if (i3 >= 31) {
            this.f270a = new Q(this, windowInsets);
            return;
        }
        if (i3 >= 30) {
            this.f270a = new P(this, windowInsets);
            return;
        }
        if (i3 >= 29) {
            this.f270a = new O(this, windowInsets);
        } else if (i3 >= 28) {
            this.f270a = new N(this, windowInsets);
        } else {
            this.f270a = new M(this, windowInsets);
        }
    }

    public static W b(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        W w3 = new W(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = A.f243a;
            W a3 = AbstractC0019u.a(view);
            T t3 = w3.f270a;
            t3.p(a3);
            t3.d(view.getRootView());
            t3.r(view.getWindowSystemUiVisibility());
        }
        return w3;
    }

    public final WindowInsets a() {
        T t3 = this.f270a;
        if (t3 instanceof L) {
            return ((L) t3).f258c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        return Objects.equals(this.f270a, ((W) obj).f270a);
    }

    public final int hashCode() {
        T t3 = this.f270a;
        if (t3 == null) {
            return 0;
        }
        return t3.hashCode();
    }

    public W() {
        this.f270a = new T(this);
    }
}
