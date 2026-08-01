package M;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: M.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0016l {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f767a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f768b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f769c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f770d;
    public int[] e;

    public C0016l(ViewGroup viewGroup) {
        this.f769c = viewGroup;
    }

    public final boolean a(float f2, float f3, boolean z2) {
        ViewParent e;
        if (!this.f770d || (e = e(0)) == null) {
            return false;
        }
        try {
            return U.a(e, this.f769c, f2, f3, z2);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    public final boolean b(float f2, float f3) {
        ViewParent e;
        if (!this.f770d || (e = e(0)) == null) {
            return false;
        }
        try {
            return U.b(e, this.f769c, f2, f3);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    public final boolean c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent e;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.f770d || (e = e(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f769c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            iArr3 = this.e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e instanceof InterfaceC0017m) {
            ((InterfaceC0017m) e).e(viewGroup, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                U.c(e, viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onNestedPreScroll", e2);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent e;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.f770d || (e = e(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f769c;
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            int[] iArr4 = this.e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        if (e instanceof InterfaceC0018n) {
            ((InterfaceC0018n) e).b(viewGroup, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (e instanceof InterfaceC0017m) {
                ((InterfaceC0017m) e).c(viewGroup, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    U.d(e, viewGroup, i, i2, i3, i4);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onNestedScroll", e2);
                }
            }
        }
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public final ViewParent e(int i) {
        if (i == 0) {
            return this.f767a;
        }
        if (i != 1) {
            return null;
        }
        return this.f768b;
    }

    public final boolean f(int i) {
        return e(i) != null;
    }

    public final boolean g(int i, int i2) {
        boolean f2;
        if (f(i2)) {
            return true;
        }
        if (this.f770d) {
            ViewGroup viewGroup = this.f769c;
            View view = viewGroup;
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                boolean z2 = parent instanceof InterfaceC0017m;
                if (z2) {
                    f2 = ((InterfaceC0017m) parent).f(view, viewGroup, i, i2);
                } else {
                    if (i2 == 0) {
                        try {
                            f2 = U.f(parent, view, viewGroup, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                        }
                    }
                    f2 = false;
                }
                if (f2) {
                    if (i2 == 0) {
                        this.f767a = parent;
                    } else if (i2 == 1) {
                        this.f768b = parent;
                    }
                    if (z2) {
                        ((InterfaceC0017m) parent).a(view, viewGroup, i, i2);
                    } else if (i2 == 0) {
                        try {
                            U.e(parent, view, viewGroup, i);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final void h(int i) {
        ViewParent e = e(i);
        if (e != null) {
            boolean z2 = e instanceof InterfaceC0017m;
            ViewGroup viewGroup = this.f769c;
            if (z2) {
                ((InterfaceC0017m) e).d(viewGroup, i);
            } else if (i == 0) {
                try {
                    U.g(e, viewGroup);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i == 0) {
                this.f767a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f768b = null;
            }
        }
    }
}
