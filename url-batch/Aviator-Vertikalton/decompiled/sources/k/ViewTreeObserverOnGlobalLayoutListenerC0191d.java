package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0245P;
import l.M0;
import l.T;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0191d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3010a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3011b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0191d(int i, Object obj) {
        this.f3010a = i;
        this.f3011b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f3010a) {
            case 0:
                ViewOnKeyListenerC0194g viewOnKeyListenerC0194g = (ViewOnKeyListenerC0194g) this.f3011b;
                if (viewOnKeyListenerC0194g.a()) {
                    ArrayList arrayList = viewOnKeyListenerC0194g.h;
                    if (arrayList.size() > 0 && !((C0193f) arrayList.get(0)).f3016a.f3251y) {
                        View view = viewOnKeyListenerC0194g.f3030o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0193f) it.next()).f3016a.i();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0194g.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC0186D viewOnKeyListenerC0186D = (ViewOnKeyListenerC0186D) this.f3011b;
                if (viewOnKeyListenerC0186D.a()) {
                    M0 m0 = viewOnKeyListenerC0186D.h;
                    if (!m0.f3251y) {
                        View view2 = viewOnKeyListenerC0186D.f2984m;
                        if (view2 != null && view2.isShown()) {
                            m0.i();
                            break;
                        } else {
                            viewOnKeyListenerC0186D.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                T t2 = (T) this.f3011b;
                if (!t2.getInternalPopup().a()) {
                    t2.f3298f.g(t2.getTextDirection(), t2.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = t2.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                C0245P c0245p = (C0245P) this.f3011b;
                T t3 = c0245p.f3284G;
                c0245p.getClass();
                if (!t3.isAttachedToWindow() || !t3.getGlobalVisibleRect(c0245p.f3283E)) {
                    c0245p.dismiss();
                    break;
                } else {
                    c0245p.s();
                    c0245p.i();
                    break;
                }
                break;
        }
    }
}
