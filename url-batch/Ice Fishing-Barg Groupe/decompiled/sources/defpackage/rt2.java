package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class rt2 {
    public static final rt2 lS5Rgt96tfkO;
    public final ot2 PxuCJdSBwIXG;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            lS5Rgt96tfkO = mt2.S2OOm9zPNm0h;
        } else if (i >= 30) {
            lS5Rgt96tfkO = kt2.VhhvGxCb8gfr;
        } else {
            lS5Rgt96tfkO = ot2.lS5Rgt96tfkO;
        }
    }

    public rt2(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.PxuCJdSBwIXG = new nt2(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.PxuCJdSBwIXG = new mt2(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.PxuCJdSBwIXG = new lt2(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.PxuCJdSBwIXG = new kt2(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.PxuCJdSBwIXG = new jt2(this, windowInsets);
        } else if (i >= 28) {
            this.PxuCJdSBwIXG = new it2(this, windowInsets);
        } else {
            this.PxuCJdSBwIXG = new ht2(this, windowInsets);
        }
    }

    public static wp0 PxuCJdSBwIXG(wp0 wp0Var, int i, int i2, int i3, int i4) {
        int max = Math.max(0, wp0Var.PxuCJdSBwIXG - i);
        int max2 = Math.max(0, wp0Var.lS5Rgt96tfkO - i2);
        int max3 = Math.max(0, wp0Var.TSizfFm2Yiuu - i3);
        int max4 = Math.max(0, wp0Var.Y1f8riQaR6yg - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? wp0Var : wp0.TSizfFm2Yiuu(max, max2, max3, max4);
    }

    public static rt2 TSizfFm2Yiuu(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        rt2 rt2Var = new rt2(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i = rq2.PxuCJdSBwIXG;
            rt2 PxuCJdSBwIXG = nq2.PxuCJdSBwIXG(view);
            ot2 ot2Var = rt2Var.PxuCJdSBwIXG;
            ot2Var.S2OOm9zPNm0h(PxuCJdSBwIXG);
            View rootView = view.getRootView();
            ot2Var.Y1f8riQaR6yg(rootView);
            ot2Var.QrzZRwfaDlRX(rootView);
            ot2Var.gPXPFXrUH4XX();
            ot2Var.pnx5pC0XzaCw(view.getWindowSystemUiVisibility());
        }
        return rt2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rt2) {
            return Objects.equals(this.PxuCJdSBwIXG, ((rt2) obj).PxuCJdSBwIXG);
        }
        return false;
    }

    public final int hashCode() {
        ot2 ot2Var = this.PxuCJdSBwIXG;
        if (ot2Var == null) {
            return 0;
        }
        return ot2Var.hashCode();
    }

    public final WindowInsets lS5Rgt96tfkO() {
        ot2 ot2Var = this.PxuCJdSBwIXG;
        if (ot2Var instanceof gt2) {
            return ((gt2) ot2Var).TSizfFm2Yiuu;
        }
        return null;
    }

    public rt2() {
        this.PxuCJdSBwIXG = new ot2(this);
    }
}
