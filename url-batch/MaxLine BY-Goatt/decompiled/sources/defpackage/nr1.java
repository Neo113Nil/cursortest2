package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nr1 extends u1 {
    @Override // defpackage.u1
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    @Override // defpackage.u1
    public final void c(View view, g2 g2Var) {
        int scrollRange;
        AccessibilityNodeInfo accessibilityNodeInfo = g2Var.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        g2Var.h("android.widget.ScrollView");
        if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
            return;
        }
        accessibilityNodeInfo.setScrollable(true);
        if (nestedScrollView.getScrollY() > 0) {
            g2Var.a(b2.f);
            g2Var.a(b2.g);
        }
        if (nestedScrollView.getScrollY() < scrollRange) {
            g2Var.a(b2.e);
            g2Var.a(b2.i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r5 != 16908346) goto L30;
     */
    @Override // defpackage.u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(View view, int i, Bundle bundle) {
        if (super.d(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (nestedScrollView.isEnabled()) {
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max != nestedScrollView.getScrollY()) {
                        nestedScrollView.v(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                        return true;
                    }
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min != nestedScrollView.getScrollY()) {
                nestedScrollView.v(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
                return true;
            }
        }
        return false;
    }
}
