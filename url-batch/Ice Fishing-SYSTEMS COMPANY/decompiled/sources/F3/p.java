package F3;

import O.J;
import O.X;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import l.ViewOnKeyListenerC4671C;
import l.ViewOnKeyListenerC4678f;

/* loaded from: classes2.dex */
public final class p implements View.OnAttachStateChangeListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1057n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1058u;

    public /* synthetic */ p(int i, Object obj) {
        this.f1057n = i;
        this.f1058u = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.f1058u;
        switch (this.f1057n) {
            case 0:
                r rVar = (r) obj;
                if (rVar.f1075N != null && (accessibilityManager = rVar.f1074M) != null) {
                    WeakHashMap weakHashMap = X.f2240a;
                    if (rVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new P.b(rVar.f1075N));
                        break;
                    }
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = X.f2240a;
                J.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f1057n) {
            case 0:
                r rVar = (r) this.f1058u;
                l lVar = rVar.f1075N;
                if (lVar != null && (accessibilityManager = rVar.f1074M) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new P.b(lVar));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ViewOnKeyListenerC4678f viewOnKeyListenerC4678f = (ViewOnKeyListenerC4678f) this.f1058u;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC4678f.f38922Q;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC4678f.f38922Q = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC4678f.f38922Q.removeGlobalOnLayoutListener(viewOnKeyListenerC4678f.f38908B);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC4671C viewOnKeyListenerC4671C = (ViewOnKeyListenerC4671C) this.f1058u;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC4671C.f38871H;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC4671C.f38871H = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC4671C.f38871H.removeGlobalOnLayoutListener(viewOnKeyListenerC4671C.f38865B);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
