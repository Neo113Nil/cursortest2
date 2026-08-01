package L0;

import K.S;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import k.ViewOnKeyListenerC0147D;
import k.ViewOnKeyListenerC0155g;

/* loaded from: classes.dex */
public final class o implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f536a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f537b;

    public /* synthetic */ o(int i, Object obj) {
        this.f536a = i;
        this.f537b = obj;
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
        Object obj = this.f537b;
        switch (this.f536a) {
            case 0:
                q qVar = (q) obj;
                if (qVar.f558u != null && (accessibilityManager = qVar.f557t) != null) {
                    WeakHashMap weakHashMap = S.f369a;
                    if (qVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new L.b(qVar.f558u));
                        break;
                    }
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = S.f369a;
                K.E.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f536a) {
            case 0:
                q qVar = (q) this.f537b;
                k kVar = qVar.f558u;
                if (kVar != null && (accessibilityManager = qVar.f557t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new L.b(kVar));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ViewOnKeyListenerC0155g viewOnKeyListenerC0155g = (ViewOnKeyListenerC0155g) this.f537b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0155g.f2596x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0155g.f2596x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0155g.f2596x.removeGlobalOnLayoutListener(viewOnKeyListenerC0155g.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC0147D viewOnKeyListenerC0147D = (ViewOnKeyListenerC0147D) this.f537b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0147D.f2546o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0147D.f2546o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0147D.f2546o.removeGlobalOnLayoutListener(viewOnKeyListenerC0147D.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
