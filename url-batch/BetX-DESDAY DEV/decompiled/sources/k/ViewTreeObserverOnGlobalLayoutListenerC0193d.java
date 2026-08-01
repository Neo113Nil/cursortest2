package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0246O;
import l.C0249S;
import l.L0;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0193d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3015b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0193d(int i, Object obj) {
        this.f3014a = i;
        this.f3015b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f3014a) {
            case 0:
                ViewOnKeyListenerC0196g viewOnKeyListenerC0196g = (ViewOnKeyListenerC0196g) this.f3015b;
                if (viewOnKeyListenerC0196g.a()) {
                    ArrayList arrayList = viewOnKeyListenerC0196g.h;
                    if (arrayList.size() > 0 && !((C0195f) arrayList.get(0)).f3020a.f3251y) {
                        View view = viewOnKeyListenerC0196g.f3034o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0195f) it.next()).f3020a.i();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0196g.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC0188D viewOnKeyListenerC0188D = (ViewOnKeyListenerC0188D) this.f3015b;
                if (viewOnKeyListenerC0188D.a()) {
                    L0 l02 = viewOnKeyListenerC0188D.h;
                    if (!l02.f3251y) {
                        View view2 = viewOnKeyListenerC0188D.f2988m;
                        if (view2 != null && view2.isShown()) {
                            l02.i();
                            break;
                        } else {
                            viewOnKeyListenerC0188D.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                C0249S c0249s = (C0249S) this.f3015b;
                if (!c0249s.getInternalPopup().a()) {
                    c0249s.f3298f.g(c0249s.getTextDirection(), c0249s.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c0249s.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                C0246O c0246o = (C0246O) this.f3015b;
                C0249S c0249s2 = c0246o.f3284G;
                c0246o.getClass();
                if (!c0249s2.isAttachedToWindow() || !c0249s2.getGlobalVisibleRect(c0246o.f3283E)) {
                    c0246o.dismiss();
                    break;
                } else {
                    c0246o.r();
                    c0246o.i();
                    break;
                }
                break;
        }
    }
}
