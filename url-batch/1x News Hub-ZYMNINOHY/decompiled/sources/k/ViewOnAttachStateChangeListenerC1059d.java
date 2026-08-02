package k;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1059d implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC1067l f9562b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC1059d(AbstractC1067l abstractC1067l, int i3) {
        this.f9561a = i3;
        this.f9562b = abstractC1067l;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i3 = this.f9561a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f9561a) {
            case 0:
                ViewOnKeyListenerC1062g viewOnKeyListenerC1062g = (ViewOnKeyListenerC1062g) this.f9562b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC1062g.f9590x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC1062g.f9590x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1062g.f9590x.removeGlobalOnLayoutListener(viewOnKeyListenerC1062g.f9577i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC1074s viewOnKeyListenerC1074s = (ViewOnKeyListenerC1074s) this.f9562b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC1074s.o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC1074s.o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1074s.o.removeGlobalOnLayoutListener(viewOnKeyListenerC1074s.f9658i);
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
