package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class a2 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ e2 f;
    public final /* synthetic */ b2 g;

    public a2(b2 b2Var, e2 e2Var) {
        this.g = b2Var;
        this.f = e2Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        b2 b2Var = this.g;
        DialogInterface.OnClickListener onClickListener = b2Var.h;
        e2 e2Var = this.f;
        onClickListener.onClick(e2Var.b, i);
        if (b2Var.i) {
            return;
        }
        e2Var.b.dismiss();
    }
}
