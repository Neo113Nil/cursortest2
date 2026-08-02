package i;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: i.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0206d implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0213k f2373b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0206d(AbstractC0213k abstractC0213k, int i2) {
        this.f2372a = i2;
        this.f2373b = abstractC0213k;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i2 = this.f2372a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f2372a) {
            case 0:
                ViewOnKeyListenerC0208f viewOnKeyListenerC0208f = (ViewOnKeyListenerC0208f) this.f2373b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0208f.f2378B;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0208f.f2378B = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0208f.f2378B.removeGlobalOnLayoutListener(viewOnKeyListenerC0208f.f2388m);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC0220r viewOnKeyListenerC0220r = (ViewOnKeyListenerC0220r) this.f2373b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0220r.f2481s;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0220r.f2481s = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0220r.f2481s.removeGlobalOnLayoutListener(viewOnKeyListenerC0220r.f2475m);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
