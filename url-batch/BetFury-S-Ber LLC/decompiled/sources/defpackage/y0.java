package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import defpackage.s00;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class y0 implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ y0(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                ((p1) obj).a();
                break;
            case 1:
                t2 t2Var = (t2) obj;
                t2Var.v.obtainMessage(1, t2Var.b).sendToTarget();
                break;
            case 2:
                l9 l9Var = (l9) obj;
                if (l9Var.p && l9Var.isShowing()) {
                    if (!l9Var.r) {
                        TypedArray obtainStyledAttributes = l9Var.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        l9Var.q = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        l9Var.r = true;
                    }
                    if (l9Var.q) {
                        l9Var.cancel();
                        break;
                    }
                }
                break;
            case 3:
                s00 s00Var = (s00) obj;
                s00.a aVar = s00Var.c0;
                s00.a aVar2 = s00.a.YEAR;
                if (aVar == aVar2) {
                    s00Var.L(s00.a.DAY);
                } else if (aVar == s00.a.DAY) {
                    s00Var.L(aVar2);
                }
                s00Var.M(s00Var.J);
                break;
            default:
                ri0 ri0Var = ((Toolbar) obj).R;
                u10 u10Var = ri0Var == null ? null : ri0Var.g;
                if (u10Var != null) {
                    u10Var.collapseActionView();
                    break;
                }
                break;
        }
    }
}
