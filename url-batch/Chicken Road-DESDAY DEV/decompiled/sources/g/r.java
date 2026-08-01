package g;

import K.S;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r extends u1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2412a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2413b;

    public /* synthetic */ r(int i, Object obj) {
        this.f2412a = i;
        this.f2413b = obj;
    }

    @Override // K.a0
    public final void a() {
        Object obj = this.f2413b;
        switch (this.f2412a) {
            case 0:
                p pVar = (p) obj;
                pVar.f2409b.f2308v.setAlpha(1.0f);
                LayoutInflaterFactory2C0117A layoutInflaterFactory2C0117A = pVar.f2409b;
                layoutInflaterFactory2C0117A.f2311y.d(null);
                layoutInflaterFactory2C0117A.f2311y = null;
                break;
            case 1:
                LayoutInflaterFactory2C0117A layoutInflaterFactory2C0117A2 = (LayoutInflaterFactory2C0117A) obj;
                layoutInflaterFactory2C0117A2.f2308v.setAlpha(1.0f);
                layoutInflaterFactory2C0117A2.f2311y.d(null);
                layoutInflaterFactory2C0117A2.f2311y = null;
                break;
            default:
                B.j jVar = (B.j) obj;
                ((LayoutInflaterFactory2C0117A) jVar.f28c).f2308v.setVisibility(8);
                LayoutInflaterFactory2C0117A layoutInflaterFactory2C0117A3 = (LayoutInflaterFactory2C0117A) jVar.f28c;
                PopupWindow popupWindow = layoutInflaterFactory2C0117A3.f2309w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0117A3.f2308v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0117A3.f2308v.getParent();
                    WeakHashMap weakHashMap = S.f369a;
                    K.E.c(view);
                }
                layoutInflaterFactory2C0117A3.f2308v.e();
                layoutInflaterFactory2C0117A3.f2311y.d(null);
                layoutInflaterFactory2C0117A3.f2311y = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0117A3.f2264B;
                WeakHashMap weakHashMap2 = S.f369a;
                K.E.c(viewGroup);
                break;
        }
    }

    @Override // u1.d, K.a0
    public void c() {
        Object obj = this.f2413b;
        switch (this.f2412a) {
            case 0:
                ((p) obj).f2409b.f2308v.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0117A layoutInflaterFactory2C0117A = (LayoutInflaterFactory2C0117A) obj;
                layoutInflaterFactory2C0117A.f2308v.setVisibility(0);
                if (layoutInflaterFactory2C0117A.f2308v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0117A.f2308v.getParent();
                    WeakHashMap weakHashMap = S.f369a;
                    K.E.c(view);
                    break;
                }
                break;
        }
    }
}
