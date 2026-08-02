package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class w0 {
    public static void d(View view, List list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (list.get(i4) == view) {
                return;
            }
        }
        Field field = E.H.f375a;
        if (E.A.c(view) != null) {
            list.add(view);
        }
        for (int i5 = size; i5 < list.size(); i5++) {
            View view2 = (View) list.get(i5);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = viewGroup.getChildAt(i6);
                    int i7 = 0;
                    while (true) {
                        if (i7 < size) {
                            if (list.get(i7) == childAt) {
                                break;
                            } else {
                                i7++;
                            }
                        } else if (E.A.c(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static void g(View view, Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public static boolean h(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object f(Object obj);

    public void i() {
        if (f0.J(4)) {
            Log.i("FragmentManager", "Older versions of AndroidX Transition do not support seeking. Add dependency on AndroidX Transition 1.5.0 or higher to enable seeking.");
        }
    }

    public abstract Object j(Object obj, Object obj2, Object obj3);

    public abstract Object k(Object obj, Object obj2);

    public abstract void l(Object obj, View view, ArrayList arrayList);

    public abstract void m(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    public abstract void n(Object obj, Rect rect);

    public abstract void o(Object obj, View view);

    public abstract void p(Object obj, A.b bVar, RunnableC0208l runnableC0208l);

    public abstract void q(Object obj, View view, ArrayList arrayList);

    public abstract void r(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object s(Object obj);
}
