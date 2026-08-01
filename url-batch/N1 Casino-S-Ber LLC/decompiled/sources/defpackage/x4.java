package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class x4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ x4(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                g5 g5Var = (g5) obj;
                if (!g5Var.getInternalPopup().b()) {
                    g5Var.k.n(g5Var.getTextDirection(), g5Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = g5Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            case 1:
                d5 d5Var = (d5) obj;
                g5 g5Var2 = d5Var.L;
                if (!g5Var2.isAttachedToWindow() || !g5Var2.getGlobalVisibleRect(d5Var.J)) {
                    d5Var.dismiss();
                    break;
                } else {
                    d5Var.s();
                    d5Var.d();
                    break;
                }
                break;
            case 2:
                q9 q9Var = (q9) obj;
                ArrayList arrayList = q9Var.n;
                if (q9Var.b() && arrayList.size() > 0) {
                    int i2 = 0;
                    if (!((p9) arrayList.get(0)).a.D) {
                        View view = q9Var.u;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                ((p9) obj2).a.d();
                            }
                            break;
                        } else {
                            q9Var.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                t30 t30Var = (t30) obj;
                au auVar = t30Var.n;
                if (t30Var.b() && !auVar.D) {
                    View view2 = t30Var.s;
                    if (view2 != null && view2.isShown()) {
                        auVar.d();
                        break;
                    } else {
                        t30Var.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
