package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0218O;
import l.C0221S;
import l.L0;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0148d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2638a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2639b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0148d(int i, Object obj) {
        this.f2638a = i;
        this.f2639b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f2638a) {
            case 0:
                ViewOnKeyListenerC0151g viewOnKeyListenerC0151g = (ViewOnKeyListenerC0151g) this.f2639b;
                if (viewOnKeyListenerC0151g.a()) {
                    ArrayList arrayList = viewOnKeyListenerC0151g.h;
                    if (arrayList.size() > 0 && !((C0150f) arrayList.get(0)).f2643a.f2877y) {
                        View view = viewOnKeyListenerC0151g.f2656o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0150f) it.next()).f2643a.i();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0151g.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC0143D viewOnKeyListenerC0143D = (ViewOnKeyListenerC0143D) this.f2639b;
                if (viewOnKeyListenerC0143D.a()) {
                    L0 l02 = viewOnKeyListenerC0143D.h;
                    if (!l02.f2877y) {
                        View view2 = viewOnKeyListenerC0143D.f2613m;
                        if (view2 != null && view2.isShown()) {
                            l02.i();
                            break;
                        } else {
                            viewOnKeyListenerC0143D.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                C0221S c0221s = (C0221S) this.f2639b;
                if (!c0221s.getInternalPopup().a()) {
                    c0221s.f2920f.g(c0221s.getTextDirection(), c0221s.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c0221s.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                C0218O c0218o = (C0218O) this.f2639b;
                C0221S c0221s2 = c0218o.f2908G;
                c0218o.getClass();
                if (!c0221s2.isAttachedToWindow() || !c0221s2.getGlobalVisibleRect(c0218o.f2907E)) {
                    c0218o.dismiss();
                    break;
                } else {
                    c0218o.s();
                    c0218o.i();
                    break;
                }
                break;
        }
    }
}
