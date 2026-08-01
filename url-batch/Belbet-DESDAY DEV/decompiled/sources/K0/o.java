package K0;

import K.T;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import k.ViewOnKeyListenerC0143D;
import k.ViewOnKeyListenerC0151g;

/* loaded from: classes.dex */
public final class o implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f517b;

    public /* synthetic */ o(int i, Object obj) {
        this.f516a = i;
        this.f517b = obj;
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
        Object obj = this.f517b;
        switch (this.f516a) {
            case 0:
                q qVar = (q) obj;
                if (qVar.f538u != null && (accessibilityManager = qVar.f537t) != null) {
                    WeakHashMap weakHashMap = T.f381a;
                    if (qVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new L.b(qVar.f538u));
                        break;
                    }
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = T.f381a;
                K.F.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f516a) {
            case 0:
                q qVar = (q) this.f517b;
                k kVar = qVar.f538u;
                if (kVar != null && (accessibilityManager = qVar.f537t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new L.b(kVar));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ViewOnKeyListenerC0151g viewOnKeyListenerC0151g = (ViewOnKeyListenerC0151g) this.f517b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0151g.f2670x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0151g.f2670x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0151g.f2670x.removeGlobalOnLayoutListener(viewOnKeyListenerC0151g.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC0143D viewOnKeyListenerC0143D = (ViewOnKeyListenerC0143D) this.f517b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0143D.f2620o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0143D.f2620o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0143D.f2620o.removeGlobalOnLayoutListener(viewOnKeyListenerC0143D.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
