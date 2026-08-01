package g;

import K.T;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r extends z1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2275b;

    public /* synthetic */ r(int i, Object obj) {
        this.f2274a = i;
        this.f2275b = obj;
    }

    @Override // K.d0
    public final void a() {
        Object obj = this.f2275b;
        switch (this.f2274a) {
            case 0:
                p pVar = (p) obj;
                pVar.f2271b.f2170v.setAlpha(1.0f);
                LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A = pVar.f2271b;
                layoutInflaterFactory2C0092A.f2173y.d(null);
                layoutInflaterFactory2C0092A.f2173y = null;
                break;
            case 1:
                LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A2 = (LayoutInflaterFactory2C0092A) obj;
                layoutInflaterFactory2C0092A2.f2170v.setAlpha(1.0f);
                layoutInflaterFactory2C0092A2.f2173y.d(null);
                layoutInflaterFactory2C0092A2.f2173y = null;
                break;
            default:
                B.j jVar = (B.j) obj;
                ((LayoutInflaterFactory2C0092A) jVar.f46c).f2170v.setVisibility(8);
                LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A3 = (LayoutInflaterFactory2C0092A) jVar.f46c;
                PopupWindow popupWindow = layoutInflaterFactory2C0092A3.f2171w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0092A3.f2170v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0092A3.f2170v.getParent();
                    WeakHashMap weakHashMap = T.f440a;
                    K.F.c(view);
                }
                layoutInflaterFactory2C0092A3.f2170v.e();
                layoutInflaterFactory2C0092A3.f2173y.d(null);
                layoutInflaterFactory2C0092A3.f2173y = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0092A3.f2126B;
                WeakHashMap weakHashMap2 = T.f440a;
                K.F.c(viewGroup);
                break;
        }
    }

    @Override // z1.d, K.d0
    public void g() {
        Object obj = this.f2275b;
        switch (this.f2274a) {
            case 0:
                ((p) obj).f2271b.f2170v.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A = (LayoutInflaterFactory2C0092A) obj;
                layoutInflaterFactory2C0092A.f2170v.setVisibility(0);
                if (layoutInflaterFactory2C0092A.f2170v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0092A.f2170v.getParent();
                    WeakHashMap weakHashMap = T.f440a;
                    K.F.c(view);
                    break;
                }
                break;
        }
    }
}
