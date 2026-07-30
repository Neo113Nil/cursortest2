package i;

import I.T;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* renamed from: i.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0533t extends d4.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5483i;
    public final /* synthetic */ Object j;

    public /* synthetic */ C0533t(int i2, Object obj) {
        this.f5483i = i2;
        this.j = obj;
    }

    @Override // I.Z
    public final void a() {
        int i2 = this.f5483i;
        Object obj = this.j;
        switch (i2) {
            case 0:
                LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B = ((RunnableC0530q) obj).f5480e;
                layoutInflaterFactory2C0500B.f5308D.setAlpha(1.0f);
                layoutInflaterFactory2C0500B.f5311G.d(null);
                layoutInflaterFactory2C0500B.f5311G = null;
                break;
            case 1:
                LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B2 = (LayoutInflaterFactory2C0500B) obj;
                layoutInflaterFactory2C0500B2.f5308D.setAlpha(1.0f);
                layoutInflaterFactory2C0500B2.f5311G.d(null);
                layoutInflaterFactory2C0500B2.f5311G = null;
                break;
            default:
                LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B3 = (LayoutInflaterFactory2C0500B) ((P0.e) obj).f2195i;
                layoutInflaterFactory2C0500B3.f5308D.setVisibility(8);
                PopupWindow popupWindow = layoutInflaterFactory2C0500B3.f5309E;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0500B3.f5308D.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0500B3.f5308D.getParent();
                    WeakHashMap weakHashMap = T.f1153a;
                    view.requestApplyInsets();
                }
                layoutInflaterFactory2C0500B3.f5308D.e();
                layoutInflaterFactory2C0500B3.f5311G.d(null);
                layoutInflaterFactory2C0500B3.f5311G = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0500B3.f5313I;
                WeakHashMap weakHashMap2 = T.f1153a;
                viewGroup.requestApplyInsets();
                break;
        }
    }

    @Override // d4.c, I.Z
    public void c() {
        int i2 = this.f5483i;
        Object obj = this.j;
        switch (i2) {
            case 0:
                ((RunnableC0530q) obj).f5480e.f5308D.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B = (LayoutInflaterFactory2C0500B) obj;
                layoutInflaterFactory2C0500B.f5308D.setVisibility(0);
                if (layoutInflaterFactory2C0500B.f5308D.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0500B.f5308D.getParent();
                    WeakHashMap weakHashMap = T.f1153a;
                    view.requestApplyInsets();
                    break;
                }
                break;
        }
    }
}
