package g;

import K.S;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r extends x1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2474b;

    public /* synthetic */ r(int i, Object obj) {
        this.f2473a = i;
        this.f2474b = obj;
    }

    @Override // K.a0
    public final void a() {
        Object obj = this.f2474b;
        switch (this.f2473a) {
            case 0:
                p pVar = (p) obj;
                pVar.f2470b.f2369v.setAlpha(1.0f);
                LayoutInflaterFactory2C0116A layoutInflaterFactory2C0116A = pVar.f2470b;
                layoutInflaterFactory2C0116A.f2372y.d(null);
                layoutInflaterFactory2C0116A.f2372y = null;
                break;
            case 1:
                LayoutInflaterFactory2C0116A layoutInflaterFactory2C0116A2 = (LayoutInflaterFactory2C0116A) obj;
                layoutInflaterFactory2C0116A2.f2369v.setAlpha(1.0f);
                layoutInflaterFactory2C0116A2.f2372y.d(null);
                layoutInflaterFactory2C0116A2.f2372y = null;
                break;
            default:
                B.j jVar = (B.j) obj;
                ((LayoutInflaterFactory2C0116A) jVar.f26c).f2369v.setVisibility(8);
                LayoutInflaterFactory2C0116A layoutInflaterFactory2C0116A3 = (LayoutInflaterFactory2C0116A) jVar.f26c;
                PopupWindow popupWindow = layoutInflaterFactory2C0116A3.f2370w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0116A3.f2369v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0116A3.f2369v.getParent();
                    WeakHashMap weakHashMap = S.f422a;
                    K.E.c(view);
                }
                layoutInflaterFactory2C0116A3.f2369v.e();
                layoutInflaterFactory2C0116A3.f2372y.d(null);
                layoutInflaterFactory2C0116A3.f2372y = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0116A3.f2325B;
                WeakHashMap weakHashMap2 = S.f422a;
                K.E.c(viewGroup);
                break;
        }
    }

    @Override // x1.l, K.a0
    public void c() {
        Object obj = this.f2474b;
        switch (this.f2473a) {
            case 0:
                ((p) obj).f2470b.f2369v.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0116A layoutInflaterFactory2C0116A = (LayoutInflaterFactory2C0116A) obj;
                layoutInflaterFactory2C0116A.f2369v.setVisibility(0);
                if (layoutInflaterFactory2C0116A.f2369v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0116A.f2369v.getParent();
                    WeakHashMap weakHashMap = S.f422a;
                    K.E.c(view);
                    break;
                }
                break;
        }
    }
}
