package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class c4 extends mz {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    public /* synthetic */ c4(int i, Object obj) {
        this.j = i;
        this.k = obj;
    }

    @Override // defpackage.yc0
    public final void a() {
        int i = this.j;
        Object obj = this.k;
        switch (i) {
            case 0:
                n4 n4Var = ((a4) obj).g;
                n4Var.z.setAlpha(1.0f);
                n4Var.C.d(null);
                n4Var.C = null;
                break;
            case 1:
                n4 n4Var2 = (n4) obj;
                n4Var2.z.setAlpha(1.0f);
                n4Var2.C.d(null);
                n4Var2.C = null;
                break;
            default:
                n4 n4Var3 = (n4) ((a5) obj).h;
                n4Var3.z.setVisibility(8);
                PopupWindow popupWindow = n4Var3.A;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (n4Var3.z.getParent() instanceof View) {
                    View view = (View) n4Var3.z.getParent();
                    WeakHashMap weakHashMap = ic0.a;
                    view.requestApplyInsets();
                }
                n4Var3.z.e();
                n4Var3.C.d(null);
                n4Var3.C = null;
                ViewGroup viewGroup = n4Var3.F;
                WeakHashMap weakHashMap2 = ic0.a;
                viewGroup.requestApplyInsets();
                break;
        }
    }

    @Override // defpackage.mz, defpackage.yc0
    public void c() {
        int i = this.j;
        Object obj = this.k;
        switch (i) {
            case 0:
                ((a4) obj).g.z.setVisibility(0);
                break;
            case 1:
                n4 n4Var = (n4) obj;
                n4Var.z.setVisibility(0);
                if (n4Var.z.getParent() instanceof View) {
                    View view = (View) n4Var.z.getParent();
                    WeakHashMap weakHashMap = ic0.a;
                    view.requestApplyInsets();
                    break;
                }
                break;
        }
    }
}
