package I;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: I.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121q {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f1229a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f1230b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f1231c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1232d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f1233e;

    public C0121q(ViewGroup viewGroup) {
        this.f1231c = viewGroup;
    }

    public final boolean a(float f7, float f8, boolean z7) {
        ViewParent e7;
        if (this.f1232d && (e7 = e(0)) != null) {
            try {
                return e7.onNestedFling(this.f1231c, f7, f8, z7);
            } catch (AbstractMethodError e8) {
                Log.e("ViewParentCompat", "ViewParent " + e7 + " does not implement interface method onNestedFling", e8);
            }
        }
        return false;
    }

    public final boolean b(float f7, float f8) {
        ViewParent e7;
        if (this.f1232d && (e7 = e(0)) != null) {
            try {
                return e7.onNestedPreFling(this.f1231c, f7, f8);
            } catch (AbstractMethodError e8) {
                Log.e("ViewParentCompat", "ViewParent " + e7 + " does not implement interface method onNestedPreFling", e8);
            }
        }
        return false;
    }

    public final boolean c(int i2, int i5, int[] iArr, int[] iArr2, int i7) {
        ViewParent e7;
        int i8;
        int i9;
        if (!this.f1232d || (e7 = e(i7)) == null) {
            return false;
        }
        if (i2 == 0 && i5 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f1231c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i8 = iArr2[0];
            i9 = iArr2[1];
        } else {
            i8 = 0;
            i9 = 0;
        }
        if (iArr == null) {
            if (this.f1233e == null) {
                this.f1233e = new int[2];
            }
            iArr = this.f1233e;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e7 instanceof r) {
            ((r) e7).onNestedPreScroll(viewGroup, i2, i5, iArr3, i7);
        } else if (i7 == 0) {
            try {
                e7.onNestedPreScroll(viewGroup, i2, i5, iArr3);
            } catch (AbstractMethodError e8) {
                Log.e("ViewParentCompat", "ViewParent " + e7 + " does not implement interface method onNestedPreScroll", e8);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i8;
            iArr2[1] = iArr2[1] - i9;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i2, int i5, int i7, int i8, int[] iArr, int i9, int[] iArr2) {
        ViewParent e7;
        int i10;
        int i11;
        int[] iArr3;
        if (this.f1232d && (e7 = e(i9)) != null) {
            if (i2 != 0 || i5 != 0 || i7 != 0 || i8 != 0) {
                ViewGroup viewGroup = this.f1231c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i10 = iArr[0];
                    i11 = iArr[1];
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                if (iArr2 == null) {
                    if (this.f1233e == null) {
                        this.f1233e = new int[2];
                    }
                    int[] iArr4 = this.f1233e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (e7 instanceof InterfaceC0122s) {
                    ((InterfaceC0122s) e7).onNestedScroll(viewGroup, i2, i5, i7, i8, i9, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i7;
                    iArr3[1] = iArr3[1] + i8;
                    if (e7 instanceof r) {
                        ((r) e7).onNestedScroll(viewGroup, i2, i5, i7, i8, i9);
                    } else if (i9 == 0) {
                        try {
                            e7.onNestedScroll(viewGroup, i2, i5, i7, i8);
                        } catch (AbstractMethodError e8) {
                            Log.e("ViewParentCompat", "ViewParent " + e7 + " does not implement interface method onNestedScroll", e8);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i10;
                    iArr[1] = iArr[1] - i11;
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

    public final ViewParent e(int i2) {
        if (i2 == 0) {
            return this.f1229a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f1230b;
    }

    public final boolean f(int i2) {
        return e(i2) != null;
    }

    public final boolean g(int i2, int i5) {
        boolean onStartNestedScroll;
        if (!f(i5)) {
            if (this.f1232d) {
                View view = this.f1231c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z7 = parent instanceof r;
                    if (z7) {
                        onStartNestedScroll = ((r) parent).onStartNestedScroll(view2, view, i2, i5);
                    } else {
                        if (i5 == 0) {
                            try {
                                onStartNestedScroll = parent.onStartNestedScroll(view2, view, i2);
                            } catch (AbstractMethodError e7) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e7);
                            }
                        }
                        onStartNestedScroll = false;
                    }
                    if (onStartNestedScroll) {
                        if (i5 == 0) {
                            this.f1229a = parent;
                        } else if (i5 == 1) {
                            this.f1230b = parent;
                        }
                        if (z7) {
                            ((r) parent).onNestedScrollAccepted(view2, view, i2, i5);
                        } else if (i5 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i2);
                            } catch (AbstractMethodError e8) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e8);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i2) {
        ViewParent e7 = e(i2);
        if (e7 != null) {
            boolean z7 = e7 instanceof r;
            ViewGroup viewGroup = this.f1231c;
            if (z7) {
                ((r) e7).onStopNestedScroll(viewGroup, i2);
            } else if (i2 == 0) {
                try {
                    e7.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e8) {
                    Log.e("ViewParentCompat", "ViewParent " + e7 + " does not implement interface method onStopNestedScroll", e8);
                }
            }
            if (i2 == 0) {
                this.f1229a = null;
            } else {
                if (i2 != 1) {
                    return;
                }
                this.f1230b = null;
            }
        }
    }
}
