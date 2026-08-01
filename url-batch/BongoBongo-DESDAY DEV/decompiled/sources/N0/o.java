package N0;

import L.T;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import l.ViewOnKeyListenerC0155D;
import l.ViewOnKeyListenerC0163g;

/* loaded from: classes.dex */
public final class o implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f673a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f674b;

    public /* synthetic */ o(int i, Object obj) {
        this.f673a = i;
        this.f674b = obj;
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
        Object obj = this.f674b;
        switch (this.f673a) {
            case 0:
                q qVar = (q) obj;
                if (qVar.f696u != null && (accessibilityManager = qVar.f695t) != null) {
                    WeakHashMap weakHashMap = T.f490a;
                    if (qVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new M.b(qVar.f696u));
                        break;
                    }
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = T.f490a;
                L.F.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f673a) {
            case 0:
                q qVar = (q) this.f674b;
                k kVar = qVar.f696u;
                if (kVar != null && (accessibilityManager = qVar.f695t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new M.b(kVar));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ViewOnKeyListenerC0163g viewOnKeyListenerC0163g = (ViewOnKeyListenerC0163g) this.f674b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0163g.f2799x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0163g.f2799x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0163g.f2799x.removeGlobalOnLayoutListener(viewOnKeyListenerC0163g.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC0155D viewOnKeyListenerC0155D = (ViewOnKeyListenerC0155D) this.f674b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0155D.f2747o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0155D.f2747o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0155D.f2747o.removeGlobalOnLayoutListener(viewOnKeyListenerC0155D.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
