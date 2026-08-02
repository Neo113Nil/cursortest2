package defpackage;

import android.support.v7.app.AlertController$RecycleListView;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class da implements AdapterView.OnItemClickListener {
    final /* synthetic */ AlertController$RecycleListView a;
    final /* synthetic */ de b;
    final /* synthetic */ db c;

    public da(db dbVar, AlertController$RecycleListView alertController$RecycleListView, de deVar) {
        this.c = dbVar;
        this.a = alertController$RecycleListView;
        this.b = deVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        db dbVar = this.c;
        boolean[] zArr = dbVar.u;
        if (zArr != null) {
            zArr[i] = this.a.isItemChecked(i);
        }
        dbVar.y.onClick(this.b.b, i, this.a.isItemChecked(i));
    }
}
