package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class p5 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ p5(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                y5 y5Var = (y5) obj;
                if (!y5Var.getInternalPopup().b()) {
                    y5Var.k.n(y5Var.getTextDirection(), y5Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = y5Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            case 1:
                v5 v5Var = (v5) obj;
                y5 y5Var2 = v5Var.L;
                if (!y5Var2.isAttachedToWindow() || !y5Var2.getGlobalVisibleRect(v5Var.J)) {
                    v5Var.dismiss();
                    break;
                } else {
                    v5Var.s();
                    v5Var.d();
                    break;
                }
                break;
            case 2:
                wa waVar = (wa) obj;
                ArrayList arrayList = waVar.n;
                if (waVar.b() && arrayList.size() > 0) {
                    int i2 = 0;
                    if (!((va) arrayList.get(0)).a.D) {
                        View view = waVar.u;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                ((va) obj2).a.d();
                            }
                            break;
                        } else {
                            waVar.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                cf0 cf0Var = (cf0) obj;
                f20 f20Var = cf0Var.n;
                if (cf0Var.b() && !f20Var.D) {
                    View view2 = cf0Var.s;
                    if (view2 != null && view2.isShown()) {
                        f20Var.d();
                        break;
                    } else {
                        cf0Var.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
