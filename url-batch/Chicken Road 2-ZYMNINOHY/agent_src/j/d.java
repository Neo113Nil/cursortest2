package j;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class d implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13611a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f13612b;

    public /* synthetic */ d(l lVar, int i4) {
        this.f13611a = i4;
        this.f13612b = lVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i4 = this.f13611a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f13611a) {
            case 0:
                g gVar = (g) this.f13612b;
                ViewTreeObserver viewTreeObserver = gVar.f13639x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        gVar.f13639x = view.getViewTreeObserver();
                    }
                    gVar.f13639x.removeGlobalOnLayoutListener(gVar.f13627i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                s sVar = (s) this.f13612b;
                ViewTreeObserver viewTreeObserver2 = sVar.o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        sVar.o = view.getViewTreeObserver();
                    }
                    sVar.o.removeGlobalOnLayoutListener(sVar.f13710i);
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
