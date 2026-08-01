package androidx.fragment.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class p0 implements View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f496f;
    public final /* synthetic */ Object g;

    public /* synthetic */ p0(int i4, Object obj) {
        this.f496f = i4;
        this.g = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i4 = this.f496f;
        Object obj = this.g;
        switch (i4) {
            case 0:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = k0.j0.f2752a;
                k0.z.c(view2);
                break;
            case 3:
                j2.r rVar = (j2.r) obj;
                AccessibilityManager accessibilityManager = rVar.f2353y;
                if (rVar.f2354z != null && accessibilityManager != null && rVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(rVar.f2354z);
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
        switch (this.f496f) {
            case 0:
                break;
            case 1:
                j.g gVar = (j.g) this.g;
                ViewTreeObserver viewTreeObserver = gVar.D;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        gVar.D = view.getViewTreeObserver();
                    }
                    gVar.D.removeGlobalOnLayoutListener(gVar.f2165o);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                j.d0 d0Var = (j.d0) this.g;
                ViewTreeObserver viewTreeObserver2 = d0Var.f2147u;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        d0Var.f2147u = view.getViewTreeObserver();
                    }
                    d0Var.f2147u.removeGlobalOnLayoutListener(d0Var.f2141o);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 3:
                j2.r rVar = (j2.r) this.g;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = rVar.f2354z;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = rVar.f2353y) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case 4:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.g;
                o1.a aVar = hideBottomViewOnScrollBehavior.h;
                if (aVar != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(aVar);
                    hideBottomViewOnScrollBehavior.h = null;
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.g;
                o1.a aVar2 = hideViewOnScrollBehavior.c;
                if (aVar2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.f1180b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(aVar2);
                    hideViewOnScrollBehavior.c = null;
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
