package g;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: g.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0132d implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f1937b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0132d(l lVar, int i2) {
        this.f1936a = i2;
        this.f1937b = lVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i2 = this.f1936a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f1936a) {
            case 0:
                ViewOnKeyListenerC0135g viewOnKeyListenerC0135g = (ViewOnKeyListenerC0135g) this.f1937b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0135g.f1946B;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0135g.f1946B = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0135g.f1946B.removeGlobalOnLayoutListener(viewOnKeyListenerC0135g.f1956m);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                s sVar = (s) this.f1937b;
                ViewTreeObserver viewTreeObserver2 = sVar.f2047s;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        sVar.f2047s = view.getViewTreeObserver();
                    }
                    sVar.f2047s.removeGlobalOnLayoutListener(sVar.f2042m);
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
