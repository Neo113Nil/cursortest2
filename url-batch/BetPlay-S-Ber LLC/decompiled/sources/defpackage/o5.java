package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class o5 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ o5(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                x5 x5Var = (x5) obj;
                if (!x5Var.getInternalPopup().b()) {
                    x5Var.k.n(x5Var.getTextDirection(), x5Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = x5Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            case 1:
                u5 u5Var = (u5) obj;
                x5 x5Var2 = u5Var.L;
                if (!x5Var2.isAttachedToWindow() || !x5Var2.getGlobalVisibleRect(u5Var.J)) {
                    u5Var.dismiss();
                    break;
                } else {
                    u5Var.s();
                    u5Var.d();
                    break;
                }
                break;
            case 2:
                l9 l9Var = (l9) obj;
                ArrayList arrayList = l9Var.n;
                if (l9Var.b() && arrayList.size() > 0) {
                    int i2 = 0;
                    if (!((k9) arrayList.get(0)).a.D) {
                        View view = l9Var.u;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                ((k9) obj2).a.d();
                            }
                            break;
                        } else {
                            l9Var.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                c40 c40Var = (c40) obj;
                pu puVar = c40Var.n;
                if (c40Var.b() && !puVar.D) {
                    View view2 = c40Var.s;
                    if (view2 != null && view2.isShown()) {
                        puVar.d();
                        break;
                    } else {
                        c40Var.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
