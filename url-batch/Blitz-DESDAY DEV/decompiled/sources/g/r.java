package g;

import M.Q;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r extends z1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2336a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2337b;

    public /* synthetic */ r(int i, Object obj) {
        this.f2336a = i;
        this.f2337b = obj;
    }

    @Override // M.Z
    public final void a() {
        Object obj = this.f2337b;
        switch (this.f2336a) {
            case 0:
                p pVar = (p) obj;
                pVar.f2333b.f2232v.setAlpha(1.0f);
                LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A = pVar.f2333b;
                layoutInflaterFactory2C0101A.f2235y.d(null);
                layoutInflaterFactory2C0101A.f2235y = null;
                break;
            case 1:
                LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A2 = (LayoutInflaterFactory2C0101A) obj;
                layoutInflaterFactory2C0101A2.f2232v.setAlpha(1.0f);
                layoutInflaterFactory2C0101A2.f2235y.d(null);
                layoutInflaterFactory2C0101A2.f2235y = null;
                break;
            default:
                D.j jVar = (D.j) obj;
                ((LayoutInflaterFactory2C0101A) jVar.f134c).f2232v.setVisibility(8);
                LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A3 = (LayoutInflaterFactory2C0101A) jVar.f134c;
                PopupWindow popupWindow = layoutInflaterFactory2C0101A3.f2233w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0101A3.f2232v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0101A3.f2232v.getParent();
                    WeakHashMap weakHashMap = Q.f513a;
                    M.D.c(view);
                }
                layoutInflaterFactory2C0101A3.f2232v.e();
                layoutInflaterFactory2C0101A3.f2235y.d(null);
                layoutInflaterFactory2C0101A3.f2235y = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0101A3.f2188B;
                WeakHashMap weakHashMap2 = Q.f513a;
                M.D.c(viewGroup);
                break;
        }
    }

    @Override // z1.l, M.Z
    public void g() {
        Object obj = this.f2337b;
        switch (this.f2336a) {
            case 0:
                ((p) obj).f2333b.f2232v.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A = (LayoutInflaterFactory2C0101A) obj;
                layoutInflaterFactory2C0101A.f2232v.setVisibility(0);
                if (layoutInflaterFactory2C0101A.f2232v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0101A.f2232v.getParent();
                    WeakHashMap weakHashMap = Q.f513a;
                    M.D.c(view);
                    break;
                }
                break;
        }
    }
}
