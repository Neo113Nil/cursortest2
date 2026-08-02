package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abg extends wv {
    @Override // defpackage.wv
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.c() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.c());
    }

    @Override // defpackage.wv
    public final void c(View view, aah aahVar) {
        int c;
        super.c(view, aahVar);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        aahVar.o(ScrollView.class.getName());
        if (!nestedScrollView.isEnabled() || (c = nestedScrollView.c()) <= 0) {
            return;
        }
        aahVar.J();
        if (nestedScrollView.getScrollY() > 0) {
            aahVar.h(aag.e);
            aahVar.h(aag.h);
        }
        if (nestedScrollView.getScrollY() < c) {
            aahVar.h(aag.d);
            aahVar.h(aag.i);
        }
    }

    @Override // defpackage.wv
    public final boolean i(View view, int i, Bundle bundle) {
        if (super.i(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int height = nestedScrollView.getHeight();
        Rect rect = new Rect();
        if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
            height = rect.height();
        }
        if (i != 4096) {
            if (i == 8192 || i == 16908344) {
                int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.v(0, max, true);
                return true;
            }
            if (i != 16908346) {
                return false;
            }
        }
        int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.c());
        if (min == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.v(0, min, true);
        return true;
    }
}
