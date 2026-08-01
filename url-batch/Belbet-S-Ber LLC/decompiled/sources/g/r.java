package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import n0.p0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class r extends b4.d {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1568o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1569p;

    public /* synthetic */ r(int i, Object obj) {
        this.f1568o = i;
        this.f1569p = obj;
    }

    @Override // n0.u0
    public final void b() {
        int i = this.f1568o;
        Object obj = this.f1569p;
        switch (i) {
            case 0:
                a0 a0Var = ((p) obj).f1565g;
                a0Var.A.setAlpha(1.0f);
                a0Var.D.d(null);
                a0Var.D = null;
                break;
            case 1:
                a0 a0Var2 = (a0) obj;
                a0Var2.A.setAlpha(1.0f);
                a0Var2.D.d(null);
                a0Var2.D = null;
                break;
            default:
                a0 a0Var3 = (a0) ((androidx.emoji2.text.q) obj).h;
                a0Var3.A.setVisibility(8);
                PopupWindow popupWindow = a0Var3.B;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (a0Var3.A.getParent() instanceof View) {
                    View view = (View) a0Var3.A.getParent();
                    WeakHashMap weakHashMap = p0.f2816a;
                    view.requestApplyInsets();
                }
                a0Var3.A.e();
                a0Var3.D.d(null);
                a0Var3.D = null;
                ViewGroup viewGroup = a0Var3.G;
                WeakHashMap weakHashMap2 = p0.f2816a;
                viewGroup.requestApplyInsets();
                break;
        }
    }

    @Override // b4.d, n0.u0
    public void g() {
        int i = this.f1568o;
        Object obj = this.f1569p;
        switch (i) {
            case 0:
                ((p) obj).f1565g.A.setVisibility(0);
                break;
            case 1:
                a0 a0Var = (a0) obj;
                a0Var.A.setVisibility(0);
                if (a0Var.A.getParent() instanceof View) {
                    View view = (View) a0Var.A.getParent();
                    WeakHashMap weakHashMap = p0.f2816a;
                    view.requestApplyInsets();
                    break;
                }
                break;
        }
    }
}
