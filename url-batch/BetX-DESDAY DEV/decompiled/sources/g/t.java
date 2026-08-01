package g;

import K.X;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class t extends q1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2599b;

    public /* synthetic */ t(int i, Object obj) {
        this.f2598a = i;
        this.f2599b = obj;
    }

    @Override // K.f0
    public final void a() {
        Object obj = this.f2599b;
        switch (this.f2598a) {
            case 0:
                r rVar = (r) obj;
                rVar.f2595b.f2482v.setAlpha(1.0f);
                LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C = rVar.f2595b;
                layoutInflaterFactory2C0142C.f2485y.d(null);
                layoutInflaterFactory2C0142C.f2485y = null;
                break;
            case 1:
                LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C2 = (LayoutInflaterFactory2C0142C) obj;
                layoutInflaterFactory2C0142C2.f2482v.setAlpha(1.0f);
                layoutInflaterFactory2C0142C2.f2485y.d(null);
                layoutInflaterFactory2C0142C2.f2485y = null;
                break;
            default:
                B.j jVar = (B.j) obj;
                ((LayoutInflaterFactory2C0142C) jVar.f37c).f2482v.setVisibility(8);
                LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C3 = (LayoutInflaterFactory2C0142C) jVar.f37c;
                PopupWindow popupWindow = layoutInflaterFactory2C0142C3.f2483w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0142C3.f2482v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0142C3.f2482v.getParent();
                    WeakHashMap weakHashMap = X.f419a;
                    K.J.c(view);
                }
                layoutInflaterFactory2C0142C3.f2482v.e();
                layoutInflaterFactory2C0142C3.f2485y.d(null);
                layoutInflaterFactory2C0142C3.f2485y = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0142C3.f2438A;
                WeakHashMap weakHashMap2 = X.f419a;
                K.J.c(viewGroup);
                break;
        }
    }

    @Override // q1.d, K.f0
    public void c() {
        Object obj = this.f2599b;
        switch (this.f2598a) {
            case 0:
                ((r) obj).f2595b.f2482v.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C = (LayoutInflaterFactory2C0142C) obj;
                layoutInflaterFactory2C0142C.f2482v.setVisibility(0);
                if (layoutInflaterFactory2C0142C.f2482v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0142C.f2482v.getParent();
                    WeakHashMap weakHashMap = X.f419a;
                    K.J.c(view);
                    break;
                }
                break;
        }
    }
}
