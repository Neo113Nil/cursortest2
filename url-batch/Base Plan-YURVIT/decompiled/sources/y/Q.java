package y;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final O f3130a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            int i2 = N.f3127q;
        } else {
            int i3 = O.f3128b;
        }
    }

    public Q(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f3130a = new N(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f3130a = new M(this, windowInsets);
        } else if (i2 >= 28) {
            this.f3130a = new L(this, windowInsets);
        } else {
            this.f3130a = new J(this, windowInsets);
        }
    }

    public static Q a(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        Q q2 = new Q(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = x.f3160a;
            Q a2 = AbstractC0273q.a(view);
            O o2 = q2.f3130a;
            o2.o(a2);
            o2.d(view.getRootView());
        }
        return q2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Q) {
            return Objects.equals(this.f3130a, ((Q) obj).f3130a);
        }
        return false;
    }

    public final int hashCode() {
        O o2 = this.f3130a;
        if (o2 == null) {
            return 0;
        }
        return o2.hashCode();
    }

    public Q() {
        this.f3130a = new O(this);
    }
}
