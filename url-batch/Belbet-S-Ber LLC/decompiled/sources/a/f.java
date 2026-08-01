package a;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements androidx.lifecycle.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19b;

    public /* synthetic */ f(int i, Object obj) {
        this.f18a = i;
        this.f19b = obj;
    }

    @Override // androidx.lifecycle.p
    public final void a(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
        Window window;
        View peekDecorView;
        switch (this.f18a) {
            case 0:
                g.i iVar = (g.i) this.f19b;
                if (lVar == androidx.lifecycle.l.ON_STOP && (window = iVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                g.i iVar2 = (g.i) this.f19b;
                if (lVar == androidx.lifecycle.l.ON_DESTROY) {
                    iVar2.f48g.f818b = null;
                    if (!iVar2.isChangingConfigurations()) {
                        iVar2.e().a();
                    }
                    k kVar = iVar2.f50k;
                    g.i iVar3 = kVar.i;
                    iVar3.getWindow().getDecorView().removeCallbacks(kVar);
                    iVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar);
                    break;
                }
                break;
            default:
                h1.c cVar = (h1.c) this.f19b;
                i3.d.e(cVar, "this$0");
                if (lVar != androidx.lifecycle.l.ON_START) {
                    if (lVar == androidx.lifecycle.l.ON_STOP) {
                        cVar.f1968c = false;
                        break;
                    }
                } else {
                    cVar.f1968c = true;
                    break;
                }
                break;
        }
    }
}
