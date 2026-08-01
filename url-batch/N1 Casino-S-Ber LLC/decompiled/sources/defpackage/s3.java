package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class s3 extends o90 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.n90
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                d4 d4Var = ((q3) obj).g;
                d4Var.z.setAlpha(1.0f);
                d4Var.C.d(null);
                d4Var.C = null;
                break;
            case 1:
                d4 d4Var2 = (d4) obj;
                d4Var2.z.setAlpha(1.0f);
                d4Var2.C.d(null);
                d4Var2.C = null;
                break;
            default:
                d4 d4Var3 = (d4) ((q4) obj).h;
                d4Var3.z.setVisibility(8);
                PopupWindow popupWindow = d4Var3.A;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (d4Var3.z.getParent() instanceof View) {
                    View view = (View) d4Var3.z.getParent();
                    WeakHashMap weakHashMap = x80.a;
                    view.requestApplyInsets();
                }
                d4Var3.z.e();
                d4Var3.C.d(null);
                d4Var3.C = null;
                ViewGroup viewGroup = d4Var3.E;
                WeakHashMap weakHashMap2 = x80.a;
                viewGroup.requestApplyInsets();
                break;
        }
    }

    @Override // defpackage.o90, defpackage.n90
    public void c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((q3) obj).g.z.setVisibility(0);
                break;
            case 1:
                d4 d4Var = (d4) obj;
                d4Var.z.setVisibility(0);
                if (d4Var.z.getParent() instanceof View) {
                    View view = (View) d4Var.z.getParent();
                    WeakHashMap weakHashMap = x80.a;
                    view.requestApplyInsets();
                    break;
                }
                break;
        }
    }
}
