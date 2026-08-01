package g;

import K.T;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r extends w1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2234a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2235b;

    public /* synthetic */ r(int i, Object obj) {
        this.f2234a = i;
        this.f2235b = obj;
    }

    @Override // K.d0
    public final void a() {
        Object obj = this.f2235b;
        switch (this.f2234a) {
            case 0:
                p pVar = (p) obj;
                pVar.f2231b.f2130v.setAlpha(1.0f);
                LayoutInflaterFactory2C0090A layoutInflaterFactory2C0090A = pVar.f2231b;
                layoutInflaterFactory2C0090A.f2133y.d(null);
                layoutInflaterFactory2C0090A.f2133y = null;
                break;
            case 1:
                LayoutInflaterFactory2C0090A layoutInflaterFactory2C0090A2 = (LayoutInflaterFactory2C0090A) obj;
                layoutInflaterFactory2C0090A2.f2130v.setAlpha(1.0f);
                layoutInflaterFactory2C0090A2.f2133y.d(null);
                layoutInflaterFactory2C0090A2.f2133y = null;
                break;
            default:
                B.j jVar = (B.j) obj;
                ((LayoutInflaterFactory2C0090A) jVar.f32c).f2130v.setVisibility(8);
                LayoutInflaterFactory2C0090A layoutInflaterFactory2C0090A3 = (LayoutInflaterFactory2C0090A) jVar.f32c;
                PopupWindow popupWindow = layoutInflaterFactory2C0090A3.f2131w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0090A3.f2130v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0090A3.f2130v.getParent();
                    WeakHashMap weakHashMap = T.f423a;
                    K.F.c(view);
                }
                layoutInflaterFactory2C0090A3.f2130v.e();
                layoutInflaterFactory2C0090A3.f2133y.d(null);
                layoutInflaterFactory2C0090A3.f2133y = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0090A3.f2086B;
                WeakHashMap weakHashMap2 = T.f423a;
                K.F.c(viewGroup);
                break;
        }
    }

    @Override // w1.d, K.d0
    public void c() {
        Object obj = this.f2235b;
        switch (this.f2234a) {
            case 0:
                ((p) obj).f2231b.f2130v.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0090A layoutInflaterFactory2C0090A = (LayoutInflaterFactory2C0090A) obj;
                layoutInflaterFactory2C0090A.f2130v.setVisibility(0);
                if (layoutInflaterFactory2C0090A.f2130v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0090A.f2130v.getParent();
                    WeakHashMap weakHashMap = T.f423a;
                    K.F.c(view);
                    break;
                }
                break;
        }
    }
}
