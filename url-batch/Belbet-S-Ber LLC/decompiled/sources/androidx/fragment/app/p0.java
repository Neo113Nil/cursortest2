package androidx.fragment.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class p0 implements View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f618f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f619g;

    public /* synthetic */ p0(int i, Object obj) {
        this.f618f = i;
        this.f619g = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f618f;
        Object obj = this.f619g;
        switch (i) {
            case 0:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = n0.p0.f2816a;
                view2.requestApplyInsets();
                break;
            case 3:
                s2.p pVar = (s2.p) obj;
                AccessibilityManager accessibilityManager = pVar.f3290y;
                if (pVar.f3291z != null && accessibilityManager != null && pVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(pVar.f3291z);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        switch (this.f618f) {
            case 0:
                break;
            case 1:
                k.g gVar = (k.g) this.f619g;
                ViewTreeObserver viewTreeObserver = gVar.D;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        gVar.D = view.getViewTreeObserver();
                    }
                    gVar.D.removeGlobalOnLayoutListener(gVar.f2187o);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                k.d0 d0Var = (k.d0) this.f619g;
                ViewTreeObserver viewTreeObserver2 = d0Var.f2168u;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        d0Var.f2168u = view.getViewTreeObserver();
                    }
                    d0Var.f2168u.removeGlobalOnLayoutListener(d0Var.f2162o);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 3:
                s2.p pVar = (s2.p) this.f619g;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = pVar.f3291z;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = pVar.f3290y) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case 4:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f619g;
                t1.a aVar = hideBottomViewOnScrollBehavior.h;
                if (aVar != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.f911g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(aVar);
                    hideBottomViewOnScrollBehavior.h = null;
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f619g;
                t1.a aVar2 = hideViewOnScrollBehavior.f918c;
                if (aVar2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.f917b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(aVar2);
                    hideViewOnScrollBehavior.f918c = null;
                    break;
                }
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
