package l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import m.G0;
import m.L;
import m.O;

/* renamed from: l.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC4676d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38902n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f38903u;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC4676d(int i, Object obj) {
        this.f38902n = i;
        this.f38903u = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f38902n) {
            case 0:
                ViewOnKeyListenerC4678f viewOnKeyListenerC4678f = (ViewOnKeyListenerC4678f) this.f38903u;
                if (viewOnKeyListenerC4678f.a()) {
                    ArrayList arrayList = viewOnKeyListenerC4678f.f38907A;
                    if (arrayList.size() > 0 && !((C4677e) arrayList.get(0)).f38904a.f39251R) {
                        View view = viewOnKeyListenerC4678f.f38914H;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C4677e) it.next()).f38904a.show();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC4678f.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC4671C viewOnKeyListenerC4671C = (ViewOnKeyListenerC4671C) this.f38903u;
                if (viewOnKeyListenerC4671C.a()) {
                    G0 g02 = viewOnKeyListenerC4671C.f38864A;
                    if (!g02.f39251R) {
                        View view2 = viewOnKeyListenerC4671C.f38869F;
                        if (view2 != null && view2.isShown()) {
                            g02.show();
                            break;
                        } else {
                            viewOnKeyListenerC4671C.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                O o9 = (O) this.f38903u;
                if (!o9.getInternalPopup().a()) {
                    o9.f39318y.j(o9.getTextDirection(), o9.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = o9.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                L l9 = (L) this.f38903u;
                O o10 = l9.f39302Z;
                l9.getClass();
                if (!o10.isAttachedToWindow() || !o10.getGlobalVisibleRect(l9.f39301X)) {
                    l9.dismiss();
                    break;
                } else {
                    l9.o();
                    l9.show();
                    break;
                }
                break;
        }
    }
}
