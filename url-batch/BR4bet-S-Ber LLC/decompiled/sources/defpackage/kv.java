package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class kv extends y {
    public final /* synthetic */ int d;

    public /* synthetic */ kv(int i) {
        this.d = i;
    }

    @Override // defpackage.y
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 3:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // defpackage.y
    public final void d(View view, k0 k0Var) {
        int scrollRange;
        int i = this.d;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = k0Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, k0Var.a);
                k0Var.h(false);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo2 = k0Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCollectionInfo(null);
                break;
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, k0Var.a);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                k0Var.g(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    k0Var.h(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        k0Var.b(e0.g);
                        k0Var.b(e0.j);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        k0Var.b(e0.f);
                        k0Var.b(e0.k);
                        break;
                    }
                }
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = k0Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setVisibleToUser(false);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r5 != 16908346) goto L32;
     */
    @Override // defpackage.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.d) {
            case 3:
                if (super.g(view, i, bundle)) {
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
                                nestedScrollView.u(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                                return true;
                            }
                        }
                    }
                    int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                    if (min != nestedScrollView.getScrollY()) {
                        nestedScrollView.u(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
                        return true;
                    }
                }
                return false;
            default:
                return super.g(view, i, bundle);
        }
    }
}
