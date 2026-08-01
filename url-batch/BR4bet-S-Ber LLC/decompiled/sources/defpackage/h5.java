package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class h5 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ h5(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                q5 q5Var = (q5) obj;
                if (!q5Var.getInternalPopup().b()) {
                    q5Var.k.n(q5Var.getTextDirection(), q5Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = q5Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            case 1:
                n5 n5Var = (n5) obj;
                q5 q5Var2 = n5Var.L;
                if (!q5Var2.isAttachedToWindow() || !q5Var2.getGlobalVisibleRect(n5Var.J)) {
                    n5Var.dismiss();
                    break;
                } else {
                    n5Var.s();
                    n5Var.d();
                    break;
                }
                break;
            case 2:
                da daVar = (da) obj;
                ArrayList arrayList = daVar.n;
                if (daVar.b() && arrayList.size() > 0) {
                    int i2 = 0;
                    if (!((ca) arrayList.get(0)).a.D) {
                        View view = daVar.u;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                ((ca) obj2).a.d();
                            }
                            break;
                        } else {
                            daVar.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                w60 w60Var = (w60) obj;
                bx bxVar = w60Var.n;
                if (w60Var.b() && !bxVar.D) {
                    View view2 = w60Var.s;
                    if (view2 != null && view2.isShown()) {
                        bxVar.d();
                        break;
                    } else {
                        w60Var.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
