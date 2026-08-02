package H;

import E.C0001b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class f extends C0001b {
    @Override // E.C0001b
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    @Override // E.C0001b
    public final void b(View view, F.f fVar) {
        int scrollRange;
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f742a;
        this.f404a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityNodeInfo.setClassName("android.widget.ScrollView");
        if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
            return;
        }
        accessibilityNodeInfo.setScrollable(true);
        if (nestedScrollView.getScrollY() > 0) {
            accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) F.d.f736d.f739a);
            accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) F.d.f737e.f739a);
        }
        if (nestedScrollView.getScrollY() < scrollRange) {
            accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) F.d.f735c.f739a);
            accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) F.d.f738f.f739a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r6 != 16908346) goto L30;
     */
    @Override // E.C0001b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(View view, int i4, Bundle bundle) {
        if (super.c(view, i4, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (nestedScrollView.isEnabled()) {
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i4 != 4096) {
                if (i4 == 8192 || i4 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max != nestedScrollView.getScrollY()) {
                        nestedScrollView.t(0 - nestedScrollView.getScrollX(), true, max - nestedScrollView.getScrollY());
                        return true;
                    }
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min != nestedScrollView.getScrollY()) {
                nestedScrollView.t(0 - nestedScrollView.getScrollX(), true, min - nestedScrollView.getScrollY());
                return true;
            }
        }
        return false;
    }
}
