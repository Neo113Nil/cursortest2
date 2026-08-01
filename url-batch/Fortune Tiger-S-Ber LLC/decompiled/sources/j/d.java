package j;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import k.h2;
import k.l0;
import k.o0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2134f;
    public final /* synthetic */ Object g;

    public /* synthetic */ d(int i4, Object obj) {
        this.f2134f = i4;
        this.g = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f2134f) {
            case 0:
                g gVar = (g) this.g;
                ArrayList arrayList = gVar.f2164n;
                if (gVar.b() && arrayList.size() > 0) {
                    int i4 = 0;
                    if (!((f) arrayList.get(0)).f2157a.D) {
                        View view = gVar.f2171u;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i4 < size) {
                                Object obj = arrayList.get(i4);
                                i4++;
                                ((f) obj).f2157a.c();
                            }
                            break;
                        } else {
                            gVar.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                d0 d0Var = (d0) this.g;
                h2 h2Var = d0Var.f2140n;
                if (d0Var.b() && !h2Var.D) {
                    View view2 = d0Var.f2145s;
                    if (view2 != null && view2.isShown()) {
                        h2Var.c();
                        break;
                    } else {
                        d0Var.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                o0 o0Var = (o0) this.g;
                if (!o0Var.getInternalPopup().b()) {
                    o0Var.f2608k.m(o0Var.getTextDirection(), o0Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = o0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                l0 l0Var = (l0) this.g;
                o0 o0Var2 = l0Var.L;
                l0Var.getClass();
                if (!o0Var2.isAttachedToWindow() || !o0Var2.getGlobalVisibleRect(l0Var.J)) {
                    l0Var.dismiss();
                    break;
                } else {
                    l0Var.s();
                    l0Var.c();
                    break;
                }
                break;
        }
    }
}
