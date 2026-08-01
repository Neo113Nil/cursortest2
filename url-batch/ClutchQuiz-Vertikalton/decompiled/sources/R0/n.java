package R0;

import K.E;
import K.S;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import k.ViewOnKeyListenerC0153D;
import k.ViewOnKeyListenerC0161g;

/* loaded from: classes.dex */
public final class n implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f685a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f686b;

    public /* synthetic */ n(int i, Object obj) {
        this.f685a = i;
        this.f686b = obj;
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
        Object obj = this.f686b;
        switch (this.f685a) {
            case 0:
                p pVar = (p) obj;
                if (pVar.f707u != null && (accessibilityManager = pVar.f706t) != null) {
                    WeakHashMap weakHashMap = S.f365a;
                    if (pVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new L.b(pVar.f707u));
                        break;
                    }
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = S.f365a;
                E.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f685a) {
            case 0:
                p pVar = (p) this.f686b;
                P.b bVar = pVar.f707u;
                if (bVar != null && (accessibilityManager = pVar.f706t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new L.b(bVar));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ViewOnKeyListenerC0161g viewOnKeyListenerC0161g = (ViewOnKeyListenerC0161g) this.f686b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0161g.f2730x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0161g.f2730x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0161g.f2730x.removeGlobalOnLayoutListener(viewOnKeyListenerC0161g.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC0153D viewOnKeyListenerC0153D = (ViewOnKeyListenerC0153D) this.f686b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0153D.f2680o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0153D.f2680o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0153D.f2680o.removeGlobalOnLayoutListener(viewOnKeyListenerC0153D.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
