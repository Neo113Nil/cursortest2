package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0199O;
import l.C0202S;
import l.L0;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0149d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2559a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2560b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0149d(int i, Object obj) {
        this.f2559a = i;
        this.f2560b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f2559a) {
            case 0:
                ViewOnKeyListenerC0152g viewOnKeyListenerC0152g = (ViewOnKeyListenerC0152g) this.f2560b;
                if (viewOnKeyListenerC0152g.a()) {
                    ArrayList arrayList = viewOnKeyListenerC0152g.h;
                    if (arrayList.size() > 0 && !((C0151f) arrayList.get(0)).f2564a.f2960y) {
                        View view = viewOnKeyListenerC0152g.f2577o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0151f) it.next()).f2564a.i();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0152g.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC0144D viewOnKeyListenerC0144D = (ViewOnKeyListenerC0144D) this.f2560b;
                if (viewOnKeyListenerC0144D.a()) {
                    L0 l02 = viewOnKeyListenerC0144D.h;
                    if (!l02.f2960y) {
                        View view2 = viewOnKeyListenerC0144D.f2534m;
                        if (view2 != null && view2.isShown()) {
                            l02.i();
                            break;
                        } else {
                            viewOnKeyListenerC0144D.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                C0202S c0202s = (C0202S) this.f2560b;
                if (!c0202s.getInternalPopup().a()) {
                    c0202s.f3003f.g(c0202s.getTextDirection(), c0202s.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c0202s.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                C0199O c0199o = (C0199O) this.f2560b;
                C0202S c0202s2 = c0199o.f2991G;
                c0199o.getClass();
                if (!c0202s2.isAttachedToWindow() || !c0202s2.getGlobalVisibleRect(c0199o.f2990E)) {
                    c0199o.dismiss();
                    break;
                } else {
                    c0199o.s();
                    c0199o.i();
                    break;
                }
                break;
        }
    }
}
