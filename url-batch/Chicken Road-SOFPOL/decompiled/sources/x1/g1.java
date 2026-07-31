package x1;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: f, reason: collision with root package name */
    public static final t6.b f8414f = new t6.b(2);

    /* renamed from: a, reason: collision with root package name */
    public final Rect f8415a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f8416b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final Rect f8417c = new Rect();

    /* renamed from: d, reason: collision with root package name */
    public final f1 f8418d = new f1(new c5.n(this));

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f8419e = new ArrayList();

    public static void d(ViewGroup viewGroup, Rect rect) {
        int height = viewGroup.getHeight() + viewGroup.getScrollY();
        int width = viewGroup.getWidth() + viewGroup.getScrollX();
        rect.set(width, height, width, height);
    }

    public final View a(int i, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        int indexOf;
        int lastIndexOf;
        int i8;
        Rect rect2 = this.f8415a;
        if (view != null) {
            view.getFocusedRect(rect2);
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        } else if (rect != null) {
            rect2.set(rect);
        } else if (i != 1) {
            if (i != 2) {
                if (i == 17 || i == 33) {
                    d(viewGroup, rect2);
                } else if (i == 66 || i == 130) {
                    int scrollY = viewGroup.getScrollY();
                    int scrollX = viewGroup.getScrollX();
                    rect2.set(scrollX, scrollY, scrollX, scrollY);
                }
            } else if (viewGroup.getLayoutDirection() == 1) {
                d(viewGroup, rect2);
            } else {
                int scrollY2 = viewGroup.getScrollY();
                int scrollX2 = viewGroup.getScrollX();
                rect2.set(scrollX2, scrollY2, scrollX2, scrollY2);
            }
        } else if (viewGroup.getLayoutDirection() == 1) {
            int scrollY3 = viewGroup.getScrollY();
            int scrollX3 = viewGroup.getScrollX();
            rect2.set(scrollX3, scrollY3, scrollX3, scrollY3);
        } else {
            d(viewGroup, rect2);
        }
        if (i != 1 && i != 2) {
            if (i == 17 || i == 33 || i == 66 || i == 130) {
                return c(i, rect2, view, viewGroup, arrayList);
            }
            throw new IllegalArgumentException(a0.q.h("Unknown direction: ", i));
        }
        f1 f1Var = this.f8418d;
        try {
            f1Var.a(arrayList, viewGroup);
            Collections.sort(arrayList, f1Var);
            f1Var.f8410c.a();
            f1Var.f8409b.b();
            f1Var.f8411d.a();
            f1Var.f8408a.a();
            int size = arrayList.size();
            View view2 = null;
            if (size < 2) {
                return null;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 17 || i == 33 || i == 66 || i == 130) {
                        view2 = c(i, this.f8415a, view, viewGroup, arrayList);
                    }
                } else if (size >= 2) {
                    view2 = (view == null || (lastIndexOf = arrayList.lastIndexOf(view)) < 0 || (i8 = lastIndexOf + 1) >= size) ? (View) arrayList.get(0) : (View) arrayList.get(i8);
                }
            } else if (size >= 2) {
                view2 = (view == null || (indexOf = arrayList.indexOf(view)) <= 0) ? (View) arrayList.get(size - 1) : (View) arrayList.get(indexOf - 1);
            }
            return view2 == null ? (View) arrayList.get(size - 1) : view2;
        } catch (Throwable th) {
            f1Var.f8410c.a();
            f1Var.f8409b.b();
            f1Var.f8411d.a();
            f1Var.f8408a.a();
            throw th;
        }
    }

    public final View b(int i, View view, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        View view2 = null;
        if (view != null && view != viewGroup) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup3 = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent != viewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) parent;
                    if (viewGroup4.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                        viewGroup3 = viewGroup4;
                    }
                    parent = viewGroup4.getParent();
                } else if (viewGroup3 != null) {
                    viewGroup2 = viewGroup3;
                }
            }
        }
        viewGroup2 = viewGroup;
        View b8 = g0.b(view, viewGroup2, i);
        boolean z3 = true;
        View view3 = b8;
        while (b8 != null) {
            if (b8.isFocusable() && b8.getVisibility() == 0 && (!b8.isInTouchMode() || b8.isFocusableInTouchMode())) {
                view2 = b8;
                break;
            }
            b8 = g0.b(b8, viewGroup2, i);
            boolean z7 = !z3;
            if (!z3) {
                view3 = view3 != null ? g0.b(view3, viewGroup2, i) : null;
                if (view3 == b8) {
                    break;
                }
            }
            z3 = z7;
        }
        if (view2 != null) {
            return view2;
        }
        ArrayList<View> arrayList = this.f8419e;
        try {
            arrayList.clear();
            if (Build.VERSION.SDK_INT < 26) {
                g0.d(viewGroup2, arrayList, viewGroup2.isInTouchMode());
            } else {
                viewGroup2.addFocusables(arrayList, i, viewGroup2.isInTouchMode() ? 1 : 0);
            }
            if (!arrayList.isEmpty()) {
                view2 = a(i, null, view, viewGroup2, arrayList);
            }
            arrayList.clear();
            return view2;
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }

    public final View c(int i, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        Rect rect2 = this.f8416b;
        rect2.set(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset((-rect.width()) - 1, 0);
        } else if (i == 130) {
            rect2.offset(0, (-rect.height()) - 1);
        }
        int size = arrayList.size();
        View view2 = null;
        for (int i8 = 0; i8 < size; i8++) {
            View view3 = (View) arrayList.get(i8);
            if (!q6.i.a(view3, view) && !q6.i.a(view3, viewGroup)) {
                Rect rect3 = this.f8417c;
                view3.getFocusedRect(rect3);
                viewGroup.offsetDescendantRectToMyCoords(view3, rect3);
                e1.c w7 = f1.p.w(rect3);
                e1.c w8 = f1.p.w(rect2);
                e1.c w9 = f1.p.w(rect);
                d1.b B = d1.d.B(i);
                if (d1.d.o(w7, w8, w9, B != null ? B.f2057a : 1)) {
                    rect2.set(rect3);
                    view2 = view3;
                }
            }
        }
        return view2;
    }
}
