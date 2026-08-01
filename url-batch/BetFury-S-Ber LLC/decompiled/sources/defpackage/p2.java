package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class p2 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ t2 f;
    public final /* synthetic */ q2 g;

    public p2(q2 q2Var, t2 t2Var) {
        this.g = q2Var;
        this.f = t2Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        q2 q2Var = this.g;
        DialogInterface.OnClickListener onClickListener = q2Var.h;
        t2 t2Var = this.f;
        onClickListener.onClick(t2Var.b, i);
        if (q2Var.i) {
            return;
        }
        t2Var.b.dismiss();
    }
}
