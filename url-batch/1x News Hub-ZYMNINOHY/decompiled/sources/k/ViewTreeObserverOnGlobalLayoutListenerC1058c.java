package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import l.N;

/* renamed from: k.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1058c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9559a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC1067l f9560b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1058c(AbstractC1067l abstractC1067l, int i3) {
        this.f9559a = i3;
        this.f9560b = abstractC1067l;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f9559a) {
            case 0:
                ViewOnKeyListenerC1062g viewOnKeyListenerC1062g = (ViewOnKeyListenerC1062g) this.f9560b;
                if (viewOnKeyListenerC1062g.k()) {
                    ArrayList arrayList = viewOnKeyListenerC1062g.f9576h;
                    if (arrayList.size() > 0 && !((C1061f) arrayList.get(0)).f9568a.f9751u) {
                        View view = viewOnKeyListenerC1062g.o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C1061f) it.next()).f9568a.d();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC1062g.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                ViewOnKeyListenerC1074s viewOnKeyListenerC1074s = (ViewOnKeyListenerC1074s) this.f9560b;
                if (viewOnKeyListenerC1074s.k()) {
                    N n3 = viewOnKeyListenerC1074s.f9657h;
                    if (!n3.f9751u) {
                        View view2 = viewOnKeyListenerC1074s.f9662m;
                        if (view2 != null && view2.isShown()) {
                            n3.d();
                            break;
                        } else {
                            viewOnKeyListenerC1074s.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
