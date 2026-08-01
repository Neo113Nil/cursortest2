package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ta implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ta(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 1:
                dn dnVar = (dn) obj;
                AccessibilityManager accessibilityManager = dnVar.y;
                if (dnVar.z != null && accessibilityManager != null && dnVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(dnVar.z);
                    break;
                }
                break;
            case 2:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = hm0.a;
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
                wa waVar = (wa) obj;
                ViewTreeObserver viewTreeObserver = waVar.D;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        waVar.D = view.getViewTreeObserver();
                    }
                    waVar.D.removeGlobalOnLayoutListener(waVar.o);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                dn dnVar = (dn) obj;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = dnVar.z;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = dnVar.y) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj;
                et etVar = hideBottomViewOnScrollBehavior.h;
                if (etVar != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(etVar);
                    hideBottomViewOnScrollBehavior.h = null;
                    break;
                }
                break;
            case 4:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj;
                et etVar2 = hideViewOnScrollBehavior.c;
                if (etVar2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(etVar2);
                    hideViewOnScrollBehavior.c = null;
                    break;
                }
                break;
            default:
                cf0 cf0Var = (cf0) obj;
                ViewTreeObserver viewTreeObserver2 = cf0Var.u;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        cf0Var.u = view.getViewTreeObserver();
                    }
                    cf0Var.u.removeGlobalOnLayoutListener(cf0Var.o);
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
