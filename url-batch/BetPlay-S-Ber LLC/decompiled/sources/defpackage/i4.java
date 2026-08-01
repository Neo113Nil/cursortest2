package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class i4 extends vw {
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;

    public /* synthetic */ i4(int i, Object obj) {
        this.o = i;
        this.p = obj;
    }

    @Override // defpackage.v90
    public final void a() {
        int i = this.o;
        Object obj = this.p;
        switch (i) {
            case 0:
                t4 t4Var = ((g4) obj).g;
                t4Var.A.setAlpha(1.0f);
                t4Var.D.d(null);
                t4Var.D = null;
                break;
            case 1:
                t4 t4Var2 = (t4) obj;
                t4Var2.A.setAlpha(1.0f);
                t4Var2.D.d(null);
                t4Var2.D = null;
                break;
            default:
                t4 t4Var3 = (t4) ((h5) obj).h;
                t4Var3.A.setVisibility(8);
                PopupWindow popupWindow = t4Var3.B;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (t4Var3.A.getParent() instanceof View) {
                    View view = (View) t4Var3.A.getParent();
                    WeakHashMap weakHashMap = e90.a;
                    view.requestApplyInsets();
                }
                t4Var3.A.e();
                t4Var3.D.d(null);
                t4Var3.D = null;
                ViewGroup viewGroup = t4Var3.G;
                WeakHashMap weakHashMap2 = e90.a;
                viewGroup.requestApplyInsets();
                break;
        }
    }

    @Override // defpackage.vw, defpackage.v90
    public void c() {
        int i = this.o;
        Object obj = this.p;
        switch (i) {
            case 0:
                ((g4) obj).g.A.setVisibility(0);
                break;
            case 1:
                t4 t4Var = (t4) obj;
                t4Var.A.setVisibility(0);
                if (t4Var.A.getParent() instanceof View) {
                    View view = (View) t4Var.A.getParent();
                    WeakHashMap weakHashMap = e90.a;
                    view.requestApplyInsets();
                    break;
                }
                break;
        }
    }
}
