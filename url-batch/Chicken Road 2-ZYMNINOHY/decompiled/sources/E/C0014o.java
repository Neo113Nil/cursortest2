package E;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: E.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0014o {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f431a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f432b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f433c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f434d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f435e;

    public C0014o(ViewGroup viewGroup) {
        this.f433c = viewGroup;
    }

    public final boolean a(float f4, float f5, boolean z) {
        ViewParent e4;
        if (this.f434d && (e4 = e(0)) != null) {
            try {
                return e4.onNestedFling(this.f433c, f4, f5, z);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onNestedFling", e5);
            }
        }
        return false;
    }

    public final boolean b(float f4, float f5) {
        ViewParent e4;
        if (this.f434d && (e4 = e(0)) != null) {
            try {
                return e4.onNestedPreFling(this.f433c, f4, f5);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onNestedPreFling", e5);
            }
        }
        return false;
    }

    public final boolean c(int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        ViewParent e4;
        int i7;
        int i8;
        if (!this.f434d || (e4 = e(i6)) == null) {
            return false;
        }
        if (i4 == 0 && i5 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f433c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i7 = iArr2[0];
            i8 = iArr2[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr == null) {
            if (this.f435e == null) {
                this.f435e = new int[2];
            }
            iArr = this.f435e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (e4 instanceof InterfaceC0015p) {
            ((InterfaceC0015p) e4).c(i4, i5, i6, iArr);
        } else if (i6 == 0) {
            try {
                e4.onNestedPreScroll(viewGroup, i4, i5, iArr);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onNestedPreScroll", e5);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i7;
            iArr2[1] = iArr2[1] - i8;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public final boolean d(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        ViewParent e4;
        int i9;
        int i10;
        int[] iArr3;
        if (this.f434d && (e4 = e(i8)) != null) {
            if (i4 != 0 || i5 != 0 || i6 != 0 || i7 != 0) {
                ViewGroup viewGroup = this.f433c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i9 = iArr[0];
                    i10 = iArr[1];
                } else {
                    i9 = 0;
                    i10 = 0;
                }
                if (iArr2 == null) {
                    if (this.f435e == null) {
                        this.f435e = new int[2];
                    }
                    int[] iArr4 = this.f435e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (e4 instanceof InterfaceC0016q) {
                    ((InterfaceC0016q) e4).b(viewGroup, i4, i5, i6, i7, i8, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i6;
                    iArr3[1] = iArr3[1] + i7;
                    if (e4 instanceof InterfaceC0015p) {
                        ((InterfaceC0015p) e4).a(viewGroup, i4, i5, i6, i7, i8);
                    } else if (i8 == 0) {
                        try {
                            e4.onNestedScroll(viewGroup, i4, i5, i6, i7);
                        } catch (AbstractMethodError e5) {
                            Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onNestedScroll", e5);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i9;
                    iArr[1] = iArr[1] - i10;
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

    public final ViewParent e(int i4) {
        if (i4 == 0) {
            return this.f431a;
        }
        if (i4 != 1) {
            return null;
        }
        return this.f432b;
    }

    public final boolean f(int i4) {
        return e(i4) != null;
    }

    public final boolean g(int i4, int i5) {
        boolean onStartNestedScroll;
        if (!f(i5)) {
            if (this.f434d) {
                View view = this.f433c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof InterfaceC0015p;
                    if (z) {
                        onStartNestedScroll = ((InterfaceC0015p) parent).d(view2, view, i4, i5);
                    } else {
                        if (i5 == 0) {
                            try {
                                onStartNestedScroll = parent.onStartNestedScroll(view2, view, i4);
                            } catch (AbstractMethodError e4) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e4);
                            }
                        }
                        onStartNestedScroll = false;
                    }
                    if (onStartNestedScroll) {
                        if (i5 == 0) {
                            this.f431a = parent;
                        } else if (i5 == 1) {
                            this.f432b = parent;
                        }
                        if (z) {
                            ((InterfaceC0015p) parent).e(view2, view, i4, i5);
                        } else if (i5 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i4);
                            } catch (AbstractMethodError e5) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e5);
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

    public final void h(int i4) {
        ViewParent e4 = e(i4);
        if (e4 != null) {
            boolean z = e4 instanceof InterfaceC0015p;
            ViewGroup viewGroup = this.f433c;
            if (z) {
                ((InterfaceC0015p) e4).f(viewGroup, i4);
            } else if (i4 == 0) {
                try {
                    e4.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e5) {
                    Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onStopNestedScroll", e5);
                }
            }
            if (i4 == 0) {
                this.f431a = null;
            } else {
                if (i4 != 1) {
                    return;
                }
                this.f432b = null;
            }
        }
    }
}
