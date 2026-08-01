package g;

import K.Q;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import u0.C0385x;

/* loaded from: classes.dex */
public final class r extends H1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2692a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2693b;

    public /* synthetic */ r(int i, Object obj) {
        this.f2692a = i;
        this.f2693b = obj;
    }

    @Override // K.a0
    public final void a() {
        Object obj = this.f2693b;
        switch (this.f2692a) {
            case 0:
                p pVar = (p) obj;
                pVar.f2689b.f2587v.setAlpha(1.0f);
                LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A = pVar.f2689b;
                layoutInflaterFactory2C0112A.f2590y.d(null);
                layoutInflaterFactory2C0112A.f2590y = null;
                break;
            case 1:
                LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A2 = (LayoutInflaterFactory2C0112A) obj;
                layoutInflaterFactory2C0112A2.f2587v.setAlpha(1.0f);
                layoutInflaterFactory2C0112A2.f2590y.d(null);
                layoutInflaterFactory2C0112A2.f2590y = null;
                break;
            default:
                C0385x c0385x = (C0385x) obj;
                ((LayoutInflaterFactory2C0112A) c0385x.f4232c).f2587v.setVisibility(8);
                LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A3 = (LayoutInflaterFactory2C0112A) c0385x.f4232c;
                PopupWindow popupWindow = layoutInflaterFactory2C0112A3.f2588w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0112A3.f2587v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0112A3.f2587v.getParent();
                    WeakHashMap weakHashMap = Q.f578a;
                    K.D.c(view);
                }
                layoutInflaterFactory2C0112A3.f2587v.e();
                layoutInflaterFactory2C0112A3.f2590y.d(null);
                layoutInflaterFactory2C0112A3.f2590y = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0112A3.f2543B;
                WeakHashMap weakHashMap2 = Q.f578a;
                K.D.c(viewGroup);
                break;
        }
    }

    @Override // H1.l, K.a0
    public void g() {
        Object obj = this.f2693b;
        switch (this.f2692a) {
            case 0:
                ((p) obj).f2689b.f2587v.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A = (LayoutInflaterFactory2C0112A) obj;
                layoutInflaterFactory2C0112A.f2587v.setVisibility(0);
                if (layoutInflaterFactory2C0112A.f2587v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0112A.f2587v.getParent();
                    WeakHashMap weakHashMap = Q.f578a;
                    K.D.c(view);
                    break;
                }
                break;
        }
    }
}
