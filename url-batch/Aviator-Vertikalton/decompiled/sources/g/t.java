package g;

import K.X;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class t extends q1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2595b;

    public /* synthetic */ t(int i, Object obj) {
        this.f2594a = i;
        this.f2595b = obj;
    }

    @Override // K.f0
    public final void a() {
        Object obj = this.f2595b;
        switch (this.f2594a) {
            case 0:
                r rVar = (r) obj;
                rVar.f2591b.f2478v.setAlpha(1.0f);
                LayoutInflaterFactory2C0141C layoutInflaterFactory2C0141C = rVar.f2591b;
                layoutInflaterFactory2C0141C.f2481y.d(null);
                layoutInflaterFactory2C0141C.f2481y = null;
                break;
            case 1:
                LayoutInflaterFactory2C0141C layoutInflaterFactory2C0141C2 = (LayoutInflaterFactory2C0141C) obj;
                layoutInflaterFactory2C0141C2.f2478v.setAlpha(1.0f);
                layoutInflaterFactory2C0141C2.f2481y.d(null);
                layoutInflaterFactory2C0141C2.f2481y = null;
                break;
            default:
                B.j jVar = (B.j) obj;
                ((LayoutInflaterFactory2C0141C) jVar.f37c).f2478v.setVisibility(8);
                LayoutInflaterFactory2C0141C layoutInflaterFactory2C0141C3 = (LayoutInflaterFactory2C0141C) jVar.f37c;
                PopupWindow popupWindow = layoutInflaterFactory2C0141C3.f2479w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0141C3.f2478v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0141C3.f2478v.getParent();
                    WeakHashMap weakHashMap = X.f418a;
                    K.J.c(view);
                }
                layoutInflaterFactory2C0141C3.f2478v.e();
                layoutInflaterFactory2C0141C3.f2481y.d(null);
                layoutInflaterFactory2C0141C3.f2481y = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0141C3.f2434A;
                WeakHashMap weakHashMap2 = X.f418a;
                K.J.c(viewGroup);
                break;
        }
    }

    @Override // q1.d, K.f0
    public void c() {
        Object obj = this.f2595b;
        switch (this.f2594a) {
            case 0:
                ((r) obj).f2591b.f2478v.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0141C layoutInflaterFactory2C0141C = (LayoutInflaterFactory2C0141C) obj;
                layoutInflaterFactory2C0141C.f2478v.setVisibility(0);
                if (layoutInflaterFactory2C0141C.f2478v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0141C.f2478v.getParent();
                    WeakHashMap weakHashMap = X.f418a;
                    K.J.c(view);
                    break;
                }
                break;
        }
    }
}
