package defpackage;

import android.view.View;
import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xm {
    public boolean a;
    private ViewParent b;
    private ViewParent c;
    private final View d;
    private int[] e;

    public xm(View view) {
        this.d = view;
    }

    private final ViewParent i(int i) {
        return i != 0 ? this.c : this.b;
    }

    private final void j(int i, ViewParent viewParent) {
        if (i != 0) {
            this.c = viewParent;
        } else {
            this.b = viewParent;
        }
    }

    private final int[] k() {
        int[] iArr = this.e;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[2];
        this.e = iArr2;
        return iArr2;
    }

    public final void a(boolean z) {
        if (this.a) {
            View view = this.d;
            int i = yq.a;
            view.stopNestedScroll();
        }
        this.a = z;
    }

    public final void b(int i) {
        ViewParent i2 = i(i);
        if (i2 != null) {
            yj.e(i2, this.d, i);
            j(i, null);
        }
    }

    public final boolean c(float f, float f2, boolean z) {
        ViewParent viewParent;
        if (!this.a || (viewParent = this.b) == null) {
            return false;
        }
        return yj.f(viewParent, this.d, f, f2, z);
    }

    public final boolean d(float f, float f2) {
        ViewParent viewParent;
        if (!this.a || (viewParent = this.b) == null) {
            return false;
        }
        return yj.g(viewParent, this.d, f, f2);
    }

    public final boolean e(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent i4;
        int i5;
        int i6;
        if (!this.a || (i4 = i(i3)) == null) {
            return false;
        }
        if (i == 0) {
            if (i2 == 0) {
                if (iArr2 != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                }
                return false;
            }
            i = 0;
        }
        if (iArr2 != null) {
            this.d.getLocationInWindow(iArr2);
            int i7 = iArr2[0];
            i6 = iArr2[1];
            i5 = i7;
        } else {
            iArr2 = null;
            i5 = 0;
            i6 = 0;
        }
        int[] iArr3 = iArr2;
        if (iArr == null) {
            iArr = k();
        }
        int[] iArr4 = iArr;
        iArr4[0] = 0;
        iArr4[1] = 0;
        View view = this.d;
        yj.b(i4, view, i, i2, iArr4, i3);
        if (iArr3 != null) {
            view.getLocationInWindow(iArr3);
            iArr3[0] = iArr3[0] - i5;
            iArr3[1] = iArr3[1] - i6;
        }
        return (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
    }

    public final boolean f(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent i6;
        int i7;
        int[] iArr3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        if (!this.a || (i6 = i(i5)) == null) {
            return false;
        }
        if (i != 0) {
            i7 = i;
            iArr3 = iArr;
            i8 = i4;
            i9 = i3;
            i10 = i2;
        } else if (i2 != 0) {
            iArr3 = iArr;
            i8 = i4;
            i9 = i3;
            i10 = i2;
            i7 = 0;
        } else if (i3 != 0) {
            iArr3 = iArr;
            i7 = 0;
            i8 = i4;
            i9 = i3;
            i10 = 0;
        } else {
            if (i4 == 0) {
                if (iArr != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                }
                return false;
            }
            iArr3 = iArr;
            i7 = 0;
            i10 = 0;
            i8 = i4;
            i9 = 0;
        }
        if (iArr3 != null) {
            this.d.getLocationInWindow(iArr3);
            int i13 = iArr3[0];
            i12 = iArr3[1];
            i11 = i13;
        } else {
            iArr3 = null;
            i11 = 0;
            i12 = 0;
        }
        int[] iArr4 = iArr3;
        if (iArr2 == null) {
            iArr2 = k();
            iArr2[0] = 0;
            iArr2[1] = 0;
        }
        View view = this.d;
        yj.c(i6, view, i7, i10, i9, i8, i5, iArr2);
        if (iArr4 != null) {
            view.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i11;
            iArr4[1] = iArr4[1] - i12;
        }
        return true;
    }

    public final boolean g(int i) {
        return i(i) != null;
    }

    public final boolean h(int i, int i2) {
        if (g(i2)) {
            return true;
        }
        if (!this.a) {
            return false;
        }
        View view = this.d;
        View view2 = view;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (yj.h(parent, view2, view, i, i2)) {
                j(i2, parent);
                yj.d(parent, view2, view, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view2 = (View) parent;
            }
        }
        return false;
    }
}
