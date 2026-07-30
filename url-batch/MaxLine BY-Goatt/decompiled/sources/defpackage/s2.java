package defpackage;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class s2 implements View.OnClickListener {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ s2(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                ((i3) obj).a();
                break;
            case 1:
                q5 q5Var = (q5) obj;
                q5Var.v.obtainMessage(1, q5Var.b).sendToTarget();
                break;
            default:
                ey2 ey2Var = ((Toolbar) obj).a0;
                lk1 lk1Var = ey2Var == null ? null : ey2Var.n;
                if (lk1Var != null) {
                    lk1Var.collapseActionView();
                    break;
                }
                break;
        }
    }
}
