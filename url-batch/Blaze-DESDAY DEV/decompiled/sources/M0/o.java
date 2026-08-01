package M0;

import K.T;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import k.ViewOnKeyListenerC0152D;
import k.ViewOnKeyListenerC0160g;

/* loaded from: classes.dex */
public final class o implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f616a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f617b;

    public /* synthetic */ o(int i, Object obj) {
        this.f616a = i;
        this.f617b = obj;
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
        Object obj = this.f617b;
        switch (this.f616a) {
            case 0:
                q qVar = (q) obj;
                if (qVar.f638u != null && (accessibilityManager = qVar.f637t) != null) {
                    WeakHashMap weakHashMap = T.f440a;
                    if (qVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new L.b(qVar.f638u));
                        break;
                    }
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = T.f440a;
                K.F.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f616a) {
            case 0:
                q qVar = (q) this.f617b;
                k kVar = qVar.f638u;
                if (kVar != null && (accessibilityManager = qVar.f637t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new L.b(kVar));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ViewOnKeyListenerC0160g viewOnKeyListenerC0160g = (ViewOnKeyListenerC0160g) this.f617b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0160g.f2697x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0160g.f2697x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0160g.f2697x.removeGlobalOnLayoutListener(viewOnKeyListenerC0160g.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC0152D viewOnKeyListenerC0152D = (ViewOnKeyListenerC0152D) this.f617b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0152D.f2647o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0152D.f2647o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0152D.f2647o.removeGlobalOnLayoutListener(viewOnKeyListenerC0152D.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
