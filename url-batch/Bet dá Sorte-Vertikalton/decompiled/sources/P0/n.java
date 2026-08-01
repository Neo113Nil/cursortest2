package P0;

import K.S;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import k.ViewOnKeyListenerC0143D;
import k.ViewOnKeyListenerC0151g;

/* loaded from: classes.dex */
public final class n implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f624b;

    public /* synthetic */ n(int i, Object obj) {
        this.f623a = i;
        this.f624b = obj;
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
        Object obj = this.f624b;
        switch (this.f623a) {
            case 0:
                p pVar = (p) obj;
                if (pVar.f645u != null && (accessibilityManager = pVar.f644t) != null) {
                    WeakHashMap weakHashMap = S.f351a;
                    if (pVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new L.b(pVar.f645u));
                        break;
                    }
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = S.f351a;
                K.E.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f623a) {
            case 0:
                p pVar = (p) this.f624b;
                P.b bVar = pVar.f645u;
                if (bVar != null && (accessibilityManager = pVar.f644t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new L.b(bVar));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ViewOnKeyListenerC0151g viewOnKeyListenerC0151g = (ViewOnKeyListenerC0151g) this.f624b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0151g.f2632x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0151g.f2632x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0151g.f2632x.removeGlobalOnLayoutListener(viewOnKeyListenerC0151g.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC0143D viewOnKeyListenerC0143D = (ViewOnKeyListenerC0143D) this.f624b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0143D.f2582o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0143D.f2582o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0143D.f2582o.removeGlobalOnLayoutListener(viewOnKeyListenerC0143D.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
