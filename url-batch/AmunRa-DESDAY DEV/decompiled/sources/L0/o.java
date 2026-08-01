package L0;

import K.S;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import k.ViewOnKeyListenerC0144D;
import k.ViewOnKeyListenerC0152g;

/* loaded from: classes.dex */
public final class o implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f524a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f525b;

    public /* synthetic */ o(int i, Object obj) {
        this.f524a = i;
        this.f525b = obj;
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
        Object obj = this.f525b;
        switch (this.f524a) {
            case 0:
                q qVar = (q) obj;
                if (qVar.f546u != null && (accessibilityManager = qVar.f545t) != null) {
                    WeakHashMap weakHashMap = S.f362a;
                    if (qVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new L.b(qVar.f546u));
                        break;
                    }
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = S.f362a;
                K.E.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f524a) {
            case 0:
                q qVar = (q) this.f525b;
                k kVar = qVar.f546u;
                if (kVar != null && (accessibilityManager = qVar.f545t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new L.b(kVar));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ViewOnKeyListenerC0152g viewOnKeyListenerC0152g = (ViewOnKeyListenerC0152g) this.f525b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0152g.f2586x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0152g.f2586x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0152g.f2586x.removeGlobalOnLayoutListener(viewOnKeyListenerC0152g.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC0144D viewOnKeyListenerC0144D = (ViewOnKeyListenerC0144D) this.f525b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0144D.f2536o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0144D.f2536o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0144D.f2536o.removeGlobalOnLayoutListener(viewOnKeyListenerC0144D.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
