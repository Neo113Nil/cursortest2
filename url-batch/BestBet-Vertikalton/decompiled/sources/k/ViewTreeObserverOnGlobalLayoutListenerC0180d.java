package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0216M;
import l.C0219P;
import l.J0;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0180d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3121b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0180d(int i, Object obj) {
        this.f3120a = i;
        this.f3121b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f3120a) {
            case 0:
                ViewOnKeyListenerC0183g viewOnKeyListenerC0183g = (ViewOnKeyListenerC0183g) this.f3121b;
                if (viewOnKeyListenerC0183g.a()) {
                    ArrayList arrayList = viewOnKeyListenerC0183g.h;
                    if (arrayList.size() > 0 && !((C0182f) arrayList.get(0)).f3125a.f3282y) {
                        View view = viewOnKeyListenerC0183g.f3138o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0182f) it.next()).f3125a.i();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0183g.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC0175E viewOnKeyListenerC0175E = (ViewOnKeyListenerC0175E) this.f3121b;
                if (viewOnKeyListenerC0175E.a()) {
                    J0 j02 = viewOnKeyListenerC0175E.h;
                    if (!j02.f3282y) {
                        View view2 = viewOnKeyListenerC0175E.f3095m;
                        if (view2 != null && view2.isShown()) {
                            j02.i();
                            break;
                        } else {
                            viewOnKeyListenerC0175E.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                C0219P c0219p = (C0219P) this.f3121b;
                if (!c0219p.getInternalPopup().a()) {
                    c0219p.f3325f.g(c0219p.getTextDirection(), c0219p.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c0219p.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                C0216M c0216m = (C0216M) this.f3121b;
                C0219P c0219p2 = c0216m.f3313G;
                c0216m.getClass();
                if (!c0219p2.isAttachedToWindow() || !c0219p2.getGlobalVisibleRect(c0216m.f3312E)) {
                    c0216m.dismiss();
                    break;
                } else {
                    c0216m.s();
                    c0216m.i();
                    break;
                }
                break;
        }
    }
}
