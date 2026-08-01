package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f1442f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f1443g;

    public a(b bVar, e eVar) {
        this.f1443g = bVar;
        this.f1442f = eVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        b bVar = this.f1443g;
        DialogInterface.OnClickListener onClickListener = bVar.f1478l;
        e eVar = this.f1442f;
        onClickListener.onClick(eVar.f1493b, i);
        if (bVar.f1480n) {
            return;
        }
        eVar.f1493b.dismiss();
    }
}
