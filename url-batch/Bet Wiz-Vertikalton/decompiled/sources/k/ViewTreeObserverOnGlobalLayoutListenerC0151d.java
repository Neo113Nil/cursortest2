package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0200N;
import l.C0203Q;
import l.K0;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0151d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2619b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0151d(int i, Object obj) {
        this.f2618a = i;
        this.f2619b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f2618a) {
            case 0:
                ViewOnKeyListenerC0154g viewOnKeyListenerC0154g = (ViewOnKeyListenerC0154g) this.f2619b;
                if (viewOnKeyListenerC0154g.a()) {
                    ArrayList arrayList = viewOnKeyListenerC0154g.h;
                    if (arrayList.size() > 0 && !((C0153f) arrayList.get(0)).f2623a.f2865y) {
                        View view = viewOnKeyListenerC0154g.f2636o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0153f) it.next()).f2623a.i();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0154g.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC0146D viewOnKeyListenerC0146D = (ViewOnKeyListenerC0146D) this.f2619b;
                if (viewOnKeyListenerC0146D.a()) {
                    K0 k02 = viewOnKeyListenerC0146D.h;
                    if (!k02.f2865y) {
                        View view2 = viewOnKeyListenerC0146D.f2593m;
                        if (view2 != null && view2.isShown()) {
                            k02.i();
                            break;
                        } else {
                            viewOnKeyListenerC0146D.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                C0203Q c0203q = (C0203Q) this.f2619b;
                if (!c0203q.getInternalPopup().a()) {
                    c0203q.f2908f.f(c0203q.getTextDirection(), c0203q.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c0203q.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                C0200N c0200n = (C0200N) this.f2619b;
                C0203Q c0203q2 = c0200n.f2896G;
                c0200n.getClass();
                if (!c0203q2.isAttachedToWindow() || !c0203q2.getGlobalVisibleRect(c0200n.f2895E)) {
                    c0200n.dismiss();
                    break;
                } else {
                    c0200n.r();
                    c0200n.i();
                    break;
                }
                break;
        }
    }
}
