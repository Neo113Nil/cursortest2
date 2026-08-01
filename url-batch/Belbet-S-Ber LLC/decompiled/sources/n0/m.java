package n0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f2805a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f2806b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f2807c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f2808e;

    public m(ViewGroup viewGroup) {
        this.f2807c = viewGroup;
    }

    public final boolean a(float f5, float f6, boolean z4) {
        ViewParent e4;
        if (this.d && (e4 = e(0)) != null) {
            try {
                return e4.onNestedFling(this.f2807c, f5, f6, z4);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onNestedFling", e5);
            }
        }
        return false;
    }

    public final boolean b(float f5, float f6) {
        ViewParent e4;
        if (this.d && (e4 = e(0)) != null) {
            try {
                return e4.onNestedPreFling(this.f2807c, f5, f6);
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
        ViewGroup viewGroup = this.f2807c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i6 = iArr2[0];
            i7 = iArr2[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr == null) {
            if (this.f2808e == null) {
                this.f2808e = new int[2];
            }
            iArr3 = this.f2808e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e4 instanceof n) {
            ((n) e4).c(viewGroup, i, i4, iArr3, i5);
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
                ViewGroup viewGroup = this.f2807c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i8 = iArr[0];
                    i9 = iArr[1];
                } else {
                    i8 = 0;
                    i9 = 0;
                }
                if (iArr2 == null) {
                    if (this.f2808e == null) {
                        this.f2808e = new int[2];
                    }
                    int[] iArr4 = this.f2808e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (e4 instanceof o) {
                    ((o) e4).d(viewGroup, i, i4, i5, i6, i7, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i5;
                    iArr3[1] = iArr3[1] + i6;
                    if (e4 instanceof n) {
                        ((n) e4).e(viewGroup, i, i4, i5, i6, i7);
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
            return this.f2805a;
        }
        if (i != 1) {
            return null;
        }
        return this.f2806b;
    }

    public final boolean f(int i) {
        return e(i) != null;
    }

    public final boolean g(int i, int i4) {
        boolean onStartNestedScroll;
        if (!f(i4)) {
            if (this.d) {
                View view = this.f2807c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z4 = parent instanceof n;
                    if (z4) {
                        onStartNestedScroll = ((n) parent).f(view2, view, i, i4);
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
                            this.f2805a = parent;
                        } else if (i4 == 1) {
                            this.f2806b = parent;
                        }
                        if (z4) {
                            ((n) parent).a(view2, view, i, i4);
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
            boolean z4 = e4 instanceof n;
            ViewGroup viewGroup = this.f2807c;
            if (z4) {
                ((n) e4).b(viewGroup, i);
            } else if (i == 0) {
                try {
                    e4.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e5) {
                    Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onStopNestedScroll", e5);
                }
            }
            if (i == 0) {
                this.f2805a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f2806b = null;
            }
        }
    }
}
