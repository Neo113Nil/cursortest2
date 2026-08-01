package androidx.fragment.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class p0 implements View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f506f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f507g;

    public /* synthetic */ p0(int i, Object obj) {
        this.f506f = i;
        this.f507g = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f506f;
        Object obj = this.f507g;
        switch (i) {
            case 0:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = n0.l0.f2757a;
                n0.b0.c(view2);
                break;
            case 3:
                o2.o oVar = (o2.o) obj;
                AccessibilityManager accessibilityManager = oVar.f2929y;
                if (oVar.f2930z != null && accessibilityManager != null && oVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(oVar.f2930z);
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
        switch (this.f506f) {
            case 0:
                break;
            case 1:
                k.g gVar = (k.g) this.f507g;
                ViewTreeObserver viewTreeObserver = gVar.C;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        gVar.C = view.getViewTreeObserver();
                    }
                    gVar.C.removeGlobalOnLayoutListener(gVar.f2034n);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                k.d0 d0Var = (k.d0) this.f507g;
                ViewTreeObserver viewTreeObserver2 = d0Var.f2014t;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        d0Var.f2014t = view.getViewTreeObserver();
                    }
                    d0Var.f2014t.removeGlobalOnLayoutListener(d0Var.f2008n);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 3:
                o2.o oVar = (o2.o) this.f507g;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = oVar.f2930z;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = oVar.f2929y) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case 4:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f507g;
                r1.a aVar = hideBottomViewOnScrollBehavior.f801h;
                if (aVar != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.f800g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(aVar);
                    hideBottomViewOnScrollBehavior.f801h = null;
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f507g;
                r1.a aVar2 = hideViewOnScrollBehavior.f806c;
                if (aVar2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.f805b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(aVar2);
                    hideViewOnScrollBehavior.f806c = null;
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
