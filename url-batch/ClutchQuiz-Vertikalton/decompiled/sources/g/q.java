package g;

import K.S;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class q extends A.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2466e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2467f;

    public /* synthetic */ q(int i, Object obj) {
        this.f2466e = i;
        this.f2467f = obj;
    }

    @Override // K.a0
    public final void a() {
        Object obj = this.f2467f;
        switch (this.f2466e) {
            case 0:
                o oVar = (o) obj;
                oVar.f2463b.f2535v.setAlpha(1.0f);
                z zVar = oVar.f2463b;
                zVar.f2538y.d(null);
                zVar.f2538y = null;
                break;
            case 1:
                z zVar2 = (z) obj;
                zVar2.f2535v.setAlpha(1.0f);
                zVar2.f2538y.d(null);
                zVar2.f2538y = null;
                break;
            default:
                B.j jVar = (B.j) obj;
                ((z) jVar.f57c).f2535v.setVisibility(8);
                z zVar3 = (z) jVar.f57c;
                PopupWindow popupWindow = zVar3.f2536w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (zVar3.f2535v.getParent() instanceof View) {
                    View view = (View) zVar3.f2535v.getParent();
                    WeakHashMap weakHashMap = S.f365a;
                    K.E.c(view);
                }
                zVar3.f2535v.e();
                zVar3.f2538y.d(null);
                zVar3.f2538y = null;
                ViewGroup viewGroup = zVar3.f2491A;
                WeakHashMap weakHashMap2 = S.f365a;
                K.E.c(viewGroup);
                break;
        }
    }

    @Override // A.c, K.a0
    public void c() {
        Object obj = this.f2467f;
        switch (this.f2466e) {
            case 0:
                ((o) obj).f2463b.f2535v.setVisibility(0);
                break;
            case 1:
                z zVar = (z) obj;
                zVar.f2535v.setVisibility(0);
                if (zVar.f2535v.getParent() instanceof View) {
                    View view = (View) zVar.f2535v.getParent();
                    WeakHashMap weakHashMap = S.f365a;
                    K.E.c(view);
                    break;
                }
                break;
        }
    }
}
