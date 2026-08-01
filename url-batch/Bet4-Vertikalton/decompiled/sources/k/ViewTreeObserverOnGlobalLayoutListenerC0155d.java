package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0190M;
import l.C0193P;
import l.K0;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0155d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2643b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0155d(int i, Object obj) {
        this.f2642a = i;
        this.f2643b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f2642a) {
            case 0:
                ViewOnKeyListenerC0158g viewOnKeyListenerC0158g = (ViewOnKeyListenerC0158g) this.f2643b;
                if (viewOnKeyListenerC0158g.a()) {
                    ArrayList arrayList = viewOnKeyListenerC0158g.h;
                    if (arrayList.size() > 0 && !((C0157f) arrayList.get(0)).f2647a.f2803y) {
                        View view = viewOnKeyListenerC0158g.f2660o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0157f) it.next()).f2647a.i();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0158g.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC0150D viewOnKeyListenerC0150D = (ViewOnKeyListenerC0150D) this.f2643b;
                if (viewOnKeyListenerC0150D.a()) {
                    K0 k0 = viewOnKeyListenerC0150D.h;
                    if (!k0.f2803y) {
                        View view2 = viewOnKeyListenerC0150D.f2617m;
                        if (view2 != null && view2.isShown()) {
                            k0.i();
                            break;
                        } else {
                            viewOnKeyListenerC0150D.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                C0193P c0193p = (C0193P) this.f2643b;
                if (!c0193p.getInternalPopup().a()) {
                    c0193p.f2845f.g(c0193p.getTextDirection(), c0193p.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c0193p.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                C0190M c0190m = (C0190M) this.f2643b;
                C0193P c0193p2 = c0190m.f2827G;
                c0190m.getClass();
                if (!c0193p2.isAttachedToWindow() || !c0193p2.getGlobalVisibleRect(c0190m.f2826E)) {
                    c0190m.dismiss();
                    break;
                } else {
                    c0190m.r();
                    c0190m.i();
                    break;
                }
                break;
        }
    }
}
