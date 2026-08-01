package f;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f1520f;
    public final /* synthetic */ b g;

    public a(b bVar, e eVar) {
        this.g = bVar;
        this.f1520f = eVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        b bVar = this.g;
        DialogInterface.OnClickListener onClickListener = bVar.h;
        e eVar = this.f1520f;
        onClickListener.onClick(eVar.f1572b, i4);
        if (bVar.f1539i) {
            return;
        }
        eVar.f1572b.dismiss();
    }
}
