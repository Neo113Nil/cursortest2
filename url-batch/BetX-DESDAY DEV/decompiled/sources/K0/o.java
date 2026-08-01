package K0;

import K.J;
import K.X;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import k.ViewOnKeyListenerC0188D;
import k.ViewOnKeyListenerC0196g;

/* loaded from: classes.dex */
public final class o implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f567a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f568b;

    public /* synthetic */ o(int i, Object obj) {
        this.f567a = i;
        this.f568b = obj;
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
        Object obj = this.f568b;
        switch (this.f567a) {
            case 0:
                q qVar = (q) obj;
                if (qVar.f591u != null && (accessibilityManager = qVar.f590t) != null) {
                    WeakHashMap weakHashMap = X.f419a;
                    if (qVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new L.b(qVar.f591u));
                        break;
                    }
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = X.f419a;
                J.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f567a) {
            case 0:
                q qVar = (q) this.f568b;
                k kVar = qVar.f591u;
                if (kVar != null && (accessibilityManager = qVar.f590t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new L.b(kVar));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ViewOnKeyListenerC0196g viewOnKeyListenerC0196g = (ViewOnKeyListenerC0196g) this.f568b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0196g.f3043x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0196g.f3043x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0196g.f3043x.removeGlobalOnLayoutListener(viewOnKeyListenerC0196g.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC0188D viewOnKeyListenerC0188D = (ViewOnKeyListenerC0188D) this.f568b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0188D.f2990o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0188D.f2990o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0188D.f2990o.removeGlobalOnLayoutListener(viewOnKeyListenerC0188D.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
