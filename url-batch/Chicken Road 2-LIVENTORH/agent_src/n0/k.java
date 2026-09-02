package n0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f2749a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f2750b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f2751c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f2752e;

    public k(ViewGroup viewGroup) {
        this.f2751c = viewGroup;
    }

    public final boolean a(float f2, float f4, boolean z3) {
        ViewParent e4;
        if (this.d && (e4 = e(0)) != null) {
            try {
                return e4.onNestedFling(this.f2751c, f2, f4, z3);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onNestedFling", e5);
            }
        }
        return false;
    }

    public final boolean b(float f2, float f4) {
        ViewParent e4;
        if (this.d && (e4 = e(0)) != null) {
            try {
                return e4.onNestedPreFling(this.f2751c, f2, f4);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onNestedPreFling", e5);
            }
        }
        return false;
    }

    public final boolean c(int i, int i4, int i5, int[] iArr, int[] iArr2) {
        ViewParent e4;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.d || (e4 = e(i5)) == null) {
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
        ViewGroup viewGroup = this.f2751c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i6 = iArr2[0];
            i7 = iArr2[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr == null) {
            if (this.f2752e == null) {
                this.f2752e = new int[2];
            }
            iArr3 = this.f2752e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e4 instanceof l) {
            ((l) e4).c(viewGroup, i, i4, iArr3, i5);
        } else if (i5 == 0) {
            try {
                e4.onNestedPreScroll(viewGroup, i, i4, iArr3);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onNestedPreScroll", e5);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i6;
            iArr2[1] = iArr2[1] - i7;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i, int i4, int i5, int i6, int[] iArr, int i7, int[] iArr2) {
        ViewParent e4;
        int i8;
        int i9;
        int[] iArr3;
        if (this.d && (e4 = e(i7)) != null) {
            if (i != 0 || i4 != 0 || i5 != 0 || i6 != 0) {
                ViewGroup viewGroup = this.f2751c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i8 = iArr[0];
                    i9 = iArr[1];
                } else {
                    i8 = 0;
                    i9 = 0;
                }
                if (iArr2 == null) {
                    if (this.f2752e == null) {
                        this.f2752e = new int[2];
                    }
                    int[] iArr4 = this.f2752e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (e4 instanceof m) {
                    ((m) e4).d(viewGroup, i, i4, i5, i6, i7, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i5;
                    iArr3[1] = iArr3[1] + i6;
                    if (e4 instanceof l) {
                        ((l) e4).e(viewGroup, i, i4, i5, i6, i7);
                    } else if (i7 == 0) {
                        try {
                            e4.onNestedScroll(viewGroup, i, i4, i5, i6);
                        } catch (AbstractMethodError e5) {
                            Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onNestedScroll", e5);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i8;
                    iArr[1] = iArr[1] - i9;
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
            return this.f2749a;
        }
        if (i != 1) {
            return null;
        }
        return this.f2750b;
    }

    public final boolean f(int i) {
        return e(i) != null;
    }

    public final boolean g(int i, int i4) {
        boolean onStartNestedScroll;
        if (!f(i4)) {
            if (this.d) {
                View view = this.f2751c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z3 = parent instanceof l;
                    if (z3) {
                        onStartNestedScroll = ((l) parent).f(view2, view, i, i4);
                    } else {
                        if (i4 == 0) {
                            try {
                                onStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                            } catch (AbstractMethodError e4) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e4);
                            }
                        }
                        onStartNestedScroll = false;
                    }
                    if (onStartNestedScroll) {
                        if (i4 == 0) {
                            this.f2749a = parent;
                        } else if (i4 == 1) {
                            this.f2750b = parent;
                        }
                        if (z3) {
                            ((l) parent).a(view2, view, i, i4);
                        } else if (i4 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i);
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

    public final void h(int i) {
        ViewParent e4 = e(i);
        if (e4 != null) {
            boolean z3 = e4 instanceof l;
            ViewGroup viewGroup = this.f2751c;
            if (z3) {
                ((l) e4).b(viewGroup, i);
            } else if (i == 0) {
                try {
                    e4.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e5) {
                    Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onStopNestedScroll", e5);
                }
            }
            if (i == 0) {
                this.f2749a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f2750b = null;
            }
        }
    }
}
