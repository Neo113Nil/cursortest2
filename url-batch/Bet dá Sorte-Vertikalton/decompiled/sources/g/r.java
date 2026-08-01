package g;

import K.S;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r extends u1.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2452c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r(int i, Object obj) {
        this.f2452c = i;
        this.d = obj;
    }

    @Override // K.a0
    public final void a() {
        Object obj = this.d;
        switch (this.f2452c) {
            case 0:
                p pVar = (p) obj;
                pVar.f2449b.f2349v.setAlpha(1.0f);
                LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A = pVar.f2449b;
                layoutInflaterFactory2C0112A.f2352y.d(null);
                layoutInflaterFactory2C0112A.f2352y = null;
                break;
            case 1:
                LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A2 = (LayoutInflaterFactory2C0112A) obj;
                layoutInflaterFactory2C0112A2.f2349v.setAlpha(1.0f);
                layoutInflaterFactory2C0112A2.f2352y.d(null);
                layoutInflaterFactory2C0112A2.f2352y = null;
                break;
            default:
                B.j jVar = (B.j) obj;
                ((LayoutInflaterFactory2C0112A) jVar.f54c).f2349v.setVisibility(8);
                LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A3 = (LayoutInflaterFactory2C0112A) jVar.f54c;
                PopupWindow popupWindow = layoutInflaterFactory2C0112A3.f2350w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0112A3.f2349v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0112A3.f2349v.getParent();
                    WeakHashMap weakHashMap = S.f351a;
                    K.E.c(view);
                }
                layoutInflaterFactory2C0112A3.f2349v.e();
                layoutInflaterFactory2C0112A3.f2352y.d(null);
                layoutInflaterFactory2C0112A3.f2352y = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0112A3.f2305B;
                WeakHashMap weakHashMap2 = S.f351a;
                K.E.c(viewGroup);
                break;
        }
    }

    @Override // u1.d, K.a0
    public void c() {
        Object obj = this.d;
        switch (this.f2452c) {
            case 0:
                ((p) obj).f2449b.f2349v.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A = (LayoutInflaterFactory2C0112A) obj;
                layoutInflaterFactory2C0112A.f2349v.setVisibility(0);
                if (layoutInflaterFactory2C0112A.f2349v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0112A.f2349v.getParent();
                    WeakHashMap weakHashMap = S.f351a;
                    K.E.c(view);
                    break;
                }
                break;
        }
    }
}
