package h;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: h.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0137d implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1969a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f1970b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0137d(l lVar, int i2) {
        this.f1969a = i2;
        this.f1970b = lVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i2 = this.f1969a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f1969a) {
            case 0:
                ViewOnKeyListenerC0140g viewOnKeyListenerC0140g = (ViewOnKeyListenerC0140g) this.f1970b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0140g.f1979B;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0140g.f1979B = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0140g.f1979B.removeGlobalOnLayoutListener(viewOnKeyListenerC0140g.f1989m);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                s sVar = (s) this.f1970b;
                ViewTreeObserver viewTreeObserver2 = sVar.f2081s;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        sVar.f2081s = view.getViewTreeObserver();
                    }
                    sVar.f2081s.removeGlobalOnLayoutListener(sVar.f2075m);
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
