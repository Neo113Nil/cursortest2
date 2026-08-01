package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0194M;
import l.C0197P;
import l.J0;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0158d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2703a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2704b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0158d(int i, Object obj) {
        this.f2703a = i;
        this.f2704b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f2703a) {
            case 0:
                ViewOnKeyListenerC0161g viewOnKeyListenerC0161g = (ViewOnKeyListenerC0161g) this.f2704b;
                if (viewOnKeyListenerC0161g.a()) {
                    ArrayList arrayList = viewOnKeyListenerC0161g.h;
                    if (arrayList.size() > 0 && !((C0160f) arrayList.get(0)).f2708a.f2859y) {
                        View view = viewOnKeyListenerC0161g.f2721o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0160f) it.next()).f2708a.i();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0161g.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC0153D viewOnKeyListenerC0153D = (ViewOnKeyListenerC0153D) this.f2704b;
                if (viewOnKeyListenerC0153D.a()) {
                    J0 j02 = viewOnKeyListenerC0153D.h;
                    if (!j02.f2859y) {
                        View view2 = viewOnKeyListenerC0153D.f2678m;
                        if (view2 != null && view2.isShown()) {
                            j02.i();
                            break;
                        } else {
                            viewOnKeyListenerC0153D.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                C0197P c0197p = (C0197P) this.f2704b;
                if (!c0197p.getInternalPopup().a()) {
                    c0197p.f2902f.g(c0197p.getTextDirection(), c0197p.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c0197p.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                C0194M c0194m = (C0194M) this.f2704b;
                C0197P c0197p2 = c0194m.f2890G;
                c0194m.getClass();
                if (!c0197p2.isAttachedToWindow() || !c0197p2.getGlobalVisibleRect(c0194m.f2889E)) {
                    c0194m.dismiss();
                    break;
                } else {
                    c0194m.r();
                    c0194m.i();
                    break;
                }
                break;
        }
    }
}
