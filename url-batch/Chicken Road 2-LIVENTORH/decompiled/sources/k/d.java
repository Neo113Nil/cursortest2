package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import l.k2;
import l.o0;
import l.r0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2000f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2001g;

    public /* synthetic */ d(int i, Object obj) {
        this.f2000f = i;
        this.f2001g = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f2000f) {
            case 0:
                g gVar = (g) this.f2001g;
                ArrayList arrayList = gVar.f2033m;
                if (gVar.b() && arrayList.size() > 0) {
                    int i = 0;
                    if (!((f) arrayList.get(0)).f2025a.D) {
                        View view = gVar.f2040t;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                i++;
                                ((f) obj).f2025a.f();
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
                d0 d0Var = (d0) this.f2001g;
                k2 k2Var = d0Var.f2007m;
                if (d0Var.b() && !k2Var.D) {
                    View view2 = d0Var.f2012r;
                    if (view2 != null && view2.isShown()) {
                        k2Var.f();
                        break;
                    } else {
                        d0Var.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                r0 r0Var = (r0) this.f2001g;
                if (!r0Var.getInternalPopup().b()) {
                    r0Var.f2429k.e(r0Var.getTextDirection(), r0Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = r0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                o0 o0Var = (o0) this.f2001g;
                r0 r0Var2 = o0Var.L;
                o0Var.getClass();
                if (!r0Var2.isAttachedToWindow() || !r0Var2.getGlobalVisibleRect(o0Var.J)) {
                    o0Var.dismiss();
                    break;
                } else {
                    o0Var.s();
                    o0Var.f();
                    break;
                }
                break;
        }
    }
}
