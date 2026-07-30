package m;

import I.T;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n.H;
import n.I;
import n.O;
import n.O0;
import n.S;

/* renamed from: m.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0679d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6364e;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0679d(int i2, Object obj) {
        this.f6363d = i2;
        this.f6364e = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i2 = this.f6363d;
        Object obj = this.f6364e;
        switch (i2) {
            case 0:
                g gVar = (g) obj;
                ArrayList arrayList = gVar.f6384p;
                if (gVar.b() && arrayList.size() > 0) {
                    int i5 = 0;
                    if (!((C0681f) arrayList.get(0)).f6367a.f6648F) {
                        View view = gVar.f6391w;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i5 < size) {
                                Object obj2 = arrayList.get(i5);
                                i5++;
                                ((C0681f) obj2).f6367a.c();
                            }
                            break;
                        } else {
                            gVar.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                E e7 = (E) obj;
                O0 o02 = e7.f6333p;
                if (e7.b() && !o02.f6648F) {
                    View view2 = e7.f6338u;
                    if (view2 != null && view2.isShown()) {
                        o02.c();
                        break;
                    } else {
                        e7.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                S s7 = (S) obj;
                if (!s7.getInternalPopup().b()) {
                    s7.f6704n.l(I.b(s7), I.a(s7));
                }
                ViewTreeObserver viewTreeObserver = s7.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    H.a(viewTreeObserver, this);
                    break;
                }
                break;
            default:
                O o7 = (O) obj;
                S s8 = o7.f6686N;
                o7.getClass();
                WeakHashMap weakHashMap = T.f1153a;
                if (!s8.isAttachedToWindow() || !s8.getGlobalVisibleRect(o7.f6684L)) {
                    o7.dismiss();
                    break;
                } else {
                    o7.s();
                    o7.c();
                    break;
                }
                break;
        }
    }
}
