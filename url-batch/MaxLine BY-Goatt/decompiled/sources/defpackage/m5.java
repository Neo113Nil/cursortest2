package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class m5 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ q5 m;
    public final /* synthetic */ n5 n;

    public m5(n5 n5Var, q5 q5Var) {
        this.n = n5Var;
        this.m = q5Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        n5 n5Var = this.n;
        DialogInterface.OnClickListener onClickListener = n5Var.h;
        q5 q5Var = this.m;
        onClickListener.onClick(q5Var.b, i);
        if (n5Var.i) {
            return;
        }
        q5Var.b.dismiss();
    }
}
