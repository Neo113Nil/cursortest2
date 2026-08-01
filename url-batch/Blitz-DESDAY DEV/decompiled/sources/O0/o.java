package O0;

import M.Q;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import k.ViewOnKeyListenerC0161D;
import k.ViewOnKeyListenerC0169g;

/* loaded from: classes.dex */
public final class o implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f686a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f687b;

    public /* synthetic */ o(int i, Object obj) {
        this.f686a = i;
        this.f687b = obj;
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
        Object obj = this.f687b;
        switch (this.f686a) {
            case 0:
                q qVar = (q) obj;
                if (qVar.f708u != null && (accessibilityManager = qVar.f707t) != null) {
                    WeakHashMap weakHashMap = Q.f513a;
                    if (qVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new N.b(qVar.f708u));
                        break;
                    }
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = Q.f513a;
                M.D.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f686a) {
            case 0:
                q qVar = (q) this.f687b;
                k kVar = qVar.f708u;
                if (kVar != null && (accessibilityManager = qVar.f707t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new N.b(kVar));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ViewOnKeyListenerC0169g viewOnKeyListenerC0169g = (ViewOnKeyListenerC0169g) this.f687b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0169g.f2749x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0169g.f2749x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0169g.f2749x.removeGlobalOnLayoutListener(viewOnKeyListenerC0169g.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC0161D viewOnKeyListenerC0161D = (ViewOnKeyListenerC0161D) this.f687b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0161D.f2699o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0161D.f2699o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0161D.f2699o.removeGlobalOnLayoutListener(viewOnKeyListenerC0161D.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
