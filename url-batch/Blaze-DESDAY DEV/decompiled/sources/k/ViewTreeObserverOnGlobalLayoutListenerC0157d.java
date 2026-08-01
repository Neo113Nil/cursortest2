package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0194N;
import l.C0197Q;
import l.K0;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0157d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2670a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2671b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0157d(int i, Object obj) {
        this.f2670a = i;
        this.f2671b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f2670a) {
            case 0:
                ViewOnKeyListenerC0160g viewOnKeyListenerC0160g = (ViewOnKeyListenerC0160g) this.f2671b;
                if (viewOnKeyListenerC0160g.a()) {
                    ArrayList arrayList = viewOnKeyListenerC0160g.h;
                    if (arrayList.size() > 0 && !((C0159f) arrayList.get(0)).f2675a.f2829y) {
                        View view = viewOnKeyListenerC0160g.f2688o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0159f) it.next()).f2675a.i();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0160g.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC0152D viewOnKeyListenerC0152D = (ViewOnKeyListenerC0152D) this.f2671b;
                if (viewOnKeyListenerC0152D.a()) {
                    K0 k02 = viewOnKeyListenerC0152D.h;
                    if (!k02.f2829y) {
                        View view2 = viewOnKeyListenerC0152D.f2645m;
                        if (view2 != null && view2.isShown()) {
                            k02.i();
                            break;
                        } else {
                            viewOnKeyListenerC0152D.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                C0197Q c0197q = (C0197Q) this.f2671b;
                if (!c0197q.getInternalPopup().a()) {
                    c0197q.f2872f.g(c0197q.getTextDirection(), c0197q.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c0197q.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                C0194N c0194n = (C0194N) this.f2671b;
                C0197Q c0197q2 = c0194n.f2860G;
                c0194n.getClass();
                if (!c0197q2.isAttachedToWindow() || !c0197q2.getGlobalVisibleRect(c0194n.f2859E)) {
                    c0194n.dismiss();
                    break;
                } else {
                    c0194n.r();
                    c0194n.i();
                    break;
                }
                break;
        }
    }
}
