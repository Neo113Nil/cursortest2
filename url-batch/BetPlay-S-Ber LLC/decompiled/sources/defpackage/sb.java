package defpackage;

import android.view.View;
import android.view.Window;
import androidx.fragment.app.k;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final /* synthetic */ class sb implements lq {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.lq
    public final void b(nq nqVar, gq gqVar) {
        Window window;
        View peekDecorView;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                k kVar = (k) obj;
                if (gqVar == gq.ON_STOP && (window = kVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                k kVar2 = (k) obj;
                if (gqVar == gq.ON_DESTROY) {
                    kVar2.g.b = null;
                    if (!kVar2.isChangingConfigurations()) {
                        kVar2.getViewModelStore().a();
                    }
                    wb wbVar = kVar2.k;
                    k kVar3 = wbVar.i;
                    kVar3.getWindow().getDecorView().removeCallbacks(wbVar);
                    kVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(wbVar);
                    break;
                }
                break;
            default:
                v10 v10Var = (v10) obj;
                v10Var.getClass();
                if (gqVar != gq.ON_START) {
                    if (gqVar == gq.ON_STOP) {
                        v10Var.f = false;
                        break;
                    }
                } else {
                    v10Var.f = true;
                    break;
                }
                break;
        }
    }
}
