package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cz implements AdapterView.OnItemClickListener {
    final /* synthetic */ de a;
    final /* synthetic */ db b;

    public cz(db dbVar, de deVar) {
        this.b = dbVar;
        this.a = deVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        de deVar = this.a;
        db dbVar = this.b;
        DialogInterface.OnClickListener onClickListener = dbVar.s;
        ea eaVar = deVar.b;
        onClickListener.onClick(eaVar, i);
        if (dbVar.w) {
            return;
        }
        eaVar.dismiss();
    }
}
