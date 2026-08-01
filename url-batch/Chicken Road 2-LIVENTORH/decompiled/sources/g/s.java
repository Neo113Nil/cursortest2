package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class s extends h.a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1688k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1689l;

    public /* synthetic */ s(int i, Object obj) {
        this.f1688k = i;
        this.f1689l = obj;
    }

    @Override // n0.q0
    public final void a() {
        int i = this.f1688k;
        Object obj = this.f1689l;
        switch (i) {
            case 0:
                c0 c0Var = ((q) obj).f1685g;
                c0Var.A.setAlpha(1.0f);
                c0Var.D.d(null);
                c0Var.D = null;
                break;
            case 1:
                c0 c0Var2 = (c0) obj;
                c0Var2.A.setAlpha(1.0f);
                c0Var2.D.d(null);
                c0Var2.D = null;
                break;
            default:
                c0 c0Var3 = (c0) ((androidx.emoji2.text.q) obj).f347h;
                c0Var3.A.setVisibility(8);
                PopupWindow popupWindow = c0Var3.B;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (c0Var3.A.getParent() instanceof View) {
                    View view = (View) c0Var3.A.getParent();
                    WeakHashMap weakHashMap = n0.l0.f2757a;
                    n0.b0.c(view);
                }
                c0Var3.A.e();
                c0Var3.D.d(null);
                c0Var3.D = null;
                ViewGroup viewGroup = c0Var3.F;
                WeakHashMap weakHashMap2 = n0.l0.f2757a;
                n0.b0.c(viewGroup);
                break;
        }
    }

    @Override // h.a, n0.q0
    public void c() {
        int i = this.f1688k;
        Object obj = this.f1689l;
        switch (i) {
            case 0:
                ((q) obj).f1685g.A.setVisibility(0);
                break;
            case 1:
                c0 c0Var = (c0) obj;
                c0Var.A.setVisibility(0);
                if (c0Var.A.getParent() instanceof View) {
                    View view = (View) c0Var.A.getParent();
                    WeakHashMap weakHashMap = n0.l0.f2757a;
                    n0.b0.c(view);
                    break;
                }
                break;
        }
    }
}
