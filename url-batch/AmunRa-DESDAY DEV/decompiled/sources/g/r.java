package g;

import K.S;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r extends s1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2411a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2412b;

    public /* synthetic */ r(int i, Object obj) {
        this.f2411a = i;
        this.f2412b = obj;
    }

    @Override // K.a0
    public final void a() {
        Object obj = this.f2412b;
        switch (this.f2411a) {
            case 0:
                p pVar = (p) obj;
                pVar.f2408b.f2307v.setAlpha(1.0f);
                LayoutInflaterFactory2C0115A layoutInflaterFactory2C0115A = pVar.f2408b;
                layoutInflaterFactory2C0115A.f2310y.d(null);
                layoutInflaterFactory2C0115A.f2310y = null;
                break;
            case 1:
                LayoutInflaterFactory2C0115A layoutInflaterFactory2C0115A2 = (LayoutInflaterFactory2C0115A) obj;
                layoutInflaterFactory2C0115A2.f2307v.setAlpha(1.0f);
                layoutInflaterFactory2C0115A2.f2310y.d(null);
                layoutInflaterFactory2C0115A2.f2310y = null;
                break;
            default:
                B.j jVar = (B.j) obj;
                ((LayoutInflaterFactory2C0115A) jVar.f26c).f2307v.setVisibility(8);
                LayoutInflaterFactory2C0115A layoutInflaterFactory2C0115A3 = (LayoutInflaterFactory2C0115A) jVar.f26c;
                PopupWindow popupWindow = layoutInflaterFactory2C0115A3.f2308w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0115A3.f2307v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0115A3.f2307v.getParent();
                    WeakHashMap weakHashMap = S.f362a;
                    K.E.c(view);
                }
                layoutInflaterFactory2C0115A3.f2307v.e();
                layoutInflaterFactory2C0115A3.f2310y.d(null);
                layoutInflaterFactory2C0115A3.f2310y = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0115A3.f2263B;
                WeakHashMap weakHashMap2 = S.f362a;
                K.E.c(viewGroup);
                break;
        }
    }

    @Override // s1.d, K.a0
    public void c() {
        Object obj = this.f2412b;
        switch (this.f2411a) {
            case 0:
                ((p) obj).f2408b.f2307v.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0115A layoutInflaterFactory2C0115A = (LayoutInflaterFactory2C0115A) obj;
                layoutInflaterFactory2C0115A.f2307v.setVisibility(0);
                if (layoutInflaterFactory2C0115A.f2307v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0115A.f2307v.getParent();
                    WeakHashMap weakHashMap = S.f362a;
                    K.E.c(view);
                    break;
                }
                break;
        }
    }
}
