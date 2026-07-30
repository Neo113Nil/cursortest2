package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lg implements AdapterView.OnItemClickListener {
    public final /* synthetic */ ng m;

    public lg(ng ngVar) {
        this.m = ngVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ng ngVar = this.m;
        qg qgVar = ngVar.R;
        qgVar.setSelection(i);
        if (qgVar.getOnItemClickListener() != null) {
            qgVar.performItemClick(view, i, ngVar.O.getItemId(i));
        }
        ngVar.dismiss();
    }
}
