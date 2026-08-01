package h;

import M.P;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class q extends H1.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2820c;

    public /* synthetic */ q(int i, Object obj) {
        this.f2819b = i;
        this.f2820c = obj;
    }

    @Override // M.X
    public final void a() {
        Object obj = this.f2820c;
        switch (this.f2819b) {
            case 0:
                o oVar = (o) obj;
                oVar.f2816b.f2888v.setAlpha(1.0f);
                z zVar = oVar.f2816b;
                zVar.f2891y.d(null);
                zVar.f2891y = null;
                break;
            case 1:
                z zVar2 = (z) obj;
                zVar2.f2888v.setAlpha(1.0f);
                zVar2.f2891y.d(null);
                zVar2.f2891y = null;
                break;
            default:
                B1.c cVar = (B1.c) obj;
                ((z) cVar.f69c).f2888v.setVisibility(8);
                z zVar3 = (z) cVar.f69c;
                PopupWindow popupWindow = zVar3.f2889w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (zVar3.f2888v.getParent() instanceof View) {
                    View view = (View) zVar3.f2888v.getParent();
                    WeakHashMap weakHashMap = P.f711a;
                    M.C.c(view);
                }
                zVar3.f2888v.e();
                zVar3.f2891y.d(null);
                zVar3.f2891y = null;
                ViewGroup viewGroup = zVar3.f2845B;
                WeakHashMap weakHashMap2 = P.f711a;
                M.C.c(viewGroup);
                break;
        }
    }

    @Override // H1.d, M.X
    public void g() {
        Object obj = this.f2820c;
        switch (this.f2819b) {
            case 0:
                ((o) obj).f2816b.f2888v.setVisibility(0);
                break;
            case 1:
                z zVar = (z) obj;
                zVar.f2888v.setVisibility(0);
                if (zVar.f2888v.getParent() instanceof View) {
                    View view = (View) zVar.f2888v.getParent();
                    WeakHashMap weakHashMap = P.f711a;
                    M.C.c(view);
                    break;
                }
                break;
        }
    }
}
