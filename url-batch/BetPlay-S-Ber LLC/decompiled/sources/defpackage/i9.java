package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class i9 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ i9(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 1:
                ci ciVar = (ci) obj;
                AccessibilityManager accessibilityManager = ciVar.y;
                if (ciVar.z != null && accessibilityManager != null && ciVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(ciVar.z);
                    break;
                }
                break;
            case 2:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = e90.a;
                view2.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                l9 l9Var = (l9) obj;
                ViewTreeObserver viewTreeObserver = l9Var.D;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        l9Var.D = view.getViewTreeObserver();
                    }
                    l9Var.D.removeGlobalOnLayoutListener(l9Var.o);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                ci ciVar = (ci) obj;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = ciVar.z;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = ciVar.y) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj;
                qn qnVar = hideBottomViewOnScrollBehavior.h;
                if (qnVar != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(qnVar);
                    hideBottomViewOnScrollBehavior.h = null;
                    break;
                }
                break;
            case 4:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj;
                qn qnVar2 = hideViewOnScrollBehavior.c;
                if (qnVar2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(qnVar2);
                    hideViewOnScrollBehavior.c = null;
                    break;
                }
                break;
            default:
                c40 c40Var = (c40) obj;
                ViewTreeObserver viewTreeObserver2 = c40Var.u;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        c40Var.u = view.getViewTreeObserver();
                    }
                    c40Var.u.removeGlobalOnLayoutListener(c40Var.o);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
