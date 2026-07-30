package O;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: O.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0355q {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f2311a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f2312b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f2313c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2314d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f2315e;

    public C0355q(ViewGroup viewGroup) {
        this.f2313c = viewGroup;
    }

    public final boolean a(float f6, float f9, boolean z8) {
        ViewParent e6;
        if (this.f2314d && (e6 = e(0)) != null) {
            try {
                return AbstractC0339c0.a(e6, this.f2313c, f6, f9, z8);
            } catch (AbstractMethodError e9) {
                Log.e("ViewParentCompat", "ViewParent " + e6 + " does not implement interface method onNestedFling", e9);
            }
        }
        return false;
    }

    public final boolean b(float f6, float f9) {
        ViewParent e6;
        if (this.f2314d && (e6 = e(0)) != null) {
            try {
                return AbstractC0339c0.b(e6, this.f2313c, f6, f9);
            } catch (AbstractMethodError e9) {
                Log.e("ViewParentCompat", "ViewParent " + e6 + " does not implement interface method onNestedPreFling", e9);
            }
        }
        return false;
    }

    public final boolean c(int i, int i4, int i9, int[] iArr, int[] iArr2) {
        ViewParent e6;
        int i10;
        int i11;
        int[] iArr3;
        if (!this.f2314d || (e6 = e(i9)) == null) {
            return false;
        }
        if (i == 0 && i4 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f2313c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i10 = iArr2[0];
            i11 = iArr2[1];
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (iArr == null) {
            if (this.f2315e == null) {
                this.f2315e = new int[2];
            }
            iArr3 = this.f2315e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e6 instanceof r) {
            ((r) e6).f(viewGroup, i, i4, iArr3, i9);
        } else if (i9 == 0) {
            try {
                AbstractC0339c0.c(e6, viewGroup, i, i4, iArr3);
            } catch (AbstractMethodError e9) {
                Log.e("ViewParentCompat", "ViewParent " + e6 + " does not implement interface method onNestedPreScroll", e9);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i10;
            iArr2[1] = iArr2[1] - i11;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i, int i4, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        ViewParent e6;
        int i12;
        int i13;
        int[] iArr3;
        if (this.f2314d && (e6 = e(i11)) != null) {
            if (i != 0 || i4 != 0 || i9 != 0 || i10 != 0) {
                ViewGroup viewGroup = this.f2313c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i12 = iArr[0];
                    i13 = iArr[1];
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                if (iArr2 == null) {
                    if (this.f2315e == null) {
                        this.f2315e = new int[2];
                    }
                    int[] iArr4 = this.f2315e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (e6 instanceof InterfaceC0356s) {
                    ((InterfaceC0356s) e6).b(viewGroup, i, i4, i9, i10, i11, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i9;
                    iArr3[1] = iArr3[1] + i10;
                    if (e6 instanceof r) {
                        ((r) e6).c(viewGroup, i, i4, i9, i10, i11);
                    } else if (i11 == 0) {
                        try {
                            AbstractC0339c0.d(e6, viewGroup, i, i4, i9, i10);
                        } catch (AbstractMethodError e9) {
                            Log.e("ViewParentCompat", "ViewParent " + e6 + " does not implement interface method onNestedScroll", e9);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i12;
                    iArr[1] = iArr[1] - i13;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i) {
        if (i == 0) {
            return this.f2311a;
        }
        if (i != 1) {
            return null;
        }
        return this.f2312b;
    }

    public final boolean f(int i) {
        return e(i) != null;
    }

    public final boolean g(int i, int i4) {
        boolean f6;
        if (!f(i4)) {
            if (this.f2314d) {
                ViewGroup viewGroup = this.f2313c;
                View view = viewGroup;
                for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z8 = parent instanceof r;
                    if (z8) {
                        f6 = ((r) parent).d(view, viewGroup, i, i4);
                    } else {
                        if (i4 == 0) {
                            try {
                                f6 = AbstractC0339c0.f(parent, view, viewGroup, i);
                            } catch (AbstractMethodError e6) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e6);
                            }
                        }
                        f6 = false;
                    }
                    if (f6) {
                        if (i4 == 0) {
                            this.f2311a = parent;
                        } else if (i4 == 1) {
                            this.f2312b = parent;
                        }
                        if (z8) {
                            ((r) parent).e(view, viewGroup, i, i4);
                        } else if (i4 == 0) {
                            try {
                                AbstractC0339c0.e(parent, view, viewGroup, i);
                            } catch (AbstractMethodError e9) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e9);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i) {
        ViewParent e6 = e(i);
        if (e6 != null) {
            boolean z8 = e6 instanceof r;
            ViewGroup viewGroup = this.f2313c;
            if (z8) {
                ((r) e6).a(i, viewGroup);
            } else if (i == 0) {
                try {
                    AbstractC0339c0.g(e6, viewGroup);
                } catch (AbstractMethodError e9) {
                    Log.e("ViewParentCompat", "ViewParent " + e6 + " does not implement interface method onStopNestedScroll", e9);
                }
            }
            if (i == 0) {
                this.f2311a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f2312b = null;
            }
        }
    }
}
