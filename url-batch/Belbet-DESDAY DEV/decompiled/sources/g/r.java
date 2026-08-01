package g;

import K.T;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r extends q1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2342b;

    public /* synthetic */ r(int i, Object obj) {
        this.f2341a = i;
        this.f2342b = obj;
    }

    @Override // K.b0
    public final void a() {
        Object obj = this.f2342b;
        switch (this.f2341a) {
            case 0:
                p pVar = (p) obj;
                pVar.f2338b.f2237v.setAlpha(1.0f);
                LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A = pVar.f2338b;
                layoutInflaterFactory2C0109A.f2240y.d(null);
                layoutInflaterFactory2C0109A.f2240y = null;
                break;
            case 1:
                LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A2 = (LayoutInflaterFactory2C0109A) obj;
                layoutInflaterFactory2C0109A2.f2237v.setAlpha(1.0f);
                layoutInflaterFactory2C0109A2.f2240y.d(null);
                layoutInflaterFactory2C0109A2.f2240y = null;
                break;
            default:
                B.j jVar = (B.j) obj;
                ((LayoutInflaterFactory2C0109A) jVar.f31c).f2237v.setVisibility(8);
                LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A3 = (LayoutInflaterFactory2C0109A) jVar.f31c;
                PopupWindow popupWindow = layoutInflaterFactory2C0109A3.f2238w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0109A3.f2237v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0109A3.f2237v.getParent();
                    WeakHashMap weakHashMap = T.f381a;
                    K.F.c(view);
                }
                layoutInflaterFactory2C0109A3.f2237v.e();
                layoutInflaterFactory2C0109A3.f2240y.d(null);
                layoutInflaterFactory2C0109A3.f2240y = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0109A3.f2193B;
                WeakHashMap weakHashMap2 = T.f381a;
                K.F.c(viewGroup);
                break;
        }
    }

    @Override // q1.l, K.b0
    public void c() {
        Object obj = this.f2342b;
        switch (this.f2341a) {
            case 0:
                ((p) obj).f2338b.f2237v.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A = (LayoutInflaterFactory2C0109A) obj;
                layoutInflaterFactory2C0109A.f2237v.setVisibility(0);
                if (layoutInflaterFactory2C0109A.f2237v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0109A.f2237v.getParent();
                    WeakHashMap weakHashMap = T.f381a;
                    K.F.c(view);
                    break;
                }
                break;
        }
    }
}
