package i;

import android.view.View;
import android.view.ViewTreeObserver;
import j.O;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: i.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0205c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0213k f2371f;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0205c(AbstractC0213k abstractC0213k, int i2) {
        this.f2370e = i2;
        this.f2371f = abstractC0213k;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f2370e) {
            case 0:
                ViewOnKeyListenerC0208f viewOnKeyListenerC0208f = (ViewOnKeyListenerC0208f) this.f2371f;
                if (viewOnKeyListenerC0208f.i()) {
                    ArrayList arrayList = viewOnKeyListenerC0208f.f2387l;
                    if (arrayList.size() > 0 && !((C0207e) arrayList.get(0)).f2374a.f2895y) {
                        View view = viewOnKeyListenerC0208f.f2394s;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0207e) it.next()).f2374a.c();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0208f.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                ViewOnKeyListenerC0220r viewOnKeyListenerC0220r = (ViewOnKeyListenerC0220r) this.f2371f;
                if (viewOnKeyListenerC0220r.i()) {
                    O o2 = viewOnKeyListenerC0220r.f2474l;
                    if (!o2.f2895y) {
                        View view2 = viewOnKeyListenerC0220r.f2479q;
                        if (view2 != null && view2.isShown()) {
                            o2.c();
                            break;
                        } else {
                            viewOnKeyListenerC0220r.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
