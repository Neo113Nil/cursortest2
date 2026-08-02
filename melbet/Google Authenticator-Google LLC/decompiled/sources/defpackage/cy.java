package defpackage;

import android.R;
import android.content.Context;
import android.support.v7.app.AlertController$RecycleListView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cy extends ArrayAdapter {
    final /* synthetic */ AlertController$RecycleListView a;
    final /* synthetic */ db b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy(db dbVar, Context context, int i, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(context, i, R.id.text1, charSequenceArr);
        this.b = dbVar;
        this.a = alertController$RecycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        db dbVar = this.b;
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = dbVar.u;
        if (zArr != null && zArr[i]) {
            this.a.setItemChecked(i, true);
        }
        return view2;
    }
}
