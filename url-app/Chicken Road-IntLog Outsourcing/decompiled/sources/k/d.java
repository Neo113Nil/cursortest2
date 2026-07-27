package k;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class d implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f10551b;

    public /* synthetic */ d(k kVar, int i2) {
        this.f10550a = i2;
        this.f10551b = kVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i2 = this.f10550a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f10550a) {
            case 0:
                f fVar = (f) this.f10551b;
                ViewTreeObserver viewTreeObserver = fVar.f10577x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.f10577x = view.getViewTreeObserver();
                    }
                    fVar.f10577x.removeGlobalOnLayoutListener(fVar.f10562i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                r rVar = (r) this.f10551b;
                ViewTreeObserver viewTreeObserver2 = rVar.f10659o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        rVar.f10659o = view.getViewTreeObserver();
                    }
                    rVar.f10659o.removeGlobalOnLayoutListener(rVar.f10653i);
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
