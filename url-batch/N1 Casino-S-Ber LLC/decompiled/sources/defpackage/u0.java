package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class u0 implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ u0(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                ((l1) obj).a();
                break;
            case 1:
                e2 e2Var = (e2) obj;
                e2Var.v.obtainMessage(1, e2Var.b).sendToTarget();
                break;
            case 2:
                l8 l8Var = (l8) obj;
                if (l8Var.p && l8Var.isShowing()) {
                    if (!l8Var.r) {
                        TypedArray obtainStyledAttributes = l8Var.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        l8Var.q = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        l8Var.r = true;
                    }
                    if (l8Var.q) {
                        l8Var.cancel();
                        break;
                    }
                }
                break;
            case 3:
                os osVar = (os) obj;
                int i2 = osVar.c0;
                if (i2 == 2) {
                    osVar.L(1);
                } else if (i2 == 1) {
                    osVar.L(2);
                }
                osVar.M(osVar.J);
                break;
            default:
                d60 d60Var = ((Toolbar) obj).R;
                pt ptVar = d60Var == null ? null : d60Var.g;
                if (ptVar != null) {
                    ptVar.collapseActionView();
                    break;
                }
                break;
        }
    }
}
