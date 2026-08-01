package g;

import L.T;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r extends A1.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2355a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2356b;

    public /* synthetic */ r(int i, Object obj) {
        this.f2355a = i;
        this.f2356b = obj;
    }

    @Override // L.d0
    public final void a() {
        Object obj = this.f2356b;
        switch (this.f2355a) {
            case 0:
                p pVar = (p) obj;
                pVar.f2352b.f2245v.setAlpha(1.0f);
                A a2 = pVar.f2352b;
                a2.f2248y.d(null);
                a2.f2248y = null;
                break;
            case 1:
                A a3 = (A) obj;
                a3.f2245v.setAlpha(1.0f);
                a3.f2248y.d(null);
                a3.f2248y = null;
                break;
            default:
                C.j jVar = (C.j) obj;
                ((A) jVar.f87c).f2245v.setVisibility(8);
                A a4 = (A) jVar.f87c;
                PopupWindow popupWindow = a4.f2246w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (a4.f2245v.getParent() instanceof View) {
                    View view = (View) a4.f2245v.getParent();
                    WeakHashMap weakHashMap = T.f490a;
                    L.F.c(view);
                }
                a4.f2245v.e();
                a4.f2248y.d(null);
                a4.f2248y = null;
                ViewGroup viewGroup = a4.f2201B;
                WeakHashMap weakHashMap2 = T.f490a;
                L.F.c(viewGroup);
                break;
        }
    }

    @Override // A1.m, L.d0
    public void c() {
        Object obj = this.f2356b;
        switch (this.f2355a) {
            case 0:
                ((p) obj).f2352b.f2245v.setVisibility(0);
                break;
            case 1:
                A a2 = (A) obj;
                a2.f2245v.setVisibility(0);
                if (a2.f2245v.getParent() instanceof View) {
                    View view = (View) a2.f2245v.getParent();
                    WeakHashMap weakHashMap = T.f490a;
                    L.F.c(view);
                    break;
                }
                break;
        }
    }
}
