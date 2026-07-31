package j;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class d implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4754a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f4755b;

    public /* synthetic */ d(l lVar, int i7) {
        this.f4754a = i7;
        this.f4755b = lVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i7 = this.f4754a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f4754a) {
            case 0:
                g gVar = (g) this.f4755b;
                ViewTreeObserver viewTreeObserver = gVar.f4766C;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        gVar.f4766C = view.getViewTreeObserver();
                    }
                    gVar.f4766C.removeGlobalOnLayoutListener(gVar.f4776n);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                s sVar = (s) this.f4755b;
                ViewTreeObserver viewTreeObserver2 = sVar.f4868t;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        sVar.f4868t = view.getViewTreeObserver();
                    }
                    sVar.f4868t.removeGlobalOnLayoutListener(sVar.f4862n);
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
