package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class q2 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ u2 f;
    public final /* synthetic */ r2 g;

    public q2(r2 r2Var, u2 u2Var) {
        this.g = r2Var;
        this.f = u2Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        r2 r2Var = this.g;
        DialogInterface.OnClickListener onClickListener = r2Var.l;
        u2 u2Var = this.f;
        onClickListener.onClick(u2Var.b, i);
        if (r2Var.m) {
            return;
        }
        u2Var.b.dismiss();
    }
}
