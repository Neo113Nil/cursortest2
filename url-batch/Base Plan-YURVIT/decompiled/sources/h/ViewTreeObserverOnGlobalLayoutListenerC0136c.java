package h;

import android.view.View;
import android.view.ViewTreeObserver;
import i.N;
import java.util.ArrayList;

/* renamed from: h.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0136c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1967e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f1968f;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0136c(l lVar, int i2) {
        this.f1967e = i2;
        this.f1968f = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f1967e) {
            case 0:
                ViewOnKeyListenerC0140g viewOnKeyListenerC0140g = (ViewOnKeyListenerC0140g) this.f1968f;
                ArrayList arrayList = viewOnKeyListenerC0140g.f1988l;
                if (viewOnKeyListenerC0140g.j() && arrayList.size() > 0) {
                    int i2 = 0;
                    if (!((C0139f) arrayList.get(0)).f1975a.f2154y) {
                        View view = viewOnKeyListenerC0140g.f1995s;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj = arrayList.get(i2);
                                i2++;
                                ((C0139f) obj).f1975a.c();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0140g.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                s sVar = (s) this.f1968f;
                N n2 = sVar.f2074l;
                if (sVar.j() && !n2.f2154y) {
                    View view2 = sVar.f2079q;
                    if (view2 != null && view2.isShown()) {
                        n2.c();
                        break;
                    } else {
                        sVar.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
