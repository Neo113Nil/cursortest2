package a;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements androidx.lifecycle.p {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f19f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f20g;

    public /* synthetic */ f(int i, Object obj) {
        this.f19f = i;
        this.f20g = obj;
    }

    @Override // androidx.lifecycle.p
    public final void b(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
        Window window;
        View peekDecorView;
        switch (this.f19f) {
            case 0:
                g.j jVar = (g.j) this.f20g;
                if (lVar == androidx.lifecycle.l.ON_STOP && (window = jVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                g.j jVar2 = (g.j) this.f20g;
                if (lVar == androidx.lifecycle.l.ON_DESTROY) {
                    jVar2.f45g.f717b = null;
                    if (!jVar2.isChangingConfigurations()) {
                        jVar2.d().a();
                    }
                    k kVar = jVar2.f48k;
                    g.j jVar3 = kVar.i;
                    jVar3.getWindow().getDecorView().removeCallbacks(kVar);
                    jVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar);
                    break;
                }
                break;
            default:
                g1.c cVar = (g1.c) this.f20g;
                f3.d.e(cVar, "this$0");
                if (lVar != androidx.lifecycle.l.ON_START) {
                    if (lVar == androidx.lifecycle.l.ON_STOP) {
                        cVar.f1699c = false;
                        break;
                    }
                } else {
                    cVar.f1699c = true;
                    break;
                }
                break;
        }
    }
}
