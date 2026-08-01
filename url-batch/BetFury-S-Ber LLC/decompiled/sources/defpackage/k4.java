package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class k4 extends mc0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xm0
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                v4 v4Var = ((i4) obj).g;
                v4Var.z.setAlpha(1.0f);
                v4Var.C.d(null);
                v4Var.C = null;
                break;
            case 1:
                v4 v4Var2 = (v4) obj;
                v4Var2.z.setAlpha(1.0f);
                v4Var2.C.d(null);
                v4Var2.C = null;
                break;
            default:
                v4 v4Var3 = (v4) ((i5) obj).h;
                v4Var3.z.setVisibility(8);
                PopupWindow popupWindow = v4Var3.A;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (v4Var3.z.getParent() instanceof View) {
                    View view = (View) v4Var3.z.getParent();
                    WeakHashMap weakHashMap = hm0.a;
                    view.requestApplyInsets();
                }
                v4Var3.z.e();
                v4Var3.C.d(null);
                v4Var3.C = null;
                ViewGroup viewGroup = v4Var3.F;
                WeakHashMap weakHashMap2 = hm0.a;
                viewGroup.requestApplyInsets();
                break;
        }
    }

    @Override // defpackage.mc0, defpackage.xm0
    public void c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((i4) obj).g.z.setVisibility(0);
                break;
            case 1:
                v4 v4Var = (v4) obj;
                v4Var.z.setVisibility(0);
                if (v4Var.z.getParent() instanceof View) {
                    View view = (View) v4Var.z.getParent();
                    WeakHashMap weakHashMap = hm0.a;
                    view.requestApplyInsets();
                    break;
                }
                break;
        }
    }
}
