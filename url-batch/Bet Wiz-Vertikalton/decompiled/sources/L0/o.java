package L0;

import K.S;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import k.ViewOnKeyListenerC0146D;
import k.ViewOnKeyListenerC0154g;

/* loaded from: classes.dex */
public final class o implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f588a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f589b;

    public /* synthetic */ o(int i, Object obj) {
        this.f588a = i;
        this.f589b = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.f589b;
        switch (this.f588a) {
            case 0:
                q qVar = (q) obj;
                if (qVar.f610u != null && (accessibilityManager = qVar.f609t) != null) {
                    WeakHashMap weakHashMap = S.f422a;
                    if (qVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new L.b(qVar.f610u));
                        break;
                    }
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = S.f422a;
                K.E.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f588a) {
            case 0:
                q qVar = (q) this.f589b;
                k kVar = qVar.f610u;
                if (kVar != null && (accessibilityManager = qVar.f609t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new L.b(kVar));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ViewOnKeyListenerC0154g viewOnKeyListenerC0154g = (ViewOnKeyListenerC0154g) this.f589b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0154g.f2645x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0154g.f2645x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0154g.f2645x.removeGlobalOnLayoutListener(viewOnKeyListenerC0154g.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC0146D viewOnKeyListenerC0146D = (ViewOnKeyListenerC0146D) this.f589b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0146D.f2595o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0146D.f2595o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0146D.f2595o.removeGlobalOnLayoutListener(viewOnKeyListenerC0146D.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
