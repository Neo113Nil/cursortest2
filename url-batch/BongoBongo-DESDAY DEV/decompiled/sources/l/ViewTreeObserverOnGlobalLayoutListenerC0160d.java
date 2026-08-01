package l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import m.C0196N;
import m.C0199Q;
import m.O0;

/* renamed from: l.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0160d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2771a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2772b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0160d(int i, Object obj) {
        this.f2771a = i;
        this.f2772b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f2771a) {
            case 0:
                ViewOnKeyListenerC0163g viewOnKeyListenerC0163g = (ViewOnKeyListenerC0163g) this.f2772b;
                if (viewOnKeyListenerC0163g.a()) {
                    ArrayList arrayList = viewOnKeyListenerC0163g.f2784h;
                    if (arrayList.size() > 0 && !((C0162f) arrayList.get(0)).f2776a.f2954y) {
                        View view = viewOnKeyListenerC0163g.f2790o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0162f) it.next()).f2776a.j();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0163g.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC0155D viewOnKeyListenerC0155D = (ViewOnKeyListenerC0155D) this.f2772b;
                if (viewOnKeyListenerC0155D.a()) {
                    O0 o02 = viewOnKeyListenerC0155D.f2741h;
                    if (!o02.f2954y) {
                        View view2 = viewOnKeyListenerC0155D.f2745m;
                        if (view2 != null && view2.isShown()) {
                            o02.j();
                            break;
                        } else {
                            viewOnKeyListenerC0155D.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                C0199Q c0199q = (C0199Q) this.f2772b;
                if (!c0199q.getInternalPopup().a()) {
                    c0199q.f2978f.g(c0199q.getTextDirection(), c0199q.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c0199q.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                C0196N c0196n = (C0196N) this.f2772b;
                C0199Q c0199q2 = c0196n.G;
                c0196n.getClass();
                if (!c0199q2.isAttachedToWindow() || !c0199q2.getGlobalVisibleRect(c0196n.f2965E)) {
                    c0196n.dismiss();
                    break;
                } else {
                    c0196n.s();
                    c0196n.j();
                    break;
                }
                break;
        }
    }
}
