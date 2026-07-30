package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ip1 {
    public static final ip1 b;
    public final fp1 a;

    static {
        if (Build.VERSION.SDK_INT >= 34) {
            b = ep1.n;
        } else {
            b = dp1.m;
        }
    }

    public ip1(ip1 ip1Var) {
        if (ip1Var == null) {
            this.a = new fp1(this);
            return;
        }
        fp1 fp1Var = ip1Var.a;
        if (Build.VERSION.SDK_INT >= 34 && (fp1Var instanceof ep1)) {
            this.a = new ep1(this, (ep1) fp1Var);
        } else if (fp1Var instanceof dp1) {
            this.a = new dp1(this, (dp1) fp1Var);
        } else if (fp1Var instanceof cp1) {
            this.a = new cp1(this, (cp1) fp1Var);
        } else if (fp1Var instanceof bp1) {
            this.a = new bp1(this, (bp1) fp1Var);
        } else if (fp1Var instanceof ap1) {
            this.a = new ap1(this, (ap1) fp1Var);
        } else if (fp1Var instanceof zo1) {
            this.a = new zo1(this, (zo1) fp1Var);
        } else {
            this.a = new fp1(this);
        }
        fp1Var.e(this);
    }

    public static c90 a(c90 c90Var, int i, int i2, int i3, int i4) {
        int max = Math.max(0, c90Var.a - i);
        int max2 = Math.max(0, c90Var.b - i2);
        int max3 = Math.max(0, c90Var.c - i3);
        int max4 = Math.max(0, c90Var.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? c90Var : c90.a(max, max2, max3, max4);
    }

    public static ip1 c(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        ip1 ip1Var = new ip1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i = ln1.a;
            ip1 a = in1.a(view);
            fp1 fp1Var = ip1Var.a;
            fp1Var.t(a);
            fp1Var.d(view.getRootView());
            fp1Var.u(view.getWindowSystemUiVisibility());
        }
        return ip1Var;
    }

    public final WindowInsets b() {
        fp1 fp1Var = this.a;
        if (fp1Var instanceof zo1) {
            return ((zo1) fp1Var).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ip1) {
            return Objects.equals(this.a, ((ip1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        fp1 fp1Var = this.a;
        if (fp1Var == null) {
            return 0;
        }
        return fp1Var.hashCode();
    }

    public ip1(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 34) {
            this.a = new ep1(this, windowInsets);
        } else {
            this.a = new dp1(this, windowInsets);
        }
    }
}
