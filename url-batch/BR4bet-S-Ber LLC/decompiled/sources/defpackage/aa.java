package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class aa implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ aa(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 1:
                pk pkVar = (pk) obj;
                AccessibilityManager accessibilityManager = pkVar.y;
                if (pkVar.z != null && accessibilityManager != null && pkVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(pkVar.z);
                    break;
                }
                break;
            case 2:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = ic0.a;
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
                da daVar = (da) obj;
                ViewTreeObserver viewTreeObserver = daVar.D;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        daVar.D = view.getViewTreeObserver();
                    }
                    daVar.D.removeGlobalOnLayoutListener(daVar.o);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                pk pkVar = (pk) obj;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = pkVar.z;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = pkVar.y) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj;
                np npVar = hideBottomViewOnScrollBehavior.h;
                if (npVar != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(npVar);
                    hideBottomViewOnScrollBehavior.h = null;
                    break;
                }
                break;
            case 4:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj;
                np npVar2 = hideViewOnScrollBehavior.c;
                if (npVar2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(npVar2);
                    hideViewOnScrollBehavior.c = null;
                    break;
                }
                break;
            default:
                w60 w60Var = (w60) obj;
                ViewTreeObserver viewTreeObserver2 = w60Var.u;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        w60Var.u = view.getViewTreeObserver();
                    }
                    w60Var.u.removeGlobalOnLayoutListener(w60Var.o);
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
