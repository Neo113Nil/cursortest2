package com.anythink.expressad.foundation.h;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19748a = "ViewUtils";

    /* renamed from: b, reason: collision with root package name */
    private static boolean f19749b = false;

    public static boolean a(View view, int i) {
        if (view.getVisibility() != 0) {
            return true;
        }
        if (view.getAlpha() < 0.5f) {
            return true;
        }
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup) && ((ViewGroup) view.getParent()).getVisibility() != 0) {
            return true;
        }
        Rect rect = new Rect();
        if (!(view.getGlobalVisibleRect(rect) && ((((float) ((rect.right - rect.left) * (rect.bottom - rect.top))) > (((float) (view.getMeasuredWidth() * view.getMeasuredHeight())) * (i == 1 ? 0.0f : 0.5f)) ? 1 : (((float) ((rect.right - rect.left) * (rect.bottom - rect.top))) == (((float) (view.getMeasuredWidth() * view.getMeasuredHeight())) * (i == 1 ? 0.0f : 0.5f)) ? 0 : -1)) >= 0))) {
            return true;
        }
        View view2 = view;
        while (view2.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            for (int a9 = a(view2, viewGroup) + 1; a9 < viewGroup.getChildCount(); a9++) {
                View childAt = viewGroup.getChildAt(a9);
                if (childAt.getVisibility() == 0 && a(view, childAt)) {
                    if (childAt instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) childAt;
                        if (viewGroup2.getChildCount() > 0) {
                            boolean b9 = b(view, viewGroup2);
                            f19749b = false;
                            if (b9) {
                                return true;
                            }
                        }
                    }
                    if (a(childAt)) {
                        return true;
                    }
                }
            }
            view2 = viewGroup;
        }
        return false;
    }

    private static boolean b(View view, ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0 && a(view, childAt)) {
                if ((childAt instanceof WebView) && childAt.getVisibility() == 0) {
                    f19749b = true;
                }
                if (a(childAt)) {
                    f19749b = true;
                }
                if (f19749b) {
                    break;
                }
                if (childAt instanceof ViewGroup) {
                    b(view, (ViewGroup) childAt);
                }
            }
        }
        return f19749b;
    }

    private static boolean a(View view) {
        return view.getAlpha() > 0.5f && view.getBackground() != null && view.getBackground().getAlpha() > 127;
    }

    private static boolean a(View view, View view2) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        view2.getGlobalVisibleRect(rect2);
        if (Rect.intersects(rect, rect2)) {
            return ((Math.min(rect.bottom, rect2.bottom) - Math.max(rect.top, rect2.top)) * (Math.min(rect.right, rect2.right) - Math.max(rect.left, rect2.left))) * 2 >= view.getMeasuredWidth() * view.getMeasuredHeight();
        }
        return false;
    }

    private static int a(View view, ViewGroup viewGroup) {
        int i = 0;
        while (i < viewGroup.getChildCount() && viewGroup.getChildAt(i) != view) {
            i++;
        }
        return i;
    }
}
