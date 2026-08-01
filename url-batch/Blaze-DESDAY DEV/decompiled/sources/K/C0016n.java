package K;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: K.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0016n {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f498a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f499b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f500c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f501e;

    public C0016n(ViewGroup viewGroup) {
        this.f500c = viewGroup;
    }

    public final boolean a(float f2, float f3, boolean z2) {
        ViewParent e2;
        if (!this.d || (e2 = e(0)) == null) {
            return false;
        }
        try {
            return Z.a(e2, this.f500c, f2, f3, z2);
        } catch (AbstractMethodError e3) {
            Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedFling", e3);
            return false;
        }
    }

    public final boolean b(float f2, float f3) {
        ViewParent e2;
        if (!this.d || (e2 = e(0)) == null) {
            return false;
        }
        try {
            return Z.b(e2, this.f500c, f2, f3);
        } catch (AbstractMethodError e3) {
            Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedPreFling", e3);
            return false;
        }
    }

    public final boolean c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent e2;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.d || (e2 = e(i3)) == null) {
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
        ViewGroup viewGroup = this.f500c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f501e == null) {
                this.f501e = new int[2];
            }
            iArr3 = this.f501e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e2 instanceof InterfaceC0017o) {
            ((InterfaceC0017o) e2).e(viewGroup, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                Z.c(e2, viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedPreScroll", e3);
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
        ViewParent e2;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.d || (e2 = e(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f500c;
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.f501e == null) {
                this.f501e = new int[2];
            }
            int[] iArr4 = this.f501e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        if (e2 instanceof InterfaceC0018p) {
            ((InterfaceC0018p) e2).b(viewGroup, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (e2 instanceof InterfaceC0017o) {
                ((InterfaceC0017o) e2).c(viewGroup, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    Z.d(e2, viewGroup, i, i2, i3, i4);
                } catch (AbstractMethodError e3) {
                    Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedScroll", e3);
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
            return this.f498a;
        }
        if (i != 1) {
            return null;
        }
        return this.f499b;
    }

    public final boolean f(int i) {
        return e(i) != null;
    }

    public final boolean g(int i, int i2) {
        boolean f2;
        if (f(i2)) {
            return true;
        }
        if (this.d) {
            ViewGroup viewGroup = this.f500c;
            View view = viewGroup;
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                boolean z2 = parent instanceof InterfaceC0017o;
                if (z2) {
                    f2 = ((InterfaceC0017o) parent).f(view, viewGroup, i, i2);
                } else {
                    if (i2 == 0) {
                        try {
                            f2 = Z.f(parent, view, viewGroup, i);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                        }
                    }
                    f2 = false;
                }
                if (f2) {
                    if (i2 == 0) {
                        this.f498a = parent;
                    } else if (i2 == 1) {
                        this.f499b = parent;
                    }
                    if (z2) {
                        ((InterfaceC0017o) parent).a(view, viewGroup, i, i2);
                    } else if (i2 == 0) {
                        try {
                            Z.e(parent, view, viewGroup, i);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
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
        ViewParent e2 = e(i);
        if (e2 != null) {
            boolean z2 = e2 instanceof InterfaceC0017o;
            ViewGroup viewGroup = this.f500c;
            if (z2) {
                ((InterfaceC0017o) e2).d(viewGroup, i);
            } else if (i == 0) {
                try {
                    Z.g(e2, viewGroup);
                } catch (AbstractMethodError e3) {
                    Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onStopNestedScroll", e3);
                }
            }
            if (i == 0) {
                this.f498a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f499b = null;
            }
        }
    }
}
