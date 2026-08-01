package U0;

import K.D;
import K.Q;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import k.ViewOnKeyListenerC0175E;
import k.ViewOnKeyListenerC0183g;

/* loaded from: classes.dex */
public final class n implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1166b;

    public /* synthetic */ n(int i, Object obj) {
        this.f1165a = i;
        this.f1166b = obj;
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
        Object obj = this.f1166b;
        switch (this.f1165a) {
            case 0:
                p pVar = (p) obj;
                if (pVar.f1187u != null && (accessibilityManager = pVar.f1186t) != null) {
                    WeakHashMap weakHashMap = Q.f578a;
                    if (pVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new L.b(pVar.f1187u));
                        break;
                    }
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = Q.f578a;
                D.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f1165a) {
            case 0:
                p pVar = (p) this.f1166b;
                P.b bVar = pVar.f1187u;
                if (bVar != null && (accessibilityManager = pVar.f1186t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new L.b(bVar));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ViewOnKeyListenerC0183g viewOnKeyListenerC0183g = (ViewOnKeyListenerC0183g) this.f1166b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0183g.f3147x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0183g.f3147x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0183g.f3147x.removeGlobalOnLayoutListener(viewOnKeyListenerC0183g.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC0175E viewOnKeyListenerC0175E = (ViewOnKeyListenerC0175E) this.f1166b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0175E.f3097o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0175E.f3097o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0175E.f3097o.removeGlobalOnLayoutListener(viewOnKeyListenerC0175E.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
