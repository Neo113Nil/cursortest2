package m;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: m.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0680e implements View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f6366e;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0680e(u uVar, int i2) {
        this.f6365d = i2;
        this.f6366e = uVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i2 = this.f6365d;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f6365d) {
            case 0:
                g gVar = (g) this.f6366e;
                ViewTreeObserver viewTreeObserver = gVar.f6375F;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        gVar.f6375F = view.getViewTreeObserver();
                    }
                    gVar.f6375F.removeGlobalOnLayoutListener(gVar.f6385q);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                E e7 = (E) this.f6366e;
                ViewTreeObserver viewTreeObserver2 = e7.f6340w;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        e7.f6340w = view.getViewTreeObserver();
                    }
                    e7.f6340w.removeGlobalOnLayoutListener(e7.f6334q);
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
