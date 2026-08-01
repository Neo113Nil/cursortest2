package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0102e f2180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0099b f2181b;

    public C0098a(C0099b c0099b, C0102e c0102e) {
        this.f2181b = c0099b;
        this.f2180a = c0102e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        C0099b c0099b = this.f2181b;
        DialogInterface.OnClickListener onClickListener = c0099b.h;
        C0102e c0102e = this.f2180a;
        onClickListener.onClick(c0102e.f2191b, i);
        if (c0099b.i) {
            return;
        }
        c0102e.f2191b.dismiss();
    }
}
