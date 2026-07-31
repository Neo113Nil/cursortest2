package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public class F {

    /* renamed from: a, reason: collision with root package name */
    private ViewParent f11884a;

    /* renamed from: b, reason: collision with root package name */
    private ViewParent f11885b;

    /* renamed from: c, reason: collision with root package name */
    private final View f11886c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f11887d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f11888e;

    public F(View view) {
        this.f11886c = view;
    }

    private boolean g(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        ViewParent h4;
        int i9;
        int i10;
        int[] iArr3;
        if (!l() || (h4 = h(i8)) == null) {
            return false;
        }
        if (i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f11886c.getLocationInWindow(iArr);
            i9 = iArr[0];
            i10 = iArr[1];
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (iArr2 == null) {
            int[] i11 = i();
            i11[0] = 0;
            i11[1] = 0;
            iArr3 = i11;
        } else {
            iArr3 = iArr2;
        }
        AbstractC1297i0.d(h4, this.f11886c, i4, i5, i6, i7, i8, iArr3);
        if (iArr != null) {
            this.f11886c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i9;
            iArr[1] = iArr[1] - i10;
        }
        return true;
    }

    private ViewParent h(int i4) {
        if (i4 == 0) {
            return this.f11884a;
        }
        if (i4 != 1) {
            return null;
        }
        return this.f11885b;
    }

    private int[] i() {
        if (this.f11888e == null) {
            this.f11888e = new int[2];
        }
        return this.f11888e;
    }

    private void n(int i4, ViewParent viewParent) {
        if (i4 == 0) {
            this.f11884a = viewParent;
        } else {
            if (i4 != 1) {
                return;
            }
            this.f11885b = viewParent;
        }
    }

    public boolean a(float f4, float f5, boolean z4) {
        ViewParent h4;
        if (!l() || (h4 = h(0)) == null) {
            return false;
        }
        return AbstractC1297i0.a(h4, this.f11886c, f4, f5, z4);
    }

    public boolean b(float f4, float f5) {
        ViewParent h4;
        if (!l() || (h4 = h(0)) == null) {
            return false;
        }
        return AbstractC1297i0.b(h4, this.f11886c, f4, f5);
    }

    public boolean c(int i4, int i5, int[] iArr, int[] iArr2) {
        return d(i4, i5, iArr, iArr2, 0);
    }

    public boolean d(int i4, int i5, int[] iArr, int[] iArr2, int i6) {
        ViewParent h4;
        int i7;
        int i8;
        if (!l() || (h4 = h(i6)) == null) {
            return false;
        }
        if (i4 == 0 && i5 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f11886c.getLocationInWindow(iArr2);
            i7 = iArr2[0];
            i8 = iArr2[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr == null) {
            iArr = i();
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        AbstractC1297i0.c(h4, this.f11886c, i4, i5, iArr3, i6);
        if (iArr2 != null) {
            this.f11886c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i7;
            iArr2[1] = iArr2[1] - i8;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public void e(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        g(i4, i5, i6, i7, iArr, i8, iArr2);
    }

    public boolean f(int i4, int i5, int i6, int i7, int[] iArr) {
        return g(i4, i5, i6, i7, iArr, 0, null);
    }

    public boolean j() {
        return k(0);
    }

    public boolean k(int i4) {
        return h(i4) != null;
    }

    public boolean l() {
        return this.f11887d;
    }

    public void m(boolean z4) {
        if (this.f11887d) {
            AbstractC1281a0.P0(this.f11886c);
        }
        this.f11887d = z4;
    }

    public boolean o(int i4) {
        return p(i4, 0);
    }

    public boolean p(int i4, int i5) {
        if (k(i5)) {
            return true;
        }
        if (!l()) {
            return false;
        }
        View view = this.f11886c;
        for (ViewParent parent = this.f11886c.getParent(); parent != null; parent = parent.getParent()) {
            if (AbstractC1297i0.f(parent, view, this.f11886c, i4, i5)) {
                n(i5, parent);
                AbstractC1297i0.e(parent, view, this.f11886c, i4, i5);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void q() {
        r(0);
    }

    public void r(int i4) {
        ViewParent h4 = h(i4);
        if (h4 != null) {
            AbstractC1297i0.g(h4, this.f11886c, i4);
            n(i4, null);
        }
    }
}
