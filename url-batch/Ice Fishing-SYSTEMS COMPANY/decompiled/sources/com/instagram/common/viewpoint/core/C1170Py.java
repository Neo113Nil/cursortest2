package com.instagram.common.viewpoint.core;

import android.view.WindowInsets;

/* renamed from: com.facebook.ads.redexgen.X.Py, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1170Py {
    public final Object A00;

    public C1170Py(Object obj) {
        this.A00 = obj;
    }

    public static C1170Py A00(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C1170Py(obj);
    }

    public static Object A01(C1170Py c1170Py) {
        if (c1170Py == null) {
            return null;
        }
        return c1170Py.A00;
    }

    public final int A02() {
        return ((WindowInsets) this.A00).getSystemWindowInsetBottom();
    }

    public final int A03() {
        return ((WindowInsets) this.A00).getSystemWindowInsetLeft();
    }

    public final int A04() {
        return ((WindowInsets) this.A00).getSystemWindowInsetRight();
    }

    public final int A05() {
        return ((WindowInsets) this.A00).getSystemWindowInsetTop();
    }

    public final C1170Py A06(int i, int i4, int i9, int i10) {
        return new C1170Py(((WindowInsets) this.A00).replaceSystemWindowInsets(i, i4, i9, i10));
    }

    public final boolean A07() {
        return ((WindowInsets) this.A00).isConsumed();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1170Py c1170Py = (C1170Py) obj;
        return this.A00 == null ? c1170Py.A00 == null : this.A00.equals(c1170Py.A00);
    }

    public final int hashCode() {
        if (this.A00 == null) {
            return 0;
        }
        return this.A00.hashCode();
    }
}
