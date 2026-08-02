package A;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final S f24a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            int i2 = Q.f21l;
        } else {
            int i3 = S.f22b;
        }
    }

    public T(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f24a = new Q(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f24a = new O(this, windowInsets);
        } else if (i2 >= 28) {
            this.f24a = new N(this, windowInsets);
        } else {
            this.f24a = new M(this, windowInsets);
        }
    }

    public static T a(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        T t2 = new T(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = z.f58a;
            T a2 = Build.VERSION.SDK_INT >= 23 ? AbstractC0017s.a(view) : r.j(view);
            S s2 = t2.f24a;
            s2.k(a2);
            s2.d(view.getRootView());
        }
        return t2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        return Objects.equals(this.f24a, ((T) obj).f24a);
    }

    public final int hashCode() {
        S s2 = this.f24a;
        if (s2 == null) {
            return 0;
        }
        return s2.hashCode();
    }

    public T() {
        this.f24a = new S(this);
    }
}
