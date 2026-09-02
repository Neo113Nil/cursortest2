package j;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import k.C1188L;

/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1170c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f13610b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1170c(l lVar, int i4) {
        this.f13609a = i4;
        this.f13610b = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f13609a) {
            case 0:
                g gVar = (g) this.f13610b;
                ArrayList arrayList = gVar.f13626h;
                if (gVar.c() && arrayList.size() > 0) {
                    int i4 = 0;
                    if (!((f) arrayList.get(0)).f13617a.f13941u) {
                        View view = gVar.o;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i4 < size) {
                                Object obj = arrayList.get(i4);
                                i4++;
                                ((f) obj).f13617a.show();
                            }
                            break;
                        } else {
                            gVar.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                s sVar = (s) this.f13610b;
                C1188L c1188l = sVar.f13709h;
                if (sVar.c() && !c1188l.f13941u) {
                    View view2 = sVar.f13714m;
                    if (view2 != null && view2.isShown()) {
                        c1188l.show();
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
