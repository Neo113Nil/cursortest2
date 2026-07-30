package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class c83 {
    public static final c83 b;
    public final z73 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = x73.w;
        } else if (i >= 30) {
            b = v73.v;
        } else {
            b = z73.b;
        }
    }

    public c83(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new y73(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.a = new x73(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new w73(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new v73(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new u73(this, windowInsets);
        } else if (i >= 28) {
            this.a = new t73(this, windowInsets);
        } else {
            this.a = new s73(this, windowInsets);
        }
    }

    public static z21 a(z21 z21Var, int i, int i2, int i3, int i4) {
        int max = Math.max(0, z21Var.a - i);
        int max2 = Math.max(0, z21Var.b - i2);
        int max3 = Math.max(0, z21Var.c - i3);
        int max4 = Math.max(0, z21Var.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? z21Var : z21.b(max, max2, max3, max4);
    }

    public static c83 c(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        c83 c83Var = new c83(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = e53.a;
            c83 a = y43.a(view);
            z73 z73Var = c83Var.a;
            z73Var.w(a);
            View rootView = view.getRootView();
            z73Var.d(rootView);
            z73Var.o(rootView);
            z73Var.p();
            z73Var.y(view.getWindowSystemUiVisibility());
        }
        return c83Var;
    }

    public final WindowInsets b() {
        z73 z73Var = this.a;
        if (z73Var instanceof r73) {
            return ((r73) z73Var).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c83) {
            return Objects.equals(this.a, ((c83) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        z73 z73Var = this.a;
        if (z73Var == null) {
            return 0;
        }
        return z73Var.hashCode();
    }

    public c83() {
        this.a = new z73(this);
    }
}
