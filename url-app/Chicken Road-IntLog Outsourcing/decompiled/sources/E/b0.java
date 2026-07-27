package E;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Z f601a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            int i2 = Y.f594q;
        } else {
            int i3 = Z.f595b;
        }
    }

    public b0(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f601a = new Y(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f601a = new X(this, windowInsets);
        } else if (i2 >= 28) {
            this.f601a = new W(this, windowInsets);
        } else {
            this.f601a = new V(this, windowInsets);
        }
    }

    public static b0 a(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        b0 b0Var = new b0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = G.f566a;
            b0 a6 = AbstractC0049y.a(view);
            Z z = b0Var.f601a;
            z.o(a6);
            z.d(view.getRootView());
        }
        return b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        return Objects.equals(this.f601a, ((b0) obj).f601a);
    }

    public final int hashCode() {
        Z z = this.f601a;
        if (z == null) {
            return 0;
        }
        return z.hashCode();
    }

    public b0() {
        this.f601a = new Z(this);
    }
}
