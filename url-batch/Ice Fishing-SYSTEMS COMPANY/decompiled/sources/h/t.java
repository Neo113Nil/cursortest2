package h;

import O.X;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class t extends com.bumptech.glide.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f38131e;

    public /* synthetic */ t(int i, Object obj) {
        this.f38130d = i;
        this.f38131e = obj;
    }

    @Override // com.bumptech.glide.f, O.f0
    public void b() {
        Object obj = this.f38131e;
        switch (this.f38130d) {
            case 0:
                ((r) obj).f38128u.f37993O.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = (LayoutInflaterFactory2C4535B) obj;
                layoutInflaterFactory2C4535B.f37993O.setVisibility(0);
                if (layoutInflaterFactory2C4535B.f37993O.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C4535B.f37993O.getParent();
                    WeakHashMap weakHashMap = X.f2240a;
                    O.J.c(view);
                    break;
                }
                break;
        }
    }

    @Override // O.f0
    public final void c() {
        Object obj = this.f38131e;
        switch (this.f38130d) {
            case 0:
                LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = ((r) obj).f38128u;
                layoutInflaterFactory2C4535B.f37993O.setAlpha(1.0f);
                layoutInflaterFactory2C4535B.f37996R.d(null);
                layoutInflaterFactory2C4535B.f37996R = null;
                break;
            case 1:
                LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B2 = (LayoutInflaterFactory2C4535B) obj;
                layoutInflaterFactory2C4535B2.f37993O.setAlpha(1.0f);
                layoutInflaterFactory2C4535B2.f37996R.d(null);
                layoutInflaterFactory2C4535B2.f37996R = null;
                break;
            default:
                S0.l lVar = (S0.l) obj;
                ((LayoutInflaterFactory2C4535B) lVar.f2911v).f37993O.setVisibility(8);
                LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B3 = (LayoutInflaterFactory2C4535B) lVar.f2911v;
                PopupWindow popupWindow = layoutInflaterFactory2C4535B3.f37994P;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C4535B3.f37993O.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C4535B3.f37993O.getParent();
                    WeakHashMap weakHashMap = X.f2240a;
                    O.J.c(view);
                }
                layoutInflaterFactory2C4535B3.f37993O.e();
                layoutInflaterFactory2C4535B3.f37996R.d(null);
                layoutInflaterFactory2C4535B3.f37996R = null;
                ViewGroup viewGroup = layoutInflaterFactory2C4535B3.f37998T;
                WeakHashMap weakHashMap2 = X.f2240a;
                O.J.c(viewGroup);
                break;
        }
    }
}
