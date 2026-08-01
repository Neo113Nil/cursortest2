package i1;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import d2.v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f4590a = new int[2];

    /* renamed from: b, reason: collision with root package name */
    public static final Rect f4591b = new Rect();

    public static final j1.c a(View view, View view2) {
        int[] iArr = f4590a;
        view.getLocationInWindow(iArr);
        int i3 = iArr[0];
        int i10 = iArr[1];
        view2.getLocationInWindow(iArr);
        int i11 = iArr[0];
        float f3 = i10 - iArr[1];
        view.getFocusedRect(f4591b);
        float f10 = (i3 - i11) + r1.left;
        return new j1.c(f10, r1.top + f3, r1.width() + f10, f3 + r1.top + r1.height());
    }

    public static final boolean b(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof v) {
            return ((v) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final Integer c(int i3) {
        if (i3 == 5) {
            return 33;
        }
        if (i3 == 6) {
            return 130;
        }
        if (i3 == 3) {
            return 17;
        }
        if (i3 == 4) {
            return 66;
        }
        if (i3 == 1) {
            return 2;
        }
        return i3 == 2 ? 1 : null;
    }

    public static final c d(int i3) {
        if (i3 == 1) {
            return new c(2);
        }
        if (i3 == 2) {
            return new c(1);
        }
        if (i3 == 17) {
            return new c(3);
        }
        if (i3 == 33) {
            return new c(5);
        }
        if (i3 == 66) {
            return new c(4);
        }
        if (i3 != 130) {
            return null;
        }
        return new c(6);
    }
}
