package com.google.android.material.datepicker;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class f extends k0.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1287d;

    public /* synthetic */ f(int i4) {
        this.f1287d = i4;
    }

    @Override // k0.b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1287d) {
            case 4:
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

    @Override // k0.b
    public final void d(View view, l0.e eVar) {
        int scrollRange;
        switch (this.f1287d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = eVar.f2855a;
                this.f2714a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = eVar.f2855a;
                this.f2714a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setScrollable(false);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = eVar.f2855a;
                this.f2714a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCollectionInfo(null);
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo4 = eVar.f2855a;
                this.f2714a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setVisibleToUser(false);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo5 = eVar.f2855a;
                this.f2714a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo5);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                eVar.g(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    accessibilityNodeInfo5.setScrollable(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        eVar.b(l0.d.g);
                        eVar.b(l0.d.f2850j);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        eVar.b(l0.d.f2848f);
                        eVar.b(l0.d.f2851k);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r6 != 16908346) goto L32;
     */
    @Override // k0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean g(View view, int i4, Bundle bundle) {
        switch (this.f1287d) {
            case 4:
                if (super.g(view, i4, bundle)) {
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
                        if (i4 != 8192 && i4 != 16908344) {
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
                return super.g(view, i4, bundle);
        }
    }
}
