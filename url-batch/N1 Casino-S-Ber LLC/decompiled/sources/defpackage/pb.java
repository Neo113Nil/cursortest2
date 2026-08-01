package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final /* synthetic */ class pb implements yp {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yp
    public final void b(aq aqVar, up upVar) {
        Window window;
        View peekDecorView;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                c3 c3Var = (c3) obj;
                if (upVar == up.ON_STOP && (window = c3Var.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                c3 c3Var2 = (c3) obj;
                if (upVar == up.ON_DESTROY) {
                    c3Var2.g.b = null;
                    if (!c3Var2.isChangingConfigurations()) {
                        c3Var2.d().a();
                    }
                    tb tbVar = c3Var2.k;
                    c3 c3Var3 = tbVar.i;
                    c3Var3.getWindow().getDecorView().removeCallbacks(tbVar);
                    c3Var3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(tbVar);
                    break;
                }
                break;
            default:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                if (upVar != up.ON_START) {
                    if (upVar == up.ON_STOP) {
                        i3Var.e = false;
                        break;
                    }
                } else {
                    i3Var.e = true;
                    break;
                }
                break;
        }
    }
}
