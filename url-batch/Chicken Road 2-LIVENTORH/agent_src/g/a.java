package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f1555f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f1556g;

    public a(b bVar, e eVar) {
        this.f1556g = bVar;
        this.f1555f = eVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j4) {
        b bVar = this.f1556g;
        DialogInterface.OnClickListener onClickListener = bVar.f1564h;
        e eVar = this.f1555f;
        onClickListener.onClick(eVar.f1608b, i);
        if (bVar.i) {
            return;
        }
        eVar.f1608b.dismiss();
    }
}
