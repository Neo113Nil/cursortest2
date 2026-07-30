package g;

import android.view.View;
import android.view.ViewTreeObserver;
import h.M;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: g.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0131c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f1935f;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0131c(l lVar, int i2) {
        this.f1934e = i2;
        this.f1935f = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f1934e) {
            case 0:
                ViewOnKeyListenerC0135g viewOnKeyListenerC0135g = (ViewOnKeyListenerC0135g) this.f1935f;
                if (viewOnKeyListenerC0135g.c()) {
                    ArrayList arrayList = viewOnKeyListenerC0135g.f1955l;
                    if (arrayList.size() > 0 && !((C0134f) arrayList.get(0)).f1942a.f2123y) {
                        View view = viewOnKeyListenerC0135g.f1961s;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0134f) it.next()).f1942a.g();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0135g.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                s sVar = (s) this.f1935f;
                if (sVar.c()) {
                    M m2 = sVar.f2041l;
                    if (!m2.f2123y) {
                        View view2 = sVar.f2046q;
                        if (view2 != null && view2.isShown()) {
                            m2.g();
                            break;
                        } else {
                            sVar.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
