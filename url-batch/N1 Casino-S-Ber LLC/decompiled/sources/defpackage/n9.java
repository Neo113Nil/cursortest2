package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class n9 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ n9(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 1:
                ki kiVar = (ki) obj;
                AccessibilityManager accessibilityManager = kiVar.y;
                if (kiVar.z != null && accessibilityManager != null && kiVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(kiVar.z);
                    break;
                }
                break;
            case 2:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = x80.a;
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
                q9 q9Var = (q9) obj;
                ViewTreeObserver viewTreeObserver = q9Var.D;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        q9Var.D = view.getViewTreeObserver();
                    }
                    q9Var.D.removeGlobalOnLayoutListener(q9Var.o);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                ki kiVar = (ki) obj;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = kiVar.z;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = kiVar.y) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj;
                bn bnVar = hideBottomViewOnScrollBehavior.h;
                if (bnVar != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(bnVar);
                    hideBottomViewOnScrollBehavior.h = null;
                    break;
                }
                break;
            case 4:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj;
                bn bnVar2 = hideViewOnScrollBehavior.c;
                if (bnVar2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(bnVar2);
                    hideViewOnScrollBehavior.c = null;
                    break;
                }
                break;
            default:
                t30 t30Var = (t30) obj;
                ViewTreeObserver viewTreeObserver2 = t30Var.u;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        t30Var.u = view.getViewTreeObserver();
                    }
                    t30Var.u.removeGlobalOnLayoutListener(t30Var.o);
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
