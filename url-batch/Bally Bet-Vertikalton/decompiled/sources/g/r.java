package g;

import K.T;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r extends q1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2344b;

    public /* synthetic */ r(int i, Object obj) {
        this.f2343a = i;
        this.f2344b = obj;
    }

    @Override // K.b0
    public final void a() {
        Object obj = this.f2344b;
        switch (this.f2343a) {
            case 0:
                p pVar = (p) obj;
                pVar.f2340b.f2239v.setAlpha(1.0f);
                LayoutInflaterFactory2C0110A layoutInflaterFactory2C0110A = pVar.f2340b;
                layoutInflaterFactory2C0110A.f2242y.d(null);
                layoutInflaterFactory2C0110A.f2242y = null;
                break;
            case 1:
                LayoutInflaterFactory2C0110A layoutInflaterFactory2C0110A2 = (LayoutInflaterFactory2C0110A) obj;
                layoutInflaterFactory2C0110A2.f2239v.setAlpha(1.0f);
                layoutInflaterFactory2C0110A2.f2242y.d(null);
                layoutInflaterFactory2C0110A2.f2242y = null;
                break;
            default:
                B.j jVar = (B.j) obj;
                ((LayoutInflaterFactory2C0110A) jVar.f31c).f2239v.setVisibility(8);
                LayoutInflaterFactory2C0110A layoutInflaterFactory2C0110A3 = (LayoutInflaterFactory2C0110A) jVar.f31c;
                PopupWindow popupWindow = layoutInflaterFactory2C0110A3.f2240w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0110A3.f2239v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0110A3.f2239v.getParent();
                    WeakHashMap weakHashMap = T.f381a;
                    K.F.c(view);
                }
                layoutInflaterFactory2C0110A3.f2239v.e();
                layoutInflaterFactory2C0110A3.f2242y.d(null);
                layoutInflaterFactory2C0110A3.f2242y = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0110A3.f2195B;
                WeakHashMap weakHashMap2 = T.f381a;
                K.F.c(viewGroup);
                break;
        }
    }

    @Override // q1.l, K.b0
    public void c() {
        Object obj = this.f2344b;
        switch (this.f2343a) {
            case 0:
                ((p) obj).f2340b.f2239v.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0110A layoutInflaterFactory2C0110A = (LayoutInflaterFactory2C0110A) obj;
                layoutInflaterFactory2C0110A.f2239v.setVisibility(0);
                if (layoutInflaterFactory2C0110A.f2239v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0110A.f2239v.getParent();
                    WeakHashMap weakHashMap = T.f381a;
                    K.F.c(view);
                    break;
                }
                break;
        }
    }
}
