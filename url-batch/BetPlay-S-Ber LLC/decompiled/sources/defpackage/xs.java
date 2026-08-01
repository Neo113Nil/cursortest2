package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class xs extends w {
    public final /* synthetic */ int a;

    public /* synthetic */ xs(int i) {
        this.a = i;
    }

    @Override // defpackage.w
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.a) {
            case 3:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                break;
        }
    }

    @Override // defpackage.w
    public final void onInitializeAccessibilityNodeInfo(View view, i0 i0Var) {
        int scrollRange;
        switch (this.a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, i0Var);
                i0Var.a.setCollectionInfo(null);
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(view, i0Var);
                i0Var.a.setScrollable(false);
                break;
            case 2:
                super.onInitializeAccessibilityNodeInfo(view, i0Var);
                i0Var.a.setCollectionInfo(null);
                break;
            case 3:
                super.onInitializeAccessibilityNodeInfo(view, i0Var);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                i0Var.g(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    i0Var.a.setScrollable(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        i0Var.b(c0.g);
                        i0Var.b(c0.j);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        i0Var.b(c0.f);
                        i0Var.b(c0.k);
                        break;
                    }
                }
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, i0Var);
                i0Var.a.setVisibleToUser(false);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r5 != 16908346) goto L32;
     */
    @Override // defpackage.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        switch (this.a) {
            case 3:
                if (super.performAccessibilityAction(view, i, bundle)) {
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
                        if (i != 8192 && i != 16908344) {
                            break;
                        } else {
                            int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                            if (max != nestedScrollView.getScrollY()) {
                                nestedScrollView.u(0 - nestedScrollView.getScrollX(), true, max - nestedScrollView.getScrollY());
                                return true;
                            }
                        }
                    }
                    int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                    if (min != nestedScrollView.getScrollY()) {
                        nestedScrollView.u(0 - nestedScrollView.getScrollX(), true, min - nestedScrollView.getScrollY());
                        return true;
                    }
                }
                return false;
            default:
                return super.performAccessibilityAction(view, i, bundle);
        }
    }
}
