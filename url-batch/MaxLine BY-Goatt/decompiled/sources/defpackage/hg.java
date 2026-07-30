package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hg implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ hg(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                qg qgVar = (qg) obj;
                if (!qgVar.getInternalPopup().a()) {
                    qgVar.r.m(qgVar.getTextDirection(), qgVar.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = qgVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            case 1:
                ng ngVar = (ng) obj;
                qg qgVar2 = ngVar.R;
                if (!qgVar2.isAttachedToWindow() || !qgVar2.getGlobalVisibleRect(ngVar.P)) {
                    ngVar.dismiss();
                    break;
                } else {
                    ngVar.s();
                    ngVar.c();
                    break;
                }
                break;
            case 2:
                at atVar = (at) obj;
                ArrayList arrayList = atVar.t;
                if (atVar.a() && arrayList.size() > 0) {
                    int i2 = 0;
                    if (!((zs) arrayList.get(0)).a.J) {
                        View view = atVar.A;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                ((zs) obj2).a.c();
                            }
                            break;
                        } else {
                            atVar.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                lo2 lo2Var = (lo2) obj;
                xk1 xk1Var = lo2Var.t;
                if (lo2Var.a() && !xk1Var.J) {
                    View view2 = lo2Var.y;
                    if (view2 != null && view2.isShown()) {
                        xk1Var.c();
                        break;
                    } else {
                        lo2Var.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
