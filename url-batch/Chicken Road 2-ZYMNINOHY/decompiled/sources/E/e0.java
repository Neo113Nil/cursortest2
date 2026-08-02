package E;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f415b;

    /* renamed from: a, reason: collision with root package name */
    public final a0 f416a;

    static {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            f415b = Z.f399s;
        } else if (i4 >= 30) {
            f415b = X.f398r;
        } else {
            f415b = a0.f401b;
        }
    }

    public e0(WindowInsets windowInsets) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            this.f416a = new Z(this, windowInsets);
            return;
        }
        if (i4 >= 31) {
            this.f416a = new Y(this, windowInsets);
            return;
        }
        if (i4 >= 30) {
            this.f416a = new X(this, windowInsets);
            return;
        }
        if (i4 >= 29) {
            this.f416a = new W(this, windowInsets);
        } else if (i4 >= 28) {
            this.f416a = new V(this, windowInsets);
        } else {
            this.f416a = new U(this, windowInsets);
        }
    }

    public static e0 a(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        e0 e0Var = new e0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = H.f375a;
            e0 a3 = B.a(view);
            a0 a0Var = e0Var.f416a;
            a0Var.o(a3);
            a0Var.d(view.getRootView());
            a0Var.q(view.getWindowSystemUiVisibility());
        }
        return e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            return Objects.equals(this.f416a, ((e0) obj).f416a);
        }
        return false;
    }

    public final int hashCode() {
        a0 a0Var = this.f416a;
        if (a0Var == null) {
            return 0;
        }
        return a0Var.hashCode();
    }

    public e0() {
        this.f416a = new a0(this);
    }
}
