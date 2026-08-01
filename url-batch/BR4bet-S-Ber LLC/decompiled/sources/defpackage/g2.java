package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class g2 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ k2 f;
    public final /* synthetic */ h2 g;

    public g2(h2 h2Var, k2 k2Var) {
        this.g = h2Var;
        this.f = k2Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        h2 h2Var = this.g;
        DialogInterface.OnClickListener onClickListener = h2Var.m;
        k2 k2Var = this.f;
        onClickListener.onClick(k2Var.b, i);
        if (h2Var.n) {
            return;
        }
        k2Var.b.dismiss();
    }
}
