package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final /* synthetic */ class pc implements ks {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ pc(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.ks
    public final void f(ms msVar, gs gsVar) {
        Window window;
        View peekDecorView;
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                m3 m3Var = (m3) obj;
                if (gsVar == gs.ON_STOP && (window = m3Var.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                m3 m3Var2 = (m3) obj;
                if (gsVar == gs.ON_DESTROY) {
                    m3Var2.g.b = null;
                    if (!m3Var2.isChangingConfigurations()) {
                        m3Var2.d().a();
                    }
                    tc tcVar = m3Var2.k;
                    m3 m3Var3 = tcVar.i;
                    m3Var3.getWindow().getDecorView().removeCallbacks(tcVar);
                    m3Var3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(tcVar);
                    break;
                }
                break;
            default:
                s3 s3Var = (s3) obj;
                s3Var.getClass();
                if (gsVar != gs.ON_START) {
                    if (gsVar == gs.ON_STOP) {
                        s3Var.e = false;
                        break;
                    }
                } else {
                    s3Var.e = true;
                    break;
                }
                break;
        }
    }
}
