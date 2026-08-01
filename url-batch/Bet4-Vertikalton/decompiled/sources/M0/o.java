package M0;

import K.T;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import k.ViewOnKeyListenerC0150D;
import k.ViewOnKeyListenerC0158g;

/* loaded from: classes.dex */
public final class o implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f600b;

    public /* synthetic */ o(int i, Object obj) {
        this.f599a = i;
        this.f600b = obj;
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
        Object obj = this.f600b;
        switch (this.f599a) {
            case 0:
                q qVar = (q) obj;
                if (qVar.f621u != null && (accessibilityManager = qVar.f620t) != null) {
                    WeakHashMap weakHashMap = T.f423a;
                    if (qVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new L.b(qVar.f621u));
                        break;
                    }
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = T.f423a;
                K.F.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f599a) {
            case 0:
                q qVar = (q) this.f600b;
                k kVar = qVar.f621u;
                if (kVar != null && (accessibilityManager = qVar.f620t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new L.b(kVar));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ViewOnKeyListenerC0158g viewOnKeyListenerC0158g = (ViewOnKeyListenerC0158g) this.f600b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0158g.f2669x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0158g.f2669x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0158g.f2669x.removeGlobalOnLayoutListener(viewOnKeyListenerC0158g.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC0150D viewOnKeyListenerC0150D = (ViewOnKeyListenerC0150D) this.f600b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0150D.f2619o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0150D.f2619o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0150D.f2619o.removeGlobalOnLayoutListener(viewOnKeyListenerC0150D.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
