package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import l.h2;
import l.l0;
import l.o0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2154f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2155g;

    public /* synthetic */ d(int i, Object obj) {
        this.f2154f = i;
        this.f2155g = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f2154f) {
            case 0:
                g gVar = (g) this.f2155g;
                ArrayList arrayList = gVar.f2186n;
                if (gVar.b() && arrayList.size() > 0) {
                    int i = 0;
                    if (!((f) arrayList.get(0)).f2178a.D) {
                        View view = gVar.f2193u;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                i++;
                                ((f) obj).f2178a.e();
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
                d0 d0Var = (d0) this.f2155g;
                h2 h2Var = d0Var.f2161n;
                if (d0Var.b() && !h2Var.D) {
                    View view2 = d0Var.f2166s;
                    if (view2 != null && view2.isShown()) {
                        h2Var.e();
                        break;
                    } else {
                        d0Var.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                o0 o0Var = (o0) this.f2155g;
                if (!o0Var.getInternalPopup().b()) {
                    o0Var.f2518k.m(o0Var.getTextDirection(), o0Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = o0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                l0 l0Var = (l0) this.f2155g;
                o0 o0Var2 = l0Var.L;
                l0Var.getClass();
                if (!o0Var2.isAttachedToWindow() || !o0Var2.getGlobalVisibleRect(l0Var.J)) {
                    l0Var.dismiss();
                    break;
                } else {
                    l0Var.s();
                    l0Var.e();
                    break;
                }
                break;
        }
    }
}
