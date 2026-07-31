package q3;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f6128a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f6129b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f6130c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6131d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f6132e;

    public m(ViewGroup viewGroup) {
        this.f6130c = viewGroup;
    }

    public final boolean a(float f6, float f8, boolean z3) {
        ViewParent e8;
        if (this.f6131d && (e8 = e(0)) != null) {
            try {
                return e8.onNestedFling(this.f6130c, f6, f8, z3);
            } catch (AbstractMethodError e9) {
                Log.e("ViewParentCompat", "ViewParent " + e8 + " does not implement interface method onNestedFling", e9);
            }
        }
        return false;
    }

    public final boolean b(float f6, float f8) {
        ViewParent e8;
        if (this.f6131d && (e8 = e(0)) != null) {
            try {
                return e8.onNestedPreFling(this.f6130c, f6, f8);
            } catch (AbstractMethodError e9) {
                Log.e("ViewParentCompat", "ViewParent " + e8 + " does not implement interface method onNestedPreFling", e9);
            }
        }
        return false;
    }

    public final boolean c(int i, int i8, int i9, int[] iArr, int[] iArr2) {
        ViewParent e8;
        int i10;
        int i11;
        int[] iArr3;
        if (!this.f6131d || (e8 = e(i9)) == null) {
            return false;
        }
        if (i == 0 && i8 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f6130c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i10 = iArr2[0];
            i11 = iArr2[1];
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (iArr == null) {
            if (this.f6132e == null) {
                this.f6132e = new int[2];
            }
            iArr3 = this.f6132e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e8 instanceof n) {
            ((n) e8).c(viewGroup, i, i8, iArr3, i9);
        } else if (i9 == 0) {
            try {
                e8.onNestedPreScroll(viewGroup, i, i8, iArr3);
            } catch (AbstractMethodError e9) {
                Log.e("ViewParentCompat", "ViewParent " + e8 + " does not implement interface method onNestedPreScroll", e9);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i10;
            iArr2[1] = iArr2[1] - i11;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        ViewParent e8;
        int i12;
        int i13;
        int[] iArr3;
        if (this.f6131d && (e8 = e(i11)) != null) {
            if (i != 0 || i8 != 0 || i9 != 0 || i10 != 0) {
                ViewGroup viewGroup = this.f6130c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i12 = iArr[0];
                    i13 = iArr[1];
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                if (iArr2 == null) {
                    if (this.f6132e == null) {
                        this.f6132e = new int[2];
                    }
                    int[] iArr4 = this.f6132e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (e8 instanceof o) {
                    ((o) e8).d(viewGroup, i, i8, i9, i10, i11, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i9;
                    iArr3[1] = iArr3[1] + i10;
                    if (e8 instanceof n) {
                        ((n) e8).e(viewGroup, i, i8, i9, i10, i11);
                    } else if (i11 == 0) {
                        try {
                            e8.onNestedScroll(viewGroup, i, i8, i9, i10);
                        } catch (AbstractMethodError e9) {
                            Log.e("ViewParentCompat", "ViewParent " + e8 + " does not implement interface method onNestedScroll", e9);
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
            return this.f6128a;
        }
        if (i != 1) {
            return null;
        }
        return this.f6129b;
    }

    public final boolean f(int i) {
        return e(i) != null;
    }

    public final boolean g(int i, int i8) {
        boolean onStartNestedScroll;
        if (!f(i8)) {
            if (this.f6131d) {
                View view = this.f6130c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z3 = parent instanceof n;
                    if (z3) {
                        onStartNestedScroll = ((n) parent).f(view2, view, i, i8);
                    } else {
                        if (i8 == 0) {
                            try {
                                onStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                            } catch (AbstractMethodError e8) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e8);
                            }
                        }
                        onStartNestedScroll = false;
                    }
                    if (onStartNestedScroll) {
                        if (i8 == 0) {
                            this.f6128a = parent;
                        } else if (i8 == 1) {
                            this.f6129b = parent;
                        }
                        if (z3) {
                            ((n) parent).a(view2, view, i, i8);
                        } else if (i8 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i);
                            } catch (AbstractMethodError e9) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e9);
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
        ViewParent e8 = e(i);
        if (e8 != null) {
            boolean z3 = e8 instanceof n;
            ViewGroup viewGroup = this.f6130c;
            if (z3) {
                ((n) e8).b(viewGroup, i);
            } else if (i == 0) {
                try {
                    e8.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e9) {
                    Log.e("ViewParentCompat", "ViewParent " + e8 + " does not implement interface method onStopNestedScroll", e9);
                }
            }
            if (i == 0) {
                this.f6128a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f6129b = null;
            }
        }
    }
}
