package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0193M;
import l.C0196P;
import l.J0;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0148d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2606b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0148d(int i, Object obj) {
        this.f2605a = i;
        this.f2606b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f2605a) {
            case 0:
                ViewOnKeyListenerC0151g viewOnKeyListenerC0151g = (ViewOnKeyListenerC0151g) this.f2606b;
                if (viewOnKeyListenerC0151g.a()) {
                    ArrayList arrayList = viewOnKeyListenerC0151g.h;
                    if (arrayList.size() > 0 && !((C0150f) arrayList.get(0)).f2610a.f2844y) {
                        View view = viewOnKeyListenerC0151g.f2623o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0150f) it.next()).f2610a.i();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0151g.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC0143D viewOnKeyListenerC0143D = (ViewOnKeyListenerC0143D) this.f2606b;
                if (viewOnKeyListenerC0143D.a()) {
                    J0 j0 = viewOnKeyListenerC0143D.h;
                    if (!j0.f2844y) {
                        View view2 = viewOnKeyListenerC0143D.f2580m;
                        if (view2 != null && view2.isShown()) {
                            j0.i();
                            break;
                        } else {
                            viewOnKeyListenerC0143D.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                C0196P c0196p = (C0196P) this.f2606b;
                if (!c0196p.getInternalPopup().a()) {
                    c0196p.f2887f.g(c0196p.getTextDirection(), c0196p.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c0196p.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                C0193M c0193m = (C0193M) this.f2606b;
                C0196P c0196p2 = c0193m.f2875G;
                c0193m.getClass();
                if (!c0196p2.isAttachedToWindow() || !c0196p2.getGlobalVisibleRect(c0193m.f2874E)) {
                    c0193m.dismiss();
                    break;
                } else {
                    c0193m.r();
                    c0193m.i();
                    break;
                }
                break;
        }
    }
}
