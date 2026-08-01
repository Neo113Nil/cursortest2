package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0201N;
import l.C0204Q;
import l.L0;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0152d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2570b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0152d(int i, Object obj) {
        this.f2569a = i;
        this.f2570b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f2569a) {
            case 0:
                ViewOnKeyListenerC0155g viewOnKeyListenerC0155g = (ViewOnKeyListenerC0155g) this.f2570b;
                if (viewOnKeyListenerC0155g.a()) {
                    ArrayList arrayList = viewOnKeyListenerC0155g.h;
                    if (arrayList.size() > 0 && !((C0154f) arrayList.get(0)).f2574a.f2811y) {
                        View view = viewOnKeyListenerC0155g.f2587o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0154f) it.next()).f2574a.i();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0155g.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC0147D viewOnKeyListenerC0147D = (ViewOnKeyListenerC0147D) this.f2570b;
                if (viewOnKeyListenerC0147D.a()) {
                    L0 l02 = viewOnKeyListenerC0147D.h;
                    if (!l02.f2811y) {
                        View view2 = viewOnKeyListenerC0147D.f2544m;
                        if (view2 != null && view2.isShown()) {
                            l02.i();
                            break;
                        } else {
                            viewOnKeyListenerC0147D.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                C0204Q c0204q = (C0204Q) this.f2570b;
                if (!c0204q.getInternalPopup().a()) {
                    c0204q.f2853f.g(c0204q.getTextDirection(), c0204q.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c0204q.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                C0201N c0201n = (C0201N) this.f2570b;
                C0204Q c0204q2 = c0201n.f2835G;
                c0201n.getClass();
                if (!c0204q2.isAttachedToWindow() || !c0204q2.getGlobalVisibleRect(c0201n.f2834E)) {
                    c0201n.dismiss();
                    break;
                } else {
                    c0201n.r();
                    c0201n.i();
                    break;
                }
                break;
        }
    }
}
