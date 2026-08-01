package K0;

import K.J;
import K.X;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import k.ViewOnKeyListenerC0186D;
import k.ViewOnKeyListenerC0194g;

/* loaded from: classes.dex */
public final class o implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f567b;

    public /* synthetic */ o(int i, Object obj) {
        this.f566a = i;
        this.f567b = obj;
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
        Object obj = this.f567b;
        switch (this.f566a) {
            case 0:
                q qVar = (q) obj;
                if (qVar.f590u != null && (accessibilityManager = qVar.f589t) != null) {
                    WeakHashMap weakHashMap = X.f418a;
                    if (qVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new L.b(qVar.f590u));
                        break;
                    }
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = X.f418a;
                J.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f566a) {
            case 0:
                q qVar = (q) this.f567b;
                k kVar = qVar.f590u;
                if (kVar != null && (accessibilityManager = qVar.f589t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new L.b(kVar));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ViewOnKeyListenerC0194g viewOnKeyListenerC0194g = (ViewOnKeyListenerC0194g) this.f567b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0194g.f3039x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0194g.f3039x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0194g.f3039x.removeGlobalOnLayoutListener(viewOnKeyListenerC0194g.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC0186D viewOnKeyListenerC0186D = (ViewOnKeyListenerC0186D) this.f567b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0186D.f2986o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0186D.f2986o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0186D.f2986o.removeGlobalOnLayoutListener(viewOnKeyListenerC0186D.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
