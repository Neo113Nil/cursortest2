package m;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import n.C0258N;
import n.C0261Q;
import n.N0;

/* renamed from: m.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0220d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3304a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3305b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0220d(int i, Object obj) {
        this.f3304a = i;
        this.f3305b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f3304a) {
            case 0:
                ViewOnKeyListenerC0223g viewOnKeyListenerC0223g = (ViewOnKeyListenerC0223g) this.f3305b;
                if (viewOnKeyListenerC0223g.a()) {
                    ArrayList arrayList = viewOnKeyListenerC0223g.f3318h;
                    if (arrayList.size() > 0 && !((C0222f) arrayList.get(0)).f3310a.f3481y) {
                        View view = viewOnKeyListenerC0223g.f3323o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0222f) it.next()).f3310a.h();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0223g.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC0215D viewOnKeyListenerC0215D = (ViewOnKeyListenerC0215D) this.f3305b;
                if (viewOnKeyListenerC0215D.a()) {
                    N0 n02 = viewOnKeyListenerC0215D.f3277h;
                    if (!n02.f3481y) {
                        View view2 = viewOnKeyListenerC0215D.f3280m;
                        if (view2 != null && view2.isShown()) {
                            n02.h();
                            break;
                        } else {
                            viewOnKeyListenerC0215D.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                C0261Q c0261q = (C0261Q) this.f3305b;
                if (!c0261q.getInternalPopup().a()) {
                    c0261q.f3514f.f(c0261q.getTextDirection(), c0261q.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c0261q.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                C0258N c0258n = (C0258N) this.f3305b;
                C0261Q c0261q2 = c0258n.f3499G;
                c0258n.getClass();
                if (!c0261q2.isAttachedToWindow() || !c0261q2.getGlobalVisibleRect(c0258n.f3497E)) {
                    c0258n.dismiss();
                    break;
                } else {
                    c0258n.s();
                    c0258n.h();
                    break;
                }
                break;
        }
    }
}
