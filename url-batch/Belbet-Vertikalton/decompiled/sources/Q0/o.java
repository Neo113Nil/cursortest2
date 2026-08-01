package Q0;

import M.P;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import m.ViewOnKeyListenerC0215D;
import m.ViewOnKeyListenerC0223g;

/* loaded from: classes.dex */
public final class o implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1038b;

    public /* synthetic */ o(int i, Object obj) {
        this.f1037a = i;
        this.f1038b = obj;
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
        Object obj = this.f1038b;
        switch (this.f1037a) {
            case 0:
                q qVar = (q) obj;
                if (qVar.f1060u != null && (accessibilityManager = qVar.f1059t) != null) {
                    WeakHashMap weakHashMap = P.f711a;
                    if (qVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new N.b(qVar.f1060u));
                        break;
                    }
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = P.f711a;
                M.C.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f1037a) {
            case 0:
                q qVar = (q) this.f1038b;
                k kVar = qVar.f1060u;
                if (kVar != null && (accessibilityManager = qVar.f1059t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new N.b(kVar));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ViewOnKeyListenerC0223g viewOnKeyListenerC0223g = (ViewOnKeyListenerC0223g) this.f1038b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0223g.f3332x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0223g.f3332x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0223g.f3332x.removeGlobalOnLayoutListener(viewOnKeyListenerC0223g.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC0215D viewOnKeyListenerC0215D = (ViewOnKeyListenerC0215D) this.f1038b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0215D.f3282o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0215D.f3282o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0215D.f3282o.removeGlobalOnLayoutListener(viewOnKeyListenerC0215D.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
