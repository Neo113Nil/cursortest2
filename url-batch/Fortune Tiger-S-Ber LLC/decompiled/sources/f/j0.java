package f;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class j0 extends k3.m {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1610k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0 f1611l;

    public /* synthetic */ j0(l0 l0Var, int i4) {
        this.f1610k = i4;
        this.f1611l = l0Var;
    }

    @Override // k0.m0
    public final void b() {
        View view;
        int i4 = this.f1610k;
        l0 l0Var = this.f1611l;
        switch (i4) {
            case 0:
                if (l0Var.f1629t && (view = l0Var.f1621l) != null) {
                    view.setTranslationY(0.0f);
                    l0Var.f1618i.setTranslationY(0.0f);
                }
                l0Var.f1618i.setVisibility(8);
                l0Var.f1618i.setTransitioning(false);
                l0Var.f1633x = null;
                a2.s sVar = l0Var.f1625p;
                if (sVar != null) {
                    sVar.A(l0Var.f1624o);
                    l0Var.f1624o = null;
                    l0Var.f1625p = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = l0Var.h;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = k0.j0.f2752a;
                    k0.z.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                l0Var.f1633x = null;
                l0Var.f1618i.requestLayout();
                break;
        }
    }
}
