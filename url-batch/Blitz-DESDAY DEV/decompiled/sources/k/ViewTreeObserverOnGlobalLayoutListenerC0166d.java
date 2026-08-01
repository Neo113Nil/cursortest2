package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import l.L0;
import l.N;
import l.Q;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0166d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2723b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0166d(int i, Object obj) {
        this.f2722a = i;
        this.f2723b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f2722a) {
            case 0:
                ViewOnKeyListenerC0169g viewOnKeyListenerC0169g = (ViewOnKeyListenerC0169g) this.f2723b;
                if (viewOnKeyListenerC0169g.a()) {
                    ArrayList arrayList = viewOnKeyListenerC0169g.h;
                    if (arrayList.size() > 0 && !((C0168f) arrayList.get(0)).f2727a.f2883y) {
                        View view = viewOnKeyListenerC0169g.f2740o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0168f) it.next()).f2727a.i();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0169g.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC0161D viewOnKeyListenerC0161D = (ViewOnKeyListenerC0161D) this.f2723b;
                if (viewOnKeyListenerC0161D.a()) {
                    L0 l02 = viewOnKeyListenerC0161D.h;
                    if (!l02.f2883y) {
                        View view2 = viewOnKeyListenerC0161D.f2697m;
                        if (view2 != null && view2.isShown()) {
                            l02.i();
                            break;
                        } else {
                            viewOnKeyListenerC0161D.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                Q q2 = (Q) this.f2723b;
                if (!q2.getInternalPopup().a()) {
                    q2.f2926f.g(q2.getTextDirection(), q2.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = q2.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                N n2 = (N) this.f2723b;
                Q q3 = n2.f2908G;
                n2.getClass();
                if (!q3.isAttachedToWindow() || !q3.getGlobalVisibleRect(n2.f2906E)) {
                    n2.dismiss();
                    break;
                } else {
                    n2.r();
                    n2.i();
                    break;
                }
                break;
        }
    }
}
