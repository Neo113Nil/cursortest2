package f;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class s extends k3.m {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1647k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1648l;

    public /* synthetic */ s(int i4, Object obj) {
        this.f1647k = i4;
        this.f1648l = obj;
    }

    @Override // k0.m0
    public final void b() {
        int i4 = this.f1647k;
        Object obj = this.f1648l;
        switch (i4) {
            case 0:
                b0 b0Var = ((q) obj).g;
                b0Var.A.setAlpha(1.0f);
                b0Var.D.d(null);
                b0Var.D = null;
                break;
            case 1:
                b0 b0Var2 = (b0) obj;
                b0Var2.A.setAlpha(1.0f);
                b0Var2.D.d(null);
                b0Var2.D = null;
                break;
            default:
                b0 b0Var3 = (b0) ((a2.s) obj).h;
                b0Var3.A.setVisibility(8);
                PopupWindow popupWindow = b0Var3.B;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (b0Var3.A.getParent() instanceof View) {
                    View view = (View) b0Var3.A.getParent();
                    WeakHashMap weakHashMap = k0.j0.f2752a;
                    k0.z.c(view);
                }
                b0Var3.A.e();
                b0Var3.D.d(null);
                b0Var3.D = null;
                ViewGroup viewGroup = b0Var3.G;
                WeakHashMap weakHashMap2 = k0.j0.f2752a;
                k0.z.c(viewGroup);
                break;
        }
    }

    @Override // k3.m, k0.m0
    public void g() {
        int i4 = this.f1647k;
        Object obj = this.f1648l;
        switch (i4) {
            case 0:
                ((q) obj).g.A.setVisibility(0);
                break;
            case 1:
                b0 b0Var = (b0) obj;
                b0Var.A.setVisibility(0);
                if (b0Var.A.getParent() instanceof View) {
                    View view = (View) b0Var.A.getParent();
                    WeakHashMap weakHashMap = k0.j0.f2752a;
                    k0.z.c(view);
                    break;
                }
                break;
        }
    }
}
