package defpackage;

import android.view.View;
import android.view.Window;
import androidx.fragment.app.b;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class qd implements jx {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ qd(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.jx
    public final void i(lx lxVar, fx fxVar) {
        Window window;
        View peekDecorView;
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                if (fxVar == fx.ON_STOP && (window = bVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                b bVar2 = (b) obj;
                if (fxVar == fx.ON_DESTROY) {
                    bVar2.g.b = null;
                    if (!bVar2.isChangingConfigurations()) {
                        bVar2.d().a();
                    }
                    ud udVar = bVar2.k;
                    b bVar3 = udVar.i;
                    bVar3.getWindow().getDecorView().removeCallbacks(udVar);
                    bVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(udVar);
                    break;
                }
                break;
            default:
                rb0 rb0Var = (rb0) obj;
                if (fxVar != fx.ON_START) {
                    if (fxVar == fx.ON_STOP) {
                        rb0Var.h = false;
                        break;
                    }
                } else {
                    rb0Var.h = true;
                    break;
                }
                break;
        }
    }
}
