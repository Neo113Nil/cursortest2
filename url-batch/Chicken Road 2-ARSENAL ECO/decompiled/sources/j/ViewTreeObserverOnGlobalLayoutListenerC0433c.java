package j;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import k.Q;

/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0433c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4752f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f4753g;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0433c(l lVar, int i7) {
        this.f4752f = i7;
        this.f4753g = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f4752f) {
            case 0:
                g gVar = (g) this.f4753g;
                ArrayList arrayList = gVar.f4775m;
                if (gVar.h() && arrayList.size() > 0) {
                    int i7 = 0;
                    if (!((f) arrayList.get(0)).f4761a.f4955z) {
                        View view = gVar.f4782t;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i7 < size) {
                                Object obj = arrayList.get(i7);
                                i7++;
                                ((f) obj).f4761a.b();
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
                s sVar = (s) this.f4753g;
                Q q6 = sVar.f4861m;
                if (sVar.h() && !q6.f4955z) {
                    View view2 = sVar.f4866r;
                    if (view2 != null && view2.isShown()) {
                        q6.b();
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
